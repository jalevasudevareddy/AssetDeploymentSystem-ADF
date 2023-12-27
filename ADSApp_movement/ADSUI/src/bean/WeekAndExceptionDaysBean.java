package bean;

import java.util.Date;

import javax.faces.event.ActionEvent;
import javax.faces.event.ValueChangeEvent;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import model.view.ExceptionDaysVOImpl;

import model.view.ExceptionDaysVORowImpl;

import oracle.adf.share.ADFContext;
import oracle.adf.view.rich.component.rich.data.RichTable;
import oracle.adf.view.rich.component.rich.input.RichInputComboboxListOfValues;
import oracle.adf.view.rich.component.rich.input.RichInputDate;
import oracle.adf.view.rich.component.rich.input.RichInputText;

public class WeekAndExceptionDaysBean extends CommonBean{
    private RichInputComboboxListOfValues weekdayBindgs;
    private RichInputDate exceptionDateBindgs;
    private RichTable weekOffTblBindgs;
    private RichTable exceptionDayTblBindgs;
    private RichInputDate spStartDateBindgs;
    private RichInputDate spEndDateBindgs;
    private RichInputDate effectiveFromDateBindgs;
    private RichInputDate effectiveToDateBindgs;
    private RichInputText currentSeqNumBindgs;

    public WeekAndExceptionDaysBean() {
        super();
    }

    public void saveAL(ActionEvent actionEvent) 
    {
        try 
        {
            String message = (String) executeMethod("saveWeekExceptionDays");
            if(!("Success".equals(message))) 
            {
                String[] msgs = message.split("_");
                for(int i = 0; i<msgs.length; i++)
                {
                    showPopupMessage(msgs[i], FacesMessage.SEVERITY_ERROR);
                }     
            }
            else
            {
                save();
                executeMethod("refreshData");
                ADFContext.getCurrent().getPageFlowScope().put("buSearchEnableFlag", "Y");
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
            String message = (String) executeMethod("saveWeekExceptionDays");
            if(!("Success".equals(message))) 
            {
                String[] msgs = message.split("_");
                for(int i = 0; i<msgs.length; i++)
                {
                    showPopupMessage(msgs[i], FacesMessage.SEVERITY_ERROR);
                }     
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

    public void transBuNameVL(ValueChangeEvent valueChangeEvent) 
    {
        try 
        {
            valueChangeEvent.getComponent().processUpdates(FacesContext.getCurrentInstance());
//            ADFContext.getCurrent().getPageFlowScope().put("buSearchEnableFlag", "N");
            String msg = (String) executeMethod("searchWeekExceptionDays");
            if(!("Success".equals(msg))) 
            {
                cancel();
                showPopupMessage(msg, FacesMessage.SEVERITY_ERROR);    
            }
            else{
//                save();
//                addPartialTrigger(getWeekOffTblBindgs());
            }
        }
        catch(Exception e) 
        {
            e.printStackTrace();    
        }
    }

    public void addExceptionDayAL(ActionEvent actionEvent) 
    {
        try 
        {
            executeMethod("addExceptionDay");
            ADFContext.getCurrent().getPageFlowScope().put("buSearchEnableFlag", "N");
        }
        catch(Exception e) 
        {
            e.printStackTrace();    
        }
    }

    public void addWeekOffDayAL(ActionEvent actionEvent) 
    {
        try 
        {
            executeMethod("addWeekOffDays");
            ADFContext.getCurrent().getPageFlowScope().put("buSearchEnableFlag", "N");
        }
        catch(Exception e) 
        {
            e.printStackTrace();    
        }
    }

    public void addSpecialWorkingDayAL(ActionEvent actionEvent) 
    {
        try 
        {
            executeMethod("addSpecialWorkingDays");
            ADFContext.getCurrent().getPageFlowScope().put("buSearchEnableFlag", "N");
        }
        catch(Exception e) 
        {
            e.printStackTrace();    
        }
    }

    public void deleteExceptionDayAL(ActionEvent actionEvent) 
    {
        try 
        {
            String msg = (String) executeMethod("deleteExceptionDay");
            if(!("Success".equals(msg))) 
            {
                showPopupMessage(msg, FacesMessage.SEVERITY_ERROR);    
            }
            else {
                ADFContext.getCurrent().getPageFlowScope().put("buSearchEnableFlag", "N");
            }
        }
        catch(Exception e) 
        {
            e.printStackTrace();    
        }
    }

    public void deleteSpecialWorkingDayAL(ActionEvent actionEvent) 
    {
        try 
        {
            String msg = (String) executeMethod("deleteSpecialWorkingDay");
            if(!("Success".equals(msg))) 
            {
                showPopupMessage(msg, FacesMessage.SEVERITY_ERROR);    
            }
            else {
                ADFContext.getCurrent().getPageFlowScope().put("buSearchEnableFlag", "N");
            }
        }
        catch(Exception e) 
        {
            e.printStackTrace();    
        }
    }

    public void weekoffDayVL(ValueChangeEvent valueChangeEvent) 
    {
        try 
        {
            valueChangeEvent.getComponent().processUpdates(FacesContext.getCurrentInstance());
            ADFContext.getCurrent().getPageFlowScope().put("buSearchEnableFlag", "N");
            String msg = (String) executeMethod("validateWeekDay");
            if(!("Success".equals(msg))) 
            {
                addPartialTrigger(getWeekdayBindgs());
                showPopupMessage(msg, FacesMessage.SEVERITY_ERROR);    
            }
        }
        catch(Exception e) 
        {
            e.printStackTrace();    
        }
    }

    public void setWeekdayBindgs(RichInputComboboxListOfValues weekdayBindgs) {
        this.weekdayBindgs = weekdayBindgs;
    }

    public RichInputComboboxListOfValues getWeekdayBindgs() {
        return weekdayBindgs;
    }

    public void exceptionDateVL(ValueChangeEvent valueChangeEvent) 
    {
        try 
        {
            valueChangeEvent.getComponent().processUpdates(FacesContext.getCurrentInstance());
            ADFContext.getCurrent().getPageFlowScope().put("buSearchEnableFlag", "N");
            String msg = (String) executeMethod("validateExceptionDate");
            if(!("Success".equals(msg)))
            {
                addPartialTrigger(getExceptionDateBindgs());
                showPopupMessage(msg, FacesMessage.SEVERITY_ERROR);
            }
        }
        catch(Exception e) 
        {
            e.printStackTrace();    
        }
    }

    public void setExceptionDateBindgs(RichInputDate exceptionDateBindgs) {
        this.exceptionDateBindgs = exceptionDateBindgs;
    }

    public RichInputDate getExceptionDateBindgs() {
        return exceptionDateBindgs;
    }

    public void setWeekOffTblBindgs(RichTable weekOffTblBindgs) {
        this.weekOffTblBindgs = weekOffTblBindgs;
    }

    public RichTable getWeekOffTblBindgs() {
        return weekOffTblBindgs;
    }

    public void setExceptionDayTblBindgs(RichTable exceptionDayTblBindgs) {
        this.exceptionDayTblBindgs = exceptionDayTblBindgs;
    }

    public RichTable getExceptionDayTblBindgs() {
        return exceptionDayTblBindgs;
    }

    public void spStartDateVL(ValueChangeEvent valueChangeEvent) 
    {
        try 
        {
            valueChangeEvent.getComponent().processUpdates(FacesContext.getCurrentInstance());
            ADFContext.getCurrent().getPageFlowScope().put("buSearchEnableFlag", "N");
            String msg = (String) executeMethod("validateSpStartDate");
            if(!("Success".equals(msg))) 
            {
                addPartialTrigger(getSpStartDateBindgs());
                showPopupMessage(msg, FacesMessage.SEVERITY_ERROR);    
            }
        }
        catch(Exception e) 
        {
            e.printStackTrace();    
        }
    }

    public void setSpStartDateBindgs(RichInputDate spStartDateBindgs) {
        this.spStartDateBindgs = spStartDateBindgs;
    }

    public RichInputDate getSpStartDateBindgs() {
        return spStartDateBindgs;
    }

    public void setSpEndDateBindgs(RichInputDate spEndDateBindgs) {
        this.spEndDateBindgs = spEndDateBindgs;
    }

    public RichInputDate getSpEndDateBindgs() {
        return spEndDateBindgs;
    }

    public void spEndDateVL(ValueChangeEvent valueChangeEvent) 
    {
        try 
        {
            valueChangeEvent.getComponent().processUpdates(FacesContext.getCurrentInstance());
            ADFContext.getCurrent().getPageFlowScope().put("buSearchEnableFlag", "N");
            String msg = (String) executeMethod("validateSpEndDate");
            if(!("Success".equals(msg))) 
            {
                addPartialTrigger(getSpEndDateBindgs());
                showPopupMessage(msg, FacesMessage.SEVERITY_ERROR);    
            }
        }
        catch(Exception e) 
        {
            e.printStackTrace();    
        }
    }

    public void addDocSeqAL(ActionEvent actionEvent) 
    {
        try 
        {
            String msg = (String) executeMethod("addNewDocSeq");
            ADFContext.getCurrent().getPageFlowScope().put("buSearchEnableFlag", "N");
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

    public void deleteDocSeqAL(ActionEvent actionEvent) 
    {
        try 
        {
            String msg = (String) executeMethod("deleteDocSeq");
            ADFContext.getCurrent().getPageFlowScope().put("buSearchEnableFlag", "N");
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
            ADFContext.getCurrent().getPageFlowScope().put("buSearchEnableFlag", "N");
            String msg = (String) executeMethod("validateSeqDates");
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
    
    public oracle.jbo.domain.Date getTransMaxDate() {
        oracle.jbo.domain.Date maxStartDate =
            new oracle.jbo.domain.Date((oracle.jbo.domain.Date)oracle.jbo.domain.Date.getCurrentDate());
        return maxStartDate;
    }

    public void docNameVL(ValueChangeEvent valueChangeEvent) 
    {
        try 
        {
            valueChangeEvent.getComponent().processUpdates(FacesContext.getCurrentInstance());
            String msg = (String) executeMethod("validateDocument");
            if(!("Success".equals(msg)))
            {
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

    public void setEffectiveFromDateBindgs(RichInputDate effectiveFromDateBindgs) {
        this.effectiveFromDateBindgs = effectiveFromDateBindgs;
    }

    public RichInputDate getEffectiveFromDateBindgs() {
        return effectiveFromDateBindgs;
    }

    public void setEffectiveToDateBindgs(RichInputDate effectiveToDateBindgs) {
        this.effectiveToDateBindgs = effectiveToDateBindgs;
    }

    public RichInputDate getEffectiveToDateBindgs() {
        return effectiveToDateBindgs;
    }

    public void docSeqVL(ValueChangeEvent valueChangeEvent) 
    {
        try 
        {
            valueChangeEvent.getComponent().processUpdates(FacesContext.getCurrentInstance());
            String msg = (String) executeMethod("updateCurrSequence");
            if(!("Success".equals(msg))) {
                addPartialTrigger(getCurrentSeqNumBindgs());
                showPopupMessage(msg, FacesMessage.SEVERITY_ERROR);
            }
            addPartialTrigger(getCurrentSeqNumBindgs());
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
}
