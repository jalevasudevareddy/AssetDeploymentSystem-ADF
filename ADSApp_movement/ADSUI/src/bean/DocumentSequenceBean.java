package bean;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.faces.event.ValueChangeEvent;

import oracle.adf.share.ADFContext;
import oracle.adf.view.rich.component.rich.data.RichTable;
import oracle.adf.view.rich.component.rich.input.RichInputComboboxListOfValues;
import oracle.adf.view.rich.component.rich.input.RichInputDate;
import oracle.adf.view.rich.component.rich.input.RichInputText;

public class DocumentSequenceBean extends CommonBean {
    private RichInputComboboxListOfValues searchDivisionBind;
    private RichTable documentSeqTblBind;
    private RichInputComboboxListOfValues getSearchBuBind;
    private RichInputDate effectiveToDateBindgs;
    private RichInputDate effectiveFromDateBindgs;
    private RichInputText currentSeqNumBindgs;
    private RichInputComboboxListOfValues divisionCodeBind;
    private RichInputComboboxListOfValues documentNameBind;

    public DocumentSequenceBean() {
        super();
    }

    public void searchBuVL(ValueChangeEvent valueChangeEvent) {
        valueChangeEvent.getComponent().processUpdates(FacesContext.getCurrentInstance());
        if("Y".equals(ADFContext.getCurrent().getPageFlowScope().get("isDocumentSequenceChanged"))){
            showPopupMessage("Please save or cancel the changes done to continue", FacesMessage.SEVERITY_ERROR);
        }else{
            String message = (String) executeMethod("dsSearchBuChange");
            if(!"Success".equals(message)){
                showPopupMessage(message, FacesMessage.SEVERITY_ERROR);
            }
            addPartialTrigger(getSearchDivisionBind());
        }
    }
    
    
    public void searchDivisionVL(ValueChangeEvent valueChangeEvent) {
        valueChangeEvent.getComponent().processUpdates(FacesContext.getCurrentInstance());
        if("Y".equals(ADFContext.getCurrent().getPageFlowScope().get("isDocumentSequenceChanged"))){
            showPopupMessage("Please save or cancel the changes done to continue", FacesMessage.SEVERITY_ERROR);
        }else{
            String message = (String) executeMethod("dsSearchDivChange");
            if(!"Success".equals(message)){
                showPopupMessage(message, FacesMessage.SEVERITY_ERROR);
            }
            addPartialTrigger(getDocumentSeqTblBind());
        }
    }

   

    public void setSearchDivisionBind(RichInputComboboxListOfValues searchDivisionBind) {
        this.searchDivisionBind = searchDivisionBind;
    }

    public RichInputComboboxListOfValues getSearchDivisionBind() {
        return searchDivisionBind;
    }

    public void setDocumentSeqTblBind(RichTable documentSeqTblBind) {
        this.documentSeqTblBind = documentSeqTblBind;
    }

    public RichTable getDocumentSeqTblBind() {
        return documentSeqTblBind;
    }

    public void saveRules(ActionEvent actionEvent) {
        try {
            String message = (String) executeMethod("saveDocumentSequence");
            if(!"Success".equals(message)){
                showPopupMessage(message, FacesMessage.SEVERITY_ERROR);
            }else{
                try {
                    save();
                     ADFContext.getCurrent().getPageFlowScope().put("isDocumentSequenceChanged","N");
                    addPartialTrigger(getDocumentSeqTblBind());
                    addPartialTrigger(getGetSearchBuBind());
                    addPartialTrigger(getSearchDivisionBind());
                     addPartialTrigger(getEffectiveToDateBindgs());
                 }catch (Exception e) {
                    
                    e.printStackTrace();
                }
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void saveAndCloseRules(ActionEvent actionEvent) {
        try {
            String message = (String) executeMethod("saveDocumentSequence");
            if(!"Success".equals(message)){
                showPopupMessage(message, FacesMessage.SEVERITY_ERROR);
            }else{
                try {
                    
                    save();
                     ADFContext.getCurrent().getPageFlowScope().put("isDocumentSequenceChanged","N");
                     closeCurrentActivity(actionEvent);
                    addPartialTrigger(getDocumentSeqTblBind());
                    addPartialTrigger(getGetSearchBuBind());
                    addPartialTrigger(getSearchDivisionBind());
                 }catch (Exception e) {
                    
                    e.printStackTrace();
                }
            }
            
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void cancelRules(ActionEvent actionEvent) {
       
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

    public void setGetSearchBuBind(RichInputComboboxListOfValues getSearchBuBind) {
        this.getSearchBuBind = getSearchBuBind;
    }

    public RichInputComboboxListOfValues getGetSearchBuBind() {
        return getSearchBuBind;
    }

    public void createDocumentSeq(ActionEvent actionEvent) {
        try {
            String message = (String) executeMethod("createDocumentSequence");            
            if(!"Success".equals(message)){
                showPopupMessage(message, FacesMessage.SEVERITY_ERROR);
            }else{
                ADFContext.getCurrent().getPageFlowScope().put("isDocumentSequenceChanged","Y");
                addPartialTrigger(getGetSearchBuBind());
                addPartialTrigger(getSearchDivisionBind());
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void deleteDocumentSeq(ActionEvent actionEvent) 
    {
        try 
        {
            String msg = (String) executeMethod("deleteDocumentSeq");
            ADFContext.getCurrent().getPageFlowScope().put("isDocumentSequenceChanged", "N");
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



    public void docSeqDatesVL(ValueChangeEvent valueChangeEvent) 
    {
        try 
        {
            valueChangeEvent.getComponent().processUpdates(FacesContext.getCurrentInstance());
            ADFContext.getCurrent().getPageFlowScope().put("isDocumentSequenceChanged", "N");
            String msg = (String) executeMethod("validateSeqenceDates");
            if(!("Success".equals(msg))) {
                addPartialTrigger(getEffectiveFromDateBindgs());
                addPartialTrigger(getEffectiveToDateBindgs());
                showPopupMessage(msg, FacesMessage.SEVERITY_ERROR);
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

    public void docNameVL(ValueChangeEvent valueChangeEvent) {
        try 
        {
            valueChangeEvent.getComponent().processUpdates(FacesContext.getCurrentInstance());
            String msg = (String) executeMethod("validateDocumentSeq");
            if(!("Success".equals(msg)))
            {
                addPartialTrigger(getDocumentNameBind());
                addPartialTrigger(getDivisionCodeBind());
                addPartialTrigger(getEffectiveFromDateBindgs());                
                showPopupMessage(msg, FacesMessage.SEVERITY_ERROR);
            }
            else {
                addPartialTrigger(getEffectiveFromDateBindgs());
            }
           
        }
        catch(Exception e) 
        {
            e.printStackTrace();    
        }
    }

    public void docSeqVL(ValueChangeEvent valueChangeEvent) {
        try 
        {
            valueChangeEvent.getComponent().processUpdates(FacesContext.getCurrentInstance());
            String msg = (String) executeMethod("updateCurrSeq");
            if(!("Success".equals(msg))) {
                addPartialTrigger(getCurrentSeqNumBindgs());
                showPopupMessage(msg, FacesMessage.SEVERITY_ERROR);
            }
        }
        catch(Exception e) 
        {
            e.printStackTrace();    
        }
    }

    public void setCurrentSeqNumBindgs(RichInputText currentSeqNumBindgs) {
        this.currentSeqNumBindgs = currentSeqNumBindgs;
    }

    public RichInputText getCurrentSeqNumBindgs() {
        return currentSeqNumBindgs;
    }

    public void setDivisionCodeBind(RichInputComboboxListOfValues divisionCodeBind) {
        this.divisionCodeBind = divisionCodeBind;
    }

    public RichInputComboboxListOfValues getDivisionCodeBind() {
        return divisionCodeBind;
    }

    public void setDocumentNameBind(RichInputComboboxListOfValues documentNameBind) {
        this.documentNameBind = documentNameBind;
    }

    public RichInputComboboxListOfValues getDocumentNameBind() {
        return documentNameBind;
    }
}
