package bean;

import java.io.InputStream;
import java.io.OutputStream;

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
import oracle.adf.view.rich.component.rich.input.RichSelectBooleanCheckbox;
import oracle.adf.view.rich.component.rich.layout.RichPanelHeader;
import oracle.adf.view.rich.event.DialogEvent;

import oracle.jbo.Row;
import oracle.jbo.RowSetIterator;

import org.apache.myfaces.trinidad.model.UploadedFile;

public class AssetDeploymentReceiptBean extends CommonBean{
    private RichTable searchTableBind;
    private RichInputComboboxListOfValues srcBuHdrBind;
    private RichInputComboboxListOfValues srcDivHdrBind;
    private RichInputComboboxListOfValues reqBuHdrBind;
    private RichInputComboboxListOfValues contractNumHdrBind;
    private RichInputComboboxListOfValues doNumHdrBind;
    private RichInputText custTypeHdrBind;
    private RichInputText projHdrBind;
    private RichInputText divHdrBind;
    private RichInputText deptHdrBind;
    private RichInputText customerHdrBind;
    private RichInputText custSiteHdrBind;
    private RichPanelHeader txnsPageBind;
    private RichPopup closeConfirmPopupBind;
    private RichInputDate lineReceiptDateBind;
    private RichTable rctLinesBind;
    private RichTable rctLinesAcceBind;
    private RichTable rctLinesAccesTableBind;
    private RichTable rctLinesMobTableBind;
    private RichPopup attchPopupBind;
    private RichPanelHeader attchHdrBind;
    private RichPopup commitPopupBindgs;
    private RichPopup populateLinesPopupBind;
    private RichSelectBooleanCheckbox selectAllBind;
    private RichTable rctDeployOrderLinestableBind;
    private RichPopup confirmPopupBind;
    private RichInputComboboxListOfValues hdrBuBind;
    private RichInputComboboxListOfValues hdrDivBind;
    private RichPanelHeader searchPageBind;
    private RichInputComboboxListOfValues hdrReqBuBind;
    private RichInputComboboxListOfValues hdrContNumBind;
    private RichInputComboboxListOfValues hdrCustTypeBind;
    private RichInputComboboxListOfValues hdrProjBind;
    private RichInputComboboxListOfValues hdrCustDivBind;
    private RichInputComboboxListOfValues hdrDeptNameBind;
    private RichInputComboboxListOfValues hdrCustNameBind;
    private RichInputComboboxListOfValues hdrADRNumBind;
    private RichInputDate hdrRctDateBind;

    public AssetDeploymentReceiptBean() {
        super();
    }
    
    public void receiptSearch(ActionEvent actionEvent) {
        try {
            String message = (String) executeMethod("searchReceipt");
            if(!"Success".equals(message)){
                showPopupMessage(message, FacesMessage.SEVERITY_ERROR);
            }else{
                addPartialTrigger(getSearchTableBind());
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void receiptReset(ActionEvent actionEvent) {
        try {
//            executeMethod("createTransDeployementReceiptSearch");
//            addPartialTrigger(getSearchPageBind());
            String message = (String) executeMethod("resetReceipt");
            if(!"Success".equals(message)){
                showPopupMessage(message, FacesMessage.SEVERITY_ERROR);
            }else{
                addPartialTrigger(getSearchPageBind());
                addPartialTrigger(getSearchTableBind());
                addPartialTrigger(getHdrADRNumBind());
                addPartialTrigger(getHdrBuBind());
                addPartialTrigger(getHdrContNumBind());
                addPartialTrigger(getHdrCustDivBind());
                addPartialTrigger(getHdrCustNameBind());
                addPartialTrigger(getHdrCustTypeBind());
                addPartialTrigger(getHdrDeptNameBind());
                addPartialTrigger(getHdrDivBind());
                addPartialTrigger(getHdrProjBind());
                addPartialTrigger(getHdrRctDateBind());
                addPartialTrigger(getHdrReqBuBind());
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
    
    public void setReceiptSearch(){
        try {
            Map pageFlowScope = ADFContext.getCurrent().getPageFlowScope();
            pageFlowScope.put("drSrcBu", getEL("#{bindings.TransBuName.inputValue}"));
            pageFlowScope.put("drSrcDivRequired", getEL("#{bindings.TransDivRequired.inputValue}"));
            pageFlowScope.put("drSrcDivSegmentNum", getEL("#{bindings.TransDivFlexNum.inputValue}"));
            pageFlowScope.put("drSrcDeptSegmentNum", getEL("#{bindings.TransSrcDeptFlexSegmentNum.inputValue}"));
            pageFlowScope.put("drSrcBuId", getEL("#{bindings.TransBuId.inputValue}"));
            pageFlowScope.put("drSrcDivision", getEL("#{bindings.TransDivision.inputValue}"));
            pageFlowScope.put("drSrcDivFlexValId", getEL("#{bindings.TransDivFlexValueId.inputValue}"));
            pageFlowScope.put("drReqBu", getEL("#{bindings.TransRequestingBu.inputValue}"));
            pageFlowScope.put("drReqBuId", getEL("#{bindings.TransRequestingBuId.inputValue}"));
            pageFlowScope.put("drReqDeptSegmentNum", getEL("#{bindings.TransReqDeptFlexSegmentNum.inputValue}"));
            pageFlowScope.put("drReqDivSegmentNum", getEL("#{bindings.TransReqDivFlexSegmentNum.inputValue}"));
            pageFlowScope.put("drContractNum", getEL("#{bindings.TransContractNumber.inputValue}"));
            pageFlowScope.put("drContractId", getEL("#{bindings.TransContractId.inputValue}"));
            pageFlowScope.put("drCustomerType", getEL("#{bindings.TransCustomerType.inputValue}"));
            pageFlowScope.put("drCustomerTypeCode", getEL("#{bindings.TransCustomerTypeCode.inputValue}"));
            pageFlowScope.put("drProject", getEL("#{bindings.TransProject.inputValue}"));
            pageFlowScope.put("drProjectId", getEL("#{bindings.TransProjectId.inputValue}"));
            pageFlowScope.put("drDivision", getEL("#{bindings.TransCustomerDivision.inputValue}"));
            pageFlowScope.put("drDivFlexValId", getEL("#{bindings.TransCustomerDivFlexValueId.inputValue}"));
            pageFlowScope.put("drDepartment", getEL("#{bindings.TransDeptName.inputValue}"));
            pageFlowScope.put("drDeptFlexValId", getEL("#{bindings.TransDeptFlexValueId.inputValue}"));
            pageFlowScope.put("drCustomerName", getEL("#{bindings.TransCustomerName.inputValue}"));
            pageFlowScope.put("drCustomerId", getEL("#{bindings.TransCustomerId.inputValue}"));
            pageFlowScope.put("drReceiptNum", getEL("#{bindings.TransADRNumber.inputValue}"));
            pageFlowScope.put("drReceiptId", getEL("#{bindings.TransDRId.inputValue}"));
            pageFlowScope.put("drReceiptDate", getEL("#{bindings.TransReceiptDate.inputValue}"));
            
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void createReceipt(ActionEvent actionEvent) {
        try {
            setReceiptSearch();
            String message = (String) executeMethod("createReceipt");
            if(!"Success".equals(message)){
                showPopupMessage(message, FacesMessage.SEVERITY_ERROR);
            }else{
                ADFContext.getCurrent().getPageFlowScope().put("drEditFlag", "Y");
                navigateNew("Details");
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void editReceiptAL(ActionEvent actionEvent) {
        try {
            setReceiptSearch();
            String message = (String) executeMethod("editReceipt");
            if(!"Success".equals(message)){
                showPopupMessage(message, FacesMessage.SEVERITY_ERROR);
            }else{
                navigateNew("Details");
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
            String message = (String) executeMethod("receiptSourceBuChange");
            if(!"Success".equals(message)){
                showPopupMessage(message, FacesMessage.SEVERITY_ERROR);
            }
            addPartialTrigger(getContractNumHdrBind());
            addPartialTrigger(getDoNumHdrBind());
            addPartialTrigger(getSrcDivHdrBind());
            addPartialTrigger(getReqBuHdrBind());
            addPartialTrigger(getContractNumHdrBind());
            addPartialTrigger(getDoNumHdrBind());
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

    public void setDoNumHdrBind(RichInputComboboxListOfValues doNumHdrBind) {
        this.doNumHdrBind = doNumHdrBind;
    }

    public RichInputComboboxListOfValues getDoNumHdrBind() {
        return doNumHdrBind;
    }

    public void setCustTypeHdrBind(RichInputText custTypeHdrBind) {
        this.custTypeHdrBind = custTypeHdrBind;
    }

    public RichInputText getCustTypeHdrBind() {
        return custTypeHdrBind;
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

    public void setCustSiteHdrBind(RichInputText custSiteHdrBind) {
        this.custSiteHdrBind = custSiteHdrBind;
    }

    public RichInputText getCustSiteHdrBind() {
        return custSiteHdrBind;
    }

    public void sourceDivVL(ValueChangeEvent valueChangeEvent) {
        valueChangeEvent.getComponent().processUpdates(FacesContext.getCurrentInstance());
        ADFContext.getCurrent().getPageFlowScope().put("isSaved", "N");
        try {
            String message = (String) executeMethod("receiptSourceDivChange");
            if(!"Success".equals(message)){
                showPopupMessage(message, FacesMessage.SEVERITY_ERROR);
            }
            addPartialTrigger(getContractNumHdrBind());
            addPartialTrigger(getDoNumHdrBind());
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
            String message = (String) executeMethod("receiptRequestingBuChange");
            if(!"Success".equals(message)){
                showPopupMessage(message, FacesMessage.SEVERITY_ERROR);
            }
            addPartialTrigger(getContractNumHdrBind());
            addPartialTrigger(getDoNumHdrBind());
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

    public void receiptContractNoVL(ValueChangeEvent valueChangeEvent) {
        try {
            ADFContext.getCurrent().getPageFlowScope().put("isSaved", "N");
            valueChangeEvent.getComponent().processUpdates(FacesContext.getCurrentInstance());
            String message = (String) executeMethod("receiptContractNoChange");
            if(!"Success".equals(message)){
                showPopupMessage(message, FacesMessage.SEVERITY_ERROR);
            }            
            addPartialTrigger(getCustTypeHdrBind());
            addPartialTrigger(getProjHdrBind());
            addPartialTrigger(getDivHdrBind());
            addPartialTrigger(getDeptHdrBind());
            addPartialTrigger(getCustomerHdrBind());
            addPartialTrigger(getCustSiteHdrBind());
            addPartialTrigger(getDoNumHdrBind());
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void receiptDoNoVL(ValueChangeEvent valueChangeEvent) {
        try {
            ADFContext.getCurrent().getPageFlowScope().put("isSaved", "N");
            valueChangeEvent.getComponent().processUpdates(FacesContext.getCurrentInstance());
            String message = (String) executeMethod("receiptDoNoChange");
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

    public void setTxnsPageBind(RichPanelHeader txnsPageBind) {
        this.txnsPageBind = txnsPageBind;
    }

    public RichPanelHeader getTxnsPageBind() {
        return txnsPageBind;
    }

    public void saveActList(ActionEvent actionEvent) {
        try {
            String msg ="Success";
            if(!"Success".equals(msg)){
                String msgs[] = msg.split("_");
                for(int i = 0;i <msgs.length;i++){
                    showPopupMessage(msgs[i], FacesMessage.SEVERITY_ERROR);
                }
            }else{
                String newMsg = (String) executeMethod("generateReceiptNumber");
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

    public void saveAndCloseActList(ActionEvent actionEvent) {
        try {
            String msg = /*(String) executeMethod("validateQuoteLines")*/"Success";
            if(!"Success".equals(msg)){
                String msgs[] = msg.split("_");
                for(int i = 0;i <msgs.length;i++){
                    showPopupMessage(msgs[i], FacesMessage.SEVERITY_ERROR);
                }
            }else{
                String newMsg = (String) executeMethod("generateReceiptNumber");
                if(!"Success".equals(newMsg)){
                    showPopupMessage(newMsg, FacesMessage.SEVERITY_ERROR);
                }else{
                    save();
                    ADFContext.getCurrent().getPageFlowScope().put("isSaved", "Y");
                    navigateNew("Done");
                    executeMethod("setReceiptSearch");
                }
            }            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void closeAL(ActionEvent actionEvent) {
        try {
            if("N".equals(ADFContext.getCurrent().getPageFlowScope().get("isSaved"))){
                showPopup(getCloseConfirmPopupBind());              
            }else{
                cancel();
                ADFContext.getCurrent().getPageFlowScope().put("isSaved", "Y");
                navigateNew("Done");
                executeMethod("setReceiptSearch");
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
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
                navigateNew("Done");
                executeMethod("setReceiptSearch");
            }else{
                getCloseConfirmPopupBind().hide();
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void receiptDateValChList(ValueChangeEvent valueChangeEvent) {
        try {
            ADFContext.getCurrent().getPageFlowScope().put("isSaved", "N");
            valueChangeEvent.getComponent().processUpdates(FacesContext.getCurrentInstance());
            String message = (String) executeMethod("lineReceiptDateChange");
            if(!"Success".equals(message)){
                showPopupMessage(message, FacesMessage.SEVERITY_ERROR);
            }            
            addPartialTrigger(getLineReceiptDateBind());
            
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setLineReceiptDateBind(RichInputDate lineReceiptDateBind) {
        this.lineReceiptDateBind = lineReceiptDateBind;
    }

    public RichInputDate getLineReceiptDateBind() {
        return lineReceiptDateBind;
    }

    public void rctLinesActList(ActionEvent actionEvent) {
        try {
            String message=(String)executeMethod("rctLinesDelete");
           if(!"Success".equals(message)){
               showPopupMessage(message, FacesMessage.SEVERITY_ERROR);
           }
            else
           {
                ADFContext.getCurrent().getPageFlowScope().put("isSaved", "N");
               addPartialTrigger(getRctLinesBind());
               addPartialTrigger(getRctLinesAccesTableBind());
            }
       } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setRctLinesBind(RichTable rctLinesBind) {
        this.rctLinesBind = rctLinesBind;
    }

    public RichTable getRctLinesBind() {
        return rctLinesBind;
    }

    public void setRctLinesAcceBind(RichTable rctLinesAcceBind) {
        this.rctLinesAcceBind = rctLinesAcceBind;
    }

    public RichTable getRctLinesAcceBind() {
        return rctLinesAcceBind;
    }

    public void setRctLinesAccesTableBind(RichTable rctLinesAccesTableBind) {
        this.rctLinesAccesTableBind = rctLinesAccesTableBind;
    }

    public RichTable getRctLinesAccesTableBind() {
        return rctLinesAccesTableBind;
    }

    public void rctLinesAccDeleteAL(ActionEvent actionEvent) {
        try {
            String message=(String)executeMethod("rctLinesAcceDelete");
           if(!"Success".equals(message)){
               showPopupMessage(message, FacesMessage.SEVERITY_ERROR);
           }
            else
           {
                ADFContext.getCurrent().getPageFlowScope().put("isSaved", "N");
               addPartialTrigger(getRctLinesBind());
               addPartialTrigger(getRctLinesAccesTableBind());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void rctLinesMobDelAL(ActionEvent actionEvent) {
        try {
            String message=(String)executeMethod("rctLinesMobDelete");
           if(!"Success".equals(message)){
               showPopupMessage(message, FacesMessage.SEVERITY_ERROR);
           }
            else
           {
                ADFContext.getCurrent().getPageFlowScope().put("isSaved", "N");
               addPartialTrigger(getRctLinesBind());
               addPartialTrigger(getRctLinesAccesTableBind());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void populateActList(ActionEvent actionEvent) {
        try {
           if("N".equals(ADFContext.getCurrent().getPageFlowScope().get("changesSaved"))) {
               showPopup(getCommitPopupBindgs());
           }
           else
           {
               String message=(String)executeMethod("getPopDeployLines");
                //String message=(String)executeMethod("refreshRctLinesPopup");
               if(!"Success".equals(message)){
                   showPopupMessage(message, FacesMessage.SEVERITY_ERROR);
               }
                else
               {
                   ADFContext.getCurrent().getPageFlowScope().put("isSaved", "Y");
                   addPartialTrigger(getRctLinesBind());
                   addPartialTrigger(getRctLinesAccesTableBind());
                   addPartialTrigger(getRctLinesMobTableBind());
                   addPartialTrigger(getTxnsPageBind());
                   showPopup(getPopulateLinesPopupBind());
                }
           }
       } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setRctLinesMobTableBind(RichTable rctLinesMobTableBind) {
        this.rctLinesMobTableBind = rctLinesMobTableBind;
    }

    public RichTable getRctLinesMobTableBind() {
        return rctLinesMobTableBind;
    }

    public void attachAL(ActionEvent actionEvent) {
        try {
            showPopup(getAttchPopupBind());
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
            String message = (String) executeMethod("addRctAttachment");
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
                pageFlowScope.put("rctUploadedFileStream",((UploadedFile)valueChangeEvent.getNewValue()).getInputStream());
                pageFlowScope.put("rctFileName",((UploadedFile)valueChangeEvent.getNewValue()).getFilename());
                pageFlowScope.put("rctFileType",((UploadedFile)valueChangeEvent.getNewValue()).getContentType());
                
                String str = (String)executeMethod("uploadDeployReceiptAttach");
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
                binding.findIteratorBinding("AttachmentsVO6Iterator");
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

    public void confirmAL(ActionEvent actionEvent) {
        /*try {
            String message=(String)executeMethod("rctConfirm");
           if(!"Success".equals(message)){
               showPopupMessage(message, FacesMessage.SEVERITY_ERROR);
           }
            else
           {
                ADFContext.getCurrent().getPageFlowScope().put("isSaved", "Y");
               addPartialTrigger(getTxnsPageBind());
            }
           
       } catch (Exception e) {
            e.printStackTrace();
        }*/
        showPopup(getConfirmPopupBind());
    }

    public void remarksValChList(ValueChangeEvent valueChangeEvent) {
        valueChangeEvent.getComponent().processUpdates(FacesContext.getCurrentInstance());
        ADFContext.getCurrent().getPageFlowScope().put("isSaved", "N");
    }

    public void receiptMeterReadingVCL(ValueChangeEvent valueChangeEvent) {
        valueChangeEvent.getComponent().processUpdates(FacesContext.getCurrentInstance());
        ADFContext.getCurrent().getPageFlowScope().put("isSaved", "N");
    }

    public void receivedByVCL(ValueChangeEvent valueChangeEvent) {
        valueChangeEvent.getComponent().processUpdates(FacesContext.getCurrentInstance());
        ADFContext.getCurrent().getPageFlowScope().put("isSaved", "N");
    }

    public void refNoteVCL(ValueChangeEvent valueChangeEvent) {
        valueChangeEvent.getComponent().processUpdates(FacesContext.getCurrentInstance());
        ADFContext.getCurrent().getPageFlowScope().put("isSaved", "N");
    }

    public void includeFlagVCL(ValueChangeEvent valueChangeEvent) {
        valueChangeEvent.getComponent().processUpdates(FacesContext.getCurrentInstance());
        ADFContext.getCurrent().getPageFlowScope().put("isSaved", "N");
    }

    public void rcdQtyVCL(ValueChangeEvent valueChangeEvent) {
        valueChangeEvent.getComponent().processUpdates(FacesContext.getCurrentInstance());
        ADFContext.getCurrent().getPageFlowScope().put("isSaved", "N");
    }

    public void remarksVCL(ValueChangeEvent valueChangeEvent) {
        valueChangeEvent.getComponent().processUpdates(FacesContext.getCurrentInstance());
        ADFContext.getCurrent().getPageFlowScope().put("isSaved", "N");
    }

    public void setCommitPopupBindgs(RichPopup commitPopupBindgs) {
        this.commitPopupBindgs = commitPopupBindgs;
    }

    public RichPopup getCommitPopupBindgs() {
        return commitPopupBindgs;
    }

    public void saveConfirmDL(DialogEvent dialogEvent) {
        if(dialogEvent.getOutcome().equals(DialogEvent.Outcome.yes)) 
        {
            String newMsg = (String) executeMethod("generateReceiptNumber");
            if(!"Success".equals(newMsg)){
                showPopupMessage(newMsg, FacesMessage.SEVERITY_ERROR);
            }else{
                save();
                String message=(String)executeMethod("getPopDeployLines");
                //String message=(String)executeMethod("refreshRctLinesPopup");
                if(!"Success".equals(message)){
                   showPopupMessage(message, FacesMessage.SEVERITY_ERROR);
                }
                else
                {
                   ADFContext.getCurrent().getPageFlowScope().put("isSaved", "Y");
                   addPartialTrigger(getRctLinesBind());
                   addPartialTrigger(getRctLinesAccesTableBind());
                   addPartialTrigger(getRctLinesMobTableBind());
                   addPartialTrigger(getTxnsPageBind());
                    showPopup(getPopulateLinesPopupBind());
                }
            }
        }
    }

    public void setPopulateLinesPopupBind(RichPopup populateLinesPopupBind) {
        this.populateLinesPopupBind = populateLinesPopupBind;
    }

    public RichPopup getPopulateLinesPopupBind() {
        return populateLinesPopupBind;
    }

    public void popDeploytLinesAL(ActionEvent actionEvent) {
        String message = (String) executeMethod("insertDeployLinesInReceipt");
        if(!"Success".equals(message)){
            showPopupMessage(message, FacesMessage.SEVERITY_ERROR);
        }else{
            save();
            getPopulateLinesPopupBind().hide();
            addPartialTrigger(getRctLinesBind());
            addPartialTrigger(getRctLinesAccesTableBind());
            addPartialTrigger(getRctLinesMobTableBind());
            addPartialTrigger(getTxnsPageBind());
        }
    }

    public void closePopLinesAL(ActionEvent actionEvent) {
        try 
        {
            getPopulateLinesPopupBind().hide();
        }
        catch(Exception e) 
        {
            e.printStackTrace();    
        }
    }

    public void selectAllLineChangeVL(ValueChangeEvent valueChangeEvent) {
        try 
        {
            if (!(valueChangeEvent.getNewValue().equals(valueChangeEvent.getOldValue()))) 
            {
                Boolean isMarked = (Boolean)valueChangeEvent.getNewValue();
                if(isMarked)
                {
                    ADFContext.getCurrent().getPageFlowScope().put("isMarked", "Y");
                }
                else
                {
                    ADFContext.getCurrent().getPageFlowScope().put("isMarked", "N");
                }
                executeMethod("selectDeployLinesforReceipt");
                addPartialTrigger(getRctDeployOrderLinestableBind());
            }
        }
        catch(Exception e) 
        {
            e.printStackTrace();    
        }
    }

    public void setSelectAllBind(RichSelectBooleanCheckbox selectAllBind) {
        this.selectAllBind = selectAllBind;
    }

    public RichSelectBooleanCheckbox getSelectAllBind() {
        return selectAllBind;
    }

    public void setRctDeployOrderLinestableBind(RichTable rctDeployOrderLinestableBind) {
        this.rctDeployOrderLinestableBind = rctDeployOrderLinestableBind;
    }

    public RichTable getRctDeployOrderLinestableBind() {
        return rctDeployOrderLinestableBind;
    }

    public void setConfirmPopupBind(RichPopup confirmPopupBind) {
        this.confirmPopupBind = confirmPopupBind;
    }

    public RichPopup getConfirmPopupBind() {
        return confirmPopupBind;
    }

    public void confirmPopCanActList(ActionEvent actionEvent) {
        getConfirmPopupBind().cancel();
    }

    public void confirmPopOkActList(ActionEvent actionEvent) {
        try {
            String message=(String)executeMethod("rctConfirm");
           if(!"Success".equals(message)){
               getConfirmPopupBind().cancel();
               showPopupMessage(message, FacesMessage.SEVERITY_ERROR);
           }
            else
           {    
                getConfirmPopupBind().cancel();
                ADFContext.getCurrent().getPageFlowScope().put("isSaved", "Y");
               addPartialTrigger(getTxnsPageBind());
            }
           
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setHdrBuBind(RichInputComboboxListOfValues hdrBuBind) {
        this.hdrBuBind = hdrBuBind;
    }

    public RichInputComboboxListOfValues getHdrBuBind() {
        return hdrBuBind;
    }

    public void setHdrDivBind(RichInputComboboxListOfValues hdrDivBind) {
        this.hdrDivBind = hdrDivBind;
    }

    public RichInputComboboxListOfValues getHdrDivBind() {
        return hdrDivBind;
    }

    public void setSearchPageBind(RichPanelHeader searchPageBind) {
        this.searchPageBind = searchPageBind;
    }

    public RichPanelHeader getSearchPageBind() {
        return searchPageBind;
    }

    public void setHdrReqBuBind(RichInputComboboxListOfValues hdrReqBuBind) {
        this.hdrReqBuBind = hdrReqBuBind;
    }

    public RichInputComboboxListOfValues getHdrReqBuBind() {
        return hdrReqBuBind;
    }

    public void setHdrContNumBind(RichInputComboboxListOfValues hdrContNumBind) {
        this.hdrContNumBind = hdrContNumBind;
    }

    public RichInputComboboxListOfValues getHdrContNumBind() {
        return hdrContNumBind;
    }

    public void setHdrCustTypeBind(RichInputComboboxListOfValues hdrCustTypeBind) {
        this.hdrCustTypeBind = hdrCustTypeBind;
    }

    public RichInputComboboxListOfValues getHdrCustTypeBind() {
        return hdrCustTypeBind;
    }

    public void setHdrProjBind(RichInputComboboxListOfValues hdrProjBind) {
        this.hdrProjBind = hdrProjBind;
    }

    public RichInputComboboxListOfValues getHdrProjBind() {
        return hdrProjBind;
    }

    public void setHdrCustDivBind(RichInputComboboxListOfValues hdrCustDivBind) {
        this.hdrCustDivBind = hdrCustDivBind;
    }

    public RichInputComboboxListOfValues getHdrCustDivBind() {
        return hdrCustDivBind;
    }

    public void setHdrDeptNameBind(RichInputComboboxListOfValues hdrDeptNameBind) {
        this.hdrDeptNameBind = hdrDeptNameBind;
    }

    public RichInputComboboxListOfValues getHdrDeptNameBind() {
        return hdrDeptNameBind;
    }

    public void setHdrCustNameBind(RichInputComboboxListOfValues hdrCustNameBind) {
        this.hdrCustNameBind = hdrCustNameBind;
    }

    public RichInputComboboxListOfValues getHdrCustNameBind() {
        return hdrCustNameBind;
    }

    public void setHdrADRNumBind(RichInputComboboxListOfValues hdrADRNumBind) {
        this.hdrADRNumBind = hdrADRNumBind;
    }

    public RichInputComboboxListOfValues getHdrADRNumBind() {
        return hdrADRNumBind;
    }

    public void setHdrRctDateBind(RichInputDate hdrRctDateBind) {
        this.hdrRctDateBind = hdrRctDateBind;
    }

    public RichInputDate getHdrRctDateBind() {
        return hdrRctDateBind;
    }

    public void DeploymentReceiptReportFDL(FacesContext facesContext, OutputStream outputStream) {
        try {
           Object dataBytesObj = null;
           dataBytesObj = executeMethod("DeploymentReceiptXml");
           if (dataBytesObj != null && dataBytesObj instanceof byte[]) {
           byte[] dataBytes = (byte[]) dataBytesObj;
           outputStream.write(dataBytes);
           outputStream.close();} 
        }catch(Exception e) {
            // TODO: Add catch code
            e.printStackTrace();
        }

    }
}
