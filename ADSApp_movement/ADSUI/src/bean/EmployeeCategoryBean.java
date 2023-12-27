package bean;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

import javax.faces.event.ValueChangeEvent;

import oracle.adf.view.rich.component.rich.input.RichInputText;
import oracle.adf.view.rich.component.rich.layout.RichPanelHeader;

public class EmployeeCategoryBean extends CommonBean{
    private RichPanelHeader empCatMastrPageBind;
    private RichInputText repCatDescBind;
    private RichInputText stdHrsBindgs;
    private RichInputText ot1HrsBindgs;
    private RichInputText ot2HrsBindgs;

    public EmployeeCategoryBean() {
        super();
    }

    public void setEmpCatMastrPageBind(RichPanelHeader empCatMastrPageBind) {
        this.empCatMastrPageBind = empCatMastrPageBind;
    }

    public RichPanelHeader getEmpCatMastrPageBind() {
        return empCatMastrPageBind;
    }

    public void saveAL(ActionEvent actionEvent) {
        try 
        {
            save();
            addPartialTrigger(getEmpCatMastrPageBind());
        }
        catch(Exception e) 
        {
            e.printStackTrace();    
        }
    }

    public void saveCloseAL(ActionEvent actionEvent) {
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

    public void cancelAL(ActionEvent actionEvent) {
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

    public void empCatAddActList(ActionEvent actionEvent) {
        try {
            String message=(String)executeMethod("addEmpCategory");
       } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void delEmpCatActList(ActionEvent actionEvent) {
        try {
            String message=(String)executeMethod("deleteEmployeeCategory");
           if (!"Success".equalsIgnoreCase(message)) {
               addPartialTrigger(getEmpCatMastrPageBind());
               showPopupMessage(message, FacesMessage.SEVERITY_ERROR);
           }else {
               addPartialTrigger(getEmpCatMastrPageBind());
           }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void empRepCatAddActList(ActionEvent actionEvent) {
        try {
            String message=(String)executeMethod("addEmpRepCat");
       } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void deleteEmpRepCatActList(ActionEvent actionEvent) {
        try {
           try {
               String message=(String)executeMethod("deleteEmpRepCat");
              if (!"Success".equalsIgnoreCase(message)) {
                  showPopupMessage(message, FacesMessage.SEVERITY_ERROR);
              }
           } catch (Exception e) {
               e.printStackTrace();
           }
       } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void empAsstCatMapAddActList(ActionEvent actionEvent) {
        try {
           String message=(String)executeMethod("addEmpAsstCat");
       } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void deleteEmpAsstCatMapActList(ActionEvent actionEvent) {
        try {
            String message=(String)executeMethod("deleteEmpAsstCatMap");
           if (!"Success".equalsIgnoreCase(message)) {
               showPopupMessage(message, FacesMessage.SEVERITY_ERROR);
           }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void empCatCodeValChList(ValueChangeEvent valueChangeEvent) {
        try {
           valueChangeEvent.getComponent().processUpdates(getFacesContextCurrentInstance());
           String msg = (String) executeMethod("empCatCodeValChList");
           if (!"Success".equalsIgnoreCase(msg)) {
               addPartialTrigger(getEmpCatMastrPageBind());
               showPopupMessage(msg, FacesMessage.SEVERITY_ERROR);
           }
       } catch (Exception e) {
            e.printStackTrace();
        }
        
    }

    public void repCategoryValChList(ValueChangeEvent valueChangeEvent) {
        try {
           valueChangeEvent.getComponent().processUpdates(getFacesContextCurrentInstance());
           String msg = (String) executeMethod("repCatValChList");
           if (!"Success".equalsIgnoreCase(msg)) {
               addPartialTrigger(getEmpCatMastrPageBind());
               showPopupMessage(msg, FacesMessage.SEVERITY_ERROR);
           }
            else
           {
               addPartialTrigger(getRepCatDescBind());
            }
       } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void asstCatValChList(ValueChangeEvent valueChangeEvent) {
        try {
           valueChangeEvent.getComponent().processUpdates(getFacesContextCurrentInstance());
           String msg = (String) executeMethod("astCatValChList");
           if (!"Success".equalsIgnoreCase(msg)) {
               addPartialTrigger(getEmpCatMastrPageBind());
               showPopupMessage(msg, FacesMessage.SEVERITY_ERROR);
           }
       } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setRepCatDescBind(RichInputText repCatDescBind) {
        this.repCatDescBind = repCatDescBind;
    }

    public RichInputText getRepCatDescBind() {
        return repCatDescBind;
    }

    public void hoursVL(ValueChangeEvent valueChangeEvent) 
    {
        try 
        {
            valueChangeEvent.getComponent().processUpdates(FacesContext.getCurrentInstance());
            String msg = (String) executeMethod("empCatHrsChange");
            if(!("Success".equals(msg))) 
            {
                addPartialTrigger(getStdHrsBindgs());
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

    public void setStdHrsBindgs(RichInputText stdHrsBindgs) {
        this.stdHrsBindgs = stdHrsBindgs;
    }

    public RichInputText getStdHrsBindgs() {
        return stdHrsBindgs;
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
}
