package bean;

import bean.notification.NotificationBean;

import java.io.InputStream;
import java.io.OutputStream;

import java.text.DateFormat;

import java.text.SimpleDateFormat;

import java.util.Calendar;
import java.util.Map;

import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.faces.application.FacesMessage;

import javax.faces.event.ValueChangeEvent;

import model.view.AttachmentsVORowImpl;

import oracle.adf.model.BindingContext;
import oracle.adf.model.binding.DCBindingContainer;
import oracle.adf.model.binding.DCIteratorBinding;
import oracle.adf.share.ADFContext;
import oracle.adf.view.rich.component.rich.RichPopup;
import oracle.adf.view.rich.component.rich.layout.RichPanelHeader;
import oracle.adf.view.rich.component.rich.nav.RichLink;
import oracle.adf.view.rich.event.DialogEvent;

import oracle.jbo.Row;
import oracle.jbo.RowSetIterator;

import oracle.jbo.domain.Date;

import org.apache.myfaces.trinidad.model.UploadedFile;

public class DeploymentOrderBean extends CommonBean{
    private RichPopup attchPopupBind;
    private RichPanelHeader attchHdrBind;
    private RichPopup submitRequestConfirmPopup;
    private RichPopup submitRequestConfirmDL;
    private RichPanelHeader orderTrxnPageBindgs;
    private RichPopup withdrawConfirmPopupBind;
    private RichPopup confirmOrderPopupBindgs;
    private RichPopup cancelPopupBindgs;
    private RichLink inspectionInfoDeleteBind;

    public DeploymentOrderBean() {
        super();
    }

    public void searchDOAL(ActionEvent actionEvent) 
    {
        try 
        {
            String msg = (String) executeMethod("searchOrders");
            if(!("Success".equals(msg))) 
            {
                showPopupMessage(msg, FacesMessage.SEVERITY_ERROR);    
            }
        }
        catch(Exception e) 
        {
            e.printStackTrace();    
        }
    }

    public void resetDOAL(ActionEvent actionEvent) 
    {
        try 
        {
            String msg = (String) executeMethod("resetOrdersSearch");
            if(!("Success".equals(msg))) {
                showPopupMessage(msg, FacesMessage.SEVERITY_ERROR);
            }
        }
        catch(Exception e) 
        {
            e.printStackTrace();    
        }
    }

    public void saveOrderAL(ActionEvent actionEvent) 
    {
        try 
        {
            String msg = (String) executeMethod("saveDeploymentOrder");
            if(!("Success".equals(msg))) {
                showPopupMessage(msg, FacesMessage.SEVERITY_ERROR);
            }else{
            save();
            ADFContext.getCurrent().getPageFlowScope().put("orderChangesSaved", "Y");
            }
        }
        catch(Exception e) 
        {
            e.printStackTrace();    
        }
    }

    public void saveCloseOrderAL(ActionEvent actionEvent) 
    {
        try 
        {
            String msg = (String) executeMethod("saveDeploymentOrder");
            if(!("Success".equals(msg))) {
                showPopupMessage(msg, FacesMessage.SEVERITY_ERROR);
            }else{
                save();
                if("A".equals(ADFContext.getCurrent().getPageFlowScope().get("fromApplicationFlag"))){
                    ADFContext.getCurrent().getPageFlowScope().put("allocationHdrId", getEL("#{bindings.AllocationId.inputValue}"));
                    navigateNew("BackToAllocation");
                }else{
                    navigateNew("Back");
                    executeMethod("setDeploymentOrderSearch");
                }
            }
        }
        catch(Exception e) 
        {
            e.printStackTrace();    
        }
    }

    public void closeOrderAL(ActionEvent actionEvent) 
    {
        try 
        {
            if("N".equals(ADFContext.getCurrent().getPageFlowScope().get("orderChangesSaved"))) 
            {
                showPopup(getCancelPopupBindgs());
            }
            else
            {
                ADFContext.getCurrent().getPageFlowScope().put("allocationHdrId", getEL("#{bindings.AllocationId.inputValue}"));
                cancel();
                navigateNew("Back");
                executeMethod("setDeploymentOrderSearch");
            //                addPartialTrigger(getAllocationSearchTblBindgs());
            }
        }
        catch(Exception e) 
        {
            e.printStackTrace();
        }
    }
    
    public void setSearchAttributes(){
        try {
            Map pageFlowScope = ADFContext.getCurrent().getPageFlowScope();
            
            pageFlowScope.put("doSrcBuName", getEL("#{bindings.TransSrcBuName.inputValue}"));
            pageFlowScope.put("doSrcBuId", getEL("#{bindings.TransSrcBuId.inputValue}"));
            

            pageFlowScope.put("doSrcDiv", getEL("#{bindings.TransSrcDivision.inputValue}"));
            pageFlowScope.put("doSrcDivFlexValueId", getEL("#{bindings.TransSrcDivFlexValueId.inputValue}"));
            pageFlowScope.put("doSrcDivFlexValueSetId", getEL("#{bindings.TransSrcDivFlexValueSetId.inputValue}"));
            pageFlowScope.put("doReqBuId", getEL("#{bindings.TransReqBuId.inputValue}"));
            pageFlowScope.put("doReqBuName", getEL("#{bindings.TransReqBuName.inputValue}"));
            pageFlowScope.put("doContractNumber", getEL("#{bindings.TransContractNumber.inputValue}"));
            pageFlowScope.put("doContractId", getEL("#{bindings.TransContractId.inputValue}"));
            pageFlowScope.put("doCustTypeCode", getEL("#{bindings.TransCustTypeCode.inputValue}"));
            pageFlowScope.put("doCustType", getEL("#{bindings.TransCustType.inputValue}"));
            pageFlowScope.put("doProjectId", getEL("#{bindings.TransProjectId.inputValue}"));
            
            pageFlowScope.put("doProject", getEL("#{bindings.TransProject.inputValue}"));
            pageFlowScope.put("doDiv", getEL("#{bindings.TransDivision.inputValue}"));
            pageFlowScope.put("doDivFlexValueId", getEL("#{bindings.TransDivFlexValueId.inputValue}"));
            pageFlowScope.put("doDeptName", getEL("#{bindings.TransDeptName.inputValue}"));
            pageFlowScope.put("doDeptFlexValueId", getEL("#{bindings.TransDeptFlexValueId.inputValue}"));
            pageFlowScope.put("doCustomerName", getEL("#{bindings.TransCustomerName.inputValue}"));
            
            pageFlowScope.put("doCustomerId", getEL("#{bindings.TransCustomerId.inputValue}"));
            pageFlowScope.put("doOrderNumber", getEL("#{bindings.TransOrderNumber.inputValue}"));
            pageFlowScope.put("doOrderDate", getEL("#{bindings.TransOrderDate.inputValue}"));
            pageFlowScope.put("doSrcDivRequired", getEL("#{bindings.TransSrcDivRequired.inputValue}"));
            pageFlowScope.put("doSrcDivSegmentNumber", getEL("#{bindings.TransSrcDivSegmentNumber.inputValue}"));
            
            pageFlowScope.put("doReqDivSegmentNumber", getEL("#{bindings.TransReqDivSegmentNumber.inputValue}"));
            pageFlowScope.put("doReqDeptSegmentNumber", getEL("#{bindings.TransReqDeptSegmentNumber.inputValue}"));
            
            
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void doAttachmentAL(ActionEvent actionEvent) 
    {
        try 
        {
            showPopup(getAttchPopupBind());
        }
        catch(Exception e) 
        {
            e.printStackTrace();    
        }
    }

    public void setAttchPopupBind(RichPopup attchPopupBind) {
        this.attchPopupBind = attchPopupBind;
    }

    public RichPopup getAttchPopupBind() {
        return attchPopupBind;
    }

    public void attachmentDL(DialogEvent dialogEvent) 
    {
        try 
        {
            if(dialogEvent.getOutcome().equals(DialogEvent.Outcome.ok))
            {
            //            save();
                DCBindingContainer dcBindingContainer =
                            (DCBindingContainer)BindingContext.getCurrent().getCurrentBindingsEntry();
                        DCIteratorBinding iter =   dcBindingContainer.findIteratorBinding("AttachmentsVO1Iterator");
                        iter.executeQuery();
            }
            else
            {
//                cancel();
            }    
        }
        catch(Exception e) 
        {
            e.printStackTrace();
        }
    }

    public void setAttchHdrBind(RichPanelHeader attchHdrBind) {
        this.attchHdrBind = attchHdrBind;
    }

    public RichPanelHeader getAttchHdrBind() {
        return attchHdrBind;
    }

    public void uploadFileVL(ValueChangeEvent valueChangeEvent) 
    {
        valueChangeEvent.getComponent().processUpdates(FacesContext.getCurrentInstance());
        try {
            Map pageFlowScope = ADFContext.getCurrent().getPageFlowScope();

            try {
                pageFlowScope.put("orderUploadedFileStream",((UploadedFile)valueChangeEvent.getNewValue()).getInputStream());
                pageFlowScope.put("orderFileName",((UploadedFile)valueChangeEvent.getNewValue()).getFilename());
                pageFlowScope.put("orderFileType",((UploadedFile)valueChangeEvent.getNewValue()).getContentType());
                
                String str = (String)executeMethod("uploadOrderAttach");
                if(!"Success".equals(str)){
                    showPopupMessage("Not a valid File", FacesMessage.SEVERITY_ERROR);
                }
                else {
                    ADFContext.getCurrent().getPageFlowScope().put("orderChangesSaved", "N");
                }
                
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            addPartialTrigger(getAttchHdrBind());
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void downloadDOAttachment(FacesContext facesContext, OutputStream outputStream) 
    {
        try {
            DCBindingContainer binding =
                (DCBindingContainer)BindingContext.getCurrent().getCurrentBindingsEntry();
            DCIteratorBinding bindingIterator =
                binding.findIteratorBinding("AttachmentsVO4Iterator");
            RowSetIterator row = bindingIterator.getRowSetIterator();
            if (bindingIterator != null) {
                AttachmentsVORowImpl currentRow =
                    (AttachmentsVORowImpl)row.getCurrentRow();
                if (!currentRow.getPrimaryRowState().isNew()) {
                    currentRow.refresh(Row.REFRESH_UNDO_CHANGES);
                }

                if (currentRow != null) {
                    int ch = -1;
                    try {
                        InputStream in =
                            currentRow.getAttachmentFile().getInputStream();
                        while ((ch = in.read()) != -1) {
                            outputStream.write(ch);
                        }
                        outputStream.close();
                        in.close();

                    } catch (Exception e) {
                        System.out.println(e.getMessage() +
                                           "  Error in downloading");
                    }
                }
            }
        }catch(Exception e){
            e.printStackTrace();
        }

    }

    public void addDOAttachmentAL(ActionEvent actionEvent) 
    {
        try 
        {
            ADFContext.getCurrent().getPageFlowScope().put("orderChangesSaved", "N");
            String message = (String) executeMethod("addOrderAttachment");
            if(!"Success".equals(message)){
                showPopupMessage(message, FacesMessage.SEVERITY_ERROR);
            }
            addPartialTrigger(getAttchHdrBind());
        }
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }

    public void deleteDOAttachmentAL(ActionEvent actionEvent) 
    {
        try 
        {
            ADFContext.getCurrent().getPageFlowScope().put("orderChangesSaved", "N");
            executeMethod("Delete");
            addPartialTrigger(getAttchHdrBind());
        }
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }

    public void editDOAL(ActionEvent actionEvent) 
    {
        try 
        {
            setSearchAttributes();
            String msg = (String) executeMethod("editOrder");
            if(!"Success".equals(msg))
            {
                showPopupMessage(msg, FacesMessage.SEVERITY_ERROR);
            }
            else
            {
                navigateNew("Create");
            }
        }
        catch(Exception e) 
        {
            e.printStackTrace();    
        }
    }

    public void approveDoc(ActionEvent actionEvent) 
    {
        NotificationBean bean = new NotificationBean();
        bean.approveDialogEvent();
    }

    public void rejectDoc(ActionEvent actionEvent) 
    {
        String actionRemarks = (String)getEL("#{pageFlowScope.APPROVAL_REMARKS}");
        if( actionRemarks!=null  && !(actionRemarks.equals(""))){
            NotificationBean bean = new NotificationBean();
            bean.rejectDialogEvent();
        
        }
        else{
            showPopupMessage("Rejection Remarks are mandatory",FacesMessage.SEVERITY_ERROR);
        }
    }

    public void confirmSubmitRequest(ActionEvent actionEvent) 
    {
        try 
        {
            String msg = (String) executeMethod("checkForDOLines");
            if(!("Success".equals(msg))) 
            {
                showPopupMessage(msg, FacesMessage.SEVERITY_ERROR);    
            }
//            else
//            {
//                showPopup(getSubmitRequestConfirmPopup());
//            }
        }
        catch(Exception e) 
        {
            e.printStackTrace();    
        }
    }

    public void confirmWithdrawRequest(ActionEvent actionEvent) 
    {
        try
        {
            
        }
        catch(Exception e) 
        {
            e.printStackTrace();
        }
    }

    public void setSubmitRequestConfirmPopup(RichPopup submitRequestConfirmPopup) {
        this.submitRequestConfirmPopup = submitRequestConfirmPopup;
    }

    public RichPopup getSubmitRequestConfirmPopup() {
        return submitRequestConfirmPopup;
    }

    public void setSubmitRequestConfirmDL(RichPopup submitRequestConfirmDL) {
        this.submitRequestConfirmDL = submitRequestConfirmDL;
    }

    public RichPopup getSubmitRequestConfirmDL() {
        return submitRequestConfirmDL;
    }

    public void submitRequestConfirmDL(DialogEvent dialogEvent) 
    {
        try {
             if (dialogEvent.getOutcome().equals(DialogEvent.Outcome.yes)) {
                save();
                 Object msg = submitADODocForApproval();
                 if ("SUCCESS".equalsIgnoreCase(msg.toString())) {
                     showPopupMessage("Submitted for Approval", FacesMessage.SEVERITY_INFO);
                     save();
                     ADFContext.getCurrent().getPageFlowScope().put("changesSaved", "Y");

                 } else {
                     showPopupMessage(msg.toString(), FacesMessage.SEVERITY_ERROR);
                 }
                 addPartialTrigger(getOrderTrxnPageBindgs());
             }
            
         }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setOrderTrxnPageBindgs(RichPanelHeader orderTrxnPageBindgs) {
        this.orderTrxnPageBindgs = orderTrxnPageBindgs;
    }

    public RichPanelHeader getOrderTrxnPageBindgs() {
        return orderTrxnPageBindgs;
    }
    
    public String submitADODocForApproval() {
        Object msg = executeMethod("callpkgForAMEADOProcessSubmit");
        return msg != null ? msg.toString() : "";
    }

    public void setWithdrawConfirmPopupBind(RichPopup withdrawConfirmPopupBind) {
        this.withdrawConfirmPopupBind = withdrawConfirmPopupBind;
    }

    public RichPopup getWithdrawConfirmPopupBind() {
        return withdrawConfirmPopupBind;
    }

    public void confirmWithdrawDL(DialogEvent dialogEvent) 
    {
       try 
       {
           String message = (String) executeMethod("withdrawADOFromApproval");
           if(!"Success".equals(message)){
               showPopupMessage(message, FacesMessage.SEVERITY_ERROR);
           }else{
               addPartialTrigger(getOrderTrxnPageBindgs());
           }
       }
       catch(Exception e) 
       {
            e.printStackTrace();    
       }
    }

    public void confirmOrderAL(ActionEvent actionEvent) 
    {
        try 
        {
            showPopup(getConfirmOrderPopupBindgs());
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    public void confirmOrderDL(DialogEvent dialogEvent) 
    {
        try 
        {
             if (dialogEvent.getOutcome().equals(DialogEvent.Outcome.yes)) 
             {
                 String msg = (String) executeMethod("checkForDOLines");
                 if(!("Success".equals(msg))) 
                 {
                     showPopupMessage(msg, FacesMessage.SEVERITY_ERROR);    
                 }else{
                     String msg2 = (String) executeMethod("ConfirmDO");
                     if(!("Success".equals(msg2))) 
                     {
                        showPopupMessage(msg2, FacesMessage.SEVERITY_ERROR);    
                     }
                     else 
                     {
                         save();
                         ADFContext.getCurrent().getPageFlowScope().put("changesSaved", "Y");
                     }
                 }
             }
            else 
             {
                 getConfirmOrderPopupBindgs().hide();
             }
        }
        catch(Exception e) 
        {
            e.printStackTrace();    
        }
            
    }

    public void setConfirmOrderPopupBindgs(RichPopup confirmOrderPopupBindgs) {
        this.confirmOrderPopupBindgs = confirmOrderPopupBindgs;
    }

    public RichPopup getConfirmOrderPopupBindgs() {
        return confirmOrderPopupBindgs;
    }
    
    public Date getTransCurrentDate() {
        Date maxStartDate = null;
        try
        {
        java.util.Date maxDate;
        Calendar cal = Calendar.getInstance();
                    java.util.Date date = cal.getTime();
                    DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
                    String currentDate = formatter.format(date);
                    maxDate = formatter.parse(currentDate);
            maxStartDate =
                        new Date(new java.sql.Date(maxDate.getTime()));
        }
        catch(Exception e) {
            e.printStackTrace();
        }
        return maxStartDate;
    }

    public void setCancelPopupBindgs(RichPopup cancelPopupBindgs) {
        this.cancelPopupBindgs = cancelPopupBindgs;
    }

    public RichPopup getCancelPopupBindgs() {
        return cancelPopupBindgs;
    }

    public void cancelDL(DialogEvent dialogEvent) 
    {
        if(dialogEvent.getOutcome().equals(DialogEvent.Outcome.yes)) 
        {
            ADFContext.getCurrent().getPageFlowScope().put("allocationHdrId", getEL("#{bindings.AllocationId.inputValue}"));
            cancel();
            ADFContext.getCurrent().getPageFlowScope().put("orderChangesSaved", "Y");
            navigateNew("Back");
            executeMethod("setDeploymentOrderSearch");
        //            addPartialTrigger(getSearchTblBindgs());
        } 
    }
    public void setInspectionInfoDeleteBind(RichLink inspectionInfoDeleteBind) {
        this.inspectionInfoDeleteBind = inspectionInfoDeleteBind;
    }

    public RichLink getInspectionInfoDeleteBind() {
        return inspectionInfoDeleteBind;
    }
    
    public void addInspectionInfoAL(ActionEvent actionEvent) 
    {
        try 
        {
            String msg = (String) executeMethod("addInspectionInfo");
            if(!("Success".equals(msg))) 
            {
                showPopupMessage(msg, FacesMessage.SEVERITY_ERROR);    
            }
            else 
            {
                ADFContext.getCurrent().getPageFlowScope().put("orderChangesSaved", "N");     
                addPartialTrigger(getInspectionInfoDeleteBind());
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    public void deleteInspectionInfoAL(ActionEvent actionEvent) 
    {
        try 
        {
            String msg = (String) executeMethod("deleteInspectionLine");
            if(!("Success".equals(msg))) 
            {
                showPopupMessage(msg, FacesMessage.SEVERITY_ERROR);    
            }
            else 
            {
                ADFContext.getCurrent().getPageFlowScope().put("orderChangesSaved", "N");    
            }
        }
        catch(Exception e) 
        {
            e.printStackTrace();    
        }
    }

    public void deploymentOrderReportAL(FacesContext facesContext, OutputStream outputStream) {
        try {
           Object dataBytesObj = null;
           dataBytesObj = executeMethod("DeploymentOrderXml");
           if (dataBytesObj != null && dataBytesObj instanceof byte[]) {
           byte[] dataBytes = (byte[]) dataBytesObj;
           outputStream.write(dataBytes);
           outputStream.close();
           }
            
        } catch (Exception e) {
            // TODO: Add catch code
            e.printStackTrace();
        }

    }

    public void gatePassReportAL(FacesContext facesContext, OutputStream outputStream) {
        try {
           Object dataBytesObj = null;
           dataBytesObj = executeMethod("generateGatePassReport");
           if (dataBytesObj != null && dataBytesObj instanceof byte[]) {
           byte[] dataBytes = (byte[]) dataBytesObj;
           outputStream.write(dataBytes);
           outputStream.close();
           }
            
        } catch (Exception e) {
            // TODO: Add catch code
            e.printStackTrace();
        }


    }
}
