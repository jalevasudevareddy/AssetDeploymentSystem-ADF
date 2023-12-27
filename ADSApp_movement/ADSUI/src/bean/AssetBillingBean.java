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
import oracle.adf.view.rich.component.rich.input.RichInputText;
import oracle.adf.view.rich.component.rich.layout.RichPanelGroupLayout;
import oracle.adf.view.rich.component.rich.layout.RichPanelHeader;
import oracle.adf.view.rich.event.DialogEvent;

import oracle.jbo.Row;
import oracle.jbo.RowSetIterator;

import org.apache.myfaces.trinidad.model.UploadedFile;

public class AssetBillingBean extends CommonBean{
    private RichTable billingSearchTblBindgs;
    private RichPopup attchPopupBind;
    private RichPanelHeader attchHdrBind;
    private RichPopup submitBillConfirmPopup;
    private RichPanelGroupLayout billTrxnPageBind;
    private RichPopup withdrawBillConfirmPopup;
    private RichInputText assetNetAmtBindgs;
    private RichInputText assetVatAmountBindgs;
    private RichInputText hdrDiscountAmtBindgs;
    private RichInputText hdrNetAmtBindgs;
    private RichPopup cancelPopupBindgs;
    private RichPopup deleteBillingConfirmPopupBindgs;
    private RichPopup deleteAssetConfirmPopupBind;
    private RichTable billingAssetsTableBind;
    private RichTable addtnlChargesTableBind;
    private RichTable otherChargesTableBind;
    private RichInputComboboxListOfValues srcDivBind;
    private RichInputComboboxListOfValues reqBuBind;
    private RichInputComboboxListOfValues contractNumberBind;

    public AssetBillingBean() {
        super();
    }

    public void searchBillingsAL(ActionEvent actionEvent) 
    {
        try 
        {
            String msg = (String) executeMethod("searchBillings");   
            if(!("Success".equals(msg))) 
            {
                showPopupMessage(msg, FacesMessage.SEVERITY_ERROR);
            }
            else
            {
                addPartialTrigger(getBillingSearchTblBindgs());
            }
        }
        catch(Exception e) 
        {
            e.printStackTrace();    
        }
    }

    public void resetBillingSearchAL(ActionEvent actionEvent) 
    {
        try 
        {
            String msg = (String) executeMethod("resetBillingsSearch");  
            if(!("Success".equals(msg))) {
                showPopupMessage(msg, FacesMessage.SEVERITY_ERROR);
            }
            addPartialTrigger(getBillingSearchTblBindgs());
        }
        catch(Exception e)
        {
            e.printStackTrace();    
        }
    }
    
    public void setBillingSearchAttributes(){
        try {
            Map pageFlowScope = ADFContext.getCurrent().getPageFlowScope();
            
            pageFlowScope.put("abSrcBuName", getEL("#{bindings.TransSrcBuName.inputValue}"));
            pageFlowScope.put("abSrcBuId", getEL("#{bindings.TransSrcBuId.inputValue}"));
            System.out.println((String) pageFlowScope.get("abSrcBuName"));
            pageFlowScope.put("abSrcDiv", getEL("#{bindings.TransSrcDivision.inputValue}"));
            pageFlowScope.put("abSrcDivFlexValueId", getEL("#{bindings.TransSrcDivFlexValueId.inputValue}"));
            pageFlowScope.put("abSrcDivRequired", getEL("#{bindings.TransSrcDivRequired.inputValue}"));
            pageFlowScope.put("abSrcDivSegmentNumber", getEL("#{bindings.TransSrcDivSegmentNumber.inputValue}"));

            pageFlowScope.put("abReqBuId", getEL("#{bindings.TransReqBuId.inputValue}"));
            pageFlowScope.put("abReqBuName", getEL("#{bindings.TransReqBuName.inputValue}"));
            pageFlowScope.put("abReqDivSegmentNumber", getEL("#{bindings.TransReqDivSegmentNumber.inputValue}"));
            pageFlowScope.put("abReqDeptSegmentNumber", getEL("#{bindings.TransReqDeptSegmentNumber.inputValue}"));
            
            
            pageFlowScope.put("abContractNumber", getEL("#{bindings.TransContractNumber.inputValue}"));
            pageFlowScope.put("abContractId", getEL("#{bindings.TransContractId.inputValue}"));
            
            pageFlowScope.put("abCustTypeCode", getEL("#{bindings.TransCustTypeCode.inputValue}"));
            pageFlowScope.put("abCustType", getEL("#{bindings.TransCustType.inputValue}"));
            pageFlowScope.put("abProjectId", getEL("#{bindings.TransProjectId.inputValue}"));
            pageFlowScope.put("abProject", getEL("#{bindings.TransProject.inputValue}"));
            pageFlowScope.put("abDiv", getEL("#{bindings.TransDivision.inputValue}"));
            pageFlowScope.put("abDivFlexValueId", getEL("#{bindings.TransDivFlexValueId.inputValue}"));
            pageFlowScope.put("abDeptName", getEL("#{bindings.TransDeptName.inputValue}"));
            pageFlowScope.put("abDeptFlexValueId", getEL("#{bindings.TransDeptFlexValueId.inputValue}"));
            pageFlowScope.put("abCustomerName", getEL("#{bindings.TransCustomerName.inputValue}"));
            
            pageFlowScope.put("abCustomerId", getEL("#{bindings.TransCustomerId.inputValue}"));
            pageFlowScope.put("abBillNumber", getEL("#{bindings.TransBillNumber.inputValue}"));
            pageFlowScope.put("abBillDate", getEL("#{bindings.TransBillDate.inputValue}"));
            
            
            
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void createBillAL(ActionEvent actionEvent) 
    {
        try 
        {
            setBillingSearchAttributes();
            String msg = (String) executeMethod("createBill");
            if(!("Success".equals(msg))) {
                showPopupMessage(msg, FacesMessage.SEVERITY_ERROR);
            }
            else 
            {
                navigateNew("Go");
                ADFContext.getCurrent().getPageFlowScope().put("billEditFlag", "Y");
                ADFContext.getCurrent().getPageFlowScope().put("billChangesSaved", "N");
            }
        }
        catch(Exception e) 
        {
            e.printStackTrace();    
        }
    }

    public void editBillAL(ActionEvent actionEvent) 
    {
        try 
        {
            setBillingSearchAttributes();
            String msg = (String) executeMethod("editBill");
            if(!("Success".equals(msg))) {
                showPopupMessage(msg, FacesMessage.SEVERITY_ERROR);
            }
            else 
            {
                navigateNew("Go");        
            }
        }
        catch(Exception e) 
        {
            e.printStackTrace();    
        }
    }


    public void setBillingSearchTblBindgs(RichTable billingSearchTblBindgs) {
        this.billingSearchTblBindgs = billingSearchTblBindgs;
    }

    public RichTable getBillingSearchTblBindgs() {
        return billingSearchTblBindgs;
    }

    public void saveBillAL(ActionEvent actionEvent) 
    {
        try 
        {
            String newMsg = (String) executeMethod("generateBillNumber");
            if(!"Success".equals(newMsg)){
                showPopupMessage(newMsg, FacesMessage.SEVERITY_ERROR);
            }else{
                save();
                executeMethod("recalculateBillHdrAmount");
                ADFContext.getCurrent().getPageFlowScope().put("billChangesSaved", "Y");
            }
        }
        catch(Exception e) 
        {
            e.printStackTrace();    
        }
    }

    public void saveCloseBillAL(ActionEvent actionEvent) 
    {
        try 
        {
//            if("N".equals(ADFContext.getCurrent().getPageFlowScope().get("billChangesSaved"))) 
//            {
//                showPopup(getCancelPopupBindgs());
//            }
//            else
//            {
            String newMsg = (String) executeMethod("generateBillNumber");
            if(!"Success".equals(newMsg)){
                showPopupMessage(newMsg, FacesMessage.SEVERITY_ERROR);
            }else{
                save();
                navigateNew("Back");
                executeMethod("setBillingSearch");
                ADFContext.getCurrent().getPageFlowScope().put("billChangesSaved","Y");
            }
//            }
        }
        catch(Exception e) 
        {
            e.printStackTrace();    
        }
    }

    public void closeBillAL(ActionEvent actionEvent) 
    {
        try 
        {
            if("N".equals(ADFContext.getCurrent().getPageFlowScope().get("billChangesSaved"))) 
            {
                showPopup(getCancelPopupBindgs());
            }
            else
            {
                cancel();
                navigateNew("Back");
                executeMethod("setBillingSearch");
            }
        }
        catch(Exception e) 
        {
            e.printStackTrace();    
        }
    }

    public void addOtherChargesAL(ActionEvent actionEvent) 
    {
        try 
        {
            String msg = (String) executeMethod("addOtherBillCharges");
            if(!("Success".equals(msg))) 
            {
                showPopupMessage(msg, FacesMessage.SEVERITY_ERROR);    
            }
            ADFContext.getCurrent().getPageFlowScope().put("billChangesSaved", "N");
        }
        catch(Exception e) 
        {
            e.printStackTrace();    
        }
    }

    public void populateBillLines(ActionEvent actionEvent) 
    {
        try 
        {
            String newMsg = (String) executeMethod("generateBillNumber");
            if(!"Success".equals(newMsg)){
                showPopupMessage(newMsg, FacesMessage.SEVERITY_ERROR);
            }else{
                save();
                ADFContext.getCurrent().getPageFlowScope().put("billChangesSaved", "Y");
                String msg = (String) executeMethod("populateBillLines");
                if(!("Success".equals(msg))) 
                {
                    showPopupMessage(msg, FacesMessage.SEVERITY_ERROR);    
                }
            }
        }
        catch(Exception e) 
        {
            e.printStackTrace();    
        }
    }

    public void billAttachmentsAL(ActionEvent actionEvent) 
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
                ADFContext.getCurrent().getPageFlowScope().put("billChangesSaved", "N");
            //            save();
                DCBindingContainer dcBindingContainer =
                            (DCBindingContainer)BindingContext.getCurrent().getCurrentBindingsEntry();
                        DCIteratorBinding iter =   dcBindingContainer.findIteratorBinding("AttachmentsVO7Iterator");
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

    public void addBillAttachmentAL(ActionEvent actionEvent) 
    {
        try 
        {
            executeMethod("addBillAttachment");
            ADFContext.getCurrent().getPageFlowScope().put("billChangesSaved", "N");
            addPartialTrigger(getAttchHdrBind());
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }

    public void deleteBillAttachmentAL(ActionEvent actionEvent) 
    {
        try
        {
            executeMethod("Delete");
            ADFContext.getCurrent().getPageFlowScope().put("billChangesSaved", "N");
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
            
            String str = (String)executeMethod("uploadBillAttach");
            if(!"Success".equals(str)){
                showPopupMessage("Not a valid File", FacesMessage.SEVERITY_ERROR);
            }
            else {
                ADFContext.getCurrent().getPageFlowScope().put("billChangesSaved", "N");
            }
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        addPartialTrigger(getAttchHdrBind());
    }

    public void downloadBillAttachment(FacesContext facesContext, OutputStream outputStream) 
    {
        try {
            DCBindingContainer binding =
                (DCBindingContainer)BindingContext.getCurrent().getCurrentBindingsEntry();
            DCIteratorBinding bindingIterator =
                binding.findIteratorBinding("AttachmentsVO7Iterator");
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

    public void confirmSubmitBilling(ActionEvent actionEvent) 
    {
        try 
        {
////            String msg = (String) executeMethod("validateRequest");
//            if(!("Success".equals(msg)))
//            {
//                showPopupMessage(msg, FacesMessage.SEVERITY_ERROR);
//            }
//            else 
//            {
                showPopup(getSubmitBillConfirmPopup());
//            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setSubmitBillConfirmPopup(RichPopup submitBillConfirmPopup) {
        this.submitBillConfirmPopup = submitBillConfirmPopup;
    }

    public RichPopup getSubmitBillConfirmPopup() {
        return submitBillConfirmPopup;
    }

    public void submitBillConfirmDL(DialogEvent dialogEvent) 
    {
        try {
             if (dialogEvent.getOutcome().equals(DialogEvent.Outcome.yes)) {
                 String newMsg = (String) executeMethod("generateBillNumber");
                 if(!"Success".equals(newMsg)){
                     showPopupMessage(newMsg, FacesMessage.SEVERITY_ERROR);
                 }else{
                    save();
                    String message = (String) executeMethod("billSubmitTsCheck");
                    if(!"Success".equals(message)){
                        showPopupMessage(message, FacesMessage.SEVERITY_ERROR);
                    }else{
                         Object msg = submitABDocForApproval();
                         if ("SUCCESS".equalsIgnoreCase(msg.toString())) {
                             showPopupMessage("Submitted for Approval", FacesMessage.SEVERITY_INFO);
                             save();
                             ADFContext.getCurrent().getPageFlowScope().put("changesSaved", "Y");
        
                         } else {
                             showPopupMessage(msg.toString(), FacesMessage.SEVERITY_ERROR);
                         }
                         addPartialTrigger(getBillTrxnPageBind());
                    }
                 }
             }

         }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setBillTrxnPageBind(RichPanelGroupLayout billTrxnPageBind) {
        this.billTrxnPageBind = billTrxnPageBind;
    }

    public RichPanelGroupLayout getBillTrxnPageBind() {
        return billTrxnPageBind;
    }
    
    public String submitABDocForApproval() {
        Object msg = executeMethod("callpkgForAMEABProcessSubmit");
        return msg != null ? msg.toString() : "";
    }

    public void confirmWithdrawBill(ActionEvent actionEvent) 
    {
        try 
        {
            showPopup(getWithdrawBillConfirmPopup());
        }
        catch(Exception e) 
        {
            e.printStackTrace();    
        }
    }

    public void setWithdrawBillConfirmPopup(RichPopup withdrawBillConfirmPopup) {
        this.withdrawBillConfirmPopup = withdrawBillConfirmPopup;
    }

    public RichPopup getWithdrawBillConfirmPopup() {
        return withdrawBillConfirmPopup;
    }

    public void withdrawBillDL(DialogEvent dialogEvent) 
    {
        try 
        {
            if (dialogEvent.getOutcome() == DialogEvent.Outcome.yes) 
            {
                String message = (String) executeMethod("withdrawABFromApproval");
                if(!"Success".equals(message))
                {
                    showPopupMessage(message, FacesMessage.SEVERITY_ERROR);
                }
                else
                {
                    addPartialTrigger(getBillTrxnPageBind());
                    ADFContext.getCurrent().getPageFlowScope().put("billChangesSaved", "Y");
                }
            }
        }
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }

    public void approveDoc(ActionEvent actionEvent) 
    {
        try 
        {
            NotificationBean bean = new NotificationBean();
            bean.approveDialogEvent();
        }
        catch(Exception e) 
        {
            e.printStackTrace();    
        }
    }

    public void rejectDoc(ActionEvent actionEvent) 
    {
        try 
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
        catch(Exception e) 
        {
            e.printStackTrace();    
        }
    }

    public void hdrTaxRateCodeVL(ValueChangeEvent valueChangeEvent) 
    {
        try 
        {
            valueChangeEvent.getComponent().processUpdates(FacesContext.getCurrentInstance());
            ADFContext.getCurrent().getPageFlowScope().put("billChangesSaved", "N");
            String msg = (String) executeMethod("setLinesTaxRate");
            if(!("Success".equals(msg))) 
            {
                showPopupMessage(msg, FacesMessage.SEVERITY_ERROR);    
            }
            else {
                addPartialTrigger(getBillTrxnPageBind());
            }
        }
        catch(Exception e) 
        {
            e.printStackTrace();    
        }
    }

    public void lineTaxRateCodeChangeVL(ValueChangeEvent valueChangeEvent) 
    {
        try 
        {
//            valueChangeEvent.getComponent().processUpdates(FacesContext.getCurrentInstance());
//            String msg = (String) executeMethod("updateLineAmount");
//            if(!("Success".equals(msg))) 
//            {
//                showPopupMessage(msg, FacesMessage.SEVERITY_ERROR);    
//            }
            addPartialTrigger(getAssetVatAmountBindgs());
            ADFContext.getCurrent().getPageFlowScope().put("billChangesSaved", "N");
//            addPartialTrigger(getAssetNetAmtBindgs());
            
        }
        catch(Exception e) 
        {
            e.printStackTrace();    
        }
    }

    public void setAssetNetAmtBindgs(RichInputText assetNetAmtBindgs) {
        this.assetNetAmtBindgs = assetNetAmtBindgs;
    }

    public RichInputText getAssetNetAmtBindgs() {
        return assetNetAmtBindgs;
    }

    public void setAssetVatAmountBindgs(RichInputText assetVatAmountBindgs) {
        this.assetVatAmountBindgs = assetVatAmountBindgs;
    }

    public RichInputText getAssetVatAmountBindgs() {
        return assetVatAmountBindgs;
    }

    public void setHdrDiscountAmtBindgs(RichInputText hdrDiscountAmtBindgs) {
        this.hdrDiscountAmtBindgs = hdrDiscountAmtBindgs;
    }

    public RichInputText getHdrDiscountAmtBindgs() {
        return hdrDiscountAmtBindgs;
    }

    public void setHdrNetAmtBindgs(RichInputText hdrNetAmtBindgs) {
        this.hdrNetAmtBindgs = hdrNetAmtBindgs;
    }

    public RichInputText getHdrNetAmtBindgs() {
        return hdrNetAmtBindgs;
    }

    public void amtVL(ValueChangeEvent valueChangeEvent) 
    {
        try 
        {
            valueChangeEvent.getComponent().processUpdates(FacesContext.getCurrentInstance());
            executeMethod("recalculateBillHdrAmount");
            ADFContext.getCurrent().getPageFlowScope().put("billChangesSaved", "N");
            addPartialTrigger(getHdrDiscountAmtBindgs());
            addPartialTrigger(getHdrNetAmtBindgs());
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
            executeMethod("setBillingSearch");
        }
    }

    public void setDeleteBillingConfirmPopupBindgs(RichPopup deleteBillingConfirmPopupBindgs) {
        this.deleteBillingConfirmPopupBindgs = deleteBillingConfirmPopupBindgs;
    }

    public RichPopup getDeleteBillingConfirmPopupBindgs() {
        return deleteBillingConfirmPopupBindgs;
    }

    public void deleteBillingConfirmDL(DialogEvent dialogEvent) 
    {
        try 
        {
            if(dialogEvent.getOutcome() == DialogEvent.Outcome.yes)
            {
                String msg = (String) executeMethod("deleteBill");
                if(!("Success".equals(msg))) 
                {
                    showPopupMessage(msg, FacesMessage.SEVERITY_ERROR);    
                }
            }
            else 
            {
                getDeleteBillingConfirmPopupBindgs().cancel();    
            }
        }
        catch(Exception e) 
        {
            e.printStackTrace();    
        }
    }

    public void billInterfaceAL(ActionEvent actionEvent) {
        try {
            if("N".equals(getEL("#{bindings.InterfaceFlag.inputValue}")) && "C".equals(getEL("#{bindings.Status.inputValue}"))){
                String message = (String) executeMethod("interfaceBillDocument");
                if(!"Success".equals(message)){
                    showPopupMessage(message, FacesMessage.SEVERITY_ERROR);
                }
            }else{
                showPopupMessage("Billing Document can't be interfaced", FacesMessage.SEVERITY_ERROR);
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void deleteBillAssetAL(ActionEvent actionEvent) {
        try {
            showPopup(getDeleteAssetConfirmPopupBind());
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setDeleteAssetConfirmPopupBind(RichPopup deleteAssetConfirmPopupBind) {
        this.deleteAssetConfirmPopupBind = deleteAssetConfirmPopupBind;
    }

    public RichPopup getDeleteAssetConfirmPopupBind() {
        return deleteAssetConfirmPopupBind;
    }

    public void deleteBillAssetDL(DialogEvent dialogEvent) {
        if(dialogEvent.getOutcome() == DialogEvent.Outcome.yes){
            try {
                String newMsg = (String) executeMethod("generateBillNumber");
                if(!"Success".equals(newMsg)){
                    showPopupMessage(newMsg, FacesMessage.SEVERITY_ERROR);
                }else{
                    save();                
                    String message = (String) executeMethod("deleteBillingAsset");
                    if(!"Success".equals(message)){
                        showPopupMessage(message, FacesMessage.SEVERITY_ERROR);
                    }
                    executeMethod("recalculateBillHdrAmount");
                    ADFContext.getCurrent().getPageFlowScope().put("billChangesSaved", "Y");
                }
            }catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void contractNumberVL(ValueChangeEvent valueChangeEvent) {
        valueChangeEvent.getComponent().processUpdates(FacesContext.getCurrentInstance());
        try {
                String message = (String) executeMethod("assetBillingcontractNumber");
                if(!"Success".equals(message)){
                           showPopupMessage(message, FacesMessage.SEVERITY_ERROR);
                       }
       } catch (Exception e) {
            // TODO: Add catch code
            e.printStackTrace();
        }
    }

    public void setBillingAssetsTableBind(RichTable billingAssetsTableBind) {
        this.billingAssetsTableBind = billingAssetsTableBind;
    }

    public RichTable getBillingAssetsTableBind() {
        return billingAssetsTableBind;
    }

    public void setAddtnlChargesTableBind(RichTable addtnlChargesTableBind) {
        this.addtnlChargesTableBind = addtnlChargesTableBind;
    }

    public RichTable getAddtnlChargesTableBind() {
        return addtnlChargesTableBind;
    }

    public void transSrcBuVL(ValueChangeEvent valueChangeEvent) {
        try {
            valueChangeEvent.getComponent().processUpdates(FacesContext.getCurrentInstance());
            String message = (String) executeMethod("assetBillSrcBuChange");
            if(!"Success".equals(message)){
                showPopupMessage(message, FacesMessage.SEVERITY_ERROR);
            }
            addPartialTrigger(getSrcDivBind());
            addPartialTrigger(getReqBuBind());
            addPartialTrigger(getContractNumberBind());
            addPartialTrigger(getBillingAssetsTableBind());
            addPartialTrigger(getAddtnlChargesTableBind());
            addPartialTrigger(getOtherChargesTableBind());
       } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setOtherChargesTableBind(RichTable otherChargesTableBind) {
        this.otherChargesTableBind = otherChargesTableBind;
    }

    public RichTable getOtherChargesTableBind() {
        return otherChargesTableBind;
    }

    public void hdrSrcDivisionVL(ValueChangeEvent valueChangeEvent) {
        valueChangeEvent.getComponent().processUpdates(FacesContext.getCurrentInstance());
        try {
            valueChangeEvent.getComponent().processUpdates(FacesContext.getCurrentInstance());
            String message = (String) executeMethod("assetBillSrcDivChange");
            if(!"Success".equals(message)){
                showPopupMessage(message, FacesMessage.SEVERITY_ERROR);
            }
            addPartialTrigger(getReqBuBind());
            addPartialTrigger(getContractNumberBind());
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void hdrReqBuVL(ValueChangeEvent valueChangeEvent) {
        valueChangeEvent.getComponent().processUpdates(FacesContext.getCurrentInstance());
        try {
            valueChangeEvent.getComponent().processUpdates(FacesContext.getCurrentInstance());
            String message = (String) executeMethod("assetBillReqBuChange");
            if(!"Success".equals(message)){
                showPopupMessage(message, FacesMessage.SEVERITY_ERROR);
            }
            addPartialTrigger(getContractNumberBind());
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setSrcDivBind(RichInputComboboxListOfValues srcDivBind) {
        this.srcDivBind = srcDivBind;
    }

    public RichInputComboboxListOfValues getSrcDivBind() {
        return srcDivBind;
    }

    public void setReqBuBind(RichInputComboboxListOfValues reqBuBind) {
        this.reqBuBind = reqBuBind;
    }

    public RichInputComboboxListOfValues getReqBuBind() {
        return reqBuBind;
    }

    public void setContractNumberBind(RichInputComboboxListOfValues contractNumberBind) {
        this.contractNumberBind = contractNumberBind;
    }

    public RichInputComboboxListOfValues getContractNumberBind() {
        return contractNumberBind;
    }

    public void downloadProformaPrintReport(FacesContext facesContext, OutputStream outputStream) {
        try {
            Object dataBytesObj = null;
            dataBytesObj = executeMethod("generateProformaPrintReport");
            if (dataBytesObj != null && dataBytesObj instanceof byte[]) {
            byte[] dataBytes = (byte[]) dataBytesObj;
            outputStream.write(dataBytes);
            outputStream.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
