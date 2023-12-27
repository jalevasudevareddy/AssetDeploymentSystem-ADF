package bean;

import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.faces.event.ValueChangeEvent;
import javax.faces.application.FacesMessage;

import oracle.adf.share.ADFContext;
import oracle.adf.view.rich.component.rich.input.RichInputComboboxListOfValues;

public class SystemOptionsBean extends CommonBean{
    private RichInputComboboxListOfValues transBuBindgs;

    public SystemOptionsBean() {
        super();
    }

    public void addOptionAL(ActionEvent actionEvent) 
    {
        try 
        {
            executeMethod("addSystemOptions");
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
            String msg = (String) executeMethod("saveSystemOptions");
            if("Success".equals(msg))
            {
                save();
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
            String msg = (String) executeMethod("saveSystemOptions");
            if("Success".equals(msg))
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

    public void systemBuVL(ValueChangeEvent valueChangeEvent) 
    {
        try 
        {
            valueChangeEvent.getComponent().processUpdates(FacesContext.getCurrentInstance());
            String msg = (String) executeMethod("validateSystemBU");
            if(!("Success".equals(msg))) 
            {
                addPartialTrigger(getTransBuBindgs());
                showPopupMessage(msg, FacesMessage.SEVERITY_ERROR);    
            }
        }
        catch(Exception e) 
        {
            e.printStackTrace();    
        }
    }

    public void setTransBuBindgs(RichInputComboboxListOfValues transBuBindgs) {
        this.transBuBindgs = transBuBindgs;
    }

    public RichInputComboboxListOfValues getTransBuBindgs() {
        return transBuBindgs;
    }

    public void deleteOptionAL(ActionEvent actionEvent) 
    {
        try 
        {
            String msg = (String) executeMethod("deleteSystemOption");
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
}
