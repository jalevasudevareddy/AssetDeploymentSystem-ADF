package bean;

import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.faces.event.ValueChangeEvent;
import javax.faces.application.FacesMessage;

import model.view.BuAccountingParamsVORowImpl;

import model.view.DivisionAccountMapVORowImpl;
import model.view.GroupCustomerMapVORowImpl;

import oracle.adf.model.BindingContext;
import oracle.adf.model.binding.DCBindingContainer;
import oracle.adf.model.binding.DCIteratorBinding;
import oracle.adf.share.ADFContext;
import oracle.adf.view.rich.component.rich.data.RichTable;
import oracle.adf.view.rich.component.rich.input.RichInputComboboxListOfValues;
import oracle.adf.view.rich.component.rich.input.RichInputDate;

import oracle.jbo.Row;
import oracle.jbo.RowSetIterator;

public class BuAccountingParamsBean extends CommonBean{
    private RichInputComboboxListOfValues setUpTypeBind;
    private RichInputComboboxListOfValues arSourceBind;
    private RichInputComboboxListOfValues arTrxntypeBind;
    private RichInputComboboxListOfValues arContextBind;
    private RichInputComboboxListOfValues glSourceBind;
    private RichInputComboboxListOfValues glCategoryBind;
    private RichInputComboboxListOfValues paCategoryBind;
    private RichInputDate accParamEffToBind;
    private RichInputComboboxListOfValues reqBuBind;
    private RichInputDate grpCustEffFromBind;
    private RichInputDate grpCustEffToBind;
    private RichInputDate accParamEffFromBind;
    private RichTable grpCustMapTableBind;
    private RichTable accParamsTableBind;
    private RichInputComboboxListOfValues searchBuBind;
    private RichInputComboboxListOfValues searchDivisionBind;
    private RichInputDate startDateDivAccMap;
    private RichInputDate endDateDivAccMap;
    private RichTable divisionAccMapTableBind;

    public BuAccountingParamsBean() {
        super();
    }

    public void saveAL(ActionEvent actionEvent) {
        try {
            String message = (String) executeMethod("saveStartDateDivisonAccMap");
            if("Success".equals(message))
            { 
            save();
            ADFContext.getCurrent().getPageFlowScope().put("buChangeFlag", "Y");
            addPartialTrigger(getGrpCustMapTableBind());
            addPartialTrigger(getAccParamsTableBind());
            addPartialTrigger(getSearchBuBind());
            addPartialTrigger(getSearchDivisionBind());
            addPartialTrigger(getDivisionAccMapTableBind());
            }else{
                showPopupMessage(message, FacesMessage.SEVERITY_ERROR);
            }
           
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void saveAndCloseAL(ActionEvent actionEvent) {
        try {
            String message = (String) executeMethod("saveStartDateDivisonAccMap");
            if("Success".equals(message))
            { 
            save();
            ADFContext.getCurrent().getPageFlowScope().put("buChangeFlag", "Y");
            closeCurrentActivity(actionEvent);
            }else{
                    showPopupMessage(message, FacesMessage.SEVERITY_ERROR);
                 }
            }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void cancelAL(ActionEvent actionEvent) {
        try {
            cancel();
            ADFContext.getCurrent().getPageFlowScope().put("buChangeFlag", "Y");
            closeCurrentActivity(actionEvent);
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void createAccountingParamAL(ActionEvent actionEvent) {
        try {
            String message = (String) executeMethod("createAccountingParam");
            if(!"Success".equals(message)){
                showPopupMessage(message, FacesMessage.SEVERITY_ERROR);
            }else{
                ADFContext.getCurrent().getPageFlowScope().put("buChangeFlag", "N");
            }
        }catch (Exception e) {            
            e.printStackTrace();
        }
    }

    public void deleteAccountingParamAL(ActionEvent actionEvent) {
        try {
            
            DCBindingContainer binding = (DCBindingContainer) BindingContext.getCurrent().getCurrentBindingsEntry();
            DCIteratorBinding bindingIterator = binding.findIteratorBinding("BuAccountingParamsVO1Iterator");
            RowSetIterator row = bindingIterator.getRowSetIterator();
            if(bindingIterator != null){
                BuAccountingParamsVORowImpl currentRow = (BuAccountingParamsVORowImpl) row.getCurrentRow();
                if(currentRow != null && currentRow.getEntity(0).getEntityState() == 0){
                    currentRow.remove();    
                    ADFContext.getCurrent().getPageFlowScope().put("buChangeFlag", "N");
                }else{
                    showPopupMessage("Only New Record can be deleted", FacesMessage.SEVERITY_ERROR);
                }
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void createGrpCustMapAL(ActionEvent actionEvent) {
        try {
            
            String message = (String) executeMethod("createGroupCustomerMap");
            if(!"Success".equals(message)){
                showPopupMessage(message, FacesMessage.SEVERITY_ERROR);
            }else{
                ADFContext.getCurrent().getPageFlowScope().put("buChangeFlag", "N");
            }
        }catch (Exception e) {            
            e.printStackTrace();
        }
    }

    public void deleteGrpCustMapAL(ActionEvent actionEvent) {
        try {
            ADFContext.getCurrent().getPageFlowScope().put("buChangeFlag", "N");
            DCBindingContainer binding = (DCBindingContainer) BindingContext.getCurrent().getCurrentBindingsEntry();
            DCIteratorBinding bindingIterator = binding.findIteratorBinding("GroupCustomerMapVO1Iterator");
            RowSetIterator row = bindingIterator.getRowSetIterator();
            if(bindingIterator != null){
                GroupCustomerMapVORowImpl currentRow = (GroupCustomerMapVORowImpl) row.getCurrentRow();
                if(currentRow != null && currentRow.getEntity(0).getEntityState() == 0){
                    currentRow.remove();    
                }else{
                    showPopupMessage("Only New Record can be deleted", FacesMessage.SEVERITY_ERROR);
                }
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setupTypeVL(ValueChangeEvent valueChangeEvent) {
        try {            
            valueChangeEvent.getComponent().processUpdates(FacesContext.getCurrentInstance());
            String message = (String) executeMethod("acctParamsSetupTypeChange");
            if(!"Success".equals(message)){                                
                showPopupMessage(message, FacesMessage.SEVERITY_ERROR);
            }
            addPartialTrigger(getSetUpTypeBind());
            addPartialTrigger(getAccParamEffToBind());
            addPartialTrigger(getAccParamEffFromBind());
            addPartialTrigger(getArSourceBind());
            addPartialTrigger(getArContextBind());
            addPartialTrigger(getArTrxntypeBind());
            addPartialTrigger(getGlSourceBind());
            addPartialTrigger(getGlCategoryBind());
            addPartialTrigger(getPaCategoryBind());
            
            ADFContext.getCurrent().getPageFlowScope().put("buChangeFlag", "N");
            
            addPartialTrigger(getSearchBuBind());
            addPartialTrigger(getSearchDivisionBind());
            
            
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void requestingBuVL(ValueChangeEvent valueChangeEvent) {
        try {
            ADFContext.getCurrent().getPageFlowScope().put("buChangeFlag", "N");
            valueChangeEvent.getComponent().processUpdates(FacesContext.getCurrentInstance());
            String message = (String) executeMethod("acctParamsReqBuChange");
            if(!"Success".equals(message)){
                showPopupMessage(message, FacesMessage.SEVERITY_ERROR);
                addPartialTrigger(getReqBuBind());
                addPartialTrigger(getGrpCustEffFromBind());
                addPartialTrigger(getGrpCustEffToBind());
                addPartialTrigger(getSearchBuBind());
                addPartialTrigger(getSearchDivisionBind());
            }else{
                addPartialTrigger(getGrpCustEffFromBind());
                addPartialTrigger(getGrpCustEffToBind());
                addPartialTrigger(getSearchBuBind());
                addPartialTrigger(getSearchDivisionBind());
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setSetUpTypeBind(RichInputComboboxListOfValues setUpTypeBind) {
        this.setUpTypeBind = setUpTypeBind;
    }

    public RichInputComboboxListOfValues getSetUpTypeBind() {
        return setUpTypeBind;
    }

    public void setArSourceBind(RichInputComboboxListOfValues arSourceBind) {
        this.arSourceBind = arSourceBind;
    }

    public RichInputComboboxListOfValues getArSourceBind() {
        return arSourceBind;
    }

    public void setArTrxntypeBind(RichInputComboboxListOfValues arTrxntypeBind) {
        this.arTrxntypeBind = arTrxntypeBind;
    }

    public RichInputComboboxListOfValues getArTrxntypeBind() {
        return arTrxntypeBind;
    }

    public void setArContextBind(RichInputComboboxListOfValues arContextBind) {
        this.arContextBind = arContextBind;
    }

    public RichInputComboboxListOfValues getArContextBind() {
        return arContextBind;
    }

    public void setGlSourceBind(RichInputComboboxListOfValues glSourceBind) {
        this.glSourceBind = glSourceBind;
    }

    public RichInputComboboxListOfValues getGlSourceBind() {
        return glSourceBind;
    }

    public void setGlCategoryBind(RichInputComboboxListOfValues glCategoryBind) {
        this.glCategoryBind = glCategoryBind;
    }

    public RichInputComboboxListOfValues getGlCategoryBind() {
        return glCategoryBind;
    }

    public void setPaCategoryBind(RichInputComboboxListOfValues paCategoryBind) {
        this.paCategoryBind = paCategoryBind;
    }

    public RichInputComboboxListOfValues getPaCategoryBind() {
        return paCategoryBind;
    }

    public void setAccParamEffToBind(RichInputDate accParamEffToBind) {
        this.accParamEffToBind = accParamEffToBind;
    }

    public RichInputDate getAccParamEffToBind() {
        return accParamEffToBind;
    }

    public void setReqBuBind(RichInputComboboxListOfValues reqBuBind) {
        this.reqBuBind = reqBuBind;
    }

    public RichInputComboboxListOfValues getReqBuBind() {
        return reqBuBind;
    }

    public void setGrpCustEffFromBind(RichInputDate grpCustEffFromBind) {
        this.grpCustEffFromBind = grpCustEffFromBind;
    }

    public RichInputDate getGrpCustEffFromBind() {
        return grpCustEffFromBind;
    }

    public void setGrpCustEffToBind(RichInputDate grpCustEffToBind) {
        this.grpCustEffToBind = grpCustEffToBind;
    }

    public RichInputDate getGrpCustEffToBind() {
        return grpCustEffToBind;
    }

    public void setAccParamEffFromBind(RichInputDate accParamEffFromBind) {
        this.accParamEffFromBind = accParamEffFromBind;
    }

    public RichInputDate getAccParamEffFromBind() {
        return accParamEffFromBind;
    }

    public void searchAccParamsVL(ValueChangeEvent valueChangeEvent) {            
        try {
            if("Y".equals(ADFContext.getCurrent().getPageFlowScope().get("buChangeFlag"))){
                valueChangeEvent.getComponent().processUpdates(FacesContext.getCurrentInstance());
                ADFContext.getCurrent().getPageFlowScope().put("onlyBuChangeFlag", "Y");
                String message = (String) executeMethod("searchBuAccountingParams");
                addPartialTrigger(getGrpCustMapTableBind());
                addPartialTrigger(getAccParamsTableBind());
            }else{
                getSearchBuBind().setValue(valueChangeEvent.getOldValue());
                getSearchBuBind().setAutoSubmit(true);
                addPartialTrigger(getSearchBuBind());
                showPopupMessage("Please save or cancel the changes to continue.", FacesMessage.SEVERITY_ERROR);
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setGrpCustMapTableBind(RichTable grpCustMapTableBind) {
        this.grpCustMapTableBind = grpCustMapTableBind;
    }

    public RichTable getGrpCustMapTableBind() {
        return grpCustMapTableBind;
    }

    public void setAccParamsTableBind(RichTable accParamsTableBind) {
        this.accParamsTableBind = accParamsTableBind;
    }

    public RichTable getAccParamsTableBind() {
        return accParamsTableBind;
    }

    public void sourceVL(ValueChangeEvent valueChangeEvent) {
        try {
            valueChangeEvent.getComponent().processUpdates(FacesContext.getCurrentInstance());
            String message = (String) executeMethod("acctParamsSetupTypeChange");
            if(!"Success".equals(message)){                
                addPartialTrigger(getSetUpTypeBind());
                addPartialTrigger(getAccParamEffToBind());
                addPartialTrigger(getAccParamEffFromBind());
                showPopupMessage(message, FacesMessage.SEVERITY_ERROR);
            }            
            addPartialTrigger(getArSourceBind());
            addPartialTrigger(getArContextBind());
            addPartialTrigger(getArTrxntypeBind());
            addPartialTrigger(getGlSourceBind());
            addPartialTrigger(getGlCategoryBind());
            addPartialTrigger(getPaCategoryBind());                        
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

    public void searchAccParamsDivVL(ValueChangeEvent valueChangeEvent) {
        try {
            if("Y".equals(ADFContext.getCurrent().getPageFlowScope().get("buChangeFlag"))){
                valueChangeEvent.getComponent().processUpdates(FacesContext.getCurrentInstance());
                String message = (String) executeMethod("searchBuAccountingParams");
                addPartialTrigger(getGrpCustMapTableBind());
                addPartialTrigger(getAccParamsTableBind());
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

    public void accParamsEffToVL(ValueChangeEvent valueChangeEvent) {
        try {
            valueChangeEvent.getComponent().processUpdates(FacesContext.getCurrentInstance());
            String message = (String) executeMethod("accParamsEndDateChange");
            if(!"Success".equals(message)){
                showPopupMessage(message, FacesMessage.SEVERITY_ERROR);
                addPartialTrigger(getAccParamEffToBind());
            }else{
                ADFContext.getCurrent().getPageFlowScope().put("buChangeFlag", "N");
                addPartialTrigger(getSearchBuBind());
                addPartialTrigger(getSearchDivisionBind());
                
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void grpCustEffToVL(ValueChangeEvent valueChangeEvent) {
        try {
            valueChangeEvent.getComponent().processUpdates(FacesContext.getCurrentInstance());
            String message = (String) executeMethod("grpCustEndDateChange");
            if(!"Success".equals(message)){
                showPopupMessage(message, FacesMessage.SEVERITY_ERROR);
                addPartialTrigger(getGrpCustEffToBind());
            }else{
                ADFContext.getCurrent().getPageFlowScope().put("buChangeFlag", "N");
                addPartialTrigger(getSearchBuBind());
                addPartialTrigger(getSearchDivisionBind());
                
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void accParamEffFromVL(ValueChangeEvent valueChangeEvent) {
        try {            
            ADFContext.getCurrent().getPageFlowScope().put("accParamFromDateChanged", "Y");
            valueChangeEvent.getComponent().processUpdates(FacesContext.getCurrentInstance());
            String message = (String) executeMethod("acctParamsSetupTypeChange");
            ADFContext.getCurrent().getPageFlowScope().put("accParamFromDateChanged", "N");
            if(!"Success".equals(message)){                                
                showPopupMessage(message, FacesMessage.SEVERITY_ERROR);
            }
            addPartialTrigger(getSetUpTypeBind());
            addPartialTrigger(getAccParamEffToBind());
            addPartialTrigger(getAccParamEffFromBind());
            addPartialTrigger(getArSourceBind());
            addPartialTrigger(getArContextBind());
            addPartialTrigger(getArTrxntypeBind());
            addPartialTrigger(getGlSourceBind());
            addPartialTrigger(getGlCategoryBind());
            addPartialTrigger(getPaCategoryBind());
            
            ADFContext.getCurrent().getPageFlowScope().put("buChangeFlag", "N");
            
            addPartialTrigger(getSearchBuBind());
            addPartialTrigger(getSearchDivisionBind());
            
            
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void createDivisionAccMapAL(ActionEvent actionEvent) 
    {
        try {
            
            String message = (String) executeMethod("createDivisionAccMap");
            if(!"Success".equals(message)){
                showPopupMessage(message, FacesMessage.SEVERITY_ERROR);
            }
        }catch (Exception e) {            
            e.printStackTrace();
        }
    }

    public void deleteDivisionAccMapAL(ActionEvent actionEvent) 
    {
        try {
            
            DCBindingContainer binding = (DCBindingContainer) BindingContext.getCurrent().getCurrentBindingsEntry();
            DCIteratorBinding bindingIterator = binding.findIteratorBinding("DivisionAccountMapVO1Iterator1");
            RowSetIterator row = bindingIterator.getRowSetIterator();
            if(bindingIterator != null){
                DivisionAccountMapVORowImpl currentRow = (DivisionAccountMapVORowImpl) row.getCurrentRow();
                if(currentRow != null && currentRow.getEntity(0).getEntityState() == 0){
                    currentRow.remove();    
                    //ADFContext.getCurrent().getPageFlowScope().put("buChangeFlag", "N");
                }else{
                    showPopupMessage("Only New Record can be deleted", FacesMessage.SEVERITY_ERROR);
                }
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void startDateDivisonAccMapVL(ValueChangeEvent valueChangeEvent) 
    {
        try {
            //ADFContext.getCurrent().getPageFlowScope().put("buChangeFlag", "N");
            valueChangeEvent.getComponent().processUpdates(FacesContext.getCurrentInstance());
            String message = (String) executeMethod("startDateDivisonAccMap");
            if(!"Success".equals(message)){
                showPopupMessage(message, FacesMessage.SEVERITY_ERROR);
            }else{
                addPartialTrigger(getStartDateDivAccMap());
                addPartialTrigger(getEndDateDivAccMap());
                addPartialTrigger(getSearchBuBind());
                addPartialTrigger(getSearchDivisionBind());
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setStartDateDivAccMap(RichInputDate startDateDivAccMap) {
        this.startDateDivAccMap = startDateDivAccMap;
    }

    public RichInputDate getStartDateDivAccMap() {
        return startDateDivAccMap;
    }

    public void setEndDateDivAccMap(RichInputDate endDateDivAccMap) {
        this.endDateDivAccMap = endDateDivAccMap;
    }

    public RichInputDate getEndDateDivAccMap() {
        return endDateDivAccMap;
    }

    public void endDateDIvAccMapVL(ValueChangeEvent valueChangeEvent) {
        // Add event code here...
    }

    public void endDateDivAccMapVL(ValueChangeEvent valueChangeEvent)
    {
        try {
            valueChangeEvent.getComponent().processUpdates(FacesContext.getCurrentInstance());
            String message = (String) executeMethod("startDateDivisonAccMap");
            if(!"Success".equals(message)){
                showPopupMessage(message, FacesMessage.SEVERITY_ERROR);
                addPartialTrigger(getEndDateDivAccMap());
            }else{
                //ADFContext.getCurrent().getPageFlowScope().put("buChangeFlag", "N");
                addPartialTrigger(getSearchBuBind());
                addPartialTrigger(getSearchDivisionBind());
                
            }
        }catch (Exception e) {
            e.printStackTrace();
        } 
    }

    public void setDivisionAccMapTableBind(RichTable divisionAccMapTableBind) {
        this.divisionAccMapTableBind = divisionAccMapTableBind;
    }

    public RichTable getDivisionAccMapTableBind() {
        return divisionAccMapTableBind;
    }
}
