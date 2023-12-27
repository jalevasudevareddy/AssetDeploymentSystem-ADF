package bean;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

import javax.faces.event.ValueChangeEvent;

import oracle.adf.share.ADFContext;
import oracle.adf.view.rich.component.rich.RichPopup;
import oracle.adf.view.rich.component.rich.input.RichInputComboboxListOfValues;
import oracle.adf.view.rich.component.rich.input.RichInputText;
import oracle.adf.view.rich.component.rich.input.RichTextEditor;
import oracle.adf.view.rich.component.rich.layout.RichPanelFormLayout;
import oracle.adf.view.rich.component.rich.nav.RichButton;
import oracle.adf.view.rich.event.DialogEvent;

public class TermsCondsTemplateBean extends CommonBean{
    private RichInputText templateInfoBindgs;
    private RichPanelFormLayout searchFormBindgs;
    private RichPanelFormLayout createFormBindgs;
    private RichPopup cancelPopupBindgs;
    private RichInputText templateNameBindgs;
    private RichTextEditor newTemplateInfoBind;
    private RichInputComboboxListOfValues searchBuNameBind;
    private RichInputComboboxListOfValues searchDivisionBind;
    private RichInputComboboxListOfValues divisionBind;
    private RichButton createTemplateBind;

    public TermsCondsTemplateBean() {
        super();
    }

    public void createTemplateAL(ActionEvent actionEvent) 
    {
        try 
        {
            String msg = (String) executeMethod("createTemplate");
            if(!("Success".equals(msg))) 
            {
                showPopupMessage(msg, FacesMessage.SEVERITY_ERROR);    
            }
            ADFContext.getCurrent().getPageFlowScope().put("isTemplateSaved", "N");
            addPartialTrigger(getCreateTemplateBind());
        }
        catch(Exception e) 
        {
            e.printStackTrace();    
        }
    }

    public void saveTemplateAL(ActionEvent actionEvent) 
    {
        save();
        executeMethod("setCurrentTransTemplateRow");
        ADFContext.getCurrent().getPageFlowScope().put("isTemplateSaved", "Y");
//        addPartialTrigger(getTemplateInfoBindgs());
    }

    public void saveNCloseTemplateAL(ActionEvent actionEvent) 
    {
        try 
        {
            save();
            closeCurrentActivity(actionEvent); 
        }
        catch(Exception e) 
        {
            try {
                save();
             } catch (Exception ne) {
                // TODO: Add catch code
                ne.printStackTrace();
                closeCurrentActivity(actionEvent); 
            }
            e.printStackTrace();    
        }
    }

    public void closeTemplateAL(ActionEvent actionEvent) 
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

    public void templateNameVL(ValueChangeEvent valueChangeEvent) 
    {
        try 
        {
            valueChangeEvent.getComponent().processUpdates(FacesContext.getCurrentInstance());
            executeMethod("searchTemplate");
            addPartialTrigger(getNewTemplateInfoBind());
        }
        catch(Exception e) 
        {
            e.printStackTrace();
        }
    }

    public void setTemplateInfoBindgs(RichInputText templateInfoBindgs) {
        this.templateInfoBindgs = templateInfoBindgs;
    }

    public RichInputText getTemplateInfoBindgs() {
        return templateInfoBindgs;
    }

    public void setSearchFormBindgs(RichPanelFormLayout searchFormBindgs) {
        this.searchFormBindgs = searchFormBindgs;
    }

    public RichPanelFormLayout getSearchFormBindgs() {
        return searchFormBindgs;
    }

    public void setCreateFormBindgs(RichPanelFormLayout createFormBindgs) {
        this.createFormBindgs = createFormBindgs;
    }

    public RichPanelFormLayout getCreateFormBindgs() {
        return createFormBindgs;
    }

    public void setCancelPopupBindgs(RichPopup cancelPopupBindgs) {
        this.cancelPopupBindgs = cancelPopupBindgs;
    }

    public RichPopup getCancelPopupBindgs() {
        return cancelPopupBindgs;
    }



    public void inputTemplateNameVL(ValueChangeEvent valueChangeEvent) 
    {
        try 
        {
            valueChangeEvent.getComponent().processUpdates(FacesContext.getCurrentInstance());
            String msg = (String) executeMethod("checkDuplicateTemplate");
            if(!("Success".equals(msg))) 
            {
                addPartialTrigger(getTemplateNameBindgs());
                showPopupMessage(msg, FacesMessage.SEVERITY_ERROR); 
            }
        }
        catch(Exception e) 
        {
            e.printStackTrace();
        }
    }

    public void setTemplateNameBindgs(RichInputText templateNameBindgs) {
        this.templateNameBindgs = templateNameBindgs;
    }

    public RichInputText getTemplateNameBindgs() {
        return templateNameBindgs;
    }

    public void setNewTemplateInfoBind(RichTextEditor newTemplateInfoBind) {
        this.newTemplateInfoBind = newTemplateInfoBind;
    }

    public RichTextEditor getNewTemplateInfoBind() {
        return newTemplateInfoBind;
    }

    public void setSearchBuNameBind(RichInputComboboxListOfValues searchBuNameBind) {
        this.searchBuNameBind = searchBuNameBind;
    }

    public RichInputComboboxListOfValues getSearchBuNameBind() {
        return searchBuNameBind;
    }

    public void setSearchDivisionBind(RichInputComboboxListOfValues searchDivisionBind) {
        this.searchDivisionBind = searchDivisionBind;
    }

    public RichInputComboboxListOfValues getSearchDivisionBind() {
        return searchDivisionBind;
    }

    public void searchBuNameVL(ValueChangeEvent valueChangeEvent) {
        valueChangeEvent.getComponent().processUpdates(FacesContext.getCurrentInstance());
        try {
            if(valueChangeEvent.getOldValue()!= null && ! (valueChangeEvent.getOldValue().equals(valueChangeEvent.getNewValue()))){
                String message = (String) executeMethod("TemplateSearchBuChange");
                if(!"Success".equals(message)){
                    showPopupMessage(message, FacesMessage.SEVERITY_ERROR);
                }else{
                    
                    addPartialTrigger(getSearchDivisionBind());
                    
                }
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setDivisionBind(RichInputComboboxListOfValues divisionBind) {
        this.divisionBind = divisionBind;
    }

    public RichInputComboboxListOfValues getDivisionBind() {
        return divisionBind;
    }

    public void transBuNameVL(ValueChangeEvent valueChangeEvent) {
        valueChangeEvent.getComponent().processUpdates(FacesContext.getCurrentInstance());
        try {
            String message = (String) executeMethod("templateBuChange");
            if(! "Success".equals(message)){
                showPopupMessage(message, FacesMessage.SEVERITY_ERROR);
            }else{
                addPartialTrigger(getDivisionBind());
                addPartialTrigger(getNewTemplateInfoBind());
                }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void saveNewAL(ActionEvent actionEvent) {
        try {
            save();
            executeMethod("setCurrentTransTemplateRow");
            ADFContext.getCurrent()
                      .getPageFlowScope()
                      .put("isTemplateSaved", "Y");
        } catch (Exception e) {
            // TODO: Add catch code
            e.printStackTrace();
        }
    }

    public void saveAndCloseNewAL(ActionEvent actionEvent) {
        try 
        {
            save();
            closeCurrentActivity(actionEvent); 
        }
        catch(Exception e) 
        {
            try {
                save();
             } catch (Exception ne) {
                // TODO: Add catch code
                ne.printStackTrace();
                closeCurrentActivity(actionEvent); 
            }
            e.printStackTrace();    
        }
    }

    public void setCreateTemplateBind(RichButton createTemplateBind) {
        this.createTemplateBind = createTemplateBind;
    }

    public RichButton getCreateTemplateBind() {
        return createTemplateBind;
    }
}
