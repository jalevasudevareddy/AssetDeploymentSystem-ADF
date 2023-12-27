package bean;

import javax.faces.event.ActionEvent;

import javax.faces.event.ValueChangeEvent;
import javax.faces.application.FacesMessage;

import oracle.adf.view.rich.component.rich.RichPopup;
import oracle.adf.view.rich.component.rich.input.RichInputText;
import oracle.adf.view.rich.component.rich.layout.RichPanelHeader;
import oracle.adf.view.rich.event.DialogEvent;

public class LookupSetupBean extends CommonBean {
    private RichPanelHeader lookUpSetupPageBInd;
    private RichPopup abtthisRecordPopupBind;
    private RichInputText lookupCodeBind;

    public LookupSetupBean() {
        super();
    }

    public void setLookUpSetupPageBInd(RichPanelHeader lookUpSetupPageBInd) {
        this.lookUpSetupPageBInd = lookUpSetupPageBInd;
    }

    public RichPanelHeader getLookUpSetupPageBInd() {
        return lookUpSetupPageBInd;
    }

    public void addNewLookup(ActionEvent actionEvent) {
        executeMethod("CreateInsert");
    }

    public void setAbtthisRecordPopupBind(RichPopup abtthisRecordPopupBind) {
        this.abtthisRecordPopupBind = abtthisRecordPopupBind;
    }

    public RichPopup getAbtthisRecordPopupBind() {
        return abtthisRecordPopupBind;
    }

    public void AbtthisDialogListner(DialogEvent dialogEvent) {
        try {
            if (dialogEvent.getOutcome().equals(DialogEvent.Outcome.ok)) {
                getAbtthisRecordPopupBind().cancel();            
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void SaveLookup(ActionEvent actionEvent) {
        save();
        getCurrentPageFlowScope().put("DeleteFlag", "N");
        addPartialTrigger(getLookUpSetupPageBInd());
    }

    public void saveAndClose(ActionEvent actionEvent) {
        save();
        getCurrentPageFlowScope().put("DeleteFlag", "N");
        addPartialTrigger(getLookUpSetupPageBInd());
        closeCurrentActivity(actionEvent);
    }

    public void Cancel(ActionEvent actionEvent) {
        cancel();
        getCurrentPageFlowScope().put("DeleteFlag", "N");
        addPartialTrigger(getLookUpSetupPageBInd());
        closeCurrentActivity(actionEvent);
    }

    public void LookUpTypeValueChange(ValueChangeEvent valueChangeEvent) {
        valueChangeEvent.getComponent().processUpdates(getFacesContextCurrentInstance());
        String msg = (String) executeMethod("LookUpTypeValueChange");
        if (!"Success".equalsIgnoreCase(msg)) {
            addPartialTrigger(getLookUpSetupPageBInd());
            showPopupMessage(msg, FacesMessage.SEVERITY_ERROR);
        }else {
            addPartialTrigger(getLookUpSetupPageBInd());
        }
    }

    public void AboutthisRecordMethod(ActionEvent actionEvent) {
        showPopup(getAbtthisRecordPopupBind());
    }

    public void addLokupLine(ActionEvent actionEvent) {
        getCurrentPageFlowScope().put("DeleteFlag", "Y");
        addPartialTrigger(getLookUpSetupPageBInd());
        executeMethod("addLokupLine");
    }

    public void DeleteLookupLine(ActionEvent actionEvent) {
        try{
            String res = (String)executeMethod("DeleteLookupLine");
            if (!"Success".equalsIgnoreCase(res)) {
                addPartialTrigger(getLookUpSetupPageBInd());
                showPopupMessage(res, FacesMessage.SEVERITY_ERROR);
            }else{
                addPartialTrigger(getLookUpSetupPageBInd());
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public void setLookupCodeBind(RichInputText lookupCodeBind) {
        this.lookupCodeBind = lookupCodeBind;
    }

    public RichInputText getLookupCodeBind() {
        return lookupCodeBind;
    }

    public void lookUpCodeValueChange(ValueChangeEvent valueChangeEvent) {
        valueChangeEvent.getComponent().processUpdates(getFacesContextCurrentInstance());
        String msg = (String) executeMethod("lookUpCodeValueChange");
        if (!"Success".equalsIgnoreCase(msg)) {
            addPartialTrigger(getLookUpSetupPageBInd());
            showPopupMessage(msg, FacesMessage.SEVERITY_ERROR);
        }
    }

    public void lookupTypeDelActList(ActionEvent actionEvent) {
        try {
            String message=(String)executeMethod("deleteLookupType");
           if (!"Success".equalsIgnoreCase(message)) {
               showPopupMessage(message, FacesMessage.SEVERITY_ERROR);
           }
       } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
