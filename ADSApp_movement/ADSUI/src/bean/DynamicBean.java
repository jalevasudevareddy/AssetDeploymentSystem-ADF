package bean;

import java.io.Serializable;

import java.util.Map;

import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

import oracle.adf.controller.TaskFlowId;
import oracle.adf.share.ADFContext;
import oracle.adf.view.rich.component.rich.fragment.RichRegion;
import oracle.adf.view.rich.component.rich.layout.RichShowDetailItem;

import oracle.ui.pattern.dynamicShell.TabContext;

import org.apache.myfaces.trinidad.render.ExtendedRenderKitService;
import org.apache.myfaces.trinidad.util.Service;


public class DynamicBean implements Serializable {
    private String taskFlowId = "/WEB-INF/JWTValidationTF.xml#JWTValidationTF";
    private RichShowDetailItem showDetailItemBind;
    private RichRegion regionBinding;
    private RichShowDetailItem newShowDetailItemBind;

    public DynamicBean() {
        super();
    }

    public TaskFlowId getDynamicTaskFlowId() {
        return TaskFlowId.parse(taskFlowId);
    }

    public void setDynamicTaskFlowId(String taskFlowId) {
        this.taskFlowId = taskFlowId;
    }

    public String homeTF() {
        getRegionBinding().refresh(FacesContext.getCurrentInstance());
        setDynamicTaskFlowId("/WEB-INF/HomeTF.xml#HomeTF");
        return null;
    }

    public void setShowDetailItemBind(RichShowDetailItem showDetailItemBind) {
        this.showDetailItemBind = showDetailItemBind;
    }

    public RichShowDetailItem getShowDetailItemBind() {
        return showDetailItemBind;
    }

    public void setRegionBinding(RichRegion regionBinding) {
        this.regionBinding = regionBinding;
    }

    public RichRegion getRegionBinding() {
        return regionBinding;
    }

    private void _launchActivity(String title, String taskflowId, boolean newTab) {
        try {
            if (newTab) {
                TabContext.getCurrentInstance().addTab(title, taskflowId);
            } else {
                TabContext.getCurrentInstance().addOrSelectTab(title, taskflowId);
            }
        } catch (TabContext.TabOverflowException toe) {
            // causes a dialog to be displayed to the user saying that there are
            // too many tabs open - the new tab will not be opened...
            toe.handleDefault();
        }
    }

    public void setNewShowDetailItemBind(RichShowDetailItem newShowDetailItemBind) {
        this.newShowDetailItemBind = newShowDetailItemBind;
    }

    public RichShowDetailItem getNewShowDetailItemBind() {
        return newShowDetailItemBind;
    }

    public void notificationsAL(ActionEvent actionEvent) {
        FacesContext fctx = FacesContext.getCurrentInstance();
        ExtendedRenderKitService erks = Service.getRenderKitService(fctx, ExtendedRenderKitService.class);
        StringBuilder script = new StringBuilder();
        Map jwtMap = (Map) ADFContext.getCurrent().getSessionScope().get("pHeader");
        String appUrl = "";
        String jwt = "";
        if (jwtMap != null) {
            appUrl = (String) jwtMap.get("ameAppURL");
            jwt = (String) jwtMap.get("fusionJWTToken");
        }
//        script.append("window.open('" + appUrl + jwt + "');");
//        erks.addScript(FacesContext.getCurrentInstance(), script.toString());
        String url=appUrl+jwt;
                  url = "window.open('" + url + "','_self');";
                  erks.addScript(FacesContext.getCurrentInstance(), url);
    }
    public String manageLookupTF() {
        getShowDetailItemBind().setDisclosed(false);
        _launchActivity("Manage Lookups", "/WEB-INF/LookupSetupTF.xml#LookupSetupTF", false);
        return null;
    }
    
    public String manageSystemOptionsTF() {
        getShowDetailItemBind().setDisclosed(false);
        _launchActivity("Manage System Options", "/WEB-INF/SystemOptionsTF.xml#SystemOptionsTF", false);
        return null;
    }
    public String assetCategoryTF() {
        getShowDetailItemBind().setDisclosed(false);
        _launchActivity("Asset Category Master", "/WEB-INF/AssetCategoryMasterTF.xml#AssetCategoryMasterTF", false);
        return null;
    }
    public String manageWeekExceptionDaysTF() {
        getShowDetailItemBind().setDisclosed(false);
        _launchActivity("Manage Week and Exception Days", "/WEB-INF/WeekAndExceptionDaysTF.xml#WeekAndExceptionDaysTF", false);
        return null;
    }
    
    public String hiringBasisRulesTF() {
        getShowDetailItemBind().setDisclosed(false);
        _launchActivity("Manage Hiring Basis Rules", "/WEB-INF/HiringBasisRulesTF.xml#HiringBasisRulesTF", false);
        return null;
    }
    
    public String accessSecurityTF() {
        getShowDetailItemBind().setDisclosed(false);
        _launchActivity("Access Security Management", "/WEB-INF/AccessSecurityTF.xml#AccessSecurityTF", false);
        return null;
    }
    
    public String buAccountingParamsTF() {
        getShowDetailItemBind().setDisclosed(false);
        _launchActivity("Manage Accounting Parameters - Source BU", "/WEB-INF/BuAccountingParamsTF.xml#BuAccountingParamsTF", false);
        return null;
    }
    
    public String employeeCategoryMasterTF() {
        getShowDetailItemBind().setDisclosed(false);
        _launchActivity("Manage Employee Category Master", "/WEB-INF/EmployeeCategoryMasterTF.xml#EmployeeCategoryMasterTF", false);
        return null;
    }
    public String rentalRateMasterTF() {
        getShowDetailItemBind().setDisclosed(false);
        _launchActivity("Rental Rate Master", "/WEB-INF/RentalRateMasterTF.xml#RentalRateMasterTF", false);
        return null;
    }
    
    public String assetMasterTF() {
        getShowDetailItemBind().setDisclosed(false);
        _launchActivity("Manage Asset Master", "/WEB-INF/AssetMasterTF.xml#AssetMasterTF", false);
        return null;
    }
    public String empMasterTF() {
        getShowDetailItemBind().setDisclosed(false);
        _launchActivity("Manage Employee Master", "/WEB-INF/EmployeeMasterTF.xml#EmployeeMasterTF", false);
        return null;
    }
    
    public String DocumentSeqTF() {
        getShowDetailItemBind().setDisclosed(false);
        _launchActivity("Document Sequence", "/WEB-INF/DocumentSequenceTF.xml#DocumentSequenceTF", false);
        return null;
    }
    
    public String assetRequestTF() {
        getShowDetailItemBind().setDisclosed(false);
        _launchActivity("Manage Asset Requests", "/WEB-INF/AssetRequestTF.xml#AssetRequestTF", false);
        return null;
    }
    
    public String rentalQuotationTF() {
        getShowDetailItemBind().setDisclosed(false);
        _launchActivity("Manage Rental Quotations", "/WEB-INF/RentalQuotationTF.xml#RentalQuotationTF", false);
        return null;
    }
    
    public String rentalContractTF() {
        getShowDetailItemBind().setDisclosed(false);
        _launchActivity("Manage Rental Contracts", "/WEB-INF/RentalContractTF.xml#RentalContractTF", false);
        return null;
    }
    
    public String assetAllocationTF() {
        getShowDetailItemBind().setDisclosed(false);
        _launchActivity("Manage Asset Allocation", "/WEB-INF/AssetAllocationTF.xml#AssetAllocationTF", false);
        return null;
    }
    
    public String deploymentOrderTF() {
        getShowDetailItemBind().setDisclosed(false);
        _launchActivity("Manage Deployment Order", "/WEB-INF/DeploymentOrderTF.xml#DeploymentOrderTF", false);
        return null;
    }
    
    public String deploymentReceiptTF() {
        getShowDetailItemBind().setDisclosed(false);
        _launchActivity("Manage Deployment Receipt", "/WEB-INF/AssetDeploymentReceiptTF.xml#AssetDeploymentReceiptTF", false);
        return null;
    }
    
    public String timesheetsTF() {
        getShowDetailItemBind().setDisclosed(false);
        _launchActivity("Manage Site Timesheets", "/WEB-INF/TimesheetsTF.xml#TimesheetsTF", false);
        return null;
    }
    
    public String tripTimesheetTF() {
        getShowDetailItemBind().setDisclosed(false);
        _launchActivity("Manage Service Timesheets", "/WEB-INF/TripTimesheetTF.xml#TripTimesheetTF", false);
        return null;
    }
    
    public String assetBillingTF() {
        getShowDetailItemBind().setDisclosed(false);
        _launchActivity("Manage Asset Billing", "/WEB-INF/AssetBillingTF.xml#AssetBillingTF", false);
        return null;
    }
    
    public String termsCondsTemplateTF() {
        getShowDetailItemBind().setDisclosed(false);
        _launchActivity("Manage Templates", "/WEB-INF/TermsCondsTemplateTF.xml#TermsCondsTemplateTF", false);
        return null;
    }
}
