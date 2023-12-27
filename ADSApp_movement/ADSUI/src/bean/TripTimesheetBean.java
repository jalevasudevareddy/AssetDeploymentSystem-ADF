package bean;

import java.io.InputStream;
import java.io.OutputStream;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

import javax.faces.event.ValueChangeEvent;

import model.view.AttachmentsVORowImpl;

import oracle.adf.model.BindingContext;
import oracle.adf.model.binding.DCBindingContainer;
import oracle.adf.model.binding.DCIteratorBinding;
import oracle.adf.share.ADFContext;
import oracle.adf.view.rich.component.rich.RichPopup;
import oracle.adf.view.rich.component.rich.data.RichTable;
import oracle.adf.view.rich.component.rich.input.RichInputComboboxListOfValues;
import oracle.adf.view.rich.component.rich.input.RichInputDate;
import oracle.adf.view.rich.component.rich.input.RichInputText;
import oracle.adf.view.rich.component.rich.layout.RichPanelGroupLayout;
import oracle.adf.view.rich.component.rich.layout.RichPanelHeader;
import oracle.adf.view.rich.event.DialogEvent;

import oracle.jbo.Key;
import oracle.jbo.Row;
import oracle.jbo.RowSetIterator;

import oracle.jbo.domain.Number;

import org.apache.myfaces.trinidad.model.RowKeySet;
import org.apache.myfaces.trinidad.model.UploadedFile;

public class TripTimesheetBean extends CommonBean{
    private RichPanelHeader searchPageBind;
    private RichTable searchTableBind;
    private RichPanelGroupLayout transactionPageBind;
    private RichInputComboboxListOfValues srcBuHdrBind;
    private RichInputComboboxListOfValues srcDivHdrBind;
    private RichInputComboboxListOfValues reqBuHdrBind;
    private RichInputComboboxListOfValues contractNumHdrBind;
    private RichInputText custTypeHdrBind;
    private RichInputText custSiteHdrBind;
    private RichInputText projHdrBind;
    private RichInputText divHdrBind;
    private RichInputText deptHdrBind;
    private RichInputText customerHdrBind;
    private RichPopup closeConfirmPopupBind;
    private RichPopup attchPopupBind;
    private RichPanelHeader attchHdrBind;
    private RichPopup confirmPopupBind;
    private RichPopup clearPopupBind;
    private RichTable tripLinesTableBind;
    private RichInputDate timesheetDateBind;

    public TripTimesheetBean() {
        super();
    }

    public void searchTimesheetsAL(ActionEvent actionEvent) {
        try {
            String message = (String) executeMethod("searchTripTimesheet");
            if(!"Success".equals(message)){
                showPopupMessage(message, FacesMessage.SEVERITY_ERROR);
            }else{
                addPartialTrigger(getSearchTableBind());
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void resetTimesheetsAL(ActionEvent actionEvent) {
        try {
        
            String message = (String) executeMethod("resetTripTimesheet");
            if(!"Success".equals(message)){
                showPopupMessage(message, FacesMessage.SEVERITY_ERROR);
            }else{
                addPartialTrigger(getSearchPageBind());
                addPartialTrigger(getSearchTableBind());
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setSearchPageBind(RichPanelHeader searchPageBind) {
        this.searchPageBind = searchPageBind;
    }

    public RichPanelHeader getSearchPageBind() {
        return searchPageBind;
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
    
    public void createTripTimesheet(ActionEvent actionEvent) {
        try {
            String message = (String) executeMethod("createTripTimesheet");
            if(!"Success".equals(message)){
                showPopupMessage(message, FacesMessage.SEVERITY_ERROR);
            }else{
                setTimesheetSearchParams();
                ADFContext.getCurrent().getPageFlowScope().put("serviceTsEditFlag", "Y");
                navigateNew("Details");
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void editTripTimesheet(ActionEvent actionEvent) {
        try {
            String message = (String) executeMethod("editTripTimesheet");
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

    public void setSearchTableBind(RichTable searchTableBind) {
        this.searchTableBind = searchTableBind;
    }

    public RichTable getSearchTableBind() {
        return searchTableBind;
    }

    public void setTransactionPageBind(RichPanelGroupLayout transactionPageBind) {
        this.transactionPageBind = transactionPageBind;
    }

    public RichPanelGroupLayout getTransactionPageBind() {
        return transactionPageBind;
    }

    public void confirmTsAL(ActionEvent actionEvent) {
        // Add event code here...
    }

    public void saveTsAL(ActionEvent actionEvent) {
        try {
            String msg = /*(String) executeMethod("validateQuoteLines")*/"Success";
            if(!"Success".equals(msg)){
                String msgs[] = msg.split("_");
                for(int i = 0;i <msgs.length;i++){
                    showPopupMessage(msgs[i], FacesMessage.SEVERITY_ERROR);
                }
            }else{
                String newMsg = (String) executeMethod("generateTripTsNumber");
                if(!"Success".equals(newMsg)){
                    showPopupMessage(newMsg, FacesMessage.SEVERITY_ERROR);
                }else{
                    save();
                    ADFContext.getCurrent().getPageFlowScope().put("isSaved", "Y");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void saveAndCloseTsAL(ActionEvent actionEvent) {
        try {
            String msg = /*(String) executeMethod("validateQuoteLines")*/"Success";
            if(!"Success".equals(msg)){
                String msgs[] = msg.split("_");
                for(int i = 0;i <msgs.length;i++){
                    showPopupMessage(msgs[i], FacesMessage.SEVERITY_ERROR);
                }
            }else{
                String newMsg = (String) executeMethod("generateTripTsNumber");
                if(!"Success".equals(newMsg)){
                    showPopupMessage(newMsg, FacesMessage.SEVERITY_ERROR);
                }else{
                    save();
                    ADFContext.getCurrent().getPageFlowScope().put("isSaved", "Y");
                    executeMethod("setTripTimesheetSearch");
                    navigateNew("Back");
                }
            }            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void cancelTsAL(ActionEvent actionEvent) {
        try {
            if("N".equals(ADFContext.getCurrent().getPageFlowScope().get("isSaved"))){
                showPopup(getCloseConfirmPopupBind());              
            }else{
                cancel();
                ADFContext.getCurrent().getPageFlowScope().put("isSaved", "Y");
                executeMethod("setTripTimesheetSearch");
                navigateNew("Back");
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setSrcBuHdrBind(RichInputComboboxListOfValues srcBuHdrBind) {
        this.srcBuHdrBind = srcBuHdrBind;
    }

    public RichInputComboboxListOfValues getSrcBuHdrBind() {
        return srcBuHdrBind;
    }

    public void sourceBuValChList(ValueChangeEvent valueChangeEvent) {
        valueChangeEvent.getComponent().processUpdates(FacesContext.getCurrentInstance());
        ADFContext.getCurrent().getPageFlowScope().put("isSaved", "N");
        try {
            String message = (String) executeMethod("tripTsSourceBuChange");
            if(!"Success".equals(message)){
                showPopupMessage(message, FacesMessage.SEVERITY_ERROR);
            }
            addPartialTrigger(getContractNumHdrBind());
            addPartialTrigger(getSrcDivHdrBind());
            addPartialTrigger(getReqBuHdrBind());
            addPartialTrigger(getContractNumHdrBind());
            addPartialTrigger(getCustTypeHdrBind());
            addPartialTrigger(getProjHdrBind());
            addPartialTrigger(getDivHdrBind());
            addPartialTrigger(getDeptHdrBind());
            addPartialTrigger(getCustomerHdrBind());
            addPartialTrigger(getCustSiteHdrBind());
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setSrcDivHdrBind(RichInputComboboxListOfValues srcDivHdrBind) {
        this.srcDivHdrBind = srcDivHdrBind;
    }

    public RichInputComboboxListOfValues getSrcDivHdrBind() {
        return srcDivHdrBind;
    }

    public void setReqBuHdrBind(RichInputComboboxListOfValues reqBuHdrBind) {
        this.reqBuHdrBind = reqBuHdrBind;
    }

    public RichInputComboboxListOfValues getReqBuHdrBind() {
        return reqBuHdrBind;
    }

    public void setContractNumHdrBind(RichInputComboboxListOfValues contractNumHdrBind) {
        this.contractNumHdrBind = contractNumHdrBind;
    }

    public RichInputComboboxListOfValues getContractNumHdrBind() {
        return contractNumHdrBind;
    }

    public void setCustTypeHdrBind(RichInputText custTypeHdrBind) {
        this.custTypeHdrBind = custTypeHdrBind;
    }

    public RichInputText getCustTypeHdrBind() {
        return custTypeHdrBind;
    }

    public void setCustSiteHdrBind(RichInputText custSiteHdrBind) {
        this.custSiteHdrBind = custSiteHdrBind;
    }

    public RichInputText getCustSiteHdrBind() {
        return custSiteHdrBind;
    }

    public void setProjHdrBind(RichInputText projHdrBind) {
        this.projHdrBind = projHdrBind;
    }

    public RichInputText getProjHdrBind() {
        return projHdrBind;
    }

    public void setDivHdrBind(RichInputText divHdrBind) {
        this.divHdrBind = divHdrBind;
    }

    public RichInputText getDivHdrBind() {
        return divHdrBind;
    }

    public void setDeptHdrBind(RichInputText deptHdrBind) {
        this.deptHdrBind = deptHdrBind;
    }

    public RichInputText getDeptHdrBind() {
        return deptHdrBind;
    }

    public void setCustomerHdrBind(RichInputText customerHdrBind) {
        this.customerHdrBind = customerHdrBind;
    }

    public RichInputText getCustomerHdrBind() {
        return customerHdrBind;
    }

    public void setCloseConfirmPopupBind(RichPopup closeConfirmPopupBind) {
        this.closeConfirmPopupBind = closeConfirmPopupBind;
    }

    public RichPopup getCloseConfirmPopupBind() {
        return closeConfirmPopupBind;
    }

    public void closeConfirmDL(DialogEvent dialogEvent) {
        try {
            if(dialogEvent.getOutcome() == DialogEvent.Outcome.yes){
                cancel();
                ADFContext.getCurrent().getPageFlowScope().put("isSaved", "Y");
                executeMethod("setTripTimesheetSearch");
                navigateNew("Back");
            }else{
                getCloseConfirmPopupBind().hide();
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void attachAL(ActionEvent actionEvent) {
        try {
            showPopup(getAttchPopupBind());
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void confirmAL(ActionEvent actionEvent) {
        try {                       
            String newMsg = (String) executeMethod("generateTripTsNumber");
            if(!"Success".equals(newMsg)){
                showPopupMessage(newMsg, FacesMessage.SEVERITY_ERROR);
            }else{
                save();
                ADFContext.getCurrent().getPageFlowScope().put("isTsSaved", "Y");
                showPopup(getConfirmPopupBind());
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void sourceDivVL(ValueChangeEvent valueChangeEvent) {
        valueChangeEvent.getComponent().processUpdates(FacesContext.getCurrentInstance());
        ADFContext.getCurrent().getPageFlowScope().put("isSaved", "N");
        try {
            String message = (String) executeMethod("tripTsSourceDivChange");
            if(!"Success".equals(message)){
                showPopupMessage(message, FacesMessage.SEVERITY_ERROR);
            }
            addPartialTrigger(getContractNumHdrBind());
            addPartialTrigger(getReqBuHdrBind());
            addPartialTrigger(getCustTypeHdrBind());
            addPartialTrigger(getProjHdrBind());
            addPartialTrigger(getDivHdrBind());
            addPartialTrigger(getDeptHdrBind());
            addPartialTrigger(getCustomerHdrBind());
            addPartialTrigger(getCustSiteHdrBind());
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void reqBuVL(ValueChangeEvent valueChangeEvent) {
        try {
            ADFContext.getCurrent().getPageFlowScope().put("isSaved", "N");
            valueChangeEvent.getComponent().processUpdates(FacesContext.getCurrentInstance());
            String message = (String) executeMethod("tripTsRequestingBuChange");
            if(!"Success".equals(message)){
                showPopupMessage(message, FacesMessage.SEVERITY_ERROR);
            }
            addPartialTrigger(getContractNumHdrBind());
            addPartialTrigger(getCustTypeHdrBind());
            addPartialTrigger(getProjHdrBind());
            addPartialTrigger(getDivHdrBind());
            addPartialTrigger(getDeptHdrBind());
            addPartialTrigger(getCustomerHdrBind());
            addPartialTrigger(getCustSiteHdrBind());
        }catch (Exception e) {
            e.printStackTrace();
        }
    }


    public void tripTsContractNumVL(ValueChangeEvent valueChangeEvent) {
        try {
            ADFContext.getCurrent().getPageFlowScope().put("isSaved", "N");
            valueChangeEvent.getComponent().processUpdates(FacesContext.getCurrentInstance());
            String message = (String) executeMethod("tripTsContractNoChange");
            if(!"Success".equals(message)){
                showPopupMessage(message, FacesMessage.SEVERITY_ERROR);
            }            
            addPartialTrigger(getCustTypeHdrBind());
            addPartialTrigger(getProjHdrBind());
            addPartialTrigger(getDivHdrBind());
            addPartialTrigger(getDeptHdrBind());
            addPartialTrigger(getCustomerHdrBind());
            addPartialTrigger(getCustSiteHdrBind());
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setAttchPopupBind(RichPopup attchPopupBind) {
        this.attchPopupBind = attchPopupBind;
    }

    public RichPopup getAttchPopupBind() {
        return attchPopupBind;
    }

    public void setAttchHdrBind(RichPanelHeader attchHdrBind) {
        this.attchHdrBind = attchHdrBind;
    }

    public RichPanelHeader getAttchHdrBind() {
        return attchHdrBind;
    }

    public void addAttachment(ActionEvent actionEvent) {
        try {
            ADFContext.getCurrent().getPageFlowScope().put("isSaved", "N");
            String message = (String) executeMethod("addTripTsAttachment");
            if(!"Success".equals(message)){
                showPopupMessage(message, FacesMessage.SEVERITY_ERROR);
            }
            addPartialTrigger(getAttchHdrBind());
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void deleteAttachment(ActionEvent actionEvent) {
        try {
            ADFContext.getCurrent().getPageFlowScope().put("isSaved", "N");
            executeMethod("Delete");
            addPartialTrigger(getAttchHdrBind());
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void uploadFileVL(ValueChangeEvent valueChangeEvent) {
        valueChangeEvent.getComponent().processUpdates(FacesContext.getCurrentInstance());
        try {
            Map pageFlowScope = ADFContext.getCurrent().getPageFlowScope();

            try {
                pageFlowScope.put("tripTsUploadedFileStream",((UploadedFile)valueChangeEvent.getNewValue()).getInputStream());
                pageFlowScope.put("tripTsFileName",((UploadedFile)valueChangeEvent.getNewValue()).getFilename());
                pageFlowScope.put("tripTsFileType",((UploadedFile)valueChangeEvent.getNewValue()).getContentType());
                
                String str = (String)executeMethod("uploadTripTsAttach");
                if(!"Success".equals(str)){
                    showPopupMessage("Not a valid File", FacesMessage.SEVERITY_ERROR);
                }
                else {
                    ADFContext.getCurrent().getPageFlowScope().put("isSaved", "N");
                }
                
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            addPartialTrigger(getAttchHdrBind());
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void downloadQuoteAttachment(FacesContext facesContext, OutputStream outputStream) {
        try {
            DCBindingContainer binding =
                (DCBindingContainer)BindingContext.getCurrent().getCurrentBindingsEntry();
            DCIteratorBinding bindingIterator =
                binding.findIteratorBinding("AttachmentsVO5Iterator");
            RowSetIterator row = bindingIterator.getRowSetIterator();
            if (bindingIterator != null) {
                AttachmentsVORowImpl currentRow =
                    (AttachmentsVORowImpl)row.getCurrentRow();
                if (!currentRow.getPrimaryRowState().isNew()) {
                    currentRow.refresh(Row.REFRESH_UNDO_CHANGES);
                }

                if (currentRow != null) {
                    int ch = -1;
                    try {
                        InputStream in =
                            currentRow.getAttachmentFile().getInputStream();
                        while ((ch = in.read()) != -1) {
                            outputStream.write(ch);
                        }
                        outputStream.close();
                        in.close();

                    } catch (Exception e) {
                        System.out.println(e.getMessage() +
                                           "  Error in downloading");
                    }
                }
            }
        }catch(Exception e){
            e.printStackTrace();
        }

    }

    public void setConfirmPopupBind(RichPopup confirmPopupBind) {
        this.confirmPopupBind = confirmPopupBind;
    }

    public RichPopup getConfirmPopupBind() {
        return confirmPopupBind;
    }

    public void confirmTSDL(DialogEvent dialogEvent) {
        if(DialogEvent.Outcome.yes == dialogEvent.getOutcome()){
            String message = (String) executeMethod("confirmTripTimesheet");
            if(!"Success".equals(message)){
                showPopupMessage(message, FacesMessage.SEVERITY_ERROR);
            }else{      
                save();
                addPartialTrigger(getTransactionPageBind());
            }
        }
    }

    public void populateTsAL(ActionEvent actionEvent) {
        try {
            String message = (String) executeMethod("populateTripTimesheets");
            if(!"Success".equals(message)){
                showPopupMessage(message, FacesMessage.SEVERITY_ERROR);
            }else{
                addPartialTrigger(getTripLinesTableBind());
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clearTsAL(ActionEvent actionEvent) {
        showPopup(getClearPopupBind());
    }

    public void setClearPopupBind(RichPopup clearPopupBind) {
        this.clearPopupBind = clearPopupBind;
    }

    public RichPopup getClearPopupBind() {
        return clearPopupBind;
    }

    public void clearTimesheetDL(DialogEvent dialogEvent) {
        try {
            if(dialogEvent.getOutcome() == DialogEvent.Outcome.yes){
                String message = (String) executeMethod("clearTripTimesheets");
                if(!"Success".equals(message)){
                    showPopupMessage(message, FacesMessage.SEVERITY_ERROR);
                }else{
                    addPartialTrigger(getTripLinesTableBind());
                }
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setTripLinesTableBind(RichTable tripLinesTableBind) {
        this.tripLinesTableBind = tripLinesTableBind;
    }

    public RichTable getTripLinesTableBind() {
        return tripLinesTableBind;
    }

    public void timesheetDateValChList(ValueChangeEvent valueChangeEvent) {
        try {
            ADFContext.getCurrent().getPageFlowScope().put("isSaved", "N");
            valueChangeEvent.getComponent().processUpdates(FacesContext.getCurrentInstance());
            String message = (String) executeMethod("tripTsTimesheetDateChange");
            if(!"Success".equals(message)){
                showPopupMessage(message, FacesMessage.SEVERITY_ERROR);
            }            
            addPartialTrigger(getTimesheetDateBind());
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setTimesheetDateBind(RichInputDate timesheetDateBind) {
        this.timesheetDateBind = timesheetDateBind;
    }

    public RichInputDate getTimesheetDateBind() {
        return timesheetDateBind;
    }

    public void bulkConfirmTsAL(ActionEvent actionEvent) {
        RowKeySet selectedts = getSearchTableBind().getSelectedRowKeys();
        Iterator selectedTsIter = selectedts.iterator();
        DCBindingContainer bindings =
            (DCBindingContainer)BindingContext.getCurrent().getCurrentBindingsEntry();
        DCIteratorBinding empIter =
            bindings.findIteratorBinding("TripHeaderSearchVO1Iterator");
        RowSetIterator empRSIter = empIter.getRowSetIterator();
        List<Long> headerIds = new ArrayList();
        while (selectedTsIter.hasNext()) {
            Key key = (Key)((List)selectedTsIter.next()).get(0);
            Row currentRow = empRSIter.getRow(key);
            headerIds.add(((Number)currentRow.getAttribute("HeaderId")).longValue());
        }
        ADFContext.getCurrent().getPageFlowScope().put("tripConfirmHdrs", headerIds);

        try {
            Object obj = executeMethod("tripConfirmBulkTS");
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
}
