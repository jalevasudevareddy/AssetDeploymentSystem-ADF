package model.applicationModule;

import com.oracle.wls.shaded.org.apache.xpath.operations.Quo;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;

import java.text.SimpleDateFormat;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import model.lov.SalesRepLovVOImpl;

import model.view.AccessTypeVOImpl;
import model.view.ContractChargesForCategoryVOImpl;
import model.view.DOHdrReportVOImpl;
import model.view.DOLinesReportVOImpl;
import model.view.DRHdrReportVOImpl;
import model.view.DRLinesReportVOImpl;
import model.view.DoAttachmentsPrintVOImpl;
import model.view.GatePassPrintHdrVOImpl;
import model.view.GatePassPrintLinesVOImpl;
import model.view.ProformaPrintHdrVOImpl;
import model.view.QuoteChargesForCategroyVOImpl;
import model.view.QuoteReportHdrVOImpl;
import model.view.QuoteReportLinesVOImpl;

import model.view.ApprovalHoldCheckVOImpl;
import model.view.QuoteContractDetailsVOImpl;

import model.view.RentalContractLineNumVOImpl;
import model.view.RentalContractPrintHdrVOImpl;
import model.view.RentalQuoteLineNumVOImpl;
import model.view.SpecialWorkingDaysVOImpl;

import model.view.TimesheetLinesValidateVOImpl;
import model.view.TsSlipNumberValidateVOImpl;
import model.view.ValidCreditCheckVOImpl;
import model.view.WeekOffDaysVOImpl;
import model.view.getDayFromDateVOImpl;
import model.view.getDayFromDateVORowImpl;
import model.view.getWeekOffsFunctionVOImpl;
import model.view.getWeekOffsFunctionVORowImpl;
import oracle.jbo.XMLInterface;
import model.applicationModule.common.TransactionsAM;

import model.progview.TransPRInterfaceVOImpl;

import model.progview.TransPRInterfaceVORowImpl;

import model.progview.TransTemplateVOImpl;

import model.progview.TransTemplateVORowImpl;

import model.searchview.AssetAllocationSearchVOImpl;
import model.searchview.AssetAllocationSearchVORowImpl;
import model.searchview.AssetMasterSearchVORowImpl;
import model.searchview.AssetRequestSearchVOImpl;
import model.searchview.AssetRequestSearchVORowImpl;
import model.searchview.BillingSearchVOImpl;
import model.searchview.BillingSearchVORowImpl;
import model.searchview.DeploymentOrderSearchVOImpl;
import model.searchview.DeploymentOrderSearchVORowImpl;
import model.searchview.ReceiptSearchVOImpl;
import model.searchview.ReceiptSearchVORowImpl;
import model.searchview.RentalContractSearchVOImpl;
import model.searchview.RentalContractSearchVORowImpl;
import model.searchview.RentalQuotationSearchVOImpl;
import model.searchview.RentalQuotationSearchVORowImpl;
import model.searchview.TimesheetSearchVOImpl;
import model.searchview.TransAssetAllocationSearchVOImpl;
import model.searchview.TransAssetAllocationSearchVORowImpl;
import model.searchview.TransAssetMasterSearchVORowImpl;
import model.searchview.TransAssetRequestSearchVOImpl;

import model.searchview.TransAssetRequestSearchVORowImpl;

import model.searchview.TransBillingsearchVOImpl;
import model.searchview.TransDailyTimesheetSearchVOImpl;
import model.searchview.TransDailyTimesheetSearchVORowImpl;
import model.searchview.TransDeploymentOrderSearchVOImpl;
import model.searchview.TransDeploymentOrderSearchVORowImpl;
import model.searchview.TransDeploymentReceiptSearchVOImpl;
import model.searchview.TransDeploymentReceiptSearchVORowImpl;
import model.searchview.TransRentalContractSearchVOImpl;
import model.searchview.TransRentalContractSearchVORowImpl;
import model.searchview.TransRentalQuotationSearchVOImpl;

import model.searchview.TransRentalQuotationSearchVORowImpl;

import model.searchview.TransTripTimesheetSearchVOImpl;

import model.view.ActionHistoryVOImpl;
import model.view.AssetAccessoriesVOImpl;

//import model.view.AssetAllocationDetailsVO;

import model.view.AssetAllocationDatesVOImpl;
import model.view.AssetAllocationDatesVORowImpl;
import model.view.AssetAllocationDetailsVOImpl;
import model.view.AssetAllocationDetailsVORowImpl;
import model.view.AssetAllocationDetailsValidateVOImpl;
import model.view.AssetAllocationDetailsValidateVORowImpl;
import model.view.AssetAllocationLinesVOImpl;
import model.view.AssetAllocationLinesVORowImpl;
import model.view.AssetAllocationVOImpl;
import model.view.AssetAllocationVORowImpl;
import model.view.AssetBillHistoryVOImpl;
import model.view.AssetBillHistoryVORowImpl;
import model.view.AssetHierarchyVORowImpl;
import model.view.AssetMasterUpdateVOImpl;
import model.view.AssetMasterUpdateVORowImpl;
import model.view.AssetMasterVORowImpl;

import model.view.BillSubmitTsCheckVOImpl;
import model.view.BillingAddtlChargesVOImpl;
import model.view.BillingAssetsVOImpl;
import model.view.BillingHdrVOImpl;
import model.view.BillingOperatorsVOImpl;
import model.view.BillingOtherChargesVOImpl;
import model.view.DivisionAccountMapVOImpl;
import model.view.HiringBasisHoursVOImpl;
import model.view.MaxBillNumberVOImpl;
import model.view.MaxTripTimesheetNumVOImpl;
import model.view.QuotationReportHdrVOImpl;
import model.view.QuotationReportLinesVOImpl;
import model.view.RentalQuoteValidFromValidateVOImpl;
import model.view.TimeSheetsIntVOImpl;
import model.view.TimesheetHdrValidateVOImpl;
import model.view.TimesheetHeaderVORowImpl;
import model.view.TimesheetHeaderVOImpl;
import model.view.MaxTimesheetNumVOImpl;
import model.view.MaxTimesheetNumVORowImpl;
import model.searchview.TimesheetSearchVORowImpl;


import model.searchview.TransBillingsearchVORowImpl;
import model.searchview.TransTripTimesheetSearchVORowImpl;

import model.view.AssetRequestHdrVOImpl;
import model.view.AssetRequestHdrVORowImpl;

import model.view.AssetRequestLinesVOImpl;


import model.view.AssetRequestLinesVORowImpl;
import model.view.AssetRequestLinesValidateVOImpl;
import model.view.AssetRequestLinesValidateVORowImpl;
import model.view.AssetRequestNumberVOImpl;
import model.view.AssetRequestNumberVORowImpl;
import model.view.AttachmentsVOImpl;
import model.view.AttachmentsVORowImpl;
import model.view.BillSubmitTsCheckVORowImpl;
import model.view.BillingAddtlChargesVORowImpl;
import model.view.BillingAssetsVORowImpl;
import model.view.BillingHdrVORowImpl;
import model.view.BillingOperatorsVORowImpl;
import model.view.BillingOtherChargesVORowImpl;
import model.view.ContractChargesPopulateVOImpl;
import model.view.ContractChargesPopulateVORowImpl;
import model.view.ContractChargesValidateVOImpl;
import model.view.ContractClauseValidateVOImpl;
import model.view.ContractLinesPopulateVOImpl;
import model.view.ContractLinesPopulateVORowImpl;
import model.view.DeploymentOrderAccessoriesVOImpl;
import model.view.DeploymentOrderHdrVOImpl;
import model.view.DeploymentOrderHdrVORowImpl;
import model.view.DeploymentOrderInspectionVOImpl;
import model.view.DeploymentOrderInspectionVORowImpl;
import model.view.DeploymentOrderLinesVOImpl;
import model.view.DeploymentOrderLinesVORowImpl;
import model.view.DeploymentRcptAccessoriesVOImpl;
import model.view.DeploymentRcptMobilizationVOImpl;
import model.view.DeploymentReceiptHdrVOImpl;
import model.view.DeploymentReceiptHdrVORowImpl;
import model.view.DeploymentReceiptLinesVOImpl;

import model.view.DeploymentOrderMobilizationVOImpl;
import model.view.DeploymentRcptAccessoriesVORowImpl;
import model.view.DeploymentRcptMobilizationVORowImpl;
import model.view.DeploymentReceiptLinesVORowImpl;
import model.view.DeploymentReceiptLinesValidateVOImpl;
import model.view.DeploymentReceiptLinesValidateVORowImpl;
import model.view.DocumentSequenceUpdateVOImpl;

import model.view.DocumentSequenceUpdateVORowImpl;
import model.view.EmployeeDetailsVOImpl;
import model.view.EmployeeDetailsVORowImpl;
import model.view.GetMaxDetailsLineNumVOImpl;
import model.view.GetMaxDetailsLineNumVORowImpl;
import model.view.HiringBasisHoursVORowImpl;
import model.view.InternalTypeAccessValidateVOImpl;
import model.view.InternalTypeAccessValidateVORowImpl;
import model.view.MaxAllocationNumberVOImpl;
import model.view.MaxAllocationNumberVORowImpl;
import model.view.MaxBillNumberVORowImpl;
import model.view.MaxContractNumVOImpl;
import model.view.MaxContractNumVORowImpl;
import model.view.MaxDeploymentReceiptNumVOImpl;
import model.view.MaxDeploymentReceiptNumVORowImpl;
import model.view.MaxQuotationNumberVOImpl;

import model.view.MaxQuotationNumberVORowImpl;

import model.view.MaxTripTimesheetNumVORowImpl;
import model.view.PopulateContractLinesVOImpl;
import model.view.PopulateContractLinesVORowImpl;
import model.view.RctDeployOrderAccessoriesVOImpl;
import model.view.RctDeployOrderLinesVOImpl;
import model.view.RctDeployOrderMobilizationVOImpl;
import model.view.ReceiptDateValidateVOImpl;
import model.view.RentalContractChargesVOImpl;
import model.view.RentalContractClauseVOImpl;
import model.view.RentalContractLinesVOImpl;
import model.view.RentalContractLinesValidateVOImpl;
import model.view.RentalContractParentHdrVOImpl;
import model.view.RentalContractVOImpl;
import model.view.RentalMasterRatesVOImpl;
import model.view.RentalQuoteParentHdrVOImpl;

import model.view.TimesheetLinesVOImpl;
import model.view.TripHeaderPreviousDayValidateVOImpl;
import model.view.TripHeaderSearchVOImpl;

import model.view.TripHeaderVOImpl;
import model.view.TripHeaderValidateVOImpl;
import model.view.TripLinesVOImpl;

import model.view.TsConfirmCheckVOImpl;

import oracle.adf.share.ADFContext;

import oracle.jbo.RowSetIterator;
import oracle.jbo.domain.BlobDomain;
import oracle.jbo.domain.Date;

import model.view.QuoteChargesValidateVOImpl;
import model.view.QuoteLinesValidateVOImpl;
import model.view.QuoteLinesValidateVORowImpl;
import model.view.RctDeployOrderAccessoriesVORowImpl;
import model.view.RctDeployOrderLinesVORowImpl;
import model.view.RctDeployOrderMobilizationVORowImpl;
import model.view.ReceiptDateValidateVORowImpl;
import model.view.RentalContractChargesVORowImpl;
import model.view.RentalContractClauseVORowImpl;
import model.view.RentalContractLinesVORowImpl;
import model.view.RentalContractLinesValidateVORowImpl;
import model.view.RentalContractParentHdrVORowImpl;
import model.view.RentalContractVORowImpl;
import model.view.RentalMasterRatesVORowImpl;
import model.view.RentalQuoteChargesVOImpl;
import model.view.RentalQuoteChargesVORowImpl;
import model.view.RentalQuoteLinesVOImpl;
import model.view.RentalQuoteLinesVORowImpl;
import model.view.RentalQuoteParentHdrVORowImpl;
import model.view.RentalQuoteValidFromValidateVORowImpl;
import model.view.RentalQuotesVOImpl;

import model.view.RentalQuotesVORowImpl;

import model.view.TimeSheetsIntVORowImpl;
import model.view.TimesheetLinesVORowImpl;
import model.view.TripHeaderPreviousDayValidateVORowImpl;
import model.view.TripHeaderSearchVORowImpl;
import model.view.TripHeaderVORowImpl;

import model.view.TripHeaderValidateVORowImpl;

import model.view.TsConfirmCheckVORowImpl;


import model.view.WeekOffDaysVORowImpl;

import oracle.jbo.RowSetIterator;
import oracle.jbo.server.ApplicationModuleImpl;
import oracle.jbo.server.ViewLinkImpl;

import oracle.adf.share.ADFContext;

import oracle.jbo.Key;
import oracle.jbo.RowIterator;
import oracle.jbo.domain.Number;
import oracle.jbo.server.SequenceImpl;
import oracle.jbo.server.ViewObjectImpl;

//import oracle.security.xmlsec.util.XMLNode;
import oracle.xml.parser.v2.XMLNode;
import org.apache.myfaces.trinidad.model.UploadedFile;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.hssf.usermodel.HSSFFont;
import java.time.Month;
import java.time.LocalDate;

import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

import model.lov.SalesRepLovVORowImpl;

import model.services.ExternalReportCustom;

import model.view.AccessTypeVORowImpl;
import model.view.ApprovalHoldCheckVORowImpl;
import model.view.ContractChargesForCategoryVORowImpl;
import model.view.CreditInfoVORowImpl;
import model.view.DOHdrReportVORowImpl;
import model.view.QuoteChargesForCategroyVORowImpl;
import model.view.QuoteContractDetailsVORowImpl;
import model.view.RentalContractLineNumVORowImpl;
import model.view.RentalQuoteLineNumVORowImpl;
import model.view.SpecialWorkingDaysVORowImpl;
import model.view.TimesheetLinesValidateVORowImpl;
import model.view.ValidCreditCheckVORowImpl;

// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Mon Nov 14 12:17:39 IST 2022
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class TransactionsAMImpl extends ApplicationModuleImpl implements TransactionsAM {
    /**
     * This is the default constructor (do not remove).
     */
    public TransactionsAMImpl() {
    }

    private final String REVISE_RENTAL_QUOTATION =
        "begin xxads_process_pkg.revise_rental_quotation" + "(:p_quotation_id,:p_reason,:p_user,:p_message);end;";
    private final String REVISE_RENTAL_CONTRACT =
        "begin xxads_process_pkg.revise_rental_contract" + "(:p_contract_id,:p_reason,:p_user,:p_message);end;";
    private final String GENERATE_PR =
        "begin xxads_interfaces_pkg.pr_interface" + "(:p_detail_id,:p_employee_id,:p_item_id,:p_quantity,:p_organization_id,:p_location_id,:p_req_delivery_date,:p_user,:p_message);end;";
    private final String GENERATE_DEPLOYMENT_ORDER=
        "begin xxads_process_pkg.generate_deployment_order" + "(:p_allocation_id,:p_user,:p_message);end;";
    private final String SYNC_PR_DETAILS=
        "begin xxds_manage_master_data.update_table_data" + "(:p_table_name, :p_xml_clob1,:p_user,:p_err_msg);end;";
    private final String WITHDRAW_APPRL_SUBMISSION =
        "begin xxame_pkg.withdraw_submission(:p_document_type_id ,:p_document_id,:p_remarks,:p_user,:p_message);end;";
    private final  String POPULATE_TS_LINES=
        "BEGIN xxads_process_pkg.populate_ts_lines"+"(:p_ts_header_id, :p_contract_id, :p_ts_date,:p_user, :p_message); end;";
    private final  String CLEAR_TS_LINES=
        "BEGIN xxads_process_pkg.clear_ts_lines"+"(:p_ts_header_id,:p_user, :p_message); end;";
    private final  String CLEAR_TRIP_TS_LINES=
        "BEGIN xxads_process_pkg.clear_trip_ts_lines"+"(:p_header_id,:p_user, :p_message); end;";
    
    private final  String POPULATE_TRIP_TS_LINES=
        "BEGIN xxads_process_pkg.populate_trip_ts_lines"+"(:p_header_id, :p_contract_id, :p_ts_date,:p_user, :p_message); end;";
    private final  String CONFIRM_TIMESHEETS=
        "BEGIN xxads_process_pkg.confirm_timesheets"+"(:p_batch_id,:p_user, :p_message); end;";
    private final  String CONFIRM_TRIP_TIMESHEETS=
        "BEGIN xxads_process_pkg.confirm_trip_timesheets"+"(:p_batch_id,:p_user, :p_message); end;";
    
    private final  String POPULATE_BILL_LINES=
        "BEGIN xxads_process_pkg.populate_billing_lines"+"(:p_hdr_id, :p_contract_id, :p_from_date, :p_to_date, :p_user, :p_message); end;";
    
    private final  String INTERFACE_BILL_DOC=
        "BEGIN xxads_interfaces_pkg.interface_billing"+"(:p_bill_header_id, :p_customer_type, :p_user, :p_message); end;";
    
    private final  String DELETE_BILLING_ASSET=
        "BEGIN xxads_process_pkg.delete_billing_asset"+"(:p_bill_header_id, :p_bill_asset_id, :p_rental_type, :p_user, :p_message); end;";
    
    private final  String GENERATE_CONTRACT=
        "BEGIN xxads_process_pkg.generate_contract"+"(:p_quotation_id, :p_user, :p_message); end;";
    
    private final  String CHECK_CREDIT_CONTROL=
        "BEGIN xxads_process_pkg.validate_credit_control"+"(:p_contract_id, :p_user, :p_msg); end;";

    /**
     * Container's getter for TransRentalQuotationSearchVO1.
     * @return TransRentalQuotationSearchVO1
     */
    public TransRentalQuotationSearchVOImpl getTransRentalQuotationSearchVO1() {
        return (TransRentalQuotationSearchVOImpl) findViewObject("TransRentalQuotationSearchVO1");
    }

    /**
     * Container's getter for RentalQuotationSearchVO1.
     * @return RentalQuotationSearchVO1
     */
    public RentalQuotationSearchVOImpl getRentalQuotationSearchVO1() {
        return (RentalQuotationSearchVOImpl) findViewObject("RentalQuotationSearchVO1");
    }


    /**
     * Container's getter for RentalQuotesVO1.
     * @return RentalQuotesVO1
     */
    public RentalQuotesVOImpl getRentalQuotesVO1() {
        return (RentalQuotesVOImpl) findViewObject("RentalQuotesVO1");
    }

    /**
     * Container's getter for RentalQuoteLinesVO1.
     * @return RentalQuoteLinesVO1
     */
    public RentalQuoteLinesVOImpl getRentalQuoteLinesVO1() {
        return (RentalQuoteLinesVOImpl) findViewObject("RentalQuoteLinesVO1");
    }

    /**
     * Container's getter for RentalQuoteToLinesVL1.
     * @return RentalQuoteToLinesVL1
     */
    public ViewLinkImpl getRentalQuoteToLinesVL1() {
        return (ViewLinkImpl) findViewLink("RentalQuoteToLinesVL1");
    }

    /**
     * Container's getter for RentalQuoteChargesVO1.
     * @return RentalQuoteChargesVO1
     */
    public RentalQuoteChargesVOImpl getRentalQuoteChargesVO1() {
        return (RentalQuoteChargesVOImpl) findViewObject("RentalQuoteChargesVO1");
    }

    /**
     * Container's getter for RentalQuoteToAdditionalChargesVL1.
     * @return RentalQuoteToAdditionalChargesVL1
     */
    public ViewLinkImpl getRentalQuoteToAdditionalChargesVL1() {
        return (ViewLinkImpl) findViewLink("RentalQuoteToAdditionalChargesVL1");
    }

    /**
     * Container's getter for QuoteLinesValidateVO1.
     * @return QuoteLinesValidateVO1
     */
    public QuoteLinesValidateVOImpl getQuoteLinesValidateVO1() {
        return (QuoteLinesValidateVOImpl) findViewObject("QuoteLinesValidateVO1");
    }

    /**
     * Container's getter for QuoteChargesValidateVO1.
     * @return QuoteChargesValidateVO1
     */
    public QuoteChargesValidateVOImpl getQuoteChargesValidateVO1() {
        return (QuoteChargesValidateVOImpl) findViewObject("QuoteChargesValidateVO1");
    }

    /**
     * Container's getter for AttachmentsVO2.
     * @return AttachmentsVO2
     */
    public AttachmentsVOImpl getAttachmentsVO2() {
        return (AttachmentsVOImpl) findViewObject("AttachmentsVO2");
    }

    /**
     * Container's getter for RentalQuoteToAttachmentsVL1.
     * @return RentalQuoteToAttachmentsVL1
     */
    public ViewLinkImpl getRentalQuoteToAttachmentsVL1() {
        return (ViewLinkImpl) findViewLink("RentalQuoteToAttachmentsVL1");
    }

    /**
     * Container's getter for MaxQuotationNumberVO1.
     * @return MaxQuotationNumberVO1
     */
    public MaxQuotationNumberVOImpl getMaxQuotationNumberVO1() {
        return (MaxQuotationNumberVOImpl) findViewObject("MaxQuotationNumberVO1");
    }

    /**
     * Container's getter for RentalQuoteParentHdrVO1.
     * @return RentalQuoteParentHdrVO1
     */
    public RentalQuoteParentHdrVOImpl getRentalQuoteParentHdrVO1() {
        return (RentalQuoteParentHdrVOImpl) findViewObject("RentalQuoteParentHdrVO1");
    }

    /**
     * Container's getter for RentalMasterRatesVO1.
     * @return RentalMasterRatesVO1
     */
    public RentalMasterRatesVOImpl getRentalMasterRatesVO1() {
        return (RentalMasterRatesVOImpl) findViewObject("RentalMasterRatesVO1");
    }

    /**
     * Container's getter for RentalQuoteLinesVO2.
     * @return RentalQuoteLinesVO2
     */
    public RentalQuoteLinesVOImpl getRentalQuoteLinesVO2() {
        return (RentalQuoteLinesVOImpl) findViewObject("RentalQuoteLinesVO2");
    }

    /**
     * Container's getter for TransRentalContractSearchVO1.
     * @return TransRentalContractSearchVO1
     */
    public TransRentalContractSearchVOImpl getTransRentalContractSearchVO1() {
        return (TransRentalContractSearchVOImpl) findViewObject("TransRentalContractSearchVO1");
    }

    /**
     * Container's getter for RentalContractSearchVO1.
     * @return RentalContractSearchVO1
     */
    public RentalContractSearchVOImpl getRentalContractSearchVO1() {
        return (RentalContractSearchVOImpl) findViewObject("RentalContractSearchVO1");
    }

    /**
     * Container's getter for RentalContractVO1.
     * @return RentalContractVO1
     */
    public RentalContractVOImpl getRentalContractVO1() {
        return (RentalContractVOImpl) findViewObject("RentalContractVO1");
    }

    /**
     * Container's getter for AttachmentsVO3.
     * @return AttachmentsVO3
     */
    public AttachmentsVOImpl getAttachmentsVO3() {
        return (AttachmentsVOImpl) findViewObject("AttachmentsVO3");
    }

    /**
     * Container's getter for RentalContractAttachmentsVL1.
     * @return RentalContractAttachmentsVL1
     */
    public ViewLinkImpl getRentalContractAttachmentsVL1() {
        return (ViewLinkImpl) findViewLink("RentalContractAttachmentsVL1");
    }

    /**
     * Container's getter for RentalContractChargesVO1.
     * @return RentalContractChargesVO1
     */
    public RentalContractChargesVOImpl getRentalContractChargesVO1() {
        return (RentalContractChargesVOImpl) findViewObject("RentalContractChargesVO1");
    }

    /**
     * Container's getter for RentalContractHdrToChargesVL1.
     * @return RentalContractHdrToChargesVL1
     */
    public ViewLinkImpl getRentalContractHdrToChargesVL1() {
        return (ViewLinkImpl) findViewLink("RentalContractHdrToChargesVL1");
    }

    /**
     * Container's getter for RentalContractLinesVO1.
     * @return RentalContractLinesVO1
     */
    public RentalContractLinesVOImpl getRentalContractLinesVO1() {
        return (RentalContractLinesVOImpl) findViewObject("RentalContractLinesVO1");
    }

    /**
     * Container's getter for RentalContractHdrToLinesVL1.
     * @return RentalContractHdrToLinesVL1
     */
    public ViewLinkImpl getRentalContractHdrToLinesVL1() {
        return (ViewLinkImpl) findViewLink("RentalContractHdrToLinesVL1");
    }

    /**
     * Container's getter for RentalContractClauseVO1.
     * @return RentalContractClauseVO1
     */
    public RentalContractClauseVOImpl getRentalContractClauseVO1() {
        return (RentalContractClauseVOImpl) findViewObject("RentalContractClauseVO1");
    }

    /**
     * Container's getter for RentalContractToClauseVL1.
     * @return RentalContractToClauseVL1
     */
    public ViewLinkImpl getRentalContractToClauseVL1() {
        return (ViewLinkImpl) findViewLink("RentalContractToClauseVL1");
    }

    /**
     * Container's getter for ContractLinesPopulateVO1.
     * @return ContractLinesPopulateVO1
     */
    public ContractLinesPopulateVOImpl getContractLinesPopulateVO1() {
        return (ContractLinesPopulateVOImpl) findViewObject("ContractLinesPopulateVO1");
    }
    /**
     * Container's getter for RentalContractLinesVO2.
     * @return RentalContractLinesVO2
     */
    public RentalContractLinesVOImpl getRentalContractLinesVO2() {
        return (RentalContractLinesVOImpl) findViewObject("RentalContractLinesVO2");
    }

    /**
     * Container's getter for RentalContractLinesValidateVO1.
     * @return RentalContractLinesValidateVO1
     */
    public RentalContractLinesValidateVOImpl getRentalContractLinesValidateVO1() {
        return (RentalContractLinesValidateVOImpl) findViewObject("RentalContractLinesValidateVO1");
    }
    /**
     * Container's getter for RentalContractParentHdrVO1.
     * @return RentalContractParentHdrVO1
     */
    public RentalContractParentHdrVOImpl getRentalContractParentHdrVO1() {
        return (RentalContractParentHdrVOImpl) findViewObject("RentalContractParentHdrVO1");
    }

    /**
     * Container's getter for ContractChargesValidateVO1.
     * @return ContractChargesValidateVO1
     */
    public ContractChargesValidateVOImpl getContractChargesValidateVO1() {
        return (ContractChargesValidateVOImpl) findViewObject("ContractChargesValidateVO1");
    }

    /**
     * Container's getter for ContractClauseValidateVO1.
     * @return ContractClauseValidateVO1
     */
    public ContractClauseValidateVOImpl getContractClauseValidateVO1() {
        return (ContractClauseValidateVOImpl) findViewObject("ContractClauseValidateVO1");
    }
    
    /**
     * Container's getter for ContractChargesPopulateVO1.
     * @return ContractChargesPopulateVO1
     */
    public ContractChargesPopulateVOImpl getContractChargesPopulateVO1() {
        return (ContractChargesPopulateVOImpl) findViewObject("ContractChargesPopulateVO1");
    }

    /**
     * Container's getter for DeploymentReceiptHdrVO1.
     * @return DeploymentReceiptHdrVO1
     */
    public DeploymentReceiptHdrVOImpl getDeploymentReceiptHdrVO1() {
        return (DeploymentReceiptHdrVOImpl) findViewObject("DeploymentReceiptHdrVO1");
    }

    /**
     * Container's getter for DeploymentReceiptLinesVO1.
     * @return DeploymentReceiptLinesVO1
     */
    public DeploymentReceiptLinesVOImpl getDeploymentReceiptLinesVO1() {
        return (DeploymentReceiptLinesVOImpl) findViewObject("DeploymentReceiptLinesVO1");
    }

    /**
     * Container's getter for DeploymentRcptHdrToLinesVL1.
     * @return DeploymentRcptHdrToLinesVL1
     */
    public ViewLinkImpl getDeploymentRcptHdrToLinesVL1() {
        return (ViewLinkImpl) findViewLink("DeploymentRcptHdrToLinesVL1");
    }

    /**
     * Container's getter for DeploymentRcptAccessoriesVO1.
     * @return DeploymentRcptAccessoriesVO1
     */
    public DeploymentRcptAccessoriesVOImpl getDeploymentRcptAccessoriesVO1() {
        return (DeploymentRcptAccessoriesVOImpl) findViewObject("DeploymentRcptAccessoriesVO1");
    }

    /**
     * Container's getter for DeploymentRcptLinesToAccessoriesVL1.
     * @return DeploymentRcptLinesToAccessoriesVL1
     */
    public ViewLinkImpl getDeploymentRcptLinesToAccessoriesVL1() {
        return (ViewLinkImpl) findViewLink("DeploymentRcptLinesToAccessoriesVL1");
    }


    /**
     * Container's getter for DeploymentRcptMobilizationVO1.
     * @return DeploymentRcptMobilizationVO1
     */
    public DeploymentRcptMobilizationVOImpl getDeploymentRcptMobilizationVO1() {
        return (DeploymentRcptMobilizationVOImpl) findViewObject("DeploymentRcptMobilizationVO1");
    }

    /**
     * Container's getter for DeploymentRcptLinesToMobilizationVL1.
     * @return DeploymentRcptLinesToMobilizationVL1
     */
    public ViewLinkImpl getDeploymentRcptLinesToMobilizationVL1() {
        return (ViewLinkImpl) findViewLink("DeploymentRcptLinesToMobilizationVL1");
    }
    
    /**
     * Container's getter for InternalTypeAccessValidateVO1.
     * @return InternalTypeAccessValidateVO1
     */
    public InternalTypeAccessValidateVOImpl getInternalTypeAccessValidateVO1() {
        return (InternalTypeAccessValidateVOImpl) findViewObject("InternalTypeAccessValidateVO1");
    }
    
    /**
     * Container's getter for TransDailyTimesheetSearchVO1.
     * @return TransDailyTimesheetSearchVO1
     */
    public TransDailyTimesheetSearchVOImpl getTransDailyTimesheetSearchVO1() {
        return (TransDailyTimesheetSearchVOImpl) findViewObject("TransDailyTimesheetSearchVO1");
    }
    
    /**
     * Container's getter for TimesheetSearchVO1.
     * @return TimesheetSearchVO1
     */
    public TimesheetSearchVOImpl getTimesheetSearchVO1() {
        return (TimesheetSearchVOImpl) findViewObject("TimesheetSearchVO1");
    }
    /**
     * Container's getter for TimesheetHeaderVO1.
     * @return TimesheetHeaderVO1
     */
    public TimesheetHeaderVOImpl getTimesheetHeaderVO1() {
        return (TimesheetHeaderVOImpl) findViewObject("TimesheetHeaderVO1");
    }

    /**
     * Container's getter for MaxTimesheetNumVO1.
     * @return MaxTimesheetNumVO1
     */
    public MaxTimesheetNumVOImpl getMaxTimesheetNumVO1() {
        return (MaxTimesheetNumVOImpl) findViewObject("MaxTimesheetNumVO1");
    }
    
    /**
     * Container's getter for TimesheetLinesVO1.
     * @return TimesheetLinesVO1
     */
    public TimesheetLinesVOImpl getTimesheetLinesVO1() {
        return (TimesheetLinesVOImpl) findViewObject("TimesheetLinesVO1");
    }

    /**
     * Container's getter for TimesheetHdrToLinesVL1.
     * @return TimesheetHdrToLinesVL1
     */
    public ViewLinkImpl getTimesheetHdrToLinesVL1() {
        return (ViewLinkImpl) findViewLink("TimesheetHdrToLinesVL1");
    }

    /**
     * Container's getter for TimesheetLinesVO2.
     * @return TimesheetLinesVO2
     */
    public TimesheetLinesVOImpl getTimesheetLinesVO2() {
        return (TimesheetLinesVOImpl) findViewObject("TimesheetLinesVO2");
    }
    
    /**
     * Container's getter for HiringBasisHoursVO1.
     * @return HiringBasisHoursVO1
     */
    public HiringBasisHoursVOImpl getHiringBasisHoursVO1() {
        return (HiringBasisHoursVOImpl) findViewObject("HiringBasisHoursVO1");
    }

    /**
     * Container's getter for TimesheetHdrValidateVO1.
     * @return TimesheetHdrValidateVO1
     */
    public TimesheetHdrValidateVOImpl getTimesheetHdrValidateVO1() {
        return (TimesheetHdrValidateVOImpl) findViewObject("TimesheetHdrValidateVO1");
    }
    
    /*----------------------------------------------------Accessors end------------------------------------------------------------------------------------*/
    public String createTransRentalQuoteSearch() {
        String message = "Success";
        try {
            getTransRentalQuotationSearchVO1().executeQuery();
            TransRentalQuotationSearchVORowImpl searchRow =
                (TransRentalQuotationSearchVORowImpl) getTransRentalQuotationSearchVO1().getCurrentRow();
            if (searchRow != null) {
                searchRow.remove();
            }
            searchRow = (TransRentalQuotationSearchVORowImpl) getTransRentalQuotationSearchVO1().createRow();
            getTransRentalQuotationSearchVO1().insertRow(searchRow);
        } catch (Exception e) {
            e.printStackTrace();
            message = e.getMessage();
        }
        return message;
    }

    public String searchQuotations() {
        String message = "Success";
        try {
            TransRentalQuotationSearchVORowImpl searchRow =
                (TransRentalQuotationSearchVORowImpl) getTransRentalQuotationSearchVO1().getCurrentRow();
            if (searchRow != null) {
                getRentalQuotationSearchVO1().setNamedWhereClauseParam("p_quote_type", searchRow.getTransQuoteType());
                getRentalQuotationSearchVO1().setNamedWhereClauseParam("p_bu_id", searchRow.getTransBuId());
                getRentalQuotationSearchVO1()
                    .setNamedWhereClauseParam("p_src_div_flex_val_id", searchRow.getTransDivFlexValueId());
                getRentalQuotationSearchVO1()
                    .setNamedWhereClauseParam("p_req_bu_id", searchRow.getTransRequestingBuId());
                getRentalQuotationSearchVO1()
                    .setNamedWhereClauseParam("p_quote_number", searchRow.getTransQuotationNumber());
                getRentalQuotationSearchVO1()
                    .setNamedWhereClauseParam("p_quote_status", searchRow.getTransQuoteStatusCode());
                getRentalQuotationSearchVO1()
                    .setNamedWhereClauseParam("p_customer_type", searchRow.getTransCustomerTypeCode());
                getRentalQuotationSearchVO1().setNamedWhereClauseParam("p_project_id", searchRow.getTransProjectId());
                getRentalQuotationSearchVO1()
                    .setNamedWhereClauseParam("p_div_flex_val_id", searchRow.getTransCustomerDivFlexValueId());
                getRentalQuotationSearchVO1()
                    .setNamedWhereClauseParam("p_dept_flex_val_id", searchRow.getTransDeptFlexValueId());
                getRentalQuotationSearchVO1().setNamedWhereClauseParam("p_customer_id", searchRow.getTransCustomerId());
                getRentalQuotationSearchVO1().setNamedWhereClauseParam("p_site_use_id", searchRow.getTransSiteUseId());
                getRentalQuotationSearchVO1().executeQuery();
            }
        } catch (Exception e) {
            e.printStackTrace();
            message = e.getMessage();
        }
        return message;
    }

    public String resetQuotations() {
        String message = "Success";
        try {
            TransRentalQuotationSearchVORowImpl searchRow =
                (TransRentalQuotationSearchVORowImpl) getTransRentalQuotationSearchVO1().getCurrentRow();
            if (searchRow != null) {
                searchRow.setTransBuId(null);
                searchRow.setTransBuName(null);
                searchRow.setTransCustomerDivFlexValueId(null);
                searchRow.setTransCustomerDivision(null);
                searchRow.setTransCustomerId(null);
                searchRow.setTransCustomerName(null);
                searchRow.setTransCustomerSite(null);
                searchRow.setTransCustomerType(null);
                searchRow.setTransCustomerTypeCode(null);
                searchRow.setTransDeptFlexValueId(null);
                searchRow.setTransDeptName(null);
                searchRow.setTransDivFlexNum(null);
                searchRow.setTransDivFlexValueId(null);
                searchRow.setTransDivRequired(null);
                searchRow.setTransDivision(null);
                searchRow.setTransProject(null);
                searchRow.setTransProjectId(null);
                searchRow.setTransQuotationNumber(null);
                searchRow.setTransQuoteStatus(null);
                searchRow.setTransQuoteStatusCode(null);
                searchRow.setTransQuoteType(null);
                searchRow.setTransRequestingBu(null);
                searchRow.setTransRequestingBuId(null);
                searchRow.setTransSiteUseId(null);

                getRentalQuotationSearchVO1().setNamedWhereClauseParam("p_quote_type", null);
                getRentalQuotationSearchVO1().setNamedWhereClauseParam("p_bu_id", null);
                getRentalQuotationSearchVO1().setNamedWhereClauseParam("p_src_div_flex_val_id", null);
                getRentalQuotationSearchVO1().setNamedWhereClauseParam("p_req_bu_id", null);
                getRentalQuotationSearchVO1().setNamedWhereClauseParam("p_quote_number", null);
                getRentalQuotationSearchVO1().setNamedWhereClauseParam("p_quote_status", null);
                getRentalQuotationSearchVO1().setNamedWhereClauseParam("p_customer_type", null);
                getRentalQuotationSearchVO1().setNamedWhereClauseParam("p_project_id", null);
                getRentalQuotationSearchVO1().setNamedWhereClauseParam("p_div_flex_val_id", null);
                getRentalQuotationSearchVO1().setNamedWhereClauseParam("p_dept_flex_val_id", null);
                getRentalQuotationSearchVO1().setNamedWhereClauseParam("p_customer_id", null);
                getRentalQuotationSearchVO1().setNamedWhereClauseParam("p_site_use_id", null);
                getRentalQuotationSearchVO1().executeQuery();
            }
        } catch (Exception e) {
            e.printStackTrace();
            message = e.getMessage();
        }
        return message;
    }

    public String createQuotation() {
        String message = "Success";
        oracle.jbo.domain.Number seq = new oracle.jbo.domain.Number(0);
        oracle.jbo.domain.Number newSeq = null;
        try {
            RentalQuotesVOImpl quoteVO = getRentalQuotesVO1();
            quoteVO.executeQuery();
            RentalQuotesVORowImpl newRow = (RentalQuotesVORowImpl) quoteVO.createRow();
            quoteVO.insertRow(newRow);
            
            newRow.setQuoteStatus("D");
            newRow.setTransQuotationStatus("Draft");
            newRow.setRevisionNumber(new oracle.jbo.domain.Number(0));
            newRow.setCustomerStatus("P");
            newRow.setTransCustomerStatus("Pending");
            newRow.setValidFrom((Date) Date.getCurrentDate());
        } catch (Exception e) {
            e.printStackTrace();
            message = e.getMessage();
        }
        return message;
    }

    public String editQuotation() {
        String message = "Success";
        try {
            RentalQuotationSearchVORowImpl currRow =
                (RentalQuotationSearchVORowImpl) getRentalQuotationSearchVO1().getCurrentRow();
            if (currRow != null) {
                getAccessTypeVO1().setNamedWhereClauseParam("p_customer_type", currRow.getCustomerType());
                
                if("P".equals(currRow.getCustomerType())){
                    getAccessTypeVO1().setNamedWhereClauseParam("p_value_id", currRow.getProjectId());
                }else if("C".equals(currRow.getCustomerType())){
                    getAccessTypeVO1().setNamedWhereClauseParam("p_value_id", currRow.getCustomerId());
                }else if("D".equals(currRow.getCustomerType())){
                    getAccessTypeVO1().setNamedWhereClauseParam("p_value_id", currRow.getDeptFlexValueId());
                }else if("DV".equals(currRow.getCustomerType())){
                    getAccessTypeVO1().setNamedWhereClauseParam("p_value_id", currRow.getDivFlexValueId());
                }
                getAccessTypeVO1().setNamedWhereClauseParam("p_src_bu_id", currRow.getBuId());
                getAccessTypeVO1().setNamedWhereClauseParam("p_req_bu_id", currRow.getReqBuId());
                getAccessTypeVO1().setNamedWhereClauseParam("p_src_div_flex_val_id", currRow.getSrcDivFlexValId());
                
                getAccessTypeVO1().executeQuery();
                
                AccessTypeVORowImpl row = (AccessTypeVORowImpl) getAccessTypeVO1().first();
                
                if(row != null && "F".equals(row.getAccessType())){
                    ADFContext.getCurrent().getPageFlowScope().put("quoteEditFlag", "Y");
                }else{
                    ADFContext.getCurrent().getPageFlowScope().put("quoteEditFlag", "N");
                }
                
                getRentalQuotesVO1().setNamedWhereClauseParam("p_quotation_id", currRow.getQuotationId());
                getRentalQuotesVO1().executeQuery();
            }
        } catch (Exception e) {
            message = e.getMessage();
            e.printStackTrace();
        }
        return message;
    }
    
    public String rqInterDivisionCheck(){
        String message = "Success";
        try {
            RentalQuotesVORowImpl hdrRow = (RentalQuotesVORowImpl) getRentalQuotesVO1().getCurrentRow();
            if(hdrRow != null && "Internal".equals(hdrRow.getQuoteType())
                && hdrRow.getTransDivision() != null && hdrRow.getSrcDivision() != null
                && hdrRow.getTransDivision().equals(hdrRow.getSrcDivision())){
                hdrRow.setTransDivision(null);
                hdrRow.setDivFlexValueId(null);
                hdrRow.setDivFlexValSetId(null);                
                return "For Quotation Type Internal, Division and Inter Division can't be same";
            }
        }catch (Exception e) {
            e.printStackTrace();
            message = e.getMessage();
        }
        return message;
    }


    public String addQuoteHireInfo() {
        String message = "Success";
        try {
            RentalQuotesVOImpl quotesVO = getRentalQuotesVO1();
            RentalQuotesVORowImpl hdrRow = (RentalQuotesVORowImpl) quotesVO.getCurrentRow();
            oracle.jbo.domain.Number seq = new oracle.jbo.domain.Number(0);
            if (hdrRow != null) {
                RentalQuoteLinesVOImpl linesVO = getRentalQuoteLinesVO1();
                RentalQuoteLinesVORowImpl newRow = (RentalQuoteLinesVORowImpl) linesVO.createRow();
                linesVO.insertRow(newRow);
                newRow.setMasterQuotationId(hdrRow.getMasterQuoteId());
                newRow.setParentQuotationId(hdrRow.getParentQuoteId());
                newRow.setTransHdrBuId(hdrRow.getBuId());
                newRow.setTransHdrCustType(hdrRow.getCustomerType());
                newRow.setTransHdrCustomerId(hdrRow.getCustomerId());
                newRow.setTransHdrDeptFlexValueId(hdrRow.getDeptFlexValueId());
                newRow.setTransHdrDivFlexValueId(hdrRow.getDivFlexValueId());
                newRow.setTransHdrProjectId(hdrRow.getProjectId());
                newRow.setTransHdrReqBuId(hdrRow.getReqBuId());
                newRow.setTransHdrSiteUseId(hdrRow.getSiteUseId());
                newRow.setTransHdrSrcDivFlexValId(hdrRow.getSrcDivFlexValId());
                newRow.setTaxRateCode(hdrRow.getTaxRateCode());
                newRow.setTaxRateId(hdrRow.getTaxRateId());

                getRentalQuoteLineNumVO1().setNamedWhereClauseParam("p_quotation_id", hdrRow.getQuotationId());
                getRentalQuoteLineNumVO1().setNamedWhereClauseParam("p_quote_line_id", newRow.getQuoteLineId());
                getRentalQuoteLineNumVO1().setApplyViewCriteriaName("RentalQuoteLineNumVOCriteria");
                getRentalQuoteLineNumVO1().executeQuery();

                RentalQuoteLineNumVORowImpl maxRow = (RentalQuoteLineNumVORowImpl) getRentalQuoteLineNumVO1().first();
                if (maxRow != null) {
                    if (maxRow.getLineNum() != null && maxRow.getLineNum().compareTo(0) > 0) {
                    seq = new oracle.jbo.domain.Number(maxRow.getLineNum());
                    }
                    else {
                        seq = new oracle.jbo.domain.Number(0);
                    }
                }
                else {
                   seq = new oracle.jbo.domain.Number(0);
                }
                newRow.setLineNum(new oracle.jbo.domain.Number(seq.add(new oracle.jbo.domain.Number(1))));
            }
        } catch (Exception e) {
            e.printStackTrace();
            message = e.getMessage();
        }
        return message;
    }
    
    public String generateQuoteNumber(){
        String message = "Success";
        try {
            RentalQuotesVOImpl quotesVO = getRentalQuotesVO1();
            RentalQuotesVORowImpl hdrRow = (RentalQuotesVORowImpl) quotesVO.getCurrentRow();
            oracle.jbo.domain.Number seq = new oracle.jbo.domain.Number(0);
            oracle.jbo.domain.Number newSeq = null;
            if (hdrRow != null && hdrRow.getQuoteNumber1() == null) {
                getMaxQuotationNumberVO1().setNamedWhereClauseParam("p_bu_id", hdrRow.getBuId());
                getMaxQuotationNumberVO1().setNamedWhereClauseParam("p_div_flex_val_id", hdrRow.getSrcDivFlexValId());
                getMaxQuotationNumberVO1().executeQuery();
                MaxQuotationNumberVORowImpl maxRow = (MaxQuotationNumberVORowImpl) getMaxQuotationNumberVO1().first();
                if (maxRow != null) {
                    seq = maxRow.getSeqNum();
                }
 
                newSeq = updateDocSequenceNumber("QN",hdrRow.getBuId(), hdrRow.getSrcDivFlexValId(), seq);
                if(newSeq == null){
                    return "Please define Document Sequence and then continue";
                }
                String divCode = getSequenceCode("QN",hdrRow.getBuId(), hdrRow.getSrcDivFlexValId());
                if(newSeq != null && divCode == null)
                {
                    hdrRow.setQuoteNumber("QN-"+newSeq);
                }else if(newSeq != null && divCode != null){
                    
                    hdrRow.setQuoteNumber(divCode+"-QN-"+newSeq);
                }
            }
        }catch (Exception e) {
            e.printStackTrace();
            message = e.getMessage();
        }
        return message;
    }

    public String deleteQuoteHireInfo() {
        String message = "Success";
        try {
            RentalQuoteLinesVOImpl linesVO = getRentalQuoteLinesVO1();
            RentalQuoteLinesVORowImpl currRow = (RentalQuoteLinesVORowImpl) linesVO.getCurrentRow();
            if (currRow != null) {
                getQuoteChargesForCategroyVO1().setNamedWhereClauseParam("p_category_id", currRow.getCategoryId());
                getQuoteChargesForCategroyVO1().setNamedWhereClauseParam("p_quotation_id", currRow.getQuotationId());
                getQuoteChargesForCategroyVO1().setApplyViewCriteriaName("QuoteChargesForCategroyVOCriteria");
                getQuoteChargesForCategroyVO1().executeQuery();
                
                RowSetIterator rs = getQuoteChargesForCategroyVO1().createRowSetIterator(null);
                while(rs.hasNext()){
                    QuoteChargesForCategroyVORowImpl r = (QuoteChargesForCategroyVORowImpl) rs.next();
                    r.remove();
                }
                
                currRow.remove();
            }
        } catch (Exception e) {
            e.printStackTrace();
            message = e.getMessage();
        }
        return message;
    }

    public String addQuoteCharge() {
        String message = "Success";
        try {
            RentalQuotesVOImpl quotesVO = getRentalQuotesVO1();
            RentalQuotesVORowImpl hdrRow = (RentalQuotesVORowImpl) quotesVO.getCurrentRow();
            if (hdrRow != null) {
                RentalQuoteChargesVOImpl chargesVO = getRentalQuoteChargesVO1();
                RentalQuoteChargesVORowImpl newRow = (RentalQuoteChargesVORowImpl) chargesVO.createRow();
                chargesVO.insertRow(newRow);
                newRow.setMasterQuotationId(hdrRow.getMasterQuoteId());
                newRow.setParentQuotationId(hdrRow.getParentQuoteId());
                newRow.setTaxRateCode(hdrRow.getTaxRateCode());
                newRow.setTaxRateId(hdrRow.getTaxRateId());
            }
        } catch (Exception e) {
            e.printStackTrace();
            message = e.getMessage();
        }
        return message;
    }

    public String deleteQuoteCharge() {
        String message = "Success";
        try {
            RentalQuoteChargesVOImpl chargesVO = getRentalQuoteChargesVO1();
            RentalQuoteChargesVORowImpl currRow = (RentalQuoteChargesVORowImpl) chargesVO.getCurrentRow();
            if (currRow != null) {
                currRow.remove();
            }
        } catch (Exception e) {
            e.printStackTrace();
            message = e.getMessage();
        }
        return message;
    }

    public String quoteReqLineNumChange() {
        String message = "Success";
        int n = 0;
        try {
            RentalQuoteLinesVOImpl linesVO = getRentalQuoteLinesVO1();
            RentalQuoteLinesVORowImpl currRow = (RentalQuoteLinesVORowImpl) linesVO.getCurrentRow();
            if (currRow != null) {
                getQuoteLinesValidateVO1().setApplyViewCriteriaName(null);
                getQuoteLinesValidateVO1().executeQuery();

                getQuoteLinesValidateVO1().setNamedWhereClauseParam("p_quotation_id", currRow.getQuotationId());
                getQuoteLinesValidateVO1().setNamedWhereClauseParam("p_quote_line_id", currRow.getQuoteLineId());
                getQuoteLinesValidateVO1().setNamedWhereClauseParam("p_request_line_id", currRow.getRequestLineId());
                getQuoteLinesValidateVO1().setApplyViewCriteriaName("QuoteLinesRequestValidateVOCriteria");
                getQuoteLinesValidateVO1().executeQuery();

                if (getQuoteLinesValidateVO1().getRowCount() > 0) {
                    message =
                        "Request Line Number " + currRow.getRequestLineNum() + " of Request " +
                        currRow.getTransAssetRequestNum() + " is already quoted";
                    currRow.setRequestLineNum(null);
                    currRow.setRequestLineId(null);
                    return message;
                }
                /*Check whether Asset , Hiring basis are already present in Quotation lines*/
                getQuoteLinesValidateVO1().setApplyViewCriteriaName(null);
                getQuoteLinesValidateVO1().executeQuery();

                getQuoteLinesValidateVO1().setNamedWhereClauseParam("p_quotation_id", currRow.getQuotationId());
                getQuoteLinesValidateVO1().setNamedWhereClauseParam("p_quote_line_id", currRow.getQuoteLineId());
                getQuoteLinesValidateVO1().setNamedWhereClauseParam("p_rental_type", currRow.getRentalType());
                getQuoteLinesValidateVO1().setNamedWhereClauseParam("p_category_id", currRow.getCategoryId());
                getQuoteLinesValidateVO1().setApplyViewCriteriaName("QuoteLinesManualValidateVOCriteria");
                getQuoteLinesValidateVO1().executeQuery();

                RowSetIterator rs = getQuoteLinesValidateVO1().createRowSetIterator(null);
                while (rs.hasNext()) {
                    QuoteLinesValidateVORowImpl currFilRow = (QuoteLinesValidateVORowImpl) rs.next();
                    if (currFilRow.getOnHireDate().compareTo(currRow.getOnHireDate()) > 0) {
                        if (currRow.getOffHireDate() == null) {
                            n = 1;
                            break;

                        } else if (currFilRow.getOnHireDate().compareTo(currRow.getOffHireDate()) <= 0) {
                            n = 1;
                            break;
                        }
                    } else if (currFilRow.getOnHireDate().compareTo(currRow.getOnHireDate()) < 0) {
                        if (currFilRow.getOffHireDate() == null) {
                            n = 1;
                            break;
                        } else if (currRow.getOnHireDate().compareTo(currFilRow.getOffHireDate()) <= 0) {
                            n = 1;
                            break;
                        }
                    } else {
                        n = 1;
                        break;
                    }
                }
                if (n > 0) {
                    message =
                        "Category " + currRow.getTransAssetCategory() + " of Rental Type " +
                        currRow.getTransRentalType() + " is already quoted for the given dates";
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            message = e.getMessage();
        }
        return message;
    }

    public String quoteRentalTypeChange() {
        String message = "Success";
        int n = 0;
        try {
            RentalQuoteLinesVOImpl linesVO = getRentalQuoteLinesVO1();
            RentalQuoteLinesVORowImpl currRow = (RentalQuoteLinesVORowImpl) linesVO.getCurrentRow();
            if (currRow != null && currRow.getRentalType() != null) {
                currRow.setCategoryId(null);
                currRow.setTransAssetCategory(null);
                currRow.setMobilizationRequired(null);
                currRow.setTransAssetDescription(null);
                currRow.setOnHireDate(null);
                currRow.setOffHireDate(null);
            }
        } catch (Exception e) {
            e.printStackTrace();
            message = e.getMessage();
        }
        return message;
    }

    public String quoteLineOnHireDateChange() {
        String message = "Success";
        int n = 0;
        try {
            RentalQuoteLinesVOImpl linesVO = getRentalQuoteLinesVO1();
            RentalQuoteLinesVORowImpl currRow = (RentalQuoteLinesVORowImpl) linesVO.getCurrentRow();
            if (currRow != null && currRow.getRentalType() != null && currRow.getCategoryId() != null &&
                currRow.getOnHireDate() != null) {
                getQuoteLinesValidateVO1().setApplyViewCriteriaName(null);
                getQuoteLinesValidateVO1().executeQuery();

                getQuoteLinesValidateVO1().setNamedWhereClauseParam("p_quotation_id", currRow.getQuotationId());
                getQuoteLinesValidateVO1().setNamedWhereClauseParam("p_quote_line_id", currRow.getQuoteLineId());
                getQuoteLinesValidateVO1().setNamedWhereClauseParam("p_rental_type", currRow.getRentalType());
                getQuoteLinesValidateVO1().setNamedWhereClauseParam("p_category_id", currRow.getCategoryId());
                getQuoteLinesValidateVO1().setApplyViewCriteriaName("QuoteLinesManualValidateVOCriteria");
                getQuoteLinesValidateVO1().executeQuery();

                RowSetIterator rs = getQuoteLinesValidateVO1().createRowSetIterator(null);
                while (rs.hasNext()) {
                    QuoteLinesValidateVORowImpl currFilRow = (QuoteLinesValidateVORowImpl) rs.next();
                    if (currFilRow.getOnHireDate().compareTo(currRow.getOnHireDate()) > 0) {
                        if (currRow.getOffHireDate() == null) {
                            n = 1;
                            break;

                        } else if (currFilRow.getOnHireDate().compareTo(currRow.getOffHireDate()) <= 0) {
                            n = 1;
                            break;
                        }
                    } else if (currFilRow.getOnHireDate().compareTo(currRow.getOnHireDate()) < 0) {
                        if (currFilRow.getOffHireDate() == null) {
                            n = 1;
                            break;
                        } else if (currRow.getOnHireDate().compareTo(currFilRow.getOffHireDate()) <= 0) {
                            n = 1;
                            break;
                        }
                    } else {
                        n = 1;
                        break;
                    }
                }
                if (n > 0) {
                    message =
                        "Category " + currRow.getTransAssetCategory() + " of Rental Type " +
                        currRow.getTransRentalType() + " is already quoted for the given dates";
                    currRow.setCategoryId(null);
                    currRow.setTransAssetCategory(null);
                    currRow.setMobilizationRequired(null);
                    currRow.setOnHireDate(null);
                    currRow.setOffHireDate(null);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            message = e.getMessage();
        }
        return message;
    }

    public String quoteChargeBillingChange() {
        String message = "Success";
        try {
            RentalQuoteChargesVORowImpl currRow =
                (RentalQuoteChargesVORowImpl) getRentalQuoteChargesVO1().getCurrentRow();
            if (currRow != null) {
                getQuoteChargesValidateVO1().setApplyViewCriteriaName(null);
                getQuoteChargesValidateVO1().executeQuery();

                getQuoteChargesValidateVO1().setNamedWhereClauseParam("p_charge_id", currRow.getQuoteChargeId());
                getQuoteChargesValidateVO1().setNamedWhereClauseParam("p_quotation_id", currRow.getQuotationId());
                getQuoteChargesValidateVO1().setNamedWhereClauseParam("p_category_id", currRow.getAssetCategoryId());
                getQuoteChargesValidateVO1().setNamedWhereClauseParam("p_charge_type", currRow.getChargeType());
                getQuoteChargesValidateVO1().setNamedWhereClauseParam("p_billing", currRow.getBilling());
                getQuoteChargesValidateVO1().setApplyViewCriteriaName("QuoteChargesValidateVOCriteria");
                getQuoteChargesValidateVO1().executeQuery();

                if (getQuoteChargesValidateVO1().getRowCount() > 0) {
                    message =
                        "Additional Charges are already defined for Category " + currRow.getTransAssetCategory() +
                        ", Charge Type " + currRow.getTransChargeType() + " and Billing " + currRow.getTransBilling();
                    currRow.setTransBilling(null);
                    currRow.setBilling(null);
                    currRow.setQuantity(null);
                    currRow.setUnitAmount(null);
                    currRow.setAmount(null);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            message = e.getMessage();
        }
        return message;
    }

    public String setQuotationSearch() {
        String message = "Success";
        try {
            getTransRentalQuotationSearchVO1().executeQuery();
            TransRentalQuotationSearchVORowImpl searchRow =
                (TransRentalQuotationSearchVORowImpl) getTransRentalQuotationSearchVO1().getCurrentRow();
            if (searchRow != null) {
                searchRow.remove();
            }
            searchRow = (TransRentalQuotationSearchVORowImpl) getTransRentalQuotationSearchVO1().createRow();
            getTransRentalQuotationSearchVO1().insertRow(searchRow);

            Map pf = ADFContext.getCurrent().getPageFlowScope();
            searchRow.setTransBuId((oracle.jbo.domain.Number) pf.get("rqsBuId"));
            searchRow.setTransBuName((String) pf.get("rqsBu"));
            searchRow.setTransCustomerDivFlexValueId((String) pf.get("rqsCustDivFlexValId"));
            searchRow.setTransCustomerDivision((String) pf.get("rqsCustDivision"));
            searchRow.setTransCustomerId((oracle.jbo.domain.Number) pf.get("rqsCustomerId"));
            searchRow.setTransCustomerName((String) pf.get("rqsCustomerName"));
            searchRow.setTransCustomerSite((String) pf.get("rqsCustomerSite"));
            searchRow.setTransCustomerType((String) pf.get("rqsCustomerType"));
            searchRow.setTransCustomerTypeCode((String) pf.get("rqsCustomerTypeCode"));
            searchRow.setTransDeptFlexValueId((oracle.jbo.domain.Number) pf.get("rqsDeptFlexValId"));
            searchRow.setTransDeptName((String) pf.get("rqsDeptName"));
            searchRow.setTransDivFlexNum((oracle.jbo.domain.Number) pf.get("rqsDivSegment"));
            searchRow.setTransDivFlexValueId((oracle.jbo.domain.Number) pf.get("rqsDivFlexValId"));
            searchRow.setTransDivRequired((String) pf.get("rqsDivRequired"));
            searchRow.setTransDivision((String) pf.get("rqsDivision"));
            searchRow.setTransProject((String) pf.get("rqsProject"));
            searchRow.setTransProjectId((oracle.jbo.domain.Number) pf.get("rqsProjectId"));
            searchRow.setTransQuotationNumber((String) pf.get("rqsQuotationNo"));
            searchRow.setTransQuoteStatus((String) pf.get("rqsQuoteStatus"));
            searchRow.setTransQuoteStatusCode((String) pf.get("rqsQuoteStatusCode"));
            searchRow.setTransQuoteType((String) pf.get("rqsQuoteType"));
            searchRow.setTransReqDeptFlexSegmentNum((oracle.jbo.domain.Number) pf.get("rqsReqBuDeptSegment"));
            searchRow.setTransReqDivFlexSegmentNum((oracle.jbo.domain.Number) pf.get("rqsReqBuDivSegment"));
            searchRow.setTransRequestingBu((String) pf.get("rqsReqBu"));
            searchRow.setTransRequestingBuId((oracle.jbo.domain.Number) pf.get("rqsReqBuId"));
            searchRow.setTransSiteUseId((oracle.jbo.domain.Number) pf.get("rqsSiteUseId"));

            getRentalQuotationSearchVO1().setNamedWhereClauseParam("p_quote_type", searchRow.getTransQuoteType());
            getRentalQuotationSearchVO1().setNamedWhereClauseParam("p_bu_id", searchRow.getTransBuId());
            getRentalQuotationSearchVO1()
                .setNamedWhereClauseParam("p_src_div_flex_val_id", searchRow.getTransDivFlexValueId());
            getRentalQuotationSearchVO1().setNamedWhereClauseParam("p_req_bu_id", searchRow.getTransRequestingBuId());
            getRentalQuotationSearchVO1()
                .setNamedWhereClauseParam("p_quote_number", searchRow.getTransQuotationNumber());
            getRentalQuotationSearchVO1()
                .setNamedWhereClauseParam("p_quote_status", searchRow.getTransQuoteStatusCode());
            getRentalQuotationSearchVO1()
                .setNamedWhereClauseParam("p_customer_type", searchRow.getTransCustomerTypeCode());
            getRentalQuotationSearchVO1().setNamedWhereClauseParam("p_project_id", searchRow.getTransProjectId());
            getRentalQuotationSearchVO1()
                .setNamedWhereClauseParam("p_div_flex_val_id", searchRow.getTransCustomerDivFlexValueId());
            getRentalQuotationSearchVO1()
                .setNamedWhereClauseParam("p_dept_flex_val_id", searchRow.getTransDeptFlexValueId());
            getRentalQuotationSearchVO1().setNamedWhereClauseParam("p_customer_id", searchRow.getTransCustomerId());
            getRentalQuotationSearchVO1().setNamedWhereClauseParam("p_site_use_id", searchRow.getTransSiteUseId());
            getRentalQuotationSearchVO1().executeQuery();

        } catch (Exception e) {
            e.printStackTrace();
            message = e.getMessage();
        }
        return message;
    }

    public String uploadRentalQuoteAttach() {
        String message = "Success";
        try {
            ADFContext adfCtx = ADFContext.getCurrent();
            Map pageFlowScope = adfCtx.getPageFlowScope();
            int ch = -1;

            AttachmentsVOImpl attachmentVO = getAttachmentsVO2();
            AttachmentsVORowImpl currRow = (AttachmentsVORowImpl) attachmentVO.getCurrentRow();
            InputStream in = (InputStream) pageFlowScope.get("quoteUploadedFileStream");
            ByteArrayOutputStream bout = new ByteArrayOutputStream();
            new ByteArrayOutputStream();
            try {
                while ((ch = in.read()) != -1) {
                    bout.write(ch);
                }
                in.close();
                bout.close();

                currRow.setAttachmentFile(new BlobDomain(bout.toByteArray()));
            } catch (Exception e) {
                //                System.out.println(e.getMessage());
                return "ERROR";
            }

            String fileName = (String) pageFlowScope.get("quoteFileName");
            currRow.setFileName(fileName);
            currRow.setFileType((String) pageFlowScope.get("quoteFileType"));
        } catch (Exception e) {
            e.printStackTrace();
            message = e.getMessage();
        }
        return message;
    }

    public String addQuoteAttachment() {
        String message = "Success";
        try {
            AttachmentsVOImpl attachVO = getAttachmentsVO6();
            AttachmentsVORowImpl newRow = (AttachmentsVORowImpl) attachVO.createRow();
            attachVO.insertRow(newRow);
            newRow.setAttachmentCode("XXADS_RENTAL_QUOTE_T");
            newRow.setCategory("Misc");
            newRow.setTransCategory("Miscellaneous");
        } catch (Exception e) {
            e.printStackTrace();
            message = e.getMessage();
        }
        return message;
    }

    public String quoteTypeChange() {
        String message = "Success";
        try {
            RentalQuotesVORowImpl hdrRow = (RentalQuotesVORowImpl) getRentalQuotesVO1().getCurrentRow();
            if (hdrRow != null) {
                hdrRow.setTransSourceBu(null);
                hdrRow.setTransSourceDivRequired(null);
                hdrRow.setTransSrcDivFlexSegmentNum(null);
                hdrRow.setBuId(null);
                hdrRow.setSrcDivision(null);
                hdrRow.setSrcDivFlexValId(null);
                hdrRow.setSrcDivFlexValSetId(null);
                hdrRow.setTransRequestingBu(null);
                hdrRow.setTransReqBuDeptSegment(null);
                hdrRow.setTransReqBuDivSegment(null);
                hdrRow.setReqBuId(null);
                if("External".equals(hdrRow.getQuoteType())){
                    hdrRow.setTransCustomerType("Customer");
                    hdrRow.setCustomerType("C");
                    hdrRow.setTaxRateCode("AE_STD");
                }else{
                    hdrRow.setTransCustomerType(null);
                    hdrRow.setCustomerType(null);
                    hdrRow.setTaxRateCode(null);
                }
                hdrRow.setTransProject(null);
                hdrRow.setProjectId(null);
                hdrRow.setTransDeptName(null);
                hdrRow.setDepartmentCode(null);
                hdrRow.setDepartmentName(null);
                hdrRow.setDeptFlexValueId(null);
                hdrRow.setDeptFlexValueSetId(null);
                hdrRow.setDivFlexValSetId(null);
                hdrRow.setDivFlexValueId(null);
                hdrRow.setTransCustomerName(null);
                hdrRow.setTransCustomerSite(null);
                hdrRow.setCustomerId(null);
                hdrRow.setCustSiteId(null);
                hdrRow.setSiteUseId(null);
                hdrRow.setTransOrderType(null);
                hdrRow.setOrderType(null);
            }
        } catch (Exception e) {
            e.printStackTrace();
            message = e.getMessage();
        }
        return message;
    }

    public String quoteRequestingBuChange() {
        String message = "Success";
        try {
            RentalQuotesVORowImpl hdrRow = (RentalQuotesVORowImpl) getRentalQuotesVO1().getCurrentRow();
            if (hdrRow != null) {
                if("External".equals(hdrRow.getQuoteType())){
                    hdrRow.setTransCustomerType("Customer");
                    hdrRow.setCustomerType("C");
                    hdrRow.setTaxRateCode("AE_STD");
                }else{
                    hdrRow.setTransCustomerType(null);
                    hdrRow.setCustomerType(null);
                    hdrRow.setTaxRateCode(null);
                }
                hdrRow.setTransProject(null);
                hdrRow.setProjectId(null);
                hdrRow.setTransDeptName(null);
                hdrRow.setDepartmentCode(null);
                hdrRow.setDepartmentName(null);
                hdrRow.setDeptFlexValueId(null);
                hdrRow.setDeptFlexValueSetId(null);
                hdrRow.setDivFlexValSetId(null);
                hdrRow.setDivFlexValueId(null);
                hdrRow.setTransCustomerName(null);
                hdrRow.setTransCustomerSite(null);
                hdrRow.setCustomerId(null);
                hdrRow.setCustSiteId(null);
                hdrRow.setSiteUseId(null);
            }
        } catch (Exception e) {
            e.printStackTrace();
            message = e.getMessage();
        }
        return message;
    }

    public String quoteCustomerTypeChange() {
        String message = "Success";
        try {
            RentalQuotesVORowImpl hdrRow = (RentalQuotesVORowImpl) getRentalQuotesVO1().getCurrentRow();
            if (hdrRow != null) {
                hdrRow.setTransProject(null);
                hdrRow.setProjectId(null);
                hdrRow.setTransDeptName(null);
                hdrRow.setDepartmentCode(null);
                hdrRow.setDepartmentName(null);
                hdrRow.setDeptFlexValueId(null);
                hdrRow.setDeptFlexValueSetId(null);
                hdrRow.setDivFlexValSetId(null);
                hdrRow.setDivFlexValueId(null);
                hdrRow.setTransCustomerName(null);
                hdrRow.setTransCustomerSite(null);
                hdrRow.setCustomerId(null);
                hdrRow.setCustSiteId(null);
                hdrRow.setSiteUseId(null);
                hdrRow.setTaxRateCode(null);
                if("P".equals(hdrRow.getCustomerType()))
                            {
                                hdrRow.setTaxRateCode("AE_OUT_OF_SCOPE");
                            }
                            else if("C".equals(hdrRow.getCustomerType()))
                            {
                                   hdrRow.setTaxRateCode("AE_STD");
                            }
            }
        } catch (Exception e) {
            e.printStackTrace();
            message = e.getMessage();
        }
        return message;
    }

    public String quoteSourceBuChange() {
        String message = "Success";
        try {
            RentalQuotesVORowImpl hdrRow = (RentalQuotesVORowImpl) getRentalQuotesVO1().getCurrentRow();
            if (hdrRow != null) {
                if ("Internal".equals(hdrRow.getQuoteType()) || "External".equals(hdrRow.getQuoteType())) {
                    //Check whether there is access for Internal BU or not
                    if(!"Y".equals(hdrRow.getTransSourceDivRequired())){
                        getInternalTypeAccessValidateVO1().setNamedWhereClauseParam("p_user_id", ((Map) ADFContext.getCurrent().getSessionScope().get("userMap")).get("UserId"));
                        getInternalTypeAccessValidateVO1().setNamedWhereClauseParam("p_src_bu_id", hdrRow.getBuId());
                        getInternalTypeAccessValidateVO1().setNamedWhereClauseParam("p_src_flex_value_id", null);
                        getInternalTypeAccessValidateVO1().setNamedWhereClauseParam("p_req_bu_id", hdrRow.getBuId());
                        getInternalTypeAccessValidateVO1().setNamedWhereClauseParam("p_page_type", "T");
                        
                        getInternalTypeAccessValidateVO1().executeQuery();
                        InternalTypeAccessValidateVORowImpl validateRow =
                            (InternalTypeAccessValidateVORowImpl) getInternalTypeAccessValidateVO1().first();                        
                        if(validateRow != null && "Y".equals(validateRow.getFlag())){
                            hdrRow.setReqBuId(hdrRow.getBuId());
                            hdrRow.setTransRequestingBu(hdrRow.getTransSourceBu());
                            hdrRow.setTransReqBuDivSegment(hdrRow.getTransSrcDivFlexSegmentNum());
                            hdrRow.setTransReqBuDeptSegment(hdrRow.getTransSrcDeptFlexSegmentNum());
                        }else{
                            message = "Access is not defined for "+hdrRow.getTransSourceBu()+" as Requesting BU. Please provide access and continue";
                            hdrRow.setTransSourceBu(null);
                            hdrRow.setTransSourceDivRequired(null);
                            hdrRow.setTransSrcCurrencyCode(null);
                            hdrRow.setTransSrcDeptFlexSegmentNum(null);
                            hdrRow.setTransSrcDivFlexSegmentNum(null);
                            hdrRow.setTransSrcPrecision(null);
                            hdrRow.setBuId(null);
                        }
                    }else{
                        hdrRow.setTransRequestingBu(null);
                        hdrRow.setTransReqBuDeptSegment(null);
                        hdrRow.setTransReqBuDivSegment(null);
                        hdrRow.setReqBuId(null);
                    }
                    
                } else {
                    hdrRow.setTransRequestingBu(null);
                    hdrRow.setTransReqBuDeptSegment(null);
                    hdrRow.setTransReqBuDivSegment(null);
                    hdrRow.setReqBuId(null);
                }
                hdrRow.setSrcDivision(null);
                hdrRow.setSrcDivFlexValId(null);
                hdrRow.setSrcDivFlexValSetId(null);
                if(!"External".equals(hdrRow.getQuoteType())){
                    hdrRow.setTransCustomerType(null);
                    hdrRow.setCustomerType(null);
                    hdrRow.setTaxRateCode(null);
                }
                hdrRow.setTransProject(null);
                hdrRow.setProjectId(null);
                hdrRow.setTransDeptName(null);
                hdrRow.setDepartmentCode(null);
                hdrRow.setDepartmentName(null);
                hdrRow.setDeptFlexValueId(null);
                hdrRow.setDeptFlexValueSetId(null);
                hdrRow.setDivFlexValSetId(null);
                hdrRow.setDivFlexValueId(null);
                hdrRow.setTransCustomerName(null);
                hdrRow.setTransCustomerSite(null);
                hdrRow.setCustomerId(null);
                hdrRow.setCustSiteId(null);
                hdrRow.setSiteUseId(null);
                hdrRow.setTransOrderType(null);
                hdrRow.setOrderType(null);

            }
        } catch (Exception e) {
            e.printStackTrace();
            message = e.getMessage();
        }
        return message;
    }

    public String quoteSourceDivChange() {
        String message = "Success";
        try {
            RentalQuotesVORowImpl hdrRow = (RentalQuotesVORowImpl) getRentalQuotesVO1().getCurrentRow();
            if (hdrRow != null) {
                if ("Group".equals(hdrRow.getQuoteType())) {
                    hdrRow.setTransRequestingBu(null);
                    hdrRow.setTransReqBuDeptSegment(null);
                    hdrRow.setTransReqBuDivSegment(null);
                    hdrRow.setReqBuId(null);
                }else{
                    if("Y".equals(hdrRow.getTransSourceDivRequired())){
                        getInternalTypeAccessValidateVO1().setNamedWhereClauseParam("p_user_id", ((Map) ADFContext.getCurrent().getSessionScope().get("userMap")).get("UserId"));
                        getInternalTypeAccessValidateVO1().setNamedWhereClauseParam("p_src_bu_id", hdrRow.getBuId());
                        getInternalTypeAccessValidateVO1().setNamedWhereClauseParam("p_src_flex_value_id", hdrRow.getSrcDivFlexValId());
                        getInternalTypeAccessValidateVO1().setNamedWhereClauseParam("p_req_bu_id", hdrRow.getBuId());
                        getInternalTypeAccessValidateVO1().setNamedWhereClauseParam("p_page_type", "T");
                        
                        getInternalTypeAccessValidateVO1().executeQuery();
                        InternalTypeAccessValidateVORowImpl validateRow =
                            (InternalTypeAccessValidateVORowImpl) getInternalTypeAccessValidateVO1().first();                        
                        if(validateRow != null && "Y".equals(validateRow.getFlag())){
                            hdrRow.setReqBuId(hdrRow.getBuId());
                            hdrRow.setTransRequestingBu(hdrRow.getTransSourceBu());
                            hdrRow.setTransReqBuDivSegment(hdrRow.getTransSrcDivFlexSegmentNum());
                            hdrRow.setTransReqBuDeptSegment(hdrRow.getTransSrcDeptFlexSegmentNum());
                        }else{
                            message = "Access is not defined for "+hdrRow.getTransSourceBu()+" as Requesting BU. Please provide access and continue";
                            
                            hdrRow.setSrcDivision(null);
                            hdrRow.setSrcDivFlexValId(null);
                            hdrRow.setSrcDivFlexValSetId(null);
                        }
                    }else{
                        hdrRow.setTransRequestingBu(null);
                        hdrRow.setTransReqBuDeptSegment(null);
                        hdrRow.setTransReqBuDivSegment(null);
                        hdrRow.setReqBuId(null);
                    }
                }
                if(!"External".equals(hdrRow.getQuoteType())){
                    hdrRow.setTransCustomerType(null);
                    hdrRow.setCustomerType(null);
                    hdrRow.setTaxRateCode(null);
                }
                hdrRow.setTransProject(null);
                hdrRow.setProjectId(null);
                hdrRow.setTransDeptName(null);
                hdrRow.setDepartmentCode(null);
                hdrRow.setDepartmentName(null);
                hdrRow.setDeptFlexValueId(null);
                hdrRow.setDeptFlexValueSetId(null);
                hdrRow.setDivFlexValSetId(null);
                hdrRow.setDivFlexValueId(null);
                hdrRow.setTransCustomerName(null);
                hdrRow.setTransCustomerSite(null);
                hdrRow.setCustomerId(null);
                hdrRow.setCustSiteId(null);
                hdrRow.setSiteUseId(null);
                hdrRow.setTransOrderType(null);
                hdrRow.setOrderType(null);

            }
        } catch (Exception e) {
            e.printStackTrace();
            message = e.getMessage();
        }
        return message;
    }

    public String generateContract(){
        String message = "Success";
        CallableStatement cs = null;
        try {
            RentalQuotesVORowImpl hdrRow = (RentalQuotesVORowImpl) getRentalQuotesVO1().getCurrentRow();
            if(hdrRow != null){
                cs = this.getDBTransaction().createCallableStatement(GENERATE_CONTRACT, 0);
                cs.setLong("p_quotation_id", hdrRow.getQuotationId().longValue());
                cs.setString("p_user",  ((Map) ADFContext.getCurrent()
                                                        .getSessionScope()
                                                        .get("userMap")).get("UserName").toString());
                cs.registerOutParameter("p_message",Types.VARCHAR);
                cs.execute();
                message = cs.getString("p_message");
                if("Success".equals(message)){
                    hdrRow.setTransContractGenerateFlag("Y");
                    getQuoteContractDetailsVO1().setNamedWhereClauseParam("p_master_quote_id", hdrRow.getMasterQuoteId());
                    getQuoteContractDetailsVO1().executeQuery();
                    
                    QuoteContractDetailsVORowImpl conRow =
                        (QuoteContractDetailsVORowImpl) getQuoteContractDetailsVO1().first();
                    if(conRow != null){
                        hdrRow.setTransContractId(conRow.getContractId());
                        hdrRow.setTransContractNumber(conRow.getContractNumber());
                    }
                }
            }
        }catch (Exception e) {
            message = "Success";
            e.printStackTrace();
        }
        return message;
    }

    public String reviseQuotation() {
        String message = "Success";
        CallableStatement cs = null;
        try {
            RentalQuotesVORowImpl hdrRow = (RentalQuotesVORowImpl) getRentalQuotesVO1().getCurrentRow();
            oracle.jbo.domain.Number hdrId = hdrRow.getQuotationId();
            if (hdrRow != null) {
                /*Need to check whether there are any active deployments for this quotation (TODO)*/

                cs = getDBTransaction().createCallableStatement(REVISE_RENTAL_QUOTATION, 0);
                cs.setLong("p_quotation_id", hdrRow.getQuotationId().longValue());
                cs.setString("p_reason", (String) ADFContext.getCurrent()
                                                            .getPageFlowScope()
                                                            .get("REVISION_REMARKS"));
                cs.setString("p_user", ((Map) ADFContext.getCurrent()
                                                        .getSessionScope()
                                                        .get("userMap")).get("UserName").toString());
                cs.registerOutParameter("p_message", Types.VARCHAR);
                cs.execute();

                message = cs.getString("p_message");
                if ("Success".equals(message)) {
                    getRentalQuotesVO1().executeQuery();

                    getRentalQuoteParentHdrVO1().setNamedWhereClauseParam("p_quotation_id", hdrId);
                    getRentalQuoteParentHdrVO1().executeQuery();

                    RentalQuoteParentHdrVORowImpl row =
                        (RentalQuoteParentHdrVORowImpl) getRentalQuoteParentHdrVO1().first();
                    if (row != null) {
                        getRentalQuotesVO1().setNamedWhereClauseParam("p_quotation_id", row.getQuotationId());
                        getRentalQuotesVO1().executeQuery();
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            message = e.getMessage();
        } finally {
            if (cs != null) {
                try {
                    cs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return message;
    }

    public String quoteHiringBasisChange() {
        String message = "Success";
        try {
            RentalQuoteLinesVORowImpl linesRow = (RentalQuoteLinesVORowImpl) getRentalQuoteLinesVO1().getCurrentRow();
            if (linesRow != null && linesRow.getCategoryId() != null && linesRow.getHiringBasisRuleId() != null &&
                linesRow.getOperatorOption() != null && linesRow.getFuelOption() != null) {
                getRentalMasterRatesVO1().setNamedWhereClauseParam("p_bu_id", linesRow.getTransHdrBuId());
                getRentalMasterRatesVO1()
                    .setNamedWhereClauseParam("p_src_div_flex_val_id", linesRow.getTransHdrSrcDivFlexValId());
                getRentalMasterRatesVO1().setNamedWhereClauseParam("p_asset_category_id", linesRow.getCategoryId());
                getRentalMasterRatesVO1().setNamedWhereClauseParam("p_hiring_rule_id", linesRow.getHiringBasisRuleId());
                getRentalMasterRatesVO1().setNamedWhereClauseParam("p_operator_option", linesRow.getOperatorOption());
                getRentalMasterRatesVO1().setNamedWhereClauseParam("p_fuel_option", linesRow.getFuelOption());
                getRentalMasterRatesVO1().executeQuery();

                RentalMasterRatesVORowImpl ratesRow = (RentalMasterRatesVORowImpl) getRentalMasterRatesVO1().first();
                if (ratesRow != null) {
                    linesRow.setUnitRate(ratesRow.getUnitRate());
                    linesRow.setStandardRate(ratesRow.getStandardRate());
                    linesRow.setOt1Rate(ratesRow.getOt1Rate());
                    linesRow.setOt2Rate(ratesRow.getOt2Rate());
                }else{
                    linesRow.setUnitRate(null);
                    linesRow.setStandardRate(null);
                    linesRow.setOt1Rate(null);
                    linesRow.setOt2Rate(null);
                }
                linesRow.setMinChargeUnit(null);
                linesRow.setTransMinChargeUnit(null);

            }
        } catch (Exception e) {
            e.printStackTrace();
            message = e.getMessage();
        }
        return message;
    }

    public String quoteUnitRateChange(){
        String message = "Success";
        try {
            RentalQuoteLinesVORowImpl currRow = (RentalQuoteLinesVORowImpl) getRentalQuoteLinesVO1().getCurrentRow();
            if(currRow != null && currRow.getTransNoofDays() != null && currRow.getUnitRate() != null && currRow.getTransStandardHours() != null){
                oracle.jbo.domain.Number noOfDays = new oracle.jbo.domain.Number(currRow.getTransNoofDays());
                oracle.jbo.domain.Number unitRate = new oracle.jbo.domain.Number(currRow.getUnitRate());
                oracle.jbo.domain.Number stdHours = new oracle.jbo.domain.Number(currRow.getTransStandardHours());
                
                if(stdHours.compareTo(0) > 0){
                    currRow.setStandardRate(new oracle.jbo.domain.Number(unitRate.divide(noOfDays.multiply(stdHours))));
                }
            }
        }catch (Exception e) {
            e.printStackTrace();
            message = e.getMessage();
        }
        return message;
    }

    public String cancelQuotation() {
        String message = "Success";
        try {
            RentalQuotesVORowImpl currRow = (RentalQuotesVORowImpl) getRentalQuotesVO1().getCurrentRow();
            if (currRow != null && !"P".equals(currRow.getQuoteStatus())) {
                /*Need to check whether there are any active deployments for this quotation(TODO)*/
                currRow.setQuoteStatus("C");
                currRow.setTransQuotationStatus("Cancelled");
                currRow.setActiveFlag("N");
            }
        } catch (Exception e) {
            e.printStackTrace();
            message = e.getMessage();
        }
        return message;
    }

    public String submitQuotation() {
        String message = "Success";
        PreparedStatement ps = null;
        try {
            RentalQuotesVORowImpl currRow = (RentalQuotesVORowImpl) getRentalQuotesVO1().getCurrentRow();
            if (currRow != null &&
                ("D".equals(currRow.getQuoteStatus()) || "W".equals(currRow.getQuoteStatus()) ||
                 "R".equals(currRow.getQuoteStatus()))) {
                currRow.setQuoteStatus("A");
                currRow.setTransQuotationStatus("Approved");

                oracle.jbo.domain.Date currDate = (Date) Date.getCurrentDate();
                currRow.setApprovedDate(currDate);
                currRow.setActiveFlag("Y");
                currRow.setSubmittedBy((String) ADFContext.getCurrent()
                                                          .getSessionScope()
                                                          .get("UserName"));
                currRow.setSubmittedDate(currDate);
                if (currRow.getRevisionNumber().compareTo(0) > 0) {
                    ps =
                        this.getDBTransaction()
                        .createPreparedStatement("update xxads_rental_quote_t set active_flag = 'N' where quotation_id = ? and quotation_id <> parent_quote_id",
                                                 1);
                    ps.setLong(1, currRow.getParentQuoteId().longValue());
                    ps.executeUpdate();
                }
                this.getDBTransaction().commit();
            }
        } catch (Exception e) {
            e.printStackTrace();
            message = e.getMessage();
        }
        return message;
    }

    public String quoteValidFromChange() {
        String message = "Success";
        try {
            RentalQuotesVORowImpl currRow = (RentalQuotesVORowImpl) getRentalQuotesVO1().getCurrentRow();
            oracle.jbo.domain.Date currDate = (Date) Date.getCurrentDate();
            
            /*Valid From Validation*/
            getRentalQuoteValidFromValidateVO1().setNamedWhereClauseParam("p_valid_from", currRow.getValidFrom());
            getRentalQuoteValidFromValidateVO1().executeQuery();
            RentalQuoteValidFromValidateVORowImpl validateRow =
                (RentalQuoteValidFromValidateVORowImpl) getRentalQuoteValidFromValidateVO1().first();
            if(validateRow!=null)
            {
                oracle.jbo.domain.Number flag=validateRow.getFlag();
                if(new oracle.jbo.domain.Number(0).compareTo(flag)==0)
                {
                    currRow.setValidFrom(null);
                    currRow.setValidTo(null);
                    message= "Valid From can't be before System Date";
                }
            }
            /*Till here*/
            
//            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");
////            java.util.Date currDateWithoutTime = sdf.parse(sdf.format(new Date()));
//            if (currRow != null && currRow.getValidFrom() != null){
////                java.util.Date fromDateWithoutTime = sdf.parse(sdf.format(new Date(currRow.getValidFrom())));
//                if(currRow.getValidFrom().compareTo(currDate) < 0){
//                    message = "Valid From can't be before System Date";
//                    currRow.setValidFrom(null);
//                    currRow.setValidTo(null);
//                }
//            }
        } catch (Exception e) {
            e.printStackTrace();
            message = e.getMessage();
        }
        return message;
    }

    public String validateQuoteLines() {
        String message = "Success";
        int n = 0;
        try {
            RowSetIterator rs2 = getRentalQuoteLinesVO1().createRowSetIterator(null);
            while (rs2.hasNext()) {
                RentalQuoteLinesVORowImpl currRow = (RentalQuoteLinesVORowImpl) rs2.next();
                n = 0;
                if (currRow.getEntity(0).getEntityState() == 0 || currRow.getEntity(0).getEntityState() == 2) {
                    getQuoteLinesValidateVO1().setApplyViewCriteriaName(null);
                    getQuoteLinesValidateVO1().executeQuery();

                    getQuoteLinesValidateVO1().setNamedWhereClauseParam("p_quotation_id", currRow.getQuotationId());
                    getQuoteLinesValidateVO1().setNamedWhereClauseParam("p_quote_line_id", currRow.getQuoteLineId());
                    getQuoteLinesValidateVO1().setNamedWhereClauseParam("p_rental_type", currRow.getRentalType());
                    getQuoteLinesValidateVO1().setNamedWhereClauseParam("p_category_id", currRow.getCategoryId());
                    getQuoteLinesValidateVO1().setApplyViewCriteriaName("QuoteLinesManualValidateVOCriteria");
                    getQuoteLinesValidateVO1().executeQuery();

                    RowSetIterator rs = getQuoteLinesValidateVO1().createRowSetIterator(null);
                    while (rs.hasNext()) {
                        QuoteLinesValidateVORowImpl currFilRow = (QuoteLinesValidateVORowImpl) rs.next();
                        if (currFilRow.getOnHireDate().compareTo(currRow.getOnHireDate()) > 0) {
                            if (currRow.getOffHireDate() == null) {
                                n = 1;
                                break;

                            } else if (currFilRow.getOnHireDate().compareTo(currRow.getOffHireDate()) <= 0) {
                                n = 1;
                                break;
                            }
                        } else if (currFilRow.getOnHireDate().compareTo(currRow.getOnHireDate()) < 0) {
                            if (currFilRow.getOffHireDate() == null) {
                                n = 1;
                                break;
                            } else if (currRow.getOnHireDate().compareTo(currFilRow.getOffHireDate()) <= 0) {
                                n = 1;
                                break;
                            }
                        } else {
                            n = 1;
                            break;
                        }
                    }
                    if (n > 0) {
                        message =
                            ("Success".equals(message) ? " " : message + "_") + "Category " +
                            currRow.getTransAssetCategory() + " of Rental Type " + currRow.getTransRentalType() +
                            " is already quoted for the given dates";
                    }
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
            message = e.getMessage();
        }
        return message;
    }

    public String quoteSearchSourceBuChange() {
        String message = "Success";
        try {
            TransRentalQuotationSearchVORowImpl searchRow =
                (TransRentalQuotationSearchVORowImpl) getTransRentalQuotationSearchVO1().getCurrentRow();
            if (searchRow != null && searchRow.getTransQuoteType() != null && searchRow.getTransBuId() != null) {
                if (!"Group".equals(searchRow.getTransQuoteType())) {
                    searchRow.setTransRequestingBu(searchRow.getTransBuName());
                    searchRow.setTransRequestingBuId(searchRow.getTransRequestingBuId());
                    searchRow.setTransReqDivFlexSegmentNum(searchRow.getTransDivFlexNum());
                    searchRow.setTransReqDeptFlexSegmentNum(searchRow.getTransSrcDeptFlexSegmentNum());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            message = e.getMessage();
        }
        return message;
    }
    
    public Boolean makeAsRQCurrentRow(oracle.jbo.domain.Number HeaderId) {
        Boolean isSetted = false;

        getRentalQuotesVO1().setNamedWhereClauseParam("p_quotation_id", HeaderId);
        getRentalQuotesVO1().executeQuery();

        if (getRentalQuotesVO1().first() != null) {
            RentalQuotesVORowImpl custRow = (RentalQuotesVORowImpl) getRentalQuotesVO1().getCurrentRow();
            if (HeaderId.longValue() == custRow.getQuotationId().longValue()) {
                isSetted = true;
            }
        }
        return isSetted;
    }
    
    public String callpkgForAMERQProcessSubmit() {
        CommonAMImpl commonAM = (CommonAMImpl) getCommonAM1();
        String msg = "";
        try {
            RentalQuotesVORowImpl hdrRow = (RentalQuotesVORowImpl) getRentalQuotesVO1().getCurrentRow();
            CommonAMImpl commAM = (CommonAMImpl) getCommonAM1();
            if (hdrRow != null) {
                Map paramsMap = new HashMap();
                oracle.jbo.domain.Number hdrId = hdrRow.getQuotationId();
                paramsMap.put("docId", new oracle.jbo.domain.Number(hdrRow.getQuotationId()));
                paramsMap.put("docTypeId", new oracle.jbo.domain.Number(50));
                paramsMap.put("ActionCode", "Submit");
                paramsMap.put("currEmpId", commAM.getCurrentEmployeeId() != null ? commAM.getCurrentEmployeeId() : -1);
                paramsMap.put("remarks", "");
                paramsMap.put("docNum", hdrRow.getQuoteNumber());
                msg = commonAM.callAMEProcess(paramsMap);
                if ("Submitted".equals(msg)) {
                    submitRQDocFor("In Process");
                    msg = "SUCCESS";
                }
                else if ("Finally Approved".equals(msg)) { //FYI approval only
//                    submitRQDocFor("Approved");
                    msg = "SUCCESS";
                }
                else if ("SUCCESS".equals(msg)) {
                    submitRQDocFor("Approved");
                }
                getRentalQuotesVO1().setNamedWhereClauseParam("p_quotation_id", hdrId);
                getRentalQuotesVO1().executeQuery();
                
                if(getRentalQuotesVO1().hasNext()){
                    getRentalQuotesVO1().next();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return msg;

    }
    
    public void submitRQDocFor(String toDocStatus) {
        try {
            if (getRentalQuotesVO1().getCurrentRow() != null) {
                RentalQuotesVORowImpl hdrRow = (RentalQuotesVORowImpl) getRentalQuotesVO1().getCurrentRow();
                if ("In Process".equals(toDocStatus)) {
                    hdrRow.setQuoteStatus("P");
                    hdrRow.setTransQuotationStatus(toDocStatus);
                } else if ("Approved".equals(toDocStatus)) {
                    hdrRow.setQuoteStatus("A");
                    hdrRow.setTransQuotationStatus(toDocStatus);
                }
                getDBTransaction().commit();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String withdrawRQFromApproval(String remarks) {
        String message = null;
        try {
            if (getRentalQuotesVO1().getCurrentRow() != null) {
                RentalQuotesVORowImpl hdrRow = (RentalQuotesVORowImpl) getRentalQuotesVO1().getCurrentRow();
                CommonAMImpl commAM = (CommonAMImpl) getCommonAM1();
                CallableStatement st = getDBTransaction().createCallableStatement(WITHDRAW_APPRL_SUBMISSION, 0);
                st.setLong("p_document_type_id", 50);
                st.setLong("p_document_id", hdrRow.getQuotationId().longValue());
                st.setString("p_remarks", remarks);
                st.setLong("p_user",
                           commAM.getCurrentEmployeeId() != null ? commAM.getCurrentEmployeeId().longValue() : -1);
                st.setString("p_message", null);
                st.registerOutParameter("p_message", Types.VARCHAR);
                st.execute();
                message = st.getString("p_message");
                if ("Success".equals(message)) {
                    RentalQuotesVORowImpl curRow = (RentalQuotesVORowImpl) getRentalQuotesVO1().getCurrentRow();
//                    curRow.setQuoteStatus("W");
                    curRow.setQuoteStatus("D");
                    this.getDBTransaction().commit();

                }
                getRentalQuotesVO1().executeQuery();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return message;
    }
    
    public String checkForQuoteLines() 
    {
        String message = "Success";
        try 
        {
            if(getRentalQuoteLinesVO1().getRowCount()  == 0) 
            {
                return "Please add lines to submit the current Quotation.";
            }
        }
        catch(Exception e) 
        {
            message = e.getMessage();
            e.printStackTrace();
        }
        return message;
    }

    public void setActionHistoryForRQDocument() {
           try {
               RentalQuotesVORowImpl currRow = (RentalQuotesVORowImpl) getRentalQuotesVO1().getCurrentRow();

               ActionHistoryVOImpl approvalHIstVo = getActionHistoryVO1();
               approvalHIstVo.applyViewCriteria(null);
               approvalHIstVo.setNamedWhereClauseParam("p_doc_id", currRow.getQuotationId());
               approvalHIstVo.setNamedWhereClauseParam("p_doc_type_id", 50);
               approvalHIstVo.setApplyViewCriteriaName("ActionHistoryVOCriteria");
               approvalHIstVo.setRangeSize(-1);
               approvalHIstVo.executeQuery();
           } 
           catch (Exception e) {
                e.printStackTrace();
           }
        }
    
    public void createTransTemplatePopupSearch(){
        try
        {
            TransTemplateVORowImpl transCurrRow =
                (TransTemplateVORowImpl) getTransTemplateVO1().getCurrentRow();
            if(transCurrRow != null){
                transCurrRow.remove();
            }
            
            getTransTemplateVO1().executeQuery();
                       
            TransTemplateVORowImpl transRow = (TransTemplateVORowImpl) getTransTemplateVO1().createRow();
            getTransTemplateVO1().insertRow(transRow);

        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public void createTransQuoteTemplateSearch(){
        try
        {
            RentalQuotesVORowImpl hdrRow = (RentalQuotesVORowImpl) getRentalQuotesVO1().getCurrentRow();
            if(hdrRow != null){
                TransTemplateVORowImpl transCurrRow =
                    (TransTemplateVORowImpl) getTransTemplateVO1().getCurrentRow();
                if(transCurrRow != null){
                    transCurrRow.remove();
                }
                
                getTransTemplateVO1().executeQuery();
                           
                TransTemplateVORowImpl transRow = (TransTemplateVORowImpl) getTransTemplateVO1().createRow();
                getTransTemplateVO1().insertRow(transRow);
                transRow.setTransBuId(hdrRow.getBuId());
                transRow.setTransDivFlexValueId(hdrRow.getSrcDivFlexValId());
                ADFContext.getCurrent().getPageFlowScope().put("templateAddBuId", hdrRow.getBuId());
                ADFContext.getCurrent().getPageFlowScope().put("templateAddDivId", hdrRow.getSrcDivFlexValId());
            }
            
            
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public void createTransContractTemplateSearch(){
        try
        {
            RentalContractVORowImpl hdrRow = (RentalContractVORowImpl) getRentalContractVO1().getCurrentRow();
            if(hdrRow != null){
                TransTemplateVORowImpl transCurrRow =
                    (TransTemplateVORowImpl) getTransTemplateVO1().getCurrentRow();
                if(transCurrRow != null){
                    transCurrRow.remove();
                }
                
                getTransTemplateVO1().executeQuery();
                           
                TransTemplateVORowImpl transRow = (TransTemplateVORowImpl) getTransTemplateVO1().createRow();
                getTransTemplateVO1().insertRow(transRow);
                transRow.setTransBuId(hdrRow.getSrcBuId());
                transRow.setTransDivFlexValueId(hdrRow.getSrcDivFlexValId());
                ADFContext.getCurrent().getPageFlowScope().put("templateAddBuId", hdrRow.getSrcBuId());
                ADFContext.getCurrent().getPageFlowScope().put("templateAddDivId", hdrRow.getSrcDivFlexValId());
            }
            
            
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public void setQuoteTermsConditions() 
    {
        try 
        {
            RentalQuotesVORowImpl quoteRow =
                (RentalQuotesVORowImpl) getRentalQuotesVO1().getCurrentRow();
            TransTemplateVORowImpl transRow = (TransTemplateVORowImpl) getTransTemplateVO1().getCurrentRow();
            if(transRow != null && transRow.getTransActiveTemplateName() != null) 
            {
                quoteRow.setTermsConditions(transRow.getTransAciveTemplateInfo());
            }
        }
        catch(Exception e) 
        {            
            e.printStackTrace();
        }
    }
    
    
    /*------------------------------------------------------------Rental Contract-------------------------------------------------------------------------------*/
    
//    public String getCreditInfo(){
//        String message = "Success";
//        CallableStatement cs = null;
//        try {
//            RentalContractVORowImpl hdrRow = (RentalContractVORowImpl) getRentalContractVO1().getCurrentRow();
//            if(hdrRow != null){
//                getCreditInfoVO1().setNamedWhereClauseParam("p_bu_id", hdrRow.getReqBuId());
//                getCreditInfoVO1().setNamedWhereClauseParam("p_cust_account_id", hdrRow.getCustomerId());
//                getCreditInfoVO1().setNamedWhereClauseParam("p_division", hdrRow.getTransDivFlexValue());
//                getCreditInfoVO1().executeQuery();
//                
//                CreditInfoVORowImpl r = (CreditInfoVORowImpl) getCreditInfoVO1().first();
//                if(r != null){
//                    return r.getCreditInfo();
//                }
//            }
//        }catch (Exception e) {
//            message = e.getMessage();
//            e.printStackTrace();
//        }
//        return message;
//    }
    
    public String searchRentalContracts() {
        String message = "Success";
        try {
            TransRentalContractSearchVORowImpl searchRow =
                (TransRentalContractSearchVORowImpl) getTransRentalContractSearchVO1().getCurrentRow();
            if (searchRow != null) {
                getRentalContractSearchVO1()
                    .setNamedWhereClauseParam("p_contract_type", searchRow.getTransContractType());
                getRentalContractSearchVO1().setNamedWhereClauseParam("p_src_bu_id", searchRow.getTransSrcBuId());
                getRentalContractSearchVO1()
                    .setNamedWhereClauseParam("p_src_div_flex_val_id", searchRow.getTransSrcDivFlexValId());
                getRentalContractSearchVO1().setNamedWhereClauseParam("p_req_bu_id", searchRow.getTransReqBuId());
                getRentalContractSearchVO1()
                    .setNamedWhereClauseParam("p_contract_number", searchRow.getTransContractNumber());
                getRentalContractSearchVO1()
                    .setNamedWhereClauseParam("p_quotation_id", searchRow.getTransQuotationId());
                getRentalContractSearchVO1()
                    .setNamedWhereClauseParam("p_effective_from", searchRow.getTransEffectiveFrom());
                getRentalContractSearchVO1()
                    .setNamedWhereClauseParam("p_effective_to", searchRow.getTransEffectiveTo());
                getRentalContractSearchVO1()
                    .setNamedWhereClauseParam("p_customer_type", searchRow.getTransCustomerTypeCode());
                getRentalContractSearchVO1().setNamedWhereClauseParam("p_project_id", searchRow.getTransProjectId());
                getRentalContractSearchVO1()
                    .setNamedWhereClauseParam("p_div_flex_val_id", searchRow.getTransDivFlexValId());
                getRentalContractSearchVO1()
                    .setNamedWhereClauseParam("p_dept_flex_val_id", searchRow.getTransDeptFlexValId());
                getRentalContractSearchVO1()
                    .setNamedWhereClauseParam("p_contract_status", searchRow.getTransContractStatusCode());
                getRentalContractSearchVO1()
                    .setNamedWhereClauseParam("p_customer_id", searchRow.getTransCustomerId());
                getRentalContractSearchVO1()
                    .setNamedWhereClauseParam("p_site_use_id", searchRow.getTransSiteUseId());

                getRentalContractSearchVO1().executeQuery();
            }
        } catch (Exception e) {
            e.printStackTrace();
            message = e.getMessage();
        }
        return message;
    }

    public String resetRentalContracts() {
        String message = "Success";
        try {
            TransRentalContractSearchVORowImpl searchRow =
                (TransRentalContractSearchVORowImpl) getTransRentalContractSearchVO1().getCurrentRow();
            if (searchRow != null) {
                searchRow.setTransContractType(null);
                searchRow.setTransSrcBu(null);
                searchRow.setTransSrcDivRequired(null);
                searchRow.setTransSrcDivSegmentNum(null);
                searchRow.setTransSrcDeptSegmentNum(null);
                searchRow.setTransSrcBuId(null);
                searchRow.setTransSrcDivsion(null);
                searchRow.setTransSrcDivFlexValId(null);
                searchRow.setTransContractNumber(null);
                searchRow.setTransQuotationNum(null);
                searchRow.setTransEffectiveFrom(null);
                searchRow.setTransEffectiveTo(null);
                searchRow.setTransCustomerType(null);
                searchRow.setTransCustomerTypeCode(null);
                searchRow.setTransProject(null);
                searchRow.setTransProjectId(null);
                searchRow.setTransDivision(null);
                searchRow.setTransDivFlexValId(null);
                searchRow.setTransDepartment(null);
                searchRow.setTransDeptFlexValId(null);
                searchRow.setTransContractStatus(null);
                searchRow.setTransContractStatusCode(null);
                searchRow.setTransCustomerName(null);
                searchRow.setTransCustomerId(null);
                searchRow.setTransCustomerSite(null);
                searchRow.setTransSiteUseId(null);
                searchRow.setTransReqBu(null);
                searchRow.setTransReqBuId(null);
                searchRow.setTransReqDeptSegmentNum(null);
                searchRow.setTransReqDivSegmentNum(null);

                getRentalContractSearchVO1().setNamedWhereClauseParam("p_contract_type", null);
                getRentalContractSearchVO1().setNamedWhereClauseParam("p_src_bu_id", null);
                getRentalContractSearchVO1().setNamedWhereClauseParam("p_src_div_flex_val_id", null);
                getRentalContractSearchVO1().setNamedWhereClauseParam("p_req_bu_id", null);
                getRentalContractSearchVO1().setNamedWhereClauseParam("p_contract_number", null);
                getRentalContractSearchVO1().setNamedWhereClauseParam("p_quotation_id", null);
                getRentalContractSearchVO1().setNamedWhereClauseParam("p_effective_from", null);
                getRentalContractSearchVO1().setNamedWhereClauseParam("p_effective_to", null);
                getRentalContractSearchVO1().setNamedWhereClauseParam("p_customer_type", null);
                getRentalContractSearchVO1().setNamedWhereClauseParam("p_project_id", null);
                getRentalContractSearchVO1().setNamedWhereClauseParam("p_div_flex_val_id", null);
                getRentalContractSearchVO1().setNamedWhereClauseParam("p_dept_flex_val_id", null);
                getRentalContractSearchVO1().setNamedWhereClauseParam("p_contract_status", null);
                getRentalContractSearchVO1().setNamedWhereClauseParam("p_customer_id", null);
                getRentalContractSearchVO1().setNamedWhereClauseParam("p_site_use_id", null);

                getRentalContractSearchVO1().executeQuery();
            }
        } catch (Exception e) {
            e.printStackTrace();
            message = e.getMessage();
        }
        return message;
    }

    public String createRentalContract() {
        String message = "Success";        
        try {
            getRentalContractVO1().executeQuery();
            RentalContractVORowImpl currRow = (RentalContractVORowImpl) getRentalContractVO1().createRow();
            getRentalContractVO1().insertRow(currRow);
            currRow.setTransContractStatus("Draft");
            currRow.setContractStatus("D"); 
//            if("P".equals(currRow.getCustomerType()))
//            {
//                currRow.setTaxRateCode("AE_OUT_OF_SCOPE");
//            }
//            else if("C".equals(currRow.getCustomerType()))
//            {
//                    currRow.setTaxRateCode("AE_STD");
//                }
            
           
        } catch (Exception e) {
            e.printStackTrace();
            message = e.getMessage();
        }
        return message;
    }
    
    public String generateContractNumber(){
        String message = "Success";
        oracle.jbo.domain.Number reqNum = new oracle.jbo.domain.Number(0);
        oracle.jbo.domain.Number seq = null;
        RentalContractVORowImpl currRow = (RentalContractVORowImpl) getRentalContractVO1().getCurrentRow();
        if(currRow != null && currRow.getContractNumber() == null){
            getMaxContractNumVO1().setNamedWhereClauseParam("p_bu_id", currRow.getSrcBuId());
            getMaxContractNumVO1().setNamedWhereClauseParam("p_div_flex_val_id", currRow.getSrcDivFlexValId());
            getMaxContractNumVO1().executeQuery();
            MaxContractNumVORowImpl maxRow = (MaxContractNumVORowImpl) getMaxContractNumVO1().first();
            if (maxRow != null) {
                reqNum = maxRow.getSeqNum();
            }
            seq = updateDocSequenceNumber("RC",currRow.getSrcBuId(), currRow.getSrcDivFlexValId(), reqNum);
            if(seq == null){
                return "Please define Document Sequence and then continue";
            }
            String divCode = getSequenceCode("RC",currRow.getSrcBuId(), currRow.getSrcDivFlexValId());
            if(seq != null && divCode == null)
            {
                currRow.setContractNumber("RC-"+seq);
            }else if(seq != null && divCode != null){
                
                currRow.setContractNumber(divCode+"-RC-"+seq);
            }
        }
        return message;
    }

    public String editRentalContract() {
        String message = "Success";
        try {
            RentalContractSearchVORowImpl searchRow =
                (RentalContractSearchVORowImpl) getRentalContractSearchVO1().getCurrentRow();
            if (searchRow != null) {
                getAccessTypeVO1().setNamedWhereClauseParam("p_customer_type", searchRow.getCustomerType());
                
                if("P".equals(searchRow.getCustomerType())){
                    getAccessTypeVO1().setNamedWhereClauseParam("p_value_id", searchRow.getProjectId());
                }else if("C".equals(searchRow.getCustomerType())){
                    getAccessTypeVO1().setNamedWhereClauseParam("p_value_id", searchRow.getCustomerId());
                }else if("D".equals(searchRow.getCustomerType())){
                    getAccessTypeVO1().setNamedWhereClauseParam("p_value_id", searchRow.getDeptFlexValueId());
                }else if("DV".equals(searchRow.getCustomerType())){
                    getAccessTypeVO1().setNamedWhereClauseParam("p_value_id", searchRow.getDivFlexValueId());
                }
                getAccessTypeVO1().setNamedWhereClauseParam("p_src_bu_id", searchRow.getSrcBuId());
                getAccessTypeVO1().setNamedWhereClauseParam("p_req_bu_id", searchRow.getReqBuId());
                getAccessTypeVO1().setNamedWhereClauseParam("p_src_div_flex_val_id", searchRow.getSrcDivFlexValId());
                
                getAccessTypeVO1().executeQuery();
                
                AccessTypeVORowImpl row = (AccessTypeVORowImpl) getAccessTypeVO1().first();
                
                if(row != null && "F".equals(row.getAccessType())){
                    ADFContext.getCurrent().getPageFlowScope().put("contractEditFlag", "Y");
                }else{
                    ADFContext.getCurrent().getPageFlowScope().put("contractEditFlag", "N");
                }
                
                getRentalContractVO1().setNamedWhereClauseParam("p_contract_id", searchRow.getContractId());
                getRentalContractVO1().executeQuery();
            }

        } catch (Exception e) {
            e.printStackTrace();
            message = e.getMessage();
        }
        return message;
    }

    public String setRentalContractSearch() {
        String message = "Success";
        try {
            getTransRentalContractSearchVO1().executeQuery();
            TransRentalContractSearchVORowImpl searchRow =
                (TransRentalContractSearchVORowImpl) getTransRentalContractSearchVO1().getCurrentRow();
            if (searchRow != null) {
                searchRow.remove();
            }
            searchRow = (TransRentalContractSearchVORowImpl) getTransRentalContractSearchVO1().createRow();
            getTransRentalContractSearchVO1().insertRow(searchRow);

            Map pageFlowScope = ADFContext.getCurrent().getPageFlowScope();

            searchRow.setTransContractType((String) pageFlowScope.get("rcContractType"));
            searchRow.setTransSrcBu((String) pageFlowScope.get("rcSrcBu"));
            searchRow.setTransSrcDivRequired((String) pageFlowScope.get("rcSrcDivRequired"));
            searchRow.setTransSrcDivSegmentNum((oracle.jbo.domain.Number) pageFlowScope.get("rcSrcDivSegmentNum"));
            searchRow.setTransSrcDeptSegmentNum((oracle.jbo.domain.Number) pageFlowScope.get("rcSrcDeptSegmentNum"));
            searchRow.setTransSrcBuId((oracle.jbo.domain.Number) pageFlowScope.get("rcSrcBuId"));
            searchRow.setTransSrcDivsion((String) pageFlowScope.get("rcSrcDivision"));
            searchRow.setTransSrcDivFlexValId((oracle.jbo.domain.Number) pageFlowScope.get("rcSrcDivFlexValId"));
            searchRow.setTransContractNumber((String) pageFlowScope.get("rcContractNum"));
            searchRow.setTransQuotationNum((String) pageFlowScope.get("rcQuotationNum"));
            searchRow.setTransEffectiveFrom((Date) pageFlowScope.get("rcEffectiveFrom"));
            searchRow.setTransEffectiveTo((Date) pageFlowScope.get("rcEffectiveTo"));
            searchRow.setTransCustomerType((String) pageFlowScope.get("rcCustomerType"));
            searchRow.setTransCustomerTypeCode((String) pageFlowScope.get("rcCustomerTypeCode"));
            searchRow.setTransProject((String) pageFlowScope.get("rcProject"));
            searchRow.setTransProjectId((oracle.jbo.domain.Number) pageFlowScope.get("rcProjectId"));
            searchRow.setTransDivision((String) pageFlowScope.get("rcDivision"));
            searchRow.setTransDivFlexValId((oracle.jbo.domain.Number) pageFlowScope.get("rcDivFlexValId"));
            searchRow.setTransDepartment((String) pageFlowScope.get("rcDepartment"));
            searchRow.setTransDeptFlexValId((oracle.jbo.domain.Number) pageFlowScope.get("rcDeptFlexValId"));
            searchRow.setTransContractStatus((String) pageFlowScope.get("rcContractStatus"));
            searchRow.setTransContractStatusCode((String) pageFlowScope.get("rcContractStatusCode"));
            searchRow.setTransCustomerName((String) pageFlowScope.get("rcCustomerName"));
            searchRow.setTransCustomerId((oracle.jbo.domain.Number) pageFlowScope.get("rcCustomerId"));
            searchRow.setTransCustomerSite((String) pageFlowScope.get("rcCustomerSite"));
            searchRow.setTransSiteUseId((oracle.jbo.domain.Number) pageFlowScope.get("rcSiteUseId"));
            searchRow.setTransReqBu((String) pageFlowScope.get("rcReqBu"));
            searchRow.setTransReqBuId((oracle.jbo.domain.Number) pageFlowScope.get("rcReqBuId"));
            searchRow.setTransReqDeptSegmentNum((oracle.jbo.domain.Number) pageFlowScope.get("rcReqDeptSegmentNum"));
            searchRow.setTransReqDivSegmentNum((oracle.jbo.domain.Number) pageFlowScope.get("rcReqDivSegmentNum"));

            getRentalContractSearchVO1().setNamedWhereClauseParam("p_contract_type", searchRow.getTransContractType());
            getRentalContractSearchVO1().setNamedWhereClauseParam("p_src_bu_id", searchRow.getTransSrcBuId());
            getRentalContractSearchVO1()
                .setNamedWhereClauseParam("p_src_div_flex_val_id", searchRow.getTransSrcDivFlexValId());
            getRentalContractSearchVO1().setNamedWhereClauseParam("p_req_bu_id", searchRow.getTransReqBuId());
            getRentalContractSearchVO1()
                .setNamedWhereClauseParam("p_contract_number", searchRow.getTransContractNumber());
            getRentalContractSearchVO1().setNamedWhereClauseParam("p_quotation_id", searchRow.getTransQuotationId());
            getRentalContractSearchVO1().setNamedWhereClauseParam("p_effective_from", searchRow.getTransEffectiveFrom());
            getRentalContractSearchVO1().setNamedWhereClauseParam("p_effective_to", searchRow.getTransEffectiveTo());
            getRentalContractSearchVO1().setNamedWhereClauseParam("p_customer_type", searchRow.getTransCustomerTypeCode());
            getRentalContractSearchVO1().setNamedWhereClauseParam("p_project_id", searchRow.getTransProjectId());
            getRentalContractSearchVO1()
                .setNamedWhereClauseParam("p_div_flex_val_id", searchRow.getTransDivFlexValId());
            getRentalContractSearchVO1()
                .setNamedWhereClauseParam("p_dept_flex_val_id", searchRow.getTransDeptFlexValId());
            getRentalContractSearchVO1()
                .setNamedWhereClauseParam("p_contract_status", searchRow.getTransContractStatusCode());
            getRentalContractSearchVO1().setNamedWhereClauseParam("p_customer_id", searchRow.getTransCustomerId());
            getRentalContractSearchVO1().setNamedWhereClauseParam("p_site_use_id", searchRow.getTransSiteUseId());

            getRentalContractSearchVO1().executeQuery();
        } catch (Exception e) {
            e.printStackTrace();
            message = e.getMessage();
        }
        return message;
    }

    public String contractTypeChange() {
        String message = "Success";
        try {
            RentalContractVORowImpl hdrRow = (RentalContractVORowImpl) getRentalContractVO1().getCurrentRow();
            if (hdrRow != null) {
                hdrRow.setTransSrcBu(null);
                hdrRow.setSrcBuId(null);
                hdrRow.setTransSrcBuPrecision(null);
                hdrRow.setTransSrcCurrencyCode(null);
                hdrRow.setTransSrcDeptSegmentNum(null);
                hdrRow.setTransSrcDivRequired(null);
                hdrRow.setTransSrcDivSegmentNum(null);
                hdrRow.setTransReqBu(null);
                hdrRow.setTransReqDeptSegmentNum(null);
                hdrRow.setTransReqDivSegmentNum(null);
                hdrRow.setReqBuId(null);
                hdrRow.setSrcDivision(null);
                hdrRow.setSrcDivFlexValId(null);
                hdrRow.setSrcDivFlexValSetId(null);
                hdrRow.setTransContractSource(null);
                hdrRow.setContractSource(null);
                hdrRow.setTransReferenceNo(null);
                hdrRow.setReferenceId(null);
                hdrRow.setMasterReferenceId(null);
                hdrRow.setParentReferenceId(null);
                if("External".equals(hdrRow.getContractType())){
                    hdrRow.setTransCustomerType("Customer");
                    hdrRow.setCustomerType("C");
                    hdrRow.setTaxRateCode("AE_STD");
                }else{
                    hdrRow.setTransCustomerType(null);
                    hdrRow.setCustomerType(null);
                    hdrRow.setTaxRateCode(null);
                }
                hdrRow.setTransProject(null);
                hdrRow.setProjectId(null);
                hdrRow.setTransDepartment(null);
                hdrRow.setDepartmentCode(null);
                hdrRow.setDepartmentName(null);
                hdrRow.setDeptFlexValueId(null);
                hdrRow.setDeptFlexValueSetId(null);
                hdrRow.setDivFlexValSetId(null);
                hdrRow.setDivFlexValueId(null);
                hdrRow.setTransCustomer(null);
                hdrRow.setTransCustomerSite(null);
                hdrRow.setCustomerId(null);
                hdrRow.setCustSiteId(null);
                hdrRow.setSiteUseId(null);
                hdrRow.setTransOrderType(null);
                hdrRow.setOrderType(null);
            }
        } catch (Exception e) {
            e.printStackTrace();
            message = e.getMessage();
        }
        return message;
    }

    public String contractSourceBuChange() {
        String message = "Success";
        try {
            RentalContractVORowImpl hdrRow = (RentalContractVORowImpl) getRentalContractVO1().getCurrentRow();
            if (hdrRow != null) {
                if ("Internal".equals(hdrRow.getContractType()) || "External".equals(hdrRow.getContractType())) {
                    oracle.jbo.domain.Number setId = hdrRow.getTransSetId();
                    if(!"Y".equals(hdrRow.getTransSrcDivRequired())){
                        
                        getInternalTypeAccessValidateVO1().setNamedWhereClauseParam("p_user_id", ((Map) ADFContext.getCurrent().getSessionScope().get("userMap")).get("UserId"));
                        getInternalTypeAccessValidateVO1().setNamedWhereClauseParam("p_src_bu_id", hdrRow.getSrcBuId());
                        getInternalTypeAccessValidateVO1().setNamedWhereClauseParam("p_src_flex_value_id", null);
                        getInternalTypeAccessValidateVO1().setNamedWhereClauseParam("p_req_bu_id", hdrRow.getSrcBuId());
                        getInternalTypeAccessValidateVO1().setNamedWhereClauseParam("p_page_type", "T");
                        
                        getInternalTypeAccessValidateVO1().executeQuery();
                        InternalTypeAccessValidateVORowImpl validateRow =
                            (InternalTypeAccessValidateVORowImpl) getInternalTypeAccessValidateVO1().first();                        
                        if(validateRow != null && "Y".equals(validateRow.getFlag())){
                            hdrRow.setReqBuId(hdrRow.getSrcBuId());
                            hdrRow.setTransReqBu(hdrRow.getTransSrcBu());
                            hdrRow.setTransReqDivSegmentNum(hdrRow.getTransSrcDivSegmentNum());
                            hdrRow.setTransReqDeptSegmentNum(hdrRow.getTransSrcDeptSegmentNum());
                            hdrRow.setTransSetId(setId);
                        }else{
                            message = "Access is not defined for "+hdrRow.getTransSrcBu()+" as Requesting BU. Please provide access and continue";
                            hdrRow.setTransSrcBu(null);
                            hdrRow.setTransSrcDivRequired(null);
                            hdrRow.setTransSrcCurrencyCode(null);
                            hdrRow.setTransSrcDivSegmentNum(null);
                            hdrRow.setTransSrcDeptSegmentNum(null);
                            hdrRow.setTransSrcBuPrecision(null);
                            hdrRow.setSrcBuId(null);
                            hdrRow.setTransSetId(null);
                        }
                    }else{
                        hdrRow.setTransReqBu(null);
                        hdrRow.setTransReqDeptSegmentNum(null);
                        hdrRow.setTransReqDivSegmentNum(null);
                        hdrRow.setReqBuId(null);
                        hdrRow.setTransSetId(setId);
                    }                    
                } else {
                    hdrRow.setTransReqBu(null);
                    hdrRow.setTransReqDeptSegmentNum(null);
                    hdrRow.setTransReqDivSegmentNum(null);
                    hdrRow.setReqBuId(null);
                }

                hdrRow.setSrcDivision(null);
                hdrRow.setSrcDivFlexValId(null);
                hdrRow.setSrcDivFlexValSetId(null);
                hdrRow.setTransContractSource(null);
                hdrRow.setContractSource(null);
                hdrRow.setTransReferenceNo(null);
                hdrRow.setReferenceId(null);
                hdrRow.setMasterReferenceId(null);
                hdrRow.setParentReferenceId(null);
                if("External".equals(hdrRow.getContractType())){
                    hdrRow.setTransCustomerType("Customer");
                    hdrRow.setCustomerType("C");
                }else{
                    hdrRow.setTransCustomerType(null);
                    hdrRow.setCustomerType(null);
                }
                hdrRow.setTransProject(null);
                hdrRow.setProjectId(null);
                hdrRow.setTransDepartment(null);
                hdrRow.setDepartmentCode(null);
                hdrRow.setDepartmentName(null);
                hdrRow.setDeptFlexValueId(null);
                hdrRow.setDeptFlexValueSetId(null);
                hdrRow.setDivFlexValSetId(null);
                hdrRow.setDivFlexValueId(null);
                hdrRow.setTransCustomer(null);
                hdrRow.setTransCustomerSite(null);
                hdrRow.setCustomerId(null);
                hdrRow.setCustSiteId(null);
                hdrRow.setSiteUseId(null);
                hdrRow.setTransOrderType(null);
                hdrRow.setOrderType(null);
            }
        } catch (Exception e) {
            e.printStackTrace();
            message = e.getMessage();
        }
        return message;
    }

    public String contractSourceDivChange() {
        String message = "Success";
        try {
            RentalContractVORowImpl hdrRow = (RentalContractVORowImpl) getRentalContractVO1().getCurrentRow();
            if (hdrRow != null) {
                if ("Internal".equals(hdrRow.getContractType()) || "External".equals(hdrRow.getContractType())) {
                    if("Y".equals(hdrRow.getTransSrcDivRequired())){
                        oracle.jbo.domain.Number setId = hdrRow.getTransSetId();
                        getInternalTypeAccessValidateVO1().setNamedWhereClauseParam("p_user_id", ((Map) ADFContext.getCurrent().getSessionScope().get("userMap")).get("UserId"));
                        getInternalTypeAccessValidateVO1().setNamedWhereClauseParam("p_src_bu_id", hdrRow.getSrcBuId());
                        getInternalTypeAccessValidateVO1().setNamedWhereClauseParam("p_src_flex_value_id", hdrRow.getSrcDivFlexValId());
                        getInternalTypeAccessValidateVO1().setNamedWhereClauseParam("p_req_bu_id", hdrRow.getSrcBuId());
                        getInternalTypeAccessValidateVO1().setNamedWhereClauseParam("p_page_type", "T");
                        
                        getInternalTypeAccessValidateVO1().executeQuery();
                        InternalTypeAccessValidateVORowImpl validateRow =
                            (InternalTypeAccessValidateVORowImpl) getInternalTypeAccessValidateVO1().first();                        
                        if(validateRow != null && "Y".equals(validateRow.getFlag())){
                            hdrRow.setReqBuId(hdrRow.getSrcBuId());
                            hdrRow.setTransReqBu(hdrRow.getTransSrcBu());
                            hdrRow.setTransReqDivSegmentNum(hdrRow.getTransSrcDivSegmentNum());
                            hdrRow.setTransReqDeptSegmentNum(hdrRow.getTransSrcDeptSegmentNum());
                            hdrRow.setTransSetId(setId);
                        }else{
                            message = "Access is not defined for "+hdrRow.getTransSrcBu()+" as Requesting BU. Please provide access and continue";
                            hdrRow.setTransSrcBu(null);
                            hdrRow.setTransSrcDivRequired(null);
                            hdrRow.setTransSrcCurrencyCode(null);
                            hdrRow.setTransSrcDivSegmentNum(null);
                            hdrRow.setTransSrcDeptSegmentNum(null);
                            hdrRow.setTransSrcBuPrecision(null);
                            hdrRow.setSrcBuId(null);
                            hdrRow.setTransSetId(null);
                        }
                    }else{
                        hdrRow.setTransReqBu(null);
                        hdrRow.setTransReqDeptSegmentNum(null);
                        hdrRow.setTransReqDivSegmentNum(null);
                        hdrRow.setReqBuId(null);
                    }                    
                } else {
                    hdrRow.setTransReqBu(null);
                    hdrRow.setTransReqDeptSegmentNum(null);
                    hdrRow.setTransReqDivSegmentNum(null);
                    hdrRow.setReqBuId(null);
                }
//                hdrRow.setTransReqBu(null);
//                hdrRow.setTransReqDeptSegmentNum(null);
//                hdrRow.setTransReqDivSegmentNum(null);
//                hdrRow.setReqBuId(null);
//                hdrRow.setSrcDivision(null);
//                hdrRow.setSrcDivFlexValId(null);
//                hdrRow.setSrcDivFlexValSetId(null);
                hdrRow.setTransContractSource(null);
                hdrRow.setContractSource(null);
                hdrRow.setTransReferenceNo(null);
                hdrRow.setReferenceId(null);
                hdrRow.setMasterReferenceId(null);
                hdrRow.setParentReferenceId(null);
                if("External".equals(hdrRow.getContractType())){
                    hdrRow.setTransCustomerType("Customer");
                    hdrRow.setCustomerType("C");
                }else{
                    hdrRow.setTransCustomerType(null);
                    hdrRow.setCustomerType(null);
                }
                hdrRow.setTransProject(null);
                hdrRow.setProjectId(null);
                hdrRow.setTransDepartment(null);
                hdrRow.setDepartmentCode(null);
                hdrRow.setDepartmentName(null);
                hdrRow.setDeptFlexValueId(null);
                hdrRow.setDeptFlexValueSetId(null);
                hdrRow.setDivFlexValSetId(null);
                hdrRow.setDivFlexValueId(null);
                hdrRow.setTransCustomer(null);
                hdrRow.setTransCustomerSite(null);
                hdrRow.setCustomerId(null);
                hdrRow.setCustSiteId(null);
                hdrRow.setSiteUseId(null);
                hdrRow.setTransOrderType(null);
                hdrRow.setOrderType(null);
                System.out.println(hdrRow.getTransSetId());
            }
        } catch (Exception e) {
            e.printStackTrace();
            message = e.getMessage();
        }
        return message;
    }

    public String contractReqBuChange() {
        String message = "Success";
        try {
            RentalContractVORowImpl hdrRow = (RentalContractVORowImpl) getRentalContractVO1().getCurrentRow();
            if (hdrRow != null) {
                hdrRow.setTransContractSource(null);
                hdrRow.setContractSource(null);
                hdrRow.setTransReferenceNo(null);
                hdrRow.setReferenceId(null);
                hdrRow.setMasterReferenceId(null);
                hdrRow.setParentReferenceId(null);
                if("External".equals(hdrRow.getContractType())){
                    hdrRow.setTransCustomerType("Customer");
                    hdrRow.setCustomerType("C");
                }else{
                    hdrRow.setTransCustomerType(null);
                    hdrRow.setCustomerType(null);
                }
                hdrRow.setTransProject(null);
                hdrRow.setProjectId(null);
                hdrRow.setTransDepartment(null);
                hdrRow.setDepartmentCode(null);
                hdrRow.setDepartmentName(null);
                hdrRow.setDeptFlexValueId(null);
                hdrRow.setDeptFlexValueSetId(null);
                hdrRow.setDivFlexValSetId(null);
                hdrRow.setDivFlexValueId(null);
                hdrRow.setTransCustomer(null);
                hdrRow.setTransCustomerSite(null);
                hdrRow.setCustomerId(null);
                hdrRow.setCustSiteId(null);
                hdrRow.setSiteUseId(null);
            }
        } catch (Exception e) {
            e.printStackTrace();
            message = e.getMessage();
        }
        return message;
    }
    
    public String rcInterDivisionCheck(){
        String message = "Success";
        try {
            RentalContractVORowImpl hdrRow = (RentalContractVORowImpl) getRentalContractVO1().getCurrentRow();
            if(hdrRow != null && "Internal".equals(hdrRow.getContractType())
                && hdrRow.getTransDivision() != null && hdrRow.getSrcDivision() != null
                && hdrRow.getTransDivision().equals(hdrRow.getSrcDivision())){
                hdrRow.setTransDivision(null);
                hdrRow.setDivFlexValueId(null);
                hdrRow.setDivFlexValSetId(null);                
                return "For Contract Type Internal, Division and Inter Division can't be same";
            }
        }catch (Exception e) {
            e.printStackTrace();
            message = e.getMessage();
        }
        return message;
    }


    public String contractSourceChange() {
        String message = "Success";
        try {
            RentalContractVORowImpl hdrRow = (RentalContractVORowImpl) getRentalContractVO1().getCurrentRow();
            if (hdrRow != null && "Y".equals(hdrRow.getTransLinesCount())) {
                message =
                    "Can't change the Contract Source as Lines are already populated for the selected Reference Number";
            } else if (hdrRow != null) {
                hdrRow.setTransReferenceNo(null);
                hdrRow.setReferenceId(null);
                hdrRow.setMasterReferenceId(null);
                hdrRow.setParentReferenceId(null);
                if("External".equals(hdrRow.getContractType())){
                    hdrRow.setTransCustomerType("Customer");
                    hdrRow.setCustomerType("C");
                }else{
                    hdrRow.setTransCustomerType(null);
                    hdrRow.setCustomerType(null);
                }
                hdrRow.setTransProject(null);
                hdrRow.setProjectId(null);
                hdrRow.setTransDepartment(null);
                hdrRow.setDepartmentCode(null);
                hdrRow.setDepartmentName(null);
                hdrRow.setDeptFlexValueId(null);
                hdrRow.setDeptFlexValueSetId(null);
                hdrRow.setDivFlexValSetId(null);
                hdrRow.setDivFlexValueId(null);
                hdrRow.setTransCustomer(null);
                hdrRow.setTransCustomerSite(null);
                hdrRow.setCustomerId(null);
                hdrRow.setCustSiteId(null);
                hdrRow.setSiteUseId(null);
            }
        } catch (Exception e) {
            e.printStackTrace();
            message = e.getMessage();
        }
        return message;
    }

    public String contractCustomerTypeChange() {
        String message = "Success";
        try {
            RentalContractVORowImpl hdrRow = (RentalContractVORowImpl) getRentalContractVO1().getCurrentRow();
            if (hdrRow != null) {
                hdrRow.setTransProject(null);
                hdrRow.setProjectId(null);
                hdrRow.setTransDepartment(null);
                hdrRow.setDepartmentCode(null);
                hdrRow.setDepartmentName(null);
                hdrRow.setDeptFlexValueId(null);
                hdrRow.setDeptFlexValueSetId(null);
                hdrRow.setDivFlexValSetId(null);
                hdrRow.setDivFlexValueId(null);
                hdrRow.setTransCustomer(null);
                hdrRow.setTransCustomerSite(null);
                hdrRow.setCustomerId(null);
                hdrRow.setCustSiteId(null);
                hdrRow.setSiteUseId(null);
                hdrRow.setTaxRateCode(null);
                if("P".equals(hdrRow.getCustomerType()))
                            {
                                hdrRow.setTaxRateCode("AE_OUT_OF_SCOPE");
                            }
                            else if("C".equals(hdrRow.getCustomerType()))
                            {
                                   hdrRow.setTaxRateCode("AE_STD");
                            }
            }
        } catch (Exception e) {
            e.printStackTrace();
            message = e.getMessage();
        }
        return message;
    }

    public String getContractRefLines() {
        String message = "Success";
        try {
            RentalContractVORowImpl hdrRow = (RentalContractVORowImpl) getRentalContractVO1().getCurrentRow();
            
            /*Added by Manikanta on 25-01-2022*/
            if(hdrRow.getContractType()==null || hdrRow.getSrcBuId()==null || hdrRow.getContractSource()==null || hdrRow.getReferenceId()==null || hdrRow.getValidFrom()==null || hdrRow.getCustomerType()==null)
            {
                return "Please provide mandatory values in the Header.";
            }
            else if("D".equalsIgnoreCase( hdrRow.getCustomerType()))
            {
                if(hdrRow.getDepartmentCode()==null)
                {
                    return "Please provide mandatory values in the Header.";
                }
            }
            else if("DV".equalsIgnoreCase(hdrRow.getCustomerType()))
            {
                if(hdrRow.getDivFlexValueId()==null)
                {
                    return "Please provide mandatory values in the Header.";
                }
            }
            else if("P".equalsIgnoreCase(hdrRow.getCustomerType()))
            {
                if(hdrRow.getProjectId()==null)
                {
                    return "Please provide mandatory values in the Header.";
                }
            }
            /*Till here*/
            
            if (hdrRow != null) {
                getContractLinesPopulateVO1().setNamedWhereClauseParam("p_reference_id", hdrRow.getReferenceId());
                getContractLinesPopulateVO1().setNamedWhereClauseParam("p_contract_source", hdrRow.getContractSource());
                getContractLinesPopulateVO1().setNamedWhereClauseParam("p_contract_id", hdrRow.getContractId());
                getContractLinesPopulateVO1().executeQuery();
            }
        } catch (Exception e) {
            message = e.getMessage();
            e.printStackTrace();
        }
        return message;
    }

    public String addContractHireInfo() {
        String message = "Success";
        try {
            RentalContractVOImpl contractVO = getRentalContractVO1();
            RentalContractVORowImpl hdrRow = (RentalContractVORowImpl) contractVO.getCurrentRow();
            oracle.jbo.domain.Number seq = new oracle.jbo.domain.Number(0);
            if (hdrRow != null) {
                RentalContractLinesVOImpl linesVO = getRentalContractLinesVO1();
                RentalContractLinesVORowImpl newRow = (RentalContractLinesVORowImpl) linesVO.createRow();
                linesVO.insertRow(newRow);
                newRow.setMasterContractId(hdrRow.getMasterContractId());
                newRow.setParentContractId(hdrRow.getParentContractId());
                newRow.setTransHdrSrcBuId(hdrRow.getSrcBuId());
                newRow.setTransHdrContractSource(hdrRow.getContractSource());
                newRow.setTransHdrSrcDivFlexValId(hdrRow.getSrcDivFlexValId());
                newRow.setTransSetId(hdrRow.getTransSetId());
                newRow.setTransProjectId(hdrRow.getProjectId());
                newRow.setTaxRateCode(hdrRow.getTaxRateCode());
                newRow.setTaxRateId(hdrRow.getTaxRateId());
                

                getRentalContractLineNumVO1().setNamedWhereClauseParam("p_contract_id", hdrRow.getContractId());
                getRentalContractLineNumVO1().setNamedWhereClauseParam("p_contract_line_id", newRow.getContractLineId());
                getRentalContractLineNumVO1().setApplyViewCriteriaName("RentalContractLineNumVOCriteria");
                getRentalContractLineNumVO1().executeQuery();

                RentalContractLineNumVORowImpl maxRow =
                    (RentalContractLineNumVORowImpl) getRentalContractLineNumVO1().first();
                if (maxRow != null) {
                    seq = new oracle.jbo.domain.Number(maxRow.getLineNum());
                }
                newRow.setLineNum(new oracle.jbo.domain.Number(seq.add(new oracle.jbo.domain.Number(1))));
            }
        } catch (Exception e) {
            e.printStackTrace();
            message = e.getMessage();
        }
        return message;
    }

    public String deleteContractHireInfo() {
        String message = "Success";
        try {
            RentalContractLinesVORowImpl currRow = (RentalContractLinesVORowImpl) getRentalContractLinesVO1().getCurrentRow();
            if(currRow != null){
                getContractChargesForCategoryVO1().setNamedWhereClauseParam("p_category_id", currRow.getCategoryId());
                getContractChargesForCategoryVO1().setNamedWhereClauseParam("p_contract_id", currRow.getContractId());
                getContractChargesForCategoryVO1().setApplyViewCriteriaName("ContractChargesForCategoryVOCriteria");
                getContractChargesForCategoryVO1().executeQuery();
                
                RowSetIterator rs = getContractChargesForCategoryVO1().createRowSetIterator(null);
                while(rs.hasNext()){
                    ContractChargesForCategoryVORowImpl r = (ContractChargesForCategoryVORowImpl) rs.next();
                    r.remove();
                }                                
                currRow.remove();
            }
        }catch (Exception e) {
            e.printStackTrace();
            message = e.getMessage();
        }
        return message;
    }
    
    public String addContractCharge() {
        String message = "Success";
        try {
            RentalContractVOImpl contractVO = getRentalContractVO1();
            RentalContractVORowImpl hdrRow = (RentalContractVORowImpl) contractVO.getCurrentRow();
            if (hdrRow != null) {
                RentalContractChargesVOImpl chargeVO = getRentalContractChargesVO1();
                RentalContractChargesVORowImpl newRow = (RentalContractChargesVORowImpl) chargeVO.createRow();
                chargeVO.insertRow(newRow);
                newRow.setMasterContractId(hdrRow.getMasterContractId());
                newRow.setParentContractId(hdrRow.getParentContractId());
                newRow.setContractId(hdrRow.getContractId());
                newRow.setTaxRateCode(hdrRow.getTaxRateCode());
                newRow.setTaxRateId(hdrRow.getTaxRateId());
            }
        } catch (Exception e) {
            e.printStackTrace();
            message = e.getMessage();
        }
        return message;
    }

    public String deleteContractCharge() {
        String message = "Success";
        try {
            RentalContractChargesVORowImpl currRow = (RentalContractChargesVORowImpl) getRentalContractChargesVO1().getCurrentRow();
            if(currRow != null){
                currRow.remove();
            }
        }catch (Exception e) {
            e.printStackTrace();
            message = e.getMessage();
        }
        return message;
    }
    
    public String addContractClause() {
        String message = "Success";
        try {
            RentalContractVOImpl contractVO = getRentalContractVO1();
            RentalContractVORowImpl hdrRow = (RentalContractVORowImpl) contractVO.getCurrentRow();
            if (hdrRow != null) {
                RentalContractClauseVOImpl clauseVO = getRentalContractClauseVO1();
                RentalContractClauseVORowImpl newRow = (RentalContractClauseVORowImpl) clauseVO.createRow();
                clauseVO.insertRow(newRow);
                newRow.setMasterContractId(hdrRow.getMasterContractId());
                newRow.setParentContractId(hdrRow.getParentContractId());
            }
        } catch (Exception e) {
            e.printStackTrace();
            message = e.getMessage();
        }
        return message;
    }

    public String deleteContractClause() {
        String message = "Success";
        try {
            RentalContractClauseVORowImpl currRow = (RentalContractClauseVORowImpl) getRentalContractClauseVO1().getCurrentRow();
            if(currRow != null){
                currRow.remove();
            }
        }catch (Exception e) {
            e.printStackTrace();
            message = e.getMessage();
        }
        return message;
    }

    public String contractHiringBasisChange() {
        String message = "Success";
        try {
            RentalContractLinesVORowImpl linesRow = (RentalContractLinesVORowImpl) getRentalContractLinesVO1().getCurrentRow();
            if (linesRow != null && linesRow.getCategoryId() != null && linesRow.getHiringBasisRuleId() != null &&
                linesRow.getOperatorOption() != null && linesRow.getFuelOption() != null) {
                getRentalMasterRatesVO1().setNamedWhereClauseParam("p_bu_id", linesRow.getTransHdrSrcBuId());
                getRentalMasterRatesVO1()
                    .setNamedWhereClauseParam("p_src_div_flex_val_id", linesRow.getTransHdrSrcDivFlexValId());
                getRentalMasterRatesVO1().setNamedWhereClauseParam("p_asset_category_id", linesRow.getCategoryId());
                getRentalMasterRatesVO1().setNamedWhereClauseParam("p_hiring_rule_id", linesRow.getHiringBasisRuleId());
                getRentalMasterRatesVO1().setNamedWhereClauseParam("p_operator_option", linesRow.getOperatorOption());
                getRentalMasterRatesVO1().setNamedWhereClauseParam("p_fuel_option", linesRow.getFuelOption());
                getRentalMasterRatesVO1().executeQuery();

                RentalMasterRatesVORowImpl ratesRow = (RentalMasterRatesVORowImpl) getRentalMasterRatesVO1().first();
                if (ratesRow != null) {
                    linesRow.setUnitRate(ratesRow.getUnitRate());
                    linesRow.setStandardRate(ratesRow.getStandardRate());
                    linesRow.setOt1Rate(ratesRow.getOt1Rate());
                    linesRow.setOt2Rate(ratesRow.getOt2Rate());
                }else{
                    linesRow.setUnitRate(null);
                    linesRow.setStandardRate(null);
                    linesRow.setOt1Rate(null);
                    linesRow.setOt2Rate(null);
                }
                linesRow.setMinChargeUnit(null);
                linesRow.setTransMinChargeUnit(null);
            }
        } catch (Exception e) {
            e.printStackTrace();
            message = e.getMessage();
        }
        return message;
    }
    
    public String contractUnitRateChange(){
        String message = "Success";
        try {
            RentalContractLinesVORowImpl currRow =
                (RentalContractLinesVORowImpl) getRentalContractLinesVO1().getCurrentRow();
            if(currRow != null && currRow.getTransNoofDays() != null && currRow.getUnitRate() != null && currRow.getTransStandardHours() != null){
                oracle.jbo.domain.Number noOfDays = new oracle.jbo.domain.Number(currRow.getTransNoofDays());
                oracle.jbo.domain.Number unitRate = new oracle.jbo.domain.Number(currRow.getUnitRate());
                oracle.jbo.domain.Number stdHours = new oracle.jbo.domain.Number(currRow.getTransStandardHours());
                
                if(stdHours.compareTo(0) > 0){
                    currRow.setStandardRate(new oracle.jbo.domain.Number(unitRate.divide(noOfDays.multiply(stdHours))));
                }
            }
        }catch (Exception e) {
            e.printStackTrace();
            message = e.getMessage();
        }
        return message;
    }
    
    public String contractRentalTypeChange() {
        String message = "Success";
        int n = 0;
        try {
            RentalContractLinesVOImpl linesVO = getRentalContractLinesVO1();
            RentalContractLinesVORowImpl currRow = (RentalContractLinesVORowImpl) linesVO.getCurrentRow();
            if (currRow != null && currRow.getRentalType() != null) {
                currRow.setCategoryId(null);
                currRow.setTransCategory(null);
                currRow.setMobilizationRequired(null);
                currRow.setTransCategoryDescription(null);
                currRow.setOnHireDate(null);
                currRow.setOffHireDate(null);
            }
        } catch (Exception e) {
            e.printStackTrace();
            message = e.getMessage();
        }
        return message;
    }
    
    public String contractOnHireChange(){
        String message = "Success";
        int n = 0;
        try {
            RentalContractLinesVOImpl linesVO = getRentalContractLinesVO1();
            RentalContractLinesVORowImpl currRow = (RentalContractLinesVORowImpl) linesVO.getCurrentRow();
            if (currRow != null && currRow.getRentalType() != null && currRow.getCategoryId() != null &&
                currRow.getOnHireDate() != null) {
                getRentalContractLinesValidateVO1().setApplyViewCriteriaName(null);
                getRentalContractLinesValidateVO1().executeQuery();

                getRentalContractLinesValidateVO1().setNamedWhereClauseParam("p_contract_id", currRow.getContractId());
                getRentalContractLinesValidateVO1().setNamedWhereClauseParam("p_contract_line_id", currRow.getContractLineId());
                getRentalContractLinesValidateVO1().setNamedWhereClauseParam("p_rental_type", currRow.getRentalType());
                getRentalContractLinesValidateVO1().setNamedWhereClauseParam("p_category_id", currRow.getCategoryId());
                getRentalContractLinesValidateVO1().setApplyViewCriteriaName("RentalContractLinesValidateVOCriteria");
                getRentalContractLinesValidateVO1().executeQuery();

                RowSetIterator rs = getRentalContractLinesValidateVO1().createRowSetIterator(null);
                while (rs.hasNext()) {
                    RentalContractLinesValidateVORowImpl currFilRow = (RentalContractLinesValidateVORowImpl) rs.next();
                    if (currFilRow.getOnHireDate().compareTo(currRow.getOnHireDate()) > 0) {
                        if (currRow.getOffHireDate() == null) {
                            n = 1;
                            break;

                        } else if (currFilRow.getOnHireDate().compareTo(currRow.getOffHireDate()) <= 0) {
                            n = 1;
                            break;
                        }
                    } else if (currFilRow.getOnHireDate().compareTo(currRow.getOnHireDate()) < 0) {
                        if (currFilRow.getOffHireDate() == null) {
                            n = 1;
                            break;
                        } else if (currRow.getOnHireDate().compareTo(currFilRow.getOffHireDate()) <= 0) {
                            n = 1;
                            break;
                        }
                    } else {
                        n = 1;
                        break;
                    }
                }
                if (n > 0) {
                    message =
                        "Category " + currRow.getTransCategory() + " of Rental Type " +
                        currRow.getTransRentalType() + " is already contracted for the given dates";
                    currRow.setCategoryId(null);
                    currRow.setTransCategory(null);
                    currRow.setMobilizationRequired(null);
                    currRow.setTransMobilizationRequired(null);
                    currRow.setTransCategoryDescription(null);
                    currRow.setOnHireDate(null);
                    currRow.setOffHireDate(null);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            message = e.getMessage();
        }
        return message;
    }
    
    public String validateContractLines(){
        String message = "Success";
        int n =0;
        try {
            RentalContractVORowImpl hdrRow = (RentalContractVORowImpl) getRentalContractVO1().getCurrentRow();
            if(hdrRow != null){
                RowSetIterator rs = getRentalContractLinesVO1().createRowSetIterator(null);
                while(rs.hasNext()){
                    RentalContractLinesVORowImpl currRow = (RentalContractLinesVORowImpl) rs.next();
                    if (currRow != null && currRow.getRentalType() != null && currRow.getCategoryId() != null &&
                            currRow.getOnHireDate() != null) {
                        n = 0;
                        getRentalContractLinesValidateVO1().setApplyViewCriteriaName(null);
                        getRentalContractLinesValidateVO1().executeQuery();

                        getRentalContractLinesValidateVO1().setNamedWhereClauseParam("p_contract_id", currRow.getContractId());
                        getRentalContractLinesValidateVO1().setNamedWhereClauseParam("p_contract_line_id", currRow.getContractLineId());
                        getRentalContractLinesValidateVO1().setNamedWhereClauseParam("p_rental_type", currRow.getRentalType());
                        getRentalContractLinesValidateVO1().setNamedWhereClauseParam("p_category_id", currRow.getCategoryId());
                        getRentalContractLinesValidateVO1().setApplyViewCriteriaName("RentalContractLinesValidateVOCriteria");
                        getRentalContractLinesValidateVO1().executeQuery();

                        RowSetIterator filteredRows = getRentalContractLinesValidateVO1().createRowSetIterator(null);
                        while (filteredRows.hasNext()) {
                            RentalContractLinesValidateVORowImpl currFilRow = (RentalContractLinesValidateVORowImpl) filteredRows.next();
                            if (currFilRow.getOnHireDate().compareTo(currRow.getOnHireDate()) > 0) {
                                if (currRow.getOffHireDate() == null) {
                                    n = 1;

                                } else if (currFilRow.getOnHireDate().compareTo(currRow.getOffHireDate()) <= 0) {
                                    n = 1;
                                }
                            } else if (currFilRow.getOnHireDate().compareTo(currRow.getOnHireDate()) < 0) {
                                if (currFilRow.getOffHireDate() == null) {
                                    n = 1;
                                } else if (currRow.getOnHireDate().compareTo(currFilRow.getOffHireDate()) <= 0) {
                                    n = 1;
                                }
                            } else {
                                n = 1;
                            }
                        }
                        if (n > 0) {
                            message = ("Success".equals(message) ? " " : message + "_") +
                                "Category " + currRow.getTransCategory() + " of Rental Type " +
                                currRow.getTransRentalType() + " is already contracted for the given dates";
                        }
                    }
                }
            }
        }catch (Exception e) {
            e.printStackTrace();
            message = e.getMessage();
        }
        return message;
    }
    
    public String submitContract(){
        String message = "Success";
        PreparedStatement ps = null;
        try {
            RentalContractVORowImpl currRow = (RentalContractVORowImpl) getRentalContractVO1().getCurrentRow();
            if(currRow != null && ("D".equals(currRow.getContractStatus()) || "W".equals(currRow.getContractStatus()) ||
                 "R".equals(currRow.getContractStatus()))) {
                currRow.setContractStatus("A");
                currRow.setTransContractStatus("Approved");

                oracle.jbo.domain.Date currDate = (Date) Date.getCurrentDate();
                currRow.setApprovedDate(currDate);
                currRow.setActiveFlag("Y");
                currRow.setSubmittedBy((String) ADFContext.getCurrent()
                                                          .getSessionScope()
                                                          .get("UserName"));
                currRow.setSubmittedDate(currDate);
                if (currRow.getRevisionNumber().compareTo(0) > 0) {
                    ps =
                        this.getDBTransaction()
                        .createPreparedStatement("update xxads_rental_contract_t set active_flag = 'N' where contract_id = ? and contract_id <> parent_contract_id",
                                                 1);
                    ps.setLong(1, currRow.getParentContractId().longValue());
                    ps.executeUpdate();
                }
                this.getDBTransaction().commit();
            }
        }catch (Exception e) {
            e.printStackTrace();
            message = e.getMessage();
        }
        return message;
    }
    
    public String cancelContract() {
        String message = "Success";
        try {
            RentalContractVORowImpl currRow = (RentalContractVORowImpl) getRentalContractVO1().getCurrentRow();
            if (currRow != null && !"P".equals(currRow.getContractStatus())) {
                /*Need to check whether there are any active deployments for this quotation(TODO)*/
                currRow.setContractStatus("C");
                currRow.setTransContractStatus("Closed");
                currRow.setActiveFlag("N");
            }
        } catch (Exception e) {
            e.printStackTrace();
            message = e.getMessage();
        }
        return message;
    }
    
    public String reviseContract() {
        String message = "Success";
        CallableStatement cs = null;
        try {
            RentalContractVORowImpl hdrRow = (RentalContractVORowImpl) getRentalContractVO1().getCurrentRow();
            oracle.jbo.domain.Number hdrId = hdrRow.getContractId();
            if (hdrRow != null) {
                /*Need to check whether there are any active deployments for this quotation (TODO)*/

                cs = getDBTransaction().createCallableStatement(REVISE_RENTAL_CONTRACT, 0);
                cs.setLong("p_contract_id", hdrRow.getContractId().longValue());
                cs.setString("p_reason", (String) ADFContext.getCurrent()
                                                            .getPageFlowScope()
                                                            .get("REVISION_REMARKS"));
                cs.setString("p_user", ((Map) ADFContext.getCurrent()
                                                        .getSessionScope()
                                                        .get("userMap")).get("UserName").toString());
                cs.registerOutParameter("p_message", Types.VARCHAR);
                cs.execute();

                message = cs.getString("p_message");
                if ("Success".equals(message)) {

                    getRentalContractParentHdrVO1().setNamedWhereClauseParam("p_contract_id", hdrId);
                    getRentalContractParentHdrVO1().executeQuery();

                    RentalContractParentHdrVORowImpl row =
                        (RentalContractParentHdrVORowImpl) getRentalContractParentHdrVO1().first();
                    if (row != null) {
                        getRentalContractVO1().setNamedWhereClauseParam("p_contract_id", row.getContractId());
                        getRentalContractVO1().executeQuery();
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            message = e.getMessage();
        } finally {
            if (cs != null) {
                try {
                    cs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return message;
    }
    
    public String withdrawContract(){
        String message = "Success";
        try {
            RentalContractVORowImpl hdrRow = (RentalContractVORowImpl) getRentalContractVO1().getCurrentRow();
            if(hdrRow != null && "P".equals(hdrRow.getContractStatus())){
                hdrRow.setContractStatus("D");
                hdrRow.setTransContractStatus("Draft");
                hdrRow.setSubmittedBy(null);
                hdrRow.setSubmittedDate(null);
            }
        }catch (Exception e) {
            e.printStackTrace();
            message = e.getMessage();
        }
        return message;
    }
    
    public String addContractAttachment() {
        String message = "Success";
        try {
            AttachmentsVOImpl attachVO = getAttachmentsVO3();
            AttachmentsVORowImpl newRow = (AttachmentsVORowImpl) attachVO.createRow();
            attachVO.insertRow(newRow);
            newRow.setAttachmentCode("XXADS_RENTAL_CONTRACT_T");
            newRow.setCategory("Misc");
            newRow.setTransCategory("Miscellaneous");
        } catch (Exception e) {
            e.printStackTrace();
            message = e.getMessage();
        }
        return message;
    }
    
    public String uploadRentalContractAttach() {
        String message = "Success";
        try {
            ADFContext adfCtx = ADFContext.getCurrent();
            Map pageFlowScope = adfCtx.getPageFlowScope();
            int ch = -1;

            AttachmentsVOImpl attachmentVO = getAttachmentsVO3();
            AttachmentsVORowImpl currRow = (AttachmentsVORowImpl) attachmentVO.getCurrentRow();
            InputStream in = (InputStream) pageFlowScope.get("contractUploadedFileStream");
            ByteArrayOutputStream bout = new ByteArrayOutputStream();
            new ByteArrayOutputStream();
            try {
                while ((ch = in.read()) != -1) {
                    bout.write(ch);
                }
                in.close();
                bout.close();

                currRow.setAttachmentFile(new BlobDomain(bout.toByteArray()));
            } catch (Exception e) {
                //                System.out.println(e.getMessage());
                return "ERROR";
            }

            String fileName = (String) pageFlowScope.get("contractFileName");
            currRow.setFileName(fileName);
            currRow.setFileType((String) pageFlowScope.get("contractFileType"));
        } catch (Exception e) {
            e.printStackTrace();
            message = e.getMessage();
        }
        return message;
    }
    
    public String contractChargeBillingChange(){
        String message = "Success";
        try {
            RentalContractChargesVORowImpl currRow =
                (RentalContractChargesVORowImpl) getRentalContractChargesVO1().getCurrentRow();
            if (currRow != null) {
                getContractChargesValidateVO1().setApplyViewCriteriaName(null);
                getContractChargesValidateVO1().executeQuery();

                getContractChargesValidateVO1().setNamedWhereClauseParam("p_charge_id", currRow.getContractChargeId());
                getContractChargesValidateVO1().setNamedWhereClauseParam("p_contract_id", currRow.getContractId());
                getContractChargesValidateVO1().setNamedWhereClauseParam("p_category_id", currRow.getAssetCategoryId());
                getContractChargesValidateVO1().setNamedWhereClauseParam("p_charge_type", currRow.getChargeType());
                getContractChargesValidateVO1().setNamedWhereClauseParam("p_billing", currRow.getBilling());
                getContractChargesValidateVO1().setApplyViewCriteriaName("ContractChargesValidateVOCriteria");
                getContractChargesValidateVO1().executeQuery();

                if (getContractChargesValidateVO1().getRowCount() > 0) {
                    message =
                        "Additional Charges are already defined for Category " + currRow.getTransCategory() +
                        ", Charge Type " + currRow.getTransChargeType() + " and Billing " + currRow.getTransBilling();
                    currRow.setTransBilling(null);
                    currRow.setBilling(null);
                    currRow.setQuantity(null);
                    currRow.setUnitAmount(null);
                    currRow.setAmount(null);
                }
            }
        }catch (Exception e) {
            e.printStackTrace();
            message = e.getMessage();
        }
        return message;
    }
    
    public String contractClauseChange(){
        String message = "Success";
        try {
            RentalContractClauseVORowImpl currRow =
                (RentalContractClauseVORowImpl) getRentalContractClauseVO1().getCurrentRow();
            if (currRow != null) {
                getContractClauseValidateVO1().setApplyViewCriteriaName(null);
                getContractClauseValidateVO1().executeQuery();

                getContractClauseValidateVO1().setNamedWhereClauseParam("p_clause_id", currRow.getClauseId());
                getContractClauseValidateVO1().setNamedWhereClauseParam("p_contract_id", currRow.getContractId());
                getContractClauseValidateVO1().setNamedWhereClauseParam("p_clause", currRow.getClause());
                getContractClauseValidateVO1().setApplyViewCriteriaName("ContractClauseValidateVOCriteria");
                getContractClauseValidateVO1().executeQuery();

                if (getContractClauseValidateVO1().getRowCount() > 0) {
                    message =
                        "Clause " + currRow.getTransClause() +
                        " is already defined";
                    currRow.setTransClause(null);
                    currRow.setClause(null);
                }
            }
        }catch (Exception e) {
            e.printStackTrace();
            message = e.getMessage();
        }
        return message;
    }
    
    public String createTransRentalContractSearch(){
        String message = "Success";
        try {
            getTransRentalContractSearchVO1().executeQuery();
            TransRentalContractSearchVORowImpl searchRow =
                (TransRentalContractSearchVORowImpl) getTransRentalContractSearchVO1().getCurrentRow();
            if(searchRow != null){
                searchRow.remove();
            }
            searchRow = (TransRentalContractSearchVORowImpl) getTransRentalContractSearchVO1().createRow();
            getTransRentalContractSearchVO1().insertRow(searchRow);
        }catch (Exception e) {
            e.printStackTrace();
            message = e.getMessage();
        }
        return message;
    }
    
    public String selectAllLinesContract(){
        String message = "Success";
        try {
            ContractLinesPopulateVOImpl popVO = getContractLinesPopulateVO1();
            RowSetIterator rs = popVO.createRowSetIterator(null);
            while(rs.hasNext()){
                ContractLinesPopulateVORowImpl currRow = (ContractLinesPopulateVORowImpl) rs.next();
                if(currRow != null){
                    currRow.setTransFlag((String) ADFContext.getCurrent()
                                                            .getPageFlowScope()
                                                            .get("markAs"));
                }
            }
        }catch (Exception e) {
            e.printStackTrace();
            message = e.getMessage();
        }
        return message;
    }
    
    public String populateContractLines(){
        String message = "Success";
        try {
            ContractLinesPopulateVOImpl popVO = getContractLinesPopulateVO1();
            RowSetIterator rs = popVO.createRowSetIterator(null);
            RentalContractVORowImpl hdrRow = (RentalContractVORowImpl) getRentalContractVO1().getCurrentRow();
            while(rs.hasNext()){
                ContractLinesPopulateVORowImpl currRow = (ContractLinesPopulateVORowImpl) rs.next();
                if(currRow != null && "Y".equals(currRow.getTransFlag())){
                    RentalContractLinesVORowImpl newRow =
                        (RentalContractLinesVORowImpl) getRentalContractLinesVO1().createRow();
                    getRentalContractLinesVO1().insertRow(newRow);
                    newRow.setLineNum(currRow.getRefLineNum());
                    newRow.setReferenceLineNum(currRow.getRefLineNum());
                    newRow.setReferenceLineId(currRow.getRefLineId());
                    newRow.setMasterContractId(hdrRow.getMasterContractId());
                    newRow.setParentContractId(hdrRow.getParentContractId());
                    newRow.setTransRentalType(currRow.getTransLineType());
                    newRow.setRentalType(currRow.getLineType());
                    newRow.setTransCategory(currRow.getCategoryName());
                    newRow.setTransCategoryDescription(currRow.getCategoryDescription());
                    newRow.setCategoryDescription(currRow.getCategoryDescription());
                    newRow.setCategoryId(currRow.getCategoryId());
                    newRow.setQuantity(currRow.getQuantity());
                    newRow.setTransHiringBasis(currRow.getHiringBasis());
                    newRow.setTransFixedVariable(currRow.getTransFixedVariable());
                    newRow.setHiringBasisRuleId(currRow.getHiringBasisRuleId());
                    newRow.setTransNoofDays(currRow.getNoOfDays());
                    newRow.setTransStandardHours(currRow.getNoOfHours());
                    newRow.setTransOperatorOption(currRow.getTransOperatorOption());
                    newRow.setOperatorOption(currRow.getOperatorOption());
                    newRow.setTransFuelOption(currRow.getTransFuelOption());
                    newRow.setFuelOption(currRow.getFuelOption());
                    newRow.setTransMobilizationRequired(currRow.getTransMobilizationRequired());
                    newRow.setMobilizationRequired(currRow.getMobilizationRequired());
                    newRow.setTransShift(currRow.getTransShift());
                    newRow.setShift(currRow.getShift());
                    newRow.setOnHireDate(currRow.getOnHireDate());
                    newRow.setOffHireDate(currRow.getOffHireDate());
                    newRow.setUnitRate(currRow.getUnitRate());
                    newRow.setStandardRate(currRow.getStandardRate());
                    newRow.setOt1Rate(currRow.getOt1Rate());
                    newRow.setOt2Rate(currRow.getOt2Rate());
                    newRow.setTransMinChargeUnit(currRow.getTransMinChargeUnit());
                    newRow.setMinChargeUnit(currRow.getMinChargeUnit());
                    newRow.setMinChargeValue(currRow.getMinChargeValue());
                    newRow.setReferenceId(currRow.getHeaderId());                
                    newRow.setMasterRefLineId(currRow.getRefLineMasterId());
                    newRow.setTaskId(currRow.getTaskId());
                    newRow.setTransTask(currRow.getTaskName());
                    newRow.setExpenditureTypeId(currRow.getExpenditureTypeId());
                    newRow.setTransExpenditureDesc(currRow.getExpenditureTypeDesc());
                    
                    newRow.setTransSetId(hdrRow.getTransSetId());
                    //Insert into charges
                    if("Q".equals(currRow.getLineSource())){
                        getContractChargesPopulateVO1().setNamedWhereClauseParam("p_category_id", currRow.getCategoryId());
                        getContractChargesPopulateVO1().setNamedWhereClauseParam("p_quotation_id", currRow.getHeaderId());
                        getContractChargesPopulateVO1().executeQuery();
                        
                        RowSetIterator chargesRs = getContractChargesPopulateVO1().createRowSetIterator(null);
                        while(chargesRs.hasNext()){
                            ContractChargesPopulateVORowImpl currChargeRow =
                                (ContractChargesPopulateVORowImpl) chargesRs.next();
                            if(currChargeRow != null){
                                //Check whether there is charge already for the given asset category
                                getContractChargesValidateVO1().setNamedWhereClauseParam("p_contract_id", newRow.getContractId());
                                getContractChargesValidateVO1().setNamedWhereClauseParam("p_charge_id", new oracle.jbo.domain.Number(0));
                                getContractChargesValidateVO1().setNamedWhereClauseParam("p_category_id", newRow.getCategoryId());
                                getContractChargesValidateVO1().setNamedWhereClauseParam("p_charge_type", currChargeRow.getChargeType());
                                getContractChargesValidateVO1().setNamedWhereClauseParam("p_billing", currChargeRow.getBilling());
                                getContractChargesValidateVO1().setApplyViewCriteriaName("ContractChargesValidateVOCriteria");
                                getContractChargesValidateVO1().executeQuery();
                                
                                if(getContractChargesValidateVO1().getRowCount() == 0){
                                    RentalContractChargesVORowImpl newChargeRow =
                                        (RentalContractChargesVORowImpl) getRentalContractChargesVO1().createRow();
                                    getRentalContractChargesVO1().insertRow(newChargeRow);
                                    
                                    newChargeRow.setTransCategory(currChargeRow.getTransAssetCategory());
                                    newChargeRow.setTransCategoryDescription(currChargeRow.getTransAssetCategoryDesc());
                                    newChargeRow.setCategoryDescription(currChargeRow.getTransAssetCategoryDesc());
                                    newChargeRow.setAssetCategoryId(currChargeRow.getAssetCategoryId());
                                    newChargeRow.setTransChargeType(currChargeRow.getTransChargeType());
                                    newChargeRow.setChargeType(currChargeRow.getChargeType());
                                    newChargeRow.setTransBilling(currChargeRow.getTransBilling());
                                    newChargeRow.setAmount(currChargeRow.getAmount());
                                    newChargeRow.setMasterRefChargeId(currChargeRow.getMasterQuoteChargeId());
                                    newChargeRow.setReferenceChargeId(currChargeRow.getQuoteChargeId());
                                    newChargeRow.setParentRefChargeId(currChargeRow.getParentQuoteChargeId());
                                }                                
                            }
                        }
                    }
                }
            }
        }catch (Exception e) {
            e.printStackTrace();
            message = e.getMessage();
        }
        return message;
    }
    
    public Boolean makeAsRCCurrentRow(oracle.jbo.domain.Number HeaderId) {
        Boolean isSetted = false;

        getRentalContractVO1().setNamedWhereClauseParam("p_contract_id", HeaderId);
        getRentalContractVO1().executeQuery();

        if (getRentalContractVO1().first() != null) {
            RentalContractVORowImpl custRow = (RentalContractVORowImpl) getRentalContractVO1().getCurrentRow();
            if (HeaderId.longValue() == custRow.getContractId().longValue()) {
                isSetted = true;
            }
        }
        return isSetted;
    }
    
    public String callpkgForAMERCProcessSubmit() {
        CommonAMImpl commonAM = (CommonAMImpl) getCommonAM1();
        String msg = "";
        try {
            RentalContractVORowImpl hdrRow = (RentalContractVORowImpl) getRentalContractVO1().getCurrentRow();
            CommonAMImpl commAM = (CommonAMImpl) getCommonAM1();
            if (hdrRow != null) {
                oracle.jbo.domain.Number hdrId = hdrRow.getContractId();
                Map paramsMap = new HashMap();
                paramsMap.put("docId", new oracle.jbo.domain.Number(hdrRow.getContractId()));
                paramsMap.put("docTypeId", new oracle.jbo.domain.Number(55));
                paramsMap.put("ActionCode", "Submit");
                paramsMap.put("currEmpId", commAM.getCurrentEmployeeId() != null ? commAM.getCurrentEmployeeId() : -1);
                paramsMap.put("remarks", "");
                paramsMap.put("docNum", hdrRow.getContractNumber());
                msg = commonAM.callAMEProcess(paramsMap);
                if ("Submitted".equals(msg)) {
                    submitRCDocFor("In Process");
                    msg = "SUCCESS";
                }else if ("Finally Approved".equals(msg)) { //FYI approval only
                    submitRCDocFor("Approved");
                } else if ("SUCCESS".equals(msg)) {
                    submitRCDocFor("Approved");
                }
                
                getRentalContractVO1().setNamedWhereClauseParam("p_contract_id", hdrId);
                getRentalContractVO1().executeQuery();
                
                if(getRentalContractVO1().hasNext()){
                    getRentalContractVO1().next();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return msg;

    }
    
    public void submitRCDocFor(String toDocStatus) {
        try {
            if (getRentalContractVO1().getCurrentRow() != null) {
                RentalContractVORowImpl hdrRow = (RentalContractVORowImpl) getRentalContractVO1().getCurrentRow();
                if ("In Process".equals(toDocStatus)) {
                    hdrRow.setContractStatus("P");
                    hdrRow.setTransContractStatus(toDocStatus);
                } else if ("Approved".equals(toDocStatus)) {
                    hdrRow.setContractStatus("A");
                    hdrRow.setTransContractStatus(toDocStatus);
                }
                getDBTransaction().commit();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public String withdrawRCFromApproval(String remarks) {
        String message = null;
        try {
            if (getRentalContractVO1().getCurrentRow() != null) {
                RentalContractVORowImpl hdrRow = (RentalContractVORowImpl) getRentalContractVO1().getCurrentRow();
                CommonAMImpl commAM = (CommonAMImpl) getCommonAM1();
                CallableStatement st = getDBTransaction().createCallableStatement(WITHDRAW_APPRL_SUBMISSION, 0);
                st.setLong("p_document_type_id", 55);
                st.setLong("p_document_id", hdrRow.getContractId().longValue());
                st.setString("p_remarks", remarks);
                st.setLong("p_user",
                           commAM.getCurrentEmployeeId() != null ? commAM.getCurrentEmployeeId().longValue() : -1);
                st.setString("p_message", null);
                st.registerOutParameter("p_message", Types.VARCHAR);
                st.execute();
                message = st.getString("p_message");
                if ("Success".equals(message)) {
                    RentalContractVORowImpl curRow = (RentalContractVORowImpl) getRentalContractVO1().getCurrentRow();
    //                    curRow.setQuoteStatus("W");
                    curRow.setContractStatus("D");
                    curRow.setTransContractStatus("Draft");
                    this.getDBTransaction().commit();

                }
                getRentalContractVO1().executeQuery();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return message;
    }

    public void setActionHistoryForRCDocument() {
           try {
               RentalContractVORowImpl currRow = (RentalContractVORowImpl) getRentalContractVO1().getCurrentRow();

               ActionHistoryVOImpl approvalHIstVo = getActionHistoryVO1();
               approvalHIstVo.applyViewCriteria(null);
               approvalHIstVo.setNamedWhereClauseParam("p_doc_id", currRow.getContractId());
               approvalHIstVo.setNamedWhereClauseParam("p_doc_type_id", 55);
               approvalHIstVo.setApplyViewCriteriaName("ActionHistoryVOCriteria");
               approvalHIstVo.setRangeSize(-1);
               approvalHIstVo.executeQuery();
           } 
           catch (Exception e) {
                e.printStackTrace();
           }
        }
    
    public void setContractTermsConditions() 
    {
        try 
        {
            RentalContractVORowImpl contractRow =
                (RentalContractVORowImpl) getRentalContractVO1().getCurrentRow();
            TransTemplateVORowImpl transRow = (TransTemplateVORowImpl) getTransTemplateVO1().getCurrentRow();
            if(transRow != null && transRow.getTransActiveTemplateName() != null) 
            {
                contractRow.setTermsConditions(transRow.getTransAciveTemplateInfo());
            }
        }
        catch(Exception e) 
        {            
            e.printStackTrace();
        }
    }

    public byte[] generateContractPrintReport() {
        byte[] dataBytes = null;
        try {
            RentalContractVORowImpl hdrRow = (RentalContractVORowImpl) getRentalContractVO1().getCurrentRow();
            try {
                if (hdrRow != null) {
                    RentalContractPrintHdrVOImpl printVO = getRentalContractPrintHdrVO1();
                    printVO.setNamedWhereClauseParam("p_contract_id", hdrRow.getContractId());
                    printVO.executeQuery();
                    /*File file = new File("D:\\lavanya.nuthi\\ADS\\RentalContract.xml");
                    FileOutputStream fop = new FileOutputStream(file);
                    ByteArrayOutputStream opStream =new ByteArrayOutputStream(); 
                    ((XMLNode)printVO.writeXML(-1,XMLInterface.XML_OPT_ALL_ROWS)).print(opStream); 
                    opStream.writeTo(fop); 
                    opStream.close();*/
                    ByteArrayOutputStream opStream = new ByteArrayOutputStream();
                    XMLNode node=(XMLNode) printVO.writeXML(-1, XMLInterface.XML_OPT_ALL_ROWS);
                    node.print(opStream);
                    ExternalReportCustom extReptServ = new ExternalReportCustom();
                    dataBytes = extReptServ.generateReportData("/Custom/PAAS/ADS/Rental Contract Print Report.xdo", "docx", opStream);
                    
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dataBytes;
    }
    
    public String createReceipt(){
        String message = "Success";
        oracle.jbo.domain.Number maxNum = new oracle.jbo.domain.Number(0);
        oracle.jbo.domain.Number seq = null;
        try {
            getDeploymentReceiptHdrVO1().executeQuery();
            DeploymentReceiptHdrVORowImpl currRow = (DeploymentReceiptHdrVORowImpl) getDeploymentReceiptHdrVO1().createRow();
            getDeploymentReceiptHdrVO1().insertRow(currRow);
            currRow.setDrStatus("D");                            
            currRow.setTransDrStatus("Draft");
            currRow.setDocumentDate(currRow.getCreationDate());
            
            String userName=(String) ((Map)ADFContext.getCurrent().getSessionScope().get("userMap")).get("UserName");
            currRow.setPreparedBy(userName);
        }catch (Exception e) {
            e.printStackTrace();
            message = e.getMessage();
        }
        return message;
    }
    
    public String generateReceiptNumber(){
        String message = "Success";
        oracle.jbo.domain.Number maxNum = new oracle.jbo.domain.Number(0);
        oracle.jbo.domain.Number seq = null;
        try {
            DeploymentReceiptHdrVORowImpl currRow = (DeploymentReceiptHdrVORowImpl) getDeploymentReceiptHdrVO1().getCurrentRow();
            if(currRow != null && currRow.getDrNumber() == null){
                getMaxDeploymentReceiptNumVO1().setNamedWhereClauseParam("p_bu_id", currRow.getSrcBuId());
                getMaxDeploymentReceiptNumVO1().setNamedWhereClauseParam("p_div_flex_val_id", currRow.getSrcDivFlexValueId());
                getMaxDeploymentReceiptNumVO1().executeQuery();
                MaxDeploymentReceiptNumVORowImpl maxRow = (MaxDeploymentReceiptNumVORowImpl) getMaxDeploymentReceiptNumVO1().first();
                if (maxRow != null) {
                    maxNum = maxRow.getSeqNum();
                }
                seq = updateDocSequenceNumber("ADR",currRow.getSrcBuId(), currRow.getSrcDivFlexValueId(), maxNum);
                if(seq == null){
                    return "Please define Document Sequence and then continue";
                }
                String divCode = getSequenceCode("ADR",currRow.getSrcBuId(), currRow.getSrcDivFlexValueId());
                if(seq != null && divCode == null)
                {
                    currRow.setDrNumber("ADR-"+seq);
                }else if(seq != null && divCode != null){
                    
                    currRow.setDrNumber(divCode+"-ADR-"+seq);
                }
            }
        }catch (Exception e) {
            e.printStackTrace();
            message = e.getMessage();
        }
        return message;
    }
    
    public String editReceipt(){
        String message = "Success";
        try {
            ReceiptSearchVORowImpl searchRow =
                (ReceiptSearchVORowImpl) getReceiptSearchVO1().getCurrentRow();
            if(searchRow != null){
                getAccessTypeVO1().setNamedWhereClauseParam("p_customer_type", searchRow.getCustomerType());
                
                if("P".equals(searchRow.getCustomerType())){
                    getAccessTypeVO1().setNamedWhereClauseParam("p_value_id", searchRow.getProjectId());
                }else if("C".equals(searchRow.getCustomerType())){
                    getAccessTypeVO1().setNamedWhereClauseParam("p_value_id", searchRow.getCustomerId());
                }else if("D".equals(searchRow.getCustomerType())){
                    getAccessTypeVO1().setNamedWhereClauseParam("p_value_id", searchRow.getDeptFlexValueId());
                }else if("DV".equals(searchRow.getCustomerType())){
                    getAccessTypeVO1().setNamedWhereClauseParam("p_value_id", searchRow.getDivFlexValueId());
                }
                getAccessTypeVO1().setNamedWhereClauseParam("p_src_bu_id", searchRow.getSrcBuId());
                getAccessTypeVO1().setNamedWhereClauseParam("p_req_bu_id", searchRow.getReqBuId());
                getAccessTypeVO1().setNamedWhereClauseParam("p_src_div_flex_val_id", searchRow.getSrcDivFlexValueId());
                
                getAccessTypeVO1().executeQuery();
                
                AccessTypeVORowImpl row = (AccessTypeVORowImpl) getAccessTypeVO1().first();
                
                if(row != null && "F".equals(row.getAccessType())){
                    ADFContext.getCurrent().getPageFlowScope().put("drEditFlag", "Y");
                }else{
                    ADFContext.getCurrent().getPageFlowScope().put("drEditFlag", "N");
                }
                
                getDeploymentReceiptHdrVO1().setNamedWhereClauseParam("p_receipt_id", searchRow.getDrId());
                getDeploymentReceiptHdrVO1().executeQuery();
            }
        }catch (Exception e) {
            e.printStackTrace();
            message = e.getMessage();
        }
        return message;
    }
    
    public String checkForContractLines() 
    {
        String message = "Success";
        try 
        {
            if(getRentalContractLinesVO1().getRowCount()  == 0) 
            {
                return "Please add lines to submit the current Contract. ";
            }
        }
        catch(Exception e) 
        {
            message = e.getMessage();
            e.printStackTrace();
        }
        return message;
    }
    
    
    
    /*------------------------------------------------------------Timesheet page-----------------------------------------------------*/
    
    public String createTransTsSearch(){
        String message = "Success";
        try {
            getTransDailyTimesheetSearchVO1().executeQuery();
            TransDailyTimesheetSearchVORowImpl searchRow =
                (TransDailyTimesheetSearchVORowImpl) getTransDailyTimesheetSearchVO1().getCurrentRow();
            if(searchRow != null){
                searchRow.remove();
            }
            searchRow = (TransDailyTimesheetSearchVORowImpl) getTransDailyTimesheetSearchVO1().createRow();
            getTransDailyTimesheetSearchVO1().insertRow(searchRow);
            
        }catch (Exception e) {
            e.printStackTrace();
            message = e.getMessage();
        }
        return message;
    }
    
    public String searchTimesheets(){
        String message = "Success";
        try {
            TransDailyTimesheetSearchVORowImpl searchRow =
                (TransDailyTimesheetSearchVORowImpl) getTransDailyTimesheetSearchVO1().getCurrentRow();
            if(searchRow != null){
                getTimesheetSearchVO1().setNamedWhereClauseParam("p_src_bu_id", searchRow.getTransSrcBuId());   
                getTimesheetSearchVO1().setNamedWhereClauseParam("p_src_div_flex_value_id", searchRow.getTransSrcDivFlexValId());
                getTimesheetSearchVO1().setNamedWhereClauseParam("p_req_bu_id", searchRow.getTransReqBuId());
                getTimesheetSearchVO1().setNamedWhereClauseParam("p_master_contract_id", searchRow.getTransContractId());
                getTimesheetSearchVO1().setNamedWhereClauseParam("p_customer_type", searchRow.getTransCustomerTypeCode());
                getTimesheetSearchVO1().setNamedWhereClauseParam("p_project_id", searchRow.getTransProjectId());
                getTimesheetSearchVO1().setNamedWhereClauseParam("p_div_flex_val_id", searchRow.getTransDivFlexValId());   
                getTimesheetSearchVO1().setNamedWhereClauseParam("p_dept_flex_val_id", searchRow.getTransDeptFlexValId());
                getTimesheetSearchVO1().setNamedWhereClauseParam("p_customer_id", searchRow.getTransCustomerId());
                getTimesheetSearchVO1().setNamedWhereClauseParam("p_period", searchRow.getTransPeriod());

                getTimesheetSearchVO1().executeQuery();
            }       
        }catch (Exception e) {
            e.printStackTrace();
            message = e.getMessage();
        }
        return message;
    }
    
    public String resetTimesheets(){
        String message = "Success";
        try {
            TransDailyTimesheetSearchVORowImpl searchRow =
                (TransDailyTimesheetSearchVORowImpl) getTransDailyTimesheetSearchVO1().getCurrentRow();
            if(searchRow != null){
                searchRow.remove();
            }
            searchRow = (TransDailyTimesheetSearchVORowImpl) getTransDailyTimesheetSearchVO1().createRow();
            getTransDailyTimesheetSearchVO1().insertRow(searchRow);            
            
            getTimesheetSearchVO1().setNamedWhereClauseParam("p_src_bu_id", null);   
            getTimesheetSearchVO1().setNamedWhereClauseParam("p_src_div_flex_value_id", null);
            getTimesheetSearchVO1().setNamedWhereClauseParam("p_req_bu_id", null);
            getTimesheetSearchVO1().setNamedWhereClauseParam("p_master_contract_id", null);
            getTimesheetSearchVO1().setNamedWhereClauseParam("p_customer_type", null);
            getTimesheetSearchVO1().setNamedWhereClauseParam("p_project_id", null);
            getTimesheetSearchVO1().setNamedWhereClauseParam("p_div_flex_val_id", null);   
            getTimesheetSearchVO1().setNamedWhereClauseParam("p_dept_flex_val_id", null);
            getTimesheetSearchVO1().setNamedWhereClauseParam("p_customer_id", null);
            getTimesheetSearchVO1().setNamedWhereClauseParam("p_period", null);

            getTimesheetSearchVO1().executeQuery();
            
        }catch (Exception e) {
            e.printStackTrace();
            message = e.getMessage();
        }
        return message;
    }
    
    public String setTimesheetSearch(){
        String message = "Success";
        try {
            getTransDailyTimesheetSearchVO1().executeQuery();
            TransDailyTimesheetSearchVORowImpl searchRow =
                (TransDailyTimesheetSearchVORowImpl) getTransDailyTimesheetSearchVO1().getCurrentRow();
                                
            if(searchRow != null){
                searchRow.remove();
            }
            searchRow = (TransDailyTimesheetSearchVORowImpl) getTransDailyTimesheetSearchVO1().createRow();
            getTransDailyTimesheetSearchVO1().insertRow(searchRow);
            
            Map pf = ADFContext.getCurrent().getPageFlowScope();
            
            searchRow.setTransSrcBu((String) pf.get("tsSrcBu"));
            searchRow.setTransSrcBuId((oracle.jbo.domain.Number) pf.get("tsSrcBuId"));
            searchRow.setTransSrcDivRequired((String) pf.get("tsSrcDivRequired"));
            searchRow.setTransSrcDivSegmentNum((oracle.jbo.domain.Number) pf.get("tsSrcDivSegmentNum"));
            searchRow.setTransSrcDeptSegmentNum((oracle.jbo.domain.Number) pf.get("tsSrcDeptSegmentNum"));
            searchRow.setTransSrcDivision((String) pf.get("tsSrcDivision"));
            searchRow.setTransSrcDivFlexValId((oracle.jbo.domain.Number) pf.get("tsSrcDivFlexValId"));
            searchRow.setTransReqBu((String) pf.get("tsReqBu"));
            searchRow.setTransReqBuId((oracle.jbo.domain.Number) pf.get("tsReqBuId"));
            searchRow.setTransContractNo((String) pf.get("tsContractNo"));
            searchRow.setTransContractId((oracle.jbo.domain.Number) pf.get("tsContractId"));
            searchRow.setTransCustomerType((String) pf.get("tsCustomerType"));
            searchRow.setTransCustomerTypeCode((String) pf.get("tsCustomerTypeCode"));
            searchRow.setTransProject((String) pf.get("tsProject"));
            searchRow.setTransProjectId((oracle.jbo.domain.Number) pf.get("tsProjectId"));
            searchRow.setTransDivision((String) pf.get("tsDivision"));
            searchRow.setTransDivFlexValId((oracle.jbo.domain.Number) pf.get("tsDivFlexValId"));
            searchRow.setTransDeptName((String) pf.get("tsDepartment"));
            searchRow.setTransDeptFlexValId((oracle.jbo.domain.Number) pf.get("tsDeptFlexValId"));
            searchRow.setTransCustomerName((String) pf.get("tsCustomerName"));
            searchRow.setTransCustomerId((oracle.jbo.domain.Number) pf.get("tsCustomerId"));
            searchRow.setTransReqDivSegmentNum((oracle.jbo.domain.Number) pf.get("tsReqDeptSegmentNum"));
            searchRow.setTransReqDeptSegmentNum((oracle.jbo.domain.Number) pf.get("tsReqDivSegmentNum"));
            searchRow.setTransPeriod((String) pf.get("tsPeriod"));
//            searchRow.setTransPeriodStartDate((Date) pf.get("tsPeriodStartDate"));
//            searchRow.setTransPeriodEndDate((Date) pf.get("tsPeriodEndDate"));
            
            getTimesheetSearchVO1().setNamedWhereClauseParam("p_src_bu_id", searchRow.getTransSrcBuId());   
            getTimesheetSearchVO1().setNamedWhereClauseParam("p_src_div_flex_value_id", searchRow.getTransSrcDivFlexValId());
            getTimesheetSearchVO1().setNamedWhereClauseParam("p_req_bu_id", searchRow.getTransReqBuId());
            getTimesheetSearchVO1().setNamedWhereClauseParam("p_master_contract_id", searchRow.getTransContractId());
            getTimesheetSearchVO1().setNamedWhereClauseParam("p_customer_type", searchRow.getTransCustomerTypeCode());
            getTimesheetSearchVO1().setNamedWhereClauseParam("p_project_id", searchRow.getTransProjectId());
            getTimesheetSearchVO1().setNamedWhereClauseParam("p_div_flex_val_id", searchRow.getTransDivFlexValId());   
            getTimesheetSearchVO1().setNamedWhereClauseParam("p_dept_flex_val_id", searchRow.getTransDeptFlexValId());
            getTimesheetSearchVO1().setNamedWhereClauseParam("p_customer_id", searchRow.getTransCustomerId());
            getTimesheetSearchVO1().setNamedWhereClauseParam("p_period", searchRow.getTransPeriod());

            getTimesheetSearchVO1().executeQuery();
        }catch (Exception e) {
            e.printStackTrace();
            message = e.getMessage();
        }
        return message;
    }
    
    public String createDailyTimesheet(){
        String message = "Success";
        try {
            oracle.jbo.domain.Number reqNum = null;
            oracle.jbo.domain.Number seq = null;
            TimesheetHeaderVORowImpl hdrRow = (TimesheetHeaderVORowImpl) getTimesheetHeaderVO1().createRow();
            getTimesheetHeaderVO1().insertRow(hdrRow);
            
            hdrRow.setTimesheetStatus("D");
            hdrRow.setTransTimesheetStatus("Draft");                        
            
        }catch (Exception e) {
            message = e.getMessage();
            e.printStackTrace();
        }
        return message;
    }
    
    public String generateSiteTsNumber(){
        String message = "Success";
        oracle.jbo.domain.Number reqNum = null;
        oracle.jbo.domain.Number seq = null;
        try {
            TimesheetHeaderVORowImpl currRow = (TimesheetHeaderVORowImpl) getTimesheetHeaderVO1().getCurrentRow();
            if(currRow != null && currRow.getTimesheetNumber() == null){
                getMaxTimesheetNumVO1().setNamedWhereClauseParam("p_bu_id", currRow.getSrcBuId());
                getMaxTimesheetNumVO1().setNamedWhereClauseParam("p_div_flex_val_id", currRow.getSrcDivFlexValueId());
                getMaxTimesheetNumVO1().executeQuery();
                MaxTimesheetNumVORowImpl maxRow = (MaxTimesheetNumVORowImpl) getMaxTimesheetNumVO1().first();
                if (maxRow != null) {
                    reqNum = maxRow.getSeqNum();
                }

                seq = updateDocSequenceNumber("DTS",currRow.getSrcBuId(), currRow.getSrcDivFlexValueId(), reqNum);
                if(seq == null){
                    return "Please define Document Sequence and then continue";
                }
                String divCode = getSequenceCode("DTS",currRow.getSrcBuId(), currRow.getSrcDivFlexValueId());
                if(seq != null && divCode == null)
                {
                    currRow.setTimesheetNumber("DTS-"+seq);
                }else if(seq != null && divCode != null){
                    
                    currRow.setTimesheetNumber(divCode+"-DTS-"+seq);
                }
            }
        }catch (Exception e) {
            e.printStackTrace();
            message = e.getMessage();
        }
        return message;
    }
    
    public String editDailyTimesheet(){
        String message = "Success";
        try {
            TimesheetSearchVORowImpl searchRow = (TimesheetSearchVORowImpl) getTimesheetSearchVO1().getCurrentRow();
            if(searchRow != null){
                getAccessTypeVO1().setNamedWhereClauseParam("p_customer_type", searchRow.getCustomerType());
                
                if("P".equals(searchRow.getCustomerType())){
                    getAccessTypeVO1().setNamedWhereClauseParam("p_value_id", searchRow.getProjectId());
                }else if("C".equals(searchRow.getCustomerType())){
                    getAccessTypeVO1().setNamedWhereClauseParam("p_value_id", searchRow.getCustomerId());
                }else if("D".equals(searchRow.getCustomerType())){
                    getAccessTypeVO1().setNamedWhereClauseParam("p_value_id", searchRow.getDeptFlexValueId());
                }else if("DV".equals(searchRow.getCustomerType())){
                    getAccessTypeVO1().setNamedWhereClauseParam("p_value_id", searchRow.getDivFlexValueId());
                }
                getAccessTypeVO1().setNamedWhereClauseParam("p_src_bu_id", searchRow.getSrcBuId());
                getAccessTypeVO1().setNamedWhereClauseParam("p_req_bu_id", searchRow.getReqBuId());
                getAccessTypeVO1().setNamedWhereClauseParam("p_src_div_flex_val_id", searchRow.getSrcDivFlexValueId());
                
                getAccessTypeVO1().executeQuery();
                
                AccessTypeVORowImpl row = (AccessTypeVORowImpl) getAccessTypeVO1().first();
                
                if(row != null && "F".equals(row.getAccessType())){
                    ADFContext.getCurrent().getPageFlowScope().put("siteTsEditFlag", "Y");
                }else{
                    ADFContext.getCurrent().getPageFlowScope().put("siteTsEditFlag", "N");
                }
                
                getTimesheetHeaderVO1().setNamedWhereClauseParam("p_ts_header_id", new oracle.jbo.domain.Number(ADFContext.getCurrent().getPageFlowScope().get("TsHeaderId").toString()));
                getTimesheetHeaderVO1().executeQuery();
            }
        }catch (Exception e) {
            message = e.getMessage();
            e.printStackTrace();
        }
        return message;        
    }
    
    public String confirmTimesheet(){
        String message = "Success";
        try {
            TimesheetHeaderVORowImpl currRow = (TimesheetHeaderVORowImpl) getTimesheetHeaderVO1().getCurrentRow();
            
            if(getTimesheetLinesVO1().getRowCount() == 0){
                return "Please add Timesheet Lines to continue confirming the Timesheet";
            }
            
            //Check whether the previous day timesheets are cofirmed or not
            getTsConfirmCheckVO1().setNamedWhereClauseParam("p_contract_id", currRow.getContractId());
            getTsConfirmCheckVO1().setNamedWhereClauseParam("p_ts_date", currRow.getTimesheetDate());
            getTsConfirmCheckVO1().executeQuery();
            
            TsConfirmCheckVORowImpl checkRow = (TsConfirmCheckVORowImpl) getTsConfirmCheckVO1().first();
            
            if(checkRow != null && checkRow.getTsCount().compareTo(0) == 0){
                return "Confirm the previous day timesheet to proceed.";
            }
            
            if(currRow != null && "D".equals(currRow.getTimesheetStatus())){
                currRow.setTimesheetStatus("C");
                currRow.setTransTimesheetStatus("Confirmed");
            }
        }catch (Exception e) {
            e.printStackTrace();
            message = e.getMessage();
        }
        return message;
    }
       
    public String confirmBulkTS(){
        String message = "Success";
        try{
            TimesheetSearchVOImpl hdrVO = getTimesheetSearchVO1();
            ADFContext adfCtx = ADFContext.getCurrent();
            Map pageFlowScope = adfCtx.getPageFlowScope();
            
            SequenceImpl seq = new SequenceImpl("xxads_timesheet_batch_s",this.getDBTransaction());
            Number seqNum = seq.getSequenceNumber();
            
            ADFContext.getCurrent().getPageFlowScope().put("timesheet_batch_id_variable", seqNum);
            
            List rows = (List)pageFlowScope.get("confirmHdrs");
            for(int i=0;i<rows.size();i++){
                Key k = new Key(new Object[] { rows.get(i) });
                TimesheetSearchVORowImpl hdrRow = (TimesheetSearchVORowImpl)hdrVO.getRow(k);
                hdrRow.setBatchId(seqNum);
            }
            this.getDBTransaction().commit();
            message = callConfirmPrc(seqNum);
            getTimesheetSearchVO1().executeQuery();
        }catch(Exception e){
            e.printStackTrace();
            message = e.getMessage();
        }
        return message;
    }
    
    public String callConfirmPrc(oracle.jbo.domain.Number seqNum){
        String message = "Success";
        CallableStatement cs = null;
        try {
            cs = this.getDBTransaction().createCallableStatement(CONFIRM_TIMESHEETS, 0);
            cs.setLong("p_batch_id", seqNum.longValue());
            cs.setString("p_user", (String)((Map)ADFContext.getCurrent().getSessionScope().get("userMap")).get("UserName"));
            cs.registerOutParameter("p_message", Types.VARCHAR);
            cs.execute();
            message = cs.getString("p_message");
        }catch (Exception e) {
            message = e.getMessage();
            e.printStackTrace();
        }
        return message;
    }
    
    public String createTimesheetLine(){
        String message = "Success";
        try {
            TimesheetHeaderVORowImpl hdrRow = (TimesheetHeaderVORowImpl) getTimesheetHeaderVO1().getCurrentRow();
            if(hdrRow != null){
                TimesheetLinesVORowImpl currRow = (TimesheetLinesVORowImpl) getTimesheetLinesVO1().createRow();
                getTimesheetLinesVO1().insertRow(currRow);
                currRow.setTransContractId(hdrRow.getMasterContractId());
            }
        }catch (Exception e) {
            e.printStackTrace();
            message = e.getMessage();
        }
        return message;
    }
    
    public String siteTsDateChange(){
        String message = "Success";
        try {
            TimesheetLinesVORowImpl currRow = (TimesheetLinesVORowImpl) getTimesheetLinesVO1().getCurrentRow();
            System.out.println(currRow.getTransContractId());
            if(currRow != null){
                currRow.setStartTime(null);
                currRow.setEndTime(null);
                currRow.setTotalHours(null);
                currRow.setStandardHours(null);
                currRow.setOt1Hours(null);
                currRow.setOt2Hours(null);
                currRow.setTransAssetNumber(null);
                currRow.setAssetId(null);
                currRow.setTransEmployeeNumber(null);
                currRow.setEmployeeId(null);
                currRow.setContractLineId(null);
                currRow.setMasterContractLineId(null);
                currRow.setAllocationDetailId(null);
                currRow.setAllocationLineId(null);
                currRow.setDoLineId(null);
                currRow.setRentalType(null);
                currRow.setSlipNumber(null);
            }
        }catch (Exception e) {
            message = e.getMessage();
            e.printStackTrace();
        }
        return message;
    }
    
    public String siteAssetChange(){
        String message = "Success";
        try {
            TimesheetLinesVORowImpl currRow = (TimesheetLinesVORowImpl) getTimesheetLinesVO1().getCurrentRow();
            if(currRow != null){
                currRow.setTransEmployeeNumber(null);
                currRow.setEmployeeId(null);
                currRow.setStartTime(null);
                currRow.setEndTime(null);
                currRow.setTotalHours(null);
                currRow.setStandardHours(null);
                currRow.setOt1Hours(null);
                currRow.setOt2Hours(null);
            }
        }catch (Exception e) {
            message = e.getMessage();
            e.printStackTrace();
        }
        return message;
    }
    
    public String siteSlipNumberChange(){
        String message = "Success";
        try {
            TimesheetLinesVORowImpl currRow = (TimesheetLinesVORowImpl) getTimesheetLinesVO1().getCurrentRow();
            if(currRow != null && currRow.getSlipNumber()!= null && currRow.getTimesheetDate() != null){
                
                SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
                
                String temp= sdf.format(currRow.getTimesheetDate().dateValue());
                java.util.Date utilTsDate = sdf.parse(temp);
                
                java.sql.Date sqlDate = new java.sql.Date(utilTsDate.getTime());
                oracle.jbo.domain.Date jboDate = new oracle.jbo.domain.Date(sqlDate);
                
                getTsSlipNumberValidateVO1().setNamedWhereClauseParam("p_slip_number", currRow.getSlipNumber());
                getTsSlipNumberValidateVO1().setNamedWhereClauseParam("p_ts_date", jboDate);
                getTsSlipNumberValidateVO1().setNamedWhereClauseParam("p_ts_line_id", currRow.getTsLineId());
                getTsSlipNumberValidateVO1().setApplyViewCriteriaName("TsSlipNumberValidateVOCriteria");
                getTsSlipNumberValidateVO1().executeQuery();
                
                if(getTsSlipNumberValidateVO1().getRowCount() > 0){
                    message = "Slip Number "+currRow.getSlipNumber()+" is already active for the another Transaction Date";
                    currRow.setSlipNumber(null);
                }
                getTsSlipNumberValidateVO1().setApplyViewCriteriaName(null);
                getTsSlipNumberValidateVO1().executeQuery();
            }
        }catch (Exception e) {
            e.printStackTrace();
            message = e.getMessage();
        }
        return message;
    }
    
    public String siteStartTimeChange(){
        String message = "Success";
        try {
            TimesheetLinesVORowImpl currRow = (TimesheetLinesVORowImpl) getTimesheetLinesVO1().getCurrentRow();
            if(currRow != null){
                currRow.setEndTime(null);
                currRow.setTotalHours(null);
                currRow.setStandardHours(null);
                currRow.setOt1Hours(null);
                currRow.setOt2Hours(null);
                
                try {
                    SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
                    String temp= sdf.format(currRow.getStartTime().dateValue());
                    java.util.Date t1 = sdf.parse(temp);
                    String temp2= sdf.format(currRow.getTimesheetDate().dateValue());
                    java.util.Date hdrDate = sdf.parse(temp2);
                    if(hdrDate.compareTo(t1) != 0){
                        currRow.setStartTime(null);
                        message = "Start Time should be only on Transaction Date of the corresponding line.";
                        return message;
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    System.out.println(e.getMessage());
                }
                
                if("OH".equals(currRow.getTransactionType()) && currRow.getStartTime() != null && currRow.getAssetId() != null && currRow.getEmployeeId() != null){
                    
                    getTimesheetLinesValidateVO1().setNamedWhereClauseParam("p_employee_id", currRow.getEmployeeId());
                    getTimesheetLinesValidateVO1().setNamedWhereClauseParam("p_ts_date", currRow.getTimesheetDate());
                    getTimesheetLinesValidateVO1().setNamedWhereClauseParam("p_ts_line_id", currRow.getTsLineId());
                    getTimesheetLinesValidateVO1().setApplyViewCriteriaName("TimesheetLinesValidateOperatorCriteria");                    
                    getTimesheetLinesValidateVO1().executeQuery();
                    
                    RowSetIterator rs = getTimesheetLinesValidateVO1().createRowSetIterator(null);
                    while(rs.hasNext()){
                        TimesheetLinesValidateVORowImpl exRow = (TimesheetLinesValidateVORowImpl) rs.next();
                        if(exRow != null && exRow.getStartTime() != null && exRow.getEndTime() != null){
                            //If given start time overlaps with the existing record timings
                            if(currRow.getStartTime().compareTo(exRow.getStartTime()) > 0
                               && currRow.getStartTime().compareTo(exRow.getEndTime()) < 0){
                                currRow.setStartTime(null);
                                return "Given Start Time overlaps with the existing record. Please check.";
                            }
                        }
                    }
                    getTimesheetLinesValidateVO1().setApplyViewCriteriaName(null);                    
                    getTimesheetLinesValidateVO1().executeQuery();
                    
                }else if(currRow.getStartTime() != null && currRow.getAssetId() != null){
                    getTimesheetLinesValidateVO1().setNamedWhereClauseParam("p_asset_id", currRow.getAssetId());
                    getTimesheetLinesValidateVO1().setNamedWhereClauseParam("p_ts_date", currRow.getTimesheetDate());
                    getTimesheetLinesValidateVO1().setNamedWhereClauseParam("p_ts_line_id", currRow.getTsLineId());
                    getTimesheetLinesValidateVO1().setApplyViewCriteriaName("TimesheetLinesValidateAssetCriteria");                    
                    getTimesheetLinesValidateVO1().executeQuery();
                    
                    RowSetIterator rs = getTimesheetLinesValidateVO1().createRowSetIterator(null);
                    while(rs.hasNext()){
                        TimesheetLinesValidateVORowImpl exRow = (TimesheetLinesValidateVORowImpl) rs.next();
                        if(exRow != null && exRow.getStartTime() != null && exRow.getEndTime() != null){
                            //If given start time overlaps with the existing record timings
                            if(currRow.getStartTime().compareTo(exRow.getStartTime()) > 0
                               && currRow.getStartTime().compareTo(exRow.getEndTime()) < 0){
                                currRow.setStartTime(null);
                                return "Given Start Time overlaps with the existing record. Please check.";
                            }
                        }
                    }
                    getTimesheetLinesValidateVO1().setApplyViewCriteriaName(null);                    
                    getTimesheetLinesValidateVO1().executeQuery();
                }
            }
        }catch (Exception e) {
            message = e.getMessage();
            e.printStackTrace();
        }
        return message;
    }
    
    //method to get the weekoffs and specialworkingdays
    
    public int getWeekOffs(oracle.jbo.domain.Number buId,Date timeSheetDate)
    {
        try {
           int weekoffflag=0;
           int spclwrkingdayflag=0;
            
           getgetDayFromDateVO1().setNamedWhereClauseParam("p_date",timeSheetDate);
           getgetDayFromDateVO1().executeQuery();
           getDayFromDateVORowImpl hrRow = (getDayFromDateVORowImpl) getgetDayFromDateVO1().first();
           String day=hrRow.getDay();
           getWeekOffDaysVO1().setNamedWhereClauseParam("p_bu_id",buId);
           getWeekOffDaysVO1().setApplyViewCriteriaName("WeekOffDaysVOCriteria");                    
           getWeekOffDaysVO1().executeQuery();
           RowSetIterator rs =getWeekOffDaysVO1().createRowSetIterator(null);
           while(rs.hasNext()){
               WeekOffDaysVORowImpl weekoffrow = (WeekOffDaysVORowImpl) rs.next();
               if(day.equals(weekoffrow.getWeekOffDay()) && "Y".equals(weekoffrow.getWeekOffFlag()))
               {
                   weekoffflag=1;
                }else
               {
                   weekoffflag=0;
                   }
               }
           getSpecialWorkingDaysVO1().setNamedWhereClauseParam("p_bu_id",buId );
           getSpecialWorkingDaysVO1().setApplyViewCriteriaName("SpecialWorkingDaysVOCriteria");                    
           getSpecialWorkingDaysVO1().executeQuery();
           RowSetIterator rs1 = getSpecialWorkingDaysVO1().createRowSetIterator(null);
           while(rs.hasNext()){
               SpecialWorkingDaysVORowImpl exRow = (SpecialWorkingDaysVORowImpl) rs.next();
               
                if(exRow.getSpEffectiveStartDate().compareTo(timeSheetDate) * timeSheetDate.compareTo(exRow.getSpEffectiveEndDate())>0)
                {
                    spclwrkingdayflag=1;
                }else{
                    spclwrkingdayflag=0;
                }
            }
            if(weekoffflag==1 || spclwrkingdayflag==1)
            {
                return 1;
            }
                
        }
        catch (Exception e) {
            // TODO: Add catch code
            e.printStackTrace();
        }
            return 0;
    }

    public String siteEndTimeChange(){
        String message = "Success";
        oracle.jbo.domain.Timestamp minStartTime = null;
        oracle.jbo.domain.Timestamp maxEndTime = null;
        oracle.jbo.domain.Number totStdrdHrs = new oracle.jbo.domain.Number(0);
        oracle.jbo.domain.Number totOt1Hrs = new oracle.jbo.domain.Number(0);
        oracle.jbo.domain.Number totOt2Hrs = new oracle.jbo.domain.Number(0);
        try {
            TimesheetHeaderVORowImpl hdrrow=(TimesheetHeaderVORowImpl)getTimesheetHeaderVO1().getCurrentRow();
            TimesheetLinesVORowImpl currRow = (TimesheetLinesVORowImpl) getTimesheetLinesVO1().getCurrentRow();
            if(currRow != null){
                currRow.setTotalHours(null);
                currRow.setStandardHours(null);
                currRow.setOt1Hours(null);
                currRow.setOt2Hours(null);
                
                if(currRow.getStartTime() != null && currRow.getEndTime() != null){
                    //Check whether Start Time is greater than End Time or not
                    if(currRow.getStartTime().compareTo(currRow.getEndTime()) > 0){
                        currRow.setEndTime(null);
                        return "Given End Time should be less than Start Time";
                    }
                    
                    minStartTime = currRow.getStartTime();
                    maxEndTime = currRow.getEndTime();
                    
                    if("OH".equals(currRow.getTransactionType()) && currRow.getAssetId() != null && currRow.getEmployeeId() != null){
                        
                        getTimesheetLinesValidateVO1().setNamedWhereClauseParam("p_employee_id", currRow.getEmployeeId());
                        getTimesheetLinesValidateVO1().setNamedWhereClauseParam("p_ts_date", currRow.getTimesheetDate());
                        getTimesheetLinesValidateVO1().setNamedWhereClauseParam("p_ts_line_id", currRow.getTsLineId());
                        getTimesheetLinesValidateVO1().setApplyViewCriteriaName("TimesheetLinesValidateOperatorCriteria");                    
                        getTimesheetLinesValidateVO1().executeQuery();
                        
                        RowSetIterator rs = getTimesheetLinesValidateVO1().createRowSetIterator(null);
                        while(rs.hasNext()){
                            TimesheetLinesValidateVORowImpl exRow = (TimesheetLinesValidateVORowImpl) rs.next();
                            if(exRow != null && exRow.getStartTime() != null && exRow.getEndTime() != null){
                                //If given start time, end time overlaps with the existing record timings
                                if((currRow.getEndTime().compareTo(exRow.getStartTime()) > 0
                                        && currRow.getEndTime().compareTo(exRow.getEndTime()) < 0)
                                    || (currRow.getStartTime().compareTo(exRow.getStartTime()) < 0
                                        && currRow.getEndTime().compareTo(exRow.getEndTime()) > 0)){
                                    
                                    currRow.setEndTime(null);
                                    return "Given Time overlaps with the existing record. Please check.";
                                }
                                
                                //Check whether the Total Time from StartTime of the given day > 24
                                if(minStartTime.compareTo(exRow.getStartTime()) > 0){
                                    minStartTime = exRow.getStartTime();
                                }
                                if(maxEndTime.compareTo(exRow.getEndTime()) < 0){
                                    maxEndTime = exRow.getEndTime();
                                }
                                
                                if((!"BH".equals(exRow.getTransactionType()) && !"BH".equals(currRow.getTransactionType()))
                                    || ("BH".equals(exRow.getTransactionType()) && "BH".equals(currRow.getTransactionType()))
                                    ){
                                    //Get the Total Hours of the corresponding details
                                    totStdrdHrs = totStdrdHrs.add(exRow.getStandardHours());
                                    totOt1Hrs = totOt1Hrs.add(exRow.getOt1Hours());
                                    totOt2Hrs = totOt2Hrs.add(exRow.getOt2Hours());
                                }
                            }
                        }
                        
                        long totMilliSeconds = maxEndTime.getTime()-minStartTime.getTime();
                        Double totalDiff = new Double(totMilliSeconds/3600000);
                        if(totalDiff > new Double(24)){
                            currRow.setEndTime(null);
                            return "Total Time span entered should be less than or equal to 24 for Asset "+ currRow.getTransAssetNumber()+", Employee "+ currRow.getTransEmployeeNumber();
                        }
                        
                        getTimesheetLinesValidateVO1().setApplyViewCriteriaName(null);                    
                        getTimesheetLinesValidateVO1().executeQuery();
                        
                    }else if(!"OH".equals(currRow.getTransactionType()) && currRow.getAssetId() != null){
                        getTimesheetLinesValidateVO1().setNamedWhereClauseParam("p_asset_id", currRow.getAssetId());
                        getTimesheetLinesValidateVO1().setNamedWhereClauseParam("p_ts_date", currRow.getTimesheetDate());
                        getTimesheetLinesValidateVO1().setNamedWhereClauseParam("p_ts_line_id", currRow.getTsLineId());
                        getTimesheetLinesValidateVO1().setApplyViewCriteriaName("TimesheetLinesValidateAssetCriteria");                    
                        getTimesheetLinesValidateVO1().executeQuery();
                        
                        RowSetIterator rs = getTimesheetLinesValidateVO1().createRowSetIterator(null);
                        while(rs.hasNext()){
                            TimesheetLinesValidateVORowImpl exRow = (TimesheetLinesValidateVORowImpl) rs.next();
                            if(exRow != null && exRow.getStartTime() != null && exRow.getEndTime() != null){
                                //If given start time overlaps with the existing record timings
                                if((currRow.getEndTime().compareTo(exRow.getStartTime()) > 0
                                        && currRow.getEndTime().compareTo(exRow.getEndTime()) < 0)
                                    || (currRow.getStartTime().compareTo(exRow.getStartTime()) < 0
                                        && currRow.getEndTime().compareTo(exRow.getEndTime()) > 0)){
                                    
                                    currRow.setEndTime(null);
                                    return "Given Time overlaps with the existing record. Please check.";
                                }
                                
                                //Check whether the Total Time from StartTime of the given day > 24
                                if(minStartTime.compareTo(exRow.getStartTime()) > 0){
                                    minStartTime = exRow.getStartTime();
                                }
                                if(maxEndTime.compareTo(exRow.getEndTime()) < 0){
                                    maxEndTime = exRow.getEndTime();
                                }
                                
                                if((!"BH".equals(exRow.getTransactionType()) && !"BH".equals(currRow.getTransactionType()))
                                   || ("BH".equals(exRow.getTransactionType()) && "BH".equals(currRow.getTransactionType()))){
                                    //Get the Total Hours of the corresponding details
                                    totStdrdHrs = totStdrdHrs.add(exRow.getStandardHours());
                                    totOt1Hrs = totOt1Hrs.add(exRow.getOt1Hours());
                                    totOt2Hrs = totOt2Hrs.add(exRow.getOt2Hours());
                                }
                            }
                        }
                        
                        long totMilliSeconds = maxEndTime.getTime()-minStartTime.getTime();
                        Double totalDiff = new Double(new Double(totMilliSeconds)/new Double(3600000));
                        if(totalDiff > new Double(24)){
                            currRow.setEndTime(null);
                            return "Total Time span entered should be less than or equal to 24 for Asset "+currRow.getTransAssetNumber();
                        }
                        
                        getTimesheetLinesValidateVO1().setApplyViewCriteriaName(null);                    
                        getTimesheetLinesValidateVO1().executeQuery();
                    }
                    
                    //Calculate the total hours
                    long milliSeconds = currRow.getEndTime().getTime() - currRow.getStartTime().getTime();
                    long diff = milliSeconds/1000L;
                    long hrs = diff/3600L;
                    long mins = (diff%3600L)/60L;
                    
                    oracle.jbo.domain.Number totHrs = new Number(hrs+(mins/60D));
                    currRow.setTotalHours(totHrs);
                    //getWeekOffs(hdrrow.getSrcBuId(),currRow.getTimesheetDate()); 
                    getgetWeekOffsFunctionVO1().setNamedWhereClauseParam("p_bu_id",hdrrow.getSrcBuId());
                    getgetWeekOffsFunctionVO1().setNamedWhereClauseParam("p_timesheet_date",currRow.getTimesheetDate());
                    getgetWeekOffsFunctionVO1().executeQuery();
                    getWeekOffsFunctionVORowImpl WeekOffsrow=(getWeekOffsFunctionVORowImpl)getgetWeekOffsFunctionVO1().first();
                                    
                    //Get the Hours defined for the Hiring Basis
                    getHiringBasisHoursVO1().setNamedWhereClauseParam("p_contract_line_id", currRow.getContractLineId());
                    getHiringBasisHoursVO1().executeQuery();
                    
                    HiringBasisHoursVORowImpl hrRow = (HiringBasisHoursVORowImpl) getHiringBasisHoursVO1().first();
                    if(hrRow != null){
                        if("V".equals(hrRow.getFixedVariable())){                                                        
                            oracle.jbo.domain.Number remHrs = new oracle.jbo.domain.Number(0);
                            oracle.jbo.domain.Number currStandardHrs = new oracle.jbo.domain.Number(0);
                            oracle.jbo.domain.Number currOt1Hrs = new oracle.jbo.domain.Number(0);    
                            
                            if(WeekOffsrow.getWeekoff().compareTo(1)==0){
                                oracle.jbo.domain.Number currTotOt1Hrs = new oracle.jbo.domain.Number(totOt1Hrs.add(totHrs));
                                currOt1Hrs = (hrRow.getOt1Hours().compareTo(currTotOt1Hrs) > 0 ? totHrs : new oracle.jbo.domain.Number(hrRow.getOt1Hours().subtract(totOt1Hrs)));
                                currRow.setOt1Hours(currOt1Hrs);
                            }else{                            
                                if(totStdrdHrs != null && totStdrdHrs.compareTo(hrRow.getNoOfHours()) >=0){
                                    remHrs = totHrs;
                                    currStandardHrs = new oracle.jbo.domain.Number(0);
                                }else{
                                    oracle.jbo.domain.Number currTotStdrdHrs = new oracle.jbo.domain.Number(totStdrdHrs.add(totHrs));
                                    currStandardHrs = (hrRow.getNoOfHours().compareTo(currTotStdrdHrs) > 0 ? totHrs : new oracle.jbo.domain.Number(hrRow.getNoOfHours().subtract(totStdrdHrs)));
                                    remHrs = (hrRow.getNoOfHours().compareTo(currTotStdrdHrs) < 0 ? new oracle.jbo.domain.Number(currTotStdrdHrs.subtract(hrRow.getNoOfHours())) : new oracle.jbo.domain.Number(0));                                                            
                                }
                                
                                currRow.setStandardHours(currStandardHrs);
                                
                                if(totOt1Hrs != null && totOt1Hrs.compareTo(hrRow.getOt1Hours()) < 0){
                                    
                                    oracle.jbo.domain.Number currTotOt1Hrs = new oracle.jbo.domain.Number(totOt1Hrs.add(remHrs));
                                    currOt1Hrs = (hrRow.getOt1Hours().compareTo(currTotOt1Hrs) > 0 ? remHrs : new oracle.jbo.domain.Number(hrRow.getOt1Hours().subtract(totOt1Hrs)));
                                    remHrs = (hrRow.getOt1Hours().compareTo(currTotOt1Hrs) < 0 ? new oracle.jbo.domain.Number(currTotOt1Hrs.subtract(hrRow.getOt1Hours())) : new oracle.jbo.domain.Number(0));                                                            
                                }
                                
                                currRow.setOt1Hours(currOt1Hrs);
                                currRow.setOt2Hours(remHrs);
                            }
                            
                        }else if("F".equals(hrRow.getFixedVariable())){
                            if(WeekOffsrow.getWeekoff().compareTo(1)!=0){
                                if(totStdrdHrs != null && totStdrdHrs.compareTo(hrRow.getNoOfHours()) >=0){
                                    currRow.setStandardHours(new oracle.jbo.domain.Number(0));
                                }else{
                                    oracle.jbo.domain.Number currTotStdrdHrs = new oracle.jbo.domain.Number(totStdrdHrs.add(totHrs));
                                    currRow.setStandardHours(hrRow.getNoOfHours().compareTo(currTotStdrdHrs) > 0 ? totHrs : new oracle.jbo.domain.Number(hrRow.getNoOfHours().subtract(totStdrdHrs)));
                                }
                            }
                        }
                    }                    
                }
            }
        }catch (Exception e) {
            message = e.getMessage();
            e.printStackTrace();
        }
        return message;
    }
    
    public String tsContractChange(){
        String message = "Success";
        try {
            TimesheetHeaderVORowImpl hdrRow = (TimesheetHeaderVORowImpl) getTimesheetHeaderVO1().getCurrentRow();
            if(hdrRow != null){
                hdrRow.setTimesheetPeriod(null);
                ADFContext.getCurrent().getPageFlowScope().put("lnsMasterContractId", hdrRow.getMasterContractId());
            }
        }catch (Exception e) {
            e.printStackTrace();
            message = e.getMessage();
        }
        return message;
    }
    
    public String tsPeriodChange(){
        String message = "Success";
        try {
            TimesheetHeaderVORowImpl hdrRow = (TimesheetHeaderVORowImpl) getTimesheetHeaderVO1().getCurrentRow();
            if(hdrRow != null){
                getTimesheetHdrValidateVO1().setNamedWhereClauseParam("p_ts_header_id", hdrRow.getTsHeaderId());
                getTimesheetHdrValidateVO1().setNamedWhereClauseParam("p_master_contract_id", hdrRow.getMasterContractId());
                getTimesheetHdrValidateVO1().setNamedWhereClauseParam("p_ts_period", hdrRow.getTimesheetPeriod());
                getTimesheetHdrValidateVO1().setApplyViewCriteriaName("TimesheetHdrValidateVOCriteria");
                getTimesheetHdrValidateVO1().executeQuery();
                
                if(getTimesheetHdrValidateVO1().getRowCount() > 0){
                    getTimesheetHdrValidateVO1().setApplyViewCriteriaName(null);
                    getTimesheetHdrValidateVO1().executeQuery();
                    
                    message = "Timesheet document for the Contract "+hdrRow.getTransContractNumber()+" is already created for Period: "+hdrRow.getTimesheetPeriod();
                    hdrRow.setTimesheetPeriod(null);
                    return message;
                }                                                
            }
        }catch (Exception e) {
            e.printStackTrace();
            message = e.getMessage();
        }
        return message;
    }
    
    /*------------------------------------------------------------Methods end-------------------------------------------------------------------------------*/

    /*------------------------------------------------------------Asset Request-------------------------------------------------------------------------------*/

    /**
     * Container's getter for TransAssetRequestSearchVO1.
     * @return TransAssetRequestSearchVO1
     */
    public TransAssetRequestSearchVOImpl getTransAssetRequestSearchVO1() {
        return (TransAssetRequestSearchVOImpl) findViewObject("TransAssetRequestSearchVO1");
    }

    /**
     * Container's getter for AssetRequestSearchVO1.
     * @return AssetRequestSearchVO1
     */
    public AssetRequestSearchVOImpl getAssetRequestSearchVO1() {
        return (AssetRequestSearchVOImpl) findViewObject("AssetRequestSearchVO1");
    }

    public String createTransAssetRequestSearch() {
        String message = "Success";
        try {
            getTransAssetRequestSearchVO1().executeQuery();

            TransAssetRequestSearchVORowImpl transRow =
                (TransAssetRequestSearchVORowImpl) getTransAssetRequestSearchVO1().getCurrentRow();
            if (transRow != null) {
                transRow.remove();
            }
            transRow = (TransAssetRequestSearchVORowImpl) getTransAssetRequestSearchVO1().createRow();
            getTransAssetRequestSearchVO1().insertRow(transRow);
        } catch (Exception e) {
            e.printStackTrace();
            message = e.getMessage();
        }
        return message;
    }


    public String searchAssetRequests() {
        String message = "Success";
        try {
            TransAssetRequestSearchVORowImpl transRow =
                (TransAssetRequestSearchVORowImpl) getTransAssetRequestSearchVO1().getCurrentRow();
            if (transRow != null && transRow.getTransRequestType() != null) {
                if (transRow.getTransReqBuId() != null && transRow.getTransSrcBuId() != null) {
                    if (("Y".equals(transRow.getTransSrcDivRequired()) && transRow.getTransSrcDivision() != null) ||
                        !("Y".equals(transRow.getTransSrcDivRequired()))) {
                        getAssetRequestSearchVO1()
                            .setNamedWhereClauseParam("p_request_type", transRow.getTransRequestType());
                        getAssetRequestSearchVO1()
                            .setNamedWhereClauseParam("p_requestor_bu_id", transRow.getTransReqBuId());
                        getAssetRequestSearchVO1().setNamedWhereClauseParam("p_src_bu_id", transRow.getTransSrcBuId());
                        getAssetRequestSearchVO1()
                            .setNamedWhereClauseParam("p_src_div_flex_value_set_id",
                                                      transRow.getTransSrcDivFlexValueSetId());
                        getAssetRequestSearchVO1()
                            .setNamedWhereClauseParam("p_src_div_flex_value_id", transRow.getTransSrcDivFlexValueId());
                        getAssetRequestSearchVO1()
                            .setNamedWhereClauseParam("p_request_num", transRow.getTransRequestNumber());
                        getAssetRequestSearchVO1()
                            .setNamedWhereClauseParam("p_request_status", transRow.getTransRequestStatusCode());
                        getAssetRequestSearchVO1()
                            .setNamedWhereClauseParam("p_requested_from", transRow.getTransRequestDateFrom());
                        getAssetRequestSearchVO1()
                            .setNamedWhereClauseParam("p_requested_to", transRow.getTransRequestDateTo());
                        getAssetRequestSearchVO1()
                            .setNamedWhereClauseParam("p_customer_type", transRow.getTransCustomerTypeCode());
                        getAssetRequestSearchVO1()
                            .setNamedWhereClauseParam("p_project_id", transRow.getTransProjectId());
                        getAssetRequestSearchVO1()
                            .setNamedWhereClauseParam("p_div_flex_value_set_id", transRow.getTransDivFlexValueSetId());
                        getAssetRequestSearchVO1()
                            .setNamedWhereClauseParam("p_div_flex_value_id", transRow.getTransDivFlexValueId());
                        getAssetRequestSearchVO1()
                            .setNamedWhereClauseParam("p_dept_flex_value_set_id",
                                                      transRow.getTransDeptFlexValueSetId());
                        getAssetRequestSearchVO1()
                            .setNamedWhereClauseParam("p_dept_flex_value_id", transRow.getTransDeptFlexValueId());
                        getAssetRequestSearchVO1()
                            .setNamedWhereClauseParam("p_cust_account_id", transRow.getTransCustomerId());

                        getAssetRequestSearchVO1().executeQuery();
                    } else {
                        return "Division is required";
                    }
                } else {
                    return "Requestor and Source Business Units are required.";
                }
            } else {
                return "Request Type is required.";
            }
        } catch (Exception e) {
            message = e.getMessage();
            e.printStackTrace();
        }
        return message;
    }

    public String setAssetRequestSearch() {
        String message = "Success";
        try {
            getTransAssetRequestSearchVO1().executeQuery();
            TransAssetRequestSearchVORowImpl transRow =
                (TransAssetRequestSearchVORowImpl) getTransAssetRequestSearchVO1().getCurrentRow();
            if (transRow == null) {
                transRow = (TransAssetRequestSearchVORowImpl) getTransAssetRequestSearchVO1().createRow();
                getTransAssetRequestSearchVO1().insertRow(transRow);
            }

            Map pageFlowScope = ADFContext.getCurrent().getPageFlowScope();
            transRow.setTransRequestType((String) pageFlowScope.get("asrRequestType"));

            transRow.setTransReqBuName((String) pageFlowScope.get("asrReqBuName"));
            transRow.setTransReqBuId((oracle.jbo.domain.Number) pageFlowScope.get("asrReqBuId"));
            transRow.setTransDivRequired((String) pageFlowScope.get("asrDivRequired"));
            transRow.setTransDivSegment((String) pageFlowScope.get("asrDivSegment"));
            transRow.setTransDeptSegment((String) pageFlowScope.get("asrDeptSegment"));

            transRow.setTransSrcBuName((String) pageFlowScope.get("asrSrcBuName"));
            transRow.setTransSrcBuId((oracle.jbo.domain.Number) pageFlowScope.get("asrSrcBuId"));
            transRow.setTransSrcDivRequired((String) pageFlowScope.get("asrSrcDivRequired"));
            transRow.setTransSrcDivSegmentNum((oracle.jbo.domain.Number) pageFlowScope.get("asrSrcDivSegment"));
            transRow.setTransSrcDivision((String) pageFlowScope.get("asrSrcDiv"));
            transRow.setTransSrcDivFlexValueSetId((oracle.jbo.domain.Number) pageFlowScope.get("asrSrcDivFlexValueSetId"));
            transRow.setTransSrcDivFlexValueId((oracle.jbo.domain.Number) pageFlowScope.get("asrSrcDivFlexValueId"));

            transRow.setTransRequestNumber((String) pageFlowScope.get("asrReqNum"));
            transRow.setTransRequestStatus((String) pageFlowScope.get("asrReqStatus"));
            transRow.setTransRequestStatusCode((String) pageFlowScope.get("asrReqStatusCode"));
            if (pageFlowScope.get("asrReqDateFrom") != null) {
                oracle.jbo.domain.Date jboDate =
                    new oracle.jbo.domain.Date(pageFlowScope.get("asrReqDateFrom").toString());
                transRow.setTransRequestDateFrom(jboDate);
            }

            if (pageFlowScope.get("asrReqDateTo") != null) {
                oracle.jbo.domain.Date jboDate1 =
                    new oracle.jbo.domain.Date(pageFlowScope.get("asrReqDateTo").toString());
                transRow.setTransRequestDateTo(jboDate1);
            }

            transRow.setTransCustomerType((String) pageFlowScope.get("asrCustType"));
            transRow.setTransCustomerTypeCode((String) pageFlowScope.get("asrCustTypeCode"));

            transRow.setTransProject((String) pageFlowScope.get("asrProject"));
            transRow.setTransProjectId((oracle.jbo.domain.Number) pageFlowScope.get("asrProjectid"));
            transRow.setTransDivsion((String) pageFlowScope.get("asrDiv"));
            transRow.setTransDivFlexValueId((oracle.jbo.domain.Number) pageFlowScope.get("asrDivFlexValueId"));
            transRow.setTransDivFlexValueSetId((oracle.jbo.domain.Number) pageFlowScope.get("asrDivFlexValueSetId"));
            transRow.setTransDeptName((String) pageFlowScope.get("asrDeptName"));
            transRow.setTransDeptCode((String) pageFlowScope.get("asrDeptCode"));
            transRow.setTransDeptFlexValueId((oracle.jbo.domain.Number) pageFlowScope.get("asrDeptFlexValueId"));
            transRow.setTransDeptFlexValueSetId((oracle.jbo.domain.Number) pageFlowScope.get("asrDeptFlexValueSetId"));
            transRow.setTransCustomerName((String) pageFlowScope.get("asrCustName"));
            transRow.setTransCustomerId((oracle.jbo.domain.Number) pageFlowScope.get("asrCustId"));


            getAssetRequestSearchVO1().setNamedWhereClauseParam("p_request_type", transRow.getTransRequestType());
            getAssetRequestSearchVO1().setNamedWhereClauseParam("p_requestor_bu_id", transRow.getTransReqBuId());
            getAssetRequestSearchVO1().setNamedWhereClauseParam("p_src_bu_id", transRow.getTransSrcBuId());
            getAssetRequestSearchVO1()
                .setNamedWhereClauseParam("p_src_div_flex_value_set_id", transRow.getTransSrcDivFlexValueSetId());
            getAssetRequestSearchVO1()
                .setNamedWhereClauseParam("p_src_div_flex_value_id", transRow.getTransSrcDivFlexValueId());
            getAssetRequestSearchVO1().setNamedWhereClauseParam("p_request_num", transRow.getTransRequestNumber());
            getAssetRequestSearchVO1()
                .setNamedWhereClauseParam("p_request_status", transRow.getTransRequestStatusCode());
            getAssetRequestSearchVO1().setNamedWhereClauseParam("p_requested_from", transRow.getTransRequestDateFrom());
            getAssetRequestSearchVO1().setNamedWhereClauseParam("p_requested_to", transRow.getTransRequestDateTo());
            getAssetRequestSearchVO1().setNamedWhereClauseParam("p_customer_type", transRow.getTransCustomerTypeCode());
            getAssetRequestSearchVO1().setNamedWhereClauseParam("p_project_id", transRow.getTransProjectId());
            getAssetRequestSearchVO1()
                .setNamedWhereClauseParam("p_div_flex_value_set_id", transRow.getTransDivFlexValueSetId());
            getAssetRequestSearchVO1()
                .setNamedWhereClauseParam("p_div_flex_value_id", transRow.getTransDivFlexValueId());
            getAssetRequestSearchVO1()
                .setNamedWhereClauseParam("p_dept_flex_value_set_id", transRow.getTransDeptFlexValueSetId());
            getAssetRequestSearchVO1()
                .setNamedWhereClauseParam("p_dept_flex_value_id", transRow.getTransDeptFlexValueId());
            getAssetRequestSearchVO1().setNamedWhereClauseParam("p_cust_account_id", transRow.getTransCustomerId());

            getAssetRequestSearchVO1().executeQuery();

        } catch (Exception e) {
            message = e.getMessage();
            e.printStackTrace();
        }
        return message;
    }


    public String resetAssetRequestSearch() {
        String message = "Success";
        try {
            TransAssetRequestSearchVORowImpl transRow =
                (TransAssetRequestSearchVORowImpl) getTransAssetRequestSearchVO1().getCurrentRow();
            if (transRow != null) {
                transRow.remove();

                getTransAssetRequestSearchVO1().executeQuery();
                transRow = (TransAssetRequestSearchVORowImpl) getTransAssetRequestSearchVO1().createRow();
                getTransAssetRequestSearchVO1().insertRow(transRow);

                transRow.setTransSrcBuId(null);
                transRow.setTransSrcBuName(null);
                transRow.setTransReqBuId(null);
                transRow.setTransReqBuName(null);
                transRow.setTransSrcDivFlexValueSetId(null);
                transRow.setTransSrcDivFlexValueId(null);
                transRow.setTransSrcDivision(null);
                transRow.setTransRequestNumber(null);
                transRow.setTransRequestStatus(null);
                transRow.setTransRequestStatusCode(null);
                transRow.setTransRequestDateFrom(null);
                transRow.setTransRequestDateTo(null);
                transRow.setTransCustomerType(null);
                transRow.setTransCustomerTypeCode(null);
                transRow.setTransProjectId(null);

                transRow.setTransProject(null);
                transRow.setTransDivsion(null);
                transRow.setTransDivFlexValueId(null);
                transRow.setTransDivFlexValueSetId(null);
                transRow.setTransDeptFlexValueId(null);
                transRow.setTransDeptFlexValueSetId(null);
                transRow.setTransDeptName(null);
                transRow.setTransDeptCode(null);
                transRow.setTransCustomerName(null);
                transRow.setTransCustomerId(null);
                transRow.setTransDivRequired(null);
                transRow.setTransDivSegment(null);
                transRow.setTransDeptSegment(null);
                transRow.setTransSrcDivRequired(null);
                transRow.setTransSrcDivSegmentNum(null);
                transRow.setTransRequestType(null);

                //                getAssetMasterSearchVO1().setNamedWhereClauseParam("p_bu_id", null);
                //                getAssetMasterSearchVO1().setNamedWhereClauseParam("p_division", null);
                //                getAssetMasterSearchVO1().setNamedWhereClauseParam("p_asset_source", null);
                //                getAssetMasterSearchVO1().setNamedWhereClauseParam("p_asset_number", null);
                //                getAssetMasterSearchVO1().setNamedWhereClauseParam("p_asset_category_id", null);
                //                getAssetMasterSearchVO1().setNamedWhereClauseParam("p_maint_asset_id", null);
                //                getAssetMasterSearchVO1().setNamedWhereClauseParam("p_working_status", null);
                //                getAssetMasterSearchVO1().setNamedWhereClauseParam("p_usage_pool", null);

                getAssetRequestSearchVO1().executeEmptyRowSet();
            }
        } catch (Exception e) {
            e.printStackTrace();
            message = e.getMessage();
        }
        return message;
    }

    public String createAssetRequest() {
        String message = "Success";
        try {
            getAssetRequestHdrVO1().executeQuery();
            
            AssetRequestHdrVORowImpl newRow = (AssetRequestHdrVORowImpl) getAssetRequestHdrVO1().createRow();
            getAssetRequestHdrVO1().insertRow(newRow);
            
            newRow.setRequestStatus("E");
            newRow.setTransRequestStatus("Entered");
            newRow.setTransAssetRequestAttachCode("ADS_ASSET_REQUEST");
            

        } catch (Exception e) {
            e.printStackTrace();
            message = e.getMessage();
        }
        return message;
    }
    
    public String generateRequestNumber(){
        String message = "Success";
        try {
            oracle.jbo.domain.Number reqNum = new oracle.jbo.domain.Number(0);
            AssetRequestHdrVORowImpl hdrRow = (AssetRequestHdrVORowImpl) getAssetRequestHdrVO1().getCurrentRow();
            if(hdrRow != null && hdrRow.getRequestNumber() == null){
                getAssetRequestNumberVO1().setNamedWhereClauseParam("p_bu_id", hdrRow.getSourceBuId());
                getAssetRequestNumberVO1().setNamedWhereClauseParam("p_div_flex_val_id", hdrRow.getSrcDivFlexValueId());
                getAssetRequestNumberVO1().executeQuery();
                AssetRequestNumberVORowImpl reqRow = (AssetRequestNumberVORowImpl) getAssetRequestNumberVO1().first();
    
                if (getAssetRequestNumberVO1().getRowCount() > 0) {
                    reqNum = reqRow.getMaxReqNum();
                }
                oracle.jbo.domain.Number seq = updateDocSequenceNumber("AR",hdrRow.getSourceBuId(), hdrRow.getSrcDivFlexValueId(), reqNum);
                if(seq == null){
                    return "Please define Document Sequence and then continue";
                }
                String divCode = getSequenceCode("AR",hdrRow.getSourceBuId(), hdrRow.getSrcDivFlexValueId());
                if(seq != null && divCode == null)
                {
                    hdrRow.setRequestNumber("AR-"+seq);
                }else if(seq != null && divCode != null){
                    
                    hdrRow.setRequestNumber(divCode+"-AR-"+seq);
                }
            }
        }catch (Exception e) {
            e.printStackTrace();
            message = "Success";
        }
        return message;
    }
    
    public String arInterDivisionCheck(){
        String message = "Success";
        try {
            AssetRequestHdrVORowImpl hdrRow = (AssetRequestHdrVORowImpl) getAssetRequestHdrVO1().getCurrentRow();
            if(hdrRow != null && "Internal".equals(hdrRow.getRequestType())
                && hdrRow.getDivision() != null && hdrRow.getSrcDivision() != null
                && hdrRow.getDivision().equals(hdrRow.getSrcDivision())){
                hdrRow.setDivision(null);
                hdrRow.setDivFlexValueId(null);
                hdrRow.setDivFlexValueSetId(null);                
                return "For Request Type Internal, Division and Inter Division can't be same";
            }
        }catch (Exception e) {
            e.printStackTrace();
            message = e.getMessage();
        }
        return message;
    }

    /**
     * Container's getter for AssetRequestHdrVO1.
     * @return AssetRequestHdrVO1
     */
    public AssetRequestHdrVOImpl getAssetRequestHdrVO1() {
        return (AssetRequestHdrVOImpl) findViewObject("AssetRequestHdrVO1");
    }

    /**
     * Container's getter for AssetRequestLinesVO1.
     * @return AssetRequestLinesVO1
     */
    public AssetRequestLinesVOImpl getAssetRequestLinesVO1() {
        return (AssetRequestLinesVOImpl) findViewObject("AssetRequestLinesVO1");
    }

    /**
     * Container's getter for AssetRequestToDetailsVL1.
     * @return AssetRequestToDetailsVL1
     */
    public ViewLinkImpl getAssetRequestToDetailsVL1() {
        return (ViewLinkImpl) findViewLink("AssetRequestToDetailsVL1");
    }

    public String editAsset() {
        String message = "Success";
        try {
            AssetRequestSearchVORowImpl searchRow =
                (AssetRequestSearchVORowImpl) getAssetRequestSearchVO1().getCurrentRow();
            if (searchRow != null) {
                getAccessTypeVO1().setNamedWhereClauseParam("p_customer_type", searchRow.getCustomerType());
                
                if("P".equals(searchRow.getCustomerType())){
                    getAccessTypeVO1().setNamedWhereClauseParam("p_value_id", searchRow.getProjectId());
                }else if("C".equals(searchRow.getCustomerType())){
                    getAccessTypeVO1().setNamedWhereClauseParam("p_value_id", searchRow.getCustomerId());
                }else if("D".equals(searchRow.getCustomerType())){
                    getAccessTypeVO1().setNamedWhereClauseParam("p_value_id", searchRow.getDeptFlexValueId());
                }else if("DV".equals(searchRow.getCustomerType())){
                    getAccessTypeVO1().setNamedWhereClauseParam("p_value_id", searchRow.getDivFlexValueId());
                }
                getAccessTypeVO1().setNamedWhereClauseParam("p_src_bu_id", searchRow.getSourceBuId());
                getAccessTypeVO1().setNamedWhereClauseParam("p_req_bu_id", searchRow.getRequestorBuId());
                getAccessTypeVO1().setNamedWhereClauseParam("p_src_div_flex_val_id", searchRow.getSrcDivFlexValueId());
                
                getAccessTypeVO1().executeQuery();
                
                AccessTypeVORowImpl row = (AccessTypeVORowImpl) getAccessTypeVO1().first();
                
                if(row != null && "F".equals(row.getAccessType())){
                    ADFContext.getCurrent().getPageFlowScope().put("requestEditFlag", "Y");
                }else{
                    ADFContext.getCurrent().getPageFlowScope().put("requestEditFlag", "N");
                }
                
                getAssetRequestHdrVO1().setNamedWhereClauseParam("p_request_id", searchRow.getRequestId());
                getAssetRequestHdrVO1().executeQuery();

                getAssetRequestLinesVO1().setNamedWhereClauseParam("p_request_id", searchRow.getRequestId());
                getAssetRequestLinesVO1().executeQuery();

            }
        } catch (Exception e) {
            e.printStackTrace();
            message = e.getMessage();
        }
        return message;
    }

    public oracle.jbo.domain.Number updateDocSequenceNumber(String code, oracle.jbo.domain.Number buId, oracle.jbo.domain.Number divFlexValueId, oracle.jbo.domain.Number num) {
        oracle.jbo.domain.Number seqNum = null;
        try {
            getDocumentSequenceUpdateVO1().setNamedWhereClauseParam("p_bu_id", buId);
            getDocumentSequenceUpdateVO1().setNamedWhereClauseParam("p_div_flex_value_id", divFlexValueId);
            getDocumentSequenceUpdateVO1().setNamedWhereClauseParam("p_doc_code", code);
            getDocumentSequenceUpdateVO1().executeQuery();

            if (getDocumentSequenceUpdateVO1().getRowCount() > 0) {
                DocumentSequenceUpdateVORowImpl docRow =
                    (DocumentSequenceUpdateVORowImpl) getDocumentSequenceUpdateVO1().first();
                if(num != null && num.compareTo(new oracle.jbo.domain.Number(0)) != 0){
                    seqNum = num.add(1);
                }else{
                    seqNum = docRow.getStartingSeqNum();
                }
                docRow.setCurrentSeqNum(seqNum);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return seqNum;
    }

    public String getSequenceCode(String code, oracle.jbo.domain.Number buId, oracle.jbo.domain.Number divFlexValueId) {
        String divCode = null;
        try {
            getDocumentSequenceUpdateVO1().setNamedWhereClauseParam("p_bu_id", buId);
            getDocumentSequenceUpdateVO1().setNamedWhereClauseParam("p_div_flex_value_id", divFlexValueId);
            getDocumentSequenceUpdateVO1().setNamedWhereClauseParam("p_doc_code", code);
            getDocumentSequenceUpdateVO1().executeQuery();
            DocumentSequenceUpdateVORowImpl  seqRow =
                (DocumentSequenceUpdateVORowImpl) getDocumentSequenceUpdateVO1().first();
            if(seqRow != null){
                divCode = seqRow.getDivisionCode();
            }
            return divCode;
        }catch(Exception e){
            e.printStackTrace();
        }
        return divCode;
    }

    /**
     * Container's getter for DocumentSequenceUpdateVO1.
     * @return DocumentSequenceUpdateVO1
     */
    public DocumentSequenceUpdateVOImpl getDocumentSequenceUpdateVO1() {
        return (DocumentSequenceUpdateVOImpl) findViewObject("DocumentSequenceUpdateVO1");
    }

    /**
     * Container's getter for AssetRequestNumberVO1.
     * @return AssetRequestNumberVO1
     */
    public AssetRequestNumberVOImpl getAssetRequestNumberVO1() {
        return (AssetRequestNumberVOImpl) findViewObject("AssetRequestNumberVO1");
    }

    public String addAssetReqDetails() {
        String message = "Success";
        try {
            AssetRequestHdrVORowImpl hdrRow = (AssetRequestHdrVORowImpl) getAssetRequestHdrVO1().getCurrentRow();

            AssetRequestLinesVORowImpl newRow = (AssetRequestLinesVORowImpl) getAssetRequestLinesVO1().createRow();
            getAssetRequestLinesVO1().insertRow(newRow);
            newRow.setRequestId(hdrRow.getRequestId());
            newRow.setTransRentalType("Asset");
            newRow.setRentalType("A");
            newRow.setTransLineStatus("Pending");
            newRow.setLineStatus("P");
            newRow.setTransSrcBuId(hdrRow.getSourceBuId());
            newRow.setTransHdrProjectId(hdrRow.getProjectId());

            getAssetRequestLinesVO2().setNamedWhereClauseParam("p_request_id", hdrRow.getRequestId());
            getAssetRequestLinesVO2().setNamedWhereClauseParam("p_line_id", newRow.getLineId());
            getAssetRequestLinesVO2().setApplyViewCriteriaName("AssetRequestLinesVOCriteria");
            getAssetRequestLinesVO2().setOrderByClause("XxadsAssetRequestLinesEO.LINE_NUM desc");
            getAssetRequestLinesVO2().executeQuery();

            AssetRequestLinesVORowImpl preRow = (AssetRequestLinesVORowImpl) getAssetRequestLinesVO2().first();
            if (preRow != null) {
                if (preRow.getLineNum() != null && preRow.getLineNum().compareTo(0) > 0) {
                    newRow.setLineNum(preRow.getLineNum().add(new oracle.jbo.domain.Number(1)));
                } else {
                    newRow.setLineNum(new oracle.jbo.domain.Number(1));
                }
            } else {
                newRow.setLineNum(new oracle.jbo.domain.Number(1));
            }


        } catch (Exception e) {
            e.printStackTrace();
            return e.getMessage();
        }
        return message;
    }

    public String assetCategoryChange() {
        String message = "Success";
        try {
            AssetRequestLinesVORowImpl currRow = (AssetRequestLinesVORowImpl) getAssetRequestLinesVO1().getCurrentRow();
            if (currRow != null) {
                if(currRow.getOnHireDate() != null)
                {
                    getAssetRequestLinesValidateVO1()
                        .setNamedWhereClauseParam("p_category_id", currRow.getAssetCategoryId());
                    getAssetRequestLinesValidateVO1().setNamedWhereClauseParam("p_line_id", currRow.getLineId());
                    getAssetRequestLinesValidateVO1().setNamedWhereClauseParam("p_rental_type", currRow.getRentalType());
                    getAssetRequestLinesValidateVO1().setNamedWhereClauseParam("p_request_id", currRow.getRequestId());
                    getAssetRequestLinesValidateVO1().setApplyViewCriteriaName("AssetRequestLinesValidateVOCriteria");
                    getAssetRequestLinesValidateVO1().executeQuery();
    
                    RowSetIterator rs = getAssetRequestLinesValidateVO1().createRowSetIterator(null);
                    while (rs.hasNext()) {
                        AssetRequestLinesValidateVORowImpl hierFilRow = (AssetRequestLinesValidateVORowImpl) rs.next();
                        if (hierFilRow.getOnHireDate().compareTo(currRow.getOnHireDate()) > 0) {
                            if (currRow.getOffHireDate() == null) {
                                message = "Asset is already active for the given date. Please check.";
                            } else if ( hierFilRow.getOnHireDate().compareTo(currRow.getOffHireDate()) <= 0) {
                                message = "Asset is already active for the given date. Please check.";
                            }
                        } else if (hierFilRow.getOnHireDate().compareTo(currRow.getOnHireDate()) < 0) {
                            if (hierFilRow.getOffHireDate() == null) {
                                message = "Parent Asset is already active for the given date. Please check.";
                            } else if (currRow.getOnHireDate().compareTo(hierFilRow.getOffHireDate()) <= 0) {
                                message = "Asset is already active for the given date. Please check.";
                            }
                        } else {
                            message = "Asset is already active for the given date. Please check.";
                        }
                    }
                    if (!"Success".equals(message)) {
                        currRow.setTransCategory(null);
                        currRow.setAssetCategoryId(null);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            message = e.getMessage();
        }
        return message;
    }

    /**
     * Container's getter for AssetRequestLinesValidateVO1.
     * @return AssetRequestLinesValidateVO1
     */
    public AssetRequestLinesValidateVOImpl getAssetRequestLinesValidateVO1() {
        return (AssetRequestLinesValidateVOImpl) findViewObject("AssetRequestLinesValidateVO1");
    }

    public String onHireDateChange() {
        String message = "Success";
        try {
            AssetRequestHdrVORowImpl hdrRow = (AssetRequestHdrVORowImpl) getAssetRequestHdrVO1().getCurrentRow();
            AssetRequestLinesVORowImpl currRow = (AssetRequestLinesVORowImpl) getAssetRequestLinesVO1().getCurrentRow();
            if (currRow != null) {

                if (currRow.getOnHireDate() != null && hdrRow.getRequestedDate() != null &&
                    hdrRow.getRequestedDate().dateValue().compareTo(currRow.getOnHireDate().dateValue()) >0) 
                {
                    currRow.setOnHireDate(null);
                    return "On Hire Date should be on or after Requested Date.";
                }

                getAssetRequestLinesValidateVO1()
                    .setNamedWhereClauseParam("p_category_id", currRow.getAssetCategoryId());
                getAssetRequestLinesValidateVO1().setNamedWhereClauseParam("p_line_id", currRow.getLineId());
                getAssetRequestLinesValidateVO1().setNamedWhereClauseParam("p_rental_type", currRow.getRentalType());
                getAssetRequestLinesValidateVO1().setNamedWhereClauseParam("p_request_id", currRow.getRequestId());
                getAssetRequestLinesValidateVO1().setApplyViewCriteriaName("AssetRequestLinesValidateVOCriteria");
                getAssetRequestLinesValidateVO1().executeQuery();

                RowSetIterator rs = getAssetRequestLinesValidateVO1().createRowSetIterator(null);
                while (rs.hasNext()) {
                    AssetRequestLinesValidateVORowImpl hierFilRow = (AssetRequestLinesValidateVORowImpl) rs.next();
                    if (hierFilRow.getOnHireDate().compareTo(currRow.getOnHireDate()) > 0) {
                        if (currRow.getOffHireDate() == null) {
                            message = "Asset is already active for the given date. Please check.";
                        } else if (hierFilRow.getOnHireDate().compareTo(currRow.getOffHireDate()) <= 0) {
                            message = "Asset is already active for the given date. Please check.";
                        }
                    } else if (hierFilRow.getOnHireDate().compareTo(currRow.getOnHireDate()) < 0) {
                        if (hierFilRow.getOffHireDate() == null) {
                            message = "Parent Asset is already active for the given date. Please check.";
                        } else if (currRow.getOnHireDate().compareTo(hierFilRow.getOffHireDate()) <= 0) {
                            message = "Asset is already active for the given date. Please check.";
                        }
                    } else {
                        message = "Asset is already active for the given date. Please check.";
                    }
                }
                if (!"Success".equals(message)) {
                    currRow.setOnHireDate(null);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            return e.getMessage();
        }
        return message;
    }

    public String offHireDateChange() {
        String message = "Success";
        try {
            AssetRequestHdrVORowImpl hdrRow = (AssetRequestHdrVORowImpl) getAssetRequestHdrVO1().getCurrentRow();
            AssetRequestLinesVORowImpl currRow = (AssetRequestLinesVORowImpl) getAssetRequestLinesVO1().getCurrentRow();
            if (currRow != null) {

                getAssetRequestLinesValidateVO1()
                    .setNamedWhereClauseParam("p_category_id", currRow.getAssetCategoryId());
                getAssetRequestLinesValidateVO1().setNamedWhereClauseParam("p_line_id", currRow.getLineId());
                getAssetRequestLinesValidateVO1().setNamedWhereClauseParam("p_rental_type", currRow.getRentalType());
                getAssetRequestLinesValidateVO1().setNamedWhereClauseParam("p_request_id", currRow.getRequestId());
                getAssetRequestLinesValidateVO1().setApplyViewCriteriaName("AssetRequestLinesValidateVOCriteria");
                getAssetRequestLinesValidateVO1().executeQuery();

                RowSetIterator rs = getAssetRequestLinesValidateVO1().createRowSetIterator(null);
                while (rs.hasNext()) {
                    AssetRequestLinesValidateVORowImpl arFilRow = (AssetRequestLinesValidateVORowImpl) rs.next();
                    if (arFilRow.getOnHireDate().compareTo(currRow.getOnHireDate()) > 0) {
                        if (currRow.getOffHireDate() == null) {
                            message = "Asset is already active for the given date. Please check.";
                        } else if (arFilRow.getOnHireDate().compareTo(currRow.getOffHireDate()) <= 0) {
                            message = "Asset is already active for the given date. Please check.";
                        }
                    } else if (arFilRow.getOnHireDate().compareTo(currRow.getOnHireDate()) < 0) {
                        if (arFilRow.getOffHireDate() == null) {
                            message = "Asset is already active for the given date. Please check.";
                        } else if (currRow.getOnHireDate().compareTo(arFilRow.getOffHireDate()) <= 0) {
                            message = "Asset is already active for the given date. Please check.";
                        }
                    } else {
                        message = "Asset is already active for the given date. Please check.";
                    }
                }
                if (!"Success".equals(message)) {
                    currRow.setOffHireDate(null);
                } else {
                    long difference_In_Time = currRow.getOffHireDate()
                                                     .dateValue()
                                                     .getTime() - currRow.getOnHireDate()
                                                                         .dateValue()
                                                                         .getTime();

                    long difference_In_Days = (difference_In_Time / (1000 * 60 * 60 * 24)) % 365 + 1;
                    currRow.setTransNoOfDays(difference_In_Days);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            return e.getMessage();
        }
        return message;
    }

    public String editAssetRequest() {
        String message = "Success";
        try {
            AssetRequestSearchVORowImpl searchRow =
                (AssetRequestSearchVORowImpl) getAssetRequestSearchVO1().getCurrentRow();
            if (searchRow != null) {
                getAccessTypeVO1().setNamedWhereClauseParam("p_customer_type", searchRow.getCustomerType());
                
                if("P".equals(searchRow.getCustomerType())){
                    getAccessTypeVO1().setNamedWhereClauseParam("p_value_id", searchRow.getProjectId());
                }else if("C".equals(searchRow.getCustomerType())){
                    getAccessTypeVO1().setNamedWhereClauseParam("p_value_id", searchRow.getCustomerId());
                }else if("D".equals(searchRow.getCustomerType())){
                    getAccessTypeVO1().setNamedWhereClauseParam("p_value_id", searchRow.getDeptFlexValueId());
                }else if("DV".equals(searchRow.getCustomerType())){
                    getAccessTypeVO1().setNamedWhereClauseParam("p_value_id", searchRow.getDivFlexValueId());
                }
                getAccessTypeVO1().setNamedWhereClauseParam("p_src_bu_id", searchRow.getSourceBuId());
                getAccessTypeVO1().setNamedWhereClauseParam("p_req_bu_id", searchRow.getRequestorBuId());
                getAccessTypeVO1().setNamedWhereClauseParam("p_src_div_flex_val_id", searchRow.getSrcDivFlexValueId());
                
                getAccessTypeVO1().executeQuery();
                
                AccessTypeVORowImpl row = (AccessTypeVORowImpl) getAccessTypeVO1().first();
                
                if(row != null && "F".equals(row.getAccessType())){
                    ADFContext.getCurrent().getPageFlowScope().put("requestEditFlag", "Y");
                }else{
                    ADFContext.getCurrent().getPageFlowScope().put("requestEditFlag", "N");
                }
                
                getAssetRequestHdrVO1().setNamedWhereClauseParam("p_request_id", searchRow.getRequestId());
                getAssetRequestHdrVO1().executeQuery();

            }
        } catch (Exception e) {
            e.printStackTrace();
            message = e.getMessage();
        }
        return message;
    }

    public String deleteRequestedAsset() {
        String message = "Success";
        try {
            AssetRequestHdrVORowImpl hdrRow = (AssetRequestHdrVORowImpl) getAssetRequestHdrVO1().getCurrentRow();
            if(hdrRow!=null) 
            {
                if("A".equals(hdrRow.getRequestStatus()) || "P".equals(hdrRow.getRequestStatus()) || "C".equals(hdrRow.getRequestStatus())) {
                    return "Cannot delete Approved/Pending/Cancelled request";
                }
            }
            AssetRequestLinesVORowImpl currRow = (AssetRequestLinesVORowImpl) getAssetRequestLinesVO1().getCurrentRow();
            if (currRow != null &&
                ("P".equals(currRow.getLineStatus()) || currRow.getEntity(0).getEntityState() == 0)) {
                currRow.remove();
            } else {
                return "Only pending lines can be deleted.";
            }
        } catch (Exception e) {
            e.printStackTrace();
            return e.getMessage();
        }
        return message;
    }


    /**
     * Container's getter for AssetRequestLinesVO2.
     * @return AssetRequestLinesVO2
     */
    public AssetRequestLinesVOImpl getAssetRequestLinesVO2() {
        return (AssetRequestLinesVOImpl) findViewObject("AssetRequestLinesVO2");
    }

    /**
     * Container's getter for AttachmentsVO1.
     * @return AttachmentsVO1
     */
    public AttachmentsVOImpl getAttachmentsVO1() {
        return (AttachmentsVOImpl) findViewObject("AttachmentsVO1");
    }

    /**
     * Container's getter for AssetRequestToAttachmentsVL1.
     * @return AssetRequestToAttachmentsVL1
     */
    public ViewLinkImpl getAssetRequestToAttachmentsVL1() {
        return (ViewLinkImpl) findViewLink("AssetRequestToAttachmentsVL1");
    }

    public String uploadAssetRequestAttach() {
        String message = "Success";
        try {
            ADFContext adfCtx = ADFContext.getCurrent();
            Map pageFlowScope = adfCtx.getPageFlowScope();
            int ch = -1;

            AttachmentsVOImpl attachmentVO = getAttachmentsVO1();
            AttachmentsVORowImpl currRow = (AttachmentsVORowImpl) attachmentVO.getCurrentRow();
            InputStream in = (InputStream) pageFlowScope.get("UploadedFileStream");
            ByteArrayOutputStream bout = new ByteArrayOutputStream();
            new ByteArrayOutputStream();
            try {
                while ((ch = in.read()) != -1) {
                    bout.write(ch);
                }
                in.close();
                bout.close();

                currRow.setAttachmentFile(new BlobDomain(bout.toByteArray()));
            } catch (Exception e) {
                //                System.out.println(e.getMessage());
                return "ERROR";
            }

            String fileName = (String) pageFlowScope.get("FileName");
            currRow.setFileName(fileName);
            currRow.setFileType((String) pageFlowScope.get("FileType"));
        } catch (Exception e) {
            e.printStackTrace();
            message = e.getMessage();
        }
        return message;
    }

    public String addAssetRequestAttch() {
        String message = "Success";
        try {
            AssetRequestHdrVORowImpl currRow = (AssetRequestHdrVORowImpl) getAssetRequestHdrVO1().getCurrentRow();
            AttachmentsVORowImpl newRow = (AttachmentsVORowImpl) getAttachmentsVO1().createRow();
            getAttachmentsVO1().insertRow(newRow);
            newRow.setReferenceId(currRow.getRequestId());
            newRow.setAttachmentCode("XXADS_ASSET_REQUEST_T");
            newRow.setCategory("Misc");
            newRow.setTransCategory("Miscellaneous");

        } catch (Exception e) {
            e.printStackTrace();
            message = e.getMessage();
        }
        return message;
    }

    public String requestedDateChange() {
        String message = "Success";
        try {
            AssetRequestHdrVORowImpl currRow = (AssetRequestHdrVORowImpl) getAssetRequestHdrVO1().getCurrentRow();
            if (currRow != null) {
                getAssetRequestLinesValidateVO1().setApplyViewCriteriaName(null);
                getAssetRequestLinesValidateVO1().executeQuery();

                getAssetRequestLinesValidateVO1().setNamedWhereClauseParam("p_requested_date", currRow.getRequestedDate().dateValue());
                getAssetRequestLinesValidateVO1().setNamedWhereClauseParam("p_request_id", currRow.getRequestId());
                getAssetRequestLinesValidateVO1().setApplyViewCriteriaName("AssetRequestLinesValidateVOCriteria1");
                getAssetRequestLinesValidateVO1().executeQuery();

                if (getAssetRequestLinesValidateVO1().getRowCount() > 0) {
                    AssetRequestLinesValidateVORowImpl filRow =
                        (AssetRequestLinesValidateVORowImpl) getAssetRequestLinesValidateVO1().first();
                            currRow.setRequestedDate(null);
                            return "Given requested date cannot be applied for line num " + filRow.getLineNum();
                            
//                        }
//                    }
                }

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return message;
    }

    public String rentalsTypeChange() {
        String message = "Success";
        try {
            AssetRequestLinesVORowImpl currRow = (AssetRequestLinesVORowImpl) getAssetRequestLinesVO1().getCurrentRow();
            if (currRow.getTransCategory() != null) {
                currRow.setTransCategoryDesc(null);
                currRow.setTransCategory(null);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return e.getMessage();
        }
        return message;
    }

    public String cancelAssetRequestLine() {
        String message = "Success";
        try {
            AssetRequestHdrVORowImpl hdrRow = (AssetRequestHdrVORowImpl) getAssetRequestHdrVO1().getCurrentRow();
            AssetRequestLinesVORowImpl currRow = (AssetRequestLinesVORowImpl) getAssetRequestLinesVO1().getCurrentRow();
            if ("A".equals(hdrRow.getRequestStatus()) && "P".equals(currRow.getLineStatus())) {
                currRow.setTransLineStatus("Cancelled");
                currRow.setLineStatus("C");
            } else {
                return "Only Pending assets of Approved Request can be cancelled.";
            }

        } catch (Exception e) {
            e.printStackTrace();
            return e.getMessage();
        }
        return message;
    }

    public String requestTypeChange() {
        String message = "Success";
        try {
            AssetRequestHdrVORowImpl currRow = (AssetRequestHdrVORowImpl) getAssetRequestHdrVO1().getCurrentRow();
            if (currRow != null) {
                currRow.setTransReqBuSetId(null);
                currRow.setTransRequestorBuName(null);
                currRow.setTransReqBuSetId(null);
                currRow.setRequestorBuId(null);
                currRow.setTransSrcBuName(null);
                currRow.setSourceBuId(null);
                currRow.setTransSrcDeptSegmentNum(null);
                currRow.setTransSrcDivSegmentNum(null);
                currRow.setTransSrcDivRequired(null);
                currRow.setSrcDivision(null);
                currRow.setSrcDivFlexValSetId(null);
                currRow.setSrcDivFlexValueId(null);
                currRow.setTransCustomerType(null);
                currRow.setCustomerType(null);
                currRow.setTransProject(null);
                currRow.setProjectId(null);
                currRow.setTransDepartment(null);
                currRow.setTransDeptSegmentNumber(null);
                currRow.setDepartmentCode(null);
                currRow.setDepartmentName(null);
                currRow.setDeptFlexValueId(null);
                currRow.setDeptFlexValueSetId(null);
                currRow.setTransDivSegmentNumber(null);
                currRow.setDivFlexValueId(null);
                currRow.setDivFlexValueSetId(null);
                currRow.setDivision(null);
                currRow.setCustSiteId(null);
                currRow.setCustomerId(null);
                currRow.setTransCustName(null);
                currRow.setTransCustSiteName(null);
                currRow.setSiteUseId(null);

            }
        } catch (Exception e) {
            e.printStackTrace();
            message = e.getMessage();
        }
        return message;
    }

    public String requestorBUChange() {
        String message = "Success";
        try {
            AssetRequestHdrVORowImpl currRow = (AssetRequestHdrVORowImpl) getAssetRequestHdrVO1().getCurrentRow();
            if (currRow != null) {
                if ("Internal".equals(currRow.getRequestType()) || "External".equals(currRow.getRequestType())) 
                {
                    getInternalTypeAccessValidateVO1().setNamedWhereClauseParam("p_user_id", ((Map) ADFContext.getCurrent().getSessionScope().get("userMap")).get("UserId"));
                    getInternalTypeAccessValidateVO1().setNamedWhereClauseParam("p_src_bu_id", currRow.getRequestorBuId());
                    getInternalTypeAccessValidateVO1().setNamedWhereClauseParam("p_src_flex_value_id", null);
                    getInternalTypeAccessValidateVO1().setNamedWhereClauseParam("p_req_bu_id", currRow.getRequestorBuId());
                    getInternalTypeAccessValidateVO1().setNamedWhereClauseParam("p_page_type", "T");
                    
                    getInternalTypeAccessValidateVO1().executeQuery();
                    InternalTypeAccessValidateVORowImpl validateRow =
                        (InternalTypeAccessValidateVORowImpl) getInternalTypeAccessValidateVO1().first();  
                    if(validateRow != null && "Y".equals(validateRow.getFlag()))
                    {
                            currRow.setTransSrcBuName(currRow.getTransRequestorBuName());
                            currRow.setSourceBuId(currRow.getRequestorBuId());
                            currRow.setTransSrcDivSegmentNum(currRow.getTransSrcDivSegmentNum());
                            currRow.setTransSrcDeptSegmentNum(currRow.getTransSrcDeptSegmentNum());
                    }
                    else
                    {
                            message = "Access is not defined for "+currRow.getTransRequestorBuName()+" as Source BU. Please provide access and continue";
                            currRow.setTransRequestorBuName(null);
                            currRow.setRequestorBuId(null);
                            currRow.setTransSrcBuName(null);
                            currRow.setSourceBuId(null);
                            currRow.setTransSrcPrecision(null);
                            currRow.setTransSrcDeptSegmentNum(null);
                            currRow.setTransSrcDivSegmentNum(null);
                            currRow.setTransSrcDivRequired(null);
                        }
                   
                } else {
                    currRow.setTransSrcBuName(null);
                    currRow.setSourceBuId(null);
                }

                currRow.setTransSrcDeptSegmentNum(null);
                currRow.setTransSrcDivSegmentNum(null);
                currRow.setTransSrcDivRequired(null);
                currRow.setSrcDivision(null);
                currRow.setSrcDivFlexValSetId(null);
                currRow.setSrcDivFlexValueId(null);
                currRow.setTransCustomerType(null);
                currRow.setCustomerType(null);
                currRow.setTransProject(null);
                currRow.setProjectId(null);
                currRow.setTransDepartment(null);
                currRow.setDepartmentCode(null);
                currRow.setDepartmentName(null);
                currRow.setDeptFlexValueId(null);
                currRow.setDeptFlexValueSetId(null);
                currRow.setDivFlexValueId(null);
                currRow.setDivFlexValueSetId(null);
                currRow.setDivision(null);
                currRow.setCustSiteId(null);
                currRow.setCustomerId(null);
                currRow.setTransCustName(null);
                currRow.setTransCustSiteName(null);
                currRow.setSiteUseId(null);

            }
        } catch (Exception e) {
            e.printStackTrace();
            message = e.getMessage();
        }
        return message;
    }

    public String srcBuChange() {
        String message = "Success";
        try {
            AssetRequestHdrVORowImpl currRow = (AssetRequestHdrVORowImpl) getAssetRequestHdrVO1().getCurrentRow();
            if (currRow != null) {
                
                currRow.setSrcDivision(null);
                currRow.setSrcDivFlexValSetId(null);
                currRow.setSrcDivFlexValueId(null);
                currRow.setTransCustomerType(null);
                currRow.setCustomerType(null);
                currRow.setTransProject(null);
                currRow.setProjectId(null);
                currRow.setTransDepartment(null);
                currRow.setDepartmentCode(null);
                currRow.setDepartmentName(null);
                currRow.setDeptFlexValueId(null);
                currRow.setDeptFlexValueSetId(null);
                currRow.setDivFlexValueId(null);
                currRow.setDivFlexValueSetId(null);
                currRow.setDivision(null);
                currRow.setCustSiteId(null);
                currRow.setCustomerId(null);
                currRow.setTransCustName(null);
                currRow.setTransCustSiteName(null);
                currRow.setSiteUseId(null);

            }
        } catch (Exception e) {
            e.printStackTrace();
            message = e.getMessage();
        }
        return message;
    }

    public String srcDivisonChange() {
        String message = "Success";
        try {
            AssetRequestHdrVORowImpl currRow = (AssetRequestHdrVORowImpl) getAssetRequestHdrVO1().getCurrentRow();
            if (currRow != null) {
                currRow.setTransCustomerType(null);
                currRow.setCustomerType(null);
                currRow.setTransProject(null);
                currRow.setProjectId(null);
                currRow.setTransDepartment(null);
                currRow.setDepartmentCode(null);
                currRow.setDepartmentName(null);
                currRow.setDeptFlexValueId(null);
                currRow.setDeptFlexValueSetId(null);
                currRow.setDivFlexValueId(null);
                currRow.setDivFlexValueSetId(null);
                currRow.setDivision(null);
                currRow.setCustSiteId(null);
                currRow.setCustomerId(null);
                currRow.setTransCustName(null);
                currRow.setTransCustSiteName(null);
                currRow.setSiteUseId(null);

            }
        } catch (Exception e) {
            e.printStackTrace();
            message = e.getMessage();
        }
        return message;
    }

    public String custTypeChange() {
        String message = "Success";
        try {
            AssetRequestHdrVORowImpl currRow = (AssetRequestHdrVORowImpl) getAssetRequestHdrVO1().getCurrentRow();
            if (currRow != null) {
                currRow.setTransProject(null);
                currRow.setProjectId(null);
                currRow.setTransDepartment(null);
                currRow.setDepartmentCode(null);
                currRow.setDepartmentName(null);
                currRow.setDeptFlexValueId(null);
                currRow.setDeptFlexValueSetId(null);
                currRow.setDivFlexValueId(null);
                currRow.setDivFlexValueSetId(null);
                currRow.setDivision(null);
                currRow.setCustSiteId(null);
                currRow.setCustomerId(null);
                currRow.setTransCustName(null);
                currRow.setTransCustSiteName(null);
                currRow.setSiteUseId(null);

            }
        } catch (Exception e) {
            e.printStackTrace();
            message = e.getMessage();
        }
        return message;
    }

    public String cancelAssetRequest() {
        String message = "Success";
        try {
            AssetRequestHdrVORowImpl hdrRow = (AssetRequestHdrVORowImpl) getAssetRequestHdrVO1().getCurrentRow();
            if (hdrRow != null) {
                getAssetRequestLinesVO1().setNamedWhereClauseParam("p_request_id", hdrRow.getRequestId());
                getAssetRequestLinesVO1().executeQuery();

                if (getAssetRequestLinesVO1().getRowCount() > 0) {
                    RowSetIterator itr = getAssetRequestLinesVO1().createRowSetIterator(null);
                    while (itr.hasNext()) {
                        AssetRequestLinesVORowImpl lineRow = (AssetRequestLinesVORowImpl) itr.next();
                        lineRow.setLineStatus("C");
                        lineRow.setTransLineStatus("Cancelled");
                    }
                }

                hdrRow.setRequestStatus("C");
                hdrRow.setTransRequestStatus("Cancelled");
            }
        } catch (Exception e) {
            e.printStackTrace();
            message = e.getMessage();
        }
        return message;
    }

    public String transReqBuChange() {
        String message = "Success";
        try {
            TransAssetRequestSearchVORowImpl searchRow =
                (TransAssetRequestSearchVORowImpl) getTransAssetRequestSearchVO1().getCurrentRow();
            if (searchRow != null)
            { 
                if ("Internal".equals(searchRow.getTransRequestType()) || "External".equals(searchRow.getTransRequestType())) 
                {
                    getInternalTypeAccessValidateVO1().setNamedWhereClauseParam("p_user_id", ((Map) ADFContext.getCurrent().getSessionScope().get("userMap")).get("UserId"));
                    getInternalTypeAccessValidateVO1().setNamedWhereClauseParam("p_src_bu_id", searchRow.getTransReqBuId());
                    getInternalTypeAccessValidateVO1().setNamedWhereClauseParam("p_src_flex_value_id", null);
                    getInternalTypeAccessValidateVO1().setNamedWhereClauseParam("p_req_bu_id", searchRow.getTransReqBuId());
                    getInternalTypeAccessValidateVO1().setNamedWhereClauseParam("p_page_type", "S");
                    
                    getInternalTypeAccessValidateVO1().executeQuery();
                    InternalTypeAccessValidateVORowImpl validateRow =
                        (InternalTypeAccessValidateVORowImpl) getInternalTypeAccessValidateVO1().first();  
                    if(validateRow != null && "Y".equals(validateRow.getFlag()))
                    {
                            searchRow.setTransSrcBuName(searchRow.getTransReqBuName());
                            searchRow.setTransSrcBuId(searchRow.getTransReqBuId());
                            searchRow.setTransSrcDivSegmentNum(searchRow.getTransSrcDivSegmentNum());
                    }
                    else
                    {
                            message = "Access is not defined for "+searchRow.getTransReqBuName()+" as Source BU. Please provide access and continue";
                            searchRow.setTransReqBuName(null);
                            searchRow.setTransReqBuId(null);
                            searchRow.setTransSrcBuName(null);
                            searchRow.setTransSrcBuId(null);
                            searchRow.setTransSrcDivSegmentNum(null);
                            searchRow.setTransSrcDivRequired(null);
                            searchRow.setTransSrcDivision(null);
                            searchRow.setTransSrcDivFlexValueId(null);
                            searchRow.setTransSrcDivFlexValueSetId(null);
                        }
                   
                }
                else 
                {
                    searchRow.setTransSrcBuName(null);
                    searchRow.setTransSrcBuId(null);
                }
                searchRow.setTransSrcDivSegmentNum(null);
                searchRow.setTransSrcDivRequired(null);
                searchRow.setTransSrcDivision(null);
                searchRow.setTransSrcDivFlexValueSetId(null);
                searchRow.setTransSrcDivFlexValueId(null);
                searchRow.setTransCustomerType(null);
                searchRow.setTransCustomerTypeCode(null);
                searchRow.setTransProject(null);
                searchRow.setTransProjectId(null);
                searchRow.setTransDeptSegment(null);
                searchRow.setTransDeptName(null);
                searchRow.setTransDeptCode(null);
                searchRow.setTransDeptFlexValueId(null);
                searchRow.setTransDeptFlexValueSetId(null);
                searchRow.setTransDivFlexValueId(null);
                searchRow.setTransDivFlexValueSetId(null);
                searchRow.setTransDivsion(null);
                searchRow.setTransDivFlexValueId(null);
                searchRow.setTransDivFlexValueSetId(null);
                searchRow.setTransDivRequired(null);
                searchRow.setTransDivSegment(null);
                searchRow.setTransCustomerId(null);
                searchRow.setTransCustomerName(null);

            }
        } catch (Exception e) {
            e.printStackTrace();
            message = e.getMessage();
        }
        return message;
    }

    public String validateRequest() 
    {
        String message = "Success";
        try 
        {
                if(getAssetRequestLinesVO1().getRowCount() == 0) 
                {
                    return "Please add lines to submit the current request. ";   
                }
        }
        catch(Exception e)
        {
            message = e.getMessage();
            e.printStackTrace();    
        }
        
        return message;
    }
    
    
    public String submitAssetRequest() {
        String message = "Success";
        try {
            AssetRequestHdrVORowImpl hdrRow = (AssetRequestHdrVORowImpl) getAssetRequestHdrVO1().getCurrentRow();
            if (hdrRow != null) {
                hdrRow.setRequestStatus("A");
                hdrRow.setTransRequestStatus("Approved");
                hdrRow.setApprovedDate((Date) Date.getCurrentDate());
            }
        } catch (Exception e) {
            e.printStackTrace();
            message = e.getMessage();
        }
        return message;
    }
    
    public String withdrawARFromApproval(String remarks) {
        String message = null;
        try {
            if (getAssetRequestHdrVO1().getCurrentRow() != null) {
                AssetRequestHdrVORowImpl hdrRow = (AssetRequestHdrVORowImpl) getAssetRequestHdrVO1().getCurrentRow();
                CommonAMImpl commAM = (CommonAMImpl) getCommonAM1();
                CallableStatement st = getDBTransaction().createCallableStatement(WITHDRAW_APPRL_SUBMISSION, 0);
                st.setLong("p_document_type_id", 49);
                st.setLong("p_document_id", hdrRow.getRequestId().longValue());
                st.setString("p_remarks", remarks);
                st.setLong("p_user",
                           commAM.getCurrentEmployeeId() != null ? commAM.getCurrentEmployeeId().longValue() : -1);
                st.setString("p_message", null);
                st.registerOutParameter("p_message", Types.VARCHAR);
                st.execute();
                message = st.getString("p_message");
                if ("Success".equals(message)) {
                    AssetRequestHdrVORowImpl curRow = (AssetRequestHdrVORowImpl) getAssetRequestHdrVO1().getCurrentRow();
//                    curRow.setRequestStatus("W");
                    curRow.setRequestStatus("E");
                    curRow.setTransRequestStatus("Entered");
                    this.getDBTransaction().commit();

                }
                getAssetRequestHdrVO1().executeQuery();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return message;
    }

    
    public Boolean makeAsARCurrentRow(oracle.jbo.domain.Number HeaderId) {
        Boolean isSetted = false;


        getAssetRequestHdrVO1().setNamedWhereClauseParam("p_request_id", HeaderId);
        getAssetRequestHdrVO1().executeQuery();

        if (getAssetRequestHdrVO1().first() != null) {
            AssetRequestHdrVORowImpl custRow = (AssetRequestHdrVORowImpl) getAssetRequestHdrVO1().getCurrentRow();
            if (HeaderId.longValue() == custRow.getRequestId().longValue()) {
                isSetted = true;
            }
        }
        return isSetted;
    }
    
    public String callpkgForAMEARProcessSubmit() {
        CommonAMImpl commonAM = (CommonAMImpl) getCommonAM1();
        String msg = "";
        try {
            AssetRequestHdrVORowImpl hdrRow = (AssetRequestHdrVORowImpl) getAssetRequestHdrVO1().getCurrentRow();
            CommonAMImpl commAM = (CommonAMImpl) getCommonAM1();
            if (hdrRow != null) {
                Map paramsMap = new HashMap();
                oracle.jbo.domain.Number hdrId = hdrRow.getRequestId();
                paramsMap.put("docId", new oracle.jbo.domain.Number(hdrRow.getRequestId()));
                paramsMap.put("docTypeId", new oracle.jbo.domain.Number(49));
                paramsMap.put("ActionCode", "Submit");
                paramsMap.put("currEmpId", commAM.getCurrentEmployeeId() != null ? commAM.getCurrentEmployeeId() : -1);
                paramsMap.put("remarks", "");
                paramsMap.put("docNum", hdrRow.getRequestNumber());
                msg = commonAM.callAMEProcess(paramsMap);
                if ("Submitted".equals(msg)) {
                    submitARDocFor("In Process");
                    msg = "SUCCESS";
                }else if ("Finally Approved".equals(msg)) { //FYI approval only
                    submitARDocFor("Approved");
                } else if ("SUCCESS".equals(msg)) {
                    submitARDocFor("Approved");
                }
                getAssetRequestHdrVO1().setNamedWhereClauseParam("p_request_id", hdrId);
                getAssetRequestHdrVO1().executeQuery();
                
                if(getAssetRequestHdrVO1().hasNext()){
                    getAssetRequestHdrVO1().next();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return msg;

    }
    
    public void submitARDocFor(String toDocStatus) {
        try {
            if (getAssetRequestHdrVO1().getCurrentRow() != null) {
                AssetRequestHdrVORowImpl hdrRow = (AssetRequestHdrVORowImpl) getAssetRequestHdrVO1().getCurrentRow();
                if ("In Process".equals(toDocStatus)) {
                    hdrRow.setRequestStatus("P");
                    hdrRow.setTransRequestStatus(toDocStatus);
                } else if ("Approved".equals(toDocStatus)) {
                    hdrRow.setRequestStatus("A");
                    hdrRow.setTransRequestStatus(toDocStatus);
                }
                getDBTransaction().commit();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setActionHistoryForARDocument() {
           try {
               AssetRequestHdrVORowImpl currRow = (AssetRequestHdrVORowImpl) getAssetRequestHdrVO1().getCurrentRow();

               ActionHistoryVOImpl approvalHIstVo = getActionHistoryVO1();
               approvalHIstVo.applyViewCriteria(null);
               approvalHIstVo.setNamedWhereClauseParam("p_doc_id", currRow.getRequestId());
               approvalHIstVo.setNamedWhereClauseParam("p_doc_type_id", 49);
               approvalHIstVo.setApplyViewCriteriaName("ActionHistoryVOCriteria");
               approvalHIstVo.setRangeSize(-1);
               approvalHIstVo.executeQuery();
           } catch (Exception e) {
    
                e.printStackTrace();
                    
    
           }
        }

    
    /*------------------------------------------------------------Method ends-------------------------------------------------------------------------------*/


    /**
     * Container's getter for AssetAllocationSearchVO1.
     * @return AssetAllocationSearchVO1
     */
    public AssetAllocationSearchVOImpl getAssetAllocationSearchVO1() {
        return (AssetAllocationSearchVOImpl) findViewObject("AssetAllocationSearchVO1");
    }

    /**
     * Container's getter for TransAssetAllocationSearchVO1.
     * @return TransAssetAllocationSearchVO1
     */
    public TransAssetAllocationSearchVOImpl getTransAssetAllocationSearchVO1() {
        return (TransAssetAllocationSearchVOImpl) findViewObject("TransAssetAllocationSearchVO1");
    }
    
    /*------------------------------------------------------------Asset Allocation-------------------------------------------------------------------------------*/
    
    public String createTransAssetAllocationSearch(){
        String message = "Success";
        try {
            getTransAssetAllocationSearchVO1().executeQuery();
            TransAssetAllocationSearchVORowImpl searchRow =
                (TransAssetAllocationSearchVORowImpl) getTransAssetAllocationSearchVO1().getCurrentRow();
            if(searchRow != null){
                searchRow.remove();
            }
            searchRow = (TransAssetAllocationSearchVORowImpl) getTransAssetAllocationSearchVO1().createRow();
            getTransAssetAllocationSearchVO1().insertRow(searchRow);
        }catch (Exception e) {
            e.printStackTrace();
            message = e.getMessage();
        }
        return message;
    }
    
    public String searchAssetAllocation(){
        String message = "Success";
        try {
            TransAssetAllocationSearchVORowImpl searchRow =
                (TransAssetAllocationSearchVORowImpl) getTransAssetAllocationSearchVO1().getCurrentRow();
            if(searchRow != null){
                if(searchRow.getTransSrcBuId() == null) {
                    return "Source Business unit is required.";
                }
                else if(("Y".equals(searchRow.getTransSrcDivRequired()) && searchRow.getTransSrcDivision() == null)) {
                    return "Source Divison is required for the seleted Source Business Unit.";
                }
                else if(searchRow.getTransReqBuId() == null) {
                    return "Requesting Business Unit is required.";
                }

                getAssetAllocationSearchVO1().setNamedWhereClauseParam("p_src_bu_id", searchRow.getTransSrcBuId());
                getAssetAllocationSearchVO1().setNamedWhereClauseParam("p_src_div_flex_val_id", searchRow.getTransSrcDivFlexValueId());
                getAssetAllocationSearchVO1().setNamedWhereClauseParam("p_req_bu_id", searchRow.getTransReqBuId());
                getAssetAllocationSearchVO1().setNamedWhereClauseParam("p_contract_id", searchRow.getTransContractId());
                getAssetAllocationSearchVO1().setNamedWhereClauseParam("p_customer_type", searchRow.getTransCustTypeCode());
                getAssetAllocationSearchVO1().setNamedWhereClauseParam("p_project_id", searchRow.getTransProjectId());
                getAssetAllocationSearchVO1().setNamedWhereClauseParam("p_div_flex_val_id", searchRow.getTransDivFlexValueId());
                getAssetAllocationSearchVO1().setNamedWhereClauseParam("p_dept_flex_val_id", searchRow.getTransDeptFlexValueId());
                getAssetAllocationSearchVO1().setNamedWhereClauseParam("p_allocation_number", searchRow.getTransAllocationNumber());
                getAssetAllocationSearchVO1().setNamedWhereClauseParam("p_customer_id", searchRow.getTransCustomerId());
                getAssetAllocationSearchVO1().setNamedWhereClauseParam("p_allocation_date", searchRow.getTransAllocationDate());
                
                getAssetAllocationSearchVO1().executeQuery();
            }
        }catch (Exception e) {
            e.printStackTrace();
            message = e.getMessage();
        }
        return message;
    }
    
    public String resetAssetAllocations(){
        String message = "Success";
        try {
            TransAssetAllocationSearchVORowImpl searchRow =
                (TransAssetAllocationSearchVORowImpl) getTransAssetAllocationSearchVO1().getCurrentRow();
            if(searchRow != null){
                searchRow.setTransSrcBuId(null);
                searchRow.setTransSrcBuName(null);
                searchRow.setTransSrcDivRequired(null);
                searchRow.setTransSrcDivFlexValueId(null);
                searchRow.setTransSrcDivRequired(null);
                searchRow.setTransSrcDivSegmentNumber(null);
                searchRow.setTransReqBuName(null);
                searchRow.setTransReqBuId(null);
                searchRow.setTransReqDeptSegmentNumber(null);
                searchRow.setTransReqDivSegmentNumber(null);
                searchRow.setTransContractNumber(null);
                searchRow.setTransContractId(null);
                searchRow.setTransCustType(null);                
                searchRow.setTransCustTypeCode(null);
                searchRow.setTransProject(null);
                searchRow.setTransProjectId(null);
                searchRow.setTransDivision(null);
                searchRow.setTransDivFlexValueId(null);
                searchRow.setTransDeptName(null);
                searchRow.setTransDeptFlexValueId(null);
                searchRow.setTransCustomerName(null);
                searchRow.setTransCustomerId(null);
                searchRow.setTransAllocationNumber(null);
                searchRow.setTransAllocationDate(null);
                
                getAssetAllocationSearchVO1().setNamedWhereClauseParam("p_src_bu_id", null);
                getAssetAllocationSearchVO1().setNamedWhereClauseParam("p_src_div_flex_val_id", null);
                getAssetAllocationSearchVO1().setNamedWhereClauseParam("p_req_bu_id", null);
                getAssetAllocationSearchVO1().setNamedWhereClauseParam("p_contract_id", null);
                getAssetAllocationSearchVO1().setNamedWhereClauseParam("p_customer_type", null);
                getAssetAllocationSearchVO1().setNamedWhereClauseParam("p_project_id", null);
                getAssetAllocationSearchVO1().setNamedWhereClauseParam("p_div_flex_val_id", null);
                getAssetAllocationSearchVO1().setNamedWhereClauseParam("p_dept_flex_val_id", null);
                getAssetAllocationSearchVO1().setNamedWhereClauseParam("p_customer_id", null);
                getAssetAllocationSearchVO1().setNamedWhereClauseParam("p_allocation_number", null);
                getAssetAllocationSearchVO1().setNamedWhereClauseParam("p_allocation_date", null);
                
                getAssetAllocationSearchVO1().executeQuery();
            }
        }catch (Exception e) {
            e.printStackTrace();
            message = e.getMessage();
        }
        return message;
    }
    


    public String createAllocation() {
        String msg = "Success";
        try 
        {

            getAssetAllocationVO1().executeQuery();
            
            AssetAllocationVORowImpl newRow = (AssetAllocationVORowImpl) getAssetAllocationVO1().createRow();
            getAssetAllocationVO1().insertRow(newRow);
            newRow.setAllocationStatus("D");
            newRow.setTransAllocationStatus("Draft");                
            
        }
        catch (Exception e) {
            e.printStackTrace();
            msg = e.getMessage();
        }
        return msg;
    }
    
    public String generateAllocationNumber(){
        String message = "Success";
        try {
            oracle.jbo.domain.Number reqNum = new oracle.jbo.domain.Number(0);
            AssetAllocationVORowImpl hdrRow = (AssetAllocationVORowImpl) getAssetAllocationVO1().getCurrentRow();
            if(hdrRow != null && hdrRow.getAllocationNumber() == null){
                getMaxAllocationNumberVO1().setNamedWhereClauseParam("p_bu_id", hdrRow.getSrcBuId());
                getMaxAllocationNumberVO1().setNamedWhereClauseParam("p_div_flex_val_id", hdrRow.getSrcDivFlexValueId());
                getMaxAllocationNumberVO1().executeQuery();
                MaxAllocationNumberVORowImpl reqRow = (MaxAllocationNumberVORowImpl) getMaxAllocationNumberVO1().first();
                if(getMaxAllocationNumberVO1().getRowCount() > 0)
                {
                    reqNum = reqRow.getSeqNum();
                }
                oracle.jbo.domain.Number  seq = updateDocSequenceNumber("AA",hdrRow.getSrcBuId(), hdrRow.getSrcDivFlexValueId(), reqNum);
                if(seq == null){
                    return "Please define Document Sequence and then continue";
                }
                String divCode = getSequenceCode("AA",hdrRow.getSrcBuId(), hdrRow.getSrcDivFlexValueId());
                if(seq != null && divCode == null)
                {
                    hdrRow.setAllocationNumber("AA-"+seq);
                }else if(seq != null && divCode != null){
                    
                    hdrRow.setAllocationNumber(divCode+"-AA-"+seq);
                }
            }
        }catch (Exception e) {
            message = e.getMessage();
            e.printStackTrace();
        }
        return message;
    }
    /**
     * Container's getter for AssetAllocationVO1.
     * @return AssetAllocationVO1
     */
    public AssetAllocationVOImpl getAssetAllocationVO1() {
        return (AssetAllocationVOImpl) findViewObject("AssetAllocationVO1");
    } 
    

    /**
     * Container's getter for MaxAllocationNumberVO1.
     * @return MaxAllocationNumberVO1
     */
    public MaxAllocationNumberVOImpl getMaxAllocationNumberVO1() {
        return (MaxAllocationNumberVOImpl) findViewObject("MaxAllocationNumberVO1");
    }
    
    public String setAssetAllocationsSearch(){
        String message = "Success";
        try {
            getTransAssetAllocationSearchVO1().executeQuery();
            TransAssetAllocationSearchVORowImpl transRow =
                (TransAssetAllocationSearchVORowImpl) getTransAssetAllocationSearchVO1().getCurrentRow();
            if(transRow == null){
                transRow = (TransAssetAllocationSearchVORowImpl) getTransAssetAllocationSearchVO1().createRow();
                getTransAssetAllocationSearchVO1().insertRow(transRow);
            }
            
            Map pageFlowScope = ADFContext.getCurrent().getPageFlowScope();
            
            transRow.setTransSrcBuName((String) pageFlowScope.get("aaSrcBuName"));
            transRow.setTransSrcBuId((oracle.jbo.domain.Number) pageFlowScope.get("aaSrcBuId"));
            System.out.println(transRow.getTransSrcBuId());
            System.out.println((oracle.jbo.domain.Number) pageFlowScope.get("aaSrcBuId"));
            transRow.setTransSrcDivision((String) pageFlowScope.get("aaSrcDiv"));
            transRow.setTransSrcDivFlexValueId((oracle.jbo.domain.Number) pageFlowScope.get("aaSrcDivFlexValueId"));
            transRow.setTransSrcDivRequired((String) pageFlowScope.get("aaSrcDivRequired"));
            transRow.setTransSrcDivFlexValueSetId((oracle.jbo.domain.Number) pageFlowScope.get("aaSrcDivFlexValueSetId"));
            transRow.setTransSrcDivSegmentNumber((oracle.jbo.domain.Number) pageFlowScope.get("aaSrcDivSegmentNumber"));
            
            transRow.setTransReqBuName((String) pageFlowScope.get("aaReqBuName"));
            transRow.setTransReqBuId((oracle.jbo.domain.Number) pageFlowScope.get("aaReqBuId"));
            transRow.setTransContractNumber((String) pageFlowScope.get("aaContractNumber"));
            transRow.setTransContractId((oracle.jbo.domain.Number) pageFlowScope.get("aaContractId"));
            transRow.setTransCustTypeCode((String) pageFlowScope.get("aaCustTypeCode"));
            transRow.setTransCustType((String) pageFlowScope.get("aaCustType"));
            transRow.setTransProject((String) pageFlowScope.get("aaProject"));
            transRow.setTransProjectId((oracle.jbo.domain.Number) pageFlowScope.get("aaProjectId"));    
            
            
            transRow.setTransDivision((String) pageFlowScope.get("aaDiv"));
            transRow.setTransDivFlexValueId((oracle.jbo.domain.Number) pageFlowScope.get("aaDivFlexValueId"));           
            transRow.setTransDeptName((String) pageFlowScope.get("aaDeptName"));
            transRow.setTransDeptFlexValueId((oracle.jbo.domain.Number) pageFlowScope.get("aaDeptFlexValueId"));
            
            transRow.setTransCustomerName((String) pageFlowScope.get("aaCustomerName"));
            transRow.setTransCustomerId((oracle.jbo.domain.Number) pageFlowScope.get("aaCustomerId"));
            
            transRow.setTransAllocationNumber((String) pageFlowScope.get("aaAllocationNumber"));
            
            if(pageFlowScope.get("aaAllocationDate") != null)
            {
                oracle.jbo.domain.Date jboDate1 = new oracle.jbo.domain.Date(pageFlowScope.get("aaAllocationDate").toString());
                transRow.setTransAllocationDate(jboDate1);
            }
            
            transRow.setTransSrcDivRequired((String) pageFlowScope.get("aaSrcDivRequired"));
            transRow.setTransSrcDivSegmentNumber((oracle.jbo.domain.Number) pageFlowScope.get("aaSrcDivSegmentNumber"));
            transRow.setTransReqDivSegmentNumber((oracle.jbo.domain.Number) pageFlowScope.get("aaReqDivSegmentNumber"));
            transRow.setTransReqDeptSegmentNumber((oracle.jbo.domain.Number) pageFlowScope.get("aaReqDeptSegmentNumber"));

            getAssetAllocationSearchVO1().setNamedWhereClauseParam("p_src_bu_id", transRow.getTransSrcBuId());
            getAssetAllocationSearchVO1().setNamedWhereClauseParam("p_src_div_flex_val_id", transRow.getTransSrcDivFlexValueId());
            getAssetAllocationSearchVO1().setNamedWhereClauseParam("p_req_bu_id", transRow.getTransReqBuId());
            getAssetAllocationSearchVO1().setNamedWhereClauseParam("p_contract_id", transRow.getTransContractId());
            getAssetAllocationSearchVO1().setNamedWhereClauseParam("p_customer_type", transRow.getTransCustTypeCode());
            getAssetAllocationSearchVO1().setNamedWhereClauseParam("p_project_id", transRow.getTransProjectId());
            getAssetAllocationSearchVO1().setNamedWhereClauseParam("p_div_flex_val_id", transRow.getTransDivFlexValueId());
            getAssetAllocationSearchVO1().setNamedWhereClauseParam("p_dept_flex_val_id", transRow.getTransDeptFlexValueId());
            getAssetAllocationSearchVO1().setNamedWhereClauseParam("p_allocation_number", transRow.getTransAllocationNumber());
            getAssetAllocationSearchVO1().setNamedWhereClauseParam("p_customer_id", transRow.getTransCustomerId());
            getAssetAllocationSearchVO1().setNamedWhereClauseParam("p_allocation_date", transRow.getTransAllocationDate());
            
            getAssetAllocationSearchVO1().executeQuery();
            
        }catch (Exception e) {
            message = e.getMessage();
            e.printStackTrace();
        }
        return message;
    }
    
  
    /**
     * Container's getter for AssetAccessoriesVO1.
     * @return AssetAccessoriesVO1
     */
    public AssetAccessoriesVOImpl getAssetAccessoriesVO1() {
        return (AssetAccessoriesVOImpl) findViewObject("AssetAccessoriesVO1");
    }


    /**
     * Container's getter for AssetAllocationLinesVO1.
     * @return AssetAllocationLinesVO1
     */
    public AssetAllocationLinesVOImpl getAssetAllocationLinesVO1() {
        return (AssetAllocationLinesVOImpl) findViewObject("AssetAllocationLinesVO1");
    }

    /**
     * Container's getter for AssetAllocationToLinesVL1.
     * @return AssetAllocationToLinesVL1
     */
    public ViewLinkImpl getAssetAllocationToLinesVL1() {
        return (ViewLinkImpl) findViewLink("AssetAllocationToLinesVL1");
    }

    /**
     * Container's getter for AssetAllocationDetailsVO1.
     * @return AssetAllocationDetailsVO1
     */
    public AssetAllocationDetailsVOImpl getAssetAllocationDetailsVO1() {
        return (AssetAllocationDetailsVOImpl) findViewObject("AssetAllocationDetailsVO1");
    }

    /**
     * Container's getter for AssetAllocationLinesToDetailsVL1.
     * @return AssetAllocationLinesToDetailsVL1
     */
    public ViewLinkImpl getAssetAllocationLinesToDetailsVL1() {
        return (ViewLinkImpl) findViewLink("AssetAllocationLinesToDetailsVL1");
    }
    
    public String getPopContractLines() 
    {
        String message = "Success";    
        try 
        {
            AssetAllocationVORowImpl hdrRow = (AssetAllocationVORowImpl) getAssetAllocationVO1().getCurrentRow();
            getPopulateContractLinesVO1().executeEmptyRowSet();
            
            getPopulateContractLinesVO1().setNamedWhereClauseParam("p_contract_id", hdrRow.getMasterContractId());
            getPopulateContractLinesVO1().setNamedWhereClauseParam("p_allocation_id", hdrRow.getAllocationId());
            getPopulateContractLinesVO1().executeQuery();           
            
        }
        catch(Exception e) 
        {
            message = e.getMessage();
            e.printStackTrace();
        }
        return message;
    }
        
    /**
     * Container's getter for PopulateContractLinesVO1.
     * @return PopulateContractLinesVO1
     */
    public PopulateContractLinesVOImpl getPopulateContractLinesVO1() {
        return (PopulateContractLinesVOImpl) findViewObject("PopulateContractLinesVO1");
    }
    
    public String selectContractLinesforAllocation(){
        String message = "Success";
        try {
            PopulateContractLinesVOImpl popVO = getPopulateContractLinesVO1();
            RowSetIterator rs = popVO.createRowSetIterator(null);
            while(rs.hasNext()){
                PopulateContractLinesVORowImpl currRow = (PopulateContractLinesVORowImpl) rs.next();
                if(currRow != null){
                    currRow.setTransFlag((String) ADFContext.getCurrent()
                                                            .getPageFlowScope()
                                                            .get("isMarked"));
                }
            }
            System.out.println(getPopulateContractLinesVO1().getRowCount() + "row count");
        }catch (Exception e) {
            e.printStackTrace();
            message = e.getMessage();
        }
        return message;
    }
    
    public String allocateContractLines(){
        String message = "Success";
        try {
            AssetAllocationVORowImpl hdrRow = (AssetAllocationVORowImpl) getAssetAllocationVO1().getCurrentRow();
                        
            RowSetIterator itr = getPopulateContractLinesVO1().createRowSetIterator(null);
            while(itr.hasNext()) 
            {
                PopulateContractLinesVORowImpl conRow = (PopulateContractLinesVORowImpl) itr.next();
                if(conRow != null && "Y".equals(conRow.getTransFlag()))
                {
                    AssetAllocationLinesVORowImpl lineRow =
                        (AssetAllocationLinesVORowImpl) getAssetAllocationLinesVO1().createRow();
                    getAssetAllocationLinesVO1().insertRow(lineRow);
                    lineRow.setContractLineId(conRow.getContractLineId());
                    lineRow.setMasterContractLineId(conRow.getMasterContractLineId());
                    lineRow.setContractLineNum(conRow.getLineNum());
                    lineRow.setRentalType(conRow.getRentalType());
                    lineRow.setTransRentalType(conRow.getTransRentalType());
                    lineRow.setCategoryId(conRow.getCategoryId());
                    lineRow.setTransCategory(conRow.getTransCategory());
                    lineRow.setTransCategoryDescription(conRow.getTransCategoryDescription());
                    lineRow.setQuantity(conRow.getQuantity());
                    lineRow.setQuantityDeployed((oracle.jbo.domain.Number)conRow.getQuantity().minus(conRow.getTransQuantityRemaining()));
                    lineRow.setHiringBasisRuleId(conRow.getHiringBasisRuleId());
                    lineRow.setTransHiringBasis(conRow.getTransHiringBasis());
                    lineRow.setOperatorRequired("W".equals(conRow.getOperatorOption()) ? "Y":"N");
                    lineRow.setTransOperatorRequired("W".equals(conRow.getOperatorOption()) ? "Yes":"No");
                    lineRow.setFuelRequired( "W".equals(conRow.getFuelOption()) ? "Y" : "N");
                    lineRow.setTransFuelSupplyRequired("W".equals(conRow.getFuelOption())? "Yes" : "No");
                    lineRow.setShift(conRow.getShift());
                    lineRow.setTransShiftType(conRow.getTransShift());
                    lineRow.setOnHireDate(conRow.getOnHireDate());
                    lineRow.setOffHireDate(conRow.getOffHireDate());
                    lineRow.setRemarks(conRow.getRemarks());
                }
            }
            System.out.println(getAssetAllocationLinesVO1().getRowCount() + "row count");
            this.getDBTransaction().commit();
//            getAssetAllocationLinesVO1().setNamedWhereClauseParam("p_allocation_id", hdrRow.getAllocationId());
//            getAssetAllocationLinesVO1().setApplyViewCriteriaName("AssetAllocationLinesVOCriteria");
            getAssetAllocationLinesVO1().executeQuery();
        }catch (Exception e) {
            e.printStackTrace();
            message = e.getMessage();
        }
        return message;
    }
    
    public int getMaxDetailNum(oracle.jbo.domain.Number p_line_id) 
    {
        int detailLine = 0;
        try 
        {
            int temp = 0; 
            int currVal = 0;
            getAssetAllocationDetailsValidateVO1().executeEmptyRowSet();
            
            getAssetAllocationDetailsValidateVO1().setNamedWhereClauseParam("p_line_id", p_line_id);
            getAssetAllocationDetailsValidateVO1().setApplyViewCriteriaName("AssetAllocationDetailsValidateVOCriteria1");
            getAssetAllocationDetailsValidateVO1().executeQuery(); 
            
            if(getAssetAllocationDetailsValidateVO1().getRowCount() > 0) 
            {
                RowSetIterator itr = getAssetAllocationDetailsValidateVO1().createRowSetIterator(null);
                while(itr.hasNext()) 
                {
                    AssetAllocationDetailsValidateVORowImpl itrRow =
                        (AssetAllocationDetailsValidateVORowImpl) itr.next();    
                    if(itrRow.getDetailLineNum() != null)
                    {
                        currVal = Integer.parseInt(itrRow.getDetailLineNum().substring(itrRow.getDetailLineNum().indexOf(".")+1));
                        if(currVal > temp)
                        {
                            temp =currVal;
                        }
                    }
                }
            }
            if(temp > 0)
                detailLine = temp;
        }
        catch(Exception e) {
            e.printStackTrace();
            detailLine = 0;
        }
        return detailLine;
    }
    
    public String createAllocationDetails()
    {
        String message = "Success";
        try 
        {
            int n = 1;
            AssetAllocationVORowImpl hdrRow = (AssetAllocationVORowImpl) getAssetAllocationVO1().getCurrentRow();
            AssetAllocationLinesVORowImpl lineRow =
                (AssetAllocationLinesVORowImpl) getAssetAllocationLinesVO1().getCurrentRow();
            
            getAssetAllocationDetailsVO2().executeEmptyRowSet();
            
            getAssetAllocationDetailsVO2().setNamedWhereClauseParam("p_line_id", lineRow.getLineId());
            getAssetAllocationDetailsVO2().setApplyViewCriteriaName("AssetAllocationDetailsVOCriteria");
            getAssetAllocationDetailsVO2().executeQuery();      
            
            if(lineRow.getQuantity().intValue() >  getAssetAllocationDetailsVO2().getRowCount())
            {
                
                AssetAllocationDetailsVORowImpl newRow =
                    (AssetAllocationDetailsVORowImpl) getAssetAllocationDetailsVO1().createRow();
                getAssetAllocationDetailsVO1().insertRow(newRow);
                newRow.setAllocationId(lineRow.getAllocationId());
                newRow.setAllocationLineId(lineRow.getLineId());
                newRow.setAllocationLineNum(lineRow.getContractLineNum());
                newRow.setQuantity(new oracle.jbo.domain.Number(1));
                newRow.setTransDetailStatus("Available");
                newRow.setDetailStatus("A");
                newRow.setTransAssetCategoryId(lineRow.getCategoryId());
                newRow.setTransSrcBuId(hdrRow.getSrcBuId());
                newRow.setTransSrcFlexValueId(hdrRow.getSrcDivFlexValueId());
                //set detail line num
//                getGetMaxDetailsLineNumVO1().setNamedWhereClauseParam("p_line_id", lineRow.getLineId());
//                getGetMaxDetailsLineNumVO1().executeQuery();
//                GetMaxDetailsLineNumVORowImpl numRow = (GetMaxDetailsLineNumVORowImpl) getGetMaxDetailsLineNumVO1().first();
                    n = getMaxDetailNum(lineRow.getLineId()) + 1;
              
                System.out.println(n + "vhdfg fdg");
                newRow.setDetailLineNum(lineRow.getContractLineNum().toString() + "." + n);
                System.out.println(newRow.getDetailLineNum());
            }
            else 
            {
                return "Quantity allocated (" + getAssetAllocationDetailsVO2().getRowCount() + ") should not exceed existing Quantity ("+ lineRow.getQuantity().intValue()+").";    
            }
        }
        catch(Exception e) 
        {
            message = e.getMessage();
            e.printStackTrace();
        }
        return message;
    }

    /**
     * Container's getter for GetMaxDetailsLineNumVO1.
     * @return GetMaxDetailsLineNumVO1
     */
    public GetMaxDetailsLineNumVOImpl getGetMaxDetailsLineNumVO1() {
        return (GetMaxDetailsLineNumVOImpl) findViewObject("GetMaxDetailsLineNumVO1");
    }
 
    /**
     * Container's getter for MaxContractNumVO1.
     * @return MaxContractNumVO1
     */
    public MaxContractNumVOImpl getMaxContractNumVO1() {
        return (MaxContractNumVOImpl) findViewObject("MaxContractNumVO1");
    }

    /**
     * Container's getter for AssetAllocationDetailsVO2.
     * @return AssetAllocationDetailsVO2
     */
    public AssetAllocationDetailsVOImpl getAssetAllocationDetailsVO2() {
        return (AssetAllocationDetailsVOImpl) findViewObject("AssetAllocationDetailsVO2");
    }
    
    public String validateDtlOnHireDate() 
    {
        String message = "Success";
        try 
        {
            AssetAllocationLinesVORowImpl lineRow =
                (AssetAllocationLinesVORowImpl) getAssetAllocationLinesVO1().getCurrentRow();
            AssetAllocationDetailsVORowImpl detailRow =
                (AssetAllocationDetailsVORowImpl) getAssetAllocationDetailsVO1().getCurrentRow();
            if(detailRow.getOnHireDate() != null) 
            {
                if(!( (detailRow.getOnHireDate().dateValue().compareTo(lineRow.getOnHireDate().dateValue()) >= 0)
                    && (detailRow.getOnHireDate().dateValue().compareTo(lineRow.getOffHireDate().dateValue())  <= 0) )
                    ) 
                {
                    detailRow.setOnHireDate(null);
                    return "On hire Date for the current detail should be between "+ lineRow.getOnHireDate().dateValue()+" and " +lineRow.getOffHireDate().dateValue();
                }
                
            }
           
        }
        catch(Exception e) 
        {
            message = e.getMessage();
            e.printStackTrace();    
        }
        return message;
    }
    
    public String validateDtlOffHireDate() 
    {
        String message = "Success";
        try 
            {
                AssetAllocationLinesVORowImpl lineRow =
                    (AssetAllocationLinesVORowImpl) getAssetAllocationLinesVO1().getCurrentRow();
                AssetAllocationDetailsVORowImpl detailRow =
                    (AssetAllocationDetailsVORowImpl) getAssetAllocationDetailsVO1().getCurrentRow();
                if(detailRow.getOffHireDate() != null) 
                {
                    if(!( (detailRow.getOffHireDate().dateValue().compareTo(lineRow.getOnHireDate().dateValue()) >= 0)
                        && (detailRow.getOffHireDate().dateValue().compareTo(lineRow.getOffHireDate().dateValue())  <= 0) )
                        ) 
                    {
                        detailRow.setOffHireDate(null);
                        return "Detail Off hire Date for the current detail should be between "+ lineRow.getOnHireDate().dateValue()+" and " +lineRow.getOffHireDate().dateValue();
                    }
                }
            }
        catch(Exception e) 
        {
            message = e.getMessage();
            e.printStackTrace();
        }
        return message;
    }
    
    public String editAllocation()
    {
        String message = "Success";
        try 
        {
            AssetAllocationSearchVORowImpl currRow =
                (AssetAllocationSearchVORowImpl) getAssetAllocationSearchVO1().getCurrentRow();
            if (currRow != null) {
                getAccessTypeVO1().setNamedWhereClauseParam("p_customer_type", currRow.getCustomerType());
                
                if("P".equals(currRow.getCustomerType())){
                    getAccessTypeVO1().setNamedWhereClauseParam("p_value_id", currRow.getProjectId());
                }else if("C".equals(currRow.getCustomerType())){
                    getAccessTypeVO1().setNamedWhereClauseParam("p_value_id", currRow.getCustomerId());
                }else if("D".equals(currRow.getCustomerType())){
                    getAccessTypeVO1().setNamedWhereClauseParam("p_value_id", currRow.getDeptFlexValueId());
                }else if("DV".equals(currRow.getCustomerType())){
                    getAccessTypeVO1().setNamedWhereClauseParam("p_value_id", currRow.getDivFlexValueId());
                }
                getAccessTypeVO1().setNamedWhereClauseParam("p_src_bu_id", currRow.getSrcBuId());
                getAccessTypeVO1().setNamedWhereClauseParam("p_req_bu_id", currRow.getReqBuId());
                getAccessTypeVO1().setNamedWhereClauseParam("p_src_div_flex_val_id", currRow.getSrcDivFlexValueId());
                
                getAccessTypeVO1().executeQuery();
                
                AccessTypeVORowImpl row = (AccessTypeVORowImpl) getAccessTypeVO1().first();
                
                if(row != null && "F".equals(row.getAccessType())){
                    ADFContext.getCurrent().getPageFlowScope().put("allocationEditFlag", "Y");
                }else{
                    ADFContext.getCurrent().getPageFlowScope().put("allocationEditFlag", "N");
                }
                
                getAssetAllocationVO1().setNamedWhereClauseParam("p_allocation_id", currRow.getAllocationId());
                getAssetAllocationVO1().setApplyViewCriteriaName("AssetAllocationVOCriteria");
                getAssetAllocationVO1().executeQuery();
            }    
        }
        catch(Exception e) 
        {
            message = e.getMessage();
            e.printStackTrace();
        }
        return message;
    }
    
    public String deleteAllocation() 
    {
        String msg = "Success";    
        String message = "Success";
        CallableStatement cs = null;
        try 
        {
            CommonAMImpl commAM =
                (CommonAMImpl)getCommonAM1();
            
            cs = getDBTransaction().createCallableStatement(SYNC_PR_DETAILS, 0);
            cs.setString("p_table_name","Purchase Requisition Header");
            cs.setNull("p_xml_clob1", Types.CLOB);
            cs.setString("p_user", ((Map) ADFContext.getCurrent()
                                                    .getSessionScope()
                                                    .get("userMap")).get("UserName").toString());
            cs.registerOutParameter("p_err_msg", Types.VARCHAR);
            cs.execute();

            message = cs.getString("p_err_msg");
            
            if("Succeed".equals(message))
            {
                searchAssetAllocation();
                AssetAllocationSearchVORowImpl searchRow =
                    (AssetAllocationSearchVORowImpl) getAssetAllocationSearchVO1().getCurrentRow();
                if(searchRow!=null && !("C".equals(searchRow.getAllocationStatus()))) 
                {
                    if(searchRow.getTransPRInterfacedDtlCount() >0) 
                    {
                            return "Cannot delete the record since open PR exists for the selected allocation document.";
                    }
                    else 
                    {
                        //remove lines
                        getAssetAllocationLinesVO2().executeEmptyRowSet();
                        getAssetAllocationLinesVO2().setNamedWhereClauseParam("p_allocation_id", searchRow.getAllocationId());
                        getAssetAllocationLinesVO2().setApplyViewCriteriaName("AssetAllocationLinesVOCriteria");
                        getAssetAllocationLinesVO2().executeQuery();
                        
                        if(getAssetAllocationLinesVO2().getRowCount() > 0) 
                        {
                            RowSetIterator linesItr = getAssetAllocationLinesVO2().createRowSetIterator(null);    
                            while(linesItr.hasNext())
                            {
                                AssetAllocationLinesVORowImpl linesRow = (AssetAllocationLinesVORowImpl) linesItr.next();  
                                
                                //remove details
                                getAssetAllocationDetailsValidateVO1().executeEmptyRowSet();
                                
                                getAssetAllocationDetailsValidateVO1().setNamedWhereClauseParam("p_line_id", linesRow.getLineId());
                                getAssetAllocationDetailsValidateVO1().setApplyViewCriteriaName("AssetAllocationDetailsValidateVOCriteria1");
                                getAssetAllocationDetailsValidateVO1().executeQuery();
                                
                                if(getAssetAllocationDetailsValidateVO1().getRowCount() > 0) {
                                    RowSetIterator dtlItr = getAssetAllocationDetailsValidateVO1().createRowSetIterator(null);
                                    while(dtlItr.hasNext()) 
                                    {
                                        AssetAllocationDetailsValidateVORowImpl dtlRow =
                                            (AssetAllocationDetailsValidateVORowImpl) dtlItr.next();
                                        
                                        dtlRow.remove();
                                    }
                                }
                                linesRow.remove();
                            }
                        }
                        
                        searchRow.remove();
                    }
                }
                else {
                    return "Confirmed allocation cannot be deleted.";
                }
            }
            else  {
                msg = message + " - error while syncing por details";
            }
        }
        catch(Exception e) 
        {
            msg = e.getMessage();
            e.printStackTrace();
        }
        return msg;
    }
    
    public String deleteAllocationLine() 
    {
        String message = "Success";    
        try 
        {
            AssetAllocationVORowImpl hdrRow = (AssetAllocationVORowImpl) getAssetAllocationVO1().getCurrentRow();
            AssetAllocationLinesVORowImpl lineRow =
                (AssetAllocationLinesVORowImpl) getAssetAllocationLinesVO1().getCurrentRow();
            if(lineRow!=null && "D".equals(hdrRow.getAllocationStatus())) 
            {   
                getAssetAllocationDetailsVO2().setNamedWhereClauseParam("p_line_id", lineRow.getLineId());
                getAssetAllocationDetailsVO2().setApplyViewCriteriaName("AssetAllocationDetailsVOCriteria");
                getAssetAllocationDetailsVO2().executeQuery();
//                RowSetIterator itr = getAssetAllocationDetailsVO2().createRowSetIterator(null);
//                while(itr.hasNext()) 
//                {
//                    AssetAllocationDetailsVORowImpl dtRow = (AssetAllocationDetailsVORowImpl) itr.next();    
//                    if(dtRow != null)
//                    {
//                        return "Please d";                       
//                    }
//                }
                if(getAssetAllocationDetailsVO2().getRowCount() > 0) {
                    return "Details Info exists for the selected line. Please delete it's respective details and try again.";
                }
                else
                {
                    lineRow.remove();
                }
            }
        }
        catch(Exception e) 
        {
            message = e.getMessage();
            e.printStackTrace();    
        }
        return message;
    }
    
    public String deleteAllocationDetail() 
    {
        String msg = "Success";
        String message = "Success";
        CallableStatement cs = null;
        try 
        {
            AssetAllocationVORowImpl hdrRow = (AssetAllocationVORowImpl) getAssetAllocationVO1().getCurrentRow();
            AssetAllocationDetailsVORowImpl dtRow =
                (AssetAllocationDetailsVORowImpl) getAssetAllocationDetailsVO1().getCurrentRow();
            if(dtRow!=null && "D".equals(hdrRow.getAllocationStatus())) 
            {
                if("H".equals(dtRow.getAssetType()) && dtRow.getPrNumber() !=null) {
                        CommonAMImpl commAM =
                            (CommonAMImpl)getCommonAM1();
//                        
                        cs = getDBTransaction().createCallableStatement(SYNC_PR_DETAILS, 0);
                        cs.setString("p_table_name","Purchase Requisition Header");
                        cs.setNull("p_xml_clob1", Types.CLOB);
                        cs.setString("p_user", ((Map) ADFContext.getCurrent()
                                                                .getSessionScope()
                                                                .get("userMap")).get("UserName").toString());
                        cs.registerOutParameter("p_err_msg", Types.VARCHAR);
                        cs.execute();
//
                        message = cs.getString("p_err_msg");
//                        
                        if("Succeed".equals(message))
                        {
//                            searchAssetAllocation();
                                getAssetAllocationDetailsVO2().executeEmptyRowSet();
            
                                getAssetAllocationDetailsVO2().setNamedWhereClauseParam("p_dtl_id", dtRow.getAllocationDetailId());
                                getAssetAllocationDetailsVO2().setApplyViewCriteriaName("AssetAllocationDetailsVOCriteria3");
                                getAssetAllocationDetailsVO2().executeQuery();   
                            AssetAllocationDetailsVORowImpl validateRow =
                                (AssetAllocationDetailsVORowImpl) getAssetAllocationDetailsVO2().first();
                            if(validateRow!=null && !("C".equals(hdrRow.getAllocationStatus()))) 
                            {
                                if(validateRow.getTransDtlPRInterfaceCount() >0) 
                                {
                                        return "Cannot delete the record since open PR exists for the selected allocation document.";
                                }
                                
                            }
                            else {
                                return "Confirmed allocation cannot be deleted.";
                            }
                        }
                        else  {
                            return message + " - error while syncing por details";
                        }
//                    return "Cannot delete PR generated detail.";
                }
                
                else
                {
                    dtRow.remove();    
                }
            }
        }
        catch(Exception e) 
        {
            msg=e.getMessage();
            e.printStackTrace();
        }
        return msg;
    }
    
    public String generatePR() 
    {
        String message = "Success";    
        CallableStatement cs = null;
        try 
        {
            CommonAMImpl commAM =
                (CommonAMImpl)getCommonAM1();
            
            AssetAllocationDetailsVORowImpl currRow =
                (AssetAllocationDetailsVORowImpl) getAssetAllocationDetailsVO1().getCurrentRow();
            TransPRInterfaceVORowImpl intRow =
                (TransPRInterfaceVORowImpl) getTransPRInterfaceVO1().getCurrentRow();
            cs = getDBTransaction().createCallableStatement(GENERATE_PR, 0);
            cs.setLong("p_detail_id", currRow.getAllocationDetailId().longValue());
            cs.setLong("p_employee_id",commAM.getCurrentEmployeeId() != null ? commAM.getCurrentEmployeeId().longValue() : -1);
            cs.setLong("p_item_id", intRow.getTransItemId().longValue());
            cs.setInt("p_quantity", intRow.getTransQuantity().intValue());
            cs.setLong("p_organization_id", intRow.getTransOrganizationId().longValue());
            cs.setLong("p_location_id", intRow.getTransLocationId().longValue());
            cs.setDate("p_req_delivery_date", new Date((oracle.jbo.domain.Date)intRow.getTransReqDeliveryDate()).dateValue());
            cs.setString("p_user", ((Map) ADFContext.getCurrent()
                                                    .getSessionScope()
                                                    .get("userMap")).get("UserName").toString());
            cs.registerOutParameter("p_message", Types.VARCHAR);
            cs.execute();

            message = cs.getString("p_message");
            
            getAssetAllocationVO1().executeQuery();
            
        }
        catch(Exception e) 
        {
            message = e.getMessage();    
            e.printStackTrace();
        }
        return message;
    }
    
    
    public String generateDO() 
    {
        String message = "Success";
        CallableStatement cs = null;
        try 
        {
            AssetAllocationVORowImpl hdrRow = (AssetAllocationVORowImpl) getAssetAllocationVO1().getCurrentRow();
            cs = getDBTransaction().createCallableStatement(GENERATE_DEPLOYMENT_ORDER, 0);
            cs.setLong("p_allocation_id", hdrRow.getAllocationId().longValue());
            cs.setString("p_user", ((Map) ADFContext.getCurrent()
                                                    .getSessionScope()
                                                    .get("userMap")).get("UserName").toString());
            cs.registerOutParameter("p_message", Types.VARCHAR);
            cs.execute();

            message = cs.getString("p_message");
            
            getAssetAllocationVO1().setNamedWhereClauseParam("p_allocation_id", hdrRow.getAllocationId());
            getAssetAllocationVO1().setApplyViewCriteriaName("AssetAllocationVOCriteria");
            getAssetAllocationVO1().executeQuery();
        }
        catch(Exception e) 
        {
            e.printStackTrace();    
        }
        return message;
    }
    
    public void createTransPRPopupSearch(){
        String message = "Success";
        try {
            AssetAllocationVORowImpl hdrRow = (AssetAllocationVORowImpl) getAssetAllocationVO1().getCurrentRow();
            ADFContext.getCurrent().getPageFlowScope().put("DOSrcBuId", hdrRow.getSrcBuId());
            getTransPRInterfaceVO1().executeQuery();
//            TransPRInterfaceVORowImpl searchRow =
//                (TransPRInterfaceVORowImpl) getTransPRInterfaceVO1().getCurrentRow();
//            if(searchRow != null){
//                searchRow.remove();
//            }
            TransPRInterfaceVORowImpl searchRow = (TransPRInterfaceVORowImpl) getTransPRInterfaceVO1().createRow();
            getTransPRInterfaceVO1().insertRow(searchRow);
            searchRow.setTransReqDeliveryDate((Date) Date.getCurrentDate());
//            System.out.println(hdrRow.getSrcBuId());
//            searchRow.setTransSrcBuId(hdrRow.getSrcBuId());
//            System.out.println(searchRow.getTransSrcBuId());
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
    
      
      
    public String validatePRDetails() 
    {
        String message = "Success";
        try 
        {
            AssetAllocationDetailsVORowImpl dtRow =
                (AssetAllocationDetailsVORowImpl) getAssetAllocationDetailsVO1().getCurrentRow();
            if(!("Hired".equals(dtRow.getTransAssetType()))) {
                return "PR generation is required only for Hired Assets.";
            }
        }
        catch(Exception e) 
        {
            message = e.getMessage();
            e.printStackTrace();
        }
        return message;
    }
    
    public String allocatedAssetEmpNumChange() 
    {
        String message = "Success";    
        try 
        {
            AssetAllocationLinesVORowImpl lineRow =
                (AssetAllocationLinesVORowImpl) getAssetAllocationLinesVO1().getCurrentRow();
            AssetAllocationDetailsVORowImpl dtRow =
                (AssetAllocationDetailsVORowImpl) getAssetAllocationDetailsVO1().getCurrentRow();
            if((dtRow.getEntity(0).getEntityState() == 0 ||dtRow.getEntity(0).getEntityState() == 2) && (lineRow.getRentalType() != null))             
            {
                if(!("O".equals(lineRow.getRentalType())))
                {
                    getAssetAllocationDetailsVO3().executeEmptyRowSet();
                    
                    getAssetAllocationDetailsVO3().setNamedWhereClauseParam("p_asset_id", dtRow.getAssetId());
                    getAssetAllocationDetailsVO3().setNamedWhereClauseParam("p_dtl_id", dtRow.getAllocationDetailId());
                    getAssetAllocationDetailsVO3().setApplyViewCriteriaName("AssetAllocationDetailsVOCriteria1");
                    getAssetAllocationDetailsVO3().executeQuery();  
                    
                    if(getAssetAllocationDetailsVO3().getRowCount() > 0) 
                    {
                        dtRow.setAssetId(null);
                        dtRow.setTransAssetNumber(null);
                        dtRow.setTransAssetDesc(null);
                        return "Selected Asset is already allocated!!";    
                    }
                }
                else if("O".equals(lineRow.getRentalType()))
                {
                    getAssetAllocationDetailsVO3().executeEmptyRowSet();
                    
                    getAssetAllocationDetailsVO3().setNamedWhereClauseParam("p_emp_id", dtRow.getEmployeeId());
                    getAssetAllocationDetailsVO3().setNamedWhereClauseParam("p_dtl_id", dtRow.getAllocationDetailId());
                    getAssetAllocationDetailsVO3().setApplyViewCriteriaName("AssetAllocationDetailsVOCriteria2");
                    getAssetAllocationDetailsVO3().executeQuery();  
                    
                    if(getAssetAllocationDetailsVO3().getRowCount() > 0) 
                    {
                        dtRow.setEmployeeId(null);
                        dtRow.setTransEmpNumber(null);
                        dtRow.setTransEmpName(null);
                        return "Selected Employee is already assigned!!";    
                    }
                }
                
            }
        }
        catch(Exception e) 
        {
            message = e.getMessage();
            e.printStackTrace();    
        }
        return message;
    }
    
    public String validateDetails() 
    {
        String message = "Success";   
        try 
        {
            AssetAllocationVORowImpl hdrRow =
                (AssetAllocationVORowImpl) getAssetAllocationVO1().getCurrentRow();
            if(getAssetAllocationLinesVO1().getRowCount() == 0 || getAssetAllocationDetailsVO1().getRowCount() == 0){
                return "Please add details to generate DO for this Allocation";
            }
                        
            getAssetAllocationDetailsValidateVO1().executeEmptyRowSet();
            
            getAssetAllocationDetailsValidateVO1().setNamedWhereClauseParam("p_allocation_id", hdrRow.getAllocationId());
            getAssetAllocationDetailsValidateVO1().setApplyViewCriteriaName("AssetAllocationDetailsValidateVOCriteria");
            getAssetAllocationDetailsValidateVO1().executeQuery(); 
            
            if(getAssetAllocationDetailsValidateVO1().getRowCount() > 0) 
            {
                AssetAllocationDetailsValidateVORowImpl validateRow =
                    (AssetAllocationDetailsValidateVORowImpl) getAssetAllocationDetailsValidateVO1().first();
                
                return "PR is not generated for the Hired Asset - " + validateRow.getTransAssetNumber() +". Please generate PR for all Hired Assets before Deployment Order Generation.";   
            }
            getApprovalHoldCheckVO1().setNamedWhereClauseParam("p_contract_id", hdrRow.getContractId());
            getApprovalHoldCheckVO1().executeQuery();
            
            ApprovalHoldCheckVORowImpl checkRow = (ApprovalHoldCheckVORowImpl) getApprovalHoldCheckVO1().first();
            if(checkRow != null && "Y".equals(checkRow.getHoldFlag())){
                return "Contract is in Hold for Approval in Credit Control. Can't generate Deployment Order now";
            }
            
        }
        catch(Exception e) 
        {
            message = e.getMessage();
            e.printStackTrace();    
        }
        return message;
    }
    
    /**
     * Container's getter for AssetAllocationDetailsValidateVO1.
     * @return AssetAllocationDetailsValidateVO1
     */
    public AssetAllocationDetailsValidateVOImpl getAssetAllocationDetailsValidateVO1() {
        return (AssetAllocationDetailsValidateVOImpl) findViewObject("AssetAllocationDetailsValidateVO1");
    }
    
    public String addInspectionInfo() 
    {
        String msg = "Success";
        try 
        {
            DeploymentOrderLinesVORowImpl lineRow =
                (DeploymentOrderLinesVORowImpl) getDeploymentOrderLinesVO1().getCurrentRow();
            if(lineRow!=null) 
            {
                DeploymentOrderInspectionVORowImpl newRow =
                    (DeploymentOrderInspectionVORowImpl) getDeploymentOrderInspectionVO1().createRow();    
                getDeploymentOrderInspectionVO1().insertRow(newRow);
                newRow.setDoId(lineRow.getDoId());
                newRow.setDoLineId(lineRow.getDoLineId());
                newRow.setAssetId(lineRow.getAssetId());
                newRow.setTransAssetNumber(lineRow.getTransAssetNumber());
                newRow.setTransSrcBuId(lineRow.getTransSrcBuId());
                
            }
        }
        catch(Exception e) 
        {
            msg = e.getMessage();
            e.printStackTrace();
        }
        return msg;
    }
    
    public String deleteInspectionInfo() 
    {
        String msg  = "Success";
        try 
        {
            DeploymentOrderHdrVORowImpl hdrRow =
                (DeploymentOrderHdrVORowImpl) getDeploymentOrderHdrVO1().getCurrentRow();
            if(hdrRow!=null && !("C".equals(hdrRow.getDoStatus()))) 
            {
                DeploymentOrderInspectionVORowImpl newRow =
                    (DeploymentOrderInspectionVORowImpl) getDeploymentOrderInspectionVO1().getCurrentRow();
                newRow.remove();
            }
        }
        catch(Exception e) 
       {
            msg = e.getMessage();
           e.printStackTrace();
       }
        return msg;
    }
   
    public String setDeploymentOrderHdr(){
        String message = "Success";
        try {
            oracle.jbo.domain.Number doHdrId = (Number) ADFContext.getCurrent()
                                                                  .getPageFlowScope()
                                                                  .get("allocationDoHdrId");
            if(doHdrId != null){
                getDeploymentOrderHdrVO1().setApplyViewCriteriaName(null);
                getDeploymentOrderHdrVO1().executeQuery();
                
                getDeploymentOrderHdrVO1().setNamedWhereClauseParam("p_do_id", doHdrId);
                getDeploymentOrderHdrVO1().setApplyViewCriteriaName("DeploymentOrderHdrVOCriteria");
                getDeploymentOrderHdrVO1().executeQuery();
                
            }
        }catch (Exception e) {
            e.printStackTrace();
            message = e.getMessage();
        }
        return message;
    }
    
    public String setAssetAllocationHdr(){
        String message = "Success";
        try {
            oracle.jbo.domain.Number hdrId = (Number) ADFContext.getCurrent()
                                                                  .getPageFlowScope()
                                                                  .get("allocationHdrId");
            
            if(hdrId != null){
                getAssetAllocationVO1().setApplyViewCriteriaName(null);
                getAssetAllocationVO1().executeQuery();
                
                getAssetAllocationVO1().setNamedWhereClauseParam("p_allocation_id", hdrId);
                getAssetAllocationVO1().setApplyViewCriteriaName("AssetAllocationVOCriteria");
                getAssetAllocationVO1().executeQuery();
                
            }
        }catch (Exception e) {
            e.printStackTrace();
            message = e.getMessage();
        }
        return message;
    }
   
    /*------------------------------------------------------------Methods end-------------------------------------------------------------------------------*/



    /*------------------------------------------------------------Asset Deployment Order-------------------------------------------------------------------------------*/
    
    /**
     * Container's getter for DeploymentOrderSearchVO1.
     * @return DeploymentOrderSearchVO1
     */
    public DeploymentOrderSearchVOImpl getDeploymentOrderSearchVO1() {
        return (DeploymentOrderSearchVOImpl) findViewObject("DeploymentOrderSearchVO1");
    }

    /**
     * Container's getter for TransDeploymentOrderSearchVO1.
     * @return TransDeploymentOrderSearchVO1
     */
    public TransDeploymentOrderSearchVOImpl getTransDeploymentOrderSearchVO1() {
        return (TransDeploymentOrderSearchVOImpl) findViewObject("TransDeploymentOrderSearchVO1");
    }
    
    public String createTransDeploymentOrderSearch() {
        String message = "Success";
        try {
            getTransDeploymentOrderSearchVO1().executeQuery();

            TransDeploymentOrderSearchVORowImpl transRow =
                (TransDeploymentOrderSearchVORowImpl) getTransDeploymentOrderSearchVO1().getCurrentRow();
            if (transRow != null) {
                transRow.remove();
            }
            transRow = (TransDeploymentOrderSearchVORowImpl) getTransDeploymentOrderSearchVO1().createRow();
            getTransDeploymentOrderSearchVO1().insertRow(transRow);
        } catch (Exception e) {
            e.printStackTrace();
            message = e.getMessage();
        }
        return message;
    }
    
    public String setDeploymentOrderSearch(){
        String message = "Success";
        try {
            getTransDeploymentOrderSearchVO1().executeQuery();
            TransDeploymentOrderSearchVORowImpl transRow =
                (TransDeploymentOrderSearchVORowImpl) getTransDeploymentOrderSearchVO1().getCurrentRow();
            if(transRow == null){
                transRow = (TransDeploymentOrderSearchVORowImpl) getTransDeploymentOrderSearchVO1().createRow();
                getTransDeploymentOrderSearchVO1().insertRow(transRow);
            }
            
            Map pageFlowScope = ADFContext.getCurrent().getPageFlowScope();
            
            transRow.setTransSrcBuName((String) pageFlowScope.get("doSrcBuName"));
            transRow.setTransSrcBuId((oracle.jbo.domain.Number) pageFlowScope.get("doSrcBuId"));
            transRow.setTransSrcDivision((String) pageFlowScope.get("doSrcDiv"));
            transRow.setTransSrcDivFlexValueId((oracle.jbo.domain.Number) pageFlowScope.get("doSrcDivFlexValueId"));
            transRow.setTransSrcDivRequired((String) pageFlowScope.get("doSrcDivRequired"));
            transRow.setTransSrcDivFlexValueSetId((oracle.jbo.domain.Number) pageFlowScope.get("doSrcDivFlexValueSetId"));
            transRow.setTransSrcDivSegmentNumber((oracle.jbo.domain.Number) pageFlowScope.get("doSrcDivSegmentNumber"));
            
            transRow.setTransReqBuName((String) pageFlowScope.get("doReqBuName"));
            transRow.setTransReqBuId((oracle.jbo.domain.Number) pageFlowScope.get("doReqBuId"));
            transRow.setTransContractNumber((String) pageFlowScope.get("doContractNumber"));
            transRow.setTransContractId((oracle.jbo.domain.Number) pageFlowScope.get("doContractId"));
            transRow.setTransCustTypeCode((String) pageFlowScope.get("doCustTypeCode"));
            transRow.setTransCustType((String) pageFlowScope.get("doCustType"));
            transRow.setTransProject((String) pageFlowScope.get("doProject"));
            transRow.setTransProjectId((oracle.jbo.domain.Number) pageFlowScope.get("doProjectId"));    
            
            
            transRow.setTransDivision((String) pageFlowScope.get("doDiv"));
            transRow.setTransDivFlexValueId((oracle.jbo.domain.Number) pageFlowScope.get("doDivFlexValueId"));           
            transRow.setTransDeptName((String) pageFlowScope.get("doDeptName"));
            transRow.setTransDeptFlexValueId((oracle.jbo.domain.Number) pageFlowScope.get("doDeptFlexValueId"));
            
            transRow.setTransCustomerName((String) pageFlowScope.get("doCustomerName"));
            transRow.setTransCustomerId((oracle.jbo.domain.Number) pageFlowScope.get("doCustomerId"));
            
            transRow.setTransOrderNumber((String) pageFlowScope.get("doOrderNumber"));
            
            if(pageFlowScope.get("doOrderDate") != null)
            {
                oracle.jbo.domain.Date jboDate1 = new oracle.jbo.domain.Date(pageFlowScope.get("doOrderDate").toString());
                transRow.setTransOrderDate(jboDate1);
            }
            
            transRow.setTransSrcDivRequired((String) pageFlowScope.get("doSrcDivRequired"));
            transRow.setTransSrcDivSegmentNumber((oracle.jbo.domain.Number) pageFlowScope.get("doSrcDivSegmentNumber"));
            transRow.setTransReqDivSegmentNumber((oracle.jbo.domain.Number) pageFlowScope.get("doReqDivSegmentNumber"));
            transRow.setTransReqDeptSegmentNumber((oracle.jbo.domain.Number) pageFlowScope.get("doReqDeptSegmentNumber"));

            getDeploymentOrderSearchVO1().setNamedWhereClauseParam("p_src_bu_id", transRow.getTransSrcBuId());
            getDeploymentOrderSearchVO1().setNamedWhereClauseParam("p_src_div_flex_val_id", transRow.getTransSrcDivFlexValueId());
            getDeploymentOrderSearchVO1().setNamedWhereClauseParam("p_req_bu_id", transRow.getTransReqBuId());
            getDeploymentOrderSearchVO1().setNamedWhereClauseParam("p_contract_id", transRow.getTransContractId());
            getDeploymentOrderSearchVO1().setNamedWhereClauseParam("p_customer_type", transRow.getTransCustTypeCode());
            getDeploymentOrderSearchVO1().setNamedWhereClauseParam("p_project_id", transRow.getTransProjectId());
            getDeploymentOrderSearchVO1().setNamedWhereClauseParam("p_div_flex_val_id", transRow.getTransDivFlexValueId());
            getDeploymentOrderSearchVO1().setNamedWhereClauseParam("p_dept_flex_val_id", transRow.getTransDeptFlexValueId());
            getDeploymentOrderSearchVO1().setNamedWhereClauseParam("p_do_number", transRow.getTransOrderNumber());
            getDeploymentOrderSearchVO1().setNamedWhereClauseParam("p_customer_id", transRow.getTransCustomerId());
            getDeploymentOrderSearchVO1().setNamedWhereClauseParam("p_document_date", transRow.getTransOrderDate());
            
            getDeploymentOrderSearchVO1().executeQuery();
            
        }catch (Exception e) {
            message = e.getMessage();
            e.printStackTrace();
        }
        return message;
    }    
    
    public String saveDeploymentOrder()
    {
        String message="Success";
        try {
           DeploymentOrderHdrVORowImpl hdrrow = (DeploymentOrderHdrVORowImpl) getDeploymentOrderHdrVO1().getCurrentRow();
           if( (hdrrow.getReceivedDate()!=null && getAttachmentsVO4().getRowCount()>=1) || hdrrow.getReceivedDate()==null)
           {
                   message="Success";
            }else{
                   message="Attachments are mandatory..Please add an attachment!!";
               }
       } catch (Exception e) {
            // TODO: Add catch code
            e.printStackTrace();
        }
        return message;
    }
    
    public String searchOrders() 
    {
        String message = "Success"; 
        try 
        {
            TransDeploymentOrderSearchVORowImpl transRow =
                (TransDeploymentOrderSearchVORowImpl) getTransDeploymentOrderSearchVO1().getCurrentRow();
        
            getDeploymentOrderSearchVO1().setNamedWhereClauseParam("p_src_bu_id", transRow.getTransSrcBuId());
            System.out.println("transRow.getTransSrcBuId() : "+transRow.getTransSrcBuId());
            getDeploymentOrderSearchVO1().setNamedWhereClauseParam("p_src_div_flex_val_id", transRow.getTransSrcDivFlexValueId());
            System.out.println("transRow.getTransSrcDivFlexValueId() : "+transRow.getTransSrcDivFlexValueId());
            getDeploymentOrderSearchVO1().setNamedWhereClauseParam("p_req_bu_id", transRow.getTransReqBuId());
            System.out.println("transRow.getTransReqBuId() : "+transRow.getTransReqBuId());
            getDeploymentOrderSearchVO1().setNamedWhereClauseParam("p_contract_id", transRow.getTransContractId());
            System.out.println("transRow.getTransContractId() : "+transRow.getTransContractId());
            getDeploymentOrderSearchVO1().setNamedWhereClauseParam("p_customer_type", transRow.getTransCustTypeCode());
            System.out.println("transRow.getTransCustTypeCode() : "+transRow.getTransCustTypeCode());
            getDeploymentOrderSearchVO1().setNamedWhereClauseParam("p_project_id", transRow.getTransProjectId());
            System.out.println("transRow.getTransProjectId() : "+transRow.getTransProjectId());
            getDeploymentOrderSearchVO1().setNamedWhereClauseParam("p_div_flex_val_id", transRow.getTransDivFlexValueId());
            System.out.println("transRow.getTransDivFlexValueId() : "+transRow.getTransDivFlexValueId());
            getDeploymentOrderSearchVO1().setNamedWhereClauseParam("p_dept_flex_val_id", transRow.getTransDeptFlexValueId());
            getDeploymentOrderSearchVO1().setNamedWhereClauseParam("p_do_number", transRow.getTransOrderNumber());
            getDeploymentOrderSearchVO1().setNamedWhereClauseParam("p_customer_id", transRow.getTransCustomerId());
            getDeploymentOrderSearchVO1().setNamedWhereClauseParam("p_document_date", transRow.getTransOrderDate());
            
            getDeploymentOrderSearchVO1().executeQuery();
            System.out.println(getDeploymentOrderSearchVO1().getRowCount() + "vdfsg");
        }
        catch(Exception e) 
        {
            message = e.getMessage();
            e.printStackTrace();
        }
        return message;
    }
    
    public String resetOrdersSearch(){
        String message = "Success";
        try {
            TransDeploymentOrderSearchVORowImpl searchRow =
                (TransDeploymentOrderSearchVORowImpl) getTransDeploymentOrderSearchVO1().getCurrentRow();
            if(searchRow != null){
                searchRow.setTransSrcBuId(null);
                searchRow.setTransSrcBuName(null);
                searchRow.setTransSrcDivRequired(null);
                searchRow.setTransSrcDivFlexValueId(null);
                searchRow.setTransSrcDivRequired(null);
                searchRow.setTransSrcDivSegmentNumber(null);
                searchRow.setTransReqBuName(null);
                searchRow.setTransReqBuId(null);
                searchRow.setTransReqDeptSegmentNumber(null);
                searchRow.setTransReqDivSegmentNumber(null);
                searchRow.setTransContractNumber(null);
                searchRow.setTransContractId(null);
                searchRow.setTransCustType(null);                
                searchRow.setTransCustTypeCode(null);
                searchRow.setTransProject(null);
                searchRow.setTransProjectId(null);
                searchRow.setTransDivision(null);
                searchRow.setTransDivFlexValueId(null);
                searchRow.setTransDeptName(null);
                searchRow.setTransDeptFlexValueId(null);
                searchRow.setTransCustomerName(null);
                searchRow.setTransCustomerId(null);
                searchRow.setTransOrderNumber(null);
                searchRow.setTransOrderDate(null);
                
                getDeploymentOrderSearchVO1().setNamedWhereClauseParam("p_src_bu_id", null);
                getDeploymentOrderSearchVO1().setNamedWhereClauseParam("p_src_div_flex_val_id", null);
                getDeploymentOrderSearchVO1().setNamedWhereClauseParam("p_req_bu_id", null);
                getDeploymentOrderSearchVO1().setNamedWhereClauseParam("p_contract_id", null);
                getDeploymentOrderSearchVO1().setNamedWhereClauseParam("p_customer_type", null);
                getDeploymentOrderSearchVO1().setNamedWhereClauseParam("p_project_id", null);
                getDeploymentOrderSearchVO1().setNamedWhereClauseParam("p_div_flex_val_id", null);
                getDeploymentOrderSearchVO1().setNamedWhereClauseParam("p_dept_flex_val_id", null);
                getDeploymentOrderSearchVO1().setNamedWhereClauseParam("p_customer_id", null);
                getDeploymentOrderSearchVO1().setNamedWhereClauseParam("p_do_number", null);
                getDeploymentOrderSearchVO1().setNamedWhereClauseParam("p_document_date", null);
                
                getDeploymentOrderSearchVO1().executeQuery();
            }
        }catch (Exception e) {
            e.printStackTrace();
            message = e.getMessage();
        }
        return message;
    }
    
    /**
     * Container's getter for DeploymentOrderHdrVO1.
     * @return DeploymentOrderHdrVO1
     */
    public DeploymentOrderHdrVOImpl getDeploymentOrderHdrVO1() {
        return (DeploymentOrderHdrVOImpl) findViewObject("DeploymentOrderHdrVO1");
    }

    /**
     * Container's getter for DeploymentOrderLinesVO1.
     * @return DeploymentOrderLinesVO1
     */
    public DeploymentOrderLinesVOImpl getDeploymentOrderLinesVO1() {
        return (DeploymentOrderLinesVOImpl) findViewObject("DeploymentOrderLinesVO1");
    }

    /**
     * Container's getter for DeploymentOrderHdrToLinesVL1.
     * @return DeploymentOrderHdrToLinesVL1
     */
    public ViewLinkImpl getDeploymentOrderHdrToLinesVL1() {
        return (ViewLinkImpl) findViewLink("DeploymentOrderHdrToLinesVL1");
    }
    
    public String uploadOrderAttach() {
        String message = "Success";
        try {
            ADFContext adfCtx = ADFContext.getCurrent();
            Map pageFlowScope = adfCtx.getPageFlowScope();
            int ch = -1;

            AttachmentsVOImpl attachmentVO = getAttachmentsVO4();
            AttachmentsVORowImpl currRow = (AttachmentsVORowImpl) attachmentVO.getCurrentRow();
            InputStream in = (InputStream) pageFlowScope.get("orderUploadedFileStream");
            ByteArrayOutputStream bout = new ByteArrayOutputStream();
            new ByteArrayOutputStream();
            try {
                while ((ch = in.read()) != -1) {
                    bout.write(ch);
                }
                in.close();
                bout.close();

                currRow.setAttachmentFile(new BlobDomain(bout.toByteArray()));
            } catch (Exception e) {
                //                System.out.println(e.getMessage());
                return "ERROR";
            }

            String fileName = (String) pageFlowScope.get("orderFileName");
            currRow.setFileName(fileName);
            currRow.setFileType((String) pageFlowScope.get("orderFileType"));
        } catch (Exception e) {
            e.printStackTrace();
            message = e.getMessage();
        }
        return message;
    }
    
    public String addOrderAttachment() {
        String message = "Success";
        try {
            AttachmentsVOImpl attachVO = getAttachmentsVO4();
            AttachmentsVORowImpl newRow = (AttachmentsVORowImpl) attachVO.createRow();
            attachVO.insertRow(newRow);
            newRow.setAttachmentCode("XXADS_DO_HEADER_T");
            newRow.setCategory("Misc");
            newRow.setTransCategory("Miscellaneous");
        } catch (Exception e) {
            e.printStackTrace();
            message = e.getMessage();
        }
        return message;
    }
    
    public String editOrder() 
    {
        String message = "Success";
        try 
        {
            DeploymentOrderSearchVORowImpl currRow =
                (DeploymentOrderSearchVORowImpl) getDeploymentOrderSearchVO1().getCurrentRow();
            if (currRow != null) {
                getAccessTypeVO1().setNamedWhereClauseParam("p_customer_type", currRow.getCustomerType());
                
                if("P".equals(currRow.getCustomerType())){
                    getAccessTypeVO1().setNamedWhereClauseParam("p_value_id", currRow.getProjectId());
                }else if("C".equals(currRow.getCustomerType())){
                    getAccessTypeVO1().setNamedWhereClauseParam("p_value_id", currRow.getCustomerId());
                }else if("D".equals(currRow.getCustomerType())){
                    getAccessTypeVO1().setNamedWhereClauseParam("p_value_id", currRow.getDeptFlexValueId());
                }else if("DV".equals(currRow.getCustomerType())){
                    getAccessTypeVO1().setNamedWhereClauseParam("p_value_id", currRow.getDivFlexValueId());
                }
                getAccessTypeVO1().setNamedWhereClauseParam("p_src_bu_id", currRow.getSrcBuId());
                getAccessTypeVO1().setNamedWhereClauseParam("p_req_bu_id", currRow.getReqBuId());
                getAccessTypeVO1().setNamedWhereClauseParam("p_src_div_flex_val_id", currRow.getSrcDivFlexValueId());
                
                getAccessTypeVO1().executeQuery();
                
                AccessTypeVORowImpl row = (AccessTypeVORowImpl) getAccessTypeVO1().first();
                
                if(row != null && "F".equals(row.getAccessType())){
                    ADFContext.getCurrent().getPageFlowScope().put("doEditFlag", "Y");
                }else{
                    ADFContext.getCurrent().getPageFlowScope().put("doEditFlag", "N");
                }
                
                getDeploymentOrderHdrVO1().setNamedWhereClauseParam("p_do_id", currRow.getDoId());
                getDeploymentOrderHdrVO1().setApplyViewCriteriaName("DeploymentOrderHdrVOCriteria");
                getDeploymentOrderHdrVO1().executeQuery();
            } 
        }
        catch(Exception e) 
        {
            message = e.getMessage();
            e.printStackTrace();
        }
        return message;
    }
    
    public Boolean makeAsADOCurrentRow(oracle.jbo.domain.Number HeaderId) {
        Boolean isSetted = false;

        getDeploymentOrderHdrVO1().setNamedWhereClauseParam("p_do_id", HeaderId);
        getDeploymentOrderHdrVO1().setApplyViewCriteriaName("DeploymentOrderHdrVOCriteria");
        getDeploymentOrderHdrVO1().executeQuery();

        if (getDeploymentOrderHdrVO1().first() != null) {
            DeploymentOrderHdrVORowImpl custRow = (DeploymentOrderHdrVORowImpl) getDeploymentOrderHdrVO1().getCurrentRow();
            if (HeaderId.longValue() == custRow.getDoId().longValue()) {
                isSetted = true;
            }
        }
        return isSetted;
    }
    
    public String callpkgForAMEADOProcessSubmit() {
        CommonAMImpl commonAM = (CommonAMImpl) getCommonAM1();
        String msg = "";
        try {
            DeploymentOrderHdrVORowImpl hdrRow = (DeploymentOrderHdrVORowImpl) getDeploymentOrderHdrVO1().getCurrentRow();
            CommonAMImpl commAM = (CommonAMImpl) getCommonAM1();
            if (hdrRow != null) {
                Map paramsMap = new HashMap();
                paramsMap.put("docId", new oracle.jbo.domain.Number(hdrRow.getDoId()));
                paramsMap.put("docTypeId", new oracle.jbo.domain.Number(56));
                paramsMap.put("ActionCode", "Submit");
                paramsMap.put("currEmpId", commAM.getCurrentEmployeeId() != null ? commAM.getCurrentEmployeeId() : -1);
                paramsMap.put("remarks", "");
                paramsMap.put("docNum", hdrRow.getDoNumber());
                msg = commonAM.callAMEProcess(paramsMap);
                if ("Submitted".equals(msg)) {
                    submitADODocFor("In Process");
                    msg = "SUCCESS";
                }else if ("Finally Approved".equals(msg)) { //FYI approval only
                    submitADODocFor("Confirmed");
                } else if ("SUCCESS".equals(msg)) {
                    submitADODocFor("Confirmed");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return msg;

    }
    
    public void submitADODocFor(String toDocStatus) {
        try {
            if (getDeploymentOrderHdrVO1().getCurrentRow() != null) {
                DeploymentOrderHdrVORowImpl hdrRow = (DeploymentOrderHdrVORowImpl) getDeploymentOrderHdrVO1().getCurrentRow();
                if ("In Process".equals(toDocStatus)) {
                    hdrRow.setDoStatus("P");
                    hdrRow.setTransAdoStatus(toDocStatus);
                } else if ("Confirmed".equals(toDocStatus)) {
                    hdrRow.setDoStatus("C");
                    hdrRow.setTransAdoStatus(toDocStatus);
                }
                getDBTransaction().commit();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public String withdrawADOFromApproval(String remarks) {
        String message = null;
        try {
            if (getDeploymentOrderHdrVO1().getCurrentRow() != null) {
                DeploymentOrderHdrVORowImpl hdrRow = (DeploymentOrderHdrVORowImpl) getDeploymentOrderHdrVO1().getCurrentRow();
                CommonAMImpl commAM = (CommonAMImpl) getCommonAM1();
                CallableStatement st = getDBTransaction().createCallableStatement(WITHDRAW_APPRL_SUBMISSION, 0);
                st.setLong("p_document_type_id", 56);
                st.setLong("p_document_id", hdrRow.getDoId().longValue());
                st.setString("p_remarks", remarks);
                st.setLong("p_user",
                           commAM.getCurrentEmployeeId() != null ? commAM.getCurrentEmployeeId().longValue() : -1);
                st.setString("p_message", null);
                st.registerOutParameter("p_message", Types.VARCHAR);
                st.execute();
                message = st.getString("p_message");
                if ("Success".equals(message)) {
                    DeploymentOrderHdrVORowImpl curRow = (DeploymentOrderHdrVORowImpl) getDeploymentOrderHdrVO1().getCurrentRow();
    //                    curRow.setQuoteStatus("W");
                    curRow.setDoStatus("D");
                    curRow.setTransAdoStatus("Draft");
                    this.getDBTransaction().commit();

                }
                getDeploymentOrderHdrVO1().executeQuery();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return message;
    }
    
    public String checkForDOLines() 
    {
        String message = "Success";
        try 
        {
            if(getDeploymentOrderLinesVO1().getRowCount()  == 0) 
            {
                return "Please add lines to submit the current request. ";
            }
        }
        catch(Exception e) 
        {
            message = e.getMessage();
            e.printStackTrace();
        }
        return message;
    }
    
    public String ConfirmDO() 
    {
        String msg = "Success";
        try 
        {
            getDBTransaction().commit();
            DeploymentOrderHdrVOImpl hdrVO=getDeploymentOrderHdrVO1();
            DeploymentOrderHdrVORowImpl hdrRow = (DeploymentOrderHdrVORowImpl) hdrVO.getCurrentRow();
            hdrRow.setDoStatus("C");
            hdrRow.setTransAdoStatus("Confirmed");
            
            /*Asset related Deployment status updating to Available after receipt*/
            DeploymentOrderLinesVOImpl lineVO=getDeploymentOrderLinesVO1();
            RowSetIterator itr=lineVO.createRowSetIterator(null);
            while(itr.hasNext())
            {
                DeploymentOrderLinesVORowImpl lineRow = (DeploymentOrderLinesVORowImpl) itr.next();
                AssetMasterUpdateVOImpl updateVO=getAssetMasterUpdateVO1();
                updateVO.setNamedWhereClauseParam("p_asset_id", lineRow.getAssetId());
                updateVO.executeQuery();
                AssetMasterUpdateVORowImpl updateRow = (AssetMasterUpdateVORowImpl) updateVO.first();
                if(updateRow!=null)
                {
                    updateRow.setDeploymentStatus("H");
                }
                /*Inserting rows into Asset history table*/
                AssetBillHistoryVOImpl histVO=getAssetBillHistoryVO1();
                AssetBillHistoryVORowImpl historyRow = (AssetBillHistoryVORowImpl) histVO.createRow();
                histVO.insertRow(historyRow);
                historyRow.setTransactionTypeCode("ADO");
                historyRow.setAdoHeaderId(lineRow.getDoId());
                historyRow.setAdoLineId(lineRow.getDoLineId());
                historyRow.setAllocationHeaderId(lineRow.getAllocationId());
                historyRow.setAllocationLineId(lineRow.getAllocationLineId());
                historyRow.setAllocationDetailId(lineRow.getAllocationDetailId());
                historyRow.setAssetId(lineRow.getAssetId());
                historyRow.setUtilizationFlag("N");
                historyRow.setCustomerType(hdrRow.getCustomerType());
                historyRow.setDeploymentDate(lineRow.getDeploymentDate());
                
                /*Asset Allocation line related off hire date and on hire date*/
                AssetAllocationDatesVOImpl dateVO=getAssetAllocationDatesVO1();
                dateVO.setNamedWhereClauseParam("p_allocation_line_id", lineRow.getAllocationLineId());
                dateVO.executeQuery();
                AssetAllocationDatesVORowImpl dateRow = (AssetAllocationDatesVORowImpl) dateVO.first();
                if(dateRow!=null)
                {
                    historyRow.setStartDate(dateRow.getOnHireDate());
                    historyRow.setEndDate(dateRow.getOffHireDate());
                    historyRow.setRentalType(dateRow.getRentalType());
                }
                /*Till here*/
                historyRow.setProjectId(hdrRow.getProjectId());
                historyRow.setCustomerId(hdrRow.getCustomerId());
                historyRow.setCustomerSiteId(hdrRow.getCustSiteId());
                historyRow.setSiteUseId(hdrRow.getSiteUseId());
                historyRow.setDepartmentCode(hdrRow.getDepartmentCode());
                historyRow.setDepartmentName(hdrRow.getDepartmentName());
                historyRow.setDivFlexValId(hdrRow.getDivFlexValueId());
                historyRow.setSrcBuId(hdrRow.getSrcBuId());
                historyRow.setReqBuId(hdrRow.getReqBuId());
                historyRow.setDivision(hdrRow.getDivision());
                historyRow.setCurrentLocation(null);
                historyRow.setBilledFlag("N");
                historyRow.setTypeOfAction(null);
                historyRow.setContractId(lineRow.getContractId());
                historyRow.setMasterContractId(lineRow.getMasterContractId());
                historyRow.setContractLineId(lineRow.getContractLineId());
                historyRow.setMasterContractLineId(lineRow.getMasterContractLineId());
                
                historyRow.setDeptFlexValId(hdrRow.getDeptFlexValueId());
                historyRow.setSrcDivision(hdrRow.getSrcDivision());
                historyRow.setSrcDivFlexValId(hdrRow.getSrcDivFlexValueId());
                historyRow.setDeploymentDate(hdrRow.getDocumentDate());
                /*Till here*/
            }
            /*Deployment status end*/
            
            getDBTransaction().commit();
            hdrVO.executeQuery();
            hdrVO.setCurrentRow(hdrRow);
        }
        catch(Exception e) 
        {
            msg = e.getMessage();   
            e.printStackTrace();
        }
        return msg;
    }
    
    /*------------------------------------------------------------Methods end-------------------------------------------------------------------------------*/

    
    public String createTransDeployementReceiptSearch() {
        String message = "Success";
        try {
            getTransDeploymentReceiptSearchVO1().executeQuery();
            TransDeploymentReceiptSearchVORowImpl searchRow =
                (TransDeploymentReceiptSearchVORowImpl) getTransDeploymentReceiptSearchVO1().getCurrentRow();
            if (searchRow != null) {
                searchRow.remove();
            }
            searchRow = (TransDeploymentReceiptSearchVORowImpl) getTransDeploymentReceiptSearchVO1().createRow();
            getTransDeploymentReceiptSearchVO1().insertRow(searchRow);
            getReceiptSearchVO1().setNamedWhereClauseParam("p_bu_id", searchRow.getTransBuId());
            getReceiptSearchVO1().executeQuery();
        } catch (Exception e) {
            e.printStackTrace();
            message = e.getMessage();
        }
        return message;
    }
    
    public String searchReceipt() {
        String message = "Success";
        try {
            TransDeploymentReceiptSearchVORowImpl searchRow=(TransDeploymentReceiptSearchVORowImpl)getTransDeploymentReceiptSearchVO1().getCurrentRow();
            if (searchRow != null) {
                getReceiptSearchVO1().setNamedWhereClauseParam("p_bu_id", searchRow.getTransBuId());
                getReceiptSearchVO1().setNamedWhereClauseParam("p_contract_id", searchRow.getTransContractId());
                getReceiptSearchVO1()
                    .setNamedWhereClauseParam("p_customer_id", searchRow.getTransCustomerId());
                getReceiptSearchVO1()
                    .setNamedWhereClauseParam("p_customer_type", searchRow.getTransCustomerTypeCode());
                getReceiptSearchVO1()
                    .setNamedWhereClauseParam("p_dept_flex_val_id", searchRow.getTransDeptFlexValueId());
                getReceiptSearchVO1()
                    .setNamedWhereClauseParam("p_div_flex_val_id", searchRow.getTransCustomerDivFlexValueId());
                getReceiptSearchVO1()
                    .setNamedWhereClauseParam("p_document_date", searchRow.getTransReceiptDate());
                getReceiptSearchVO1().setNamedWhereClauseParam("p_dr_id", searchRow.getTransDRId());
                getReceiptSearchVO1()
                    .setNamedWhereClauseParam("p_project_id", searchRow.getTransProjectId());
                getReceiptSearchVO1()
                    .setNamedWhereClauseParam("p_req_bu_id", searchRow.getTransRequestingBuId());
                getReceiptSearchVO1().setNamedWhereClauseParam("p_src_div_flex_val_id", searchRow.getTransDivFlexValueId());
                getReceiptSearchVO1().executeQuery();
            }
        } catch (Exception e) {
            e.printStackTrace();
            message = e.getMessage();
        }
        return message;
    }

    public String resetReceipt() {
        String message = "Success";
        try {
            TransDeploymentReceiptSearchVORowImpl searchRow=(TransDeploymentReceiptSearchVORowImpl)getTransDeploymentReceiptSearchVO1().getCurrentRow();
            if (searchRow != null) {
                searchRow.setTransBuId(null);
                searchRow.setTransBuName(null);
                searchRow.setTransCustomerDivFlexValueId(null);
                searchRow.setTransCustomerDivision(null);
                searchRow.setTransCustomerId(null);
                searchRow.setTransCustomerName(null);
                searchRow.setTransCustomerSite(null);
                searchRow.setTransCustomerType(null);
                searchRow.setTransCustomerTypeCode(null);
                searchRow.setTransDeptFlexValueId(null);
                searchRow.setTransDeptName(null);
                searchRow.setTransDivFlexNum(null);
                searchRow.setTransDivFlexValueId(null);
                searchRow.setTransDivRequired(null);
                searchRow.setTransDivision(null);
                searchRow.setTransProject(null);
                searchRow.setTransProjectId(null);
                searchRow.setTransRequestingBu(null);
                searchRow.setTransRequestingBuId(null);
                searchRow.setTransSiteUseId(null);
                searchRow.setTransSrcDeptFlexSegmentNum(null);
                searchRow.setTransReqDeptFlexSegmentNum(null);
                searchRow.setTransReqDivFlexSegmentNum(null);
                searchRow.setTransContractNumber(null);
                searchRow.setTransContractId(null);
                searchRow.setTransADONumber(null);
                searchRow.setTransDoId(null);
                searchRow.setTransDRId(null);
                searchRow.setTransReceiptDate(null);
                searchRow.setTransADRNumber(null);

                getReceiptSearchVO1().setNamedWhereClauseParam("p_bu_id", null);
                getReceiptSearchVO1().setNamedWhereClauseParam("p_contract_id", null);
                getReceiptSearchVO1()
                    .setNamedWhereClauseParam("p_customer_id", null);
                getReceiptSearchVO1()
                    .setNamedWhereClauseParam("p_customer_type", null);
                getReceiptSearchVO1()
                    .setNamedWhereClauseParam("p_dept_flex_val_id", null);
                getReceiptSearchVO1()
                    .setNamedWhereClauseParam("p_div_flex_val_id", null);
                getReceiptSearchVO1()
                    .setNamedWhereClauseParam("p_document_date", null);
                getReceiptSearchVO1().setNamedWhereClauseParam("p_dr_id", null);
                getReceiptSearchVO1()
                    .setNamedWhereClauseParam("p_project_id", null);
                getReceiptSearchVO1()
                    .setNamedWhereClauseParam("p_req_bu_id", null);
                getReceiptSearchVO1().setNamedWhereClauseParam("p_src_div_flex_val_id", null);
                getReceiptSearchVO1().executeQuery();
            }
        } catch (Exception e) {
            e.printStackTrace();
            message = e.getMessage();
        }
        return message;
    }
    
    public String receiptSourceBuChange() {
        String message = "Success";
        try {
            DeploymentReceiptHdrVORowImpl hdrRow = (DeploymentReceiptHdrVORowImpl) getDeploymentReceiptHdrVO1().getCurrentRow();
            if (hdrRow != null) {
                    hdrRow.setTransReqBu(null);
                    hdrRow.setTransReqBuDeptSegment(null);
                    hdrRow.setTransReqBuDivSegment(null);
                    hdrRow.setReqBuId(null);
                hdrRow.setSrcDivision(null);
                hdrRow.setSrcDivFlexValueId(null);
                hdrRow.setSrcDivFlexValSetId(null);
                hdrRow.setTransCustomerType(null);
                hdrRow.setCustomerType(null);
                hdrRow.setTransProject(null);
                hdrRow.setProjectId(null);
                hdrRow.setTransDepartment(null);
                hdrRow.setDepartmentCode(null);
                hdrRow.setDepartmentName(null);
                hdrRow.setDeptFlexValueId(null);
                hdrRow.setDeptFlexValueSetId(null);
                hdrRow.setDivFlexValueSetId(null);
                
                hdrRow.setDivFlexValueId(null);
                hdrRow.setTransCustomer(null);
                
                hdrRow.setTransCustomerSite(null);
                hdrRow.setCustomerId(null);
                hdrRow.setCustSiteId(null);
                hdrRow.setSiteUseId(null);
                
                hdrRow.setTransContractNumber(null);
                hdrRow.setContractId(null);
                hdrRow.setTransDoNumber(null);
                hdrRow.setDoId(null);

            }
        } catch (Exception e) {
            e.printStackTrace();
            message = e.getMessage();
        }
        return message;
    }
    public String receiptSourceDivChange() {
        String message = "Success";
        try {
            DeploymentReceiptHdrVORowImpl hdrRow = (DeploymentReceiptHdrVORowImpl) getDeploymentReceiptHdrVO1().getCurrentRow();
            if (hdrRow != null) {
                    hdrRow.setTransReqBu(null);
                    hdrRow.setTransReqBuDeptSegment(null);
                    hdrRow.setTransReqBuDivSegment(null);
                    hdrRow.setReqBuId(null);
                
                hdrRow.setTransCustomerType(null);
                hdrRow.setCustomerType(null);
                hdrRow.setTransProject(null);
                hdrRow.setProjectId(null);
                hdrRow.setTransDepartment(null);
                hdrRow.setDepartmentCode(null);
                hdrRow.setDepartmentName(null);
                hdrRow.setDeptFlexValueId(null);
                hdrRow.setDeptFlexValueSetId(null);
                
                hdrRow.setDivFlexValueSetId(null);
                hdrRow.setDivFlexValueId(null);
                hdrRow.setTransCustomer(null);
                
                hdrRow.setTransCustomerSite(null);
                hdrRow.setCustomerId(null);
                hdrRow.setCustSiteId(null);
                hdrRow.setSiteUseId(null);
                
                hdrRow.setTransContractNumber(null);
                hdrRow.setContractId(null);
                hdrRow.setTransDoNumber(null);
                hdrRow.setDoId(null);

            }
        } catch (Exception e) {
            e.printStackTrace();
            message = e.getMessage();
        }
        return message;
    }
    
    public String receiptRequestingBuChange() {
        String message = "Success";
        try {
            DeploymentReceiptHdrVORowImpl hdrRow = (DeploymentReceiptHdrVORowImpl) getDeploymentReceiptHdrVO1().getCurrentRow();
            if (hdrRow != null) {
                hdrRow.setTransCustomerType(null);
                hdrRow.setCustomerType(null);
                hdrRow.setTransProject(null);
                hdrRow.setProjectId(null);
                hdrRow.setTransDepartment(null);
                hdrRow.setDepartmentCode(null);
                hdrRow.setDepartmentName(null);
                hdrRow.setDeptFlexValueId(null);
                hdrRow.setDeptFlexValueSetId(null);
                hdrRow.setDivFlexValueSetId(null);
                
                hdrRow.setDivFlexValueId(null);
                
                hdrRow.setTransCustomer(null);
                hdrRow.setTransCustomerSite(null);
                hdrRow.setCustomerId(null);
                hdrRow.setCustSiteId(null);
                hdrRow.setSiteUseId(null);
                
                hdrRow.setTransContractNumber(null);
                hdrRow.setContractId(null);
                hdrRow.setTransDoNumber(null);
                hdrRow.setDoId(null);
            }
        } catch (Exception e) {
            e.printStackTrace();
            message = e.getMessage();
        }
        return message;
    }
    
    public String receiptContractNoChange() {
        String message = "Success";
        try {
            DeploymentReceiptHdrVORowImpl hdrRow = (DeploymentReceiptHdrVORowImpl) getDeploymentReceiptHdrVO1().getCurrentRow();
            if (hdrRow != null) {
                hdrRow.setTransCustomerType(null);
                hdrRow.setCustomerType(null);
                hdrRow.setTransProject(null);
                hdrRow.setProjectId(null);
                hdrRow.setTransDepartment(null);
                hdrRow.setDepartmentCode(null);
                hdrRow.setDepartmentName(null);
                hdrRow.setDeptFlexValueId(null);
                hdrRow.setDeptFlexValueSetId(null);
                hdrRow.setDivFlexValueSetId(null);
                
                hdrRow.setDivFlexValueId(null);
                
                hdrRow.setTransCustomer(null);
                hdrRow.setTransCustomerSite(null);
                hdrRow.setCustomerId(null);
                hdrRow.setCustSiteId(null);
                hdrRow.setSiteUseId(null);
                
                
                hdrRow.setTransDoNumber(null);
                hdrRow.setDoId(null);
                System.out.println(hdrRow.getSrcBuId());
                System.out.println(hdrRow.getReqBuId());
                System.out.println(hdrRow.getSrcDivFlexValueId());
                System.out.println(hdrRow.getMasterContractId());
                System.out.println(hdrRow.getContractId());
                System.out.println(hdrRow.getMasterContractId1());
            }
        } catch (Exception e) {
            e.printStackTrace();
            message = e.getMessage();
        }
        return message;
    }
    public String receiptDoNoChange() {
        String message = "Success";
        try {
            DeploymentReceiptHdrVORowImpl hdrRow = (DeploymentReceiptHdrVORowImpl) getDeploymentReceiptHdrVO1().getCurrentRow();
            if (hdrRow != null) {
//                hdrRow.setTransCustomerType(null);
//                hdrRow.setCustomerType(null);
//                hdrRow.setTransProject(null);
//                hdrRow.setProjectId(null);
//                hdrRow.setTransDepartment(null);
//                hdrRow.setDepartmentCode(null);
//                hdrRow.setDepartmentName(null);
//                hdrRow.setDeptFlexValueId(null);
//                hdrRow.setDeptFlexValueSetId(null);
//                hdrRow.setDivFlexValueSetId(null);
//                
//                hdrRow.setDivFlexValueId(null);
//                
//                hdrRow.setTransCustomer(null);
//                hdrRow.setTransCustomerSite(null);
//                hdrRow.setCustomerId(null);
//                hdrRow.setCustSiteId(null);
//                hdrRow.setSiteUseId(null);
                
            }
        } catch (Exception e) {
            e.printStackTrace();
            message = e.getMessage();
        }
        return message;
    }
    
    public String setReceiptSearch() {
        String message = "Success";
        try {
            getTransDeploymentReceiptSearchVO1().executeQuery();
            TransDeploymentReceiptSearchVORowImpl searchRow=(TransDeploymentReceiptSearchVORowImpl)getTransDeploymentReceiptSearchVO1().getCurrentRow();
            if (searchRow != null) {
                searchRow.remove();
            }
            searchRow=(TransDeploymentReceiptSearchVORowImpl)getTransDeploymentReceiptSearchVO1().createRow();
            getTransDeploymentReceiptSearchVO1().insertRow(searchRow);
                        
            Map pf = ADFContext.getCurrent().getPageFlowScope();
            searchRow.setTransBuId((oracle.jbo.domain.Number) pf.get("drSrcBuId"));
            searchRow.setTransBuName((String) pf.get("drSrcBu"));
            searchRow.setTransCustomerDivFlexValueId((oracle.jbo.domain.Number) pf.get("drDivFlexValId"));
            searchRow.setTransCustomerDivision((String) pf.get("drDivision"));
            searchRow.setTransCustomerId((oracle.jbo.domain.Number) pf.get("drCustomerId"));
            searchRow.setTransCustomerName((String) pf.get("drCustomerName"));
            searchRow.setTransCustomerSite((String) pf.get("rqsCustomerSite"));
            searchRow.setTransCustomerType((String) pf.get("drCustomerType"));
            searchRow.setTransCustomerTypeCode((String) pf.get("drCustomerTypeCode"));
            searchRow.setTransDeptFlexValueId((oracle.jbo.domain.Number) pf.get("drDeptFlexValId"));
            searchRow.setTransDeptName((String) pf.get("drDepartment"));
            searchRow.setTransDivFlexNum((oracle.jbo.domain.Number) pf.get("drSrcDivSegmentNum"));
            searchRow.setTransDivFlexValueId((oracle.jbo.domain.Number) pf.get("drSrcDivFlexValId"));
            searchRow.setTransDivRequired((String) pf.get("drSrcDivRequired"));
            searchRow.setTransDivision((String) pf.get("drSrcDivision"));
            searchRow.setTransProject((String) pf.get("drProject"));
            searchRow.setTransProjectId((oracle.jbo.domain.Number) pf.get("drProjectId"));
            
            searchRow.setTransReqDeptFlexSegmentNum((oracle.jbo.domain.Number) pf.get("drReqDeptSegmentNum"));
            searchRow.setTransReqDivFlexSegmentNum((oracle.jbo.domain.Number) pf.get("drReqDivSegmentNum"));
            searchRow.setTransRequestingBu((String) pf.get("drReqBu"));
            searchRow.setTransRequestingBuId((oracle.jbo.domain.Number) pf.get("drReqBuId"));
            
            searchRow.setTransSrcDeptFlexSegmentNum((oracle.jbo.domain.Number)pf.get("drSrcDeptSegmentNum"));
            searchRow.setTransContractNumber((String)pf.get("drContractNum"));
            searchRow.setTransContractId((oracle.jbo.domain.Number)pf.get("drContractId"));
            searchRow.setTransADRNumber((String)pf.get("drReceiptNum"));
            searchRow.setTransDRId((oracle.jbo.domain.Number)pf.get("drReceiptId"));
            searchRow.setTransReceiptDate((oracle.jbo.domain.Date)pf.get("drReceiptDate"));

            getReceiptSearchVO1().setNamedWhereClauseParam("p_bu_id", searchRow.getTransBuId());
            getReceiptSearchVO1().setNamedWhereClauseParam("p_contract_id", searchRow.getTransContractId());
            getReceiptSearchVO1()
                .setNamedWhereClauseParam("p_customer_id", searchRow.getTransCustomerId());
            getReceiptSearchVO1()
                .setNamedWhereClauseParam("p_customer_type", searchRow.getTransCustomerType());
            getReceiptSearchVO1()
                .setNamedWhereClauseParam("p_dept_flex_val_id", searchRow.getTransDeptFlexValueId());
            getReceiptSearchVO1()
                .setNamedWhereClauseParam("p_div_flex_val_id", searchRow.getTransDivFlexValueId());
            getReceiptSearchVO1()
                .setNamedWhereClauseParam("p_document_date", searchRow.getTransReceiptDate());
            getReceiptSearchVO1().setNamedWhereClauseParam("p_dr_id", searchRow.getTransDRId());
            getReceiptSearchVO1()
                .setNamedWhereClauseParam("p_project_id", searchRow.getTransProjectId());
            getReceiptSearchVO1()
                .setNamedWhereClauseParam("p_req_bu_id", searchRow.getTransRequestingBuId());
            getReceiptSearchVO1().setNamedWhereClauseParam("p_src_div_flex_val_id", searchRow.getTransDivFlexValueId());
            getReceiptSearchVO1().executeQuery();

        } catch (Exception e) {
            e.printStackTrace();
            message = e.getMessage();
        }
        return message;
    }
    public String lineReceiptDateChange()
    {
        String message="Success";
        try {
            DeploymentReceiptLinesVOImpl lineVO=getDeploymentReceiptLinesVO1();
            DeploymentReceiptLinesVORowImpl lineRow = (DeploymentReceiptLinesVORowImpl) lineVO.getCurrentRow();
            oracle.jbo.domain.Date receiptDate=lineRow.getReceiptDate();
            if(receiptDate!=null)
            {
                ReceiptDateValidateVOImpl validateVO=getReceiptDateValidateVO1();
                validateVO.setNamedWhereClauseParam("p_line_receipt_date", receiptDate);
                validateVO.setNamedWhereClauseParam("p_do_id", lineRow.getDoId());
                validateVO.executeQuery();
                ReceiptDateValidateVORowImpl validateRow = (ReceiptDateValidateVORowImpl) validateVO.first();
                if(validateRow!=null)
                {
                    String flag=validateRow.getReceiptDateFlag();
                    if("Y".equalsIgnoreCase(flag))
                    {
                        lineRow.setReceiptDate(null);
                        return "Receipt date should not be less than Deployment date.Please check.";
                    }
                }
            }
       } catch (Exception e) {
            message=e.getMessage();
            e.printStackTrace();
        }
        return message;
    }
    public String rctLinesDelete()
    {
        String message="Success";
        try {
            DeploymentReceiptLinesVOImpl linesVO=getDeploymentReceiptLinesVO1();
            DeploymentReceiptLinesVORowImpl linesRow = (DeploymentReceiptLinesVORowImpl) linesVO.getCurrentRow();
            if(linesRow!=null)
            {
                DeploymentRcptAccessoriesVOImpl accVO=getDeploymentRcptAccessoriesVO1();
                RowSetIterator itr=accVO.createRowSetIterator(null);
                while(itr.hasNext())
                {
                    DeploymentRcptAccessoriesVORowImpl accRow = (DeploymentRcptAccessoriesVORowImpl) itr.next();
                    oracle.jbo.domain.Number drLineId=accRow.getDrLineId();
                    if(drLineId!=null && drLineId.compareTo(linesRow.getDrLineId())==0)
                    {
                        accRow.remove();
                    }
                }
                DeploymentRcptMobilizationVOImpl mobVO=getDeploymentRcptMobilizationVO1();
                RowSetIterator itr1=mobVO.createRowSetIterator(null);
                while(itr1.hasNext())
                {
                    DeploymentRcptMobilizationVORowImpl mobRow=(DeploymentRcptMobilizationVORowImpl)itr1.next();
                    oracle.jbo.domain.Number drLineId1=mobRow.getDrLineId();
                    if(drLineId1!=null && drLineId1.compareTo(mobRow.getDrLineId())==0)
                    {
                        mobRow.remove();
                    }
                }
            }
            linesVO.removeCurrentRow();
       } catch (Exception e) {
            message=e.getMessage();
            e.printStackTrace();
        }
        return message;
    }
    public String rctLinesAcceDelete()
    {
        String message="Success";
        try {
           DeploymentRcptAccessoriesVOImpl accVO=getDeploymentRcptAccessoriesVO1();
            accVO.removeCurrentRow();
       } catch (Exception e) {
            message=e.getMessage();
            e.printStackTrace();
        }
        return message;
    }
    public String rctLinesMobDelete()
    {
        String message="Success";
        try {
           DeploymentRcptMobilizationVOImpl mobVO=getDeploymentRcptMobilizationVO1();
            mobVO.removeCurrentRow();
       } catch (Exception e) {
            message=e.getMessage();
            e.printStackTrace();
        }
        return message;
    }
    public String refreshRctLinesPopup()
    {
        String message="Success";
        try {
            DeploymentReceiptHdrVOImpl hdrVO=getDeploymentReceiptHdrVO1();
            DeploymentReceiptHdrVORowImpl hdrRow = (DeploymentReceiptHdrVORowImpl) hdrVO.getCurrentRow();
            RctDeployOrderLinesVOImpl popupVO=getRctDeployOrderLinesVO1();
            popupVO.setNamedWhereClauseParam("p_do_id", hdrRow.getDoId());
            popupVO.executeQuery();
            DeploymentReceiptLinesVOImpl linesVO=getDeploymentReceiptLinesVO1();
            RowSetIterator itr=popupVO.createRowSetIterator(null);
            while(itr.hasNext())
            {
                RctDeployOrderLinesVORowImpl popupRow = (RctDeployOrderLinesVORowImpl) itr.next();
                DeploymentReceiptLinesValidateVOImpl validateVO=getDeploymentReceiptLinesValidateVO1();
                validateVO.setApplyViewCriteriaName(null);
                validateVO.executeQuery();
                validateVO.setApplyViewCriteriaName("DeploymentReceiptLinesValidateVOCriteria");
                validateVO.setNamedWhereClauseParam("p_do_line_id", popupRow.getDoLineId());
                validateVO.executeQuery();
                DeploymentReceiptLinesValidateVORowImpl validateRow =
                    (DeploymentReceiptLinesValidateVORowImpl) validateVO.first();
                if(validateRow==null)
                {
                    /*Asset line insertion start*/
                    DeploymentReceiptLinesVORowImpl lineRow = (DeploymentReceiptLinesVORowImpl) linesVO.createRow();
                    linesVO.insertRow(lineRow);
                    lineRow.setDrId(hdrRow.getDrId());
                    lineRow.setDoId(popupRow.getDoId());
                    lineRow.setDoLineId(popupRow.getDoLineId());
                    lineRow.setAllocationLineId(popupRow.getAllocationLineId());
                    lineRow.setAllocationId(popupRow.getAllocationId());
                    lineRow.setContractLineId(popupRow.getContractLineId());
                    lineRow.setMasterContractLineId(popupRow.getMasterContractLineId());
                    lineRow.setContractId(popupRow.getContractId());
                    lineRow.setMasterContractId(popupRow.getMasterContractId());
                    lineRow.setDoLineNum(popupRow.getDoLineNum());
                    lineRow.setAssetId(popupRow.getAssetId());
                    lineRow.setReceivedBy((oracle.jbo.domain.Number) ((Map)ADFContext.getCurrent().getSessionScope().get("userMap")).get("UserId"));
                    lineRow.setTransAssetNumber(popupRow.getTransAssetNumber());
                    lineRow.setTransAssetDesc(popupRow.getTransAssetDesc());
                    lineRow.setTransOnHiredate(popupRow.getTransOnHireDate());
                    lineRow.setTransOffHiredate(popupRow.getTransOffHireDate());
                    lineRow.setTransDeploymentDate(popupRow.getTransDeploymentDate());
                    lineRow.setTransShiftType(popupRow.getTransShiftType());
                    lineRow.setTransOperatorName(popupRow.getTransOperatorName());
                    lineRow.setTransDeployMeterReading(popupRow.getMeterReading());
                    
                    EmployeeDetailsVOImpl detailsVO=getEmployeeDetailsVO1();
                    detailsVO.executeQuery();
                    EmployeeDetailsVORowImpl detailsRow = (EmployeeDetailsVORowImpl) detailsVO.first();
                    if(detailsRow!=null)
                    {
                        lineRow.setTransReceivedBy(detailsRow.getPersonNumber());
                        lineRow.setTransReceivedByEmpName(detailsRow.getEmployeeName());
                    }
                    lineRow.setTransSrcBuId(popupRow.getTransSrcBuId());
                    /*Asset line insertion end*/
                    /*Asset line accessories insertion start*/
                    DeploymentRcptAccessoriesVOImpl accVO=getDeploymentRcptAccessoriesVO1();
                    RctDeployOrderAccessoriesVOImpl popupAccVO=getRctDeployOrderAccessoriesVO1();
                    popupAccVO.setNamedWhereClauseParam("p_do_line_id", popupRow.getDoLineId());
                    popupAccVO.executeQuery();
                    RowSetIterator accItr=popupAccVO.createRowSetIterator(null);
                    while(accItr.hasNext())
                    {
                        RctDeployOrderAccessoriesVORowImpl popupAccVORow =
                            (RctDeployOrderAccessoriesVORowImpl) accItr.next();
                        
                        DeploymentRcptAccessoriesVORowImpl accRow =
                            (DeploymentRcptAccessoriesVORowImpl) accVO.createRow();
                        accVO.insertRow(accRow);
                        accRow.setAssetAccessoryId(popupAccVORow.getAssetAccessoryId());
                        accRow.setAssetId(popupAccVORow.getAssetId());
                        accRow.setDeployedQuantiy(popupAccVORow.getQuantity());
                        accRow.setDoAccessoryId(popupAccVORow.getDoAccessoryId());
                        accRow.setDoLineId(popupAccVORow.getDoLineId());
                        accRow.setDrId(lineRow.getDrId());
                        accRow.setDrLineId(lineRow.getDrLineId());
                        accRow.setTransAssetNumber(popupAccVORow.getTransAssetNumber());
                        accRow.setTransAssetDesc(popupAccVORow.getTransAssetDesc());
                        accRow.setTransShiftType(popupAccVORow.getTransShiftType());
                        accRow.setTransAccessories(popupAccVORow.getTransAccessories());
                        
                    }
                    /*Asset line accessories insertion end*/
                    /*Asset line Mobilization insertion start*/
                    DeploymentRcptMobilizationVOImpl mobVO=getDeploymentRcptMobilizationVO1();
                    RctDeployOrderMobilizationVOImpl popupMobVO=getRctDeployOrderMobilizationVO1();
                    popupMobVO.setNamedWhereClauseParam("p_do_line_id", popupRow.getDoLineId());
                    popupMobVO.executeQuery();
                    RowSetIterator mobItr=popupMobVO.createRowSetIterator(null);
                    while(mobItr.hasNext())
                    {
                        RctDeployOrderMobilizationVORowImpl popupMobRow =
                            (RctDeployOrderMobilizationVORowImpl) mobItr.next();
                        
                        DeploymentRcptMobilizationVORowImpl mobRow =
                            (DeploymentRcptMobilizationVORowImpl) mobVO.createRow();
                        mobVO.insertRow(mobRow);
                        mobRow.setAssetId(popupMobRow.getAssetId());
                        mobRow.setDoLineId(popupMobRow.getDoLineId());
                        mobRow.setDoMobilizationId(popupMobRow.getDoMobilizationId());
                        mobRow.setDrId(lineRow.getDrId());
                        mobRow.setDrLineId(lineRow.getDrLineId());
                        mobRow.setMobilizationAssetId(popupMobRow.getMobilizationAssetId());
                        mobRow.setTransAssetType(popupMobRow.getTransAssetType());
                        mobRow.setTransAssetNumber(popupMobRow.getTransAssetNumber());
                        mobRow.setTransAssetDesc(popupMobRow.getTransAssetDesc());
                        mobRow.setTransShiftType(popupMobRow.getTransShiftType());
                        mobRow.setTransMobilizationAsset(popupMobRow.getTransMobilizationAsset());
                    }
                    /*Asset line Mobilization insertion end*/
                }
            }
            
       } catch (Exception e) {
            message=e.getMessage();
            e.printStackTrace();
        }
        return message;
    }
    
    public String uploadDeployReceiptAttach() {
        String message = "Success";
        try {
            ADFContext adfCtx = ADFContext.getCurrent();
            Map pageFlowScope = adfCtx.getPageFlowScope();
            int ch = -1;

            AttachmentsVOImpl attachmentVO = getAttachmentsVO6();
            AttachmentsVORowImpl currRow = (AttachmentsVORowImpl) attachmentVO.getCurrentRow();
            InputStream in = (InputStream) pageFlowScope.get("rctUploadedFileStream");
            ByteArrayOutputStream bout = new ByteArrayOutputStream();
            new ByteArrayOutputStream();
            try {
                while ((ch = in.read()) != -1) {
                    bout.write(ch);
                }
                in.close();
                bout.close();

                currRow.setAttachmentFile(new BlobDomain(bout.toByteArray()));
            } catch (Exception e) {
                //                System.out.println(e.getMessage());
                return "ERROR";
            }

            String fileName = (String) pageFlowScope.get("rctFileName");
            currRow.setFileName(fileName);
            currRow.setFileType((String) pageFlowScope.get("rctFileType"));
        } catch (Exception e) {
            e.printStackTrace();
            message = e.getMessage();
        }
        return message;
    }
    
    public String addRctAttachment() {
        String message = "Success";
        try {
            AttachmentsVOImpl attachVO = getAttachmentsVO6();
            AttachmentsVORowImpl newRow = (AttachmentsVORowImpl) attachVO.createRow();
            attachVO.insertRow(newRow);
            newRow.setAttachmentCode("XXADS_DR_HEADER_T");
            newRow.setCategory("Misc");
            newRow.setTransCategory("Miscellaneous");
        } catch (Exception e) {
            e.printStackTrace();
            message = e.getMessage();
        }
        return message;
    }
    public String rctConfirm()
    {
        String message="Success";
        try {
            if(getDeploymentReceiptLinesVO1().getRowCount() == 0){
                return "Please add lines to continue confirming the Receipt.";
            }
            
            getDBTransaction().commit();
            DeploymentReceiptHdrVOImpl hdrVO=getDeploymentReceiptHdrVO1();
            DeploymentReceiptHdrVORowImpl hdrRow = (DeploymentReceiptHdrVORowImpl) hdrVO.getCurrentRow();
            hdrRow.setDrStatus("C");
            
            /*Asset related Deployment status updating to Available after receipt*/
            DeploymentReceiptLinesVOImpl lineVO=getDeploymentReceiptLinesVO1();
            RowSetIterator itr=lineVO.createRowSetIterator(null);
            while(itr.hasNext())
            {
                DeploymentReceiptLinesVORowImpl lineRow = (DeploymentReceiptLinesVORowImpl) itr.next();
                AssetMasterUpdateVOImpl updateVO=getAssetMasterUpdateVO1();
                updateVO.setNamedWhereClauseParam("p_asset_id", lineRow.getAssetId());
                updateVO.executeQuery();
                AssetMasterUpdateVORowImpl updateRow = (AssetMasterUpdateVORowImpl) updateVO.first();
                if(updateRow!=null)
                {
                    updateRow.setDeploymentStatus("A");
                }
                /*Inserting rows into Asset history table*/
                AssetBillHistoryVOImpl histVO=getAssetBillHistoryVO1();
                AssetBillHistoryVORowImpl historyRow = (AssetBillHistoryVORowImpl) histVO.createRow();
                histVO.insertRow(historyRow);
                historyRow.setTransactionTypeCode("ADR");
                historyRow.setAdoHeaderId(lineRow.getDoId());
                historyRow.setAdoLineId(lineRow.getDoLineId());
                historyRow.setDeprHeaderId(lineRow.getDrId());
                historyRow.setDeprLineId(lineRow.getDrLineId());
                historyRow.setAllocationHeaderId(lineRow.getAllocationId());
                historyRow.setAllocationLineId(lineRow.getAllocationLineId());
                historyRow.setAssetId(lineRow.getAssetId());
                historyRow.setUtilizationFlag("N");
                historyRow.setCustomerType(hdrRow.getCustomerType());
                
                /*Asset Allocation line related off hire date and on hire date*/
                AssetAllocationDatesVOImpl dateVO=getAssetAllocationDatesVO1();
                dateVO.setNamedWhereClauseParam("p_allocation_line_id", lineRow.getAllocationLineId());
                dateVO.executeQuery();
                AssetAllocationDatesVORowImpl dateRow = (AssetAllocationDatesVORowImpl) dateVO.first();
                if(dateRow!=null)
                {
                    historyRow.setStartDate(dateRow.getOnHireDate());
                    historyRow.setEndDate(dateRow.getOffHireDate());
                    historyRow.setRentalType(dateRow.getRentalType());
                }
                /*Till here*/
                historyRow.setProjectId(hdrRow.getProjectId());
                historyRow.setCustomerId(hdrRow.getCustomerId());
                historyRow.setCustomerSiteId(hdrRow.getCustSiteId());
                historyRow.setSiteUseId(hdrRow.getSiteUseId());
                historyRow.setDepartmentCode(hdrRow.getDepartmentCode());
                historyRow.setDepartmentName(hdrRow.getDepartmentName());
                historyRow.setDivFlexValId(hdrRow.getDivFlexValueId());
                historyRow.setSrcBuId(hdrRow.getSrcBuId());
                historyRow.setReqBuId(hdrRow.getReqBuId());
                historyRow.setDivision(hdrRow.getDivision());
                historyRow.setCurrentLocation(null);
                historyRow.setBilledFlag("N");
                historyRow.setTypeOfAction(null);
                historyRow.setContractId(lineRow.getContractId());
                historyRow.setMasterContractId(lineRow.getMasterContractId());
                historyRow.setContractLineId(lineRow.getContractLineId());
                historyRow.setMasterContractLineId(lineRow.getMasterContractLineId());
                
                historyRow.setDeptFlexValId(hdrRow.getDeptFlexValueId());
                historyRow.setSrcDivision(hdrRow.getSrcDivision());
                historyRow.setSrcDivFlexValId(hdrRow.getSrcDivFlexValueId());
                historyRow.setReceiptDate(lineRow.getReceiptDate());
                historyRow.setAllocationDetailId(lineRow.getAllocationDetailId());
                /*Till here*/
            }
            /*Deployment status end*/
            
            getDBTransaction().commit();
            hdrVO.setNamedWhereClauseParam("p_receipt_id", hdrRow.getDrId());
            hdrVO.executeQuery();
            hdrVO.setCurrentRow(hdrRow);
       } catch (Exception e) {
            message=e.getMessage();
            e.printStackTrace();
        }
        return message;
    }
    
    public String getPopDeployLines() 
    {
        String message = "Success";    
        try 
        {
            DeploymentReceiptHdrVORowImpl hdrRow=(DeploymentReceiptHdrVORowImpl)getDeploymentReceiptHdrVO1().getCurrentRow();
            
            if(hdrRow.getSrcBuId()==null || hdrRow.getReqBuId()==null || hdrRow.getContractId()==null ||hdrRow.getDoId()==null || ("Y".equalsIgnoreCase(hdrRow.getTransSourceDivRequired()) && hdrRow.getSrcDivision()==null))
            {
                return "Please provide mandatory columns in the header.";
            }
            
            getRctDeployOrderLinesVO1().executeEmptyRowSet();
            
            getRctDeployOrderLinesVO1().setNamedWhereClauseParam("p_do_id", hdrRow.getDoId());
            getRctDeployOrderLinesVO1().executeQuery();           
        }
        catch(Exception e) 
        {
            message = e.getMessage();
            e.printStackTrace();
        }
        return message;
    }
    
    public String selectDeployLinesforReceipt(){
        String message = "Success";
        try {
            RctDeployOrderLinesVOImpl popVO = getRctDeployOrderLinesVO1();
            RowSetIterator rs = popVO.createRowSetIterator(null);
            while(rs.hasNext()){
                RctDeployOrderLinesVORowImpl currRow = (RctDeployOrderLinesVORowImpl) rs.next();
                if(currRow != null){
                    currRow.setTransFlag((String) ADFContext.getCurrent()
                                                            .getPageFlowScope()
                                                            .get("isMarked"));
                }
            }
        }catch (Exception e) {
            e.printStackTrace();
            message = e.getMessage();
        }
        return message;
    }
    public String insertDeployLinesInReceipt()
    {
        String message="Success";
        try {
            DeploymentReceiptHdrVOImpl hdrVO=getDeploymentReceiptHdrVO1();
            DeploymentReceiptHdrVORowImpl hdrRow = (DeploymentReceiptHdrVORowImpl) hdrVO.getCurrentRow();
            
           RctDeployOrderLinesVOImpl popVO = getRctDeployOrderLinesVO1();
           RowSetIterator rs = popVO.createRowSetIterator(null);
           DeploymentReceiptLinesVOImpl linesVO=getDeploymentReceiptLinesVO1();
            while(rs.hasNext())
            {
                RctDeployOrderLinesVORowImpl popupRow = (RctDeployOrderLinesVORowImpl) rs.next();
                if("Y".equalsIgnoreCase(popupRow.getTransFlag()))
                {
                    DeploymentReceiptLinesValidateVOImpl validateVO=getDeploymentReceiptLinesValidateVO1();
                    validateVO.setApplyViewCriteriaName(null);
                    validateVO.executeQuery();
                    validateVO.setApplyViewCriteriaName("DeploymentReceiptLinesValidateVOCriteria");
                    validateVO.setNamedWhereClauseParam("p_do_line_id", popupRow.getDoLineId());
                    validateVO.executeQuery();
                    DeploymentReceiptLinesValidateVORowImpl validateRow =
                        (DeploymentReceiptLinesValidateVORowImpl) validateVO.first();
                    if(validateRow==null)
                    {
                        /*Asset line insertion start*/
                        DeploymentReceiptLinesVORowImpl lineRow = (DeploymentReceiptLinesVORowImpl) linesVO.createRow();
                        linesVO.insertRow(lineRow);
                        lineRow.setDrId(hdrRow.getDrId());
                        lineRow.setDoId(popupRow.getDoId());
                        lineRow.setDoLineId(popupRow.getDoLineId());
                        lineRow.setAllocationLineId(popupRow.getAllocationLineId());
                        lineRow.setAllocationId(popupRow.getAllocationId());
                        lineRow.setAllocationDetailId(popupRow.getAllocationDetailId());
                        lineRow.setContractLineId(popupRow.getContractLineId());
                        lineRow.setMasterContractLineId(popupRow.getMasterContractLineId());
                        lineRow.setContractId(popupRow.getContractId());
                        lineRow.setMasterContractId(popupRow.getMasterContractId());
                        lineRow.setDoLineNum(popupRow.getDoLineNum());
                        lineRow.setAssetId(popupRow.getAssetId());
                        //System.out.println((((Map)ADFContext.getCurrent().getSessionScope().get("userMap")).get("UserId")));
                        oracle.jbo.domain.Number receivedById=new oracle.jbo.domain.Number(((Map)ADFContext.getCurrent().getSessionScope().get("userMap")).get("UserId"));
                        //lineRow.setReceivedBy((oracle.jbo.domain.Number) ((Map)ADFContext.getCurrent().getSessionScope().get("userMap")).get("UserId"));
                        lineRow.setReceivedBy(receivedById);
                        lineRow.setTransAssetNumber(popupRow.getTransAssetNumber());
                        lineRow.setTransAssetDesc(popupRow.getTransAssetDesc());
                        lineRow.setTransOnHiredate(popupRow.getTransOnHireDate());
                        lineRow.setTransOffHiredate(popupRow.getTransOffHireDate());
                        lineRow.setTransDeploymentDate(popupRow.getTransDeploymentDate());
                        lineRow.setTransShiftType(popupRow.getTransShiftType());
                        lineRow.setTransOperatorName(popupRow.getTransOperatorName());
                        lineRow.setTransDeployMeterReading(popupRow.getMeterReading());
                        
                        EmployeeDetailsVOImpl detailsVO=getEmployeeDetailsVO1();
                        detailsVO.executeQuery();
                        EmployeeDetailsVORowImpl detailsRow = (EmployeeDetailsVORowImpl) detailsVO.first();
                        if(detailsRow!=null)
                        {
                            lineRow.setTransReceivedBy(detailsRow.getPersonNumber());
                            lineRow.setTransReceivedByEmpName(detailsRow.getEmployeeName());
                        }
                        lineRow.setTransSrcBuId(popupRow.getTransSrcBuId());
                        /*Asset line insertion end*/
                        /*Asset line accessories insertion start*/
                        DeploymentRcptAccessoriesVOImpl accVO=getDeploymentRcptAccessoriesVO1();
                        RctDeployOrderAccessoriesVOImpl popupAccVO=getRctDeployOrderAccessoriesVO1();
                        popupAccVO.setNamedWhereClauseParam("p_do_line_id", popupRow.getDoLineId());
                        popupAccVO.executeQuery();
                        RowSetIterator accItr=popupAccVO.createRowSetIterator(null);
                        while(accItr.hasNext())
                        {
                            RctDeployOrderAccessoriesVORowImpl popupAccVORow =
                                (RctDeployOrderAccessoriesVORowImpl) accItr.next();
                            
                            DeploymentRcptAccessoriesVORowImpl accRow =
                                (DeploymentRcptAccessoriesVORowImpl) accVO.createRow();
                            accVO.insertRow(accRow);
                            accRow.setAssetAccessoryId(popupAccVORow.getAssetAccessoryId());
                            accRow.setAssetId(popupAccVORow.getAssetId());
                            accRow.setDeployedQuantiy(popupAccVORow.getQuantity());
                            accRow.setDoAccessoryId(popupAccVORow.getDoAccessoryId());
                            accRow.setDoLineId(popupAccVORow.getDoLineId());
                            accRow.setDrId(lineRow.getDrId());
                            accRow.setDrLineId(lineRow.getDrLineId());
                            accRow.setTransAssetNumber(popupAccVORow.getTransAssetNumber());
                            accRow.setTransAssetDesc(popupAccVORow.getTransAssetDesc());
                            accRow.setTransShiftType(popupAccVORow.getTransShiftType());
                            accRow.setTransAccessories(popupAccVORow.getTransAccessories());
                            
                        }
                        /*Asset line accessories insertion end*/
                        /*Asset line Mobilization insertion start*/
                        DeploymentRcptMobilizationVOImpl mobVO=getDeploymentRcptMobilizationVO1();
                        RctDeployOrderMobilizationVOImpl popupMobVO=getRctDeployOrderMobilizationVO1();
                        popupMobVO.setNamedWhereClauseParam("p_do_line_id", popupRow.getDoLineId());
                        popupMobVO.executeQuery();
                        RowSetIterator mobItr=popupMobVO.createRowSetIterator(null);
                        while(mobItr.hasNext())
                        {
                            RctDeployOrderMobilizationVORowImpl popupMobRow =
                                (RctDeployOrderMobilizationVORowImpl) mobItr.next();
                            
                            DeploymentRcptMobilizationVORowImpl mobRow =
                                (DeploymentRcptMobilizationVORowImpl) mobVO.createRow();
                            mobVO.insertRow(mobRow);
                            mobRow.setAssetId(popupMobRow.getAssetId());
                            mobRow.setDoLineId(popupMobRow.getDoLineId());
                            mobRow.setDoMobilizationId(popupMobRow.getDoMobilizationId());
                            mobRow.setDrId(lineRow.getDrId());
                            mobRow.setDrLineId(lineRow.getDrLineId());
                            mobRow.setMobilizationAssetId(popupMobRow.getMobilizationAssetId());
                            mobRow.setTransAssetType(popupMobRow.getTransAssetType());
                            mobRow.setTransAssetNumber(popupMobRow.getTransAssetNumber());
                            mobRow.setTransAssetDesc(popupMobRow.getTransAssetDesc());
                            mobRow.setTransShiftType(popupMobRow.getTransShiftType());
                            mobRow.setTransMobilizationAsset(popupMobRow.getTransMobilizationAsset());
                            mobRow.setTripDate(popupMobRow.getTripDate());
                        }
                        /*Asset line Mobilization insertion end*/
                    }
                }
            }
       } catch (Exception e) {
            message=e.getMessage();
            e.printStackTrace();
        }
        return message;
    }
    public String createTransTripTsSearch() {
        String message = "Success";
        try {
            getTransTripTimesheetSearchVO1().executeQuery();
            TransTripTimesheetSearchVORowImpl searchRow =
                (TransTripTimesheetSearchVORowImpl) getTransTripTimesheetSearchVO1().getCurrentRow();
            if (searchRow != null) {
                searchRow.remove();
            }
            searchRow = (TransTripTimesheetSearchVORowImpl) getTransTripTimesheetSearchVO1().createRow();
            getTransTripTimesheetSearchVO1().insertRow(searchRow);
//            getReceiptSearchVO1().setNamedWhereClauseParam("p_bu_id", searchRow.getTransBuId());
//            getReceiptSearchVO1().executeQuery();
        } catch (Exception e) {
            e.printStackTrace();
            message = e.getMessage();
        }
        return message;
    }
    
    public String searchTripTimesheet(){
        String message = "Success";
        try {
            TransTripTimesheetSearchVORowImpl searchRow=(TransTripTimesheetSearchVORowImpl)getTransTripTimesheetSearchVO1().getCurrentRow();
            if(searchRow != null){
                getTripHeaderSearchVO1().setNamedWhereClauseParam("p_src_bu_id", searchRow.getTransSrcBuId());   
                getTripHeaderSearchVO1().setNamedWhereClauseParam("p_src_div_flex_value_id", searchRow.getTransSrcDivFlexValId());
                getTripHeaderSearchVO1().setNamedWhereClauseParam("p_req_bu_id", searchRow.getTransReqBuId());
                getTripHeaderSearchVO1().setNamedWhereClauseParam("p_master_contract_id", searchRow.getTransContractId());
                getTripHeaderSearchVO1().setNamedWhereClauseParam("p_customer_type", searchRow.getTransCustomerTypeCode());
                getTripHeaderSearchVO1().setNamedWhereClauseParam("p_project_id", searchRow.getTransProjectId());
                getTripHeaderSearchVO1().setNamedWhereClauseParam("p_div_flex_val_id", searchRow.getTransDivFlexValId());   
                getTripHeaderSearchVO1().setNamedWhereClauseParam("p_dept_flex_val_id", searchRow.getTransDeptFlexValId());
                getTripHeaderSearchVO1().setNamedWhereClauseParam("p_customer_id", searchRow.getTransCustomerId());
                getTripHeaderSearchVO1().setNamedWhereClauseParam("p_ts_number", searchRow.getTransTimesheetNumber());
                getTripHeaderSearchVO1().setNamedWhereClauseParam("p_period_start_date", searchRow.getTransPeriodStartDate());
                getTripHeaderSearchVO1().setNamedWhereClauseParam("p_period_end_date", searchRow.getTransPeriodEndDate());

                getTripHeaderSearchVO1().executeQuery();
            }       
        }catch (Exception e) {
            e.printStackTrace();
            message = e.getMessage();
        }
        return message;
    }
    
    public String resetTripTimesheet(){
        String message = "Success";
        try {
            TransTripTimesheetSearchVORowImpl searchRow =
                (TransTripTimesheetSearchVORowImpl) getTransTripTimesheetSearchVO1().getCurrentRow();
            if(searchRow != null){
                searchRow.remove();
            }
            searchRow = (TransTripTimesheetSearchVORowImpl) getTransTripTimesheetSearchVO1().createRow();
            getTransTripTimesheetSearchVO1().insertRow(searchRow);            
            
            getTripHeaderSearchVO1().setNamedWhereClauseParam("p_src_bu_id", null);   
            getTripHeaderSearchVO1().setNamedWhereClauseParam("p_src_div_flex_value_id", null);
            getTripHeaderSearchVO1().setNamedWhereClauseParam("p_req_bu_id", null);
            getTripHeaderSearchVO1().setNamedWhereClauseParam("p_master_contract_id", null);
            getTripHeaderSearchVO1().setNamedWhereClauseParam("p_customer_type", null);
            getTripHeaderSearchVO1().setNamedWhereClauseParam("p_project_id", null);
            getTripHeaderSearchVO1().setNamedWhereClauseParam("p_div_flex_val_id", null);   
            getTripHeaderSearchVO1().setNamedWhereClauseParam("p_dept_flex_val_id", null);
            getTripHeaderSearchVO1().setNamedWhereClauseParam("p_customer_id", null);
            getTripHeaderSearchVO1().setNamedWhereClauseParam("p_ts_number", null);
            getTripHeaderSearchVO1().setNamedWhereClauseParam("p_period_start_date", null);
            getTripHeaderSearchVO1().setNamedWhereClauseParam("p_period_end_date", null);

            getTripHeaderSearchVO1().executeQuery();
            
        }catch (Exception e) {
            e.printStackTrace();
            message = e.getMessage();
        }
        return message;
    }
    
    public String setTripTimesheetSearch(){
        String message = "Success";
        try {
            TransTripTimesheetSearchVORowImpl searchRow=(TransTripTimesheetSearchVORowImpl)getTransTripTimesheetSearchVO1().getCurrentRow();
            
                                
            if(searchRow != null){
                searchRow.remove();
            }
            getTransTripTimesheetSearchVO1().executeQuery();
            searchRow = (TransTripTimesheetSearchVORowImpl) getTransTripTimesheetSearchVO1().createRow();
            getTransTripTimesheetSearchVO1().insertRow(searchRow);
            
            Map pf = ADFContext.getCurrent().getPageFlowScope();
            
            /*
             *             pf.put("tsSrcBu", getEL("#{bindings.TransSrcBu.inputValue}"));
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
             * */
            
            
            searchRow.setTransSrcBu((String) pf.get("tsSrcBu"));
            searchRow.setTransSrcBuId((oracle.jbo.domain.Number) pf.get("tsSrcBuId"));
            searchRow.setTransSrcDivRequired((String) pf.get("tsSrcDivRequired"));
            searchRow.setTransSrcDivSegmentNum((oracle.jbo.domain.Number) pf.get("tsSrcDivSegmentNum"));
            searchRow.setTransSrcDeptSegmentNum((oracle.jbo.domain.Number) pf.get("tsSrcDeptSegmentNum"));
            searchRow.setTransSrcDivision((String) pf.get("tsSrcDivision"));
            searchRow.setTransSrcDivFlexValId((oracle.jbo.domain.Number) pf.get("tsSrcDivFlexValId"));
            searchRow.setTransReqBu((String) pf.get("tsReqBu"));
            searchRow.setTransReqBuId((oracle.jbo.domain.Number) pf.get("tsReqBuId"));
            searchRow.setTransContractNo((String) pf.get("tsContractNo"));
            searchRow.setTransContractId((oracle.jbo.domain.Number) pf.get("tsContractId"));
            searchRow.setTransCustomerType((String) pf.get("tsCustomerType"));
            searchRow.setTransCustomerTypeCode((String) pf.get("tsCustomerTypeCode"));
            searchRow.setTransProject((String) pf.get("tsProject"));
            searchRow.setTransProjectId((oracle.jbo.domain.Number) pf.get("tsProjectId"));
            searchRow.setTransDivision((String) pf.get("tsDivision"));
            searchRow.setTransDivFlexValId((oracle.jbo.domain.Number) pf.get("tsDivFlexValId"));
            searchRow.setTransDeptName((String) pf.get("tsDepartment"));
            searchRow.setTransDeptFlexValId((oracle.jbo.domain.Number) pf.get("tsDeptFlexValId"));
            searchRow.setTransCustomerName((String) pf.get("tsCustomerName"));
            searchRow.setTransCustomerId((oracle.jbo.domain.Number) pf.get("tsCustomerId"));
            searchRow.setTransTimesheetNumber((String) pf.get("tsTimesheetNum"));
            searchRow.setTransReqDivSegmentNum((oracle.jbo.domain.Number) pf.get("tsReqDeptSegmentNum"));
            searchRow.setTransReqDeptSegmentNum((oracle.jbo.domain.Number) pf.get("tsReqDivSegmentNum"));
            searchRow.setTransPeriod((String) pf.get("tsPeriod"));
            searchRow.setTransPeriodStartDate((Date) pf.get("tsPeriodStartDate"));
            searchRow.setTransPeriodEndDate((Date) pf.get("tsPeriodEndDate"));
            
            getTripHeaderSearchVO1().setNamedWhereClauseParam("p_src_bu_id", searchRow.getTransSrcBuId());   
            getTripHeaderSearchVO1().setNamedWhereClauseParam("p_src_div_flex_value_id", searchRow.getTransSrcDivFlexValId());
            getTripHeaderSearchVO1().setNamedWhereClauseParam("p_req_bu_id", searchRow.getTransReqBuId());
            getTripHeaderSearchVO1().setNamedWhereClauseParam("p_master_contract_id", searchRow.getTransContractId());
            getTripHeaderSearchVO1().setNamedWhereClauseParam("p_customer_type", searchRow.getTransCustomerTypeCode());
            getTripHeaderSearchVO1().setNamedWhereClauseParam("p_project_id", searchRow.getTransProjectId());
            getTripHeaderSearchVO1().setNamedWhereClauseParam("p_div_flex_val_id", searchRow.getTransDivFlexValId());   
            getTripHeaderSearchVO1().setNamedWhereClauseParam("p_dept_flex_val_id", searchRow.getTransDeptFlexValId());
            getTripHeaderSearchVO1().setNamedWhereClauseParam("p_customer_id", searchRow.getTransCustomerId());
            getTripHeaderSearchVO1().setNamedWhereClauseParam("p_ts_number", searchRow.getTransTimesheetNumber());
            getTripHeaderSearchVO1().setNamedWhereClauseParam("p_period_start_date", searchRow.getTransPeriodStartDate());
            getTripHeaderSearchVO1().setNamedWhereClauseParam("p_period_end_date", searchRow.getTransPeriodEndDate());

            getTripHeaderSearchVO1().executeQuery();
        }catch (Exception e) {
            e.printStackTrace();
            message = e.getMessage();
        }
        return message;
    }
    
    public String tripTsSourceBuChange() {
        String message = "Success";
        try {
            TripHeaderVORowImpl hdrRow=(TripHeaderVORowImpl)getTripHeaderVO1().getCurrentRow();
            
            if (hdrRow != null) {
                    hdrRow.setTransReqBu(null);
                    hdrRow.setTransReqBuDeptSegment(null);
                    hdrRow.setTransReqBuDivSegment(null);
                    hdrRow.setReqBuId(null);
                hdrRow.setSrcDivision(null);
                hdrRow.setSrcDivFlexValueId(null);
                hdrRow.setSrcDivFlexValSetId(null);
                hdrRow.setTransCustomerType(null);
                hdrRow.setCustomerType(null);
                hdrRow.setTransProject(null);
                hdrRow.setProjectId(null);
                hdrRow.setTransDepartment(null);
                hdrRow.setDepartmentCode(null);
                hdrRow.setDepartmentName(null);
                hdrRow.setDeptFlexValueId(null);
                hdrRow.setDeptFlexValueSetId(null);
                hdrRow.setDivFlexValueSetId(null);
                
                hdrRow.setDivFlexValueId(null);
                hdrRow.setTransCustomer(null);
                
                hdrRow.setTransCustomerSite(null);
                hdrRow.setCustomerId(null);
                hdrRow.setCustSiteId(null);
                hdrRow.setSiteUseId(null);
                
                hdrRow.setTransContractNumber(null);
                hdrRow.setContractId(null);
                hdrRow.setMasterContractId(null);

            }
        } catch (Exception e) {
            e.printStackTrace();
            message = e.getMessage();
        }
        return message;
    }
    
    public String tripTsSourceDivChange() {
        String message = "Success";
        try {
            TripHeaderVORowImpl hdrRow=(TripHeaderVORowImpl)getTripHeaderVO1().getCurrentRow();
            
            if (hdrRow != null) {
                    hdrRow.setTransReqBu(null);
                    hdrRow.setTransReqBuDeptSegment(null);
                    hdrRow.setTransReqBuDivSegment(null);
                    hdrRow.setReqBuId(null);
                
                hdrRow.setTransCustomerType(null);
                hdrRow.setCustomerType(null);
                hdrRow.setTransProject(null);
                hdrRow.setProjectId(null);
                hdrRow.setTransDepartment(null);
                hdrRow.setDepartmentCode(null);
                hdrRow.setDepartmentName(null);
                hdrRow.setDeptFlexValueId(null);
                hdrRow.setDeptFlexValueSetId(null);
                
                hdrRow.setDivFlexValueSetId(null);
                hdrRow.setDivFlexValueId(null);
                hdrRow.setTransCustomer(null);
                
                hdrRow.setTransCustomerSite(null);
                hdrRow.setCustomerId(null);
                hdrRow.setCustSiteId(null);
                hdrRow.setSiteUseId(null);
                
                hdrRow.setTransContractNumber(null);
                hdrRow.setContractId(null);
                hdrRow.setMasterContractId(null);
                

            }
        } catch (Exception e) {
            e.printStackTrace();
            message = e.getMessage();
        }
        return message;
    }
    
    public String tripTsRequestingBuChange() {
        String message = "Success";
        try {
            TripHeaderVORowImpl hdrRow=(TripHeaderVORowImpl)getTripHeaderVO1().getCurrentRow();
            
            if (hdrRow != null) {
                hdrRow.setTransCustomerType(null);
                hdrRow.setCustomerType(null);
                hdrRow.setTransProject(null);
                hdrRow.setProjectId(null);
                hdrRow.setTransDepartment(null);
                hdrRow.setDepartmentCode(null);
                hdrRow.setDepartmentName(null);
                hdrRow.setDeptFlexValueId(null);
                hdrRow.setDeptFlexValueSetId(null);
                hdrRow.setDivFlexValueSetId(null);
                
                hdrRow.setDivFlexValueId(null);
                
                hdrRow.setTransCustomer(null);
                hdrRow.setTransCustomerSite(null);
                hdrRow.setCustomerId(null);
                hdrRow.setCustSiteId(null);
                hdrRow.setSiteUseId(null);
                
                hdrRow.setTransContractNumber(null);
                hdrRow.setContractId(null);
                hdrRow.setMasterContractId(null);
                
            }
        } catch (Exception e) {
            e.printStackTrace();
            message = e.getMessage();
        }
        return message;
    }
    
    public String tripTsContractNoChange() {
        String message = "Success";
        try {
            TripHeaderVORowImpl hdrRow=(TripHeaderVORowImpl)getTripHeaderVO1().getCurrentRow();
            
            if (hdrRow != null) {
                /*For One Contract Number their must be one document for one date*/
                if(hdrRow.getContractId()!=null && hdrRow.getTimesheetDate()!=null)
                {
                    TripHeaderValidateVOImpl validateVO=getTripHeaderValidateVO1();
                    validateVO.setApplyViewCriteriaName(null);
                    validateVO.executeQuery();
                    validateVO.setApplyViewCriteriaName("TripHeaderValidateVOCriteria");
                    validateVO.setNamedWhereClauseParam("p_contract_id", hdrRow.getContractId());
                    validateVO.setNamedWhereClauseParam("p_header_id", hdrRow.getHeaderId());
                    validateVO.setNamedWhereClauseParam("p_timesheet_date", hdrRow.getTimesheetDate());
                    validateVO.executeQuery();
                    TripHeaderValidateVORowImpl validateRow = (TripHeaderValidateVORowImpl) validateVO.first();
                    if(validateRow!=null)
                    {
                        hdrRow.setTransContractNumber(null);
                        hdrRow.setContractId(null);
                        hdrRow.setMasterContractId(null);
                        
                        hdrRow.setTransCustomerType(null);
                        hdrRow.setCustomerType(null);
                        hdrRow.setTransProject(null);
                        hdrRow.setProjectId(null);
                        hdrRow.setTransDepartment(null);
                        hdrRow.setDepartmentCode(null);
                        hdrRow.setDepartmentName(null);
                        hdrRow.setDeptFlexValueId(null);
                        hdrRow.setDeptFlexValueSetId(null);
                        hdrRow.setDivFlexValueSetId(null);
                        
                        hdrRow.setDivFlexValueId(null);
                        
                        hdrRow.setTransCustomer(null);
                        hdrRow.setTransCustomerSite(null);
                        hdrRow.setCustomerId(null);
                        hdrRow.setCustSiteId(null);
                        hdrRow.setSiteUseId(null);
                        
                        return "Document already exists with same contract and timesheet date.Please select unique Contract.";
                    }
                }
                /*Contract number validation*/
                /*hdrRow.setTransCustomerType(null);
                hdrRow.setCustomerType(null);
                hdrRow.setTransProject(null);
                hdrRow.setProjectId(null);
                hdrRow.setTransDepartment(null);
                hdrRow.setDepartmentCode(null);
                hdrRow.setDepartmentName(null);
                hdrRow.setDeptFlexValueId(null);
                hdrRow.setDeptFlexValueSetId(null);
                hdrRow.setDivFlexValueSetId(null);
                
                hdrRow.setDivFlexValueId(null);
                
                hdrRow.setTransCustomer(null);
                hdrRow.setTransCustomerSite(null);
                hdrRow.setCustomerId(null);
                hdrRow.setCustSiteId(null);
                hdrRow.setSiteUseId(null);*/
                                
            }
        } catch (Exception e) {
            e.printStackTrace();
            message = e.getMessage();
        }
        return message;
    }
    
    public String uploadTripTsAttach() {
        String message = "Success";
        try {
            ADFContext adfCtx = ADFContext.getCurrent();
            Map pageFlowScope = adfCtx.getPageFlowScope();
            int ch = -1;

            AttachmentsVOImpl attachmentVO = getAttachmentsVO5();
            AttachmentsVORowImpl currRow = (AttachmentsVORowImpl) attachmentVO.getCurrentRow();
            InputStream in = (InputStream) pageFlowScope.get("tripTsUploadedFileStream");
            ByteArrayOutputStream bout = new ByteArrayOutputStream();
            new ByteArrayOutputStream();
            try {
                while ((ch = in.read()) != -1) {
                    bout.write(ch);
                }
                in.close();
                bout.close();

                currRow.setAttachmentFile(new BlobDomain(bout.toByteArray()));
            } catch (Exception e) {
                //                System.out.println(e.getMessage());
                return "ERROR";
            }

            String fileName = (String) pageFlowScope.get("tripTsFileName");
            currRow.setFileName(fileName);
            currRow.setFileType((String) pageFlowScope.get("tripTsFileType"));
        } catch (Exception e) {
            e.printStackTrace();
            message = e.getMessage();
        }
        return message;
    }
    
    public String addTripTsAttachment() {
        String message = "Success";
        try {
            AttachmentsVOImpl attachVO = getAttachmentsVO5();
            AttachmentsVORowImpl newRow = (AttachmentsVORowImpl) attachVO.createRow();
            attachVO.insertRow(newRow);
            newRow.setAttachmentCode("XXADS_TRIP_HDR_T");
            newRow.setCategory("Misc");
            newRow.setTransCategory("Miscellaneous");
        } catch (Exception e) {
            e.printStackTrace();
            message = e.getMessage();
        }
        return message;
    }
    
    public String confirmTripTimesheet(){
        String message = "Success";
        try {
            TripHeaderVORowImpl currRow=(TripHeaderVORowImpl)getTripHeaderVO1().getCurrentRow();
            //Check whether the previous day timesheets are cofirmed or not
            /*TripHeaderPreviousDayValidateVOImpl validateVO=getTripHeaderPreviousDayValidateVO1();
            validateVO.setNamedWhereClauseParam("p_contract_id", currRow.getContractId());
            validateVO.setNamedWhereClauseParam("p_timesheet_date", currRow.getTimesheetDate());
            validateVO.executeQuery();
            TripHeaderPreviousDayValidateVORowImpl validateRow =
                (TripHeaderPreviousDayValidateVORowImpl) validateVO.first();
            if(validateRow==null)
            {
                return "Previous day timesheet for this contract is Missing or Not confirmed yet.Please confirm previous day document to confirm this document.";
            }
            
            if(currRow != null && "D".equals(currRow.getTimesheetStatus())){
                currRow.setTimesheetStatus("C");
                currRow.setTransTimesheetStatus("Confirmed");
            }*/
            if(getTripLinesVO1().getRowCount() == 0){
                return "Please add Lines to continue confirming the Timesheet";
            }
            SequenceImpl seq = new SequenceImpl("xxads_trip_timesheet_batch_s",this.getDBTransaction());
            Number seqNum = seq.getSequenceNumber();
            currRow.setBatchId(seqNum);
            this.getDBTransaction().commit();
            message = callConfirmPrcForTripTs(seqNum);
            getTripHeaderVO1().setNamedWhereClauseParam("p_ts_header_id", currRow.getHeaderId());
            getTripHeaderVO1().executeQuery();
        }catch (Exception e) {
            e.printStackTrace();
            message = e.getMessage();
        }
        return message;
    }
    
    public String createTripTimesheet(){
        String message = "Success";
        try {
            oracle.jbo.domain.Number reqNum = new oracle.jbo.domain.Number(0);
            oracle.jbo.domain.Number seq = null;
            TripHeaderVORowImpl hdrRow=(TripHeaderVORowImpl)getTripHeaderVO1().createRow();
            getTripHeaderVO1().insertRow(hdrRow);
            
            hdrRow.setTimesheetStatus("D");
            hdrRow.setTransTimesheetStatus("Draft");
            String userName= ((Map) ADFContext.getCurrent().getSessionScope().get("userMap")).get("UserName").toString();
            hdrRow.setPreparedBy(userName);                    
            
        }catch (Exception e) {
            message = e.getMessage();
            e.printStackTrace();
        }
        return message;
    }
    
    public String generateTripTsNumber(){
        String message = "Success";
        oracle.jbo.domain.Number reqNum = null;
        oracle.jbo.domain.Number seq = null;
        try {
            TripHeaderVORowImpl currRow=(TripHeaderVORowImpl)getTripHeaderVO1().getCurrentRow();
            if(currRow != null && currRow.getTimesheetNumber() == null){
                getMaxTripTimesheetNumVO1().setNamedWhereClauseParam("p_bu_id", currRow.getSrcBuId());
                getMaxTripTimesheetNumVO1().setNamedWhereClauseParam("p_div_flex_val_id", currRow.getSrcDivFlexValueId());
                getMaxTripTimesheetNumVO1().executeQuery();
                MaxTripTimesheetNumVORowImpl maxRow = (MaxTripTimesheetNumVORowImpl) getMaxTripTimesheetNumVO1().first();
                if (maxRow != null) {
                    reqNum = maxRow.getSeqNum();
                }

                seq = updateDocSequenceNumber("STS",currRow.getSrcBuId(), currRow.getSrcDivFlexValueId(), reqNum);
                if(seq == null){
                    return "Please define Document Sequence and then continue";
                }
                String divCode = getSequenceCode("STS",currRow.getSrcBuId(), currRow.getSrcDivFlexValueId());
                if(seq != null && divCode == null)
                {
                    currRow.setTimesheetNumber("STS-"+seq);
                }else if(seq != null && divCode != null){
                    
                    currRow.setTimesheetNumber(divCode+"-STS-"+seq);
                }
            }
        }catch (Exception e) {
            e.printStackTrace();
            message = e.getMessage();
        }
        return message;
    }
    
    public String editTripTimesheet(){
        String message = "Success";
        try {
            TripHeaderSearchVORowImpl searchRow=(TripHeaderSearchVORowImpl)getTripHeaderSearchVO1().getCurrentRow();
            if(searchRow==null)
            {
                return "Navigation not possible.Please check.";
            }
            
            if(searchRow != null){
                getAccessTypeVO1().setNamedWhereClauseParam("p_customer_type", searchRow.getCustomerType());
                
                if("P".equals(searchRow.getCustomerType())){
                    getAccessTypeVO1().setNamedWhereClauseParam("p_value_id", searchRow.getProjectId());
                }else if("C".equals(searchRow.getCustomerType())){
                    getAccessTypeVO1().setNamedWhereClauseParam("p_value_id", searchRow.getCustomerId());
                }else if("D".equals(searchRow.getCustomerType())){
                    getAccessTypeVO1().setNamedWhereClauseParam("p_value_id", searchRow.getDeptFlexValueId());
                }else if("DV".equals(searchRow.getCustomerType())){
                    getAccessTypeVO1().setNamedWhereClauseParam("p_value_id", searchRow.getDivFlexValueId());
                }
                getAccessTypeVO1().setNamedWhereClauseParam("p_src_bu_id", searchRow.getSrcBuId());
                getAccessTypeVO1().setNamedWhereClauseParam("p_req_bu_id", searchRow.getReqBuId());
                getAccessTypeVO1().setNamedWhereClauseParam("p_src_div_flex_val_id", searchRow.getSrcDivFlexValueId());
                
                getAccessTypeVO1().executeQuery();
                
                AccessTypeVORowImpl row = (AccessTypeVORowImpl) getAccessTypeVO1().first();
                
                if(row != null && "F".equals(row.getAccessType())){
                    ADFContext.getCurrent().getPageFlowScope().put("serviceTsEditFlag", "Y");
                }else{
                    ADFContext.getCurrent().getPageFlowScope().put("serviceTsEditFlag", "N");
                }
                
                getTripHeaderVO1().setNamedWhereClauseParam("p_ts_header_id", searchRow.getHeaderId());
                getTripHeaderVO1().executeQuery();
            }
        }catch (Exception e) {
            message = e.getMessage();
            e.printStackTrace();
        }
        return message;        
    }
    
    public String clearTripTimesheets(){
        String message = "Success";
        CallableStatement cs = null;
        try {
            TripHeaderVORowImpl currRow=(TripHeaderVORowImpl)getTripHeaderVO1().getCurrentRow();
            
            if(currRow != null){
                cs = this.getDBTransaction().createCallableStatement(CLEAR_TRIP_TS_LINES, 0);
                cs.setLong("p_header_id", currRow.getHeaderId().longValue());
                cs.setString("p_user", (String)((Map)ADFContext.getCurrent().getSessionScope().get("userMap")).get("UserName"));
                cs.registerOutParameter("p_message", Types.VARCHAR);
                cs.execute();
                
                message = cs.getString("p_message");
                getTripLinesVO1().executeQuery();
            }
        }catch (Exception e) {
            e.printStackTrace();
            message =e .getMessage();
        }
        return message;
    }
    
    public String populateTripTimesheets(){
        String message = "Success";
        CallableStatement cs = null;
        try {
            TripHeaderVORowImpl currRow=(TripHeaderVORowImpl)getTripHeaderVO1().getCurrentRow();
            
            if(currRow != null){
                cs = this.getDBTransaction().createCallableStatement(POPULATE_TRIP_TS_LINES, 0);
                cs.setLong("p_header_id", currRow.getHeaderId().longValue());
                cs.setLong("p_contract_id", currRow.getContractId().longValue());
                cs.setDate("p_ts_date", currRow.getTimesheetDate().dateValue());
                cs.setString("p_user", (String)((Map)ADFContext.getCurrent().getSessionScope().get("userMap")).get("UserName"));
                cs.registerOutParameter("p_message", Types.VARCHAR);
                cs.execute();
                
                message = cs.getString("p_message");
                getTripLinesVO1().executeQuery();
                
            }
        }catch (Exception e) {
            message = e.getMessage();
            e.printStackTrace();
        }
        return message;
    }
    public String tripTsTimesheetDateChange()
    {
        String message="Success";
        try {
           TripHeaderVORowImpl hdrRow=(TripHeaderVORowImpl)getTripHeaderVO1().getCurrentRow();
           if (hdrRow != null) {
               /*For One Contract Number their must be one document for one date*/
               if(hdrRow.getContractId()!=null && hdrRow.getTimesheetDate()!=null)
               {
                   TripHeaderValidateVOImpl validateVO=getTripHeaderValidateVO1();
                   validateVO.setApplyViewCriteriaName(null);
                   validateVO.executeQuery();
                   validateVO.setApplyViewCriteriaName("TripHeaderValidateVOCriteria");
                   validateVO.setNamedWhereClauseParam("p_contract_id", hdrRow.getContractId());
                   validateVO.setNamedWhereClauseParam("p_header_id", hdrRow.getHeaderId());
                   validateVO.setNamedWhereClauseParam("p_timesheet_date", hdrRow.getTimesheetDate());
                   validateVO.executeQuery();
                   TripHeaderValidateVORowImpl validateRow = (TripHeaderValidateVORowImpl) validateVO.first();
                   if(validateRow!=null)
                   {
                       hdrRow.setTimesheetDate(null);
                       return "Document already exists with same contract and timesheet date.Please select unique Timesheet Date.";
                   }
               }
           }
       } catch (Exception e) {
            message=e.getMessage();
            e.printStackTrace();
        }
        return message;
    }
    
    public String callConfirmPrcForTripTs(oracle.jbo.domain.Number seqNum){
        String message = "Success";
        CallableStatement cs = null;
        try {
            cs = this.getDBTransaction().createCallableStatement(CONFIRM_TRIP_TIMESHEETS, 0);
            cs.setLong("p_batch_id", seqNum.longValue());
            cs.setString("p_user", (String)((Map)ADFContext.getCurrent().getSessionScope().get("userMap")).get("UserName"));
            cs.registerOutParameter("p_message", Types.VARCHAR);
            cs.execute();
            message = cs.getString("p_message");
        }catch (Exception e) {
            message = e.getMessage();
            e.printStackTrace();
        }
        return message;
    }
    
    public String tripConfirmBulkTS(){
        String message = "Success";
        try{
            TripHeaderSearchVOImpl hdrVO=getTripHeaderSearchVO1();
            
            ADFContext adfCtx = ADFContext.getCurrent();
            Map pageFlowScope = adfCtx.getPageFlowScope();
            
            SequenceImpl seq = new SequenceImpl("xxads_trip_timesheet_batch_s",this.getDBTransaction());
            Number seqNum = seq.getSequenceNumber();
            
            ADFContext.getCurrent().getPageFlowScope().put("trip_timesheet_batch_id_variable", seqNum);
            
            List rows = (List)pageFlowScope.get("tripConfirmHdrs");
            for(int i=0;i<rows.size();i++){
                Key k = new Key(new Object[] { rows.get(i) });
                TripHeaderSearchVORowImpl hdrRow=(TripHeaderSearchVORowImpl)hdrVO.getRow(k);
                if("D".equalsIgnoreCase(hdrRow.getTimesheetStatus()))
                    hdrRow.setBatchId(seqNum);
            }
            this.getDBTransaction().commit();
            message = callConfirmPrcForTripTs(seqNum);
            getTripHeaderSearchVO1().executeQuery();
        }catch(Exception e){
            e.printStackTrace();
            message = e.getMessage();
        }
        return message;
    }
    /**
     * Container's getter for TransDeploymentReceiptSearchVO1.
     * @return TransDeploymentReceiptSearchVO1
     */
    public TransDeploymentReceiptSearchVOImpl getTransDeploymentReceiptSearchVO1() {
        return (TransDeploymentReceiptSearchVOImpl) findViewObject("TransDeploymentReceiptSearchVO1");
    }

    /**
     * Container's getter for ReceiptSearchVO1.
     * @return ReceiptSearchVO1
     */
    public ReceiptSearchVOImpl getReceiptSearchVO1() {
        return (ReceiptSearchVOImpl) findViewObject("ReceiptSearchVO1");
    }

    /**
     * Container's getter for TransPRInterfaceVO1.
     * @return TransPRInterfaceVO1
     */
    public TransPRInterfaceVOImpl getTransPRInterfaceVO1() {
        return (TransPRInterfaceVOImpl) findViewObject("TransPRInterfaceVO1");
    }

    /**
     * Container's getter for CommonAM1.
     * @return CommonAM1
     */
    public ApplicationModuleImpl getCommonAM1() {
        return (ApplicationModuleImpl) findApplicationModule("CommonAM1");
    }

    /**
     * Container's getter for AttachmentsVO4.
     * @return AttachmentsVO4
     */
    public AttachmentsVOImpl getAttachmentsVO4() {
        return (AttachmentsVOImpl) findViewObject("AttachmentsVO4");
    }

    /**
     * Container's getter for DeploymentOrderToAttachmentsVL1.
     * @return DeploymentOrderToAttachmentsVL1
     */
    public ViewLinkImpl getDeploymentOrderToAttachmentsVL1() {
        return (ViewLinkImpl) findViewLink("DeploymentOrderToAttachmentsVL1");
    }

    /**
     * Container's getter for MaxDeploymentReceiptNumVO1.
     * @return MaxDeploymentReceiptNumVO1
     */
    public MaxDeploymentReceiptNumVOImpl getMaxDeploymentReceiptNumVO1() {
        return (MaxDeploymentReceiptNumVOImpl) findViewObject("MaxDeploymentReceiptNumVO1");
    }

    /**
     * Container's getter for DeploymentOrderAccessoriesVO1.
     * @return DeploymentOrderAccessoriesVO1
     */
    public DeploymentOrderAccessoriesVOImpl getDeploymentOrderAccessoriesVO1() {
        return (DeploymentOrderAccessoriesVOImpl) findViewObject("DeploymentOrderAccessoriesVO1");
    }

    /**
     * Container's getter for DeploymentOrderLinesToAccessoriesVL1.
     * @return DeploymentOrderLinesToAccessoriesVL1
     */
    public ViewLinkImpl getDeploymentOrderLinesToAccessoriesVL1() {
        return (ViewLinkImpl) findViewLink("DeploymentOrderLinesToAccessoriesVL1");
    }

    /**
     * Container's getter for DeploymentOrderInspectionVO1.
     * @return DeploymentOrderInspectionVO1
     */
    public DeploymentOrderInspectionVOImpl getDeploymentOrderInspectionVO1() {
        return (DeploymentOrderInspectionVOImpl) findViewObject("DeploymentOrderInspectionVO1");
    }

    /**
     * Container's getter for DeploymentOrderLinesToInspectionVL1.
     * @return DeploymentOrderLinesToInspectionVL1
     */
    public ViewLinkImpl getDeploymentOrderLinesToInspectionVL1() {
        return (ViewLinkImpl) findViewLink("DeploymentOrderLinesToInspectionVL1");
    }

    /**
     * Container's getter for DeploymentOrderMobilizationVO1.
     * @return DeploymentOrderMobilizationVO1
     */
    public DeploymentOrderMobilizationVOImpl getDeploymentOrderMobilizationVO1() {
        return (DeploymentOrderMobilizationVOImpl) findViewObject("DeploymentOrderMobilizationVO1");
    }

    /**
     * Container's getter for DeploymentOrderLinesToMobilizationVL1.
     * @return DeploymentOrderLinesToMobilizationVL1
     */
    public ViewLinkImpl getDeploymentOrderLinesToMobilizationVL1() {
        return (ViewLinkImpl) findViewLink("DeploymentOrderLinesToMobilizationVL1");
    }

    /**
     * Container's getter for ReceiptDateValidateVO1.
     * @return ReceiptDateValidateVO1
     */
    public ReceiptDateValidateVOImpl getReceiptDateValidateVO1() {
        return (ReceiptDateValidateVOImpl) findViewObject("ReceiptDateValidateVO1");
    }

    /**
     * Container's getter for AssetAllocationDetailsVO3.
     * @return AssetAllocationDetailsVO3
     */
    public AssetAllocationDetailsVOImpl getAssetAllocationDetailsVO3() {
        return (AssetAllocationDetailsVOImpl) findViewObject("AssetAllocationDetailsVO3");
    }

   
    /**
     * Container's getter for RctDeployOrderLinesVO1.
     * @return RctDeployOrderLinesVO1
     */
    public RctDeployOrderLinesVOImpl getRctDeployOrderLinesVO1() {
        return (RctDeployOrderLinesVOImpl) findViewObject("RctDeployOrderLinesVO1");
    }

    /**
     * Container's getter for DeploymentReceiptLinesValidateVO1.
     * @return DeploymentReceiptLinesValidateVO1
     */
    public DeploymentReceiptLinesValidateVOImpl getDeploymentReceiptLinesValidateVO1() {
        return (DeploymentReceiptLinesValidateVOImpl) findViewObject("DeploymentReceiptLinesValidateVO1");
    }

    /**
     * Container's getter for EmployeeDetailsVO1.
     * @return EmployeeDetailsVO1
     */
    public EmployeeDetailsVOImpl getEmployeeDetailsVO1() {
        return (EmployeeDetailsVOImpl) findViewObject("EmployeeDetailsVO1");
    }

    /**
     * Container's getter for RctDeployOrderAccessoriesVO1.
     * @return RctDeployOrderAccessoriesVO1
     */
    public RctDeployOrderAccessoriesVOImpl getRctDeployOrderAccessoriesVO1() {
        return (RctDeployOrderAccessoriesVOImpl) findViewObject("RctDeployOrderAccessoriesVO1");
    }

    /**
     * Container's getter for RctDeployOrderMobilizationVO1.
     * @return RctDeployOrderMobilizationVO1
     */
    public RctDeployOrderMobilizationVOImpl getRctDeployOrderMobilizationVO1() {
        return (RctDeployOrderMobilizationVOImpl) findViewObject("RctDeployOrderMobilizationVO1");
    }


    /**
     * Container's getter for AttachmentsVO6.
     * @return AttachmentsVO6
     */
    public AttachmentsVOImpl getAttachmentsVO6() {
        return (AttachmentsVOImpl) findViewObject("AttachmentsVO6");
    }

    /**
     * Container's getter for DeploymentRcptHdrToAttachmentVL2.
     * @return DeploymentRcptHdrToAttachmentVL2
     */
    public ViewLinkImpl getDeploymentRcptHdrToAttachmentVL2() {
        return (ViewLinkImpl) findViewLink("DeploymentRcptHdrToAttachmentVL2");
    }

    /**
     * Container's getter for AssetMasterUpdateVO1.
     * @return AssetMasterUpdateVO1
     */
    public AssetMasterUpdateVOImpl getAssetMasterUpdateVO1() {
        return (AssetMasterUpdateVOImpl) findViewObject("AssetMasterUpdateVO1");
    }

    /**
     * Container's getter for AssetAllocationLinesVO2.
     * @return AssetAllocationLinesVO2
     */
    public AssetAllocationLinesVOImpl getAssetAllocationLinesVO2() {
        return (AssetAllocationLinesVOImpl) findViewObject("AssetAllocationLinesVO2");
    }

    /**
     * Container's getter for AssetBillHistoryVO1.
     * @return AssetBillHistoryVO1
     */
    public AssetBillHistoryVOImpl getAssetBillHistoryVO1() {
        return (AssetBillHistoryVOImpl) findViewObject("AssetBillHistoryVO1");
    }

    /**
     * Container's getter for AssetAllocationDatesVO1.
     * @return AssetAllocationDatesVO1
     */
    public AssetAllocationDatesVOImpl getAssetAllocationDatesVO1() {
        return (AssetAllocationDatesVOImpl) findViewObject("AssetAllocationDatesVO1");
    }


    /**
     * Container's getter for DeploymentRcptAccessoriesVO2.
     * @return DeploymentRcptAccessoriesVO2
     */
    public DeploymentRcptAccessoriesVOImpl getDeploymentRcptAccessoriesVO2() {
        return (DeploymentRcptAccessoriesVOImpl) findViewObject("DeploymentRcptAccessoriesVO2");
    }

    /**
     * Container's getter for DeploymentRcptMobilizationVO2.
     * @return DeploymentRcptMobilizationVO2
     */
    public DeploymentRcptMobilizationVOImpl getDeploymentRcptMobilizationVO2() {
        return (DeploymentRcptMobilizationVOImpl) findViewObject("DeploymentRcptMobilizationVO2");
    }

    /**
     * Container's getter for TransTripTimesheetSearchVO1.
     * @return TransTripTimesheetSearchVO1
     */
    public TransTripTimesheetSearchVOImpl getTransTripTimesheetSearchVO1() {
        return (TransTripTimesheetSearchVOImpl) findViewObject("TransTripTimesheetSearchVO1");
    }

    /**
     * Container's getter for TripHeaderSearchVO1.
     * @return TripHeaderSearchVO1
     */
    public TripHeaderSearchVOImpl getTripHeaderSearchVO1() {
        return (TripHeaderSearchVOImpl) findViewObject("TripHeaderSearchVO1");
    }

    /**
     * Container's getter for TripHeaderVO1.
     * @return TripHeaderVO1
     */
    public TripHeaderVOImpl getTripHeaderVO1() {
        return (TripHeaderVOImpl) findViewObject("TripHeaderVO1");
    }

    /**
     * Container's getter for TripLinesVO1.
     * @return TripLinesVO1
     */
    public TripLinesVOImpl getTripLinesVO1() {
        return (TripLinesVOImpl) findViewObject("TripLinesVO1");
    }

    /**
     * Container's getter for TripTsHdrToLinesVL1.
     * @return TripTsHdrToLinesVL1
     */
    public ViewLinkImpl getTripTsHdrToLinesVL1() {
        return (ViewLinkImpl) findViewLink("TripTsHdrToLinesVL1");
    }

    /**
     * Container's getter for AttachmentsVO5.
     * @return AttachmentsVO5
     */
    public AttachmentsVOImpl getAttachmentsVO5() {
        return (AttachmentsVOImpl) findViewObject("AttachmentsVO5");
    }

    /**
     * Container's getter for TripTsHdrToAttachmentVL1.
     * @return TripTsHdrToAttachmentVL1
     */
    public ViewLinkImpl getTripTsHdrToAttachmentVL1() {
        return (ViewLinkImpl) findViewLink("TripTsHdrToAttachmentVL1");
    }

    /**
     * Container's getter for MaxTripTimesheetNumVO1.
     * @return MaxTripTimesheetNumVO1
     */
    public MaxTripTimesheetNumVOImpl getMaxTripTimesheetNumVO1() {
        return (MaxTripTimesheetNumVOImpl) findViewObject("MaxTripTimesheetNumVO1");
    }

    /**
     * Container's getter for TripHeaderValidateVO1.
     * @return TripHeaderValidateVO1
     */
    public TripHeaderValidateVOImpl getTripHeaderValidateVO1() {
        return (TripHeaderValidateVOImpl) findViewObject("TripHeaderValidateVO1");
    }

    /**
     * Container's getter for TripHeaderPreviousDayValidateVO1.
     * @return TripHeaderPreviousDayValidateVO1
     */
    public TripHeaderPreviousDayValidateVOImpl getTripHeaderPreviousDayValidateVO1() {
        return (TripHeaderPreviousDayValidateVOImpl) findViewObject("TripHeaderPreviousDayValidateVO1");
    }

    /**
     * Container's getter for TsConfirmCheckVO1.
     * @return TsConfirmCheckVO1
     */
    public TsConfirmCheckVOImpl getTsConfirmCheckVO1() {
        return (TsConfirmCheckVOImpl) findViewObject("TsConfirmCheckVO1");
    }

    /**
     * Container's getter for ActionHistoryVO1.
     * @return ActionHistoryVO1
     */
    public ActionHistoryVOImpl getActionHistoryVO1() {
        return (ActionHistoryVOImpl) findViewObject("ActionHistoryVO1");
    }

    /**
     * Container's getter for RentalQuoteValidFromValidateVO1.
     * @return RentalQuoteValidFromValidateVO1
     */
    public RentalQuoteValidFromValidateVOImpl getRentalQuoteValidFromValidateVO1() {
        return (RentalQuoteValidFromValidateVOImpl) findViewObject("RentalQuoteValidFromValidateVO1");
    }
    
    /*------------------------------------------------------------Asset Billing Order-------------------------------------------------------------------------------*/
    
    public String createTransBillingSearch() {
        String message = "Success";
        try {
            getTransBillingsearchVO1().executeQuery();

            TransBillingsearchVORowImpl transRow =
                (TransBillingsearchVORowImpl) getTransBillingsearchVO1().getCurrentRow();
            if (transRow != null) {
                transRow.remove();
            }
            transRow = (TransBillingsearchVORowImpl) getTransBillingsearchVO1().createRow();
            getTransBillingsearchVO1().insertRow(transRow);
        } catch (Exception e) {
            e.printStackTrace();
            message = e.getMessage();
        }
        return message;
    }
    


    /**
     * Container's getter for TransBillingsearchVO1.
     * @return TransBillingsearchVO1
     */
    public TransBillingsearchVOImpl getTransBillingsearchVO1() {
        return (TransBillingsearchVOImpl) findViewObject("TransBillingsearchVO1");
    }
    
    public String searchBillings(){
        String message = "Success";
        try {
            TransBillingsearchVORowImpl searchRow =
                (TransBillingsearchVORowImpl) getTransBillingsearchVO1().getCurrentRow();
            if(searchRow != null){
                if(searchRow.getTransSrcBuId() == null) {
                    return "Source Business unit is required.";
                }
                else if(("Y".equals(searchRow.getTransSrcDivRequired()) && searchRow.getTransSrcDivision() == null)) {
                    return "Source Divison is required for the seleted Source Business Unit.";
                }
                else if(searchRow.getTransReqBuId() == null) {
                    return "Requesting Business Unit is required.";
                }

                getBillingSearchVO1().setNamedWhereClauseParam("p_src_bu_id", searchRow.getTransSrcBuId());
                getBillingSearchVO1().setNamedWhereClauseParam("p_src_div_flex_val_id", searchRow.getTransSrcDivFlexValueId());
                getBillingSearchVO1().setNamedWhereClauseParam("p_req_bu_id", searchRow.getTransReqBuId());
                getBillingSearchVO1().setNamedWhereClauseParam("p_contract_id", searchRow.getTransContractId());
                getBillingSearchVO1().setNamedWhereClauseParam("p_customer_type", searchRow.getTransCustTypeCode());
                getBillingSearchVO1().setNamedWhereClauseParam("p_project_id", searchRow.getTransProjectId());
                getBillingSearchVO1().setNamedWhereClauseParam("p_div_flex_val_id", searchRow.getTransDivFlexValueId());
                getBillingSearchVO1().setNamedWhereClauseParam("p_dept_flex_val_id", searchRow.getTransDeptFlexValueId());
                getBillingSearchVO1().setNamedWhereClauseParam("p_bill_number", searchRow.getTransBillNumber());
                getBillingSearchVO1().setNamedWhereClauseParam("p_customer_id", searchRow.getTransCustomerId());
                getBillingSearchVO1().setNamedWhereClauseParam("p_document_date", searchRow.getTransBillDate());
                
                getBillingSearchVO1().executeQuery();
            }
        }catch (Exception e) {
            e.printStackTrace();
            message = e.getMessage();
        }
        return message;
    }
    
    public String resetBillingsSearch(){
        String message = "Success";
        try {
            TransBillingsearchVORowImpl searchRow =
                (TransBillingsearchVORowImpl) getTransBillingsearchVO1().getCurrentRow();
            if(searchRow != null){
                searchRow.setTransSrcBuId(null);
                searchRow.setTransSrcBuName(null);
                searchRow.setTransSrcDivRequired(null);
                searchRow.setTransSrcDivFlexValueId(null);
                searchRow.setTransSrcDivRequired(null);
                searchRow.setTransSrcDivSegmentNumber(null);
                searchRow.setTransReqBuName(null);
                searchRow.setTransReqBuId(null);
                searchRow.setTransReqDeptSegmentNumber(null);
                searchRow.setTransReqDivSegmentNumber(null);
                searchRow.setTransContractNumber(null);
                searchRow.setTransContractId(null);
                searchRow.setTransCustType(null);                
                searchRow.setTransCustTypeCode(null);
                searchRow.setTransProject(null);
                searchRow.setTransProjectId(null);
                searchRow.setTransDivision(null);
                searchRow.setTransDivFlexValueId(null);
                searchRow.setTransDeptName(null);
                searchRow.setTransDeptFlexValueId(null);
                searchRow.setTransCustomerName(null);
                searchRow.setTransCustomerId(null);
                searchRow.setTransBillNumber(null);
                searchRow.setTransBillDate(null);
                
                getBillingSearchVO1().setNamedWhereClauseParam("p_src_bu_id", null);
                getBillingSearchVO1().setNamedWhereClauseParam("p_src_div_flex_val_id", null);
                getBillingSearchVO1().setNamedWhereClauseParam("p_req_bu_id", null);
                getBillingSearchVO1().setNamedWhereClauseParam("p_contract_id", null);
                getBillingSearchVO1().setNamedWhereClauseParam("p_customer_type", null);
                getBillingSearchVO1().setNamedWhereClauseParam("p_project_id", null);
                getBillingSearchVO1().setNamedWhereClauseParam("p_div_flex_val_id", null);
                getBillingSearchVO1().setNamedWhereClauseParam("p_dept_flex_val_id", null);
                getBillingSearchVO1().setNamedWhereClauseParam("p_customer_id", null);
                getBillingSearchVO1().setNamedWhereClauseParam("p_bill_number", null);
                getBillingSearchVO1().setNamedWhereClauseParam("p_document_date", null);
                
                getBillingSearchVO1().executeQuery();
            }
        }catch (Exception e) {
            e.printStackTrace();
            message = e.getMessage();
        }
        return message;
    }
    
    /**
     * Container's getter for BillingSearchVO1.
     * @return BillingSearchVO1
     */
    public BillingSearchVOImpl getBillingSearchVO1() {
        return (BillingSearchVOImpl) findViewObject("BillingSearchVO1");
    }
    
    /**
     * Container's getter for BillingHdrVO1.
     * @return BillingHdrVO1
     */
    public BillingHdrVOImpl getBillingHdrVO1() {
        return (BillingHdrVOImpl) findViewObject("BillingHdrVO1");
    }
    
    public String createBill() 
    {
        String msg = "Success";
        try 
        {
            getBillingHdrVO1().executeQuery();
            
            BillingHdrVORowImpl newRow = (BillingHdrVORowImpl) getBillingHdrVO1().createRow();
            getBillingHdrVO1().insertRow(newRow);
            newRow.setStatus("D");
            newRow.setTransBillStatus("Draft");
            
            newRow.setTransAttachCode("XXADS_BILLING_HDR_T");
           
        }
        catch(Exception e) 
        {
            msg = e.getMessage();
            e.printStackTrace();
        }
        
        return msg;
    }
    
    public String generateBillNumber(){
        String message = "Success";
        try {
            oracle.jbo.domain.Number reqNum = new oracle.jbo.domain.Number(0);
            
            BillingHdrVORowImpl newRow = (BillingHdrVORowImpl) getBillingHdrVO1().getCurrentRow();
            if(newRow != null && newRow.getBillNumber() == null){
                getMaxBillNumberVO1().setNamedWhereClauseParam("p_bu_id", newRow.getSrcBuId());
                getMaxBillNumberVO1().setNamedWhereClauseParam("p_div_flex_val_id", newRow.getSrcDivFlexValId());
                getMaxBillNumberVO1().executeQuery();
                MaxBillNumberVORowImpl reqRow = (MaxBillNumberVORowImpl) getMaxBillNumberVO1().first();                
                if(getMaxBillNumberVO1().getRowCount() > 0)
                {
                    reqNum = reqRow.getSeqNum();
                }                
                oracle.jbo.domain.Number  seq = updateDocSequenceNumber("AB",newRow.getSrcBuId(), newRow.getSrcDivFlexValId(), reqNum);
                if(seq == null){
                    return "Please define Document Sequence and then continue";
                }
                String divCode = getSequenceCode("AB",newRow.getSrcBuId(), newRow.getSrcDivFlexValId());
                if(seq != null && divCode == null)
                {
                    newRow.setBillNumber("AB-"+seq);
                }else if(seq != null && divCode != null){
                    
                    newRow.setBillNumber(divCode+"-AB-"+seq);
                }
            }
        }catch (Exception e) {
            e.printStackTrace();
            message = e.getMessage();
        }
        return message;
    }
    
    public String editBill() 
    {
        String msg = "Success";
        try 
        {
            BillingSearchVORowImpl searchRow = (BillingSearchVORowImpl) getBillingSearchVO1().getCurrentRow();
            if(searchRow != null){
                getAccessTypeVO1().setNamedWhereClauseParam("p_customer_type", searchRow.getCustomerType());
                
                if("P".equals(searchRow.getCustomerType())){
                    getAccessTypeVO1().setNamedWhereClauseParam("p_value_id", searchRow.getProjectId());
                }else if("C".equals(searchRow.getCustomerType())){
                    getAccessTypeVO1().setNamedWhereClauseParam("p_value_id", searchRow.getCustomerId());
                }else if("D".equals(searchRow.getCustomerType())){
                    getAccessTypeVO1().setNamedWhereClauseParam("p_value_id", searchRow.getDeptFlexValueId());
                }else if("DV".equals(searchRow.getCustomerType())){
                    getAccessTypeVO1().setNamedWhereClauseParam("p_value_id", searchRow.getDivFlexValueId());
                }
                getAccessTypeVO1().setNamedWhereClauseParam("p_src_bu_id", searchRow.getSrcBuId());
                getAccessTypeVO1().setNamedWhereClauseParam("p_req_bu_id", searchRow.getReqBuId());
                getAccessTypeVO1().setNamedWhereClauseParam("p_src_div_flex_val_id", searchRow.getSrcDivFlexValId());
                
                getAccessTypeVO1().executeQuery();
                
                AccessTypeVORowImpl row = (AccessTypeVORowImpl) getAccessTypeVO1().first();
                
                if(row != null && "F".equals(row.getAccessType())){
                    ADFContext.getCurrent().getPageFlowScope().put("billEditFlag", "Y");
                }else{
                    ADFContext.getCurrent().getPageFlowScope().put("billEditFlag", "N");
                }
                
                getBillingHdrVO1().setNamedWhereClauseParam("p_header_id", searchRow.getHeaderId());
                getBillingHdrVO1().setApplyViewCriteriaName("BillingHdrVOCriteria");
                getBillingHdrVO1().executeQuery();
            }
        }
        catch(Exception e) 
        {
            msg = e.getMessage();
            e.printStackTrace();
        }
        
        return msg;    
    }
   
    /**
     * Container's getter for MaxBillNumberVO1.
     * @return MaxBillNumberVO1
     */
    public MaxBillNumberVOImpl getMaxBillNumberVO1() {
        return (MaxBillNumberVOImpl) findViewObject("MaxBillNumberVO1");
    }
    
    public String setBillingSearch(){
        String message = "Success";
        try {
            getTransBillingsearchVO1().executeQuery();
            TransBillingsearchVORowImpl transRow =
                (TransBillingsearchVORowImpl) getTransBillingsearchVO1().getCurrentRow();
            if(transRow == null){
                transRow = (TransBillingsearchVORowImpl) getTransBillingsearchVO1().createRow();
                getTransBillingsearchVO1().insertRow(transRow);
            }
            
            Map pageFlowScope = ADFContext.getCurrent().getPageFlowScope();
            
            transRow.setTransSrcBuName((String) pageFlowScope.get("abSrcBuName"));
            transRow.setTransSrcBuId((oracle.jbo.domain.Number) pageFlowScope.get("abSrcBuId"));
            transRow.setTransSrcDivision((String) pageFlowScope.get("abSrcDiv"));
            transRow.setTransSrcDivFlexValueId((oracle.jbo.domain.Number) pageFlowScope.get("abSrcDivFlexValueId"));
            transRow.setTransSrcDivRequired((String) pageFlowScope.get("abSrcDivRequired"));
            transRow.setTransSrcDivSegmentNumber((oracle.jbo.domain.Number) pageFlowScope.get("abSrcDivSegmentNumber"));
            
            transRow.setTransReqBuName((String) pageFlowScope.get("abReqBuName"));
            transRow.setTransReqBuId((oracle.jbo.domain.Number) pageFlowScope.get("abReqBuId"));
            transRow.setTransContractNumber((String) pageFlowScope.get("abContractNumber"));
            transRow.setTransContractId((oracle.jbo.domain.Number) pageFlowScope.get("abContractId"));
            transRow.setTransCustTypeCode((String) pageFlowScope.get("abCustTypeCode"));
            transRow.setTransCustType((String) pageFlowScope.get("abCustType"));
            transRow.setTransProject((String) pageFlowScope.get("abProject"));
            transRow.setTransProjectId((oracle.jbo.domain.Number) pageFlowScope.get("abProjectId"));    
            
            transRow.setTransDivision((String) pageFlowScope.get("abDiv"));
            transRow.setTransDivFlexValueId((oracle.jbo.domain.Number) pageFlowScope.get("abDivFlexValueId"));           
            transRow.setTransDeptName((String) pageFlowScope.get("abDeptName"));
            transRow.setTransDeptFlexValueId((oracle.jbo.domain.Number) pageFlowScope.get("abDeptFlexValueId"));
            
            transRow.setTransCustomerName((String) pageFlowScope.get("abCustomerName"));
            transRow.setTransCustomerId((oracle.jbo.domain.Number) pageFlowScope.get("abCustomerId"));
            
            transRow.setTransBillNumber((String) pageFlowScope.get("abAllocationNumber"));
            
            if(pageFlowScope.get("abAllocationDate") != null)
            {
                oracle.jbo.domain.Date jboDate1 = new oracle.jbo.domain.Date(pageFlowScope.get("abAllocationDate").toString());
                transRow.setTransBillDate(jboDate1);
            }
            
            transRow.setTransSrcDivRequired((String) pageFlowScope.get("abSrcDivRequired"));
            transRow.setTransSrcDivSegmentNumber((oracle.jbo.domain.Number) pageFlowScope.get("abSrcDivSegmentNumber"));
            transRow.setTransReqDivSegmentNumber((oracle.jbo.domain.Number) pageFlowScope.get("abReqDivSegmentNumber"));
            transRow.setTransReqDeptSegmentNumber((oracle.jbo.domain.Number) pageFlowScope.get("abReqDeptSegmentNumber"));

            getBillingSearchVO1().setNamedWhereClauseParam("p_src_bu_id", transRow.getTransSrcBuId());
            getBillingSearchVO1().setNamedWhereClauseParam("p_src_div_flex_val_id", transRow.getTransSrcDivFlexValueId());
            getBillingSearchVO1().setNamedWhereClauseParam("p_req_bu_id", transRow.getTransReqBuId());
            getBillingSearchVO1().setNamedWhereClauseParam("p_contract_id", transRow.getTransContractId());
            getBillingSearchVO1().setNamedWhereClauseParam("p_customer_type", transRow.getTransCustTypeCode());
            getBillingSearchVO1().setNamedWhereClauseParam("p_project_id", transRow.getTransProjectId());
            getBillingSearchVO1().setNamedWhereClauseParam("p_div_flex_val_id", transRow.getTransDivFlexValueId());
            getBillingSearchVO1().setNamedWhereClauseParam("p_dept_flex_val_id", transRow.getTransDeptFlexValueId());
            getBillingSearchVO1().setNamedWhereClauseParam("p_bill_number", transRow.getTransBillNumber());
            getBillingSearchVO1().setNamedWhereClauseParam("p_customer_id", transRow.getTransCustomerId());
            getBillingSearchVO1().setNamedWhereClauseParam("p_document_date", transRow.getTransBillDate());
            
            getBillingSearchVO1().executeQuery();
            
        }catch (Exception e) {
            message = e.getMessage();
            e.printStackTrace();
        }
        return message;
    }
    
    public String assetBillSrcBuChange(){
        String message = "Success";
        try {
            BillingHdrVORowImpl hdrRow = (BillingHdrVORowImpl) getBillingHdrVO1().getCurrentRow();
            if(hdrRow != null){
                hdrRow.setTransContractNumber(null);
            }
        }catch (Exception e) {
            e.printStackTrace();
            message = e.getMessage();
        }
        return message;
    }
    
    public String assetBillSrcDivChange(){
        String message = "Success";
        try {
            BillingHdrVORowImpl hdrRow = (BillingHdrVORowImpl) getBillingHdrVO1().getCurrentRow();
            if(hdrRow != null){
                hdrRow.setTransContractNumber(null);
            }
        }catch (Exception e) {
            e.printStackTrace();
            message = e.getMessage();
        }
        return message;
    }
    
    public String assetBillReqBuChange(){
        String message = "Success";
        try {
            BillingHdrVORowImpl hdrRow = (BillingHdrVORowImpl) getBillingHdrVO1().getCurrentRow();
            if(hdrRow != null){
                hdrRow.setTransContractNumber(null);
            }
        }catch (Exception e) {
            e.printStackTrace();
            message = e.getMessage();
        }
        return message;
    }
    
    /**
     * Container's getter for BillingAssetsVO1.
     * @return BillingAssetsVO1
     */
    public BillingAssetsVOImpl getBillingAssetsVO1() {
        return (BillingAssetsVOImpl) findViewObject("BillingAssetsVO1");
    }

    /**
     * Container's getter for BillingHdrToAssetsVL1.
     * @return BillingHdrToAssetsVL1
     */
    public ViewLinkImpl getBillingHdrToAssetsVL1() {
        return (ViewLinkImpl) findViewLink("BillingHdrToAssetsVL1");
    }

    /**
     * Container's getter for BillingOperatorsVO1.
     * @return BillingOperatorsVO1
     */
    public BillingOperatorsVOImpl getBillingOperatorsVO1() {
        return (BillingOperatorsVOImpl) findViewObject("BillingOperatorsVO1");
    }

    /**
     * Container's getter for BillingHdrToOperatorsVL1.
     * @return BillingHdrToOperatorsVL1
     */
    public ViewLinkImpl getBillingHdrToOperatorsVL1() {
        return (ViewLinkImpl) findViewLink("BillingHdrToOperatorsVL1");
    }

    /**
     * Container's getter for BillingAddtlChargesVO1.
     * @return BillingAddtlChargesVO1
     */
    public BillingAddtlChargesVOImpl getBillingAddtlChargesVO1() {
        return (BillingAddtlChargesVOImpl) findViewObject("BillingAddtlChargesVO1");
    }

    /**
     * Container's getter for BillingHdrToAddtlChargesVL1.
     * @return BillingHdrToAddtlChargesVL1
     */
    public ViewLinkImpl getBillingHdrToAddtlChargesVL1() {
        return (ViewLinkImpl) findViewLink("BillingHdrToAddtlChargesVL1");
    }

    /**
     * Container's getter for BillingOtherChargesVO1.
     * @return BillingOtherChargesVO1
     */
    public BillingOtherChargesVOImpl getBillingOtherChargesVO1() {
        return (BillingOtherChargesVOImpl) findViewObject("BillingOtherChargesVO1");
    }

    /**
     * Container's getter for BillingHdrToOtherChargesVL1.
     * @return BillingHdrToOtherChargesVL1
     */
    public ViewLinkImpl getBillingHdrToOtherChargesVL1() {
        return (ViewLinkImpl) findViewLink("BillingHdrToOtherChargesVL1");
    }
    
    public String addOtherBillCharges() 
    {
        String msg = "Success";
        try 
        {
            BillingHdrVORowImpl hdrRow = (BillingHdrVORowImpl) getBillingHdrVO1().getCurrentRow();
            
            BillingOtherChargesVORowImpl newRow =
                (BillingOtherChargesVORowImpl) getBillingOtherChargesVO1().createRow();
            
            getBillingOtherChargesVO1().insertRow(newRow);
            newRow.setHeaderId(hdrRow.getHeaderId());
            newRow.setTransSiteId(hdrRow.getTransSetId());
            newRow.setTransProjectId(hdrRow.getProjectId());
            newRow.setTaxRateId(hdrRow.getHdrTaxRateId());
            newRow.setTaxRateCode(hdrRow.getHdrTaxRateCode());
            
        }
        catch(Exception e) 
        {
            msg = e.getMessage();
            e.printStackTrace();
        }
        return msg;
    }
    
    public String deleteOtherBillCharges() 
    {
        String msg = "Success";
        try 
        {
            BillingHdrVORowImpl hdrRow = (BillingHdrVORowImpl) getBillingHdrVO1().getCurrentRow();
            
            BillingOtherChargesVORowImpl currRow =
                (BillingOtherChargesVORowImpl) getBillingOtherChargesVO1().getCurrentRow();
            
          if(!("D".equals(hdrRow.getStatus())))
          {
              return "Cannot delete charges from confirmed bill.";
          }
               currRow.remove();
        }
        catch(Exception e) 
        {
            msg = e.getMessage();
            e.printStackTrace();
        }
        return msg;
    }

    /**
     * Container's getter for AttachmentsVO7.
     * @return AttachmentsVO7
     */
    public AttachmentsVOImpl getAttachmentsVO7() {
        return (AttachmentsVOImpl) findViewObject("AttachmentsVO7");
    }

    /**
     * Container's getter for BillingHdrToAttachmentsVL1.
     * @return BillingHdrToAttachmentsVL1
     */
    public ViewLinkImpl getBillingHdrToAttachmentsVL1() {
        return (ViewLinkImpl) findViewLink("BillingHdrToAttachmentsVL1");
    }
    
    public String addBillAttachment() {
        String message = "Success";
        try {
            BillingHdrVORowImpl currRow = (BillingHdrVORowImpl) getBillingHdrVO1().getCurrentRow();
            AttachmentsVORowImpl newRow = (AttachmentsVORowImpl) getAttachmentsVO7().createRow();
            getAttachmentsVO7().insertRow(newRow);
            newRow.setReferenceId(currRow.getHeaderId());
            newRow.setAttachmentCode("XXADS_BILLING_HDR_T");
            newRow.setCategory("Misc");
            newRow.setTransCategory("Miscellaneous");

        } catch (Exception e) {
            e.printStackTrace();
            message = e.getMessage();
        }
        return message;
    }
    
    public String uploadBillAttach() {
        String message = "Success";
        try {
            ADFContext adfCtx = ADFContext.getCurrent();
            Map pageFlowScope = adfCtx.getPageFlowScope();
            int ch = -1;

            AttachmentsVOImpl attachmentVO = getAttachmentsVO7();
            AttachmentsVORowImpl currRow = (AttachmentsVORowImpl) attachmentVO.getCurrentRow();
            InputStream in = (InputStream) pageFlowScope.get("UploadedFileStream");
            ByteArrayOutputStream bout = new ByteArrayOutputStream();
            new ByteArrayOutputStream();
            try {
                while ((ch = in.read()) != -1) {
                    bout.write(ch);
                }
                in.close();
                bout.close();

                currRow.setAttachmentFile(new BlobDomain(bout.toByteArray()));
            } catch (Exception e) {
                //                System.out.println(e.getMessage());
                return "ERROR";
            }

            String fileName = (String) pageFlowScope.get("FileName");
            currRow.setFileName(fileName);
            currRow.setFileType((String) pageFlowScope.get("FileType"));
        } catch (Exception e) {
            e.printStackTrace();
            message = e.getMessage();
        }
        return message;
    }
    
    public String populateBillLines(){
        String message = "Success";
        CallableStatement cs = null;
        try {
            BillingHdrVORowImpl currRow = (BillingHdrVORowImpl) getBillingHdrVO1().getCurrentRow();
            if(currRow != null){
                cs = this.getDBTransaction().createCallableStatement(POPULATE_BILL_LINES, 0);
                cs.setLong("p_hdr_id", currRow.getHeaderId().longValue());
                cs.setLong("p_contract_id", currRow.getMasterContractId().longValue());
                cs.setDate("p_from_date", currRow.getFromDate().dateValue());
                cs.setDate("p_to_date", currRow.getToDate().dateValue());
                cs.setString("p_user", (String)((Map)ADFContext.getCurrent().getSessionScope().get("userMap")).get("UserName"));
                cs.registerOutParameter("p_message", Types.VARCHAR);
                cs.execute();
                
                message = cs.getString("p_message");
                getBillingAssetsVO1().executeQuery();
//                getBillingOperatorsVO1().executeQuery();
                getBillingAddtlChargesVO1().executeQuery();
            }
        }catch (Exception e) {
            message = e.getMessage();
            e.printStackTrace();
        }
        return message;
    }
    
    
    public String callpkgForAMEABProcessSubmit() {
        CommonAMImpl commonAM = (CommonAMImpl) getCommonAM1();
        String msg = "";
        try {
            BillingHdrVORowImpl hdrRow = (BillingHdrVORowImpl) getBillingHdrVO1().getCurrentRow();
            CommonAMImpl commAM = (CommonAMImpl) getCommonAM1();
            if (hdrRow != null) {
                oracle.jbo.domain.Number hdrId = hdrRow.getHeaderId();
                Map paramsMap = new HashMap();
                paramsMap.put("docId", new oracle.jbo.domain.Number(hdrRow.getHeaderId()));
                paramsMap.put("docTypeId", new oracle.jbo.domain.Number(60));
                paramsMap.put("ActionCode", "Submit");
                paramsMap.put("currEmpId", commAM.getCurrentEmployeeId() != null ? commAM.getCurrentEmployeeId() : -1);
                paramsMap.put("remarks", "");
                paramsMap.put("docNum", hdrRow.getBillNumber());
                msg = commonAM.callAMEProcess(paramsMap);
                if ("Submitted".equals(msg)) {
                    submitABDocFor("In Process");
                    msg = "SUCCESS";
                }else if ("Finally Approved".equals(msg)||"Approved".equals(msg)) { //FYI approval only
                    submitABDocFor("Confirmed");                
                } else if ("SUCCESS".equals(msg)) {
                    submitABDocFor("Confirmed");
                }
                
                getBillingHdrVO1().setNamedWhereClauseParam("p_header_id", hdrId);
                getBillingHdrVO1().setApplyViewCriteriaName("BillingHdrVOCriteria");
                getBillingHdrVO1().executeQuery();
                
                if(getBillingHdrVO1().hasNext()){
                    getBillingHdrVO1().next();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return msg;

    }
    
    public void submitABDocFor(String toDocStatus) {
        try {
            if (getBillingHdrVO1().getCurrentRow() != null) {
                BillingHdrVORowImpl hdrRow = (BillingHdrVORowImpl) getBillingHdrVO1().getCurrentRow();
                if ("In Process".equals(toDocStatus)) {
                    hdrRow.setStatus("P");
                    hdrRow.setTransBillStatus(toDocStatus);
                } else if ("Confirmed".equals(toDocStatus)) {
                    hdrRow.setStatus("C");
                    hdrRow.setTransBillStatus(toDocStatus);
                }
                getDBTransaction().commit();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String withdrawABFromApproval(String remarks) {
        String message = null;
        try {
            if (getBillingHdrVO1().getCurrentRow() != null) {
                BillingHdrVORowImpl hdrRow = (BillingHdrVORowImpl) getBillingHdrVO1().getCurrentRow();
                CommonAMImpl commAM = (CommonAMImpl) getCommonAM1();
                CallableStatement st = getDBTransaction().createCallableStatement(WITHDRAW_APPRL_SUBMISSION, 0);
                st.setLong("p_document_type_id", 60);
                st.setLong("p_document_id", hdrRow.getHeaderId().longValue());
                st.setString("p_remarks", remarks);
                st.setLong("p_user",
                           commAM.getCurrentEmployeeId() != null ? commAM.getCurrentEmployeeId().longValue() : -1);
                st.setString("p_message", null);
                st.registerOutParameter("p_message", Types.VARCHAR);
                st.execute();
                message = st.getString("p_message");
                if ("Success".equals(message)) {
                    BillingHdrVORowImpl curRow = (BillingHdrVORowImpl) getBillingHdrVO1().getCurrentRow();
    //                    curRow.setRequestStatus("W");
                    curRow.setStatus("D");
                    curRow.setTransBillStatus("Draft");
                    this.getDBTransaction().commit();

                }
                getBillingHdrVO1().executeQuery();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return message;
    }
    
    public Boolean makeAsABCurrentRow(oracle.jbo.domain.Number HeaderId) {
        Boolean isSetted = false;

        getBillingHdrVO1().setNamedWhereClauseParam("p_header_id", HeaderId);
        getBillingHdrVO1().setApplyViewCriteriaName("BillingHdrVOCriteria");
        getBillingHdrVO1().executeQuery();

        if (getBillingHdrVO1().first() != null) {
            BillingHdrVORowImpl custRow = (BillingHdrVORowImpl) getBillingHdrVO1().getCurrentRow();
            if (HeaderId.longValue() == custRow.getHeaderId().longValue()) {
                isSetted = true;
            }
        }
        return isSetted;
    }
    
    public String setLinesTaxRate() 
    {
        String message = "Success";
        try 
        {
            BillingHdrVORowImpl currRow = (BillingHdrVORowImpl) getBillingHdrVO1().getCurrentRow();
            if(currRow != null) 
            {
                RowSetIterator itr = getBillingAssetsVO1().createRowSetIterator(null);
                while(itr.hasNext())
                {
                    BillingAssetsVORowImpl lineRow = (BillingAssetsVORowImpl) itr.next();    
                    lineRow.setTaxRateCode(currRow.getHdrTaxRateCode());
                    lineRow.setTaxRateId(currRow.getHdrTaxRateId());
                    lineRow.setTaxRatePercent(currRow.getTransTaxRatePercentage());
                    lineRow.setVatTaxAmount(lineRow.getAssetGrossAmt().multiply(currRow.getTransTaxRatePercentage().divide(100)));
                }
                RowSetIterator itr1 = getBillingAddtlChargesVO1().createRowSetIterator(null);
                while(itr1.hasNext())
                {
                    BillingAddtlChargesVORowImpl addtllineRow = (BillingAddtlChargesVORowImpl) itr1.next();    
                    addtllineRow.setTaxRateCode(currRow.getHdrTaxRateCode());
                    addtllineRow.setTaxRateId(currRow.getHdrTaxRateId());
                    addtllineRow.setTaxRatePercent(currRow.getTransTaxRatePercentage());
                    addtllineRow.setVatTaxAmount(addtllineRow.getAmount().multiply(currRow.getTransTaxRatePercentage().divide(100)));
                }
                RowSetIterator itr2 = getBillingOtherChargesVO1().createRowSetIterator(null);
                while(itr2.hasNext())
                {
                    BillingOtherChargesVORowImpl othrlineRow = (BillingOtherChargesVORowImpl) itr2.next();    
                    othrlineRow.setTaxRateCode(currRow.getHdrTaxRateCode());
                    othrlineRow.setTaxRateId(currRow.getHdrTaxRateId());
                    othrlineRow.setTaxRatePercent(currRow.getTransTaxRatePercentage());
                    if(othrlineRow.getAmount()!=null)
                    {
                    othrlineRow.setVatTaxAmount(othrlineRow.getAmount().multiply(currRow.getTransTaxRatePercentage().divide(100)));
                    }
//                  else
//                    {
//                    int b=0;
//                    oracle.jbo.domain.Number a=new oracle.jbo.domain.Number(b);
//                    othrlineRow.setVatTaxAmount(a);
//                    }
                    
                }
                
                
            }
        }
        catch(Exception e) 
        {
            message = e.getMessage();
            e.printStackTrace();
        }
        return message;
    }
    
    public String updateLineAmount() 
    {
        String message = "Success";
        try 
        {
            oracle.jbo.domain.Number discountAmt = new oracle.jbo.domain.Number(0);
            oracle.jbo.domain.Number vatAmt = new oracle.jbo.domain.Number(0);
            BillingAssetsVORowImpl lineRow = (BillingAssetsVORowImpl) getBillingAssetsVO1().getCurrentRow();
            if(lineRow.getAssetDiscountAmt() != null)
            discountAmt = lineRow.getAssetDiscountAmt();
            if(lineRow.getTaxRatePercent() != null) 
            {
                lineRow.setVatTaxAmount(lineRow.getAssetGrossAmt().multiply(lineRow.getTaxRatePercent().divide(100))); 
                vatAmt = lineRow.getVatTaxAmount();
            }
            
            lineRow.setTransNetAmount(lineRow.getAssetGrossAmt().subtract(discountAmt).add(vatAmt));
        }
        catch(Exception e) 
        {
            message = e.getMessage();
            e.printStackTrace();    
        }
        
        return message;
    }
    
    public void recalculateBillHdrAmount() 
    {
        try 
        {
            oracle.jbo.domain.Number discountAmt = new oracle.jbo.domain.Number(0);
            oracle.jbo.domain.Number zero = new oracle.jbo.domain.Number(0);
            oracle.jbo.domain.Number netAmt = new oracle.jbo.domain.Number(0);
            BillingHdrVORowImpl hdrRow = (BillingHdrVORowImpl) getBillingHdrVO1().getCurrentRow();
            if(hdrRow != null) 
            {
                //get asset details
                getBillingAssetsVO2().setNamedWhereClauseParam("p_header_id", hdrRow.getHeaderId());                      
                getBillingAssetsVO2().setApplyViewCriteriaName("BillingAssetsVOCriteria");
                getBillingAssetsVO2().executeQuery();
                
                if(getBillingAssetsVO2().getRowCount() > 0) 
                {
                    RowSetIterator assetItr = getBillingAssetsVO2().createRowSetIterator(null);
                    while(assetItr.hasNext()) 
                    {
                        BillingAssetsVORowImpl assetRow = (BillingAssetsVORowImpl) assetItr.next();
                        if(assetRow != null) 
                        {
                            discountAmt = discountAmt.add((assetRow.getAssetDiscountAmt() != null ? assetRow.getAssetDiscountAmt() : zero));    
                            netAmt = netAmt.add((assetRow.getTransNetAmount() != null ? assetRow.getTransNetAmount() : zero));  
                        }
                    }
                }       
            
            
                //get additional charges
                getBillingAddtlChargesVO2().setNamedWhereClauseParam("p_header_id", hdrRow.getHeaderId());                      
                getBillingAddtlChargesVO2().setApplyViewCriteriaName("BillingAddtlChargesVOCriteria");
                getBillingAddtlChargesVO2().executeQuery();
                
                if(getBillingAddtlChargesVO2().getRowCount() > 0) 
                {
                    RowSetIterator acItr = getBillingAddtlChargesVO2().createRowSetIterator(null);
                    while(acItr.hasNext()) 
                    {
                        BillingAddtlChargesVORowImpl acRow = (BillingAddtlChargesVORowImpl) acItr.next();
                        if(acRow != null) 
                        {
                            netAmt = netAmt.add((acRow.getAmount() != null ? acRow.getAmount() : zero));  
                            netAmt = netAmt.add((acRow.getVatTaxAmount() != null ? acRow.getVatTaxAmount() : zero));  
                        }
                    }
                }   
                
                //get other charges
                getBillingOtherChargesVO2().setNamedWhereClauseParam("p_header_id", hdrRow.getHeaderId());                      
                getBillingOtherChargesVO2().setApplyViewCriteriaName("BillingOtherChargesVOCriteria");
                getBillingOtherChargesVO2().executeQuery();
                
                if(getBillingOtherChargesVO2().getRowCount() > 0) 
                {
                    RowSetIterator ocItr = getBillingOtherChargesVO2().createRowSetIterator(null);
                    while(ocItr.hasNext()) 
                    {
                        BillingOtherChargesVORowImpl ocRow = (BillingOtherChargesVORowImpl) ocItr.next();
                        if(ocRow != null) 
                        {
                            netAmt = netAmt.add((ocRow.getAmount() != null ? ocRow.getAmount() : zero));  
                            netAmt = netAmt.add((ocRow.getVatTaxAmount() != null ? ocRow.getVatTaxAmount() : zero));  
                        }
                    }
                }   
            
                hdrRow.setDiscountAmt(discountAmt);
                hdrRow.setNetBillingAmt(netAmt);
            }
        }
        catch(Exception e) 
        {
            e.printStackTrace();    
        }
    }
    
    public String deleteBillingAsset(){
        String message = "Success";
        CallableStatement cs = null;
        try {
            BillingHdrVORowImpl hdrRow = (BillingHdrVORowImpl) getBillingHdrVO1().getCurrentRow();
            BillingAssetsVORowImpl currRow = (BillingAssetsVORowImpl) getBillingAssetsVO1().getCurrentRow();
            if(hdrRow != null && ("D".equals(hdrRow.getStatus()) || "R".equals(hdrRow.getStatus())) && currRow != null){
                
                cs = this.getDBTransaction().createCallableStatement(DELETE_BILLING_ASSET,0);
                cs.setLong("p_bill_header_id", hdrRow.getHeaderId().longValue());
                cs.setLong("p_bill_asset_id", currRow.getAssetLineId().longValue());
                cs.setString("p_rental_type", currRow.getRentalType());
                cs.setString("p_user", (String)((Map)ADFContext.getCurrent().getSessionScope().get("userMap")).get("UserName"));
                cs.registerOutParameter("p_message", Types.VARCHAR);
                cs.execute();                                            
                message = cs.getString("p_message");
                
                getBillingAssetsVO1().executeQuery();
            }
        }catch (Exception e) {
            e.printStackTrace();
            message = e.getMessage();
        }
        return message;
    }
    
    public String billSubmitTsCheck(){
        String message = "Success";
        try {
            BillingHdrVORowImpl hdrRow = (BillingHdrVORowImpl) getBillingHdrVO1().getCurrentRow();
            if(hdrRow != null){
                //Check whether there are any lines or not
                if(getBillingAssetsVO1().getRowCount() == 0 && getBillingAddtlChargesVO1().getRowCount() == 0 && getBillingOtherChargesVO1().getRowCount() == 0){
                    return "Please add Lines to continue submitting the document";
                }
                
                getApprovalHoldCheckVO1().setNamedWhereClauseParam("p_contract_id", hdrRow.getContractId());
                getApprovalHoldCheckVO1().executeQuery();
                
                ApprovalHoldCheckVORowImpl holdRow = (ApprovalHoldCheckVORowImpl) getApprovalHoldCheckVO1().first();
                if(holdRow != null && "Y".equals(holdRow.getHoldFlag())){
                    return "Contract is in Approval Hold in Credit Control. Can't submit the Billing Docuemnt";
                }
                
                getBillSubmitTsCheckVO1().setNamedWhereClauseParam("p_contract_id", hdrRow.getMasterContractId());
                getBillSubmitTsCheckVO1().setNamedWhereClauseParam("p_from_date", hdrRow.getFromDate());
                getBillSubmitTsCheckVO1().setNamedWhereClauseParam("p_to_date", hdrRow.getToDate());
                getBillSubmitTsCheckVO1().executeQuery();
                
                BillSubmitTsCheckVORowImpl checkRow = (BillSubmitTsCheckVORowImpl) getBillSubmitTsCheckVO1().first();
                
                if(checkRow != null && checkRow.getTsCount().compareTo(new oracle.jbo.domain.Number(0)) > 0){
                    return "Some Timesheets for the given dates and Contract are not populated in this document. Please re-populate and try again";
                }
            }
        }catch (Exception e) {
            e.printStackTrace();
            message = e.getMessage();
        }
        return message;
    }
    
    /**
     * Container's getter for BillingAssetsVO2.
     * @return BillingAssetsVO2
     */
    public BillingAssetsVOImpl getBillingAssetsVO2() {
        return (BillingAssetsVOImpl) findViewObject("BillingAssetsVO2");
    }

    /**
     * Container's getter for BillingOperatorsVO2.
     * @return BillingOperatorsVO2
     */
    public BillingOperatorsVOImpl getBillingOperatorsVO2() {
        return (BillingOperatorsVOImpl) findViewObject("BillingOperatorsVO2");
    }

    /**
     * Container's getter for BillingAddtlChargesVO2.
     * @return BillingAddtlChargesVO2
     */
    public BillingAddtlChargesVOImpl getBillingAddtlChargesVO2() {
        return (BillingAddtlChargesVOImpl) findViewObject("BillingAddtlChargesVO2");
    }

    /**
     * Container's getter for BillingOtherChargesVO2.
     * @return BillingOtherChargesVO2
     */
    public BillingOtherChargesVOImpl getBillingOtherChargesVO2() {
        return (BillingOtherChargesVOImpl) findViewObject("BillingOtherChargesVO2");
    }

    /**
     * Container's getter for BillSubmitTsCheckVO1.
     * @return BillSubmitTsCheckVO1
     */
    public BillSubmitTsCheckVOImpl getBillSubmitTsCheckVO1() {
        return (BillSubmitTsCheckVOImpl) findViewObject("BillSubmitTsCheckVO1");
    }
    /*------------------------------------------------------------Methods end-------------------------------------------------------------------------------*/

    /**
     * Container's getter for TransTemplateVO1.
     * @return TransTemplateVO1
     */
    public TransTemplateVOImpl getTransTemplateVO1() {
        return (TransTemplateVOImpl) findViewObject("TransTemplateVO1");
    }

    /**
     * Container's getter for TimeSheetsIntVO1.
     * @return TimeSheetsIntVO1
     */
    public TimeSheetsIntVOImpl getTimeSheetsIntVO1() {
        return (TimeSheetsIntVOImpl) findViewObject("TimeSheetsIntVO1");
    }
    
    public byte[] downloadTimeSheetTemplate() //FOR DOWNLOADING EXCEL FORMAT FILE
        {     
            byte[] data = null;
            try
            {
                XSSFWorkbook workbook = new XSSFWorkbook();
                            XSSFSheet worksheet = workbook.createSheet("Timesheet Upload");
                            XSSFFont font = workbook.createFont();
                            font.setColor(IndexedColors.WHITE.getIndex());
                            font.setBoldweight(HSSFFont.BOLDWEIGHT_BOLD);
                            CellStyle cellStyleHdr = workbook.createCellStyle();      
                            cellStyleHdr.setFont(font);      
                            cellStyleHdr.setFillForegroundColor(IndexedColors.ROYAL_BLUE.getIndex());
                            cellStyleHdr.setFillPattern(CellStyle.SOLID_FOREGROUND);
                            
                            XSSFRow  excelrow = null;            
                        
                            int i = 0;


                       //print header on first row in excel
                       
                           excelrow = (XSSFRow)worksheet.createRow((short)i);
                     
                              
                           XSSFCell cellA1 = excelrow.createCell(0);
                           cellA1.setCellValue("Transaction Type");
                           cellA1.setCellStyle(cellStyleHdr);
                            
                            XSSFCell cellA2 = excelrow.createCell(1);
                            cellA2.setCellValue("Transaction Date");
                            cellA2.setCellStyle(cellStyleHdr);
                                                                                       
                            XSSFCell cellA3 = excelrow.createCell(2);
                            cellA3.setCellValue("Asset Number");
                            cellA3.setCellStyle(cellStyleHdr);
                            
                            XSSFCell cellA4 = excelrow.createCell(3);
                            cellA4.setCellValue("Employee Number");
                            cellA4.setCellStyle(cellStyleHdr);
                            
                            XSSFCell cellA5 = excelrow.createCell(4);
                            cellA5.setCellValue("Slip Number");
                            cellA5.setCellStyle(cellStyleHdr);     
              
                            XSSFCell cellA6 = excelrow.createCell(5);
                            cellA6.setCellValue("Start Date & Time");
                            cellA6.setCellStyle(cellStyleHdr); 
                
                            XSSFCell cellA7 = excelrow.createCell(6);
                            cellA7.setCellValue("End Date & Time");
                            cellA7.setCellStyle(cellStyleHdr); 
                            
                            XSSFCell cellA8 = excelrow.createCell(7);
                            cellA8.setCellValue("Task");
                            cellA8.setCellStyle(cellStyleHdr);
                
                            XSSFCell cellA9 = excelrow.createCell(8);
                            cellA9.setCellValue("Expenditure Type");
                            cellA9.setCellStyle(cellStyleHdr);
               
                ByteArrayOutputStream bos = new ByteArrayOutputStream();
                try 
                {
                    workbook.write(bos);
                    bos.close();
                } 
                catch (Exception e) 
                {
                        // TODO: Add catch code
                        e.printStackTrace();
                    }
                data = bos.toByteArray();
                                              
                              
                
            } 
            catch (Exception e)
            {
                // TODO: Add catch code
                e.printStackTrace();
            }
            
            return data;
        }
    
    public String insertIntTimeSheetData(UploadedFile uploadedfiletimesheet) //FOR READING THROUGH FILE UPLOADED BY USER
        {   
            String message = "Success";
            String remarks = null;
            try {
                
                RowSetIterator itr= getTimeSheetsIntVO1().createRowSetIterator(null);
                                    while(itr.hasNext())
                                    {
                                        TimeSheetsIntVORowImpl itrRow = (TimeSheetsIntVORowImpl)itr.next();
                                        itrRow.remove();
                                    }
                                    getDBTransaction().commit();
                
                if(uploadedfiletimesheet != null)
                {
                    InputStream ipstream = uploadedfiletimesheet.getInputStream();
                    XSSFWorkbook workbook = new XSSFWorkbook(ipstream);
                    XSSFSheet worksheet = workbook.getSheetAt(0);
                    Iterator<org.apache.poi.ss.usermodel.Row> rowIterator = worksheet.iterator();
                    for(int i = 0; i<1 ; i++)
                    {
                        org.apache.poi.ss.usermodel.Row frow = rowIterator.next();
                    }
                    oracle.jbo.server.SequenceImpl seq11 = new oracle.jbo.server.SequenceImpl("XXADS_TIMESHEET_INT_UPLOAD_S", this.getDBTransaction());
                    oracle.jbo.domain.Number iid = seq11.getSequenceNumber();
                    ADFContext.getCurrent().getPageFlowScope().put("v_upload_id",iid);
                    while(rowIterator.hasNext())
                    {
                        org.apache.poi.ss.usermodel.Row row = rowIterator.next();
                        if(row!= null)
                        {
                            remarks = null;
                            TimeSheetsIntVORowImpl introw = (TimeSheetsIntVORowImpl)getTimeSheetsIntVO1().createRow(); 
                            Iterator<Cell> cellIterator = row.cellIterator();
                            Cell cell = null;
                            introw.setUploadId(iid);
                                try 
                                {
                                    if(row.getCell(0) != null)
                                    {
                                        cell = cellIterator.next();
                                        
                                        if(cell.getCellType()==1)
                                        {
                                            Object otranstype=cell.getStringCellValue();
                                            introw.setTransactionType(otranstype.toString());
                                        }
                                        
                                    }
                                    else
                                    {
                                       remarks=(remarks==null?" ":remarks+" ")+"Transaction Type is required!!"; 
                                    }
                                } 
                                catch (Exception e)
                                {
                                    // TODO: Add catch code
                                    e.printStackTrace();
                                }
                                
                                try 
                                {
                                if(row.getCell(1) != null)
                                {
                                    cell = cellIterator.next();
                                    if(cell.getCellType()!=0)
                                    {
                                        String o1 = cell.getStringCellValue();
                                        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");  
                                        java.util.Date date = null;
                                        try 
                                        {
                                                date = formatter.parse(o1);
                                            System.out.println(date);
                                            
                                        } 
                                        catch (Exception e)
                                        {
                                                if(e.getMessage().contains("Unparseable date"))
                                                {
                                                    remarks = remarks + "Transaction Date format should be dd-MM-yyyy";
                                                }
                                                e.printStackTrace();
                                        }
                                        java.sql.Date sqlDate = new java.sql.Date(date.getTime());
                                        oracle.jbo.domain.Date jboDate = new oracle.jbo.domain.Date(sqlDate);
                                        System.out.println(jboDate);
                                        introw.setTransactionDate(jboDate);
                                    }
                                    else
                                {
                                        java.util.Date date =cell.getDateCellValue();
                                        oracle.jbo.domain.Date newDate =new oracle.jbo.domain.Date(new java.sql.Timestamp(date.getTime()));
                                        System.out.println(newDate);
                                        introw.setTransactionDate(newDate);
                                }
                                   
                                }
                                else
                                {
                                    remarks=(remarks==null?" ":remarks+" ")+"Transaction Date is required!!";
                                    
                                }
                            } 
                            catch (Exception e)
                                {
                                // TODO: Add catch code
                                e.printStackTrace();
                                }
                                
                            try 
                            {
                                if(row.getCell(2) != null)
                                {
                                    cell = cellIterator.next();
                                    
                                    if(cell.getCellType()==1)
                                    {
                                        Object oassetnum=cell.getStringCellValue();
                                        System.out.println(oassetnum.toString());
                                        introw.setAssetNumber(oassetnum.toString());
                                    }                             
                                }
                                else
                                    {
                                        remarks=(remarks==null?" ":remarks+" ")+"Asset Number is required!!"; 
                                        
                                    }
                               
                            } 
                            catch (Exception e) 
                            {
                                // TODO: Add catch code
                                e.printStackTrace();
                            }
                            try 
                            {
                                if(row.getCell(3) != null)
                                {
                                    cell = cellIterator.next();
                                    
                                    if(cell.getCellType()==1)
                                    {
                                        Object oemployeenum=cell.getStringCellValue();
                                        introw.setEmployeeNumber(oemployeenum.toString());
                                    }else if(cell.getCellType()==0)
                                    {
                                        Object oemployeenum=row.getCell(3);
                                        introw.setEmployeeNumber(oemployeenum.toString());
                                    }
                                }
                                
                               
                            } 
                            catch (Exception e) 
                            {
                                // TODO: Add catch code
                                e.printStackTrace();
                            }
                            
                            try 
                            {
                                if(row.getCell(4) != null)
                                {
                                    cell = cellIterator.next();
                                    
                                    if(cell.getCellType()==1)
                                    {
                                        Object oslipnum=cell.getStringCellValue();
                                        System.out.println(oslipnum.toString());
                                        introw.setSlipNumber(oslipnum.toString());
                                    }
                                    else if(cell.getCellType()==0)
                                    {
                                        /*Object oslipnum=cell.getStringCellValue();*/
                                        Object oslipnum=row.getCell(4);
                                        System.out.println(oslipnum.toString());
                                        introw.setSlipNumber(oslipnum.toString());
                                    }
                                }
                                else
                                    {
                                        remarks=(remarks==null?" ":remarks+" ")+"Slip Number is required!!"; 
                                        
                                    }
                               
                            } 
                            catch (Exception e) 
                            {
                                // TODO: Add catch code
                                e.printStackTrace();
                            }
                            
                            
                        try 
                        {
                            if(row.getCell(5)!= null)
                            {
                                cell = cellIterator.next();
                                                                                                    
                                if(cell.getCellType()!=0)
                                {
                            
                                    String o1 = cell.getStringCellValue();
                                    SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");  
                                    java.util.Date date = null;
                                    try 
                                    {
                                            date = formatter.parse(o1);
                                    } 
                                    catch (Exception e)
                                    {
                                            if(e.getMessage().contains("Unparseable date"))
                                            {
                                                remarks = remarks + "Start Date & Time format should be dd-MM-yyyy hh:mm:ss";
                                            }
                                            e.printStackTrace();
                                    }
                                    java.sql.Date sqlDate = new java.sql.Date(date.getTime());
                                    oracle.jbo.domain.Date jboDate = new oracle.jbo.domain.Date(sqlDate);
                                    oracle.jbo.domain.Timestamp newDate =new oracle.jbo.domain.Timestamp(new java.sql.Timestamp(jboDate.longValue()));
                                    introw.setStartTime(newDate);
                                }
                                
                            else
                            {
                                java.util.Date date =cell.getDateCellValue();
                                oracle.jbo.domain.Timestamp newDate =new oracle.jbo.domain.Timestamp(new java.sql.Timestamp(date.getTime()));
                                // System.out.println(newDate);
                                introw.setStartTime(newDate);
                            }
                               
                            }
                            else
                            {
                                remarks=(remarks==null?" ":remarks+" ")+"Start Date & Time is required!!";
                                
                            }
                        }
                            catch (Exception e)
                            {
                            // TODO: Add catch code
                            e.printStackTrace();
                            }
                            try 
                            {
                            if(row.getCell(6) != null)
                            {
                                cell = cellIterator.next();
                                if(cell.getCellType()!=0)
                                {
                                    String o1 = cell.getStringCellValue();
                                    SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");  
                                    java.util.Date date = null;
                                    try 
                                    {
                                            date = formatter.parse(o1);
                                    } 
                                    catch (Exception e)
                                    {
                                            if(e.getMessage().contains("Unparseable date"))
                                            {
                                                remarks = remarks + "End Date format should be dd-MM-yyyy hh:mm:ss";
                                            }
                                            e.printStackTrace();
                                    }
                                    java.sql.Date sqlDate = new java.sql.Date(date.getTime());
                                    oracle.jbo.domain.Date jboDate = new oracle.jbo.domain.Date(sqlDate);
                                    oracle.jbo.domain.Timestamp newDate =new oracle.jbo.domain.Timestamp(new java.sql.Timestamp(jboDate.longValue()));
                                    introw.setEndTime(newDate);
                                }
                                else
                            {
                                    java.util.Date date =cell.getDateCellValue();
                                    oracle.jbo.domain.Timestamp newDate =new oracle.jbo.domain.Timestamp(new java.sql.Timestamp(date.getTime()));
                                    //oracle.jbo.domain.Timestamp newDate =new oracle.jbo.domain.Date(new java.sql.Timestamp(date.getTime()));
                                    System.out.println(newDate);
                                    introw.setEndTime(newDate);
                            }
                               
                            }
                            else
                            {
                                remarks=(remarks==null?" ":remarks+" ")+"End Date & Time is required!!"; 
                                
                            }
                        }catch (Exception e)
                            {
                            // TODO: Add catch code
                            e.printStackTrace();
                            }
                            
                        try 
                        {
                            TimesheetHeaderVORowImpl tshdrow = (TimesheetHeaderVORowImpl) getTimesheetHeaderVO1().getCurrentRow();
                            
                               
                                if(row.getCell(7) != null)
                                {
                                    cell = cellIterator.next();
                                    
                                    if(cell.getCellType()==1)
                                    {
                                        Object otask=cell.getStringCellValue();
                                        System.out.println(otask.toString());
                                        introw.setTask(otask.toString());
                                    }
                                    
                                }
                                else
                                {
                                    if("P".compareTo(tshdrow.getCustomerType())==0)
                                    {
                                        remarks=(remarks==null?" ":remarks+" ")+"Task is required!!";
                                    }
                                    
                                }                            
                        }catch (Exception e)
                            {
                                // TODO: Add catch code
                                e.printStackTrace();
                            }
                            
                                
                            try 
                            {
                                TimesheetHeaderVORowImpl tshdrow = (TimesheetHeaderVORowImpl) getTimesheetHeaderVO1().getCurrentRow();                                
                                   
                                    if(row.getCell(8) != null)
                                    {
                                        cell = cellIterator.next();
                                        
                                        if(cell.getCellType()==1)
                                        {
                                            Object oexp=cell.getStringCellValue();
                                            System.out.println(oexp.toString());
                                            introw.setExpType(oexp.toString());
                                        }
                                        
                                    }
                                    else
                                    {
                                        if("P".compareTo(tshdrow.getCustomerType())==0)
                                        {
                                            remarks=(remarks==null?" ":remarks+" ")+"Expenditure Type is required!!";
                                        }
                                        
                                    }
                                
                            }catch (Exception e)
                                {
                                    // TODO: Add catch code
                                    e.printStackTrace();
                                }
                                
                            
                            if(remarks !=null)
                            {
                                introw.setRemarks(remarks);
                            }
                           getTimeSheetsIntVO1().insertRow(introw);
                            
                        }
                    }
                    
                    getTimeSheetsIntVO1().setNamedWhereClauseParam("p_upload_id", iid);
                    getTimeSheetsIntVO1().executeQuery();
                    this.getDBTransaction().commit();
                }
                
                
            } catch (Exception e) {
                // TODO: Add catch code
                e.printStackTrace();
            }
            return message;
        }
    public String processTimeSheetData()//FOR INSERTING DATA IN MASTER TABKLE AFTER TEMP TABLE
    {
             String message = "Success";
            try 
            {
                TimesheetHeaderVORowImpl tshdrow = (TimesheetHeaderVORowImpl) getTimesheetHeaderVO1().getCurrentRow();
                
                CallableStatement cs = null;
                String sql = "begin xxads_process_pkg.process_timesheet_upload(:p_upload_id,:p_ts_header_id,:p_user); end;";
                cs = this.getDBTransaction().createCallableStatement(sql, 0);
                oracle.jbo.domain.Number uploadid= (Number)ADFContext.getCurrent().getPageFlowScope().get("v_upload_id");
                if(uploadid != null){
                    cs.setLong("p_upload_id",uploadid.longValue());
                }
                //cs.setNull("p_upload_id", Types.NUMERIC);                
                cs.setLong("p_ts_header_id",tshdrow.getTsHeaderId().longValue());
                cs.setString("p_user", (String)((Map)ADFContext.getCurrent().getSessionScope().get("userMap")).get("UserName"));
                cs.execute();
                this.getDBTransaction().commit();
                getTimesheetLinesVO1().executeQuery();
                getTimeSheetsIntVO1().executeQuery();
            } 
            catch (Exception e) 
            {
                // TODO: Add catch code
                e.printStackTrace();
            }
            return message;
        }
        public String cancelTimeSheetData()
        {
           String message = "Success";
           PreparedStatement ps = null;
                try {
                    oracle.jbo.domain.Number uploadid= (Number)ADFContext.getCurrent().getPageFlowScope().get("v_upload_id");
                    System.out.println(uploadid);
                    if (uploadid != null) {
                        ps = this.getDBTransaction().createPreparedStatement("delete xxads_timesheet_int_t where upload_id = ?", 1);
                        ps.setLong(1, uploadid.longValue());
                        ps.executeUpdate();
                        this.getDBTransaction().commit();
                        getTimeSheetsIntVO1().executeQuery();
                        
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    try {
                        if(ps !=null){
                            ps.close();
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                return message;
        }  
        
    public void clearUploadedFileData()
    {
            PreparedStatement ps = null;
            try {
                oracle.jbo.domain.Number uploadid= (Number)ADFContext.getCurrent().getPageFlowScope().get("v_upload_id");
                System.out.println(uploadid);
                if (uploadid != null) {
                    ps = this.getDBTransaction().createPreparedStatement("delete xxads_timesheet_int_t where upload_id = ?", 1);
                    ps.setLong(1, uploadid.longValue());
                    ps.executeUpdate();
                    this.getDBTransaction().commit();
                }
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                try {
                    if(ps !=null){
                        ps.close();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    
    public String interfaceBillDocument(){
        String message = "Success";
        CallableStatement cs = null;
        try {
            BillingHdrVORowImpl hdrRow = (BillingHdrVORowImpl) getBillingHdrVO1().getCurrentRow();
            if(hdrRow != null){
                cs = getDBTransaction().createCallableStatement(INTERFACE_BILL_DOC, 0);
                cs.setLong("p_bill_header_id", hdrRow.getHeaderId().longValue());
                cs.setString("p_customer_type", hdrRow.getCustomerType());
                cs.setString("p_user", ((Map) ADFContext.getCurrent()
                                                        .getSessionScope()
                                                        .get("userMap")).get("UserName").toString());
                cs.registerOutParameter("p_message", Types.VARCHAR);
                cs.execute();

                message = cs.getString("p_message");
            }
        }catch (Exception e) {
            message = e.getMessage();
            e.printStackTrace();
        }
        return message;
    }
    
    public String setRentalContractLinesTaxRate() 
    {
        String message = "Success";
        try 
        {
           RentalContractVORowImpl currRow = (RentalContractVORowImpl) getRentalContractVO1().getCurrentRow();
            if(currRow != null) 
            {
                RowSetIterator itr = getRentalContractLinesVO1().createRowSetIterator(null);
                while(itr.hasNext())
                {
                    RentalContractLinesVORowImpl lineRow = (RentalContractLinesVORowImpl) itr.next();    
                    lineRow.setTaxRateCode(currRow.getTaxRateCode());
                    lineRow.setTaxRateId(currRow.getTaxRateId());
                    lineRow.setTaxRatePercent(currRow.getTransTaxRatePercent());
                    if(lineRow.getLineValue()!=null)
                    {
                    lineRow.setVatTaxAmount(lineRow.getLineValue().multiply(currRow.getTransTaxRatePercent().divide(100)));
                    }
                }
                RowSetIterator itr1 = getRentalContractChargesVO1().createRowSetIterator(null);
                while(itr1.hasNext())
                {
                    RentalContractChargesVORowImpl addtllineRow = (RentalContractChargesVORowImpl) itr1.next();    
                    addtllineRow.setTaxRateCode(currRow.getTaxRateCode());
                    addtllineRow.setTaxRateId(currRow.getTaxRateId());
                    addtllineRow.setTaxRatePercent(currRow.getTransTaxRatePercent());
                    if(addtllineRow.getAmount()!=null)
                    {
                    addtllineRow.setVatTaxAmount(addtllineRow.getAmount().multiply(currRow.getTransTaxRatePercent().divide(100)));
                    }
                }
            }
        }catch(Exception e) 
        {
            message = e.getMessage();
            e.printStackTrace();
        }
        return message;
    }
    
    public String setRentalQuotesLinesTaxRate() 
    {
        String message = "Success";
        try 
        {
           RentalQuotesVORowImpl currRow = (RentalQuotesVORowImpl) getRentalQuotesVO1().getCurrentRow();
            if(currRow != null) 
            {
                RowSetIterator itr = getRentalQuoteLinesVO1().createRowSetIterator(null);
                while(itr.hasNext())
                {
                    RentalQuoteLinesVORowImpl lineRow = (RentalQuoteLinesVORowImpl) itr.next();    
                    lineRow.setTaxRateCode(currRow.getTaxRateCode());
                    lineRow.setTaxRateId(currRow.getTaxRateId());
                    lineRow.setTaxRatePercent(currRow.getTransTaxRatePercent());
                    if(lineRow.getLineValue()!=null)
                    {
                    lineRow.setVatTaxAmount(lineRow.getLineValue().multiply(currRow.getTransTaxRatePercent().divide(100)));
                    }
                
                }
                RowSetIterator itr1 = getRentalQuoteChargesVO1().createRowSetIterator(null);
                while(itr1.hasNext())
                {
                    RentalQuoteChargesVORowImpl addtllineRow = (RentalQuoteChargesVORowImpl) itr1.next();    
                    addtllineRow.setTaxRateCode(currRow.getTaxRateCode());
                    addtllineRow.setTaxRateId(currRow.getTaxRateId());
                    addtllineRow.setTaxRatePercent(currRow.getTransTaxRatePercent());
                    if(addtllineRow.getAmount()!=null)
                    {
                    addtllineRow.setVatTaxAmount(addtllineRow.getAmount().multiply(currRow.getTransTaxRatePercent().divide(100)));
                    }
                }
            }
            
        }catch(Exception e) 
        {
            message = e.getMessage();
            e.printStackTrace();
        }
        return message;
    }

    /**
     * Container's getter for DivisionAccountMapVO1.
     * @return DivisionAccountMapVO1
     */
    public DivisionAccountMapVOImpl getDivisionAccountMapVO1() {
        return (DivisionAccountMapVOImpl) findViewObject("DivisionAccountMapVO1");
    }

    /**
     * Container's getter for QuotationReportHdrVO1.
     * @return QuotationReportHdrVO1
     */
    public QuotationReportHdrVOImpl getQuotationReportHdrVO1() {
        return (QuotationReportHdrVOImpl) findViewObject("QuotationReportHdrVO1");
    }

    /**
     * Container's getter for QuotationReportLinesVO1.
     * @return QuotationReportLinesVO1
     */
    public QuotationReportLinesVOImpl getQuotationReportLinesVO1() {
        return (QuotationReportLinesVOImpl) findViewObject("QuotationReportLinesVO1");
    }

    /**
     * Container's getter for QuotationReportHdrToLinesVL1.
     * @return QuotationReportHdrToLinesVL1
     */
    public ViewLinkImpl getQuotationReportHdrToLinesVL1() {
        return (ViewLinkImpl) findViewLink("QuotationReportHdrToLinesVL1");
    }
    //C:\Users\mythri.gardas
    public byte[] getrentalQuotationXmlData() {
        byte[] dataBytes = null;
        try {
            RentalQuotesVORowImpl hdrRow = (RentalQuotesVORowImpl) getRentalQuotesVO1().getCurrentRow();
            try {
                if (hdrRow != null) {
                    QuoteReportHdrVOImpl  hdrVO = getQuoteReportHdrVO1();
                    hdrVO.setNamedWhereClauseParam("p_quotation_id", hdrRow.getQuotationId());
                    hdrVO.executeQuery();
                    /*File file = new File("D:\\lavanya.nuthi\\ADS\\RentalQuotation.xml");
                    FileOutputStream fop = new FileOutputStream(file);
                    ByteArrayOutputStream opStream =new ByteArrayOutputStream(); 
                    ((XMLNode)hdrVO.writeXML(-1,XMLInterface.XML_OPT_ALL_ROWS)).print(opStream); 
                    opStream.writeTo(fop); 
                    opStream.close();*/
                    ByteArrayOutputStream opStream = new ByteArrayOutputStream();
                    XMLNode node=(XMLNode) hdrVO.writeXML(-1, XMLInterface.XML_OPT_ALL_ROWS);
                    node.print(opStream);
                    ExternalReportCustom extReptServ = new ExternalReportCustom();
                    if("UHP Hire".equals(hdrRow.getSrcDivision())){
                        dataBytes = extReptServ.generateRentalQuotationPDFReportData(opStream);
                    }else if("Excavator Hire".equals(hdrRow.getSrcDivision())||"Plant Hire".equals(hdrRow.getSrcDivision())){
                        dataBytes = extReptServ.generateQuotePrintReportWaagner(opStream);
                    }else if("Mortar / Concrete Pump Hire".equals(hdrRow.getSrcDivision())){
                        dataBytes = extReptServ.generateQuotePrintReportCMPH(opStream);
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dataBytes;
    }

    /**
     * Container's getter for WeekOffDaysVO1.
     * @return WeekOffDaysVO1
     */
    public WeekOffDaysVOImpl getWeekOffDaysVO1() {
        return (WeekOffDaysVOImpl) findViewObject("WeekOffDaysVO1");
    }

    /**
     * Container's getter for SpecialWorkingDaysVO1.
     * @return SpecialWorkingDaysVO1
     */
    public SpecialWorkingDaysVOImpl getSpecialWorkingDaysVO1() {
        return (SpecialWorkingDaysVOImpl) findViewObject("SpecialWorkingDaysVO1");
    }

    /**
     * Container's getter for getDayFromDateVO1.
     * @return getDayFromDateVO1
     */
    public getDayFromDateVOImpl getgetDayFromDateVO1() {
        return (getDayFromDateVOImpl) findViewObject("getDayFromDateVO1");
    }
    
    public String assetBillingcontractNumber() {
        String message = "Success";
        try {
            BillingHdrVORowImpl hdrRow = (BillingHdrVORowImpl) getBillingHdrVO1().getCurrentRow();
            if (hdrRow != null) {
                hdrRow.setHdrTaxRateCode(null);
                if("P".equals(hdrRow.getCustomerType()))
                            {
                                hdrRow.setHdrTaxRateCode("AE_OUT_OF_SCOPE");
                            }
                            else if("C".equals(hdrRow.getCustomerType()))
                            {
                                   hdrRow.setHdrTaxRateCode("AE_STD");
                            }
            }
        } catch (Exception e) {
            e.printStackTrace();
            message = e.getMessage();
        }
        return message;
    }
    
    public String contractReferenceNumChange() {
        String message = "Success";
        try {
            RentalContractVORowImpl hdrRow = (RentalContractVORowImpl) getRentalContractVO1().getCurrentRow();
            if (hdrRow != null) {
                hdrRow.setTaxRateCode(null);
                if("P".equals(hdrRow.getCustomerType()))
                            {
                                hdrRow.setTaxRateCode("AE_OUT_OF_SCOPE");
                            }
                            else if("C".equals(hdrRow.getCustomerType()))
                            {
                                   hdrRow.setTaxRateCode("AE_STD");
                            }
            }
        } catch (Exception e) {
            e.printStackTrace();
            message = e.getMessage();
        }
        return message;
    }

    /**
     * Container's getter for getWeekOffsFunctionVO1.
     * @return getWeekOffsFunctionVO1
     */
    public getWeekOffsFunctionVOImpl getgetWeekOffsFunctionVO1() {
        return (getWeekOffsFunctionVOImpl) findViewObject("getWeekOffsFunctionVO1");
    }

    /**
     * Container's getter for QuoteReportHdrVO1.
     * @return QuoteReportHdrVO1
     */
    public QuoteReportHdrVOImpl getQuoteReportHdrVO1() {
        return (QuoteReportHdrVOImpl) findViewObject("QuoteReportHdrVO1");
    }

    /**
     * Container's getter for QuoteReportLinesVO1.
     * @return QuoteReportLinesVO1
     */
    public QuoteReportLinesVOImpl getQuoteReportLinesVO1() {
        return (QuoteReportLinesVOImpl) findViewObject("QuoteReportLinesVO1");
    }

    /**
     * Container's getter for QuoteReportHdrToLinesVL1.
     * @return QuoteReportHdrToLinesVL1
     */
    public ViewLinkImpl getQuoteReportHdrToLinesVL1() {
        return (ViewLinkImpl) findViewLink("QuoteReportHdrToLinesVL1");
    }


    public String checkCreditControl(){
        String message = "Success";
        CallableStatement cs = null;
        try {
            RentalContractVORowImpl hdrRow = (RentalContractVORowImpl) getRentalContractVO1().getCurrentRow();
            if(hdrRow != null && "C".equals(hdrRow.getCustomerType())){
                getValidCreditCheckVO1().setNamedWhereClauseParam("p_bu_id", hdrRow.getSrcBuId());
                getValidCreditCheckVO1().setNamedWhereClauseParam("p_cust_acct_id", hdrRow.getCustomerId());
                getValidCreditCheckVO1().executeQuery();
                
                ValidCreditCheckVORowImpl defRow = (ValidCreditCheckVORowImpl) getValidCreditCheckVO1().first();                
                if(defRow != null && defRow.getDataCount().compareTo(new oracle.jbo.domain.Number(0)) > 0){
                    oracle.jbo.domain.Number hdrId = hdrRow.getContractId();
                    cs = this.getDBTransaction().createCallableStatement(CHECK_CREDIT_CONTROL, 0);
                    cs.setLong("p_contract_id", hdrRow.getContractId().longValue());
                    cs.setString("p_user",  ((Map) ADFContext.getCurrent()
                                                            .getSessionScope()
                                                            .get("userMap")).get("UserName").toString());
                    cs.registerOutParameter("p_msg",Types.VARCHAR);
                    cs.execute();
                    message = cs.getString("p_msg");
                    
                    getRentalContractVO1().setNamedWhereClauseParam("p_contract_id", hdrId);
                    getRentalContractVO1().executeQuery();
                    
                    if(getRentalContractVO1().hasNext()){
                        getRentalContractVO1().next();
                    }
                }
//                else{
//                    return "Customer Sale Limit is not defined for " + hdrRow.getTransCustomer();
//                }                                
            }
        } catch (Exception e) {
            e.printStackTrace();
            message = e.getMessage();
        }
        return message;
    }

    /**
     * Container's getter for QuoteContractDetailsVO1.
     * @return QuoteContractDetailsVO1
     */
    public QuoteContractDetailsVOImpl getQuoteContractDetailsVO1() {
        return (QuoteContractDetailsVOImpl) findViewObject("QuoteContractDetailsVO1");
    }
    
    /**
     * Container's getter for ApprovalHoldCheckVO1.
     * @return ApprovalHoldCheckVO1
     */
    public ApprovalHoldCheckVOImpl getApprovalHoldCheckVO1() {
        return (ApprovalHoldCheckVOImpl) findViewObject("ApprovalHoldCheckVO1");
    }

    /**
     * Container's getter for DOHdrReportVO1.
     * @return DOHdrReportVO1
     */
    public DOHdrReportVOImpl getDOHdrReportVO1() {
        return (DOHdrReportVOImpl) findViewObject("DOHdrReportVO1");
    }

    /**
     * Container's getter for DOLinesReportVO1.
     * @return DOLinesReportVO1
     */
    public DOLinesReportVOImpl getDOLinesReportVO1() {
        return (DOLinesReportVOImpl) findViewObject("DOLinesReportVO1");
    }

    /**
     * Container's getter for DOHdrToLinesReportVL1.
     * @return DOHdrToLinesReportVL1
     */
    public ViewLinkImpl getDOHdrToLinesReportVL1() {
        return (ViewLinkImpl) findViewLink("DOHdrToLinesReportVL1");
    }
    
    public byte[] DeploymentOrderXml() {
        byte[] dataBytes = null;
        try {
            DeploymentOrderHdrVORowImpl hdrRow = (DeploymentOrderHdrVORowImpl) getDeploymentOrderHdrVO1().getCurrentRow();
            try {
                if (hdrRow != null) {
                    DOHdrReportVOImpl  hdrVO = getDOHdrReportVO1();
                    hdrVO.setNamedWhereClauseParam("p_do_id", hdrRow.getDoId());
                    hdrVO.executeQuery();
//                        File file = new File("D:\\lavanya.nuthi\\ADS\\DeploymentOrder.xml");
//                        FileOutputStream fop = new FileOutputStream(file);
//                        ByteArrayOutputStream opStream =new ByteArrayOutputStream();
//                        ((XMLNode)hdrVO.writeXML(-1,XMLInterface.XML_OPT_ALL_ROWS)).print(opStream);
//                        opStream.writeTo(fop);
//                        opStream.close();
                    ByteArrayOutputStream opStream = new ByteArrayOutputStream();
                    XMLNode node=(XMLNode) hdrVO.writeXML(-1, XMLInterface.XML_OPT_ALL_ROWS);
                    node.print(opStream);
                    ExternalReportCustom extReptServ = new ExternalReportCustom();
                    dataBytes = extReptServ.generateDOPrintReport(opStream);

                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dataBytes;
    }

    /**
     * Container's getter for DRHdrReportVO1.
     * @return DRHdrReportVO1
     */
    public DRHdrReportVOImpl getDRHdrReportVO1() {
        return (DRHdrReportVOImpl) findViewObject("DRHdrReportVO1");
    }

    /**
     * Container's getter for DRLinesReportVO1.
     * @return DRLinesReportVO1
     */
    public DRLinesReportVOImpl getDRLinesReportVO1() {
        return (DRLinesReportVOImpl) findViewObject("DRLinesReportVO1");
    }

    /**
     * Container's getter for DRHdrToLinesReportVL1.
     * @return DRHdrToLinesReportVL1
     */
    public ViewLinkImpl getDRHdrToLinesReportVL1() {
        return (ViewLinkImpl) findViewLink("DRHdrToLinesReportVL1");
    }
    
    public byte[] DeploymentReceiptXml() {
        byte[] dataBytes = null;
        try {
            DeploymentReceiptHdrVORowImpl hdrRow = (DeploymentReceiptHdrVORowImpl) getDeploymentReceiptHdrVO1().getCurrentRow();
            try {
                if (hdrRow != null) {
                    DRHdrReportVOImpl  hdrVO = getDRHdrReportVO1();
                    hdrVO.setNamedWhereClauseParam("p_dr_id", hdrRow.getDrId());
                    hdrVO.executeQuery();
//                        File file = new File("C:\\Users\\mythri.gardas\\Documents\\DeploymentReceipt.xml");
//                        FileOutputStream fop = new FileOutputStream(file);
//                        ByteArrayOutputStream opStream =new ByteArrayOutputStream();
//                        ((XMLNode)hdrVO.writeXML(-1,XMLInterface.XML_OPT_ALL_ROWS)).print(opStream);
//                        opStream.writeTo(fop);
//                        opStream.close();
                        ByteArrayOutputStream opStream = new ByteArrayOutputStream();
                        XMLNode node=(XMLNode) hdrVO.writeXML(-1, XMLInterface.XML_OPT_ALL_ROWS);
                        node.print(opStream);
                        ExternalReportCustom extReptServ = new ExternalReportCustom();
                        dataBytes = extReptServ.generateDRPrintReport(opStream);

                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dataBytes;
    }

    /**
     * Container's getter for ValidCreditCheckVO1.
     * @return ValidCreditCheckVO1
     */
    public ValidCreditCheckVOImpl getValidCreditCheckVO1() {
        return (ValidCreditCheckVOImpl) findViewObject("ValidCreditCheckVO1");
    }

    /**
     * Container's getter for RentalContractPrintHdrVO1.
     * @return RentalContractPrintHdrVO1
     */
    public RentalContractPrintHdrVOImpl getRentalContractPrintHdrVO1() {
        return (RentalContractPrintHdrVOImpl) findViewObject("RentalContractPrintHdrVO1");
    }

    /**
     * Container's getter for TsSlipNumberValidateVO1.
     * @return TsSlipNumberValidateVO1
     */
    public TsSlipNumberValidateVOImpl getTsSlipNumberValidateVO1() {
        return (TsSlipNumberValidateVOImpl) findViewObject("TsSlipNumberValidateVO1");
    }

    /**
     * Container's getter for ProformaPrintHdrVO1.
     * @return ProformaPrintHdrVO1
     */
    public ProformaPrintHdrVOImpl getProformaPrintHdrVO1() {
        return (ProformaPrintHdrVOImpl) findViewObject("ProformaPrintHdrVO1");
    }
    
    public byte[] generateProformaPrintReport() {
        byte[] dataBytes = null;
        try {
            BillingHdrVORowImpl hdrRow = (BillingHdrVORowImpl) getBillingHdrVO1().getCurrentRow();
            try {
                if (hdrRow != null) {
                    ProformaPrintHdrVOImpl printVO = getProformaPrintHdrVO1();
                    printVO.setNamedWhereClauseParam("p_bill_hdr_id", hdrRow.getHeaderId());
                    printVO.executeQuery();
                    /*File file = new File("D:\\lavanya.nuthi\\ADS\\ProformaPrint.xml");
                    FileOutputStream fop = new FileOutputStream(file);
                    ByteArrayOutputStream opStream =new ByteArrayOutputStream(); 
                    ((XMLNode)printVO.writeXML(-1,XMLInterface.XML_OPT_ALL_ROWS)).print(opStream); 
                    opStream.writeTo(fop); 
                    opStream.close(); */
                    ByteArrayOutputStream opStream = new ByteArrayOutputStream();
                    XMLNode node=(XMLNode) printVO.writeXML(-1, XMLInterface.XML_OPT_ALL_ROWS);
                    node.print(opStream);
                    ExternalReportCustom extReptServ = new ExternalReportCustom();
                    dataBytes = extReptServ.generateReportData("/Custom/PAAS/ADS/Proforma Print Report.xdo", "pdf", opStream);
                                   
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dataBytes;
    }
    
    public byte[] getGatePassReportData()
    {
        byte[] dataBytes = null;
        try {
           DeploymentOrderHdrVORowImpl hdrRow = (DeploymentOrderHdrVORowImpl) getDeploymentOrderHdrVO1().getCurrentRow();
           if (hdrRow != null) {
               GatePassPrintHdrVOImpl printVO = getGatePassPrintHdrVO1();
               printVO.setNamedWhereClauseParam("p_do_id", hdrRow.getDoId());
               printVO.executeQuery();
               ByteArrayOutputStream opStream = new ByteArrayOutputStream();
               XMLNode node=(XMLNode) printVO.writeXML(-1, XMLInterface.XML_OPT_ALL_ROWS);
               node.print(opStream);
               ExternalReportCustom extReptServ = new ExternalReportCustom();
               dataBytes = extReptServ.generateReportData("/Custom/PAAS/ADS/Delivery Gate Pass Print Report.xdo", "docx", opStream);
           }
       } catch (Exception e) {
            // TODO: Add catch code
            e.printStackTrace();
        }
        return dataBytes;
    }
    
    public byte[] getGatePassGateCopyReportData()
    {
        byte[] dataBytes = null;
        try {
           DeploymentOrderHdrVORowImpl hdrRow = (DeploymentOrderHdrVORowImpl) getDeploymentOrderHdrVO1().getCurrentRow();
           if (hdrRow != null) {
               GatePassPrintHdrVOImpl printVO = getGatePassPrintHdrVO1();
               printVO.setNamedWhereClauseParam("p_do_id", hdrRow.getDoId());
               printVO.executeQuery();
               ByteArrayOutputStream opStream = new ByteArrayOutputStream();
               XMLNode node=(XMLNode) printVO.writeXML(-1, XMLInterface.XML_OPT_ALL_ROWS);
               node.print(opStream);
               ExternalReportCustom extReptServ = new ExternalReportCustom();
               dataBytes = extReptServ.generateReportData("/Custom/PAAS/ADS/Delivery Gate Pass Gate Copy Print Report.xdo", "docx", opStream);
           }
       } catch (Exception e) {
            // TODO: Add catch code
            e.printStackTrace();
        }
        return dataBytes;
    }
    
    public byte[] generateGatePassReport() {
        byte[] dataBytes = null;
        String contentType = "application/zip";
        File zipFile = null;
        ZipOutputStream zipoutPutStr = null;
        ZipEntry zipEntry = null;
        FileInputStream fileinputStream = null;
        String zipFileName = null;
        String dataFileName = null;
        String dataFileName1 = null;
        try {
                    DeploymentOrderHdrVORowImpl hdrRow = (DeploymentOrderHdrVORowImpl) getDeploymentOrderHdrVO1().getCurrentRow();
                    if (hdrRow != null) {
                    zipFileName =hdrRow.getDoNumber() +".zip";
                    zipFile = new File(zipFileName);
                    zipoutPutStr = new ZipOutputStream(new FileOutputStream(zipFile));
                    dataFileName = "GatePass-OffCopy.docx";
                    dataFileName1="GatePass-GateCopy.docx";
                    zipEntry = new ZipEntry(dataFileName);
                    
                    zipoutPutStr.putNextEntry(zipEntry);
                    zipoutPutStr.write(getGatePassReportData());
                    zipoutPutStr.closeEntry();
                    
                    zipEntry = new ZipEntry(dataFileName1);
                    zipoutPutStr.putNextEntry(zipEntry);
                    zipoutPutStr.write(getGatePassGateCopyReportData());
                    zipoutPutStr.closeEntry();
                    
                    } 
                    zipoutPutStr.close();
                    fileinputStream = new FileInputStream(zipFile);
                    dataBytes = new byte[(int)zipFile.length()];
                    fileinputStream.read(dataBytes);
                }
             
         catch (Exception e) {
            e.printStackTrace();
        }finally {
                    fileinputStream = null;
                    zipoutPutStr = null;
                }
        return dataBytes;
    }

    /**
     * Container's getter for GatePassPrintHdrVO1.
     * @return GatePassPrintHdrVO1
     */
    public GatePassPrintHdrVOImpl getGatePassPrintHdrVO1() {
        return (GatePassPrintHdrVOImpl) findViewObject("GatePassPrintHdrVO1");
    }

    /**
     * Container's getter for GatePassPrintLinesVO1.
     * @return GatePassPrintLinesVO1
     */
    public GatePassPrintLinesVOImpl getGatePassPrintLinesVO1() {
        return (GatePassPrintLinesVOImpl) findViewObject("GatePassPrintLinesVO1");
    }

    /**
     * Container's getter for GatePassPrintHdrToLinesVL1.
     * @return GatePassPrintHdrToLinesVL1
     */
    public ViewLinkImpl getGatePassPrintHdrToLinesVL1() {
        return (ViewLinkImpl) findViewLink("GatePassPrintHdrToLinesVL1");
    }

    /**
     * Container's getter for RentalQuoteLineNumVO1.
     * @return RentalQuoteLineNumVO1
     */
    public RentalQuoteLineNumVOImpl getRentalQuoteLineNumVO1() {
        return (RentalQuoteLineNumVOImpl) findViewObject("RentalQuoteLineNumVO1");
    }

    /**
     * Container's getter for RentalContractLineNumVO1.
     * @return RentalContractLineNumVO1
     */
    public RentalContractLineNumVOImpl getRentalContractLineNumVO1() {
        return (RentalContractLineNumVOImpl) findViewObject("RentalContractLineNumVO1");
    }

    /**
     * Container's getter for QuoteChargesForCategroyVO1.
     * @return QuoteChargesForCategroyVO1
     */
    public QuoteChargesForCategroyVOImpl getQuoteChargesForCategroyVO1() {
        return (QuoteChargesForCategroyVOImpl) findViewObject("QuoteChargesForCategroyVO1");
    }

    /**
     * Container's getter for ContractChargesForCategoryVO1.
     * @return ContractChargesForCategoryVO1
     */
    public ContractChargesForCategoryVOImpl getContractChargesForCategoryVO1() {
        return (ContractChargesForCategoryVOImpl) findViewObject("ContractChargesForCategoryVO1");
    }

    /**
     * Container's getter for DoAttachmentsPrintVO1.
     * @return DoAttachmentsPrintVO1
     */
    public DoAttachmentsPrintVOImpl getDoAttachmentsPrintVO1() {
        return (DoAttachmentsPrintVOImpl) findViewObject("DoAttachmentsPrintVO1");
    }

    /**
     * Container's getter for DOLineToAttachmentsPrintVL1.
     * @return DOLineToAttachmentsPrintVL1
     */
    public ViewLinkImpl getDOLineToAttachmentsPrintVL1() {
        return (ViewLinkImpl) findViewLink("DOLineToAttachmentsPrintVL1");
    }
    
    public String quoteCustomerChange(){
        String message = "Success";
        try {
            RentalQuotesVORowImpl hdrRow = (RentalQuotesVORowImpl) getRentalQuoteLinesVO1().getCurrentRow();
            if(hdrRow != null){
                getSalesRepLovVO1().setNamedWhereClauseParam("p_bu_id", hdrRow.getReqBuId());
                getSalesRepLovVO1().setNamedWhereClauseParam("p_customer_id", hdrRow.getCustomerId());
                getSalesRepLovVO1().executeQuery();
                
                SalesRepLovVORowImpl row = (SalesRepLovVORowImpl) getSalesRepLovVO1().first();
                if(row != null){
                    hdrRow.setTransSalesPerson(row.getPartyName());
                    hdrRow.setSalesRepId(row.getPartyId());
                }
            }
        }catch (Exception e) {
            e.printStackTrace();
            message = e.getMessage();
        }
        return message;
    }

    /**
     * Container's getter for SalesRepLovVO1.
     * @return SalesRepLovVO1
     */
    public SalesRepLovVOImpl getSalesRepLovVO1() {
        return (SalesRepLovVOImpl) findViewObject("SalesRepLovVO1");
    }

    /**
     * Container's getter for TimesheetLinesValidateVO1.
     * @return TimesheetLinesValidateVO1
     */
    public TimesheetLinesValidateVOImpl getTimesheetLinesValidateVO1() {
        return (TimesheetLinesValidateVOImpl) findViewObject("TimesheetLinesValidateVO1");
    }

    /**
     * Container's getter for AccessTypeVO1.
     * @return AccessTypeVO1
     */
    public AccessTypeVOImpl getAccessTypeVO1() {
        return (AccessTypeVOImpl) findViewObject("AccessTypeVO1");
    }
}

