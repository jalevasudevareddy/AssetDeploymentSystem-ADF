package bean;

import bean.notification.NotificationBean;

import java.io.InputStream;
import java.io.OutputStream;

import java.util.Map;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

import javax.faces.event.ValueChangeEvent;

import model.view.AttachmentsVORowImpl;

import oracle.adf.model.BindingContext;
import oracle.adf.model.binding.DCBindingContainer;
import oracle.adf.model.binding.DCIteratorBinding;
import oracle.adf.share.ADFContext;
import oracle.adf.view.rich.component.rich.RichPopup;
import oracle.adf.view.rich.component.rich.data.RichTable;
import oracle.adf.view.rich.component.rich.input.RichInputComboboxListOfValues;
import oracle.adf.view.rich.component.rich.input.RichInputDate;
import oracle.adf.view.rich.component.rich.layout.RichPanelGroupLayout;
import oracle.adf.view.rich.component.rich.layout.RichPanelHeader;
import oracle.adf.view.rich.event.DialogEvent;

import oracle.jbo.RowSetIterator;
import oracle.jbo.Row;

import org.apache.myfaces.trinidad.model.UploadedFile;

public class AssetRequestBean extends CommonBean{
    private RichTable searchTblBindgs;
    private RichPopup deleteAssetReqPopupBindgs;
    private RichPopup attchPopupBind;
    private RichPanelHeader attchHdrBind;
    private RichPopup cancelPopupBindgs;
    private RichPopup submitRequestConfirmPopup;
    private RichPopup submitRequestConfirmDL;
    private RichPopup withdrawRequestConfirmPopup;
    private RichPanelGroupLayout requestTrxnPageBind;
    private RichInputComboboxListOfValues categoryBindgs;
    private RichTable reqLinesTblBindgs;
    private RichInputComboboxListOfValues requestorBUBindgs;
    private RichInputComboboxListOfValues srcBUBindgs;
    private RichInputComboboxListOfValues srcDivisionBindgs;
    private RichInputDate requestedDateBindgs;
    private RichInputComboboxListOfValues requestorNameBindgs;
    private RichInputComboboxListOfValues customerTypeBindgs;
    private RichInputComboboxListOfValues projectBindgs;
    private RichInputComboboxListOfValues divisionBindgs;
    private RichInputComboboxListOfValues deptBindgs;
    private RichInputComboboxListOfValues custNameBindgs;
    private RichInputComboboxListOfValues custSiteNameVL;
    private RichPopup cancelReqPopupBindgs;
    private RichPopup aractionHistoryPopupBindgs;

    public AssetRequestBean() {
        super();
    }

    public void searchAL(ActionEvent actionEvent) 
    {
        try 
        {
            String message = (String) executeMethod("searchAssetRequests");
            if(! "Success".equals(message))
            {
                showPopupMessage(message, FacesMessage.SEVERITY_ERROR);
            }
//            else{
//                addPartialTrigger(getSearchTblBind());
//            }
        }
        catch(Exception e) 
        {
            e.printStackTrace();    
        }
    }

    public void resetAL(ActionEvent actionEvent) 
    {
        try 
        {
            String message = (String) executeMethod("resetAssetRequestSearch");
            if(! "Success".equals(message)){
                showPopupMessage(message, FacesMessage.SEVERITY_ERROR);
            }
//            else{
//                addPartialTrigger(getSearchTblBind());
//            }
        }
        catch(Exception e) 
        {
            e.printStackTrace();    
        }
    }

    public void setSearchTblBindgs(RichTable searchTblBindgs) {
        this.searchTblBindgs = searchTblBindgs;
    }

    public RichTable getSearchTblBindgs() {
        return searchTblBindgs;
    }

    public void createAssetRequest(ActionEvent actionEvent) 
    {
        try 
        {
            setSearchAttributes();
            String message = (String) executeMethod("createAssetRequest");
            if(!"Success".equals(message))
            {
                showPopupMessage(message, FacesMessage.SEVERITY_ERROR);
            }
            else
            {            
                ADFContext.getCurrent().getPageFlowScope().put("requestEditFlag", "Y");
                navigateNew("Go");
            }
        }
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }

    public void editAssetRequest(ActionEvent actionEvent) 
    {
        try 
        {
            setSearchAttributes();
            String message = (String) executeMethod("editAssetRequest");
            if(!"Success".equals(message))
            {
                showPopupMessage(message, FacesMessage.SEVERITY_ERROR);
            }
            else
            {
                navigateNew("Go");
            }
        }
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }

    
    public void setSearchAttributes(){
        try {
            Map pageFlowScope = ADFContext.getCurrent().getPageFlowScope();
            pageFlowScope.put("asrRequestType", getEL("#{bindings.TransRequestType.inputValue}"));
            pageFlowScope.put("asrSrcBuId", getEL("#{bindings.TransSrcBuId.inputValue}"));
            pageFlowScope.put("asrSrcBuName", getEL("#{bindings.TransSrcBuName.inputValue}"));
            pageFlowScope.put("asrReqBuId", getEL("#{bindings.TransReqBuId.inputValue}"));
            pageFlowScope.put("asrReqBuName", getEL("#{bindings.TransReqBuName.inputValue}"));
            pageFlowScope.put("asrSrcDivFlexValueSetId", getEL("#{bindings.TransSrcDivFlexValueSetId.inputValue}"));
            pageFlowScope.put("asrSrcDivFlexValueId", getEL("#{bindings.TransSrcDivFlexValueId.inputValue}"));
            pageFlowScope.put("asrSrcDiv", getEL("#{bindings.TransSrcDivision.inputValue}"));
            pageFlowScope.put("asrReqNum", getEL("#{bindings.TransRequestNumber.inputValue}"));
            pageFlowScope.put("asrReqStatus", getEL("#{bindings.TransRequestStatus.inputValue}"));
            pageFlowScope.put("asrReqStatusCode", getEL("#{bindings.TransRequestStatusCode.inputValue}"));
            pageFlowScope.put("asrReqDateFrom", getEL("#{bindings.TransRequestDateFrom.inputValue}"));
            pageFlowScope.put("asrReqDateTo", getEL("#{bindings.TransRequestDateTo.inputValue}"));
            pageFlowScope.put("asrCustType", getEL("#{bindings.TransCustomerType.inputValue}"));
            pageFlowScope.put("asrCustTypeCode", getEL("#{bindings.TransCustomerTypeCode.inputValue}"));
            pageFlowScope.put("asrProjectid", getEL("#{bindings.TransProjectId.inputValue}"));
            
            pageFlowScope.put("asrProject", getEL("#{bindings.TransProject.inputValue}"));
            pageFlowScope.put("asrDiv", getEL("#{bindings.TransDivsion.inputValue}"));
            pageFlowScope.put("asrDivFlexValueId", getEL("#{bindings.TransDivFlexValueId.inputValue}"));
            pageFlowScope.put("asrDivFlexValueSetId", getEL("#{bindings.TransDivFlexValueSetId.inputValue}"));
            pageFlowScope.put("asrDeptFlexValueId", getEL("#{bindings.TransDeptFlexValueId.inputValue}"));
            pageFlowScope.put("asrDeptFlexValueSetId", getEL("#{bindings.TransDeptFlexValueSetId.inputValue}"));
            pageFlowScope.put("asrDeptName", getEL("#{bindings.TransDeptName.inputValue}"));
            pageFlowScope.put("asrDeptCode", getEL("#{bindings.TransDeptCode.inputValue}"));
            
            pageFlowScope.put("asrCustName", getEL("#{bindings.TransCustomerName.inputValue}"));
            pageFlowScope.put("asrCustId", getEL("#{bindings.TransCustomerId.inputValue}"));
            pageFlowScope.put("asrDivRequired", getEL("#{bindings.TransDivRequired.inputValue}"));
            pageFlowScope.put("asrDivSegment", getEL("#{bindings.TransDivSegment.inputValue}"));
            pageFlowScope.put("asrDeptSegment", getEL("#{bindings.TransDeptSegment.inputValue}"));
            
            pageFlowScope.put("asrSrcDivRequired", getEL("#{bindings.TransSrcDivRequired.inputValue}"));
            pageFlowScope.put("asrSrcDivSegment", getEL("#{bindings.TransSrcDivSegmentNum.inputValue}"));
            
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void createHiringInfo() 
    {
        try 
        {
            String message = (String) executeMethod("createHiringInfo");
            if(!"Success".equals(message))
            {
                showPopupMessage(message, FacesMessage.SEVERITY_ERROR);
            }
        }
        catch(Exception e) 
        {
            e.printStackTrace();    
        }
    }
    
    public void saveAssetRequest(ActionEvent actionEvent) 
    {
        try 
        {
            String newMsg = (String) executeMethod("generateRequestNumber");
            if(!"Success".equals(newMsg)){
                showPopupMessage(newMsg, FacesMessage.SEVERITY_ERROR);
            }else{
                save();
                ADFContext.getCurrent().getPageFlowScope().put("changesSaved", "Y");
            }
        }
        catch(Exception e) 
        {
            e.printStackTrace();    
        }
    }
    
    public void saveCloseAssetRequest(ActionEvent actionEvent)  
    {
        try 
        {
            String newMsg = (String) executeMethod("generateRequestNumber");
            if(!"Success".equals(newMsg)){
                showPopupMessage(newMsg, FacesMessage.SEVERITY_ERROR);
            }else{
                save();
                ADFContext.getCurrent().getPageFlowScope().put("changesSaved", "Y");
                navigateNew("Back");
                executeMethod("setAssetRequestSearch");
            }
//            addPartialTrigger(getSearchTblBindgs());
        }
        catch(Exception e) 
        {
            e.printStackTrace();    
        }
    }
    
    public void cancelAssetRequest(ActionEvent actionEvent)  
    {
        try 
        {
            if("N".equals(ADFContext.getCurrent().getPageFlowScope().get("changesSaved"))) 
            //            if("0".equals(ADFContext.getCurrent().getPageFlowScope().get("updatesCount").toString()))
            {
                showPopup(getCancelPopupBindgs());
            }
            else
            {
                cancel();
                navigateNew("Back");
                executeMethod("setAssetRequestSearch");
//                addPartialTrigger(getSearchTblBindgs());
            }
        }
        catch(Exception e) 
        {
            e.printStackTrace();    
        }
    }

    public void addReqHiringDetailsAL(ActionEvent actionEvent) 
    {
        try 
        {
            String msg  = (String) executeMethod("addAssetReqDetails");
            if(!("Success".equals(msg))) 
            {
                showPopupMessage(msg, FacesMessage.SEVERITY_ERROR);    
            }
            else
            {
                ADFContext.getCurrent().getPageFlowScope().put("changesSaved", "N");
            }
        }
        catch(Exception e) 
        {
            e.printStackTrace();    
        }
    }

    public void deleteReqHiringDetailsAL(ActionEvent actionEvent) 
    {
        try 
        {
            String msg = (String) executeMethod("deleteRequestedAsset");
            if(!("Success".equals(msg))) 
            {
                showPopupMessage(msg, FacesMessage.SEVERITY_ERROR);    
            }
            else
            {
                ADFContext.getCurrent().getPageFlowScope().put("changesSaved", "N");
            }
            
        }
        catch(Exception e) 
        {
            e.printStackTrace();    
        }
    }

    public void assetCategoryChangeVL(ValueChangeEvent valueChangeEvent) 
    {
        try
        {
            valueChangeEvent.getComponent().processUpdates(FacesContext.getCurrentInstance());
            String msg = (String) executeMethod("assetCategoryChange");
            if(!("Success".equals(msg))) 
            {
                showPopupMessage(msg, FacesMessage.SEVERITY_ERROR);    
            }
            else {
                ADFContext.getCurrent().getPageFlowScope().put("changesSaved", "N");
            }
            
        }
        catch(Exception e) 
        {
            e.printStackTrace();    
        }
    }

    public void onHireDateChangeVL(ValueChangeEvent valueChangeEvent) 
    {
        try 
        {
            valueChangeEvent.getComponent().processUpdates(FacesContext.getCurrentInstance());
            String msg = (String) executeMethod("onHireDateChange");
            if(!("Success".equals(msg))) 
            {
                showPopupMessage(msg, FacesMessage.SEVERITY_ERROR);    
            }
            else {
                ADFContext.getCurrent().getPageFlowScope().put("changesSaved", "N");
            }
        }
        catch(Exception e) 
        {
            e.printStackTrace();    
        }
    }

    public void offHireDateChangeVL(ValueChangeEvent valueChangeEvent) 
    {
        try 
        {
            valueChangeEvent.getComponent().processUpdates(FacesContext.getCurrentInstance());
            String msg = (String) executeMethod("offHireDateChange");
            if(!("Success".equals(msg))) 
            {
                showPopupMessage(msg, FacesMessage.SEVERITY_ERROR);    
            }
            else {
                ADFContext.getCurrent().getPageFlowScope().put("changesSaved", "N");
            }
        }
        catch(Exception e) 
        {
            e.printStackTrace();    
        }
    }

    public void reqProjectChangeVL(ValueChangeEvent valueChangeEvent) 
    {
        try 
        {
            valueChangeEvent.getComponent().processUpdates(FacesContext.getCurrentInstance());
            String msg = (String) executeMethod("reqProjectChange");
            if(!("Success".equals(msg))) 
            {
                showPopupMessage(msg, FacesMessage.SEVERITY_ERROR);    
            }
            else {
                ADFContext.getCurrent().getPageFlowScope().put("changesSaved", "N");
            }
        }
        catch(Exception e) 
        {
            e.printStackTrace();    
        }
    }


    public void lineCancelAL(ActionEvent actionEvent) 
    {
        try 
        {
          String msg = (String) executeMethod("cancelAssetRequestLine");  
            if(!("Success".equals(msg))) 
            {
                showPopupMessage(msg, FacesMessage.SEVERITY_ERROR);    
            }
            else 
            {
                addPartialTrigger(getReqLinesTblBindgs());    
            }
        }
        catch(Exception e) 
        {
            e.printStackTrace();    
        }
    }

    public void attachmentFileVL(ValueChangeEvent valueChangeEvent) 
    {
        Map pageFlowScope = ADFContext.getCurrent().getPageFlowScope();

        try {
            pageFlowScope.put("UploadedFileStream",((UploadedFile)valueChangeEvent.getNewValue()).getInputStream());
            pageFlowScope.put("FileName",((UploadedFile)valueChangeEvent.getNewValue()).getFilename());
            pageFlowScope.put("FileType",((UploadedFile)valueChangeEvent.getNewValue()).getContentType());
            
            String str = (String)executeMethod("uploadAssetRequestAttach");
            if(!"Success".equals(str)){
                showPopupMessage("Not a valid File", FacesMessage.SEVERITY_ERROR);
            }
            else {
                ADFContext.getCurrent().getPageFlowScope().put("changesSaved", "N");
            }
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        addPartialTrigger(getAttchHdrBind());
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
                cancel();
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

    public void addAsetReqAttachmentAL(ActionEvent actionEvent) 
    {
        try 
        {
            executeMethod("addAssetRequestAttch");
            ADFContext.getCurrent().getPageFlowScope().put("changesSaved", "N");
            addPartialTrigger(getAttchHdrBind());
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }

    public void deleteAsetReqAttachmentAL(ActionEvent actionEvent) 
    {
        try
        {
            executeMethod("Delete");
            ADFContext.getCurrent().getPageFlowScope().put("changesSaved", "N");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        } 
    }

    public void downloadAssetReqAttachment(FacesContext facesContext, OutputStream outputStream) 
    {
        try {
            DCBindingContainer binding =
                (DCBindingContainer)BindingContext.getCurrent().getCurrentBindingsEntry();
            DCIteratorBinding bindingIterator =
                binding.findIteratorBinding("AttachmentsVO1Iterator");
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

    public void assetReqAttachmentAL(ActionEvent actionEvent) 
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
            cancel();
            navigateNew("Back");
            executeMethod("setAssetRequestSearch");
//            addPartialTrigger(getSearchTblBindgs());
        }  
    }

    public void requestedDateVL(ValueChangeEvent valueChangeEvent) 
    {
        try 
        {
            valueChangeEvent.getComponent().processUpdates(FacesContext.getCurrentInstance());
            ADFContext.getCurrent().getPageFlowScope().put("changesSaved", "N");
            String msg = (String) executeMethod("requestedDateChange");
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

    public void confirmSubmitRequest(ActionEvent actionEvent) 
    {
        try {
            String msg = (String) executeMethod("validateRequest");
            if(!("Success".equals(msg)))
            {
                showPopupMessage(msg, FacesMessage.SEVERITY_ERROR);
            }
            else {
                showPopup(getSubmitRequestConfirmPopup());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void confirmWithdrawRequest(ActionEvent actionEvent) 
    {
        try {
            showPopup(getWithdrawRequestConfirmPopup());
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setSubmitRequestConfirmPopup(RichPopup submitRequestConfirmPopup) {
        this.submitRequestConfirmPopup = submitRequestConfirmPopup;
    }

    public RichPopup getSubmitRequestConfirmPopup() {
        return submitRequestConfirmPopup;
    }

    public void submitRequestConfirmDL(DialogEvent dialogEvent) 
    {
        try {
             if (dialogEvent.getOutcome().equals(DialogEvent.Outcome.yes)) {
                 String newMsg = (String) executeMethod("generateRequestNumber");
                 if(!"Success".equals(newMsg)){
                     showPopupMessage(newMsg, FacesMessage.SEVERITY_ERROR);
                 }else{
                    save();
                     Object msg = submitARDocForApproval();
                     if ("SUCCESS".equalsIgnoreCase(msg.toString())) {
                         showPopupMessage("Submitted for Approval", FacesMessage.SEVERITY_INFO);
                         save();
                         ADFContext.getCurrent().getPageFlowScope().put("changesSaved", "Y");
    
                     } else {
                         showPopupMessage(msg.toString(), FacesMessage.SEVERITY_ERROR);
                     }
                     addPartialTrigger(getRequestTrxnPageBind());
                 }
             }
            
//            if (dialogEvent.getOutcome() == DialogEvent.Outcome.yes) {
//                String message = (String) executeMethod("submitAssetRequest");
//                if(!"Success".equals(message)){
//                    showPopupMessage(message, FacesMessage.SEVERITY_ERROR);
//                }else{
//                    save();
//                    addPartialTrigger(getRequestTrxnPageBind());
//                }
//            }
         }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void withdrawRequestDL(DialogEvent dialogEvent) 
    {
        try {
            if (dialogEvent.getOutcome() == DialogEvent.Outcome.yes) {
                String message = (String) executeMethod("withdrawARFromApproval");
                if(!"Success".equals(message)){
                    showPopupMessage(message, FacesMessage.SEVERITY_ERROR);
                }else{
                    addPartialTrigger(getRequestTrxnPageBind());
                }
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setWithdrawRequestConfirmPopup(RichPopup withdrawRequestConfirmPopup) {
        this.withdrawRequestConfirmPopup = withdrawRequestConfirmPopup;
    }

    public RichPopup getWithdrawRequestConfirmPopup() {
        return withdrawRequestConfirmPopup;
    }

    public void setRequestTrxnPageBind(RichPanelGroupLayout requestTrxnPageBind) {
        this.requestTrxnPageBind = requestTrxnPageBind;
    }

    public RichPanelGroupLayout getRequestTrxnPageBind() {        
        return requestTrxnPageBind;
    }

    public void rentalTypeVL(ValueChangeEvent valueChangeEvent) 
    {
        try 
        {
            valueChangeEvent.getComponent().processUpdates(FacesContext.getCurrentInstance());
//            String msg = (String) executeMethod("rentalsTypeChange");
//            if(!("Success".equals(msg))) 
//            {
//                showPopupMessage(msg, FacesMessage.SEVERITY_ERROR);    
//            }
            ADFContext.getCurrent().getPageFlowScope().put("changesSaved", "N");
        }
        catch(Exception e) 
        {
            e.printStackTrace();    
        }
    }

    public void setCategoryBindgs(RichInputComboboxListOfValues categoryBindgs) {
        this.categoryBindgs = categoryBindgs;
    }

    public RichInputComboboxListOfValues getCategoryBindgs() {
        return categoryBindgs;
    }

    public void setReqLinesTblBindgs(RichTable reqLinesTblBindgs) {
        this.reqLinesTblBindgs = reqLinesTblBindgs;
    }

    public RichTable getReqLinesTblBindgs() {
        return reqLinesTblBindgs;
    }

    public void requestTypeVL(ValueChangeEvent valueChangeEvent) 
    {
        try 
        {
            valueChangeEvent.getComponent().processUpdates(FacesContext.getCurrentInstance());
            String msg = (String) executeMethod("requestTypeChange");
            if(!("Success".equals(msg))) 
            {
                showPopupMessage(msg, FacesMessage.SEVERITY_ERROR);
            }
            else {
                addPartialTrigger(getRequestorBUBindgs());
                addPartialTrigger(getSrcBUBindgs());
                addPartialTrigger(getSrcDivisionBindgs());
                addPartialTrigger(getRequestorNameBindgs());
                addPartialTrigger(getCustomerTypeBindgs());
                addPartialTrigger(getProjectBindgs());
                addPartialTrigger(getDivisionBindgs());
                addPartialTrigger(getDeptBindgs());
                addPartialTrigger(getCustNameBindgs());
                addPartialTrigger(getCustSiteNameVL());
            }
        }
        catch(Exception e) 
        {
            e.printStackTrace();    
        }
    }

    public void requestorBUVL(ValueChangeEvent valueChangeEvent) 
    {
        try 
        {
            valueChangeEvent.getComponent().processUpdates(FacesContext.getCurrentInstance());
            String msg = (String) executeMethod("requestorBUChange");
            if(!("Success".equals(msg))) 
            {
                showPopupMessage(msg, FacesMessage.SEVERITY_ERROR);
            }
            else {
                addPartialTrigger(getSrcBUBindgs());
                addPartialTrigger(getSrcDivisionBindgs());
                addPartialTrigger(getRequestorNameBindgs());
                addPartialTrigger(getCustomerTypeBindgs());
                addPartialTrigger(getProjectBindgs());
                addPartialTrigger(getDivisionBindgs());
                addPartialTrigger(getDeptBindgs());
                addPartialTrigger(getCustNameBindgs());
                addPartialTrigger(getCustSiteNameVL());
            }
        }
        catch(Exception e) 
        {
            e.printStackTrace();    
        }
    }

    public void srcBUVL(ValueChangeEvent valueChangeEvent) 
    {
        try 
        {
            valueChangeEvent.getComponent().processUpdates(FacesContext.getCurrentInstance());
            String msg = (String) executeMethod("srcBuChange");
            if(!("Success".equals(msg))) 
            {
                showPopupMessage(msg, FacesMessage.SEVERITY_ERROR);
            }
            else {
                addPartialTrigger(getRequestorBUBindgs());
                addPartialTrigger(getSrcBUBindgs());
                addPartialTrigger(getSrcDivisionBindgs());
                addPartialTrigger(getCustomerTypeBindgs());
                addPartialTrigger(getProjectBindgs());
                addPartialTrigger(getDivisionBindgs());
                addPartialTrigger(getDeptBindgs());
                addPartialTrigger(getCustNameBindgs());
                addPartialTrigger(getCustSiteNameVL());
            }
        }
        catch(Exception e) 
        {
            e.printStackTrace();    
        }
    }

    public void srcDivisionVL(ValueChangeEvent valueChangeEvent) 
    {
        try 
        {
            valueChangeEvent.getComponent().processUpdates(FacesContext.getCurrentInstance());
            String msg = (String) executeMethod("srcDivisonChange");
            if(!("Success".equals(msg))) 
            {
                showPopupMessage(msg, FacesMessage.SEVERITY_ERROR);
            }
            else {
                addPartialTrigger(getCustomerTypeBindgs());
                addPartialTrigger(getProjectBindgs());
                addPartialTrigger(getDivisionBindgs());
                addPartialTrigger(getDeptBindgs());
                addPartialTrigger(getCustNameBindgs());
                addPartialTrigger(getCustSiteNameVL());
            }
        }
        catch(Exception e) 
        {
            e.printStackTrace();    
        }
    }


    public void custTypeVL(ValueChangeEvent valueChangeEvent) 
    {
        try 
        {
            valueChangeEvent.getComponent().processUpdates(FacesContext.getCurrentInstance());
            String msg = (String) executeMethod("custTypeChange");
            if(!("Success".equals(msg))) 
            {
                showPopupMessage(msg, FacesMessage.SEVERITY_ERROR);
            }
            else 
            {
                addPartialTrigger(getProjectBindgs());
                addPartialTrigger(getDivisionBindgs());
                addPartialTrigger(getDeptBindgs());
                addPartialTrigger(getCustNameBindgs());
                addPartialTrigger(getCustSiteNameVL());
            }
        }
        catch(Exception e) 
        {
            e.printStackTrace();    
        }
    }

    public void setRequestorBUBindgs(RichInputComboboxListOfValues requestorBUBindgs) {
        this.requestorBUBindgs = requestorBUBindgs;
    }

    public RichInputComboboxListOfValues getRequestorBUBindgs() {
        return requestorBUBindgs;
    }

    public void setSrcBUBindgs(RichInputComboboxListOfValues srcBUBindgs) {
        this.srcBUBindgs = srcBUBindgs;
    }

    public RichInputComboboxListOfValues getSrcBUBindgs() {
        return srcBUBindgs;
    }

    public void setSrcDivisionBindgs(RichInputComboboxListOfValues srcDivisionBindgs) {
        this.srcDivisionBindgs = srcDivisionBindgs;
    }

    public RichInputComboboxListOfValues getSrcDivisionBindgs() {
        return srcDivisionBindgs;
    }

    public void setRequestedDateBindgs(RichInputDate requestedDateBindgs) {
        this.requestedDateBindgs = requestedDateBindgs;
    }

    public RichInputDate getRequestedDateBindgs() {
        return requestedDateBindgs;
    }

    public void setRequestorNameBindgs(RichInputComboboxListOfValues requestorNameBindgs) {
        this.requestorNameBindgs = requestorNameBindgs;
    }

    public RichInputComboboxListOfValues getRequestorNameBindgs() {
        return requestorNameBindgs;
    }

    public void setCustomerTypeBindgs(RichInputComboboxListOfValues customerTypeBindgs) {
        this.customerTypeBindgs = customerTypeBindgs;
    }

    public RichInputComboboxListOfValues getCustomerTypeBindgs() {
        return customerTypeBindgs;
    }

    public void setProjectBindgs(RichInputComboboxListOfValues projectBindgs) {
        this.projectBindgs = projectBindgs;
    }

    public RichInputComboboxListOfValues getProjectBindgs() {
        return projectBindgs;
    }

    public void setDivisionBindgs(RichInputComboboxListOfValues divisionBindgs) {
        this.divisionBindgs = divisionBindgs;
    }

    public RichInputComboboxListOfValues getDivisionBindgs() {
        return divisionBindgs;
    }

    public void setDeptBindgs(RichInputComboboxListOfValues deptBindgs) {
        this.deptBindgs = deptBindgs;
    }

    public RichInputComboboxListOfValues getDeptBindgs() {
        return deptBindgs;
    }

    public void setCustNameBindgs(RichInputComboboxListOfValues custNameBindgs) {
        this.custNameBindgs = custNameBindgs;
    }

    public RichInputComboboxListOfValues getCustNameBindgs() {
        return custNameBindgs;
    }

    public void setCustSiteNameVL(RichInputComboboxListOfValues custSiteNameVL) {
        this.custSiteNameVL = custSiteNameVL;
    }

    public RichInputComboboxListOfValues getCustSiteNameVL() {
        return custSiteNameVL;
    }

    public void cancelRequestAL(ActionEvent actionEvent) 
    {
        try 
        {
            showPopup(getCancelReqPopupBindgs());
            
        }
        catch(Exception e) 
        {
            e.printStackTrace();    
        }
    }

    public void setCancelReqPopupBindgs(RichPopup cancelReqPopupBindgs) {
        this.cancelReqPopupBindgs = cancelReqPopupBindgs;
    }

    public RichPopup getCancelReqPopupBindgs() {
        return cancelReqPopupBindgs;
    }

    public void cancelRequestDL(DialogEvent dialogEvent) 
    {
        try 
        {
            if (dialogEvent.getOutcome() == DialogEvent.Outcome.yes) {
                String msg = (String) executeMethod("cancelAssetRequest");
                if(!("Success".equals(msg))) 
                {
                    showPopupMessage(msg, FacesMessage.SEVERITY_ERROR);    
                }
                else 
                {
                    save();
                    addPartialTrigger(getRequestTrxnPageBind());
                }
            }
        }
        catch(Exception e) 
        {
            e.printStackTrace();    
        }
    }

    public void transReqBuVL(ValueChangeEvent valueChangeEvent) 
    {
        try 
        {
            valueChangeEvent.getComponent().processUpdates(FacesContext.getCurrentInstance());
            String msg = (String) executeMethod("transReqBuChange");
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
    
    public String submitARDocForApproval() {
        Object msg = executeMethod("callpkgForAMEARProcessSubmit");
        return msg != null ? msg.toString() : "";
    }

    public void approveDoc(ActionEvent actionEvent) 
    {
        NotificationBean bean = new NotificationBean();
        bean.approveDialogEvent();
    }

    public void rejectDoc(ActionEvent actionEvent) {
        String actionRemarks = (String)getEL("#{pageFlowScope.APPROVAL_REMARKS}");
        if( actionRemarks!=null  && !(actionRemarks.equals(""))){
            NotificationBean bean = new NotificationBean();
            bean.rejectDialogEvent();
        
        }
        else{
            showPopupMessage("Rejection Remarks are mandatory",FacesMessage.SEVERITY_ERROR);
        }
    }

    public void ARactionHistoryAL(ActionEvent actionEvent) 
    {
        try 
        {
            executeMethod("setActionHistoryForARDocument");
            showPopup(getAractionHistoryPopupBindgs());
        }
        catch(Exception e) 
        {
            e.printStackTrace();    
        }
    }

    public void setAractionHistoryPopupBindgs(RichPopup aractionHistoryPopupBindgs) {
        this.aractionHistoryPopupBindgs = aractionHistoryPopupBindgs;
    }

    public RichPopup getAractionHistoryPopupBindgs() {
        return aractionHistoryPopupBindgs;
    }

    public void interDivisionVL(ValueChangeEvent valueChangeEvent) {
        valueChangeEvent.getComponent().processUpdates(FacesContext.getCurrentInstance());
        String message = (String) executeMethod("arInterDivisionCheck");
        if(!"Success".equals(message)){
            showPopupMessage(message, FacesMessage.SEVERITY_ERROR);
            addPartialTrigger(getDivisionBindgs());
        }
    }
}
