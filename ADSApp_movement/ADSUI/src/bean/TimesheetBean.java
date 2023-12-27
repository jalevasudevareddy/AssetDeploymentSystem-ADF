package bean;

import java.io.OutputStream;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

import javax.faces.event.ValueChangeEvent;

import model.view.TimesheetLinesVOImpl;

import model.view.TimesheetLinesVORowImpl;

import oracle.adf.model.BindingContext;
import oracle.adf.model.binding.DCBindingContainer;
import oracle.adf.model.binding.DCIteratorBinding;
import oracle.adf.share.ADFContext;
import oracle.adf.view.rich.component.rich.RichPopup;
import oracle.adf.view.rich.component.rich.data.RichTable;
import oracle.adf.view.rich.component.rich.input.RichInputComboboxListOfValues;
import oracle.adf.view.rich.component.rich.input.RichInputDate;
import oracle.adf.view.rich.component.rich.input.RichInputFile;
import oracle.adf.view.rich.component.rich.input.RichInputText;
import oracle.adf.view.rich.component.rich.layout.RichPanelGroupLayout;
import oracle.adf.view.rich.context.AdfFacesContext;
import oracle.adf.view.rich.event.DialogEvent;

import oracle.jbo.Key;
import oracle.jbo.Row;
import oracle.jbo.RowSetIterator;
import oracle.jbo.domain.Number;

import org.apache.myfaces.trinidad.model.RowKeySet;

public class TimesheetBean extends CommonBean {
    private RichTable searchTblBind;
    private RichPanelGroupLayout totPageBind;
    private RichPopup confirmPopupBind;
    private RichPopup clearPopupBind;
    private RichPopup cancelPopupBind;
    private RichInputComboboxListOfValues assetBind;
    private RichInputComboboxListOfValues empNumBind;
    private RichInputDate startTimeBind;
    private RichInputDate endTimeBind;
    private RichInputText totHrsBind;
    private RichPopup uploadPopUpBind;
    private RichTable timeSheetIntTableBind;
    private RichInputComboboxListOfValues contractBind;
    private RichInputComboboxListOfValues tsPeriodBind;
    private RichInputFile getFileNameBinding;
    private RichInputText fileNameBinding;
    private RichInputText slipNumberBind;

    public TimesheetBean() {
        super();
    }
    
    public void setTimesheetSearchParams(){
        try {
            Map pf = ADFContext.getCurrent().getPageFlowScope();
            pf.put("tsSrcBu", getEL("#{bindings.TransSrcBu.inputValue}"));
            pf.put("tsSrcDivRequired", getEL("#{bindings.TransSrcDivRequired.inputValue}"));
            pf.put("tsSrcDivSegmentNum", getEL("#{bindings.TransSrcDivSegmentNum.inputValue}"));
            pf.put("tsSrcDeptSegmentNum", getEL("#{bindings.TransSrcDeptSegmentNum.inputValue}"));
            pf.put("tsSrcBuId", getEL("#{bindings.TransSrcBuId.inputValue}"));
            pf.put("tsSrcDivision", getEL("#{bindings.TransSrcDivsion.inputValue}"));
            pf.put("tsSrcDivFlexValId", getEL("#{bindings.TransSrcDivFlexValId.inputValue}"));
            pf.put("tsReqBu", getEL("#{bindings.TransReqBu.inputValue}"));
            pf.put("tsReqBuId", getEL("#{bindings.TransReqBuId.inputValue}"));
            pf.put("tsContractNo", getEL("#{bindings.TransContractNo.inputValue}"));
            pf.put("tsContractId", getEL("#{bindings.TransContractId.inputValue}"));
            pf.put("tsCustomerType", getEL("#{bindings.TransCustomerType.inputValue}"));
            pf.put("tsCustomerTypeCode", getEL("#{bindings.TransCustomerTypeCode.inputValue}"));
            pf.put("tsProject", getEL("#{bindings.TransProject.inputValue}"));
            pf.put("tsProjectId", getEL("#{bindings.TransProjectId.inputValue}"));
            pf.put("tsDivision", getEL("#{bindings.TransDivision.inputValue}"));
            pf.put("tsDivFlexValId", getEL("#{bindings.TransDivFlexValId.inputValue}"));
            pf.put("tsDepartment", getEL("#{bindings.TransDeptName.inputValue}"));
            pf.put("tsDeptFlexValId", getEL("#{bindings.TransDeptFlexValId.inputValue}"));
            pf.put("tsCustomerName", getEL("#{bindings.TransCustomerName.inputValue}"));
            pf.put("tsCustomerId", getEL("#{bindings.TransCustomerId.inputValue}"));
            pf.put("tsTimesheetNum", getEL("#{bindings.TransTimesheetNumber.inputValue}"));            
            pf.put("tsReqDeptSegmentNum", getEL("#{bindings.TransReqDeptSegmentNum.inputValue}"));
            pf.put("tsReqDivSegmentNum", getEL("#{bindings.TransReqDivSegmentNum.inputValue}"));
            pf.put("tsPeriod", getEL("#{bindings.TransPeriod.inputValue}"));
            pf.put("tsPeriodStartDate", getEL("#{bindings.TransPeriodStartDate.inputValue}"));
            pf.put("tsPeriodEndDate", getEL("#{bindings.TransPeriodEndDate.inputValue}"));
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void searchTimesheetsAL(ActionEvent actionEvent) {
        try {
            executeMethod("searchTimesheets");
            addPartialTrigger(getSearchTblBind());
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void resetTimesheetsAL(ActionEvent actionEvent) {
        try {
            executeMethod("resetTimesheets");
            addPartialTrigger(getSearchTblBind());
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setSearchTblBind(RichTable searchTblBind) {
        this.searchTblBind = searchTblBind;
    }

    public RichTable getSearchTblBind() {
        return searchTblBind;
    }

    public void createTimesheetAL(ActionEvent actionEvent) {
        try {
            String message = (String) executeMethod("createDailyTimesheet");
            if(!"Success".equals(message)){
                showPopupMessage(message, FacesMessage.SEVERITY_ERROR);
            }else{
                setTimesheetSearchParams();
                navigateNew("Details");
                ADFContext.getCurrent().getPageFlowScope().put("siteTsEditFlag", "Y");
                ADFContext.getCurrent().getPageFlowScope().put("isTsSaved", "N");
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void editTimesheetAL(ActionEvent actionEvent) {
        try {
            String message = (String) executeMethod("editDailyTimesheet");
            if(!"Success".equals(message)){
                showPopupMessage(message, FacesMessage.SEVERITY_ERROR);
            }else{
                setTimesheetSearchParams();
                navigateNew("Details");
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void confirmTSDL(DialogEvent dialogEvent) {
        if(DialogEvent.Outcome.yes == dialogEvent.getOutcome()){
            String message = (String) executeMethod("confirmTimesheet");
            if(!"Success".equals(message)){
                showPopupMessage(message, FacesMessage.SEVERITY_ERROR);
            }else{      
                save();
                addPartialTrigger(getTotPageBind());
            }
        }
    }

    public void confirmTsAL(ActionEvent actionEvent) {
        try {            
            ADFContext.getCurrent().getPageFlowScope().put("isTsSaved", "Y");
            String newMsg = (String) executeMethod("generateSiteTsNumber");
            if(!"Success".equals(newMsg)){
                showPopupMessage(newMsg, FacesMessage.SEVERITY_ERROR);
            }else{
                save();
                showPopup(getConfirmPopupBind());
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void saveTsAL(ActionEvent actionEvent) {
        try {
            String newMsg = (String) executeMethod("generateSiteTsNumber");
            if(!"Success".equals(newMsg)){
                showPopupMessage(newMsg, FacesMessage.SEVERITY_ERROR);
            }else{
                save();
                ADFContext.getCurrent().getPageFlowScope().put("isTsSaved", "Y");
                addPartialTrigger(getTotPageBind());
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void saveAndCloseTsAL(ActionEvent actionEvent) {
        try {  
            String newMsg = (String) executeMethod("generateSiteTsNumber");
            if(!"Success".equals(newMsg)){
                showPopupMessage(newMsg, FacesMessage.SEVERITY_ERROR);
            }else{
                save();
                ADFContext.getCurrent().getPageFlowScope().put("isTsSaved", "Y");
                navigateNew("Back");
                executeMethod("setTimesheetSearch");
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void cancelTsAL(ActionEvent actionEvent) {
        try {
            if("N".equals(ADFContext.getCurrent().getPageFlowScope().get("isTsSaved"))){
                showPopup(getCancelPopupBind());
            }
            else{
                cancel();
                navigateNew("Back");
                ADFContext.getCurrent().getPageFlowScope().put("isTsSaved", "Y");
                executeMethod("setTimesheetSearch");
                
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setTotPageBind(RichPanelGroupLayout totPageBind) {
        this.totPageBind = totPageBind;
    }

    public RichPanelGroupLayout getTotPageBind() {
        return totPageBind;
    }

    public void setConfirmPopupBind(RichPopup confirmPopupBind) {
        this.confirmPopupBind = confirmPopupBind;
    }

    public RichPopup getConfirmPopupBind() {
        return confirmPopupBind;
    }

    public void setClearPopupBind(RichPopup clearPopupBind) {
        this.clearPopupBind = clearPopupBind;
    }

    public RichPopup getClearPopupBind() {
        return clearPopupBind;
    }

    public void setCancelPopupBind(RichPopup cancelPopupBind) {
        this.cancelPopupBind = cancelPopupBind;
    }

    public RichPopup getCancelPopupBind() {
        return cancelPopupBind;
    }

    public void cancelTsDL(DialogEvent dialogEvent) {
        try{	
            if(dialogEvent.getOutcome() == DialogEvent.Outcome.yes){
                cancel();
                navigateNew("Back");
                ADFContext.getCurrent().getPageFlowScope().put("isTsSaved", "Y");
                executeMethod("setTimesheetSearch");
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public void closeTsAL(ActionEvent actionEvent) {
        try {
            navigateNew("Back");
            executeMethod("setTimesheetSearch");
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void bulkConfirmTsAL(ActionEvent actionEvent) {
        RowKeySet selectedts = getSearchTblBind().getSelectedRowKeys();
        Iterator selectedTsIter = selectedts.iterator();
        DCBindingContainer bindings =
            (DCBindingContainer)BindingContext.getCurrent().getCurrentBindingsEntry();
        DCIteratorBinding empIter =
            bindings.findIteratorBinding("TimesheetSearchVO1Iterator");
        RowSetIterator empRSIter = empIter.getRowSetIterator();
        List<Long> headerIds = new ArrayList();
        while (selectedTsIter.hasNext()) {
            Key key = (Key)((List)selectedTsIter.next()).get(0);
            Row currentRow = empRSIter.getRow(key);
            headerIds.add(((Number)currentRow.getAttribute("TsHeaderId")).longValue());
        }
        ADFContext.getCurrent().getPageFlowScope().put("confirmHdrs", headerIds);

        try {
            Object obj = executeMethod("confirmBulkTS");
            if(!"Success".equals(obj.toString())){
            
                String[] msgs = obj.toString().split("_");
                FacesContext fctx = FacesContext.getCurrentInstance();
                for(int l= 0;l<msgs.length;l++){
                    FacesMessage message = new FacesMessage(msgs[l]);
                    if(msgs[l] != null && (msgs[l].contains("Update") || msgs[l].contains("Unable"))){
                        message.setSeverity(FacesMessage.SEVERITY_WARN);
                    }else{
                        message.setSeverity(FacesMessage.SEVERITY_ERROR);
                    }
                    
                    fctx.addMessage(" ", message);
                }
            }else{
                showPopupMessage("Selected Timesheets are Confirmed", FacesMessage.SEVERITY_INFO);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void createTsLineAL(ActionEvent actionEvent) {
        try {
            String message = (String) executeMethod("createTimesheetLine");
            if(!"Success".equals(message)){
                showPopupMessage(message, FacesMessage.SEVERITY_ERROR);
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void deleteTsLineAL(ActionEvent actionEvent) {
        try {
            DCBindingContainer binding = (DCBindingContainer) BindingContext.getCurrent().getCurrentBindingsEntry();
            DCIteratorBinding bindingIterator = binding.findIteratorBinding("TimesheetLinesVO1Iterator");
            TimesheetLinesVOImpl tsVO = (TimesheetLinesVOImpl) bindingIterator.getViewObject();
            if(tsVO != null){
               TimesheetLinesVORowImpl currentRow = (TimesheetLinesVORowImpl) tsVO.getCurrentRow();
               if(currentRow != null && !"Y".equals(currentRow.getBillingFlag()) && !"Y".equals(currentRow.getTimesheetFlag()) && currentRow.getBillingHdrId()== null){
                      currentRow.remove();
               }else{
                   showPopupMessage("Line can't be deleted, as it is already billed or transfered to payroll", FacesMessage.SEVERITY_ERROR);
               }
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void tsDateVL(ValueChangeEvent valueChangeEvent) {
        valueChangeEvent.getComponent().processUpdates(FacesContext.getCurrentInstance());
        try {
            String message = (String) executeMethod("siteTsDateChange");
            if(!"Success".equals(message)){
                showPopupMessage(message, FacesMessage.SEVERITY_ERROR);
            }
            addPartialTrigger(getAssetBind());
            addPartialTrigger(getEmpNumBind());
            addPartialTrigger(getStartTimeBind());
            addPartialTrigger(getEndTimeBind());
            addPartialTrigger(getTotHrsBind());
            addPartialTrigger(getSlipNumberBind());
            ADFContext.getCurrent().getPageFlowScope().put("isTsSaved", "N");
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void assetNumVL(ValueChangeEvent valueChangeEvent) {
        valueChangeEvent.getComponent().processUpdates(FacesContext.getCurrentInstance());
        try {
            String message = (String) executeMethod("siteAssetChange");
            if(!"Success".equals(message)){
                showPopupMessage(message, FacesMessage.SEVERITY_ERROR);
            }
            addPartialTrigger(getEmpNumBind());
            addPartialTrigger(getStartTimeBind());
            addPartialTrigger(getEndTimeBind());
            addPartialTrigger(getTotHrsBind());
            ADFContext.getCurrent().getPageFlowScope().put("isTsSaved", "N");
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void changeVL(ValueChangeEvent valueChangeEvent) {
        valueChangeEvent.getComponent().processUpdates(FacesContext.getCurrentInstance());
        try {
            ADFContext.getCurrent().getPageFlowScope().put("isTsSaved", "N");
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void startTimeVL(ValueChangeEvent valueChangeEvent) {
        valueChangeEvent.getComponent().processUpdates(FacesContext.getCurrentInstance());
        try {
            String message = (String) executeMethod("siteStartTimeChange");
            if(!"Success".equals(message)){
                addPartialTrigger(getStartTimeBind());
                showPopupMessage(message, FacesMessage.SEVERITY_ERROR);
            }
            addPartialTrigger(getEndTimeBind());
            addPartialTrigger(getTotHrsBind());
            ADFContext.getCurrent().getPageFlowScope().put("isTsSaved", "N");
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void endTimeVL(ValueChangeEvent valueChangeEvent) {
        valueChangeEvent.getComponent().processUpdates(FacesContext.getCurrentInstance());
        try {
            String message = (String) executeMethod("siteEndTimeChange");
            if(!"Success".equals(message)){
                addPartialTrigger(getEndTimeBind());
                showPopupMessage(message, FacesMessage.SEVERITY_ERROR);
            }
            addPartialTrigger(getTotHrsBind());
            ADFContext.getCurrent().getPageFlowScope().put("isTsSaved", "N");
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setAssetBind(RichInputComboboxListOfValues assetBind) {
        this.assetBind = assetBind;
    }

    public RichInputComboboxListOfValues getAssetBind() {
        return assetBind;
    }

    public void setEmpNumBind(RichInputComboboxListOfValues empNumBind) {
        this.empNumBind = empNumBind;
    }

    public RichInputComboboxListOfValues getEmpNumBind() {
        return empNumBind;
    }

    public void setStartTimeBind(RichInputDate startTimeBind) {
        this.startTimeBind = startTimeBind;
    }

    public RichInputDate getStartTimeBind() {
        return startTimeBind;
    }

    public void setEndTimeBind(RichInputDate endTimeBind) {
        this.endTimeBind = endTimeBind;
    }

    public RichInputDate getEndTimeBind() {
        return endTimeBind;
    }

    public void setTotHrsBind(RichInputText totHrsBind) {
        this.totHrsBind = totHrsBind;
    }

    public RichInputText getTotHrsBind() {
        return totHrsBind;
    }

    public void uploadPopUpOpenAL(ActionEvent actionEvent) 
    {
        try{
            String newMsg = (String) executeMethod("generateSiteTsNumber");
            if(!"Success".equals(newMsg)){
                showPopupMessage(newMsg, FacesMessage.SEVERITY_ERROR);
            }else{
                save();
                executeMethod("clearUploadedFileData");
                if(ADFContext.getCurrent().getPageFlowScope().get("UploadedFile") != null)
                {
                    this.getGetFileNameBinding().setValue(null);//Inputfile Binding
                    addPartialTrigger(getGetFileNameBinding());
                }
                showPopup(getUploadPopUpBind());
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void downloadTimeSheetTemplate(FacesContext facesContext, OutputStream outputStream)
    {
        try {
                    
            byte[] obj= (byte[])executeMethod("downloadTimeSheetTemplate");
            outputStream.write(obj);
            outputStream.flush();
                                
        }catch (Exception e) {
            // TODO: Add catch code
            e.printStackTrace();
        }

    }

    public void setUploadPopUpBind(RichPopup uploadPopUpBind) {
        this.uploadPopUpBind = uploadPopUpBind;
    }

    public RichPopup getUploadPopUpBind() {
        return uploadPopUpBind;
    }

    public void uploadFileVL(ValueChangeEvent valueChangeEvent) 
    {
        try
        {
            valueChangeEvent.getComponent().processUpdates(FacesContext.getCurrentInstance());
            if(ADFContext.getCurrent().getPageFlowScope().get("UploadedFile") != null)
            {
                executeMethod("insertIntTimeSheetData");
            }                                                
        }catch (Exception e) {
            // TODO: Add catch code
            e.printStackTrace();
        }
    }

    public void processUploadDataAL(ActionEvent actionEvent)
    {
        executeMethod("processTimeSheetData");
        AdfFacesContext context = AdfFacesContext.getCurrentInstance();
        context.addPartialTarget(getTimeSheetIntTableBind());
    }

    public void cancelUploadDataAL(ActionEvent actionEvent) 
    {
        executeMethod("cancelTimeSheetData");
        getUploadPopUpBind().hide();
        
    }

    public void setTimeSheetIntTableBind(RichTable timeSheetIntTableBind) {
        this.timeSheetIntTableBind = timeSheetIntTableBind;
    }

    public RichTable getTimeSheetIntTableBind() {
        return timeSheetIntTableBind;
    }

    public void tsContractVL(ValueChangeEvent valueChangeEvent) {
        try {
            valueChangeEvent.getComponent().processUpdates(FacesContext.getCurrentInstance());
            ADFContext.getCurrent()
                      .getPageFlowScope()
                      .put("isTsSaved", "N");
            String message = (String) executeMethod("tsContractChange");
            if(!"Success".equals(message)){
                showPopupMessage(message, FacesMessage.SEVERITY_ERROR);
                addPartialTrigger(getContractBind());
            }
            addPartialTrigger(getTsPeriodBind());
        }catch (Exception e) {
            e.printStackTrace();
        }        
    }

    public void tsPeriodVL(ValueChangeEvent valueChangeEvent) {
        try {
            valueChangeEvent.getComponent().processUpdates(FacesContext.getCurrentInstance());
            ADFContext.getCurrent()
                      .getPageFlowScope()
                      .put("isTsSaved", "N");
            String message = (String) executeMethod("tsPeriodChange");
            if(!"Success".equals(message)){
                showPopupMessage(message, FacesMessage.SEVERITY_ERROR);
                addPartialTrigger(getTsPeriodBind());
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setContractBind(RichInputComboboxListOfValues contractBind) {
        this.contractBind = contractBind;
    }

    public RichInputComboboxListOfValues getContractBind() {
        return contractBind;
    }

    public void setTsPeriodBind(RichInputComboboxListOfValues tsPeriodBind) {
        this.tsPeriodBind = tsPeriodBind;
    }

    public RichInputComboboxListOfValues getTsPeriodBind() {
        return tsPeriodBind;
    }

    public void setGetFileNameBinding(RichInputFile getFileNameBinding) {
        this.getFileNameBinding = getFileNameBinding;
    }

    public RichInputFile getGetFileNameBinding() {
        return getFileNameBinding;
    }

    public void setFileNameBinding(RichInputText fileNameBinding) {
        this.fileNameBinding = fileNameBinding;
    }

    public RichInputText getFileNameBinding() {
        return fileNameBinding;
    }

    public void slipNumberVL(ValueChangeEvent valueChangeEvent) {
        valueChangeEvent.getComponent().processUpdates(FacesContext.getCurrentInstance());
        try {
            ADFContext.getCurrent()
                      .getPageFlowScope()
                      .put("isTsSaved", "N");
            String message = (String) executeMethod("siteSlipNumberChange");
            if(!"Success".equals(message)){
                showPopupMessage(message, FacesMessage.SEVERITY_ERROR);
                addPartialTrigger(getSlipNumberBind());
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setSlipNumberBind(RichInputText slipNumberBind) {
        this.slipNumberBind = slipNumberBind;
    }

    public RichInputText getSlipNumberBind() {
        return slipNumberBind;
    }
}
