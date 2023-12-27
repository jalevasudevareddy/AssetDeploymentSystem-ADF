package bean;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

import javax.faces.event.ValueChangeEvent;

import model.view.BuAccountingParamsVORowImpl;

import model.view.RentalMasterVORowImpl;

import oracle.adf.model.BindingContext;
import oracle.adf.model.binding.DCBindingContainer;
import oracle.adf.model.binding.DCIteratorBinding;
import oracle.adf.share.ADFContext;
import oracle.adf.view.rich.component.rich.data.RichTable;

import oracle.adf.view.rich.component.rich.input.RichInputComboboxListOfValues;

import oracle.adf.view.rich.component.rich.input.RichInputDate;

import oracle.adf.view.rich.component.rich.input.RichInputText;

import oracle.jbo.RowSetIterator;
import oracle.jbo.domain.Date;

public class RentalRateMasterBean extends CommonBean{
    private RichTable rentalMasterTableBind;
    private RichInputComboboxListOfValues searchBuBind;
    private RichInputComboboxListOfValues searchDivisionBind;
    private RichInputComboboxListOfValues asstCatBind;
    private RichInputComboboxListOfValues hiringBasisBind;
    private RichInputDate effectiveToDateBindgs;
    private RichInputDate effectiveFromDateBindgs;
    private RichInputText stdRateBindgs;
    private RichInputText stdRateHrsBindgs;
    private RichInputText ot1HrsBindgs;
    private RichInputText ot2HrsBindgs;
    private RichInputComboboxListOfValues rentalTypeBind;

    public RentalRateMasterBean() {
        super();
    }

    public void setRentalMasterTableBind(RichTable rentalMasterTableBind) {
        this.rentalMasterTableBind = rentalMasterTableBind;
    }

    public RichTable getRentalMasterTableBind() {
        return rentalMasterTableBind;
    }

    public void rentalRateAdd(ActionEvent actionEvent) {
        try {
            String message = (String) executeMethod("createRentalRate");
            if(!"Success".equals(message)){
                showPopupMessage(message, FacesMessage.SEVERITY_ERROR);
            }
            else
            {
                ADFContext.getCurrent().getPageFlowScope().put("rentalbuChangeFlag", "N");
            }
        }catch (Exception e) {            
            e.printStackTrace();
        }
    }

    public void deleteRentalRate(ActionEvent actionEvent) {
        try {
            DCBindingContainer binding = (DCBindingContainer) BindingContext.getCurrent().getCurrentBindingsEntry();
            DCIteratorBinding bindingIterator = binding.findIteratorBinding("RentalMasterVO1Iterator");
            RowSetIterator row = bindingIterator.getRowSetIterator();
            if(bindingIterator != null){
                RentalMasterVORowImpl currentRow = (RentalMasterVORowImpl) row.getCurrentRow();
                if(currentRow != null && currentRow.getEntity(0).getEntityState() == 0){
                    currentRow.remove();
                    ADFContext.getCurrent().getPageFlowScope().put("rentalbuChangeFlag", "N");
                }else{
                    showPopupMessage("Only New Record can be deleted", FacesMessage.SEVERITY_ERROR);
                }
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void saveAL(ActionEvent actionEvent) {
        try {
            String msg = (String) executeMethod("saveRentalRates");
            if(!("Success".equals(msg))) 
            {
                showPopupMessage(msg, FacesMessage.SEVERITY_ERROR);    
            }
            else
            {
                save();
                addPartialTrigger(getRentalMasterTableBind());
//                addPartialTrigger(getSearchBuBind());
//                addPartialTrigger(getSearchDivisionBind());
                ADFContext.getCurrent().getPageFlowScope().put("rentalbuChangeFlag", "Y");
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void saveAndCloseAL(ActionEvent actionEvent) {
        try {
            save();
            ADFContext.getCurrent().getPageFlowScope().put("rentalbuChangeFlag", "Y");
            closeCurrentActivity(actionEvent);
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void cancelAL(ActionEvent actionEvent) {
        try {
            cancel();
            ADFContext.getCurrent().getPageFlowScope().put("rentalbuChangeFlag", "Y");
            closeCurrentActivity(actionEvent);
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void searchBuValChList(ValueChangeEvent valueChangeEvent) {
        valueChangeEvent.getComponent().processUpdates(FacesContext.getCurrentInstance());
        try {
            if("Y".equals(ADFContext.getCurrent().getPageFlowScope().get("rentalbuChangeFlag"))){
                valueChangeEvent.getComponent().processUpdates(FacesContext.getCurrentInstance());
                ADFContext.getCurrent().getPageFlowScope().put("rentalOnlyBuFlag", "Y");
                String message = (String) executeMethod("searchBuRentalMaster");
                addPartialTrigger(getRentalMasterTableBind());
            }else{
                getSearchBuBind().setValue(valueChangeEvent.getOldValue());
                getSearchBuBind().setAutoSubmit(true);
                addPartialTrigger(getSearchBuBind());
                showPopupMessage("Please save or cancel the changes to continue.", FacesMessage.SEVERITY_ERROR);
            }
            
//            String message = (String) executeMethod("searchBuRentalMaster");
//            addPartialTrigger(getRentalMasterTableBind());
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setSearchBuBind(RichInputComboboxListOfValues searchBuBind) {
        this.searchBuBind = searchBuBind;
    }

    public RichInputComboboxListOfValues getSearchBuBind() {
        return searchBuBind;
    }

    public void setSearchDivisionBind(RichInputComboboxListOfValues searchDivisionBind) {
        this.searchDivisionBind = searchDivisionBind;
    }

    public RichInputComboboxListOfValues getSearchDivisionBind() {
        return searchDivisionBind;
    }

    public void searchDivValChList(ValueChangeEvent valueChangeEvent) {
        try {
            if("Y".equals(ADFContext.getCurrent().getPageFlowScope().get("rentalbuChangeFlag"))){
                valueChangeEvent.getComponent().processUpdates(FacesContext.getCurrentInstance());
                String message = (String) executeMethod("searchBuRentalMaster");
                addPartialTrigger(getRentalMasterTableBind());
            }else{
                getSearchDivisionBind().setValue(valueChangeEvent.getOldValue());
                getSearchDivisionBind().setAutoSubmit(true);
                addPartialTrigger(getSearchDivisionBind());
                showPopupMessage("Please save or cancel the changes to continue.", FacesMessage.SEVERITY_ERROR);
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void asstCatValChList(ValueChangeEvent valueChangeEvent) {
        try {
           valueChangeEvent.getComponent().processUpdates(FacesContext.getCurrentInstance());
           ADFContext.getCurrent().getPageFlowScope().put("rentalTypeFlag", "N");
            ADFContext.getCurrent().getPageFlowScope().put("rentalAsstCategoryFlag", "Y");
           ADFContext.getCurrent().getPageFlowScope().put("rentalHiringBasisFlag", "N");
           ADFContext.getCurrent().getPageFlowScope().put("rentalStartDateFlag", "N");
           ADFContext.getCurrent().getPageFlowScope().put("rentalEndDateFlag", "N");
           String message = (String) executeMethod("rentalMasterUniquenes");
           if(!"Success".equals(message)){
               addPartialTrigger(getRentalMasterTableBind());
               addPartialTrigger(getAsstCatBind());
               showPopupMessage(message, FacesMessage.SEVERITY_ERROR);
           }
       } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setAsstCatBind(RichInputComboboxListOfValues asstCatBind) {
        this.asstCatBind = asstCatBind;
    }

    public RichInputComboboxListOfValues getAsstCatBind() {
        return asstCatBind;
    }

    public void searchAL(ActionEvent actionEvent) 
    {
        try 
        {
            executeMethod("searchRentalRates");
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
            executeMethod("resetRentalSearch");
        }
        catch(Exception e) 
        {
            e.printStackTrace();    
        }
    }
    
    public Date getTransMaxDate() {
        Date maxStartDate =
            new Date((oracle.jbo.domain.Date)oracle.jbo.domain.Date.getCurrentDate());
        return maxStartDate;
    }

    public void hiringBasisVL(ValueChangeEvent valueChangeEvent) 
    {
        try 
        {
            valueChangeEvent.getComponent().processUpdates(FacesContext.getCurrentInstance());
            ADFContext.getCurrent().getPageFlowScope().put("rentalTypeFlag", "N");
             ADFContext.getCurrent().getPageFlowScope().put("rentalAsstCategoryFlag", "N");
            ADFContext.getCurrent().getPageFlowScope().put("rentalHiringBasisFlag", "Y");
            ADFContext.getCurrent().getPageFlowScope().put("rentalStartDateFlag", "N");
            ADFContext.getCurrent().getPageFlowScope().put("rentalEndDateFlag", "N");
            String message = (String) executeMethod("validateHiringBasis");
            if(!"Success".equals(message)){
                addPartialTrigger(getRentalMasterTableBind());
                addPartialTrigger(getHiringBasisBind());
                addPartialTrigger(getEffectiveFromDateBindgs());
                showPopupMessage(message, FacesMessage.SEVERITY_ERROR);
            }
            else
            {
                addPartialTrigger(getEffectiveFromDateBindgs());
            }
        }
        catch(Exception e) 
        {
            e.printStackTrace();    
        }
    }

    public void setHiringBasisBind(RichInputComboboxListOfValues hiringBasisBind) {
        this.hiringBasisBind = hiringBasisBind;
    }

    public RichInputComboboxListOfValues getHiringBasisBind() {
        return hiringBasisBind;
    }

    public void effectiveFromDateVL(ValueChangeEvent valueChangeEvent) 
    {
        try 
        {
            valueChangeEvent.getComponent().processUpdates(FacesContext.getCurrentInstance());
            ADFContext.getCurrent().getPageFlowScope().put("rentalTypeFlag", "N");
             ADFContext.getCurrent().getPageFlowScope().put("rentalAsstCategoryFlag", "N");
            ADFContext.getCurrent().getPageFlowScope().put("rentalHiringBasisFlag", "N");
            ADFContext.getCurrent().getPageFlowScope().put("rentalStartDateFlag", "Y");
            ADFContext.getCurrent().getPageFlowScope().put("rentalEndDateFlag", "N");
            String message = (String) executeMethod("rentalMasterUniquenes");
            if(!"Success".equals(message)){
                addPartialTrigger(getRentalMasterTableBind());
                addPartialTrigger(getEffectiveFromDateBindgs());
                showPopupMessage(message, FacesMessage.SEVERITY_ERROR);
            }
        }
        catch(Exception e) 
        {
            e.printStackTrace();    
        }
    }

    public void effectiveToDateVL(ValueChangeEvent valueChangeEvent) 
    {
        try 
        {
            valueChangeEvent.getComponent().processUpdates(FacesContext.getCurrentInstance());
            ADFContext.getCurrent().getPageFlowScope().put("rentalTypeFlag", "N");
             ADFContext.getCurrent().getPageFlowScope().put("rentalAsstCategoryFlag", "N");
            ADFContext.getCurrent().getPageFlowScope().put("rentalHiringBasisFlag", "N");
            ADFContext.getCurrent().getPageFlowScope().put("rentalStartDateFlag", "N");
            ADFContext.getCurrent().getPageFlowScope().put("rentalEndDateFlag", "Y");
            String message = (String) executeMethod("rentalMasterUniquenes");
            if(!"Success".equals(message)){
                addPartialTrigger(getRentalMasterTableBind());
                addPartialTrigger(getEffectiveToDateBindgs());
                showPopupMessage(message, FacesMessage.SEVERITY_ERROR);
            }
        }
        catch(Exception e) 
        {
            e.printStackTrace();    
        }
    }

    public void setEffectiveToDateBindgs(RichInputDate effectiveToDateBindgs) {
        this.effectiveToDateBindgs = effectiveToDateBindgs;
    }

    public RichInputDate getEffectiveToDateBindgs() {
        return effectiveToDateBindgs;
    }

    public void setEffectiveFromDateBindgs(RichInputDate effectiveFromDateBindgs) {
        this.effectiveFromDateBindgs = effectiveFromDateBindgs;
    }

    public RichInputDate getEffectiveFromDateBindgs() {
        return effectiveFromDateBindgs;
    }

    public void rateHrsVL(ValueChangeEvent valueChangeEvent) 
    {
        try 
        {
            valueChangeEvent.getComponent().processUpdates(FacesContext.getCurrentInstance());
            String msg = (String) executeMethod("validateAssetRentalHrs");
            if(!("Success".equals(msg))) 
            {
                addPartialTrigger(getStdRateHrsBindgs());
                addPartialTrigger(getOt1HrsBindgs());
                addPartialTrigger(getOt2HrsBindgs());
                showPopupMessage(msg, FacesMessage.SEVERITY_ERROR);    
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
             
    }

    public void setStdRateHrsBindgs(RichInputText stdRateHrsBindgs) {
        this.stdRateHrsBindgs = stdRateHrsBindgs;
    }

    public RichInputText getStdRateHrsBindgs() {
        return stdRateHrsBindgs;
    }

    public void setOt1HrsBindgs(RichInputText ot1HrsBindgs) {
        this.ot1HrsBindgs = ot1HrsBindgs;
    }

    public RichInputText getOt1HrsBindgs() {
        return ot1HrsBindgs;
    }

    public void setOt2HrsBindgs(RichInputText ot2HrsBindgs) {
        this.ot2HrsBindgs = ot2HrsBindgs;
    }

    public RichInputText getOt2HrsBindgs() {
        return ot2HrsBindgs;
    }

    public void RentalTypeChangeVL(ValueChangeEvent valueChangeEvent) {
        try {
           valueChangeEvent.getComponent().processUpdates(FacesContext.getCurrentInstance());
            ADFContext.getCurrent().getPageFlowScope().put("rentalTypeFlag", "Y");
            ADFContext.getCurrent().getPageFlowScope().put("rentalAsstCategoryFlag", "N");
           ADFContext.getCurrent().getPageFlowScope().put("rentalHiringBasisFlag", "N");
           ADFContext.getCurrent().getPageFlowScope().put("rentalStartDateFlag", "N");
           ADFContext.getCurrent().getPageFlowScope().put("rentalEndDateFlag", "N");
           String message = (String) executeMethod("rentalMasterUniquenes");
           if(!"Success".equals(message)){
               addPartialTrigger(getRentalMasterTableBind());
               addPartialTrigger(getRentalTypeBind());
               showPopupMessage(message, FacesMessage.SEVERITY_ERROR);
           }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setRentalTypeBind(RichInputComboboxListOfValues rentalTypeBind) {
        this.rentalTypeBind = rentalTypeBind;
    }

    public RichInputComboboxListOfValues getRentalTypeBind() {
        return rentalTypeBind;
    }

    public void unitRateVL(ValueChangeEvent valueChangeEvent) {
        valueChangeEvent.getComponent().processUpdates(FacesContext.getCurrentInstance());
        try {
            String message = (String) executeMethod("rentalRateUnitRateChange");
            if(!"Success".equals(message)){
                showPopupMessage(message, FacesMessage.SEVERITY_ERROR);
            }
            addPartialTrigger(getStdRateHrsBindgs());
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
