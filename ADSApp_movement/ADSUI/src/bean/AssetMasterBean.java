package bean;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import java.util.Calendar;
import java.util.Map;

import javax.faces.event.ActionEvent;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.event.ValueChangeEvent;

import model.view.AssetAccessoriesVORowImpl;
import model.view.AssetCertificationsVORowImpl;
import model.view.AssetOperatorVORowImpl;

import oracle.adf.model.BindingContext;
import oracle.adf.model.binding.DCBindingContainer;
import oracle.adf.model.binding.DCIteratorBinding;
import oracle.adf.share.ADFContext;
import oracle.adf.view.rich.component.rich.RichPopup;
import oracle.adf.view.rich.component.rich.data.RichTable;
import oracle.adf.view.rich.component.rich.input.RichInputComboboxListOfValues;
import oracle.adf.view.rich.component.rich.input.RichInputDate;
import oracle.adf.view.rich.component.rich.input.RichSelectBooleanCheckbox;
import oracle.adf.view.rich.component.rich.layout.RichPanelFormLayout;
import oracle.adf.view.rich.component.rich.layout.RichPanelHeader;
import oracle.adf.view.rich.event.DialogEvent;

import oracle.jbo.Row;
import oracle.jbo.RowSetIterator;
import oracle.jbo.ViewObject;
import oracle.jbo.domain.Date;

public class AssetMasterBean extends CommonBean{
    private RichTable searchTblBind;
    private RichTable assetAttributesBind;
    private RichPopup ctgryChngWarnPopupBind;
    private RichTable assetHierTblBind;
    private RichInputDate hierAttchDateBind;
    private RichInputComboboxListOfValues accessoryTypeBind;
    private RichInputComboboxListOfValues operatorShiftBind;
    private RichInputComboboxListOfValues certTypeBind;
    private RichInputDate certValidFromDateBind;
    private RichPanelFormLayout searchFormBind;
    private RichInputComboboxListOfValues divisionBind;
    private RichInputComboboxListOfValues assetCategoryBind;
    private RichInputComboboxListOfValues maintOrgBind;
    private RichInputComboboxListOfValues maintAssetBind;
    private RichInputComboboxListOfValues faCategoryBind;
    private RichInputComboboxListOfValues faNumberBind;
    private RichInputComboboxListOfValues poNumberBind;
    private RichInputComboboxListOfValues poLineNumBind;
    private RichInputComboboxListOfValues searchAssetCategoryBind;
    private RichInputComboboxListOfValues searchDivisionBind;
    private RichInputComboboxListOfValues searchMaintAssetBind;
    private RichInputComboboxListOfValues searchBuNameBind;
    private RichPanelHeader panelHdrBind;

    public AssetMasterBean() {
        super();
    }
    
    public void setSearchAttributes(){
        try {
            Map pageFlowScope = ADFContext.getCurrent().getPageFlowScope();
            pageFlowScope.put("asBu", getEL("#{bindings.TransBuName.inputValue}"));
            pageFlowScope.put("asBuId", getEL("#{bindings.TransBuId.inputValue}"));
            pageFlowScope.put("asAssetSource", getEL("#{bindings.TransAssetSource.inputValue}"));
            pageFlowScope.put("asAssetSrcCode", getEL("#{bindings.AssetSource.inputValue}"));
            pageFlowScope.put("asAssetNum", getEL("#{bindings.TransAssetNumber.inputValue}"));
            pageFlowScope.put("asAssetCatgry", getEL("#{bindings.TransAssetCategory.inputValue}"));
            pageFlowScope.put("asAssetCatgryId", getEL("#{bindings.TransAssetCategoryId.inputValue}"));
            pageFlowScope.put("asDiv", getEL("#{bindings.TransDivision.inputValue}"));
            pageFlowScope.put("asMainAssetNum", getEL("#{bindings.TransMainAssetNo.inputValue}"));
            pageFlowScope.put("asMainAssetId", getEL("#{bindings.TransMainAssetId.inputValue}"));
            pageFlowScope.put("asWorkingStat", getEL("#{bindings.TransWorkingStatus.inputValue}"));
            pageFlowScope.put("asWorkingStatCode", getEL("#{bindings.WorkingStatus.inputValue}"));
            pageFlowScope.put("asUsagePool", getEL("#{bindings.TransUsagePool.inputValue}"));
            pageFlowScope.put("asUsagePoolCode", getEL("#{bindings.UsagePool.inputValue}"));
            pageFlowScope.put("asDivRequired", getEL("#{bindings.TransDivisionRequired.inputValue}"));
            pageFlowScope.put("asDivSegment", getEL("#{bindings.TransDivSegment.inputValue}"));
            
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void createAsset(ActionEvent actionEvent) {
        try {
            setSearchAttributes();
            String message = (String) executeMethod("createAsset");
            if(!"Success".equals(message)){
                showPopupMessage(message, FacesMessage.SEVERITY_ERROR);
            }else{
                navigateNew("Details");
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void editAsset(ActionEvent actionEvent) {
        try {
            setSearchAttributes();
            String message = (String) executeMethod("editAsset");
            if(!"Success".equals(message)){
                showPopupMessage(message, FacesMessage.SEVERITY_ERROR);
            }else{
                navigateNew("Details");
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void deleteAsset(ActionEvent actionEvent) {
        try {
            String message = (String) executeMethod("deleteAsset");
            if(!"Success".equals(message)){
                showPopupMessage(message, FacesMessage.SEVERITY_ERROR);
            }else{
                addPartialTrigger(getSearchTblBind());
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void createAssetHierarchy(ActionEvent actionEvent) {
        try {
            String message = (String) executeMethod("createAssetHierarchy");
            if(!"Success".equals(message)){
                showPopupMessage(message, FacesMessage.SEVERITY_ERROR);
            }else{
                addPartialTrigger(getAssetHierTblBind());
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void deleteAssetHierarchy(ActionEvent actionEvent) {
        try {
            DCBindingContainer binding = (DCBindingContainer) BindingContext.getCurrent().getCurrentBindingsEntry();
            DCIteratorBinding bindingIterator = binding.findIteratorBinding("AssetHierarchyVO1Iterator");
            RowSetIterator row = bindingIterator.getRowSetIterator();
            if(bindingIterator != null){
               Row currentRow = row.getCurrentRow();
               if(currentRow != null){
                      currentRow.remove();
                }
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void hierAttachDateChange(ValueChangeEvent valueChangeEvent) {
        valueChangeEvent.getComponent().processUpdates(FacesContext.getCurrentInstance());
        try {
            String message = (String) executeMethod("assetHierAttchDtChange");
            if(!"Success".equals(message)){
                showPopupMessage(message, FacesMessage.SEVERITY_ERROR);
                addPartialTrigger(getHierAttchDateBind());
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void createAssetOperator(ActionEvent actionEvent) {
        try {
            DCBindingContainer binding = (DCBindingContainer) BindingContext.getCurrent().getCurrentBindingsEntry();
            DCIteratorBinding bindingIterator = binding.findIteratorBinding("AssetOperatorVO1Iterator");
            if(bindingIterator != null){
                ViewObject vo = bindingIterator.getViewObject();
                AssetOperatorVORowImpl operRow = (AssetOperatorVORowImpl) vo.createRow();
                vo.insertRow(operRow);
                operRow.setAssetId((oracle.jbo.domain.Number) getEL("#{bindings.AssetId.inputValue}"));
                operRow.setTransAssetBuId((oracle.jbo.domain.Number) getEL("#{bindings.BuId.inputValue}"));
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void deleteAssetOperator(ActionEvent actionEvent) {
        try {
            DCBindingContainer binding = (DCBindingContainer) BindingContext.getCurrent().getCurrentBindingsEntry();
            DCIteratorBinding bindingIterator = binding.findIteratorBinding("AssetOperatorVO1Iterator");
            RowSetIterator row = bindingIterator.getRowSetIterator();
            if(bindingIterator != null){
               Row currentRow = row.getCurrentRow();
               if(currentRow != null){
                      currentRow.remove();
                }
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void operatorShiftVL(ValueChangeEvent valueChangeEvent) {
        valueChangeEvent.getComponent().processUpdates(FacesContext.getCurrentInstance());
        try {
            String message = (String) executeMethod("assetOperShiftChange");
            if(!"Success".equals(message)){
                showPopupMessage(message, FacesMessage.SEVERITY_ERROR);
                addPartialTrigger(getOperatorShiftBind());
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void createAssetAccessory(ActionEvent actionEvent) {
        try {
            DCBindingContainer binding = (DCBindingContainer) BindingContext.getCurrent().getCurrentBindingsEntry();
            DCIteratorBinding bindingIterator = binding.findIteratorBinding("AssetAccessoriesVO1Iterator");
            if(bindingIterator != null){
                ViewObject vo = bindingIterator.getViewObject();
                AssetAccessoriesVORowImpl acessoryRow = (AssetAccessoriesVORowImpl) vo.createRow();
                vo.insertRow(acessoryRow);
                acessoryRow.setAssetId((oracle.jbo.domain.Number) getEL("#{bindings.AssetId.inputValue}"));                
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void deleteAssetAccessory(ActionEvent actionEvent) {
        try {
            DCBindingContainer binding = (DCBindingContainer) BindingContext.getCurrent().getCurrentBindingsEntry();
            DCIteratorBinding bindingIterator = binding.findIteratorBinding("AssetAccessoriesVO1Iterator");
            RowSetIterator row = bindingIterator.getRowSetIterator();
            if(bindingIterator != null){
               Row currentRow = row.getCurrentRow();
               if(currentRow != null){
                      currentRow.remove();
                }
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
    

    public void accessoryTypeVL(ValueChangeEvent valueChangeEvent) {
        valueChangeEvent.getComponent().processUpdates(FacesContext.getCurrentInstance());
        try {
            String message = (String) executeMethod("assetAccessoryTypeChange");
            if(!"Success".equals(message)){
                showPopupMessage(message, FacesMessage.SEVERITY_ERROR);
                addPartialTrigger(getAccessoryTypeBind());
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void createAssetCertificate(ActionEvent actionEvent) {
        try {
            DCBindingContainer binding = (DCBindingContainer) BindingContext.getCurrent().getCurrentBindingsEntry();
            DCIteratorBinding bindingIterator = binding.findIteratorBinding("AssetCertificationsVO1Iterator");
            if(bindingIterator != null){
                ViewObject vo = bindingIterator.getViewObject();
                AssetCertificationsVORowImpl certRow = (AssetCertificationsVORowImpl) vo.createRow();
                vo.insertRow(certRow);
                certRow.setAssetId((oracle.jbo.domain.Number) getEL("#{bindings.AssetId.inputValue}"));                
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void deleteAssetCertificate(ActionEvent actionEvent) {
        try {
            DCBindingContainer binding = (DCBindingContainer) BindingContext.getCurrent().getCurrentBindingsEntry();
            DCIteratorBinding bindingIterator = binding.findIteratorBinding("AssetCertificationsVO1Iterator");
            RowSetIterator row = bindingIterator.getRowSetIterator();
            if(bindingIterator != null){
               Row currentRow = row.getCurrentRow();
               if(currentRow != null){
                      currentRow.remove();
                }
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    
    public void certificationTypeVL(ValueChangeEvent valueChangeEvent) {
        valueChangeEvent.getComponent().processUpdates(FacesContext.getCurrentInstance());
        try {
            String message = (String) executeMethod("assetCertTypeChange");
            if(!"Success".equals(message)){
                showPopupMessage(message, FacesMessage.SEVERITY_ERROR);
                addPartialTrigger(getCertTypeBind());
                addPartialTrigger(getCertValidFromDateBind());
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void saveAssetAL(ActionEvent actionEvent) {
        try {
            save();
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void saveAndCloseAssetAL(ActionEvent actionEvent) {
        try {
            save();
            
            navigateNew("Back");
            executeMethod("setAssetSearch");
            addPartialTrigger(getSearchTblBind());
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void cancelAssetAL(ActionEvent actionEvent) {
        try {
            cancel();
            
            navigateNew("Back");
            executeMethod("setAssetSearch");
            addPartialTrigger(getSearchTblBind());
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void assetCategoryVL(ValueChangeEvent valueChangeEvent) {
        try {
            valueChangeEvent.getComponent().processUpdates(FacesContext.getCurrentInstance());
            String message = (String) executeMethod("assetMasterCategoryChange");
            if("Success".equals(message)){
//               addPartialTrigger(getAssetAttributesBind()); 
            }else if("W".equals(message)){
                showPopupMessage("Asset Attributes of the previous Asset Category are deleted and re-populated for the current Category", FacesMessage.SEVERITY_WARN);
//                addPartialTrigger(getAssetAttributesBind());
            }else{
                showPopupMessage(message, FacesMessage.SEVERITY_ERROR);
            }
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

    public void setAssetAttributesBind(RichTable assetAttributesBind) {
        this.assetAttributesBind = assetAttributesBind;
    }

    public RichTable getAssetAttributesBind() {
        return assetAttributesBind;
    }

    public void assetCtgryChngPopupDL(DialogEvent dialogEvent) {
        try {
            String message = (String) executeMethod("assetMasterCategoryChange");
            if("Success".equals(message)){
               addPartialTrigger(getAssetAttributesBind()); 
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setCtgryChngWarnPopupBind(RichPopup ctgryChngWarnPopupBind) {
        this.ctgryChngWarnPopupBind = ctgryChngWarnPopupBind;
    }

    public RichPopup getCtgryChngWarnPopupBind() {
        return ctgryChngWarnPopupBind;
    }

    public void setAssetHierTblBind(RichTable assetHierTblBind) {
        this.assetHierTblBind = assetHierTblBind;
    }

    public RichTable getAssetHierTblBind() {
        return assetHierTblBind;
    }

    public void setHierAttchDateBind(RichInputDate hierAttchDateBind) {
        this.hierAttchDateBind = hierAttchDateBind;
    }

    public RichInputDate getHierAttchDateBind() {
        return hierAttchDateBind;
    }

    public void setAccessoryTypeBind(RichInputComboboxListOfValues accessoryTypeBind) {
        this.accessoryTypeBind = accessoryTypeBind;
    }

    public RichInputComboboxListOfValues getAccessoryTypeBind() {
        return accessoryTypeBind;
    }

    public void setOperatorShiftBind(RichInputComboboxListOfValues operatorShiftBind) {
        this.operatorShiftBind = operatorShiftBind;
    }

    public RichInputComboboxListOfValues getOperatorShiftBind() {
        return operatorShiftBind;
    }


    public void setCertTypeBind(RichInputComboboxListOfValues certTypeBind) {
        this.certTypeBind = certTypeBind;
    }

    public RichInputComboboxListOfValues getCertTypeBind() {
        return certTypeBind;
    }

    public void setCertValidFromDateBind(RichInputDate certValidFromDateBind) {
        this.certValidFromDateBind = certValidFromDateBind;
    }

    public RichInputDate getCertValidFromDateBind() {
        return certValidFromDateBind;
    }

    public void searchAssetsAL(ActionEvent actionEvent) {
        try {
            String message = (String) executeMethod("searchAssets");
            if(! "Success".equals(message)){
                showPopupMessage(message, FacesMessage.SEVERITY_ERROR);
            }else{
                addPartialTrigger(getSearchTblBind());
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void resetAssetSearchAL(ActionEvent actionEvent) {
        try {
            String message = (String) executeMethod("resetAssetSearch");
            if(! "Success".equals(message)){
                showPopupMessage(message, FacesMessage.SEVERITY_ERROR);
            }else{
                addPartialTrigger(getSearchTblBind());
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setSearchFormBind(RichPanelFormLayout searchFormBind) {
        this.searchFormBind = searchFormBind;
    }

    public RichPanelFormLayout getSearchFormBind() {
        return searchFormBind;
    }

    public void buChangeVL(ValueChangeEvent valueChangeEvent) {
        valueChangeEvent.getComponent().processUpdates(FacesContext.getCurrentInstance());
        try {
            String message = (String) executeMethod("assetBuChange");
            if(! "Success".equals(message)){
                showPopupMessage(message, FacesMessage.SEVERITY_ERROR);
            }else{
                addPartialTrigger(getDivisionBind());
                addPartialTrigger(getAssetCategoryBind());
                addPartialTrigger(getAssetAttributesBind());
                addPartialTrigger(getMaintOrgBind());
                addPartialTrigger(getMaintAssetBind());
                addPartialTrigger(getFaCategoryBind());
                addPartialTrigger(getFaNumberBind());
                addPartialTrigger(getPoNumberBind());
                addPartialTrigger(getPoLineNumBind());
                
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

    public void setAssetCategoryBind(RichInputComboboxListOfValues assetCategoryBind) {
        this.assetCategoryBind = assetCategoryBind;
    }

    public RichInputComboboxListOfValues getAssetCategoryBind() {
        return assetCategoryBind;
    }

    public void setMaintOrgBind(RichInputComboboxListOfValues maintOrgBind) {
        this.maintOrgBind = maintOrgBind;
    }

    public RichInputComboboxListOfValues getMaintOrgBind() {
        return maintOrgBind;
    }

    public void setMaintAssetBind(RichInputComboboxListOfValues maintAssetBind) {
        this.maintAssetBind = maintAssetBind;
    }

    public RichInputComboboxListOfValues getMaintAssetBind() {
        return maintAssetBind;
    }

    public void setFaCategoryBind(RichInputComboboxListOfValues faCategoryBind) {
        this.faCategoryBind = faCategoryBind;
    }

    public RichInputComboboxListOfValues getFaCategoryBind() {
        return faCategoryBind;
    }

    public void setFaNumberBind(RichInputComboboxListOfValues faNumberBind) {
        this.faNumberBind = faNumberBind;
    }

    public RichInputComboboxListOfValues getFaNumberBind() {
        return faNumberBind;
    }

    public void setPoNumberBind(RichInputComboboxListOfValues poNumberBind) {
        this.poNumberBind = poNumberBind;
    }

    public RichInputComboboxListOfValues getPoNumberBind() {
        return poNumberBind;
    }

    public void setPoLineNumBind(RichInputComboboxListOfValues poLineNumBind) {
        this.poLineNumBind = poLineNumBind;
    }

    public RichInputComboboxListOfValues getPoLineNumBind() {
        return poLineNumBind;
    }

    public void searchBuChangeVL(ValueChangeEvent valueChangeEvent) {
        valueChangeEvent.getComponent().processUpdates(FacesContext.getCurrentInstance());
        try {
            if(valueChangeEvent.getOldValue()!= null && ! (valueChangeEvent.getOldValue().equals(valueChangeEvent.getNewValue()))){
                String message = (String) executeMethod("assetSearchBuChange");
                if(!"Success".equals(message)){
                    showPopupMessage(message, FacesMessage.SEVERITY_ERROR);
                }else{
                    addPartialTrigger(getSearchAssetCategoryBind());
                    addPartialTrigger(getSearchDivisionBind());
                    addPartialTrigger(getSearchMaintAssetBind());
                }
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setSearchAssetCategoryBind(RichInputComboboxListOfValues searchAssetCategoryBind) {
        this.searchAssetCategoryBind = searchAssetCategoryBind;
    }

    public RichInputComboboxListOfValues getSearchAssetCategoryBind() {
        return searchAssetCategoryBind;
    }

    public void setSearchDivisionBind(RichInputComboboxListOfValues searchDivisionBind) {
        this.searchDivisionBind = searchDivisionBind;
    }

    public RichInputComboboxListOfValues getSearchDivisionBind() {
        return searchDivisionBind;
    }

    public void setSearchMaintAssetBind(RichInputComboboxListOfValues searchMaintAssetBind) {
        this.searchMaintAssetBind = searchMaintAssetBind;
    }

    public RichInputComboboxListOfValues getSearchMaintAssetBind() {
        return searchMaintAssetBind;
    }

    public void setSearchBuNameBind(RichInputComboboxListOfValues searchBuNameBind) {
        this.searchBuNameBind = searchBuNameBind;
    }

    public RichInputComboboxListOfValues getSearchBuNameBind() {
        return searchBuNameBind;
    }

    public void setPanelHdrBind(RichPanelHeader panelHdrBind) {
        this.panelHdrBind = panelHdrBind;
    }

    public RichPanelHeader getPanelHdrBind() {
        return panelHdrBind;
    }
    public Date getTransCurrentDate() {
        Date maxStartDate = null;
        try
        {
            java.util.Date maxDate;
            Calendar cal = Calendar.getInstance();
            java.util.Date date = cal.getTime();
            DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
            String currentDate = formatter.format(date);
            maxDate = formatter.parse(currentDate);
            maxStartDate =
                        new Date(new java.sql.Date(maxDate.getTime()));
        }
        catch(Exception e) {
            e.printStackTrace();
        }
        return maxStartDate;
    }
}
