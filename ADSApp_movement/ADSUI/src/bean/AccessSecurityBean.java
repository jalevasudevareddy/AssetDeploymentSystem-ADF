package bean;

import javax.faces.event.ActionEvent;
import javax.faces.application.FacesMessage;

import javax.faces.context.FacesContext;
import javax.faces.event.ValueChangeEvent;

import model.view.AccessSecurityLinesVORowImpl;
import model.view.GroupCustomerMapVORowImpl;

import oracle.adf.model.BindingContext;
import oracle.adf.model.binding.DCBindingContainer;
import oracle.adf.model.binding.DCIteratorBinding;
import oracle.adf.share.ADFContext;

import oracle.adf.view.rich.component.rich.RichPopup;

import oracle.adf.view.rich.component.rich.data.RichTable;
import oracle.adf.view.rich.component.rich.input.RichInputComboboxListOfValues;
import oracle.adf.view.rich.event.DialogEvent;

import oracle.jbo.RowSetIterator;

public class AccessSecurityBean extends CommonBean{
    private RichPopup warningPopupBindgs;
    private RichInputComboboxListOfValues userNameBindgs;
    private RichPopup saveWarningPopupBindgs;
    private RichTable hdrTableBind;

    public AccessSecurityBean() {
        super();
    }

    public void cancelAL(ActionEvent actionEvent) 
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

    public void saveAL(ActionEvent actionEvent) 
    {
        try 
        {
            String message = (String) executeMethod("saveAccessSecurity");
            if(!("Success".equals(message))) 
            {
                String[] msgs= message.split("_");
                if("E".equals(msgs[0])) {
                        showPopupMessage(msgs[1], FacesMessage.SEVERITY_ERROR);    
                }
                else if("W".equals(msgs[0])) 
                {
                        ADFContext.getCurrent().getPageFlowScope().put("headerId", msgs[1]);
                        ADFContext.getCurrent().getPageFlowScope().put("warningMsg", msgs[2]);
                        showPopup(getSaveWarningPopupBindgs());
                }
//                
            }
            else {
                save();
                ADFContext.getCurrent().getPageFlowScope().put("searchEnableFlag", "Y");
            }
        }
        catch(Exception e) 
        {
            e.printStackTrace();    
        }
    }

    public void saveCloseAL(ActionEvent actionEvent) 
    {
        try 
        {
            save();
            closeCurrentActivity(actionEvent);
        }
        catch(Exception e) 
        {
            e.printStackTrace();    
        }
    }

    public void searchAL(ActionEvent actionEvent) 
    {
        try 
        {
            String msg= (String) executeMethod("searchAccessSecurity");
            if(!("Success".equals(msg))) 
            {
                showPopupMessage(msg, FacesMessage.SEVERITY_ERROR);    
            }else{
                addPartialTrigger(getHdrTableBind());
            }
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
            String message = (String) executeMethod("resetAccessSecuritySearch");
            if(!"Success".equals(message)){
                showPopupMessage(message, FacesMessage.SEVERITY_ERROR);
            }else{
//                addPartialTrigger(getCurrentCalcTableBind());
//                addPartialTrigger(getRetroCalcTableBind());
            }
        }
        catch(Exception e) 
        {
            e.printStackTrace();
        }
    }

    public void addUserSecurityAL(ActionEvent actionEvent) 
    {
        try 
        {
           executeMethod("addAccessSecurity");
            ADFContext.getCurrent().getPageFlowScope().put("searchEnableFlag", "N");
        }
        catch(Exception e) 
        {
            e.printStackTrace();    
        }
    }

    public void addSecurityRoleAL(ActionEvent actionEvent) 
    {
        try 
        {
            String msg = (String) executeMethod("addSecurityRole");   
            if(!("Success".equals(msg))) 
            {
                showPopupMessage(msg, FacesMessage.SEVERITY_ERROR);    
            }
            else 
            {
                ADFContext.getCurrent().getPageFlowScope().put("searchEnableFlag", "N");
            }
        }
        catch(Exception e) 
        {
            e.printStackTrace();    
        }
    }

    public void deleteSecurityRoleAL(ActionEvent actionEvent) 
    {
        try 
        {
            ADFContext.getCurrent().getPageFlowScope().put("buChangeFlag", "N");
            DCBindingContainer binding = (DCBindingContainer) BindingContext.getCurrent().getCurrentBindingsEntry();
            DCIteratorBinding bindingIterator = binding.findIteratorBinding("AccessSecurityLinesVO1Iterator");
            RowSetIterator row = bindingIterator.getRowSetIterator();
            if(bindingIterator != null){
                AccessSecurityLinesVORowImpl currentRow = (AccessSecurityLinesVORowImpl) row.getCurrentRow();
                if(currentRow != null && currentRow.getEntity(0).getEntityState() == 0){
                    currentRow.remove();    
                    ADFContext.getCurrent().getPageFlowScope().put("searchEnableFlag", "N");
                }else{
                    showPopupMessage("Only New Record can be deleted", FacesMessage.SEVERITY_ERROR);
                }
            }
        }
        catch(Exception e) 
        {
            e.printStackTrace();    
        }
    }

    public void deleteUserSecurityAL(ActionEvent actionEvent) 
    {
        try 
        {
            String message=(String)executeMethod("deleteUserSecurity");
            if (!"Success".equalsIgnoreCase(message)) {
               showPopupMessage(message, FacesMessage.SEVERITY_ERROR);
            }
            else
            {
                ADFContext.getCurrent().getPageFlowScope().put("searchEnableFlag", "N");    
            }
        }
        catch(Exception e) 
        {
            e.printStackTrace();    
        }
    }


    public void roleActiveFlagVL(ValueChangeEvent valueChangeEvent) 
    {
        try 
        {
            valueChangeEvent.getComponent().processUpdates(FacesContext.getCurrentInstance());
            ADFContext.getCurrent().getPageFlowScope().put("searchEnableFlag", "N");
        }
        catch(Exception e) 
        {
            e.printStackTrace();    
        }
    }

    public void endDateVL(ValueChangeEvent valueChangeEvent) 
    {
        try 
        {
            valueChangeEvent.getComponent().processUpdates(FacesContext.getCurrentInstance());
            ADFContext.getCurrent().getPageFlowScope().put("searchEnableFlag", "N");
            String msg =(String) executeMethod("validateEndDate");
            if(!("Success".equals(msg))) 
            {
                String[] s1 = msg.split("_");
                
                if("W".equals(s1[0])) {
                    ADFContext.getCurrent().getPageFlowScope().put("headerId", s1[1]);
                    ADFContext.getCurrent().getPageFlowScope().put("warningMsg", s1[2]);              
                    showPopup(getWarningPopupBindgs());
                }
                else
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

    public void startDateVL(ValueChangeEvent valueChangeEvent) 
    {
        try 
        {
            valueChangeEvent.getComponent().processUpdates(FacesContext.getCurrentInstance());
            String msg = (String) executeMethod("validateStartDate");
            if(!("Success".equals(msg))) 
            {
                String[] s1 = msg.split("_");
                
                if("W".equals(s1[0])) {
                    ADFContext.getCurrent().getPageFlowScope().put("headerId", s1[1]);
                    ADFContext.getCurrent().getPageFlowScope().put("warningMsg", s1[2]);
                    showPopup(getWarningPopupBindgs());
                }
                else
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

    public void setWarningPopupBindgs(RichPopup warningPopupBindgs) {
        this.warningPopupBindgs = warningPopupBindgs;
    }

    public RichPopup getWarningPopupBindgs() {
        return warningPopupBindgs;
    }

    public void warningDL(DialogEvent dialogEvent) 
    {
        try 
        {
            if(dialogEvent.getOutcome() == DialogEvent.Outcome.no){
                String message = (String) executeMethod("duplicatesWarning");
                if(! "Success".equals(message)){
                    showPopupMessage(message, FacesMessage.SEVERITY_ERROR);
                }
                else 
                {
                    addPartialTrigger(getUserNameBindgs());        
                }
            }
        }
        catch(Exception e) 
        {
            e.printStackTrace();    
        }
    }

    public void setUserNameBindgs(RichInputComboboxListOfValues userNameBindgs) {
        this.userNameBindgs = userNameBindgs;
    }

    public RichInputComboboxListOfValues getUserNameBindgs() {
        return userNameBindgs;
    }

    public void customerTypeVL(ValueChangeEvent valueChangeEvent) 
    {
        try
        {
            valueChangeEvent.getComponent().processUpdates(FacesContext.getCurrentInstance());
            String msg = (String) executeMethod("validateCustomerType");
            if(!("Success".equals(msg))) {
                showPopupMessage(msg, FacesMessage.SEVERITY_ERROR);
            }
        }
        catch(Exception e) 
        {
            e.printStackTrace();    
        }
    }


    public void custTypeValuesVL(ValueChangeEvent valueChangeEvent) 
    {
        valueChangeEvent.getComponent().processUpdates(FacesContext.getCurrentInstance());
        String msg = (String) executeMethod("validateCustomerTypeValues");
        if(!("Success".equals(msg))) 
        {
            showPopupMessage(msg, FacesMessage.SEVERITY_ERROR);    
        }
    }

    public void setSaveWarningPopupBindgs(RichPopup saveWarningPopupBindgs) {
        this.saveWarningPopupBindgs = saveWarningPopupBindgs;
    }

    public RichPopup getSaveWarningPopupBindgs() {
        return saveWarningPopupBindgs;
    }

    public void saveWarningDL(DialogEvent dialogEvent) 
    {
        try 
        {
            if(dialogEvent.getOutcome() == DialogEvent.Outcome.no){
                String message = (String) executeMethod("duplicatesWarning");
                if(! "Success".equals(message)){
                    showPopupMessage(message, FacesMessage.SEVERITY_ERROR);
                }
                else 
                {
                    addPartialTrigger(getUserNameBindgs());        
                }
            }
            else {
                save();
                ADFContext.getCurrent().getPageFlowScope().put("searchEnableFlag", "Y");
            }
        }
        catch(Exception e) 
        {
            e.printStackTrace();    
        }
    }

    public void setHdrTableBind(RichTable hdrTableBind) {
        this.hdrTableBind = hdrTableBind;
    }

    public RichTable getHdrTableBind() {
        return hdrTableBind;
    }
}
