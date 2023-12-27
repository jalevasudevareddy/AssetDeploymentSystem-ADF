package bean;

import javax.faces.event.ActionEvent;

import javax.faces.event.ValueChangeEvent;

import oracle.adf.view.rich.component.rich.data.RichTable;

import javax.faces.application.FacesMessage;

import javax.faces.context.FacesContext;

import javax.faces.context.FacesContextFactory;

import model.view.EmployeeCertificationsVORowImpl;
import model.view.EmployeeMasterVORowImpl;

import oracle.adf.model.BindingContext;
import oracle.adf.model.binding.DCBindingContainer;
import oracle.adf.model.binding.DCIteratorBinding;

import oracle.adf.share.ADFContext;
import oracle.adf.view.rich.component.rich.input.RichInputDate;

import oracle.jbo.ViewObject;

public class EmployeeMasterBean extends CommonBean{
    private RichTable certificationsTblBind;
    private RichTable empMstrTblBind;
    private RichInputDate empEffectiveFromBindgs;

    public EmployeeMasterBean() {
        super();
    }

    public void searchEmployeesAL(ActionEvent actionEvent) {
        try {
            String message = (String) executeMethod("searchEmpMaster");
            if(!"Success".equals(message)){
                showPopupMessage(message, FacesMessage.SEVERITY_ERROR);
            }else{
                addPartialTrigger(getEmpMstrTblBind());
                addPartialTrigger(getCertificationsTblBind());
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void resetEmployeeSearchAL(ActionEvent actionEvent) {
        try {
            String message = (String) executeMethod("resetEmpSearch");
            if(!"Success".equals(message)){
                showPopupMessage(message, FacesMessage.SEVERITY_ERROR);
            }else{
                addPartialTrigger(getEmpMstrTblBind());
                addPartialTrigger(getCertificationsTblBind());
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }    

    public void empSourceVL(ValueChangeEvent valueChangeEvent) {
        try {
            String message = (String) executeMethod("empSourceChange");
            ADFContext.getCurrent().getPageFlowScope().put("empSearchEnableFlag", "N");
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void createEmployeeMasterAL(ActionEvent actionEvent) {
        try {
            
            executeMethod("addNewEmp");
            ADFContext.getCurrent().getPageFlowScope().put("empSearchEnableFlag", "N");
           /* DCBindingContainer binding = (DCBindingContainer) BindingContext.getCurrent().getCurrentBindingsEntry();
            DCIteratorBinding bindingIterator = binding.findIteratorBinding("EmployeeMasterVO1Iterator");            
            
            if(bindingIterator != null){
                ViewObject vo = bindingIterator.getViewObject();
                EmployeeMasterVORowImpl newRow = (EmployeeMasterVORowImpl) vo.createRow();                
                vo.insertRow(newRow);
                newRow.setBuId((oracle.jbo.domain.Number) getEL("#{bindings.TransBuId.inputValue}"));
                newRow.setDivision((String) getEL("#{bindings.TransDivision.inputValue}"));
                newRow.setDivFlexValueId((oracle.jbo.domain.Number) getEL("#{bindings.TransDivFlexValueId.inputValue}"));
                newRow.setDivFlexValueSetId((oracle.jbo.domain.Number) getEL("#{bindings.TransDivFlexValSetId.inputValue}"));
            }*/
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void deleteEmployeeMasterAL(ActionEvent actionEvent) {
        try {
            String message = (String) executeMethod("deleteEmployee");
            if(!"Success".equals(message)){
                showPopupMessage(message, FacesMessage.SEVERITY_ERROR);
            }
            else {
                ADFContext.getCurrent().getPageFlowScope().put("empSearchEnableFlag", "N");
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void createEmpCertificationAL(ActionEvent actionEvent) {
        try {
            DCBindingContainer binding = (DCBindingContainer) BindingContext.getCurrent().getCurrentBindingsEntry();
            DCIteratorBinding bindingIterator = binding.findIteratorBinding("EmployeeCertificationsVO1Iterator");            
            
            if(bindingIterator != null){
                ViewObject vo = bindingIterator.getViewObject();
                EmployeeCertificationsVORowImpl newRow = (EmployeeCertificationsVORowImpl) vo.createRow();                
                vo.insertRow(newRow);
                ADFContext.getCurrent().getPageFlowScope().put("empSearchEnableFlag", "N");
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void deleteEmpCertificationAL(ActionEvent actionEvent) {
        try {
            DCBindingContainer binding = (DCBindingContainer) BindingContext.getCurrent().getCurrentBindingsEntry();
            DCIteratorBinding bindingIterator = binding.findIteratorBinding("EmployeeCertificationsVO1Iterator");            
            
            if(bindingIterator != null){
                ViewObject vo = bindingIterator.getViewObject();
                EmployeeCertificationsVORowImpl currRow = (EmployeeCertificationsVORowImpl) vo.getCurrentRow();
                if(currRow != null){
                    currRow.remove();
                    ADFContext.getCurrent().getPageFlowScope().put("empSearchEnableFlag", "N");
                }
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void setCertificationsTblBind(RichTable certificationsTblBind) {
        this.certificationsTblBind = certificationsTblBind;
    }

    public RichTable getCertificationsTblBind() {
        return certificationsTblBind;
    }

    public void setEmpMstrTblBind(RichTable empMstrTblBind) {
        this.empMstrTblBind = empMstrTblBind;
    }

    public RichTable getEmpMstrTblBind() {
        return empMstrTblBind;
    }

    public void effectiveToVL(ValueChangeEvent valueChangeEvent) {
        try {
            valueChangeEvent.getComponent().processUpdates(FacesContext.getCurrentInstance());
            String message = (String) executeMethod("empEffectiveToChange");
            ADFContext.getCurrent().getPageFlowScope().put("empSearchEnableFlag", "N");
            if(!"Success".equals(message))
            {
                showPopupMessage(message, FacesMessage.SEVERITY_ERROR);
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void empCertificateTypeVL(ValueChangeEvent valueChangeEvent) {
        try {
            valueChangeEvent.getComponent().processUpdates(FacesContext.getCurrentInstance());
            String message = (String) executeMethod("empCertificateTypeChange");
            ADFContext.getCurrent().getPageFlowScope().put("empSearchEnableFlag", "N");
            if(!"Success".equals(message)){
                showPopupMessage(message, FacesMessage.SEVERITY_ERROR);
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void empCertFromDateVL(ValueChangeEvent valueChangeEvent) {
        try {
            valueChangeEvent.getComponent().processUpdates(FacesContext.getCurrentInstance());
            String message = (String) executeMethod("empCertFromDateChange");
            ADFContext.getCurrent().getPageFlowScope().put("empSearchEnableFlag", "N");
            if(!"Success".equals(message)){
                showPopupMessage(message, FacesMessage.SEVERITY_ERROR);
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void saveEmpAL(ActionEvent actionEvent) 
    {
        try 
        {
            String msg = (String) executeMethod("saveEmployee");
            if(!("Success".equals(msg))) {
                showPopupMessage(msg, FacesMessage.SEVERITY_ERROR);
            }
            else
            {
                ADFContext.getCurrent().getPageFlowScope().put("empSearchEnableFlag", "Y");
              save();
            }
        }
        catch(Exception e) 
        {
            e.printStackTrace();    
        }
    }

    public void saveCloseEmpAL(ActionEvent actionEvent) 
    {
        try 
        {
            String msg = (String) executeMethod("saveEmployee");
            if(!("Success".equals(msg))) {
                showPopupMessage(msg, FacesMessage.SEVERITY_ERROR);
            }
            else
            {
                save();
                closeCurrentActivity(actionEvent);
            }
            
        }
        catch(Exception e) 
        {
            e.printStackTrace();    
        }
    }

    public void cancelEmpAL(ActionEvent actionEvent) 
    {
        try 
        {
            cancel();
            closeCurrentActivity(actionEvent);
        }
        catch(Exception e) 
        {
            e.printStackTrace();    
        }
    }

    public void internalEmpNumVL(ValueChangeEvent valueChangeEvent) 
    {
        try 
        {
            valueChangeEvent.getComponent().processUpdates(FacesContext.getCurrentInstance());
            ADFContext.getCurrent().getPageFlowScope().put("empSearchEnableFlag", "N");
            String msg = (String) executeMethod("validateInternalEmpDuplicates");
            if(!("Success".equals(msg))) 
            {
                addPartialTrigger(getEmpEffectiveFromBindgs());
                showPopupMessage(msg, FacesMessage.SEVERITY_ERROR);
            }
            addPartialTrigger(getEmpEffectiveFromBindgs());
        }
        catch(Exception e) 
        {
            e.printStackTrace();    
        }
    }

    public void setEmpEffectiveFromBindgs(RichInputDate empEffectiveFromBindgs) {
        this.empEffectiveFromBindgs = empEffectiveFromBindgs;
    }

    public RichInputDate getEmpEffectiveFromBindgs() {
        return empEffectiveFromBindgs;
    }

    public void empEffectiveFromVL(ValueChangeEvent valueChangeEvent) 
    {
        try 
        {
            valueChangeEvent.getComponent().processUpdates(FacesContext.getCurrentInstance());
            ADFContext.getCurrent().getPageFlowScope().put("empSearchEnableFlag", "N");
            String msg = (String) executeMethod("empEffectiveFromChange");
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

    public void hiredEmpNumVL(ValueChangeEvent valueChangeEvent) 
    {
        valueChangeEvent.getComponent().processUpdates(FacesContext.getCurrentInstance());
        ADFContext.getCurrent().getPageFlowScope().put("empSearchEnableFlag", "N");
        String msg = (String) executeMethod("validateHiredEmpDuplicates");
        if(!("Success".equals(msg))) {
            showPopupMessage(msg, FacesMessage.SEVERITY_ERROR);
        }
    }

    public void empNameVL(ValueChangeEvent valueChangeEvent) 
    {
        try 
        {
            valueChangeEvent.getComponent().processUpdates(FacesContext.getCurrentInstance());  
            ADFContext.getCurrent().getPageFlowScope().put("empSearchEnableFlag", "N");
            String msg = (String) executeMethod("empNameChange");
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

    public void certificateSubTypeVL(ValueChangeEvent valueChangeEvent) 
    {
        try 
        {
            valueChangeEvent.getComponent().processUpdates(FacesContext.getCurrentInstance());
            ADFContext.getCurrent().getPageFlowScope().put("empSearchEnableFlag", "N");
            String msg =(String) executeMethod("empCertificateSubTypeChange");
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

    public void empCertToDateVL(ValueChangeEvent valueChangeEvent) 
    {
        try {
            valueChangeEvent.getComponent().processUpdates(FacesContext.getCurrentInstance());
            ADFContext.getCurrent().getPageFlowScope().put("empSearchEnableFlag", "N");
            String message = (String) executeMethod("empCertToDateChange");
            if(!"Success".equals(message)){
                showPopupMessage(message, FacesMessage.SEVERITY_ERROR);
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
