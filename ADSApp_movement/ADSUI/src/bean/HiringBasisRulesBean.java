package bean;

import javax.faces.event.ActionEvent;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.event.ValueChangeEvent;

import oracle.adf.share.ADFContext;
import oracle.adf.view.rich.component.rich.data.RichTable;
import oracle.adf.view.rich.component.rich.input.RichInputComboboxListOfValues;
import oracle.adf.view.rich.component.rich.input.RichInputText;

public class HiringBasisRulesBean extends CommonBean{
    private RichInputText noOfHoursBind;
    private RichInputText ot2HoursBind;
    private RichInputText ot1HoursBind;
    private RichInputText hiringBasisBind;
    private RichInputText noOfDaysBind;
    private RichTable hiringBasisTblBindgs;
    private RichInputComboboxListOfValues searchBuBind;
    private RichInputComboboxListOfValues searchDivisionBind;

    public HiringBasisRulesBean() {
        super();
    }

    public void createHiringBasisRule(ActionEvent actionEvent) {
        try {
            String message = (String) executeMethod("createHiringBasisRule");            
            if(!"Success".equals(message)){
                showPopupMessage(message, FacesMessage.SEVERITY_ERROR);
            }else{
                ADFContext.getCurrent().getPageFlowScope().put("isHiringBasisChanged","Y");
                addPartialTrigger(getSearchBuBind());
                addPartialTrigger(getSearchDivisionBind());
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void deleteHiringBasisRule(ActionEvent actionEvent) {
        try {
            String message = (String) executeMethod("deleteHiringBasisRule");
            
            if(!"Success".equals(message)){
                showPopupMessage(message, FacesMessage.SEVERITY_ERROR);
            }else{
                ADFContext.getCurrent().getPageFlowScope().put("isHiringBasisChanged","Y");
                addPartialTrigger(getSearchBuBind());
                addPartialTrigger(getSearchDivisionBind());
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void saveRules(ActionEvent actionEvent) {
        try {
            String message = (String) executeMethod("saveHiringBasisRule");
            if(!"Success".equals(message)){
                showPopupMessage(message, FacesMessage.SEVERITY_ERROR);
            }else{
                try {
                    save();
                     ADFContext.getCurrent().getPageFlowScope().put("isHiringBasisChanged","N");
                    addPartialTrigger(getHiringBasisTblBindgs());
                    addPartialTrigger(getSearchBuBind());
                    addPartialTrigger(getSearchDivisionBind());
                 }catch (Exception e) {
                    if(e.getMessage().contains("XXADS_HIRING_BASIS_RULES_U1")){
                        showPopupMessage("Duplicate Hiring Basis Rule exists. Please check and try again", FacesMessage.SEVERITY_ERROR);
                    }
                    e.printStackTrace();
                    System.out.println(e.getMessage());
                }
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void saveAndCloseRules(ActionEvent actionEvent) {
        try {
            String message = (String) executeMethod("saveHiringBasisRule");
            if(!"Success".equals(message)){
                showPopupMessage(message, FacesMessage.SEVERITY_ERROR);
            }else{
                save();
                ADFContext.getCurrent().getPageFlowScope().put("isHiringBasisChanged","N");
                closeCurrentActivity(actionEvent);
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void cancelRules(ActionEvent actionEvent) {
        try {
            cancel();
            closeCurrentActivity(actionEvent);
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void hoursVL(ValueChangeEvent valueChangeEvent) {
        valueChangeEvent.getComponent().processUpdates(FacesContext.getCurrentInstance());
        try {
            String message = (String) executeMethod("hiringBasisHoursChange");
            ADFContext.getCurrent().getPageFlowScope().put("isHiringBasisChanged","Y");
            addPartialTrigger(getSearchBuBind());
            addPartialTrigger(getSearchDivisionBind());
            if(!"Success".equals(message)){
                showPopupMessage(message, FacesMessage.SEVERITY_ERROR);
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void fixedVariableVL(ValueChangeEvent valueChangeEvent) {
        valueChangeEvent.getComponent().processUpdates(FacesContext.getCurrentInstance());
        try {
            String message = (String) executeMethod("fixedVariableChange");
            if(!"Success".equals(message)){
                showPopupMessage(message, FacesMessage.SEVERITY_ERROR);
            }
            ADFContext.getCurrent().getPageFlowScope().put("isHiringBasisChanged","Y");
            addPartialTrigger(getSearchBuBind());
            addPartialTrigger(getSearchDivisionBind());
            addPartialTrigger(getNoOfHoursBind());
            addPartialTrigger(getOt1HoursBind());
            addPartialTrigger(getOt2HoursBind());
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setNoOfHoursBind(RichInputText noOfHoursBind) {
        this.noOfHoursBind = noOfHoursBind;
    }

    public RichInputText getNoOfHoursBind() {
        return noOfHoursBind;
    }

    public void setOt2HoursBind(RichInputText ot2HoursBind) {
        this.ot2HoursBind = ot2HoursBind;
    }

    public RichInputText getOt2HoursBind() {
        return ot2HoursBind;
    }

    public void setOt1HoursBind(RichInputText ot1HoursBind) {
        this.ot1HoursBind = ot1HoursBind;
    }

    public RichInputText getOt1HoursBind() {
        return ot1HoursBind;
    }

    public void hiringBasisVL(ValueChangeEvent valueChangeEvent) {
        try {
            valueChangeEvent.getComponent().processUpdates(FacesContext.getCurrentInstance());
            String message = (String) executeMethod("hiringBasisChange");
            ADFContext.getCurrent().getPageFlowScope().put("isHiringBasisChanged","Y");
             addPartialTrigger(getSearchBuBind());
             addPartialTrigger(getSearchDivisionBind());
            if(!"Success".equals(message)){
                addPartialTrigger(getHiringBasisBind());
                showPopupMessage(message, FacesMessage.SEVERITY_ERROR);
            }
         }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setHiringBasisBind(RichInputText hiringBasisBind) {
        this.hiringBasisBind = hiringBasisBind;
    }

    public RichInputText getHiringBasisBind() {
        return hiringBasisBind;
    }

    public void setNoOfDaysBind(RichInputText noOfDaysBind) {
        this.noOfDaysBind = noOfDaysBind;
    }

    public RichInputText getNoOfDaysBind() {
        return noOfDaysBind;
    }

    public void noOfDaysVL(ValueChangeEvent valueChangeEvent) {
        try {
            valueChangeEvent.getComponent().processUpdates(FacesContext.getCurrentInstance());
            String message = (String) executeMethod("hiringBasisDaysChange");
            ADFContext.getCurrent().getPageFlowScope().put("isHiringBasisChanged","Y");
             addPartialTrigger(getSearchBuBind());
             addPartialTrigger(getSearchDivisionBind());
            if(!"Success".equals(message)){
                addPartialTrigger(getNoOfDaysBind());
                showPopupMessage(message, FacesMessage.SEVERITY_ERROR);
            }
         }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setHiringBasisTblBindgs(RichTable hiringBasisTblBindgs) {
        this.hiringBasisTblBindgs = hiringBasisTblBindgs;
    }

    public RichTable getHiringBasisTblBindgs() {
        return hiringBasisTblBindgs;
    }

    public void rentalTypeChangeVL(ValueChangeEvent valueChangeEvent) 
    {
        valueChangeEvent.getComponent().processUpdates(FacesContext.getCurrentInstance());
        try 
        {
            ADFContext.getCurrent().getPageFlowScope().put("isHiringBasisChanged","Y");
            addPartialTrigger(getSearchBuBind());
            addPartialTrigger(getSearchDivisionBind());
            String message = (String) executeMethod("rentalTypeChange");
            if(!"Success".equals(message))
            {
                showPopupMessage(message, FacesMessage.SEVERITY_ERROR);
            }
        addPartialTrigger(getNoOfHoursBind());
        addPartialTrigger(getOt1HoursBind());
        addPartialTrigger(getOt2HoursBind());
        }
        catch(Exception e) 
        {
            e.printStackTrace();    
        }
    }

    public void searchBuVL(ValueChangeEvent valueChangeEvent) {
        valueChangeEvent.getComponent().processUpdates(FacesContext.getCurrentInstance());
        if("Y".equals(ADFContext.getCurrent().getPageFlowScope().get("isHiringBasisChanged"))){
            showPopupMessage("Please save or cancel the changes done to continue", FacesMessage.SEVERITY_ERROR);
        }else{
            String message = (String) executeMethod("hbrSearchBuChange");
            if(!"Success".equals(message)){
                showPopupMessage(message, FacesMessage.SEVERITY_ERROR);
            }
            addPartialTrigger(getHiringBasisTblBindgs());
        }
    }

    public void searchDivisionVL(ValueChangeEvent valueChangeEvent) {
        valueChangeEvent.getComponent().processUpdates(FacesContext.getCurrentInstance());
        if("Y".equals(ADFContext.getCurrent().getPageFlowScope().get("isHiringBasisChanged"))){
            showPopupMessage("Please save or cancel the changes done to continue", FacesMessage.SEVERITY_ERROR);
        }else{
            String message = (String) executeMethod("hbrSearchDivChange");
            if(!"Success".equals(message)){
                showPopupMessage(message, FacesMessage.SEVERITY_ERROR);
            }
            addPartialTrigger(getHiringBasisTblBindgs());
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
}
