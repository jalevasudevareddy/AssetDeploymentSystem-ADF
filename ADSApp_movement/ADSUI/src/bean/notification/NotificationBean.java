package bean.notification;

import bean.CommonBean;

import java.sql.SQLException;

import java.util.HashMap;
import java.util.Map;

import javax.faces.application.FacesMessage;

import javax.faces.event.ActionEvent;

import oracle.adf.share.ADFContext;
import oracle.adf.view.rich.component.rich.RichPopup;
import oracle.adf.view.rich.component.rich.layout.RichPanelGroupLayout;
import oracle.adf.view.rich.component.rich.layout.RichPanelHeader;
import oracle.adf.view.rich.component.rich.nav.RichButton;
import oracle.adf.view.rich.component.rich.nav.RichCommandButton;
import oracle.adf.view.rich.event.DialogEvent;

import oracle.jbo.domain.Number;

public class NotificationBean extends CommonBean {
    private RichPopup approvePopUp;
    private RichPopup rejectPopUp;
   // private RichCommandButton approveButton;
   // private RichCommandButton rejectButton;
    private RichPanelHeader panelHdrBind;
    private RichButton rejectButton1;
    private RichButton approveButton1;
    private RichPanelGroupLayout panelGrpBind;

    public NotificationBean() {
        super();
    }

    public void setApprovePopUp(RichPopup approvePopUp) {
        this.approvePopUp = approvePopUp;
    }

    public RichPopup getApprovePopUp() {
        return approvePopUp;
    }

    public void approveDialog(DialogEvent dialogEvent) {
        try{
        if (dialogEvent.getOutcome() == DialogEvent.Outcome.yes) {
            Map pageFlowScope = getCurrentPageFlowScope();
            Number docTypeId =
                pageFlowScope.get("docTypeId") != null ? new Number(pageFlowScope.get("docTypeId")) : null;
                String message = submitNotification("Approve");
                if (message != null) {
                    if ("Success".equals(message)) {
                        showPopupMessage("Document  successfully approved.",
                                         FacesMessage.SEVERITY_INFO);
                    } else {
                        showPopupMessage(message, FacesMessage.SEVERITY_ERROR);
                    }
                } else {
                    showPopupMessage("Document approval failed.",
                                     FacesMessage.SEVERITY_ERROR);
                }
        }
        }catch(Exception e){
            e.printStackTrace();
        }

        getApprovePopUp().hide();
    }

    public void setRejectPopUp(RichPopup rejectPopUp) {
        this.rejectPopUp = rejectPopUp;
    }

    public RichPopup getRejectPopUp() {
        return rejectPopUp;
    }

    public void rejectDialog(DialogEvent dialogEvent) {
        if (dialogEvent.getOutcome() == DialogEvent.Outcome.yes) {
            String message = submitNotification("Reject");
            if (message != null) {
                if ("Success".equals(message)) {
                    refreshPage();
                    showPopupMessage("Document  successfully rejected.", FacesMessage.SEVERITY_INFO);
                } else {
                    showPopupMessage(message, FacesMessage.SEVERITY_ERROR);
                }
            } else {
                showPopupMessage("Document rejection failed.", FacesMessage.SEVERITY_ERROR);
            }
        }
        getRejectPopUp().hide();

    }

//    public void setApproveButton(RichCommandButton approveButton) {
//        this.approveButton = approveButton;
//    }

    public Boolean isButtonEnabled() {

        Map<String, Object> pageFlowScope = ADFContext.getCurrent().getPageFlowScope();
        if (pageFlowScope != null) {
            Object docId = pageFlowScope.get("docId");
            Object docTypeId = pageFlowScope.get("docTypeId");
            if (docId != null && docTypeId != null) {
            }
        }
        return false;
    }

    public boolean isDisabled() {
        boolean buttonDisable = true;
        isButtonEnabled();
        Object exeSatusObj = executeMethod("isDocEnabledforCurrentUser");
        if (exeSatusObj != null && exeSatusObj instanceof Boolean) {
            buttonDisable = (Boolean) exeSatusObj;
        }
        return !buttonDisable;
    }

//    public RichCommandButton getApproveButton() {
//        return approveButton;
//    }

//    public void setRejectButton(RichCommandButton rejectButton) {
//        this.rejectButton = rejectButton;
//    }
//
//    public RichCommandButton getRejectButton() {
//        return rejectButton;
//    }

    public void setPanelHdrBind(RichPanelHeader panelHdrBind) {
        this.panelHdrBind = panelHdrBind;
    }

    public RichPanelHeader getPanelHdrBind() {
        return panelHdrBind;
    }

    public void approveDialogEvent() {
        try
        {
            Map pageFlowScope = getCurrentPageFlowScope();
            Number docTypeId =
                pageFlowScope.get("docTypeId") != null ? new Number(pageFlowScope.get("docTypeId")) : null;
           String message = submitNotification("Approve");
            if (message != null) {
                if ("Success".equals(message)) {
                    showPopupMessage("Document successfully approved.", FacesMessage.SEVERITY_INFO);
                } else if("WAC Approved".equals(message)||"Submitted".equals(message)) {
                    showPopupMessage(message, FacesMessage.SEVERITY_INFO);
                }
            } else {
                showPopupMessage("Document approval failed.", FacesMessage.SEVERITY_ERROR);
            }
        }catch(Exception e){
                       e.printStackTrace();
                   }
    }

    public void rejectDialogEvent() {
        String message = submitNotification("Reject");
        if (message != null) {
            if ("Success".equals(message)) {
                showPopupMessage("Document successfully rejected.", FacesMessage.SEVERITY_INFO);
            } else {
                showPopupMessage(message, FacesMessage.SEVERITY_ERROR);
            }
        } else {
            showPopupMessage("Document rejection failed.", FacesMessage.SEVERITY_ERROR);
        }
    }


    public String submitNotification(String actionCode) {

        Map pageFlowScope = getCurrentPageFlowScope();
        Map paramsMap = new HashMap();
        Map paramsMap2 = new HashMap();
        Map parameters = new HashMap();
        String message = null;
        try {
            parameters.put("docTypeId", pageFlowScope.get("docTypeId"));
            parameters.put("docId", pageFlowScope.get("docId").toString());
            parameters.put("ActionCode", actionCode);
            parameters.put("remarks", pageFlowScope.get("APPROVAL_REMARKS"));
            parameters.put("currEmpId", pageFlowScope.get("currEmpId"));
            parameters.put("docNum", pageFlowScope.get("docNum"));
            paramsMap.put("paramsMap", parameters);

            Number empId = pageFlowScope.get("currEmpId") != null ? new Number(pageFlowScope.get("currEmpId")) : null;
            pageFlowScope.put("empId", empId != null ? empId : "Anonymous");
            Number docIdNum =
                pageFlowScope.get("docId") != null ? new Number(pageFlowScope.get("docId").toString()) : null;
            String userName = pageFlowScope.get("apprvName") != null ? pageFlowScope.get("apprvName").toString() : null;
            Number docTypeId =
                pageFlowScope.get("docTypeId") != null ? new Number(pageFlowScope.get("docTypeId")) : null;

            //            Object isFinalApprObj = executeMethod("isEmployeeAFinalApprover");
            Object isFinalApprObj = executeMethod("isEmployeeAFinalApproverNew", paramsMap);
            //                         isFinalApprObj = true;

            Boolean isFinalApprover =
                (isFinalApprObj != null && isFinalApprObj instanceof Boolean) ? (Boolean) isFinalApprObj : null;
            System.out.println(isFinalApprover);
            if (isFinalApprover != null) {
                String approverAction =
                    "Reject".equals(actionCode) ? "Rejected" :
                    ("Approve".equals(actionCode) && isFinalApprover) ? "Approved" : "In Process";


                if ("Approved".equals(approverAction)) {
                    message = performUpdatesAndTxnsOnDocument(docIdNum, docTypeId, userName);
                    if ("Success".equals(message)) {
                        String docSubmitMess = (String) executeMethod("callpkgForAMEProcess", paramsMap);
                        message =
                            docSubmitMess != null ? docSubmitMess :
                            "Error while deleting or inserting the document in worklist. ";
                    }

                    else {
                        showPopupMessage(message != null ? message.toString() :
                                         " Submitting the selected document is failed.", FacesMessage.SEVERITY_ERROR);
                    }
                }
                if ("Rejected".equals(approverAction) || "In Process".equals(approverAction)) {
                    String docSubmitMess = (String) executeMethod("callpkgForAMEProcess", paramsMap);
                    message =
                        docSubmitMess != null ? docSubmitMess :
                        "Error while deleting or inserting the document in worklist. ";
                }
                if (("Finally Approved".equals(message) || "Submitted".equals(message) || "Rejected".equals(message)) &&
                    ("Approved".equals(approverAction) || "Rejected".equals(approverAction) ||
                     "In Process".equals(approverAction))) {
                    message = updateDocumentStatus(docIdNum, docTypeId, userName, approverAction);
                    if ("Success".equals(message)) {
                        //   save();
                        //                        getApproveButton().setDisabled(true);
                        //                        getRejectButton().setDisabled(true);
                        addPartialTrigger(getApproveButton1());
                        addPartialTrigger(getRejectButton1());
                        addPartialTrigger(getPanelGrpBind());
                        //                        refreshPage();
                    }
                }
            } else {
                message = "Unable to find approval level of current user.";
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return message;
    }

    private String updateDocumentStatus(Number docId, Number docTypeId, String userName, String status) {
        String message = null;
        Object messageObj = null;
        if (status != null) {

            if (docId != null && userName != null) {
                Map pageFlowScope = getCurrentPageFlowScope();
                Number empId = (Number) pageFlowScope.get("empId");
                System.out.println(empId);
                pageFlowScope.put("docId", docId);
                pageFlowScope.put("userName", userName);
                pageFlowScope.put("updateWith", status);
                pageFlowScope.put("empId", empId);

                if (49 == docTypeId.intValue() || 50 == docTypeId.intValue() || 55 == docTypeId.intValue() || 56 == docTypeId.intValue() || 60 == docTypeId.intValue()) { 
                    message = "Success";
                } 
            }
        }
        return message;

    }

    private String performUpdatesAndTxnsOnDocument(Number docId, Number docTypeId, String userName) {
        String message = null;
        Object messageObj = null;

            if (docId != null && userName != null) {
               if (49 == docTypeId.intValue() || 50==docTypeId.intValue() || 55==docTypeId.intValue() || 56==docTypeId.intValue() || 60 == docTypeId.intValue()) {
                    messageObj = "Success";
                }
              
                message =
                        messageObj != null ? messageObj.toString() : "Performing Transactions and Interfaces are failed.";
            }

        return message;
    }

   

    public void setRejectButton1(RichButton rejectButton1) {
        this.rejectButton1 = rejectButton1;
    }

    public RichButton getRejectButton1() {
        return rejectButton1;
    }

    public void setApproveButton1(RichButton approveButton1) {
        this.approveButton1 = approveButton1;
    }

    public RichButton getApproveButton1() {
        return approveButton1;
    }

    public void setPanelGrpBind(RichPanelGroupLayout panelGrpBind) {
        this.panelGrpBind = panelGrpBind;
    }

    public RichPanelGroupLayout getPanelGrpBind() {
        return panelGrpBind;
    }
}

