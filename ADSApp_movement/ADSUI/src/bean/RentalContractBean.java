package bean;

import bean.notification.NotificationBean;

import java.io.InputStream;
import java.io.OutputStream;

import java.util.Map;

import javax.faces.event.ActionEvent;
import javax.faces.application.FacesMessage;

import javax.faces.context.FacesContext;
import javax.faces.event.ValueChangeEvent;

import model.view.AttachmentsVORowImpl;

import model.view.RentalContractChargesVORowImpl;
import model.view.RentalContractLinesVORowImpl;
import model.view.RentalQuoteChargesVORowImpl;
import model.view.RentalQuoteLinesVORowImpl;

import oracle.adf.model.BindingContext;
import oracle.adf.model.binding.DCBindingContainer;
import oracle.adf.model.binding.DCIteratorBinding;
import oracle.adf.view.rich.component.rich.RichDialog;
import oracle.adf.view.rich.component.rich.RichPopup;
import oracle.adf.view.rich.component.rich.data.RichTable;
import oracle.adf.share.ADFContext;
import oracle.adf.view.rich.component.rich.input.RichInputComboboxListOfValues;
import oracle.adf.view.rich.component.rich.input.RichInputDate;
import oracle.adf.view.rich.component.rich.input.RichInputText;
import oracle.adf.view.rich.component.rich.input.RichSelectBooleanCheckbox;
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


public class RentalContractBean extends CommonBean{
    private RichTable searchTblBind;
    private RichTable contractLinesTblBind;
    private RichDialog attchPopupBind;
    private RichPopup submitConfirmPopupBind;
    private RichPopup attachmentPopupBind;
    private RichPopup cancelConfirmPopupBind;
    private RichPopup reviseConfirmPopupBind;
    private RichPopup withdrawConfirmPopupBind;
    private RichTable attachmentTblBind;
    private RichPanelHeader attchHdrBind;
    private RichInputComboboxListOfValues contractTypeBind;
    private RichInputComboboxListOfValues srcBuHdrBind;
    private RichInputComboboxListOfValues srcDivHdrBind;
    private RichInputComboboxListOfValues reqBuHdrBind;
    private RichInputComboboxListOfValues contractSrcHdrBind;
    private RichInputComboboxListOfValues referenceNoHdrBind;
    private RichInputComboboxListOfValues customerTypeHdrBind;
    private RichInputComboboxListOfValues projectHdrBind;
    private RichInputComboboxListOfValues divisionHdrBind;
    private RichInputComboboxListOfValues deptHdrBind;
    private RichInputComboboxListOfValues customerHdrBind;
    private RichInputComboboxListOfValues customerSiteHdrBind;
    private RichTable populateTblBind;
    private RichPopup linesPopulatePopupBind;
    private RichInputComboboxListOfValues lnsCategoryBind;
    private RichInputComboboxListOfValues hiringBasisBind;
    private RichInputComboboxListOfValues operatorOptionBind;
    private RichInputComboboxListOfValues furlOptionBind;
    private RichInputDate onHireDateBind;
    private RichInputDate offHireDateBind;
    private RichInputText standardRateBind;
    private RichInputText ot1RateBind;
    private RichInputText ot2RateBind;
    private RichInputText lineValueBind;
    private RichInputComboboxListOfValues minChargeUnitBind;
    private RichPopup closePageConfirmPopup;
    private RichPanelGroupLayout trxnPageBind;
    private RichInputComboboxListOfValues chargeTypeBind;
    private RichInputComboboxListOfValues billingBind;
    private RichInputText chargeAmountBind;
    private RichInputComboboxListOfValues clauseBind;
    private RichSelectBooleanCheckbox selectAllBind;
    private RichTable chargesTblBind;
    private RichPopup chargesSaveConfirmPopupBind;
    private RichLink chargeDeleteBind;
    private RichLink hiringInfoDeleteBind;
    private RichPopup rcactionHistoryPopupBindgs;
    private RichOutputText headerTotalAmtBind;
    private RichPopup templatePopupBindgs;
    private RichInputText termsConditionsBindgs;
    private RichInputText unitRateBind;
    private RichTextEditor termConditionsBind;
    private RichInputComboboxListOfValues custLocationBind;
    private RichInputText quantityBind;
    private RichInputText unitAmountBind;

    public RentalContractBean() {
        super();
    }
    
    public void setSearchAttributes(){
        try {
            Map pageFlowScope = ADFContext.getCurrent().getPageFlowScope();
            pageFlowScope.put("rcContractType", getEL("#{bindings.TransContractType.inputValue}"));
            pageFlowScope.put("rcSrcBu", getEL("#{bindings.TransSrcBu.inputValue}"));
            pageFlowScope.put("rcSrcDivRequired", getEL("#{bindings.TransSrcDivRequired.inputValue}"));
            pageFlowScope.put("rcSrcDivSegmentNum", getEL("#{bindings.TransSrcDivSegmentNum.inputValue}"));
            pageFlowScope.put("rcSrcDeptSegmentNum", getEL("#{bindings.TransSrcDeptSegmentNum.inputValue}"));
            pageFlowScope.put("rcSrcBuId", getEL("#{bindings.TransSrcBuId.inputValue}"));
            pageFlowScope.put("rcSrcDivision", getEL("#{bindings.TransSrcDivsion.inputValue}"));
            pageFlowScope.put("rcSrcDivFlexValId", getEL("#{bindings.TransSrcDivFlexValId.inputValue}"));
            pageFlowScope.put("rcContractNum", getEL("#{bindings.TransContractNumber.inputValue}"));
            pageFlowScope.put("rcQuotationNum", getEL("#{bindings.TransQuotationNum.inputValue}"));
            pageFlowScope.put("rcEffectiveFrom", getEL("#{bindings.TransEffectiveFrom.inputValue}"));
            pageFlowScope.put("rcEffectiveTo", getEL("#{bindings.TransEffectiveTo.inputValue}"));
            pageFlowScope.put("rcCustomerType", getEL("#{bindings.TransCustomerType.inputValue}"));
            pageFlowScope.put("rcCustomerTypeCode", getEL("#{bindings.TransCustomerTypeCode.inputValue}"));
            pageFlowScope.put("rcProject", getEL("#{bindings.TransProject.inputValue}"));
            pageFlowScope.put("rcProjectId", getEL("#{bindings.TransProjectId.inputValue}"));
            pageFlowScope.put("rcDivision", getEL("#{bindings.TransDivision.inputValue}"));
            pageFlowScope.put("rcDivFlexValId", getEL("#{bindings.TransDivFlexValId.inputValue}"));
            pageFlowScope.put("rcDepartment", getEL("#{bindings.TransDepartment.inputValue}"));
            pageFlowScope.put("rcDeptFlexValId", getEL("#{bindings.TransDeptFlexValId.inputValue}"));
            pageFlowScope.put("rcContractStatus", getEL("#{bindings.TransContractStatus.inputValue}"));
            pageFlowScope.put("rcContractStatusCode", getEL("#{bindings.TransContractStatusCode.inputValue}"));
            pageFlowScope.put("rcCustomerName", getEL("#{bindings.TransCustomerName.inputValue}"));
            pageFlowScope.put("rcCustomerId", getEL("#{bindings.TransCustomerId.inputValue}"));
            pageFlowScope.put("rcCustomerSite", getEL("#{bindings.TransCustomerSite.inputValue}"));
            pageFlowScope.put("rcSiteUseId", getEL("#{bindings.TransSiteUseId.inputValue}"));
            pageFlowScope.put("rcReqBu", getEL("#{bindings.TransReqBu.inputValue}"));
            pageFlowScope.put("rcReqBuId", getEL("#{bindings.TransReqBuId.inputValue}"));
            pageFlowScope.put("rcReqDeptSegmentNum", getEL("#{bindings.TransReqDeptSegmentNum.inputValue}"));
            pageFlowScope.put("rcReqDivSegmentNum", getEL("#{bindings.TransReqDivSegmentNum.inputValue}"));
            
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void searchRentalContracts(ActionEvent actionEvent) {
        try {
            String message = (String) executeMethod("searchRentalContracts");
            if(!"Success".equals(message)){
                showPopupMessage(message, FacesMessage.SEVERITY_ERROR);
            }
            addPartialTrigger(getSearchTblBind());
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void resetRentalContracts(ActionEvent actionEvent) {
        try {
            String message = (String) executeMethod("resetRentalContracts");
            if(!"Success".equals(message)){
                showPopupMessage(message, FacesMessage.SEVERITY_ERROR);
            }
            addPartialTrigger(getSearchTblBind());
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void createRentalContract(ActionEvent actionEvent) {
        try {
            setSearchAttributes();
            String message = (String) executeMethod("createRentalContract");
            if(!"Success".equals(message)){
                showPopupMessage(message, FacesMessage.SEVERITY_ERROR);
            }else{
                ADFContext.getCurrent().getPageFlowScope().put("contractEditFlag", "Y");
                ADFContext.getCurrent().getPageFlowScope().put("isSaved", "N");
                navigateNew("Details");
            }            
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void editRentalContract(ActionEvent actionEvent) {
        try {
            setSearchAttributes();
            String message = (String) executeMethod("editRentalContract");
            if(!"Success".equals(message)){
                showPopupMessage(message, FacesMessage.SEVERITY_ERROR);
            }else{
                ADFContext.getCurrent().getPageFlowScope().put("isSaved", "Y");
                navigateNew("Details");
            }            
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setSearchTblBind(RichTable searchTblBind) {
        this.searchTblBind = searchTblBind;
    }

    public RichTable getSearchTblBind() {
        return searchTblBind;
    }

    public void contractTypeVL(ValueChangeEvent valueChangeEvent) {
        valueChangeEvent.getComponent().processUpdates(FacesContext.getCurrentInstance());
        ADFContext.getCurrent().getPageFlowScope().put("isSaved", "N");
        try {
            String message = (String) executeMethod("contractTypeChange");
            if(!"Success".equals(message)){
                showPopupMessage(message, FacesMessage.SEVERITY_ERROR);
            }else{
                addPartialTrigger(getSrcBuHdrBind());
                addPartialTrigger(getSrcDivHdrBind());
                addPartialTrigger(getReqBuHdrBind());
                addPartialTrigger(getContractSrcHdrBind());
                addPartialTrigger(getReferenceNoHdrBind());
                addPartialTrigger(getCustomerTypeHdrBind());
                addPartialTrigger(getProjectHdrBind());
                addPartialTrigger(getDivisionHdrBind());
                addPartialTrigger(getDeptHdrBind());
                addPartialTrigger(getCustomerHdrBind());
                addPartialTrigger(getCustomerSiteHdrBind());
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void sourceBuVL(ValueChangeEvent valueChangeEvent) {
        valueChangeEvent.getComponent().processUpdates(FacesContext.getCurrentInstance());
        ADFContext.getCurrent().getPageFlowScope().put("isSaved", "N");
        try {
            String message = (String) executeMethod("contractSourceBuChange");
            if(!"Success".equals(message)){
                showPopupMessage(message, FacesMessage.SEVERITY_ERROR);
            }
            addPartialTrigger(getSrcDivHdrBind());
            addPartialTrigger(getReqBuHdrBind());
            addPartialTrigger(getContractSrcHdrBind());
            addPartialTrigger(getReferenceNoHdrBind());
            addPartialTrigger(getCustomerTypeHdrBind());
            addPartialTrigger(getProjectHdrBind());
            addPartialTrigger(getDivisionHdrBind());
            addPartialTrigger(getDeptHdrBind());
            addPartialTrigger(getCustomerHdrBind());
            addPartialTrigger(getCustomerSiteHdrBind());
            addPartialTrigger(getContractLinesTblBind());
            addPartialTrigger(getChargesTblBind());
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public void srcDivisionVL(ValueChangeEvent valueChangeEvent) {
        valueChangeEvent.getComponent().processUpdates(FacesContext.getCurrentInstance());
        ADFContext.getCurrent().getPageFlowScope().put("isSaved", "N");
        try {
            String message = (String) executeMethod("contractSourceDivChange");
            if(!"Success".equals(message)){
                showPopupMessage(message, FacesMessage.SEVERITY_ERROR);
            }
            addPartialTrigger(getReqBuHdrBind());
            addPartialTrigger(getContractSrcHdrBind());
            addPartialTrigger(getReferenceNoHdrBind());
            addPartialTrigger(getCustomerTypeHdrBind());
            addPartialTrigger(getProjectHdrBind());
            addPartialTrigger(getDivisionHdrBind());
            addPartialTrigger(getDeptHdrBind());
            addPartialTrigger(getCustomerHdrBind());
            addPartialTrigger(getCustomerSiteHdrBind());
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public void reqBuVL(ValueChangeEvent valueChangeEvent) {
        valueChangeEvent.getComponent().processUpdates(FacesContext.getCurrentInstance());
        ADFContext.getCurrent().getPageFlowScope().put("isSaved", "N");
        try {
            String message = (String) executeMethod("contractReqBuChange");
            if(!"Success".equals(message)){
                showPopupMessage(message, FacesMessage.SEVERITY_ERROR);
            }
            addPartialTrigger(getContractSrcHdrBind());
            addPartialTrigger(getReferenceNoHdrBind());
            addPartialTrigger(getCustomerTypeHdrBind());
            addPartialTrigger(getProjectHdrBind());
            addPartialTrigger(getDivisionHdrBind());
            addPartialTrigger(getDeptHdrBind());
            addPartialTrigger(getCustomerHdrBind());
            addPartialTrigger(getCustomerSiteHdrBind());
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public void contractSourceVL(ValueChangeEvent valueChangeEvent) {
        valueChangeEvent.getComponent().processUpdates(FacesContext.getCurrentInstance());
        ADFContext.getCurrent().getPageFlowScope().put("isSaved", "N");
        try {
            String message = (String) executeMethod("contractSourceChange");
            if(!"Success".equals(message)){
                showPopupMessage(message, FacesMessage.SEVERITY_ERROR);
            }            
            addPartialTrigger(getReferenceNoHdrBind());
            addPartialTrigger(getCustomerTypeHdrBind());
            addPartialTrigger(getProjectHdrBind());
            addPartialTrigger(getDivisionHdrBind());
            addPartialTrigger(getDeptHdrBind());
            addPartialTrigger(getCustomerHdrBind());
            addPartialTrigger(getCustomerSiteHdrBind());
        }catch(Exception e){
            //TODO
            e.printStackTrace();
        }
    }

    public void referenceNumVL(ValueChangeEvent valueChangeEvent) {
        valueChangeEvent.getComponent().processUpdates(FacesContext.getCurrentInstance());
        ADFContext.getCurrent().getPageFlowScope().put("isSaved", "N");
        try {
            String message = (String) executeMethod("contractReferenceNumChange");
            if(!"Success".equals(message)){
                showPopupMessage(message, FacesMessage.SEVERITY_ERROR);
            }
            if("Y".equals(getEL("#{bindings.TransLinesCount.inputValue}"))){
                showPopupMessage("message", FacesMessage.SEVERITY_ERROR);
            }
        }catch (Exception e) {
            //TODO
            e.printStackTrace();
        }
    }

    public void customerTypeVL(ValueChangeEvent valueChangeEvent) {
        valueChangeEvent.getComponent().processUpdates(FacesContext.getCurrentInstance());
        ADFContext.getCurrent().getPageFlowScope().put("isSaved", "N");
        try {
            String message = (String) executeMethod("contractCustomerTypeChange");
            if(!"Success".equals(message)){
                showPopupMessage(message, FacesMessage.SEVERITY_ERROR);
            }
            addPartialTrigger(getProjectHdrBind());
            addPartialTrigger(getDivisionHdrBind());
            addPartialTrigger(getDeptHdrBind());
            addPartialTrigger(getCustomerHdrBind());
            addPartialTrigger(getCustomerSiteHdrBind());
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public void setContractLinesTblBind(RichTable contractLinesTblBind) {
        this.contractLinesTblBind = contractLinesTblBind;
    }

    public RichTable getContractLinesTblBind() {
        return contractLinesTblBind;
    }

    public void populateLinesAL(ActionEvent actionEvent) {
        try {
            String message = (String) executeMethod("getContractRefLines");
            if(!"Success".equals(message)){
                showPopupMessage(message, FacesMessage.SEVERITY_ERROR);
            }else{
                showPopup(getLinesPopulatePopupBind());
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void addHiringInfoAL(ActionEvent actionEvent) {
        try {
            String message = (String) executeMethod("addContractHireInfo");
            ADFContext.getCurrent().getPageFlowScope().put("isSaved", "N");
            if(!"Success".equals(message)){
                showPopupMessage(message, FacesMessage.SEVERITY_ERROR);
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void deleteHiringInfoAL(ActionEvent actionEvent) {
        try {
            String message = (String) executeMethod("deleteContractHireInfo");
            ADFContext.getCurrent().getPageFlowScope().put("isSaved", "N");
            if(!"Success".equals(message)){
                showPopupMessage(message, FacesMessage.SEVERITY_ERROR);
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void addChargeAL(ActionEvent actionEvent) {
        try {
            if("N".equals(ADFContext.getCurrent().getPageFlowScope().get("isSaved"))){
                showPopup(getChargesSaveConfirmPopupBind());
            }else{
                String message = (String) executeMethod("addContractCharge");
                ADFContext.getCurrent().getPageFlowScope().put("isSaved", "N");
                if(!"Success".equals(message)){
                    showPopupMessage(message, FacesMessage.SEVERITY_ERROR);
                }
                addPartialTrigger(getChargeDeleteBind());
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void deleteChargeAL(ActionEvent actionEvent) {
        try {
            String message = (String) executeMethod("deleteContractCharge");
            ADFContext.getCurrent().getPageFlowScope().put("isSaved", "N");
            if(!"Success".equals(message)){
                showPopupMessage(message, FacesMessage.SEVERITY_ERROR);
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void addContractClause(ActionEvent actionEvent) {
        try {
            String message = (String) executeMethod("addContractClause");
            ADFContext.getCurrent().getPageFlowScope().put("isSaved", "N");
            if(!"Success".equals(message)){
                showPopupMessage(message, FacesMessage.SEVERITY_ERROR);
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void deleteContractClause(ActionEvent actionEvent) {
        try {
            String message = (String) executeMethod("deleteContractClause");
            ADFContext.getCurrent().getPageFlowScope().put("isSaved", "N");
            if(!"Success".equals(message)){
                showPopupMessage(message, FacesMessage.SEVERITY_ERROR);
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void operatorOptionVL(ValueChangeEvent valueChangeEvent) {
        try {
            valueChangeEvent.getComponent().processUpdates(FacesContext.getCurrentInstance());
             ADFContext.getCurrent().getPageFlowScope().put("isSaved", "N");
            String message = (String) executeMethod("contractHiringBasisChange");
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
            String message = (String) executeMethod("contractHiringBasisChange");
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

    public void hiringBasisVL(ValueChangeEvent valueChangeEvent) {
        try {
            valueChangeEvent.getComponent().processUpdates(FacesContext.getCurrentInstance());
            ADFContext.getCurrent().getPageFlowScope().put("isSaved", "N");
            String message = (String) executeMethod("contractHiringBasisChange");
            if(!"Success".equals(message)){
                showPopupMessage(message, FacesMessage.SEVERITY_ERROR);
            }else{
                addPartialTrigger(getStandardRateBind());
                addPartialTrigger(getOt1RateBind());
                addPartialTrigger(getOt2RateBind());
                addPartialTrigger(getLineValueBind());
                addPartialTrigger(getMinChargeUnitBind());
                addPartialTrigger(getUnitRateBind());
            }
         }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void lnsCategoryVL(ValueChangeEvent valueChangeEvent) {
        try {
            ADFContext.getCurrent().getPageFlowScope().put("isSaved", "N");
            valueChangeEvent.getComponent().processUpdates(FacesContext.getCurrentInstance());
            DCBindingContainer binding = (DCBindingContainer) BindingContext.getCurrent().getCurrentBindingsEntry();
            DCIteratorBinding bindingIterator = binding.findIteratorBinding("RentalContractLinesVO1Iterator");        
            if(bindingIterator != null){
                ViewObject vo = bindingIterator.getViewObject();
                if(vo != null){
                    RentalContractLinesVORowImpl currRow = (RentalContractLinesVORowImpl) vo.getCurrentRow();
                    if(currRow != null){
                        String message = (String) executeMethod("contractHiringBasisChange");
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

    public void rentalTypeVL(ValueChangeEvent valueChangeEvent) {
        try {
            valueChangeEvent.getComponent().processUpdates(FacesContext.getCurrentInstance());
            ADFContext.getCurrent().getPageFlowScope().put("isSaved", "N");
            String message = (String) executeMethod("contractRentalTypeChange");
            if(!"Success".equals(message)){
                showPopupMessage(message, FacesMessage.SEVERITY_ERROR);
            }else{
                addPartialTrigger(getLnsCategoryBind());
                addPartialTrigger(getOnHireDateBind());
                addPartialTrigger(getOffHireDateBind());
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
    

    public void onHireDateVL(ValueChangeEvent valueChangeEvent) {
        try {
            valueChangeEvent.getComponent().processUpdates(FacesContext.getCurrentInstance());
            ADFContext.getCurrent().getPageFlowScope().put("isSaved", "N");
            String message = (String) executeMethod("contractOnHireChange");
            if(!"Success".equals(message)){
                showPopupMessage(message, FacesMessage.SEVERITY_ERROR);
            }else{
                addPartialTrigger(getLnsCategoryBind());
                addPartialTrigger(getOnHireDateBind());
                addPartialTrigger(getOffHireDateBind());
            }
        }catch (Exception e) {
            e.printStackTrace();
        }        
    }

    public void saveRentalContractAL(ActionEvent actionEvent) {
        try {
            String msg = (String) executeMethod("validateContractLines");
            if(!"Success".equals(msg)){
                String msgs[] = msg.split("_");
                for(int i = 0;i <msgs.length;i++){
                    showPopupMessage(msgs[i], FacesMessage.SEVERITY_ERROR);
                }
            }else{
                String message = (String) executeMethod("generateContractNumber");
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

    public void closeRentalContractsAL(ActionEvent actionEvent) {
        try {            
            if("N".equals(ADFContext.getCurrent().getPageFlowScope().get("isSaved"))){
                showPopup(getClosePageConfirmPopup());
            }else{
                ADFContext.getCurrent().getPageFlowScope().put("QuotationIdFromContract", getEL("#{bindings.ReferenceId.inputValue}"));
                cancel();                
                navigateNew("Done");
                String message = (String) executeMethod("setRentalContractSearch");
                if(!"Success".equals(message)){
                    showPopupMessage(message, FacesMessage.SEVERITY_ERROR);
                }
                ADFContext.getCurrent().getPageFlowScope().put("isSaved", "Y");
            }            
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void showAttachmentsAL(ActionEvent actionEvent) {
        try {
            showPopup(getAttachmentPopupBind());
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void submitConfirmAL(ActionEvent actionEvent) {
        try 
        {
            String msg1 = (String) executeMethod("checkForContractLines");
            if(!("Success".equals(msg1))) {
                showPopupMessage(msg1, FacesMessage.SEVERITY_ERROR);
            }
            else
            {
                String msg = (String) executeMethod("validateContractLines");
                if(!"Success".equals(msg)){
                    String msgs[] = msg.split("_");
                    for(int i = 0;i <msgs.length;i++){
                        showPopupMessage(msgs[i], FacesMessage.SEVERITY_ERROR);
                    }
                }else{
                    String message = (String) executeMethod("generateContractNumber");
                    if(!"Success".equals(message)){
                        showPopupMessage(message, FacesMessage.SEVERITY_ERROR);
                    }else{
                        save();
                        addPartialTrigger(getHeaderTotalAmtBind());
                        ADFContext.getCurrent().getPageFlowScope().put("isSaved", "Y");
                        showPopup(getSubmitConfirmPopupBind());
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void withDrawConfirmAL(ActionEvent actionEvent) {
        try {
            showPopup(getWithdrawConfirmPopupBind());
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void reviseConfirmAL(ActionEvent actionEvent) {
        try {
            showPopup(getReviseConfirmPopupBind());
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void cancelConfirmAL(ActionEvent actionEvent) {
        try {
            showPopup(getCancelConfirmPopupBind());
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setAttchPopupBind(RichDialog attchPopupBind) {
        this.attchPopupBind = attchPopupBind;
    }

    public RichDialog getAttchPopupBind() {
        return attchPopupBind;
    }

    public void setSubmitConfirmPopupBind(RichPopup submitConfirmPopupBind) {
        this.submitConfirmPopupBind = submitConfirmPopupBind;
    }

    public RichPopup getSubmitConfirmPopupBind() {
        return submitConfirmPopupBind;
    }

    public void setAttachmentPopupBind(RichPopup attachmentPopupBind) {
        this.attachmentPopupBind = attachmentPopupBind;
    }

    public RichPopup getAttachmentPopupBind() {
        return attachmentPopupBind;
    }

    public void setCancelConfirmPopupBind(RichPopup cancelConfirmPopupBind) {
        this.cancelConfirmPopupBind = cancelConfirmPopupBind;
    }

    public RichPopup getCancelConfirmPopupBind() {
        return cancelConfirmPopupBind;
    }

    public void setReviseConfirmPopupBind(RichPopup reviseConfirmPopupBind) {
        this.reviseConfirmPopupBind = reviseConfirmPopupBind;
    }

    public RichPopup getReviseConfirmPopupBind() {
        return reviseConfirmPopupBind;
    }

    public void setWithdrawConfirmPopupBind(RichPopup withdrawConfirmPopupBind) {
        this.withdrawConfirmPopupBind = withdrawConfirmPopupBind;
    }

    public RichPopup getWithdrawConfirmPopupBind() {
        return withdrawConfirmPopupBind;
    }

    public void confirmSubmitDL(DialogEvent dialogEvent) {
        if (dialogEvent.getOutcome().equals(DialogEvent.Outcome.yes)) {
           save();
           String message = (String) executeMethod("checkCreditControl");
           if(!"Success".equals(message)){
               showPopupMessage(message, FacesMessage.SEVERITY_ERROR);
           }else{
                Object msg = submitRCDocForApproval();
                if ("SUCCESS".equalsIgnoreCase(msg.toString())) {
                    showPopupMessage("Submitted for Approval", FacesMessage.SEVERITY_INFO);
                    save();
                    ADFContext.getCurrent().getPageFlowScope().put("changesSaved", "Y");
    
                } else {
                    showPopupMessage(msg.toString(), FacesMessage.SEVERITY_ERROR);
                }
                addPartialTrigger(getTrxnPageBind());
           }
        }
    }

    public void confirmCancelDL(DialogEvent dialogEvent) {
        if(dialogEvent.getOutcome() == DialogEvent.Outcome.yes){
            try {
                String message = (String) executeMethod("cancelContract");
                if (!"Success".equals(message)) {
                    showPopupMessage(message, FacesMessage.SEVERITY_ERROR);
                } else {
                    save();
                    ADFContext.getCurrent()
                              .getPageFlowScope()
                              .put("isSaved", "Y");
                    addPartialTrigger(getTrxnPageBind());
                }
            } catch (Exception e) {
                // TODO: Add catch code
                e.printStackTrace();
            }
        }
    }

    public void confirmReviseDL(DialogEvent dialogEvent) {
        if(dialogEvent.getOutcome() == DialogEvent.Outcome.yes){
            String message = (String) executeMethod("reviseContract");
            if(!"Success".equals(message)){
                showPopupMessage(message, FacesMessage.SEVERITY_ERROR);
            }else{
                ADFContext.getCurrent().getPageFlowScope().put("isSaved", "Y");
                addPartialTrigger(getTrxnPageBind());
            }
        }
    }

    public void confirmWithdrawDL(DialogEvent dialogEvent) {
        try
        {
             String message = (String) executeMethod("withdrawRCFromApproval");
             if(!"Success".equals(message)){
                 showPopupMessage(message, FacesMessage.SEVERITY_ERROR);
             }else{
                 addPartialTrigger(getTrxnPageBind());
             }
         }
        catch(Exception e) 
        {
            e.printStackTrace();    
        }
    }

    public void addAttachmentAL(ActionEvent actionEvent) {
        try {
            String message = (String) executeMethod("addContractAttachment");
            if(!"Success".equals(message)){
                showPopupMessage(message, FacesMessage.SEVERITY_ERROR);
            }
            ADFContext.getCurrent().getPageFlowScope().put("isSaved", "N");
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setAttachmentTblBind(RichTable attachmentTblBind) {
        this.attachmentTblBind = attachmentTblBind;
    }

    public RichTable getAttachmentTblBind() {
        return attachmentTblBind;
    }

    public void uploadFileVL(ValueChangeEvent valueChangeEvent) {
        valueChangeEvent.getComponent().processUpdates(FacesContext.getCurrentInstance());
        try {
            Map pageFlowScope = ADFContext.getCurrent().getPageFlowScope();

            try {
                pageFlowScope.put("contractUploadedFileStream",((UploadedFile)valueChangeEvent.getNewValue()).getInputStream());
                pageFlowScope.put("contractFileName",((UploadedFile)valueChangeEvent.getNewValue()).getFilename());
                pageFlowScope.put("contractFileType",((UploadedFile)valueChangeEvent.getNewValue()).getContentType());
                
                String str = (String)executeMethod("uploadRentalContractAttach");
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

    public void downloadContractAttachment(FacesContext facesContext, OutputStream outputStream) {
        try {
            DCBindingContainer binding =
                (DCBindingContainer)BindingContext.getCurrent().getCurrentBindingsEntry();
            DCIteratorBinding bindingIterator =
                binding.findIteratorBinding("AttachmentsVO3Iterator");
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

    public void setAttchHdrBind(RichPanelHeader attchHdrBind) {
        this.attchHdrBind = attchHdrBind;
    }

    public RichPanelHeader getAttchHdrBind() {
        return attchHdrBind;
    }

    public void chargeCategoryVL(ValueChangeEvent valueChangeEvent) {
        try {
            ADFContext.getCurrent().getPageFlowScope().put("isSaved", "N");
            valueChangeEvent.getComponent().processUpdates(FacesContext.getCurrentInstance());
            DCBindingContainer binding = (DCBindingContainer) BindingContext.getCurrent().getCurrentBindingsEntry();
            DCIteratorBinding bindingIterator = binding.findIteratorBinding("RentalContractChargesVO1Iterator");
            if (bindingIterator != null) {
                ViewObject vo = bindingIterator.getViewObject();
                if (vo != null) {
                    RentalContractChargesVORowImpl currRow = (RentalContractChargesVORowImpl) vo.getCurrentRow();
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
                        addPartialTrigger(getQuantityBind());
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
            DCIteratorBinding bindingIterator = binding.findIteratorBinding("RentalContractChargesVO1Iterator");
            if (bindingIterator != null) {
                ViewObject vo = bindingIterator.getViewObject();
                if (vo != null) {
                    RentalContractChargesVORowImpl currRow = (RentalContractChargesVORowImpl) vo.getCurrentRow();
                    if (currRow != null) {
                        currRow.setTransBilling(null);
                        currRow.setBilling(null);
                        currRow.setQuantity(null);
                        currRow.setUnitAmount(null);
                        currRow.setAmount(null);
                        addPartialTrigger(getBillingBind());
                        addPartialTrigger(getChargeAmountBind());
                        addPartialTrigger(getQuantityBind());
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
            String message = (String) executeMethod("contractChargeBillingChange");
            if(!"Success".equals(message)){
                showPopupMessage(message, FacesMessage.SEVERITY_ERROR);
                addPartialTrigger(getBillingBind());
                addPartialTrigger(getChargeAmountBind());
                addPartialTrigger(getQuantityBind());
                addPartialTrigger(getUnitAmountBind());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void contractClauseVL(ValueChangeEvent valueChangeEvent) {
        try {
            ADFContext.getCurrent().getPageFlowScope().put("isSaved", "N");
            valueChangeEvent.getComponent().processUpdates(FacesContext.getCurrentInstance());
            String message = (String) executeMethod("contractClauseChange");
            if(!"Success".equals(message)){
                showPopupMessage(message, FacesMessage.SEVERITY_ERROR);
                addPartialTrigger(getClauseBind());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setContractTypeBind(RichInputComboboxListOfValues contractTypeBind) {
        this.contractTypeBind = contractTypeBind;
    }

    public RichInputComboboxListOfValues getContractTypeBind() {
        return contractTypeBind;
    }

    public void setSrcBuHdrBind(RichInputComboboxListOfValues srcBuHdrBind) {
        this.srcBuHdrBind = srcBuHdrBind;
    }

    public RichInputComboboxListOfValues getSrcBuHdrBind() {
        return srcBuHdrBind;
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

    public void setContractSrcHdrBind(RichInputComboboxListOfValues contractSrcHdrBind) {
        this.contractSrcHdrBind = contractSrcHdrBind;
    }

    public RichInputComboboxListOfValues getContractSrcHdrBind() {
        return contractSrcHdrBind;
    }

    public void setReferenceNoHdrBind(RichInputComboboxListOfValues referenceNoHdrBind) {
        this.referenceNoHdrBind = referenceNoHdrBind;
    }

    public RichInputComboboxListOfValues getReferenceNoHdrBind() {
        return referenceNoHdrBind;
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

    public void setCustomerSiteHdrBind(RichInputComboboxListOfValues customerSiteHdrBind) {
        this.customerSiteHdrBind = customerSiteHdrBind;
    }

    public RichInputComboboxListOfValues getCustomerSiteHdrBind() {
        return customerSiteHdrBind;
    }

    public void setPopulateTblBind(RichTable populateTblBind) {
        this.populateTblBind = populateTblBind;
    }

    public RichTable getPopulateTblBind() {
        return populateTblBind;
    }

    public void setLinesPopulatePopupBind(RichPopup linesPopulatePopupBind) {
        this.linesPopulatePopupBind = linesPopulatePopupBind;
    }

    public RichPopup getLinesPopulatePopupBind() {
        return linesPopulatePopupBind;
    }

    public void setLnsCategoryBind(RichInputComboboxListOfValues lnsCategoryBind) {
        this.lnsCategoryBind = lnsCategoryBind;
    }

    public RichInputComboboxListOfValues getLnsCategoryBind() {
        return lnsCategoryBind;
    }

    public void setHiringBasisBind(RichInputComboboxListOfValues hiringBasisBind) {
        this.hiringBasisBind = hiringBasisBind;
    }

    public RichInputComboboxListOfValues getHiringBasisBind() {
        return hiringBasisBind;
    }

    public void setOperatorOptionBind(RichInputComboboxListOfValues operatorOptionBind) {
        this.operatorOptionBind = operatorOptionBind;
    }

    public RichInputComboboxListOfValues getOperatorOptionBind() {
        return operatorOptionBind;
    }

    public void setFurlOptionBind(RichInputComboboxListOfValues furlOptionBind) {
        this.furlOptionBind = furlOptionBind;
    }

    public RichInputComboboxListOfValues getFurlOptionBind() {
        return furlOptionBind;
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

    public void setMinChargeUnitBind(RichInputComboboxListOfValues minChargeUnitBind) {
        this.minChargeUnitBind = minChargeUnitBind;
    }

    public RichInputComboboxListOfValues getMinChargeUnitBind() {
        return minChargeUnitBind;
    }

    public void confirmCloseDL(DialogEvent dialogEvent) {
        if(dialogEvent.getOutcome() == DialogEvent.Outcome.yes){
            cancel();            
            navigateNew("Done");
            String message = (String) executeMethod("setRentalContractSearch");
            if(!"Success".equals(message)){
                showPopupMessage(message, FacesMessage.SEVERITY_ERROR);
            }
            ADFContext.getCurrent().getPageFlowScope().put("isSaved", "Y");
        }
    }

    public void setClosePageConfirmPopup(RichPopup closePageConfirmPopup) {
        this.closePageConfirmPopup = closePageConfirmPopup;
    }

    public RichPopup getClosePageConfirmPopup() {
        return closePageConfirmPopup;
    }

    public void setTrxnPageBind(RichPanelGroupLayout trxnPageBind) {
        this.trxnPageBind = trxnPageBind;
    }

    public RichPanelGroupLayout getTrxnPageBind() {
        return trxnPageBind;
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

    public void setClauseBind(RichInputComboboxListOfValues clauseBind) {
        this.clauseBind = clauseBind;
    }

    public RichInputComboboxListOfValues getClauseBind() {
        return clauseBind;
    }

    public void setSelectAllBind(RichSelectBooleanCheckbox selectAllBind) {
        this.selectAllBind = selectAllBind;
    }

    public RichSelectBooleanCheckbox getSelectAllBind() {
        return selectAllBind;
    }

    public void selectAllLineChange(ValueChangeEvent valueChangeEvent) {
        try{
            if (!(valueChangeEvent.getNewValue().equals(valueChangeEvent.getOldValue()))) {
                Boolean markAs = (Boolean)valueChangeEvent.getNewValue();
                if(markAs){
                    ADFContext.getCurrent().getPageFlowScope().put("markAs", "Y");
                }else{
                    ADFContext.getCurrent().getPageFlowScope().put("markAs", "N");
                }
                executeMethod("selectAllLinesContract");
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public void populateContractLinesAL(ActionEvent actionEvent) {
        try {
            
            String message = (String) executeMethod("populateContractLines");
            ADFContext.getCurrent().getPageFlowScope().put("isSaved", "N");
            if(!"Success".equals(message)){
                showPopupMessage(message, FacesMessage.SEVERITY_ERROR);
            }else{
                getLinesPopulatePopupBind().hide();
                addPartialTrigger(getContractLinesTblBind());
                addPartialTrigger(getChargesTblBind());
                addPartialTrigger(getChargeDeleteBind());
                addPartialTrigger(getHiringInfoDeleteBind());
            }
        }catch (Exception e) {
            e.printStackTrace();            
        }
    }

    public void closePopulateLinesAL(ActionEvent actionEvent) {
        getLinesPopulatePopupBind().hide();
    }

    public void setChargesTblBind(RichTable chargesTblBind) {
        this.chargesTblBind = chargesTblBind;
    }

    public RichTable getChargesTblBind() {
        return chargesTblBind;
    }

    public void setChargesSaveConfirmPopupBind(RichPopup chargesSaveConfirmPopupBind) {
        this.chargesSaveConfirmPopupBind = chargesSaveConfirmPopupBind;
    }

    public RichPopup getChargesSaveConfirmPopupBind() {
        return chargesSaveConfirmPopupBind;
    }

    public void confirmChargeSaveDL(DialogEvent dialogEvent) {
        if(dialogEvent.getOutcome()==DialogEvent.Outcome.yes){
            String msg = (String) executeMethod("validateContractLines");
            if(!"Success".equals(msg)){
                String msgs[] = msg.split("_");
                for(int i = 0;i <msgs.length;i++){
                    showPopupMessage(msgs[i], FacesMessage.SEVERITY_ERROR);
                }
            }else{
                String message = (String) executeMethod("generateContractNumber");
                if(!"Success".equals(message)){
                    showPopupMessage(message, FacesMessage.SEVERITY_ERROR);
                }else{
                    save();      
                    addPartialTrigger(getHeaderTotalAmtBind());
                    String message2 = (String) executeMethod("addContractCharge");
                    ADFContext.getCurrent().getPageFlowScope().put("isSaved", "N");
                    if(!"Success".equals(message2)){
                        showPopupMessage(message2, FacesMessage.SEVERITY_ERROR);
                    }
                }
            }
        }
    }

    public void dataChangeVL(ValueChangeEvent valueChangeEvent) {
        try {
            valueChangeEvent.getComponent().processUpdates(FacesContext.getCurrentInstance());
            ADFContext.getCurrent().getPageFlowScope().put("isSaved", "N");
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setChargeDeleteBind(RichLink chargeDeleteBind) {
        this.chargeDeleteBind = chargeDeleteBind;
    }

    public RichLink getChargeDeleteBind() {
        return chargeDeleteBind;
    }

    public void setHiringInfoDeleteBind(RichLink hiringInfoDeleteBind) {
        this.hiringInfoDeleteBind = hiringInfoDeleteBind;
    }

    public RichLink getHiringInfoDeleteBind() {
        return hiringInfoDeleteBind;
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
    
    public String submitRCDocForApproval() {
        Object msg = executeMethod("callpkgForAMERCProcessSubmit");
        return msg != null ? msg.toString() : "";
    }

    public void RCactionHistoryAL(ActionEvent actionEvent) 
    {
        try 
        {
            executeMethod("setActionHistoryForRCDocument");
            showPopup(getRcactionHistoryPopupBindgs());
        }
        catch(Exception e) 
        {
            e.printStackTrace();    
        }
    }

    public void setRcactionHistoryPopupBindgs(RichPopup rcactionHistoryPopupBindgs) {
        this.rcactionHistoryPopupBindgs = rcactionHistoryPopupBindgs;
    }

    public RichPopup getRcactionHistoryPopupBindgs() {
        return rcactionHistoryPopupBindgs;
    }

    public void setHeaderTotalAmtBind(RichOutputText headerTotalAmtBind) {
        this.headerTotalAmtBind = headerTotalAmtBind;
    }

    public RichOutputText getHeaderTotalAmtBind() {
        try {
            oracle.jbo.domain.Number assetTotalValue = new oracle.jbo.domain.Number(0);
            oracle.jbo.domain.Number chargeTotalValuie = new oracle.jbo.domain.Number(0);
            oracle.jbo.domain.Number totalAmount = new oracle.jbo.domain.Number(0);
            assetTotalValue =
                    new oracle.jbo.domain.Number((oracle.jbo.domain.Number)(getEL("#{bindings.TransTotalAmount.inputValue}") !=
                                        null ?
                                        getEL("#{bindings.TransTotalAmount.inputValue}") :
                                        new oracle.jbo.domain.Number(0)));
            chargeTotalValuie =
                    new oracle.jbo.domain.Number((oracle.jbo.domain.Number)(getEL("#{bindings.TransTotalCharges.inputValue}") !=
                                        null ?
                                        getEL("#{bindings.TransTotalCharges.inputValue}") :
                                        new oracle.jbo.domain.Number(0)));
            totalAmount = (assetTotalValue.add(chargeTotalValuie));
            ADFContext.getCurrent().getPageFlowScope().put("totalAmt", totalAmount);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return headerTotalAmtBind;
    }

    public void addTemplateAL(ActionEvent actionEvent) 
    {
        try 
        {
            ResetUtils.reset(getTemplatePopupBindgs());
            executeMethod("createTransContractTemplateSearch");
            showPopup(getTemplatePopupBindgs());
        }
        catch(Exception e) 
        {
            e.printStackTrace();    
        }
    }

    public void setTemplatePopupBindgs(RichPopup templatePopupBindgs) {
        this.templatePopupBindgs = templatePopupBindgs;
    }

    public RichPopup getTemplatePopupBindgs() {
        return templatePopupBindgs;
    }

    public void contractTemplateDL(DialogEvent dialogEvent) 
    {
        try 
        {
            if(dialogEvent.getOutcome()== DialogEvent.Outcome.ok) 
            {
                executeMethod("setContractTermsConditions");   
                getTemplatePopupBindgs().hide();
                addPartialTrigger(getTermConditionsBind());
                
            }
        }
        catch(Exception e) 
        {
            e.printStackTrace();
        }
    }

    public void setTermsConditionsBindgs(RichInputText termsConditionsBindgs) {
        this.termsConditionsBindgs = termsConditionsBindgs;
    }

    public RichInputText getTermsConditionsBindgs() {
        return termsConditionsBindgs;
    }

    public void unitRateVL(ValueChangeEvent valueChangeEvent) {
        valueChangeEvent.getComponent().processUpdates(FacesContext.getCurrentInstance());
        try {
            String message = (String) executeMethod("contractUnitRateChange");
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

    public void setTermConditionsBind(RichTextEditor termConditionsBind) {
        this.termConditionsBind = termConditionsBind;
    }

    public RichTextEditor getTermConditionsBind() {
        return termConditionsBind;
    }

    public void taxRateCodeVL(ValueChangeEvent valueChangeEvent) 
    {
        try 
        {
            valueChangeEvent.getComponent().processUpdates(FacesContext.getCurrentInstance());
            //ADFContext.getCurrent().getPageFlowScope().put("billChangesSaved", "N");
            String msg = (String) executeMethod("setRentalContractLinesTaxRate");
            if(!("Success".equals(msg))) 
            {
                showPopupMessage(msg, FacesMessage.SEVERITY_ERROR);    
            }
            else {
                addPartialTrigger(getTrxnPageBind());
            }
        }catch(Exception e) 
        {
            e.printStackTrace();    
        }
    }

    public void interDivisionVL(ValueChangeEvent valueChangeEvent) {
        valueChangeEvent.getComponent().processUpdates(FacesContext.getCurrentInstance());
        try {
            String message = (String) executeMethod("rcInterDivisionCheck");
            if(!"Success".equals(message)){
                showPopupMessage(message, FacesMessage.SEVERITY_ERROR);
                addPartialTrigger(getDivisionHdrBind());
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

//    public void getCreditInfoAL(ActionEvent actionEvent) {
//        try {
//            String message = (String) executeMethod("getCreditInfo");
//            if(message != null && (message.contains("Unable") || message.contains("Exception"))){
//                showPopupMessage(message, FacesMessage.SEVERITY_ERROR);
//            }else{
//                String[] msgs = message.split("@");                
//                String newMsg = "<html> <body>";
//                for(int i=0;i<msgs.length; i++){
//                    newMsg= newMsg+"<p>"+msgs[i]+"</p>";
//                }
//                newMsg = newMsg + "</body> </html>";
//                showPopupMessage(newMsg, FacesMessage.SEVERITY_INFO);
//            }
//        }catch (Exception e) {
//            e.printStackTrace();
//        }
//    }

    public void saveAndCloseAL(ActionEvent actionEvent) {
        try {
            String msg = (String) executeMethod("validateContractLines");
            if(!"Success".equals(msg)){
                String msgs[] = msg.split("_");
                for(int i = 0;i <msgs.length;i++){
                    showPopupMessage(msgs[i], FacesMessage.SEVERITY_ERROR);
                }
            }else{
                String message = (String) executeMethod("generateContractNumber");
                if(!"Success".equals(message)){
                    showPopupMessage(message, FacesMessage.SEVERITY_ERROR);
                }else{
                    save();
                    navigateNew("Done");
                    String message2 = (String) executeMethod("setRentalContractSearch");
                    if(!"Success".equals(message2)){
                        showPopupMessage(message2, FacesMessage.SEVERITY_ERROR);
                    }
                    addPartialTrigger(getHeaderTotalAmtBind());
                    ADFContext.getCurrent().getPageFlowScope().put("isSaved", "Y");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setCustLocationBind(RichInputComboboxListOfValues custLocationBind) {
        this.custLocationBind = custLocationBind;
    }

    public RichInputComboboxListOfValues getCustLocationBind() {
        return custLocationBind;
    }

    public void setQuantityBind(RichInputText quantityBind) {
        this.quantityBind = quantityBind;
    }

    public RichInputText getQuantityBind() {
        return quantityBind;
    }

    public void setUnitAmountBind(RichInputText unitAmountBind) {
        this.unitAmountBind = unitAmountBind;
    }

    public RichInputText getUnitAmountBind() {
        return unitAmountBind;
    }

    public void downloadContractPrintAL(FacesContext facesContext, OutputStream outputStream) {
        try {
            Object dataBytesObj = null;
            dataBytesObj = executeMethod("generateContractPrintReport");
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
