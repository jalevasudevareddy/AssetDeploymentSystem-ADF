package bean;

import bean.notification.NotificationBean;

import java.io.InputStream;
import java.io.OutputStream;

import java.util.Map;

import javax.faces.event.ActionEvent;
import javax.faces.application.FacesMessage;

import javax.faces.context.FacesContext;
import javax.faces.event.ValueChangeEvent;

import model.view.RentalQuoteChargesVORowImpl;
import model.view.RentalQuoteLinesVORowImpl;

import javax.faces.context.FacesContext;

import model.view.AttachmentsVORowImpl;

import oracle.adf.share.ADFContext;
import oracle.adf.model.BindingContext;
import oracle.adf.model.binding.DCBindingContainer;
import oracle.adf.model.binding.DCIteratorBinding;
import oracle.adf.view.rich.component.rich.RichDialog;
import oracle.adf.view.rich.component.rich.RichPopup;
import oracle.adf.view.rich.component.rich.data.RichTable;
import oracle.adf.view.rich.component.rich.input.RichInputComboboxListOfValues;

import oracle.adf.view.rich.component.rich.input.RichInputDate;

import oracle.adf.view.rich.component.rich.input.RichInputText;

import oracle.adf.view.rich.component.rich.input.RichTextEditor;
import oracle.adf.view.rich.component.rich.layout.RichPanelGroupLayout;
import oracle.adf.view.rich.component.rich.layout.RichPanelHeader;
import oracle.adf.view.rich.component.rich.nav.RichLink;
import oracle.adf.view.rich.component.rich.output.RichOutputText;
import oracle.adf.view.rich.event.DialogEvent;

import oracle.adf.view.rich.util.ResetUtils;

import oracle.jbo.Row;
import oracle.jbo.RowSetIterator;
import oracle.jbo.ViewObject;

import org.apache.myfaces.trinidad.model.UploadedFile;

public class RentalQuotationBean extends CommonBean{
    private RichTable searchTableBind;
    private RichTable hiringInfoTblBind;
    private RichInputComboboxListOfValues reqLineNumBind;
    private RichInputComboboxListOfValues assetCategoryBind;
    private RichInputDate onHireDateBind;
    private RichInputDate offHireDateBind;
    private RichInputComboboxListOfValues chargeTypeBind;
    private RichInputComboboxListOfValues billingBind;
    private RichInputText chargeAmountBind;
    private RichPopup chargeSaveConfirmPopup;
    private RichPopup attchPopupBind;
    private RichPanelHeader attchHdrBind;
    private RichPopup submitConfirmPopup;
    private RichPanelGroupLayout trxnPageBind;
    private RichPopup withdrawConfirmPopup;
    private RichInputComboboxListOfValues sourceBuHdrBind;
    private RichPopup reviseConfirmPopup;
    private RichInputComboboxListOfValues srcDivHdrBind;
    private RichInputComboboxListOfValues reqBuHdrBind;
    private RichInputComboboxListOfValues customerTypeHdrBind;
    private RichInputComboboxListOfValues projectHdrBind;
    private RichInputComboboxListOfValues divisionHdrBind;
    private RichInputComboboxListOfValues deptHdrBind;
    private RichInputComboboxListOfValues customerHdrBind;
    private RichInputComboboxListOfValues custSiteHdrBind;
    private RichInputText standardRateBind;
    private RichInputText ot1RateBind;
    private RichInputText ot2RateBind;
    private RichInputText lineValueBind;
    private RichPopup rateConfirmPopup;
    private RichInputComboboxListOfValues minChargeUnitBind;
    private RichPopup cancelConfirmPopupBind;
    private RichInputDate validFromBind;
    private RichPopup closeConfirmPopupBind;
    private RichLink deleteButtonBind;
    private RichPopup rqactionHistoryPopupBindgs;
    private RichPopup templateBindgs;
    private RichTextEditor termsConditionsBindgs;
    private RichOutputText headerTotalAmtBind;
    private RichInputText unitRateBind;
    private RichDialog generateContractDL;
    private RichPopup generateContractBind;
    private RichTable additionalChargesTableBind;
    private RichInputText quantiyBind;
    private RichInputText unitAmountBind;
    private RichInputComboboxListOfValues salesPersonBind;

    public RentalQuotationBean() {
        super();
    }

    public void searchQuotations(ActionEvent actionEvent) {
        try {
            String message = (String) executeMethod("searchQuotations");
            if(!"Success".equals(message)){
                showPopupMessage(message, FacesMessage.SEVERITY_ERROR);
            }else{
                addPartialTrigger(getSearchTableBind());
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void resetQuotations(ActionEvent actionEvent) {
        try {
            String message = (String) executeMethod("resetQuotations");
            if(!"Success".equals(message)){
                showPopupMessage(message, FacesMessage.SEVERITY_ERROR);
            }else{
                addPartialTrigger(getSearchTableBind());
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void setSearchAttributes(){
        try {
            Map pf = ADFContext.getCurrent().getPageFlowScope();
            pf.put("rqsQuoteType", getEL("#{bindings.TransQuoteType.inputValue}"));
            pf.put("rqsBuId", getEL("#{bindings.TransBuId.inputValue}"));
            pf.put("rqsBu", getEL("#{bindings.TransBuName.inputValue}"));
            pf.put("rqsDivision", getEL("#{bindings.TransDivision.inputValue}"));
            pf.put("rqsDivFlexValId", getEL("#{bindings.TransDivFlexValueId.inputValue}"));
            pf.put("rqsDivRequired", getEL("#{bindings.TransDivRequired.inputValue}"));
            pf.put("rqsDivSegment", getEL("#{bindings.TransDivFlexNum.inputValue}"));
            pf.put("rqsReqBu", getEL("#{bindings.TransRequestingBu.inputValue}"));
            pf.put("rqsReqBuId", getEL("#{bindings.TransRequestingBuId.inputValue}"));
            pf.put("rqsQuotationNo", getEL("#{bindings.TransQuotationNumber.inputValue}"));
            pf.put("rqsQuoteStatus", getEL("#{bindings.TransQuoteStatus.inputValue}"));
            pf.put("rqsQuoteStatusCode", getEL("#{bindings.TransQuoteStatusCode.inputValue}"));
            pf.put("rqsCustomerType", getEL("#{bindings.TransCustomerType.inputValue}"));
            pf.put("rqsCustomerTypeCode", getEL("#{bindings.TransCustomerTypeCode.inputValue}"));
            pf.put("rqsReqBuDivSegment", getEL("#{bindings.TransReqDivFlexSegmentNum.inputValue}"));
            pf.put("rqsReqBuDeptSegment", getEL("#{bindings.TransReqDeptFlexSegmentNum.inputValue}"));
            pf.put("rqsProject", getEL("#{bindings.TransProject.inputValue}"));
            pf.put("rqsProjectId", getEL("#{bindings.TransProjectId.inputValue}"));
            pf.put("rqsCustDivision", getEL("#{bindings.TransCustomerDivision.inputValue}"));
            pf.put("rqsCustDivFlexValId", getEL("#{bindings.TransCustomerDivFlexValueId.inputValue}"));
            pf.put("rqsDeptName", getEL("#{bindings.TransDeptName.inputValue}"));
            pf.put("rqsDeptFlexValId", getEL("#{bindings.TransDeptFlexValueId.inputValue}"));
            pf.put("rqsCustomerName", getEL("#{bindings.TransCustomerName.inputValue}"));
            pf.put("rqsCustomerId", getEL("#{bindings.TransCustomerId.inputValue}"));
            pf.put("rqsCustomerSite", getEL("#{bindings.TransCustomerSite.inputValue}"));
            pf.put("rqsSiteUseId", getEL("#{bindings.TransSiteUseId.inputValue}"));
            
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void createQuotation(ActionEvent actionEvent) {
        try {
            setSearchAttributes();
            String message = (String) executeMethod("createQuotation");
            if(!"Success".equals(message)){
                showPopupMessage(message, FacesMessage.SEVERITY_ERROR);
            }else{
                ADFContext.getCurrent().getPageFlowScope().put("quoteEditFlag", "Y");
                navigateNew("Details");
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void editQuotation(ActionEvent actionEvent) {
        try {
            setSearchAttributes();
            String message = (String) executeMethod("editQuotation");
            if(!"Success".equals(message)){
                showPopupMessage(message, FacesMessage.SEVERITY_ERROR);
            }else{
                navigateNew("Details");
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void deleteQuotation(ActionEvent actionEvent) {
        // Add event code here...
    }

    public void addHiringInfo(ActionEvent actionEvent) {
        try {
            ADFContext.getCurrent().getPageFlowScope().put("isSaved", "N");
            String message = (String) executeMethod("addQuoteHireInfo");
            if(!"Success".equals(message)){
                showPopupMessage(message, FacesMessage.SEVERITY_ERROR);
            }else{
                ADFContext.getCurrent().getPageFlowScope().put("isSaved", "N");
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void deleteHiringInfo(ActionEvent actionEvent) {
        try {
            ADFContext.getCurrent().getPageFlowScope().put("isSaved", "N");
            String message = (String) executeMethod("deleteQuoteHireInfo");
            if(!"Success".equals(message)){
                showPopupMessage(message, FacesMessage.SEVERITY_ERROR);
            }else{
                ADFContext.getCurrent().getPageFlowScope().put("isSaved", "N");
            }
            addPartialTrigger(getAdditionalChargesTableBind());
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void addQuoteCharge(ActionEvent actionEvent) {
        try {
//            ADFContext.getCurrent().getPageFlowScope().put("isSaved", "N");
            if(!"Y".equals(ADFContext.getCurrent().getPageFlowScope().get("isSaved"))){
                showPopup(getChargeSaveConfirmPopup());
            }else{
                String message = (String) executeMethod("addQuoteCharge");
                if(!"Success".equals(message)){
                    showPopupMessage(message, FacesMessage.SEVERITY_ERROR);
                }
                addPartialTrigger(getDeleteButtonBind());
            }            
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void deleteQuoteCharge(ActionEvent actionEvent) {
        try {
            ADFContext.getCurrent().getPageFlowScope().put("isSaved", "N");
            String message = (String) executeMethod("deleteQuoteCharge");
            if(!"Success".equals(message)){
                showPopupMessage(message, FacesMessage.SEVERITY_ERROR);
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void saveQuotations(ActionEvent actionEvent) {
        try {
            String msg = (String) executeMethod("validateQuoteLines");
            if(!"Success".equals(msg)){
                String msgs[] = msg.split("_");
                for(int i = 0;i <msgs.length;i++){
                    showPopupMessage(msgs[i], FacesMessage.SEVERITY_ERROR);
                }
            }else{
                String message = (String) executeMethod("generateQuoteNumber");
                if(!"Success".equals(message)){
                    showPopupMessage(message, FacesMessage.SEVERITY_ERROR);
                }else{
                    save();
                    addPartialTrigger(getHeaderTotalAmtBind());
                    ADFContext.getCurrent().getPageFlowScope().put("isSaved", "Y");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void saveAndCloseQuotations(ActionEvent actionEvent) {
        try {
            String msg = (String) executeMethod("validateQuoteLines");
            if(!"Success".equals(msg)){
                String msgs[] = msg.split("_");
                for(int i = 0;i <msgs.length;i++){
                    showPopupMessage(msgs[i], FacesMessage.SEVERITY_ERROR);
                }
            }else{
                String message = (String) executeMethod("generateQuoteNumber");
                if(!"Success".equals(message)){
                    showPopupMessage(message, FacesMessage.SEVERITY_ERROR);
                }else{
                    save();
                    ADFContext.getCurrent().getPageFlowScope().put("isSaved", "Y");
                    navigateNew("Done");
                    executeMethod("setQuotationSearch");
                }
    //            addPartialTrigger(getSearchTableBind());
            }            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void closeQuotations(ActionEvent actionEvent) {
        try {
            if("N".equals(ADFContext.getCurrent().getPageFlowScope().get("isSaved"))){
                showPopup(getCloseConfirmPopupBind());              
            }else{
                cancel();
                ADFContext.getCurrent().getPageFlowScope().put("isSaved", "Y");
                navigateNew("Done");
                executeMethod("setQuotationSearch");
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
        
    public void setHiringInfoTblBind(RichTable hiringInfoTblBind) {
        this.hiringInfoTblBind = hiringInfoTblBind;
    }

    public RichTable getHiringInfoTblBind() {
        return hiringInfoTblBind;
    }

    public void setSearchTableBind(RichTable searchTableBind) {
        this.searchTableBind = searchTableBind;
    }

    public RichTable getSearchTableBind() {
        return searchTableBind;
    }

    public void reqLineNumVL(ValueChangeEvent valueChangeEvent) {
        try {
            ADFContext.getCurrent().getPageFlowScope().put("isSaved", "N");
            valueChangeEvent.getComponent().processUpdates(FacesContext.getCurrentInstance());
            String message = (String) executeMethod("quoteReqLineNumChange");
            if(!"Success".equals(message)){
                showPopupMessage(message, FacesMessage.SEVERITY_ERROR);
                addPartialTrigger(getReqLineNumBind());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void rentalTypeVL(ValueChangeEvent valueChangeEvent) {
        try {
            ADFContext.getCurrent().getPageFlowScope().put("isSaved", "N");
            valueChangeEvent.getComponent().processUpdates(FacesContext.getCurrentInstance());
            String message = (String) executeMethod("quoteRentalTypeChange");
            if(!"Success".equals(message)){
                showPopupMessage(message, FacesMessage.SEVERITY_ERROR);
                addPartialTrigger(getReqLineNumBind());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void categoryVL(ValueChangeEvent valueChangeEvent) {
        try {
            ADFContext.getCurrent().getPageFlowScope().put("isSaved", "N");
            valueChangeEvent.getComponent().processUpdates(FacesContext.getCurrentInstance());
            DCBindingContainer binding = (DCBindingContainer) BindingContext.getCurrent().getCurrentBindingsEntry();
            DCIteratorBinding bindingIterator = binding.findIteratorBinding("RentalQuoteLinesVO1Iterator");        
            if(bindingIterator != null){
                ViewObject vo = bindingIterator.getViewObject();
                if(vo != null){
                    RentalQuoteLinesVORowImpl currRow = (RentalQuoteLinesVORowImpl) vo.getCurrentRow();
                    if(currRow != null){
                        String message = (String) executeMethod("quoteHiringBasisChange");
                        if(!"Success".equals(message)){
                            showPopupMessage(message, FacesMessage.SEVERITY_ERROR);
                        }else{
                            addPartialTrigger(getStandardRateBind());
                            addPartialTrigger(getOt1RateBind());
                            addPartialTrigger(getOt2RateBind());
                            addPartialTrigger(getLineValueBind());
                            addPartialTrigger(getUnitRateBind());
                        }
                        currRow.setOnHireDate(null);
                        currRow.setOffHireDate(null);
                        addPartialTrigger(getOnHireDateBind());
                        addPartialTrigger(getOffHireDateBind());
                        ADFContext.getCurrent().getPageFlowScope().put("isSaved", "N");
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void onHireDateVL(ValueChangeEvent valueChangeEvent) {
        try {
            ADFContext.getCurrent().getPageFlowScope().put("isSaved", "N");
            valueChangeEvent.getComponent().processUpdates(FacesContext.getCurrentInstance());
            String message = (String) executeMethod("quoteLineOnHireDateChange");
            if(!"Success".equals(message)){
                showPopupMessage(message, FacesMessage.SEVERITY_ERROR);
                addPartialTrigger(getAssetCategoryBind());
                addPartialTrigger(getOnHireDateBind());
                addPartialTrigger(getOffHireDateBind());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void offHireDateVL(ValueChangeEvent valueChangeEvent) {
        ADFContext.getCurrent().getPageFlowScope().put("isSaved", "N");
        valueChangeEvent.getComponent().processUpdates(FacesContext.getCurrentInstance());
    }

    public void chargeCategoryVL(ValueChangeEvent valueChangeEvent) {
        try {
            ADFContext.getCurrent().getPageFlowScope().put("isSaved", "N");
            valueChangeEvent.getComponent().processUpdates(FacesContext.getCurrentInstance());
            DCBindingContainer binding = (DCBindingContainer) BindingContext.getCurrent().getCurrentBindingsEntry();
            DCIteratorBinding bindingIterator = binding.findIteratorBinding("RentalQuoteChargesVO1Iterator");
            if (bindingIterator != null) {
                ViewObject vo = bindingIterator.getViewObject();
                if (vo != null) {
                    RentalQuoteChargesVORowImpl currRow = (RentalQuoteChargesVORowImpl) vo.getCurrentRow();
                    if (currRow != null) {
                        currRow.setChargeType(null);
                        currRow.setTransChargeType(null);
                        currRow.setTransBilling(null);
                        currRow.setBilling(null);
                        currRow.setQuantity(null);
                        currRow.setUnitAmount(null);
                        currRow.setAmount(null);                    
                        addPartialTrigger(getChargeTypeBind());
                        addPartialTrigger(getBillingBind());
                        addPartialTrigger(getChargeAmountBind());
                        addPartialTrigger(getQuantiyBind());
                        addPartialTrigger(getUnitAmountBind());
                    }
                }
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void chargeTypeVL(ValueChangeEvent valueChangeEvent) {
        try {
            ADFContext.getCurrent().getPageFlowScope().put("isSaved", "N");
            valueChangeEvent.getComponent().processUpdates(FacesContext.getCurrentInstance());
            DCBindingContainer binding = (DCBindingContainer) BindingContext.getCurrent().getCurrentBindingsEntry();
            DCIteratorBinding bindingIterator = binding.findIteratorBinding("RentalQuoteChargesVO1Iterator");
            if (bindingIterator != null) {
                ViewObject vo = bindingIterator.getViewObject();
                if (vo != null) {
                    RentalQuoteChargesVORowImpl currRow = (RentalQuoteChargesVORowImpl) vo.getCurrentRow();
                    if (currRow != null) {
                        currRow.setTransBilling(null);
                        currRow.setBilling(null);
                        currRow.setQuantity(null);
                        currRow.setUnitAmount(null);
                        currRow.setAmount(null);
                        addPartialTrigger(getBillingBind());
                        addPartialTrigger(getChargeAmountBind());
                        addPartialTrigger(getQuantiyBind());
                        addPartialTrigger(getUnitAmountBind());
                    }
                }
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void chargeBillingVL(ValueChangeEvent valueChangeEvent) {
        try {
            ADFContext.getCurrent().getPageFlowScope().put("isSaved", "N");
            valueChangeEvent.getComponent().processUpdates(FacesContext.getCurrentInstance());
            String message = (String) executeMethod("quoteChargeBillingChange");
            if(!"Success".equals(message)){
                showPopupMessage(message, FacesMessage.SEVERITY_ERROR);
                addPartialTrigger(getBillingBind());
                addPartialTrigger(getChargeAmountBind());
                addPartialTrigger(getQuantiyBind());
                addPartialTrigger(getUnitAmountBind());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setReqLineNumBind(RichInputComboboxListOfValues reqLineNumBind) {
        this.reqLineNumBind = reqLineNumBind;
    }

    public RichInputComboboxListOfValues getReqLineNumBind() {
        return reqLineNumBind;
    }

    public void setAssetCategoryBind(RichInputComboboxListOfValues assetCategoryBind) {
        this.assetCategoryBind = assetCategoryBind;
    }

    public RichInputComboboxListOfValues getAssetCategoryBind() {
        return assetCategoryBind;
    }

    public void setOnHireDateBind(RichInputDate onHireDateBind) {
        this.onHireDateBind = onHireDateBind;
    }

    public RichInputDate getOnHireDateBind() {
        return onHireDateBind;
    }

    public void setOffHireDateBind(RichInputDate offHireDateBind) {
        this.offHireDateBind = offHireDateBind;
    }

    public RichInputDate getOffHireDateBind() {
        return offHireDateBind;
    }

    public void setChargeTypeBind(RichInputComboboxListOfValues chargeTypeBind) {
        this.chargeTypeBind = chargeTypeBind;
    }

    public RichInputComboboxListOfValues getChargeTypeBind() {
        return chargeTypeBind;
    }

    public void setBillingBind(RichInputComboboxListOfValues billingBind) {
        this.billingBind = billingBind;
    }

    public RichInputComboboxListOfValues getBillingBind() {
        return billingBind;
    }

    public void setChargeAmountBind(RichInputText chargeAmountBind) {
        this.chargeAmountBind = chargeAmountBind;
    }

    public RichInputText getChargeAmountBind() {
        return chargeAmountBind;
    }

    public void setChargeSaveConfirmPopup(RichPopup chargeSaveConfirmPopup) {
        this.chargeSaveConfirmPopup = chargeSaveConfirmPopup;
    }

    public RichPopup getChargeSaveConfirmPopup() {
        return chargeSaveConfirmPopup;
    }

    public void saveChargesConfirmDL(DialogEvent dialogEvent) {
        try {
            if(DialogEvent.Outcome.yes == dialogEvent.getOutcome()){
                String msg = (String) executeMethod("validateQuoteLines");
                if(!"Success".equals(msg)){
                    String msgs[] = msg.split("_");
                    for(int i = 0;i <msgs.length;i++){
                        showPopupMessage(msgs[i], FacesMessage.SEVERITY_ERROR);
                    }
                }else{
                    String message = (String) executeMethod("generateQuoteNumber");
                    if(!"Success".equals(message)){
                        showPopupMessage(message, FacesMessage.SEVERITY_ERROR);
                    }else{
                        save();                
                        String newMsg = (String) executeMethod("addQuoteCharge");
                        ADFContext.getCurrent().getPageFlowScope().put("isSaved", "N");
                        if(!"Success".equals(newMsg)){
                            showPopupMessage(newMsg, FacesMessage.SEVERITY_ERROR);
                        }
                        addPartialTrigger(getDeleteButtonBind());
                    }
                }
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setAttchPopupBind(RichPopup attchPopupBind) {
        this.attchPopupBind = attchPopupBind;
    }

    public RichPopup getAttchPopupBind() {
        return attchPopupBind;
    }

    public void addAttachment(ActionEvent actionEvent) {
        try {
            ADFContext.getCurrent().getPageFlowScope().put("isSaved", "N");
            String message = (String) executeMethod("addQuoteAttachment");
            if(!"Success".equals(message)){
                showPopupMessage(message, FacesMessage.SEVERITY_ERROR);
            }
            addPartialTrigger(getAttchHdrBind());
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void deleteAttachment(ActionEvent actionEvent) {
        try {
            ADFContext.getCurrent().getPageFlowScope().put("isSaved", "N");
            executeMethod("Delete");
            addPartialTrigger(getAttchHdrBind());
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void downloadQuoteAttachment(FacesContext facesContext, OutputStream outputStream) {        
        try {
            DCBindingContainer binding =
                (DCBindingContainer)BindingContext.getCurrent().getCurrentBindingsEntry();
            DCIteratorBinding bindingIterator =
                binding.findIteratorBinding("AttachmentsVO2Iterator");
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

    public void uploadFileVL(ValueChangeEvent valueChangeEvent) {
        valueChangeEvent.getComponent().processUpdates(FacesContext.getCurrentInstance());
        try {
            Map pageFlowScope = ADFContext.getCurrent().getPageFlowScope();

            try {
                pageFlowScope.put("quoteUploadedFileStream",((UploadedFile)valueChangeEvent.getNewValue()).getInputStream());
                pageFlowScope.put("quoteFileName",((UploadedFile)valueChangeEvent.getNewValue()).getFilename());
                pageFlowScope.put("quoteFileType",((UploadedFile)valueChangeEvent.getNewValue()).getContentType());
                
                String str = (String)executeMethod("uploadRentalQuoteAttach");
                if(!"Success".equals(str)){
                    showPopupMessage("Not a valid File", FacesMessage.SEVERITY_ERROR);
                }
                else {
                    ADFContext.getCurrent().getPageFlowScope().put("isSaved", "N");
                }
                
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            addPartialTrigger(getAttchHdrBind());
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setAttchHdrBind(RichPanelHeader attchHdrBind) {
        this.attchHdrBind = attchHdrBind;
    }

    public RichPanelHeader getAttchHdrBind() {
        return attchHdrBind;
    }

    public void confirmSubmitQuotation(ActionEvent actionEvent) {
        try 
        {
            String msg = (String) executeMethod("checkForQuoteLines");
            if(!("Success".equals(msg))) 
            {
                showPopupMessage(msg, FacesMessage.SEVERITY_ERROR);    
            }
            else
            {
                showPopup(getSubmitConfirmPopup());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void submitConfirmDL(DialogEvent dialogEvent) {
        try {
            if (dialogEvent.getOutcome() == DialogEvent.Outcome.yes) {
                String msg = (String) executeMethod("validateQuoteLines");
                if(!"Success".equals(msg)){
                    String msgs[] = msg.split("_");
                    for(int i = 0;i <msgs.length;i++){
                        showPopupMessage(msgs[i], FacesMessage.SEVERITY_ERROR);
                    }
                }else{
                    String message = (String) executeMethod("generateQuoteNumber");
                    if(!"Success".equals(message)){
                        showPopupMessage(message, FacesMessage.SEVERITY_ERROR);
                    }else{
                        save();
                        addPartialTrigger(getHeaderTotalAmtBind());
                        ADFContext.getCurrent().getPageFlowScope().put("isSaved", "Y");
                        Object msg1 = submitRQDocForApproval();
                        if ("SUCCESS".equalsIgnoreCase(msg1.toString())) {
                            showPopupMessage("Submitted for Approval", FacesMessage.SEVERITY_INFO);
                            save();
                        } else {
                            showPopupMessage(msg1.toString(), FacesMessage.SEVERITY_ERROR);
                        }
                        addPartialTrigger(getTrxnPageBind());
    //                    String message = (String) executeMethod("submitQuotation");
    //                    if(!"Success".equals(message)){
    //                        showPopupMessage(message, FacesMessage.SEVERITY_ERROR);
    //                    }else{
    //                        addPartialTrigger(getTrxnPageBind());
    //                    }
                    }
                }
            }
         }catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public String submitRQDocForApproval() {
        Object msg = executeMethod("callpkgForAMERQProcessSubmit");
        return msg != null ? msg.toString() : "";
    }

    public void setSubmitConfirmPopup(RichPopup submitConfirmPopup) {
        this.submitConfirmPopup = submitConfirmPopup;
    }

    public RichPopup getSubmitConfirmPopup() {
        return submitConfirmPopup;
    }

    public void setTrxnPageBind(RichPanelGroupLayout trxnPageBind) {
        this.trxnPageBind = trxnPageBind;
    }

    public RichPanelGroupLayout getTrxnPageBind() {
        return trxnPageBind;
    }

    public void confirmWithdrawQuote(ActionEvent actionEvent) {
        try {
            showPopup(getWithdrawConfirmPopup());
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setWithdrawConfirmPopup(RichPopup withdrawConfirmPopup) {
        this.withdrawConfirmPopup = withdrawConfirmPopup;
    }

    public RichPopup getWithdrawConfirmPopup() {
        return withdrawConfirmPopup;
    }

    public void withdrawQuoteDL(DialogEvent dialogEvent) {
        try {
            String message = (String) executeMethod("withdrawRQFromApproval");
            if(!"Success".equals(message)){
                showPopupMessage(message, FacesMessage.SEVERITY_ERROR);
            }else{
                addPartialTrigger(getTrxnPageBind());
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void quoteTypeVL(ValueChangeEvent valueChangeEvent) {
        try {
            valueChangeEvent.getComponent().processUpdates(FacesContext.getCurrentInstance());
            ADFContext.getCurrent().getPageFlowScope().put("isSaved", "N");
            String message = (String) executeMethod("quoteTypeChange");
            if(!"Success".equals(message)){
                showPopupMessage(message, FacesMessage.SEVERITY_ERROR);
            }else{
                addPartialTrigger(getSourceBuHdrBind());
                addPartialTrigger(getSrcDivHdrBind());
                addPartialTrigger(getReqBuHdrBind());
                addPartialTrigger(getCustomerTypeHdrBind());
                addPartialTrigger(getProjectHdrBind());
                addPartialTrigger(getDivisionHdrBind());
                addPartialTrigger(getDeptHdrBind());
                addPartialTrigger(getCustomerHdrBind());
                addPartialTrigger(getCustSiteHdrBind());
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setSourceBuHdrBind(RichInputComboboxListOfValues sourceBuHdrBind) {
        this.sourceBuHdrBind = sourceBuHdrBind;
    }

    public RichInputComboboxListOfValues getSourceBuHdrBind() {
        return sourceBuHdrBind;
    }

    public void confirmQuoteRevise(ActionEvent actionEvent) {
        try {
            showPopup(getReviseConfirmPopup());
         }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setReviseConfirmPopup(RichPopup reviseConfirmPopup) {
        this.reviseConfirmPopup = reviseConfirmPopup;
    }

    public RichPopup getReviseConfirmPopup() {
        return reviseConfirmPopup;
    }

    public void reviseQuoteConfirmDL(DialogEvent dialogEvent) {
        if(dialogEvent.getOutcome() == DialogEvent.Outcome.yes){
            try {
                String message = (String) executeMethod("reviseQuotation");
                if(!"Success".equals(message)){
                    showPopupMessage(message, FacesMessage.SEVERITY_ERROR);
                }                
                addPartialTrigger(getTrxnPageBind());
            }catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void reqBuVL(ValueChangeEvent valueChangeEvent) {
        try {
            ADFContext.getCurrent().getPageFlowScope().put("isSaved", "N");
            valueChangeEvent.getComponent().processUpdates(FacesContext.getCurrentInstance());
            String message = (String) executeMethod("quoteRequestingBuChange");
            if(!"Success".equals(message)){
                showPopupMessage(message, FacesMessage.SEVERITY_ERROR);
            }            
            addPartialTrigger(getCustomerTypeHdrBind());
            addPartialTrigger(getProjectHdrBind());
            addPartialTrigger(getDivisionHdrBind());
            addPartialTrigger(getDeptHdrBind());
            addPartialTrigger(getCustomerHdrBind());
            addPartialTrigger(getCustSiteHdrBind());
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void customerTypeVL(ValueChangeEvent valueChangeEvent) {
        valueChangeEvent.getComponent().processUpdates(FacesContext.getCurrentInstance());
        ADFContext.getCurrent().getPageFlowScope().put("isSaved", "N");
        try {
            String message = (String) executeMethod("quoteCustomerTypeChange");
            if(!"Success".equals(message)){
                showPopupMessage(message, FacesMessage.SEVERITY_ERROR);
            }            
            addPartialTrigger(getProjectHdrBind());
            addPartialTrigger(getDivisionHdrBind());
            addPartialTrigger(getDeptHdrBind());
            addPartialTrigger(getCustomerHdrBind());
            addPartialTrigger(getCustSiteHdrBind());
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void sourceBuVL(ValueChangeEvent valueChangeEvent) {
        valueChangeEvent.getComponent().processUpdates(FacesContext.getCurrentInstance());
        ADFContext.getCurrent().getPageFlowScope().put("isSaved", "N");
        try {
            String message = (String) executeMethod("quoteSourceBuChange");
            if(!"Success".equals(message)){
                showPopupMessage(message, FacesMessage.SEVERITY_ERROR);
            }
            addPartialTrigger(getSrcDivHdrBind());
            addPartialTrigger(getReqBuHdrBind());
            addPartialTrigger(getCustomerTypeHdrBind());
            addPartialTrigger(getProjectHdrBind());
            addPartialTrigger(getDivisionHdrBind());
            addPartialTrigger(getDeptHdrBind());
            addPartialTrigger(getCustomerHdrBind());
            addPartialTrigger(getCustSiteHdrBind());
            addPartialTrigger(getHiringInfoTblBind());
            addPartialTrigger(getAdditionalChargesTableBind());
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void sourceDivVL(ValueChangeEvent valueChangeEvent) {
        valueChangeEvent.getComponent().processUpdates(FacesContext.getCurrentInstance());
        ADFContext.getCurrent().getPageFlowScope().put("isSaved", "N");
        try {
            String message = (String) executeMethod("quoteSourceDivChange");
            if(!"Success".equals(message)){
                showPopupMessage(message, FacesMessage.SEVERITY_ERROR);
            }
            addPartialTrigger(getReqBuHdrBind());
            addPartialTrigger(getCustomerTypeHdrBind());
            addPartialTrigger(getProjectHdrBind());
            addPartialTrigger(getDivisionHdrBind());
            addPartialTrigger(getDeptHdrBind());
            addPartialTrigger(getCustomerHdrBind());
            addPartialTrigger(getCustSiteHdrBind());
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setSrcDivHdrBind(RichInputComboboxListOfValues srcDivHdrBind) {
        this.srcDivHdrBind = srcDivHdrBind;
    }

    public RichInputComboboxListOfValues getSrcDivHdrBind() {
        return srcDivHdrBind;
    }

    public void setReqBuHdrBind(RichInputComboboxListOfValues reqBuHdrBind) {
        this.reqBuHdrBind = reqBuHdrBind;
    }

    public RichInputComboboxListOfValues getReqBuHdrBind() {
        return reqBuHdrBind;
    }

    public void setCustomerTypeHdrBind(RichInputComboboxListOfValues customerTypeHdrBind) {
        this.customerTypeHdrBind = customerTypeHdrBind;
    }

    public RichInputComboboxListOfValues getCustomerTypeHdrBind() {
        return customerTypeHdrBind;
    }

    public void setProjectHdrBind(RichInputComboboxListOfValues projectHdrBind) {
        this.projectHdrBind = projectHdrBind;
    }

    public RichInputComboboxListOfValues getProjectHdrBind() {
        return projectHdrBind;
    }

    public void setDivisionHdrBind(RichInputComboboxListOfValues divisionHdrBind) {
        this.divisionHdrBind = divisionHdrBind;
    }

    public RichInputComboboxListOfValues getDivisionHdrBind() {
        return divisionHdrBind;
    }

    public void setDeptHdrBind(RichInputComboboxListOfValues deptHdrBind) {
        this.deptHdrBind = deptHdrBind;
    }

    public RichInputComboboxListOfValues getDeptHdrBind() {
        return deptHdrBind;
    }

    public void setCustomerHdrBind(RichInputComboboxListOfValues customerHdrBind) {
        this.customerHdrBind = customerHdrBind;
    }

    public RichInputComboboxListOfValues getCustomerHdrBind() {
        return customerHdrBind;
    }

    public void setCustSiteHdrBind(RichInputComboboxListOfValues custSiteHdrBind) {
        this.custSiteHdrBind = custSiteHdrBind;
    }

    public RichInputComboboxListOfValues getCustSiteHdrBind() {
        return custSiteHdrBind;
    }

    public void hiringBasisVL(ValueChangeEvent valueChangeEvent) {
        try {
            valueChangeEvent.getComponent().processUpdates(FacesContext.getCurrentInstance());
             ADFContext.getCurrent().getPageFlowScope().put("isSaved", "N");
            String message = (String) executeMethod("quoteHiringBasisChange");
            if(!"Success".equals(message)){
                showPopupMessage(message, FacesMessage.SEVERITY_ERROR);
            }else{
                addPartialTrigger(getStandardRateBind());
                addPartialTrigger(getOt1RateBind());
                addPartialTrigger(getOt2RateBind());
                addPartialTrigger(getLineValueBind());
                addPartialTrigger(getUnitRateBind());
                addPartialTrigger(getMinChargeUnitBind());
            }
         }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void operatorOptionVL(ValueChangeEvent valueChangeEvent) {
        try {
             valueChangeEvent.getComponent().processUpdates(FacesContext.getCurrentInstance());
             ADFContext.getCurrent().getPageFlowScope().put("isSaved", "N");
            String message = (String) executeMethod("quoteHiringBasisChange");
            if(!"Success".equals(message)){
                showPopupMessage(message, FacesMessage.SEVERITY_ERROR);
            }else{
                addPartialTrigger(getStandardRateBind());
                addPartialTrigger(getOt1RateBind());
                addPartialTrigger(getOt2RateBind());
                addPartialTrigger(getLineValueBind());
                addPartialTrigger(getUnitRateBind());
            }
         }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void fuelOptionVL(ValueChangeEvent valueChangeEvent) {
        try {
             valueChangeEvent.getComponent().processUpdates(FacesContext.getCurrentInstance());
             ADFContext.getCurrent().getPageFlowScope().put("isSaved", "N");
            String message = (String) executeMethod("quoteHiringBasisChange");
            if(!"Success".equals(message)){
                showPopupMessage(message, FacesMessage.SEVERITY_ERROR);
            }else{
                addPartialTrigger(getStandardRateBind());
                addPartialTrigger(getOt1RateBind());
                addPartialTrigger(getOt2RateBind());
                addPartialTrigger(getLineValueBind());
                addPartialTrigger(getUnitRateBind());
            }
         }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void standardRateVL(ValueChangeEvent valueChangeEvent) {
        try {
            ADFContext.getCurrent().getPageFlowScope().put("isSaved", "N");
            oracle.jbo.domain.Number oldVal = (oracle.jbo.domain.Number) valueChangeEvent.getOldValue();
            oracle.jbo.domain.Number newVal = (oracle.jbo.domain.Number) valueChangeEvent.getNewValue();
            if(newVal.compareTo(oldVal) < 0 && newVal.compareTo(0) > 0){
                ADFContext.getCurrent().getPageFlowScope().put("RateType", "Standard");
                ADFContext.getCurrent().getPageFlowScope().put("oldRate", oldVal);
                ADFContext.getCurrent().getPageFlowScope().put("newRate", newVal);
                showPopup(getRateConfirmPopup());
            }else{
                valueChangeEvent.getComponent().processUpdates(FacesContext.getCurrentInstance());
                addPartialTrigger(getLineValueBind());
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void ot1RateVL(ValueChangeEvent valueChangeEvent) {
        try {
            ADFContext.getCurrent().getPageFlowScope().put("isSaved", "N");
            oracle.jbo.domain.Number oldVal = (oracle.jbo.domain.Number) valueChangeEvent.getOldValue();
            oracle.jbo.domain.Number newVal = (oracle.jbo.domain.Number) valueChangeEvent.getNewValue();
            if(newVal.compareTo(oldVal) < 0 && newVal.compareTo(0) > 0){
                ADFContext.getCurrent().getPageFlowScope().put("RateType", "OT1");
                ADFContext.getCurrent().getPageFlowScope().put("oldRate", oldVal);
                ADFContext.getCurrent().getPageFlowScope().put("newRate", newVal);
                showPopup(getRateConfirmPopup());
            }else{
                valueChangeEvent.getComponent().processUpdates(FacesContext.getCurrentInstance());
                addPartialTrigger(getLineValueBind());
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void ot2RateVL(ValueChangeEvent valueChangeEvent) {
        try {
            ADFContext.getCurrent().getPageFlowScope().put("isSaved", "N");
            oracle.jbo.domain.Number oldVal = (oracle.jbo.domain.Number) valueChangeEvent.getOldValue();
            oracle.jbo.domain.Number newVal = (oracle.jbo.domain.Number) valueChangeEvent.getNewValue();
            if(newVal.compareTo(oldVal) < 0 && newVal.compareTo(0) > 0){
                ADFContext.getCurrent().getPageFlowScope().put("RateType", "OT2");
                ADFContext.getCurrent().getPageFlowScope().put("oldRate", oldVal);
                ADFContext.getCurrent().getPageFlowScope().put("newRate", newVal);
                showPopup(getRateConfirmPopup());
            }else{
                valueChangeEvent.getComponent().processUpdates(FacesContext.getCurrentInstance());
                addPartialTrigger(getLineValueBind());
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void ratesConfirmDL(DialogEvent dialogEvent) {
        try {
            oracle.jbo.domain.Number value = null;
            if (dialogEvent.getOutcome() == DialogEvent.Outcome.yes) {
                value = (oracle.jbo.domain.Number) ADFContext.getCurrent()
                                                             .getPageFlowScope()
                                                             .get("newRate");
            } else {
                value = (oracle.jbo.domain.Number) ADFContext.getCurrent()
                                                             .getPageFlowScope()
                                                             .get("oldRate");
            }
            DCBindingContainer binding = (DCBindingContainer) BindingContext.getCurrent().getCurrentBindingsEntry();
            DCIteratorBinding bindingIterator = binding.findIteratorBinding("RentalQuoteLinesVO1Iterator");
            RowSetIterator row = bindingIterator.getRowSetIterator();
            if (bindingIterator != null) {
                RentalQuoteLinesVORowImpl currentRow = (RentalQuoteLinesVORowImpl) row.getCurrentRow();
                if (currentRow != null) {
                    if ("Standard".equals(ADFContext.getCurrent()
                                                    .getPageFlowScope()
                                                    .get("RateType"))) {
                        currentRow.setStandardRate(value);
                        getStandardRateBind().setAutoSubmit(true);
                        addPartialTrigger(getStandardRateBind());
                    } else if ("OT1".equals(ADFContext.getCurrent()
                                                      .getPageFlowScope()
                                                      .get("RateType"))) {
                        currentRow.setOt1Rate(value);
                        getOt1RateBind().setAutoSubmit(true);
                        addPartialTrigger(getOt1RateBind());
                    } else if ("OT2".equals(ADFContext.getCurrent()
                                                      .getPageFlowScope()
                                                      .get("RateType"))) {
                        currentRow.setOt2Rate(value);
                        getOt2RateBind().setAutoSubmit(true);
                        addPartialTrigger(getOt2RateBind());
                    }
                }
            }
         }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setStandardRateBind(RichInputText standardRateBind) {
        this.standardRateBind = standardRateBind;
    }

    public RichInputText getStandardRateBind() {
        return standardRateBind;
    }

    public void setOt1RateBind(RichInputText ot1RateBind) {
        this.ot1RateBind = ot1RateBind;
    }

    public RichInputText getOt1RateBind() {
        return ot1RateBind;
    }

    public void setOt2RateBind(RichInputText ot2RateBind) {
        this.ot2RateBind = ot2RateBind;
    }

    public RichInputText getOt2RateBind() {
        return ot2RateBind;
    }

    public void setLineValueBind(RichInputText lineValueBind) {
        this.lineValueBind = lineValueBind;
    }

    public RichInputText getLineValueBind() {
        return lineValueBind;
    }

    public void setRateConfirmPopup(RichPopup rateConfirmPopup) {
        this.rateConfirmPopup = rateConfirmPopup;
    }

    public RichPopup getRateConfirmPopup() {
        return rateConfirmPopup;
    }

    public void setMinChargeUnitBind(RichInputComboboxListOfValues minChargeUnitBind) {
        this.minChargeUnitBind = minChargeUnitBind;
    }

    public RichInputComboboxListOfValues getMinChargeUnitBind() {
        return minChargeUnitBind;
    }

    public void setCancelConfirmPopupBind(RichPopup cancelConfirmPopupBind) {
        this.cancelConfirmPopupBind = cancelConfirmPopupBind;
    }

    public RichPopup getCancelConfirmPopupBind() {
        return cancelConfirmPopupBind;
    }

    public void cancelConfirmationDL(DialogEvent dialogEvent) {
        ADFContext.getCurrent().getPageFlowScope().put("isSaved", "Y");
        if(dialogEvent.getOutcome() == DialogEvent.Outcome.yes){
            String message = (String) executeMethod("cancelQuotation");
            if(!"Success".equals(message)){
                showPopupMessage(message, FacesMessage.SEVERITY_ERROR);
            }else{
                save();
                addPartialTrigger(getTrxnPageBind());
            }
        }
    }

    public void validFromVL(ValueChangeEvent valueChangeEvent) {
        ADFContext.getCurrent().getPageFlowScope().put("isSaved", "N");
        valueChangeEvent.getComponent().processUpdates(FacesContext.getCurrentInstance());
        try {
            String message = (String) executeMethod("quoteValidFromChange");
            if(!"Success".equals(message)){
                showPopupMessage(message, FacesMessage.SEVERITY_ERROR);
                addPartialTrigger(getValidFromBind());
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setValidFromBind(RichInputDate validFromBind) {
        this.validFromBind = validFromBind;
    }

    public RichInputDate getValidFromBind() {
        return validFromBind;
    }

    public void hdrValueChange(ValueChangeEvent valueChangeEvent) {
        valueChangeEvent.getComponent().processUpdates(FacesContext.getCurrentInstance());
        ADFContext.getCurrent().getPageFlowScope().put("isSaved", "N");
    }

    public void setCloseConfirmPopupBind(RichPopup closeConfirmPopupBind) {
        this.closeConfirmPopupBind = closeConfirmPopupBind;
    }

    public RichPopup getCloseConfirmPopupBind() {
        return closeConfirmPopupBind;
    }

    public void closeConfirmDL(DialogEvent dialogEvent) {
        try {
            if(dialogEvent.getOutcome() == DialogEvent.Outcome.yes){
                cancel();
                ADFContext.getCurrent().getPageFlowScope().put("isSaved", "Y");
                navigateNew("Done");
                executeMethod("setQuotationSearch");
            }else{
                getCloseConfirmPopupBind().hide();
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void showAttachments(ActionEvent actionEvent) {
        try {
            showPopup(getAttchPopupBind());
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void searchSrcBuVL(ValueChangeEvent valueChangeEvent) {
        valueChangeEvent.getComponent().processUpdates(FacesContext.getCurrentInstance());
        try {
            String message = (String) executeMethod("quoteSearchSourceBuChange");
            if(!"Success".equals(message)){
                showPopupMessage(message, FacesMessage.SEVERITY_ERROR);
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setDeleteButtonBind(RichLink deleteButtonBind) {
        this.deleteButtonBind = deleteButtonBind;
    }

    public RichLink getDeleteButtonBind() {
        return deleteButtonBind;
    }

    public void cancelQuotation(ActionEvent actionEvent) {
        try {
            showPopup(getCancelConfirmPopupBind());
        }catch (Exception e) {
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

    public void RQactionHistoryAL(ActionEvent actionEvent) 
    {
        try 
        {
            executeMethod("setActionHistoryForRQDocument");
            showPopup(getRqactionHistoryPopupBindgs());
        }
        catch(Exception e) 
        {
            e.printStackTrace();    
        }
    }

    public void setRqactionHistoryPopupBindgs(RichPopup rqactionHistoryPopupBindgs) {
        this.rqactionHistoryPopupBindgs = rqactionHistoryPopupBindgs;
    }

    public RichPopup getRqactionHistoryPopupBindgs() {
        return rqactionHistoryPopupBindgs;
    }

    public void setTemplateBindgs(RichPopup templateBindgs) {
        this.templateBindgs = templateBindgs;
    }

    public RichPopup getTemplateBindgs() {
        return templateBindgs;
    }

    public void addTemplateAL(ActionEvent actionEvent) 
    {
        try 
        {
            ResetUtils.reset(getTemplateBindgs());
            executeMethod("createTransQuoteTemplateSearch");
            showPopup(getTemplateBindgs());
        }
        catch(Exception e) 
        {
            e.printStackTrace();    
        }
    }

    public void quoteTemplateDL(DialogEvent dialogEvent) 
    {
        try 
        {
            if(dialogEvent.getOutcome() == DialogEvent.Outcome.ok) 
            {
                executeMethod("setQuoteTermsConditions");
                getTemplateBindgs().hide();
                addPartialTrigger(getTermsConditionsBindgs());
            }            
        }
        catch(Exception e) 
        {
            e.printStackTrace();    
        }
    }

    public void setTermsConditionsBindgs(RichTextEditor termsConditionsBindgs) {
        this.termsConditionsBindgs = termsConditionsBindgs;
    }

    public RichTextEditor getTermsConditionsBindgs() {
        return termsConditionsBindgs;
    }

    public void setHeaderTotalAmtBind(RichOutputText headerTotalAmtBind) {
        this.headerTotalAmtBind = headerTotalAmtBind;
    }

    public RichOutputText getHeaderTotalAmtBind() {
        return headerTotalAmtBind;
    }

    public void unitRateVL(ValueChangeEvent valueChangeEvent) {
        valueChangeEvent.getComponent().processUpdates(FacesContext.getCurrentInstance());
        try {
            String message = (String) executeMethod("quoteUnitRateChange");
            if(!"Success".equals(message)){
                showPopupMessage(message, FacesMessage.SEVERITY_ERROR);
            }
            addPartialTrigger(getStandardRateBind());
            addPartialTrigger(getLineValueBind());
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setUnitRateBind(RichInputText unitRateBind) {
        this.unitRateBind = unitRateBind;
    }

    public RichInputText getUnitRateBind() {
        return unitRateBind;
    }

    public void taxRateCodeVL(ValueChangeEvent valueChangeEvent) 
    {   
        try 
        {
            valueChangeEvent.getComponent().processUpdates(FacesContext.getCurrentInstance());
            //ADFContext.getCurrent().getPageFlowScope().put("billChangesSaved", "N");
            String msg = (String) executeMethod("setRentalQuotesLinesTaxRate");
            if(!("Success".equals(msg))) 
            {
                showPopupMessage(msg, FacesMessage.SEVERITY_ERROR);    
            }
            else {
                addPartialTrigger(getTrxnPageBind());
            }
        }
        catch(Exception e) 
        {
            e.printStackTrace();    
        }
    }

    public void interDivisionVL(ValueChangeEvent valueChangeEvent) {
        valueChangeEvent.getComponent().processUpdates(FacesContext.getCurrentInstance());
        try {
            ADFContext.getCurrent().getPageFlowScope().put("isSaved", "N");
            String message = (String) executeMethod("rqInterDivisionCheck");
            if(!"Success".equals(message)){
                showPopupMessage(message, FacesMessage.SEVERITY_ERROR);
                addPartialTrigger(getDivisionHdrBind());
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void rentalQuotationReportAL(FacesContext facesContext, OutputStream outputStream) 
    {
        try {
                Object dataBytesObj = null;
                dataBytesObj = executeMethod("getrentalQuotationXmlData");
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

    public void generateContract(ActionEvent actionEvent) {
        try {
            showPopup(getGenerateContractBind());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void generateContractDL(DialogEvent dialogEvent) {
        if(dialogEvent.getOutcome() == DialogEvent.Outcome.yes){
            try {
                String message = (String) executeMethod("generateContract");
                if(!"Success".equals(message)){
                    showPopupMessage(message, FacesMessage.SEVERITY_ERROR);
                }
                addPartialTrigger(getTrxnPageBind());
            }catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void setGenerateContractBind(RichPopup generateContractBind) {
        this.generateContractBind = generateContractBind;
    }

    public RichPopup getGenerateContractBind() {
        return generateContractBind;
    }

    public void setAdditionalChargesTableBind(RichTable additionalChargesTableBind) {
        this.additionalChargesTableBind = additionalChargesTableBind;
    }

    public RichTable getAdditionalChargesTableBind() {
        return additionalChargesTableBind;
    }

    public void setQuantiyBind(RichInputText quantiyBind) {
        this.quantiyBind = quantiyBind;
    }

    public RichInputText getQuantiyBind() {
        return quantiyBind;
    }

    public void setUnitAmountBind(RichInputText unitAmountBind) {
        this.unitAmountBind = unitAmountBind;
    }

    public RichInputText getUnitAmountBind() {
        return unitAmountBind;
    }

    public void hdrCustomerVL(ValueChangeEvent valueChangeEvent) {
        valueChangeEvent.getComponent().processUpdates(FacesContext.getCurrentInstance());
        try {
            String message = (String) executeMethod("quoteCustomerChange");
            if(!"Success".equals(message)){
                showPopupMessage(message, FacesMessage.SEVERITY_ERROR);
            }else{
                addPartialTrigger(getSalesPersonBind());    
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setSalesPersonBind(RichInputComboboxListOfValues salesPersonBind) {
        this.salesPersonBind = salesPersonBind;
    }

    public RichInputComboboxListOfValues getSalesPersonBind() {
        return salesPersonBind;
    }
}
