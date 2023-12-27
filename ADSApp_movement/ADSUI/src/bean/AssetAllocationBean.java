package bean;

import java.util.Map;

import javax.faces.event.ActionEvent;
import javax.faces.application.FacesMessage;

import javax.faces.context.FacesContext;
import javax.faces.event.ValueChangeEvent;

import oracle.adf.share.ADFContext;
import oracle.adf.view.rich.component.rich.RichDialog;
import oracle.adf.view.rich.component.rich.RichPopup;
import oracle.adf.view.rich.component.rich.data.RichTable;
import oracle.adf.view.rich.component.rich.input.RichInputComboboxListOfValues;
import oracle.adf.view.rich.component.rich.input.RichInputDate;
import oracle.adf.view.rich.component.rich.input.RichSelectBooleanCheckbox;
import oracle.adf.view.rich.component.rich.layout.RichPanelGroupLayout;
import oracle.adf.view.rich.event.DialogEvent;

import oracle.jbo.domain.Date;

public class AssetAllocationBean extends CommonBean{
    private RichTable allocationSearchTblBindgs;
    private RichPopup populateLinesPopupBind;
    private RichSelectBooleanCheckbox selectAllBind;
    private RichTable allocationLinesTblBindgs;
    private RichTable allocationDetailsBindgs;
    private RichPopup commitPopupBindgs;
    private RichInputDate dtlOnHireDateBindgs;
    private RichInputDate dtlOffHireDateBindgs;
    private RichTable populateContractLinesTblBind;
    private RichPopup cancelPopupBindgs;
    private RichDialog cancelDL;
    private RichPopup prInterfacePopupBindgs;
    private RichInputComboboxListOfValues assetNumBindgs;
    private RichPopup deleteAllocationConfirmPopupBindgs;
    private RichPanelGroupLayout allocationTrxnPageBindgs;

    public AssetAllocationBean() {
        super();
    }

    public void saveAllocationAL(ActionEvent actionEvent) 
    {
        try 
        {
            String newMsg = (String) executeMethod("generateAllocationNumber");
            if(!"Success".equals(newMsg)){
                showPopupMessage(newMsg, FacesMessage.SEVERITY_ERROR);
            }else{
                save();
                addPartialTrigger(getAllocationTrxnPageBindgs());
                ADFContext.getCurrent().getPageFlowScope().put("changesSaved", "Y");
            }
        }
        catch(Exception e) 
        {
            e.printStackTrace();    
        }
    }

    public void saveCloseAllocationAL(ActionEvent actionEvent) 
    {
        try 
        {
            String newMsg = (String) executeMethod("generateAllocationNumber");
            if(!"Success".equals(newMsg)){
                showPopupMessage(newMsg, FacesMessage.SEVERITY_ERROR);
            }else{
                save();
                navigateNew("Back");
                executeMethod("setAssetAllocationsSearch");
            }
//            addPartialTrigger(getAllocationSearchTblBindgs());
        }
        catch(Exception e) 
        {
            e.printStackTrace();    
        }
    }

    public void cancelAllocationAL(ActionEvent actionEvent) 
    {
        try 
        {
            if("N".equals(ADFContext.getCurrent().getPageFlowScope().get("changesSaved"))) 
            {
                showPopup(getCancelPopupBindgs());
            }
            else
            {
                cancel();
                navigateNew("Back");
                executeMethod("setAssetAllocationsSearch");
//                addPartialTrigger(getAllocationSearchTblBindgs());
            }
        }
        catch(Exception e) 
        {
            e.printStackTrace();    
        }
    }

    public void createAllocationAL(ActionEvent actionEvent) 
    {
        try 
        {
            setSearchAttributes();
            String msg = (String) executeMethod("createAllocation");
            if(!("Success".equals(msg))) 
            {
                showPopupMessage(msg, FacesMessage.SEVERITY_ERROR);    
            }
            else 
            {
                navigateNew("Create");
                ADFContext.getCurrent().getPageFlowScope().put("allocationEditFlag", "Y");
                ADFContext.getCurrent().getPageFlowScope().put("changesSaved", "N");
            }
        }
        catch(Exception e) 
        {
            e.printStackTrace();    
        }
    }

    public void editAllocationAL(ActionEvent actionEvent) 
    {
        try 
        {
            setSearchAttributes();
            String msg = (String) executeMethod("editAllocation");
            if(!("Success".equals(msg))) 
            {
                showPopupMessage(msg, FacesMessage.SEVERITY_ERROR);    
            }
            else 
            {
                navigateNew("Create");    
                ADFContext.getCurrent().getPageFlowScope().put("changesSaved", "Y");
            }
        }
        catch(Exception e) 
        {
            e.printStackTrace();    
        }
    }

    public void deleteAllocationAL(ActionEvent actionEvent) 
    {
        try 
        {
            showPopup(getDeleteAllocationConfirmPopupBindgs());
            
            
        }
        catch(Exception e) 
        {
            e.printStackTrace();    
        }
    }

    public void searchAllocationsAL(ActionEvent actionEvent) 
    {
        try 
        {
            String msg = (String) executeMethod("searchAssetAllocation");  
            if(!("Success".equals(msg))) {
                showPopupMessage(msg, FacesMessage.SEVERITY_ERROR);
            }
            else
            {
                addPartialTrigger(getAllocationSearchTblBindgs());
            }
        }
        catch(Exception e) 
        {
            e.printStackTrace();    
        }
    }

    public void resetAllocationsAL(ActionEvent actionEvent) 
    {
        try 
        {
            String msg = (String) executeMethod("resetAssetAllocations");  
            if(!("Success".equals(msg))) {
                showPopupMessage(msg, FacesMessage.SEVERITY_ERROR);
            }
            addPartialTrigger(getAllocationSearchTblBindgs());
        }
        catch(Exception e) 
        {
            e.printStackTrace();    
        }
    }

    public void setAllocationSearchTblBindgs(RichTable allocationSearchTblBindgs) {
        this.allocationSearchTblBindgs = allocationSearchTblBindgs;
    }

    public RichTable getAllocationSearchTblBindgs() {
        return allocationSearchTblBindgs;
    }
    
    public void setSearchAttributes(){
        try {
            Map pageFlowScope = ADFContext.getCurrent().getPageFlowScope();
            
            pageFlowScope.put("aaSrcBuName", getEL("#{bindings.TransSrcBuName.inputValue}"));
            pageFlowScope.put("aaSrcBuId", getEL("#{bindings.TransSrcBuId.inputValue}"));
            
            System.out.println((oracle.jbo.domain.Number) pageFlowScope.get("aaSrcBuId"));

            pageFlowScope.put("aaSrcDiv", getEL("#{bindings.TransSrcDivision.inputValue}"));
            pageFlowScope.put("aaSrcDivFlexValueId", getEL("#{bindings.TransSrcDivFlexValueId.inputValue}"));
            pageFlowScope.put("aaSrcDivFlexValueSetId", getEL("#{bindings.TransSrcDivFlexValueSetId.inputValue}"));
            pageFlowScope.put("aaReqBuId", getEL("#{bindings.TransReqBuId.inputValue}"));
            pageFlowScope.put("aaReqBuName", getEL("#{bindings.TransReqBuName.inputValue}"));
            pageFlowScope.put("aaContractNumber", getEL("#{bindings.TransContractNumber.inputValue}"));
            pageFlowScope.put("aaContractId", getEL("#{bindings.TransContractId.inputValue}"));
            pageFlowScope.put("aaCustTypeCode", getEL("#{bindings.TransCustTypeCode.inputValue}"));
            pageFlowScope.put("aaCustType", getEL("#{bindings.TransCustType.inputValue}"));
            pageFlowScope.put("aaProjectId", getEL("#{bindings.TransProjectId.inputValue}"));
            
            pageFlowScope.put("aaProject", getEL("#{bindings.TransProject.inputValue}"));
            pageFlowScope.put("aaDiv", getEL("#{bindings.TransDivision.inputValue}"));
            pageFlowScope.put("aaDivFlexValueId", getEL("#{bindings.TransDivFlexValueId.inputValue}"));
            pageFlowScope.put("aaDeptName", getEL("#{bindings.TransDeptName.inputValue}"));
            pageFlowScope.put("aaDeptFlexValueId", getEL("#{bindings.TransDeptFlexValueId.inputValue}"));
            pageFlowScope.put("aaCustomerName", getEL("#{bindings.TransCustomerName.inputValue}"));
            
            pageFlowScope.put("aaCustomerId", getEL("#{bindings.TransCustomerId.inputValue}"));
            pageFlowScope.put("aaAllocationNumber", getEL("#{bindings.TransAllocationNumber.inputValue}"));
            pageFlowScope.put("aaAllocationDate", getEL("#{bindings.TransAllocationDate.inputValue}"));
            pageFlowScope.put("aaSrcDivRequired", getEL("#{bindings.TransSrcDivRequired.inputValue}"));
            pageFlowScope.put("aaSrcDivSegmentNumber", getEL("#{bindings.TransSrcDivSegmentNumber.inputValue}"));
            
            pageFlowScope.put("aaReqDivSegmentNumber", getEL("#{bindings.TransReqDivSegmentNumber.inputValue}"));
            pageFlowScope.put("aaReqDeptSegmentNumber", getEL("#{bindings.TransReqDeptSegmentNumber.inputValue}"));
            
            
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void populateLinesAL(ActionEvent actionEvent) 
    {
        try 
        {
            if("N".equals(ADFContext.getCurrent().getPageFlowScope().get("changesSaved"))) {
                showPopup(getCommitPopupBindgs());
            }
            else
            {
                String msg = (String) executeMethod("getPopContractLines");
                if(!("Success".equals(msg)))
                {
                    showPopupMessage(msg, FacesMessage.SEVERITY_ERROR);
                }
                else 
                {
//                    ADFContext.getCurrent().getPageFlowScope().put("changesSaved", "Y");
                    showPopup(getPopulateLinesPopupBind());
                }
            }
        }
        catch(Exception e) 
        {
            e.printStackTrace();    
        }
    }

    public void generatePRAL(ActionEvent actionEvent) 
    {
        try 
        {
            String msg = (String) executeMethod("validatePRDetails");
            if(!("Success".equals(msg))) 
            {
                showPopupMessage(msg, FacesMessage.SEVERITY_ERROR);    
            }
            else
            {
                
                executeMethod("createTransPRPopupSearch");
                showPopup(getPrInterfacePopupBindgs());
            }
        }
        catch(Exception e) 
        {
            e.printStackTrace();    
        }
    }

    public void viewHirePODetailsAL(ActionEvent actionEvent) 
    {
        try 
        {
            String msg = (String) executeMethod("viewPODetails");
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

    public void generateDOAL(ActionEvent actionEvent) 
    {
        try 
        {
            String msg1 = (String) executeMethod("validateDetails");
            if(!("Success".equals(msg1))) {
                showPopupMessage(msg1, FacesMessage.SEVERITY_ERROR);
            }
            else
            {
                save();
                ADFContext.getCurrent().getPageFlowScope().put("changesSaved", "Y");
                String msg = (String) executeMethod("generateDO");
                if(!("Success".equals(msg))) 
                {
                    showPopupMessage(msg, FacesMessage.SEVERITY_ERROR);    
                }
                else 
                {
                    addPartialTrigger(getAllocationTrxnPageBindgs());
                }
            }
        }
        catch(Exception e) 
        {
            e.printStackTrace();    
        }
    }

    public void popContractLinesAL(ActionEvent actionEvent) 
    {
        try 
        {
            String message = (String) executeMethod("allocateContractLines");
            if(!"Success".equals(message)){
                showPopupMessage(message, FacesMessage.SEVERITY_ERROR);
            }else{
//                save();
                ADFContext.getCurrent().getPageFlowScope().put("changesSaved", "Y");
                getPopulateLinesPopupBind().hide();
                addPartialTrigger(getAllocationLinesTblBindgs());
                addPartialTrigger(getAllocationDetailsBindgs());
            }
        }
        catch(Exception e) 
        {
            e.printStackTrace();    
        }
    }

    public void closePopLinesAL(ActionEvent actionEvent) 
    {
        try 
        {
            getPopulateLinesPopupBind().hide();
        }
        catch(Exception e) 
        {
            e.printStackTrace();    
        }
    }

    public void setPopulateLinesPopupBind(RichPopup populateLinesPopupBind) {
        this.populateLinesPopupBind = populateLinesPopupBind;
    }

    public RichPopup getPopulateLinesPopupBind() {
        return populateLinesPopupBind;
    }

    public void setSelectAllBind(RichSelectBooleanCheckbox selectAllBind) {
        this.selectAllBind = selectAllBind;
    }

    public RichSelectBooleanCheckbox getSelectAllBind() {
        return selectAllBind;
    }

    public void selectAllLineChangeVL(ValueChangeEvent valueChangeEvent) 
    {
        try 
        {
            if (!(valueChangeEvent.getNewValue().equals(valueChangeEvent.getOldValue()))) 
            {
                Boolean isMarked = (Boolean)valueChangeEvent.getNewValue();
                if(isMarked)
                {
                    ADFContext.getCurrent().getPageFlowScope().put("isMarked", "Y");
                }
                else
                {
                    ADFContext.getCurrent().getPageFlowScope().put("isMarked", "N");
                }
                executeMethod("selectContractLinesforAllocation");
                addPartialTrigger(getPopulateContractLinesTblBind());
            }
        }
        catch(Exception e) 
        {
            e.printStackTrace();    
        }
    }

    public void setAllocationLinesTblBindgs(RichTable allocationLinesTblBindgs) {
        this.allocationLinesTblBindgs = allocationLinesTblBindgs;
    }

    public RichTable getAllocationLinesTblBindgs() {
        return allocationLinesTblBindgs;
    }

    public void setAllocationDetailsBindgs(RichTable allocationDetailsBindgs) {
        this.allocationDetailsBindgs = allocationDetailsBindgs;
    }

    public RichTable getAllocationDetailsBindgs() {
        return allocationDetailsBindgs;
    }

    public void deleteAllocationLineAL(ActionEvent actionEvent) 
    {
        try 
        {
            String msg = (String) executeMethod("deleteAllocationLine");  
            if(!("Success".equals(msg))) 
            {
                showPopupMessage(msg, FacesMessage.SEVERITY_ERROR);    
            }
            addPartialTrigger(getAllocationLinesTblBindgs());
            ADFContext.getCurrent().getPageFlowScope().put("changesSaved", "N");
        }
        catch(Exception e) 
        {
            e.printStackTrace();    
        }
    }

    public void createAllocationDetailAL(ActionEvent actionEvent) 
    {
        try 
        {
            String msg = (String) executeMethod("createAllocationDetails");
            if(!("Success".equals(msg))) 
            {
                showPopupMessage(msg, FacesMessage.SEVERITY_ERROR);    
            }
            ADFContext.getCurrent().getPageFlowScope().put("changesSaved", "N");
        }
        catch(Exception e) 
        {
            e.printStackTrace();  
        }
    }

    public void deleteAllocationDetailAL(ActionEvent actionEvent) 
    {
        try 
        {
            String msg = (String) executeMethod("deleteAllocationDetail");
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

    public void saveConfirmDL(DialogEvent dialogEvent) 
    {
        try 
        {
            if(dialogEvent.getOutcome().equals(DialogEvent.Outcome.yes)) 
            {
                String newMsg = (String) executeMethod("generateAllocationNumber");
                if(!"Success".equals(newMsg)){
                    showPopupMessage(newMsg, FacesMessage.SEVERITY_ERROR);
                }else{
                    save();
                    ADFContext.getCurrent().getPageFlowScope().put("changesSaved", "Y");
                    String msg = (String) executeMethod("getPopContractLines");
                    if(!("Success".equals(msg)))
                    {
                        showPopupMessage(msg, FacesMessage.SEVERITY_ERROR);
                    }
                    else 
                    {
                        ADFContext.getCurrent().getPageFlowScope().put("changesSaved", "Y");
                        showPopup(getPopulateLinesPopupBind());
                    }
                }
            }
        }
        catch(Exception e) 
        {
            e.printStackTrace();    
        }
    }

    public void setCommitPopupBindgs(RichPopup commitPopupBindgs) {
        this.commitPopupBindgs = commitPopupBindgs;
    }

    public RichPopup getCommitPopupBindgs() {
        return commitPopupBindgs;
    }
    
    public Date getTransMaxDate() {
        Date maxStartDate =
            new Date((oracle.jbo.domain.Date)oracle.jbo.domain.Date.getCurrentDate());
        
        return maxStartDate;
    }

    public void dtlOnHireDateVL(ValueChangeEvent valueChangeEvent) 
    {
        try 
        {
            valueChangeEvent.getComponent().processUpdates(FacesContext.getCurrentInstance());
            String msg = (String) executeMethod("validateDtlOnHireDate");
            if(!("Success".equals(msg))) 
            {
                showPopupMessage(msg, FacesMessage.SEVERITY_ERROR);  
            }
            else 
            {
                addPartialTrigger(getDtlOnHireDateBindgs());    
            }
        }
        catch(Exception e) 
        {
            e.printStackTrace();    
        }
    }

    public void dtlOffHireDateVL(ValueChangeEvent valueChangeEvent) 
    {
        try 
        {
            valueChangeEvent.getComponent().processUpdates(FacesContext.getCurrentInstance());
            String msg = (String) executeMethod("validateDtlOffHireDate");
            if(!("Success".equals(msg)))
            {
                showPopupMessage(msg, FacesMessage.SEVERITY_ERROR);                
            }
            else 
            {
                addPartialTrigger(getDtlOffHireDateBindgs());
            }
        }
        catch(Exception e) 
        {
            e.printStackTrace();    
        }
    }

    public void setDtlOnHireDateBindgs(RichInputDate dtlOnHireDateBindgs) {
        this.dtlOnHireDateBindgs = dtlOnHireDateBindgs;
    }

    public RichInputDate getDtlOnHireDateBindgs() {
        return dtlOnHireDateBindgs;
    }

    public void setDtlOffHireDateBindgs(RichInputDate dtlOffHireDateBindgs) {
        this.dtlOffHireDateBindgs = dtlOffHireDateBindgs;
    }

    public RichInputDate getDtlOffHireDateBindgs() {
        return dtlOffHireDateBindgs;
    }

    public void setPopulateContractLinesTblBind(RichTable populateContractLinesTblBind) {
        this.populateContractLinesTblBind = populateContractLinesTblBind;
    }

    public RichTable getPopulateContractLinesTblBind() {
        return populateContractLinesTblBind;
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
            executeMethod("setAssetAllocationsSearch");
//            addPartialTrigger(getAllocationSearchTblBindgs());
        }
    }

    public void srcBuChangeVL(ValueChangeEvent valueChangeEvent) 
    {
        try
        {
            valueChangeEvent.getComponent().processUpdates(FacesContext.getCurrentInstance());
            ADFContext.getCurrent().getPageFlowScope().put("changesSaved", "N");
        }
        catch(Exception e) 
        {
            e.printStackTrace();    
        }
    }

    public void srcDivChangeVL(ValueChangeEvent valueChangeEvent) 
    {
        try
        {
            valueChangeEvent.getComponent().processUpdates(FacesContext.getCurrentInstance());
            ADFContext.getCurrent().getPageFlowScope().put("changesSaved", "N");
        }
        catch(Exception e) 
        {
            e.printStackTrace();    
        }
    }

    public void reqBuChangeVL(ValueChangeEvent valueChangeEvent) 
    {
        try
        {
            valueChangeEvent.getComponent().processUpdates(FacesContext.getCurrentInstance());
            ADFContext.getCurrent().getPageFlowScope().put("changesSaved", "N");
        }
        catch(Exception e) 
        {
            e.printStackTrace();    
        }
    }

    public void contractNumChangeVL(ValueChangeEvent valueChangeEvent) 
    {
        try
        {
            valueChangeEvent.getComponent().processUpdates(FacesContext.getCurrentInstance());
            ADFContext.getCurrent().getPageFlowScope().put("changesSaved", "N");
        }
        catch(Exception e) 
        {
            e.printStackTrace();    
        }
    }

    public void remarksChangeVL(ValueChangeEvent valueChangeEvent) 
    {
        try
        {
            valueChangeEvent.getComponent().processUpdates(FacesContext.getCurrentInstance());
            ADFContext.getCurrent().getPageFlowScope().put("changesSaved", "N");
        }
        catch(Exception e) 
        {
            e.printStackTrace();    
        }
    }

    public void setPrInterfacePopupBindgs(RichPopup prInterfacePopupBindgs) {
        this.prInterfacePopupBindgs = prInterfacePopupBindgs;
    }

    public RichPopup getPrInterfacePopupBindgs() {
        return prInterfacePopupBindgs;
    }

    public void prInterfaceDL(DialogEvent dialogEvent) 
    {
        try 
        {
            if(dialogEvent.getOutcome() == DialogEvent.Outcome.ok)
            {
                save();
                String msg = (String) executeMethod("generatePR");
                if(!("Success".equals(msg))) 
                {
                    showPopupMessage(msg, FacesMessage.SEVERITY_ERROR);    
                }
                else
                {
                    getPrInterfacePopupBindgs().cancel();
                    addPartialTrigger(getAllocationDetailsBindgs());
                }
                     
            }
        }
        catch(Exception e) 
        {
            e.printStackTrace();    
        }
    }

    public void assetNumberVL(ValueChangeEvent valueChangeEvent) 
    {
        try 
        {
            valueChangeEvent.getComponent().processUpdates(FacesContext.getCurrentInstance());
            String msg = (String) executeMethod("allocatedAssetEmpNumChange");
            if(!("Success".equals(msg))) 
            {
                addPartialTrigger(getAssetNumBindgs());
                showPopupMessage(msg, FacesMessage.SEVERITY_ERROR);    
            }
        }
        catch(Exception e) 
        {
            e.printStackTrace();    
        }
    }

    public void setAssetNumBindgs(RichInputComboboxListOfValues assetNumBindgs) {
        this.assetNumBindgs = assetNumBindgs;
    }

    public RichInputComboboxListOfValues getAssetNumBindgs() {
        return assetNumBindgs;
    }

    public void deleteAllocationConfirmDL(DialogEvent dialogEvent) 
    {
        try 
        {
            if(dialogEvent.getOutcome() == DialogEvent.Outcome.yes)
            {
                String msg = (String) executeMethod("deleteAllocation");
                if(!("Success".equals(msg))) 
                {
                    showPopupMessage(msg, FacesMessage.SEVERITY_ERROR);    
                }
            }
            else 
            {
                getDeleteAllocationConfirmPopupBindgs().cancel();    
            }
        }
        catch(Exception e) 
        {
            e.printStackTrace();    
        }
    }

    public void setDeleteAllocationConfirmPopupBindgs(RichPopup deleteAllocationConfirmPopupBindgs) {
        this.deleteAllocationConfirmPopupBindgs = deleteAllocationConfirmPopupBindgs;
    }

    public RichPopup getDeleteAllocationConfirmPopupBindgs() {
        return deleteAllocationConfirmPopupBindgs;
    }

    public void setAllocationTrxnPageBindgs(RichPanelGroupLayout allocationTrxnPageBindgs) {
        this.allocationTrxnPageBindgs = allocationTrxnPageBindgs;
    }

    public RichPanelGroupLayout getAllocationTrxnPageBindgs() {
        return allocationTrxnPageBindgs;
    }

    public void navigateToDO(ActionEvent actionEvent) {
        try {
            navigateNew("DoDetails");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
