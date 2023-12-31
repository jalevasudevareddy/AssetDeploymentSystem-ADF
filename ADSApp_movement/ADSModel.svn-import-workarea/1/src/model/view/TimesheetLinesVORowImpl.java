package model.view;

import model.entity.XxadsTimesheetLinesEOImpl;

import oracle.jbo.RowSet;
import oracle.jbo.domain.Date;
import oracle.jbo.domain.Number;
import oracle.jbo.domain.Timestamp;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Wed Mar 08 14:54:18 IST 2023
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class TimesheetLinesVORowImpl extends ViewRowImpl {


    public static final int ENTITY_XXADSTIMESHEETLINESEO = 0;

    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    protected enum AttributesEnum {
        AllocationDetailId,
        AllocationLineId,
        AssetId,
        BillingFlag,
        BillingHdrId,
        BillingLineId,
        ContractLineId,
        CreatedBy,
        CreationDate,
        DailyAllowance,
        DoLineId,
        EmployeeId,
        EndTime,
        ExpTypeId,
        LastUpdateDate,
        LastUpdatedBy,
        MasterContractLineId,
        ObjectVersionNumber,
        Ot1Hours,
        Ot2Hours,
        Remarks,
        RentalType,
        SlipNumber,
        StandardHours,
        StartTime,
        TaskId,
        TimesheetDate,
        TimesheetFlag,
        TotalHours,
        TransactionType,
        TravelAllowance,
        TsHeaderId,
        TsLineId,
        TransTrxnType,
        TransAssetNumber,
        TransEmployeeNumber,
        TransTask,
        TransExpType,
        TransContractId,
        TransProjectId,
        TransSetId,
        TimesheetDate1,
        LookupsLOV1,
        TasksLOV1,
        ExpenditureTypesLOV1,
        TsAssetsLovVO1,
        TsAssetOperatorLovVO1;
        private static AttributesEnum[] vals = null;
        ;
        private static final int firstIndex = 0;

        protected int index() {
            return AttributesEnum.firstIndex() + ordinal();
        }

        protected static final int firstIndex() {
            return firstIndex;
        }

        protected static int count() {
            return AttributesEnum.firstIndex() + AttributesEnum.staticValues().length;
        }

        protected static final AttributesEnum[] staticValues() {
            if (vals == null) {
                vals = AttributesEnum.values();
            }
            return vals;
        }
    }


    public static final int ALLOCATIONDETAILID = AttributesEnum.AllocationDetailId.index();
    public static final int ALLOCATIONLINEID = AttributesEnum.AllocationLineId.index();
    public static final int ASSETID = AttributesEnum.AssetId.index();
    public static final int BILLINGFLAG = AttributesEnum.BillingFlag.index();
    public static final int BILLINGHDRID = AttributesEnum.BillingHdrId.index();
    public static final int BILLINGLINEID = AttributesEnum.BillingLineId.index();
    public static final int CONTRACTLINEID = AttributesEnum.ContractLineId.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int CREATIONDATE = AttributesEnum.CreationDate.index();
    public static final int DAILYALLOWANCE = AttributesEnum.DailyAllowance.index();
    public static final int DOLINEID = AttributesEnum.DoLineId.index();
    public static final int EMPLOYEEID = AttributesEnum.EmployeeId.index();
    public static final int ENDTIME = AttributesEnum.EndTime.index();
    public static final int EXPTYPEID = AttributesEnum.ExpTypeId.index();
    public static final int LASTUPDATEDATE = AttributesEnum.LastUpdateDate.index();
    public static final int LASTUPDATEDBY = AttributesEnum.LastUpdatedBy.index();
    public static final int MASTERCONTRACTLINEID = AttributesEnum.MasterContractLineId.index();
    public static final int OBJECTVERSIONNUMBER = AttributesEnum.ObjectVersionNumber.index();
    public static final int OT1HOURS = AttributesEnum.Ot1Hours.index();
    public static final int OT2HOURS = AttributesEnum.Ot2Hours.index();
    public static final int REMARKS = AttributesEnum.Remarks.index();
    public static final int RENTALTYPE = AttributesEnum.RentalType.index();
    public static final int SLIPNUMBER = AttributesEnum.SlipNumber.index();
    public static final int STANDARDHOURS = AttributesEnum.StandardHours.index();
    public static final int STARTTIME = AttributesEnum.StartTime.index();
    public static final int TASKID = AttributesEnum.TaskId.index();
    public static final int TIMESHEETDATE = AttributesEnum.TimesheetDate.index();
    public static final int TIMESHEETFLAG = AttributesEnum.TimesheetFlag.index();
    public static final int TOTALHOURS = AttributesEnum.TotalHours.index();
    public static final int TRANSACTIONTYPE = AttributesEnum.TransactionType.index();
    public static final int TRAVELALLOWANCE = AttributesEnum.TravelAllowance.index();
    public static final int TSHEADERID = AttributesEnum.TsHeaderId.index();
    public static final int TSLINEID = AttributesEnum.TsLineId.index();
    public static final int TRANSTRXNTYPE = AttributesEnum.TransTrxnType.index();
    public static final int TRANSASSETNUMBER = AttributesEnum.TransAssetNumber.index();
    public static final int TRANSEMPLOYEENUMBER = AttributesEnum.TransEmployeeNumber.index();
    public static final int TRANSTASK = AttributesEnum.TransTask.index();
    public static final int TRANSEXPTYPE = AttributesEnum.TransExpType.index();
    public static final int TRANSCONTRACTID = AttributesEnum.TransContractId.index();
    public static final int TRANSPROJECTID = AttributesEnum.TransProjectId.index();
    public static final int TRANSSETID = AttributesEnum.TransSetId.index();
    public static final int TIMESHEETDATE1 = AttributesEnum.TimesheetDate1.index();
    public static final int LOOKUPSLOV1 = AttributesEnum.LookupsLOV1.index();
    public static final int TASKSLOV1 = AttributesEnum.TasksLOV1.index();
    public static final int EXPENDITURETYPESLOV1 = AttributesEnum.ExpenditureTypesLOV1.index();
    public static final int TSASSETSLOVVO1 = AttributesEnum.TsAssetsLovVO1.index();
    public static final int TSASSETOPERATORLOVVO1 = AttributesEnum.TsAssetOperatorLovVO1.index();

    /**
     * This is the default constructor (do not remove).
     */
    public TimesheetLinesVORowImpl() {
    }

    /**
     * Gets XxadsTimesheetLinesEO entity object.
     * @return the XxadsTimesheetLinesEO
     */
    public XxadsTimesheetLinesEOImpl getXxadsTimesheetLinesEO() {
        return (XxadsTimesheetLinesEOImpl) getEntity(ENTITY_XXADSTIMESHEETLINESEO);
    }

    /**
     * Gets the attribute value for ALLOCATION_DETAIL_ID using the alias name AllocationDetailId.
     * @return the ALLOCATION_DETAIL_ID
     */
    public Number getAllocationDetailId() {
        return (Number) getAttributeInternal(ALLOCATIONDETAILID);
    }

    /**
     * Sets <code>value</code> as attribute value for ALLOCATION_DETAIL_ID using the alias name AllocationDetailId.
     * @param value value to set the ALLOCATION_DETAIL_ID
     */
    public void setAllocationDetailId(Number value) {
        setAttributeInternal(ALLOCATIONDETAILID, value);
    }

    /**
     * Gets the attribute value for ALLOCATION_LINE_ID using the alias name AllocationLineId.
     * @return the ALLOCATION_LINE_ID
     */
    public Number getAllocationLineId() {
        return (Number) getAttributeInternal(ALLOCATIONLINEID);
    }

    /**
     * Sets <code>value</code> as attribute value for ALLOCATION_LINE_ID using the alias name AllocationLineId.
     * @param value value to set the ALLOCATION_LINE_ID
     */
    public void setAllocationLineId(Number value) {
        setAttributeInternal(ALLOCATIONLINEID, value);
    }

    /**
     * Gets the attribute value for ASSET_ID using the alias name AssetId.
     * @return the ASSET_ID
     */
    public Number getAssetId() {
        return (Number) getAttributeInternal(ASSETID);
    }

    /**
     * Sets <code>value</code> as attribute value for ASSET_ID using the alias name AssetId.
     * @param value value to set the ASSET_ID
     */
    public void setAssetId(Number value) {
        setAttributeInternal(ASSETID, value);
    }

    /**
     * Gets the attribute value for BILLING_FLAG using the alias name BillingFlag.
     * @return the BILLING_FLAG
     */
    public String getBillingFlag() {
        return (String) getAttributeInternal(BILLINGFLAG);
    }

    /**
     * Sets <code>value</code> as attribute value for BILLING_FLAG using the alias name BillingFlag.
     * @param value value to set the BILLING_FLAG
     */
    public void setBillingFlag(String value) {
        setAttributeInternal(BILLINGFLAG, value);
    }

    /**
     * Gets the attribute value for BILLING_HDR_ID using the alias name BillingHdrId.
     * @return the BILLING_HDR_ID
     */
    public Number getBillingHdrId() {
        return (Number) getAttributeInternal(BILLINGHDRID);
    }

    /**
     * Sets <code>value</code> as attribute value for BILLING_HDR_ID using the alias name BillingHdrId.
     * @param value value to set the BILLING_HDR_ID
     */
    public void setBillingHdrId(Number value) {
        setAttributeInternal(BILLINGHDRID, value);
    }

    /**
     * Gets the attribute value for BILLING_LINE_ID using the alias name BillingLineId.
     * @return the BILLING_LINE_ID
     */
    public Number getBillingLineId() {
        return (Number) getAttributeInternal(BILLINGLINEID);
    }

    /**
     * Sets <code>value</code> as attribute value for BILLING_LINE_ID using the alias name BillingLineId.
     * @param value value to set the BILLING_LINE_ID
     */
    public void setBillingLineId(Number value) {
        setAttributeInternal(BILLINGLINEID, value);
    }

    /**
     * Gets the attribute value for CONTRACT_LINE_ID using the alias name ContractLineId.
     * @return the CONTRACT_LINE_ID
     */
    public Number getContractLineId() {
        return (Number) getAttributeInternal(CONTRACTLINEID);
    }

    /**
     * Sets <code>value</code> as attribute value for CONTRACT_LINE_ID using the alias name ContractLineId.
     * @param value value to set the CONTRACT_LINE_ID
     */
    public void setContractLineId(Number value) {
        setAttributeInternal(CONTRACTLINEID, value);
    }

    /**
     * Gets the attribute value for CREATED_BY using the alias name CreatedBy.
     * @return the CREATED_BY
     */
    public String getCreatedBy() {
        return (String) getAttributeInternal(CREATEDBY);
    }

    /**
     * Gets the attribute value for CREATION_DATE using the alias name CreationDate.
     * @return the CREATION_DATE
     */
    public Date getCreationDate() {
        return (Date) getAttributeInternal(CREATIONDATE);
    }

    /**
     * Gets the attribute value for DAILY_ALLOWANCE using the alias name DailyAllowance.
     * @return the DAILY_ALLOWANCE
     */
    public Number getDailyAllowance() {
        return (Number) getAttributeInternal(DAILYALLOWANCE);
    }

    /**
     * Sets <code>value</code> as attribute value for DAILY_ALLOWANCE using the alias name DailyAllowance.
     * @param value value to set the DAILY_ALLOWANCE
     */
    public void setDailyAllowance(Number value) {
        setAttributeInternal(DAILYALLOWANCE, value);
    }

    /**
     * Gets the attribute value for DO_LINE_ID using the alias name DoLineId.
     * @return the DO_LINE_ID
     */
    public Number getDoLineId() {
        return (Number) getAttributeInternal(DOLINEID);
    }

    /**
     * Sets <code>value</code> as attribute value for DO_LINE_ID using the alias name DoLineId.
     * @param value value to set the DO_LINE_ID
     */
    public void setDoLineId(Number value) {
        setAttributeInternal(DOLINEID, value);
    }

    /**
     * Gets the attribute value for EMPLOYEE_ID using the alias name EmployeeId.
     * @return the EMPLOYEE_ID
     */
    public Number getEmployeeId() {
        return (Number) getAttributeInternal(EMPLOYEEID);
    }

    /**
     * Sets <code>value</code> as attribute value for EMPLOYEE_ID using the alias name EmployeeId.
     * @param value value to set the EMPLOYEE_ID
     */
    public void setEmployeeId(Number value) {
        setAttributeInternal(EMPLOYEEID, value);
    }

    /**
     * Gets the attribute value for END_TIME using the alias name EndTime.
     * @return the END_TIME
     */
    public oracle.jbo.domain.Timestamp getEndTime() {
        return (oracle.jbo.domain.Timestamp) getAttributeInternal(ENDTIME);
    }

    /**
     * Sets <code>value</code> as attribute value for END_TIME using the alias name EndTime.
     * @param value value to set the END_TIME
     */
    public void setEndTime(oracle.jbo.domain.Timestamp value) {
        setAttributeInternal(ENDTIME, value);
    }

    /**
     * Gets the attribute value for EXP_TYPE_ID using the alias name ExpTypeId.
     * @return the EXP_TYPE_ID
     */
    public Number getExpTypeId() {
        return (Number) getAttributeInternal(EXPTYPEID);
    }

    /**
     * Sets <code>value</code> as attribute value for EXP_TYPE_ID using the alias name ExpTypeId.
     * @param value value to set the EXP_TYPE_ID
     */
    public void setExpTypeId(Number value) {
        setAttributeInternal(EXPTYPEID, value);
    }

    /**
     * Gets the attribute value for LAST_UPDATE_DATE using the alias name LastUpdateDate.
     * @return the LAST_UPDATE_DATE
     */
    public Date getLastUpdateDate() {
        return (Date) getAttributeInternal(LASTUPDATEDATE);
    }

    /**
     * Gets the attribute value for LAST_UPDATED_BY using the alias name LastUpdatedBy.
     * @return the LAST_UPDATED_BY
     */
    public String getLastUpdatedBy() {
        return (String) getAttributeInternal(LASTUPDATEDBY);
    }

    /**
     * Gets the attribute value for MASTER_CONTRACT_LINE_ID using the alias name MasterContractLineId.
     * @return the MASTER_CONTRACT_LINE_ID
     */
    public Number getMasterContractLineId() {
        return (Number) getAttributeInternal(MASTERCONTRACTLINEID);
    }

    /**
     * Sets <code>value</code> as attribute value for MASTER_CONTRACT_LINE_ID using the alias name MasterContractLineId.
     * @param value value to set the MASTER_CONTRACT_LINE_ID
     */
    public void setMasterContractLineId(Number value) {
        setAttributeInternal(MASTERCONTRACTLINEID, value);
    }

    /**
     * Gets the attribute value for OBJECT_VERSION_NUMBER using the alias name ObjectVersionNumber.
     * @return the OBJECT_VERSION_NUMBER
     */
    public Number getObjectVersionNumber() {
        return (Number) getAttributeInternal(OBJECTVERSIONNUMBER);
    }

    /**
     * Gets the attribute value for OT1_HOURS using the alias name Ot1Hours.
     * @return the OT1_HOURS
     */
    public Number getOt1Hours() {
        return (Number) getAttributeInternal(OT1HOURS);
    }

    /**
     * Sets <code>value</code> as attribute value for OT1_HOURS using the alias name Ot1Hours.
     * @param value value to set the OT1_HOURS
     */
    public void setOt1Hours(Number value) {
        setAttributeInternal(OT1HOURS, value);
    }

    /**
     * Gets the attribute value for OT2_HOURS using the alias name Ot2Hours.
     * @return the OT2_HOURS
     */
    public Number getOt2Hours() {
        return (Number) getAttributeInternal(OT2HOURS);
    }

    /**
     * Sets <code>value</code> as attribute value for OT2_HOURS using the alias name Ot2Hours.
     * @param value value to set the OT2_HOURS
     */
    public void setOt2Hours(Number value) {
        setAttributeInternal(OT2HOURS, value);
    }

    /**
     * Gets the attribute value for REMARKS using the alias name Remarks.
     * @return the REMARKS
     */
    public String getRemarks() {
        return (String) getAttributeInternal(REMARKS);
    }

    /**
     * Sets <code>value</code> as attribute value for REMARKS using the alias name Remarks.
     * @param value value to set the REMARKS
     */
    public void setRemarks(String value) {
        setAttributeInternal(REMARKS, value);
    }

    /**
     * Gets the attribute value for RENTAL_TYPE using the alias name RentalType.
     * @return the RENTAL_TYPE
     */
    public String getRentalType() {
        return (String) getAttributeInternal(RENTALTYPE);
    }

    /**
     * Sets <code>value</code> as attribute value for RENTAL_TYPE using the alias name RentalType.
     * @param value value to set the RENTAL_TYPE
     */
    public void setRentalType(String value) {
        setAttributeInternal(RENTALTYPE, value);
    }

    /**
     * Gets the attribute value for SLIP_NUMBER using the alias name SlipNumber.
     * @return the SLIP_NUMBER
     */
    public String getSlipNumber() {
        return (String) getAttributeInternal(SLIPNUMBER);
    }

    /**
     * Sets <code>value</code> as attribute value for SLIP_NUMBER using the alias name SlipNumber.
     * @param value value to set the SLIP_NUMBER
     */
    public void setSlipNumber(String value) {
        setAttributeInternal(SLIPNUMBER, value);
    }

    /**
     * Gets the attribute value for STANDARD_HOURS using the alias name StandardHours.
     * @return the STANDARD_HOURS
     */
    public Number getStandardHours() {
        return (Number) getAttributeInternal(STANDARDHOURS);
    }

    /**
     * Sets <code>value</code> as attribute value for STANDARD_HOURS using the alias name StandardHours.
     * @param value value to set the STANDARD_HOURS
     */
    public void setStandardHours(Number value) {
        setAttributeInternal(STANDARDHOURS, value);
    }

    /**
     * Gets the attribute value for START_TIME using the alias name StartTime.
     * @return the START_TIME
     */
    public Timestamp getStartTime() {
        return (Timestamp) getAttributeInternal(STARTTIME);
    }

    /**
     * Sets <code>value</code> as attribute value for START_TIME using the alias name StartTime.
     * @param value value to set the START_TIME
     */
    public void setStartTime(Timestamp value) {
        setAttributeInternal(STARTTIME, value);
    }

    /**
     * Gets the attribute value for TASK_ID using the alias name TaskId.
     * @return the TASK_ID
     */
    public Number getTaskId() {
        return (Number) getAttributeInternal(TASKID);
    }

    /**
     * Sets <code>value</code> as attribute value for TASK_ID using the alias name TaskId.
     * @param value value to set the TASK_ID
     */
    public void setTaskId(Number value) {
        setAttributeInternal(TASKID, value);
    }

    /**
     * Gets the attribute value for TIMESHEET_DATE using the alias name TimesheetDate.
     * @return the TIMESHEET_DATE
     */
    public Date getTimesheetDate() {
        return (Date) getAttributeInternal(TIMESHEETDATE);
    }

    /**
     * Sets <code>value</code> as attribute value for TIMESHEET_DATE using the alias name TimesheetDate.
     * @param value value to set the TIMESHEET_DATE
     */
    public void setTimesheetDate(Date value) {
        setAttributeInternal(TIMESHEETDATE, value);
    }

    /**
     * Gets the attribute value for TIMESHEET_FLAG using the alias name TimesheetFlag.
     * @return the TIMESHEET_FLAG
     */
    public String getTimesheetFlag() {
        return (String) getAttributeInternal(TIMESHEETFLAG);
    }

    /**
     * Sets <code>value</code> as attribute value for TIMESHEET_FLAG using the alias name TimesheetFlag.
     * @param value value to set the TIMESHEET_FLAG
     */
    public void setTimesheetFlag(String value) {
        setAttributeInternal(TIMESHEETFLAG, value);
    }

    /**
     * Gets the attribute value for TOTAL_HOURS using the alias name TotalHours.
     * @return the TOTAL_HOURS
     */
    public Number getTotalHours() {
        return (Number) getAttributeInternal(TOTALHOURS);
    }

    /**
     * Sets <code>value</code> as attribute value for TOTAL_HOURS using the alias name TotalHours.
     * @param value value to set the TOTAL_HOURS
     */
    public void setTotalHours(Number value) {
        setAttributeInternal(TOTALHOURS, value);
    }

    /**
     * Gets the attribute value for TRANSACTION_TYPE using the alias name TransactionType.
     * @return the TRANSACTION_TYPE
     */
    public String getTransactionType() {
        return (String) getAttributeInternal(TRANSACTIONTYPE);
    }

    /**
     * Sets <code>value</code> as attribute value for TRANSACTION_TYPE using the alias name TransactionType.
     * @param value value to set the TRANSACTION_TYPE
     */
    public void setTransactionType(String value) {
        setAttributeInternal(TRANSACTIONTYPE, value);
    }

    /**
     * Gets the attribute value for TRAVEL_ALLOWANCE using the alias name TravelAllowance.
     * @return the TRAVEL_ALLOWANCE
     */
    public Number getTravelAllowance() {
        return (Number) getAttributeInternal(TRAVELALLOWANCE);
    }

    /**
     * Sets <code>value</code> as attribute value for TRAVEL_ALLOWANCE using the alias name TravelAllowance.
     * @param value value to set the TRAVEL_ALLOWANCE
     */
    public void setTravelAllowance(Number value) {
        setAttributeInternal(TRAVELALLOWANCE, value);
    }

    /**
     * Gets the attribute value for TS_HEADER_ID using the alias name TsHeaderId.
     * @return the TS_HEADER_ID
     */
    public Number getTsHeaderId() {
        return (Number) getAttributeInternal(TSHEADERID);
    }

    /**
     * Sets <code>value</code> as attribute value for TS_HEADER_ID using the alias name TsHeaderId.
     * @param value value to set the TS_HEADER_ID
     */
    public void setTsHeaderId(Number value) {
        setAttributeInternal(TSHEADERID, value);
    }

    /**
     * Gets the attribute value for TS_LINE_ID using the alias name TsLineId.
     * @return the TS_LINE_ID
     */
    public Number getTsLineId() {
        return (Number) getAttributeInternal(TSLINEID);
    }

    /**
     * Sets <code>value</code> as attribute value for TS_LINE_ID using the alias name TsLineId.
     * @param value value to set the TS_LINE_ID
     */
    public void setTsLineId(Number value) {
        setAttributeInternal(TSLINEID, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TransTrxnType.
     * @return the TransTrxnType
     */
    public String getTransTrxnType() {
        return (String) getAttributeInternal(TRANSTRXNTYPE);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransTrxnType.
     * @param value value to set the  TransTrxnType
     */
    public void setTransTrxnType(String value) {
        setAttributeInternal(TRANSTRXNTYPE, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TransAssetNumber.
     * @return the TransAssetNumber
     */
    public String getTransAssetNumber() {
        return (String) getAttributeInternal(TRANSASSETNUMBER);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransAssetNumber.
     * @param value value to set the  TransAssetNumber
     */
    public void setTransAssetNumber(String value) {
        setAttributeInternal(TRANSASSETNUMBER, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TransEmployeeNumber.
     * @return the TransEmployeeNumber
     */
    public String getTransEmployeeNumber() {
        return (String) getAttributeInternal(TRANSEMPLOYEENUMBER);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransEmployeeNumber.
     * @param value value to set the  TransEmployeeNumber
     */
    public void setTransEmployeeNumber(String value) {
        setAttributeInternal(TRANSEMPLOYEENUMBER, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TransTask.
     * @return the TransTask
     */
    public String getTransTask() {
        return (String) getAttributeInternal(TRANSTASK);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransTask.
     * @param value value to set the  TransTask
     */
    public void setTransTask(String value) {
        setAttributeInternal(TRANSTASK, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TransExpType.
     * @return the TransExpType
     */
    public String getTransExpType() {
        return (String) getAttributeInternal(TRANSEXPTYPE);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransExpType.
     * @param value value to set the  TransExpType
     */
    public void setTransExpType(String value) {
        setAttributeInternal(TRANSEXPTYPE, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TransContractId.
     * @return the TransContractId
     */
    public Number getTransContractId() {
        return (Number) getAttributeInternal(TRANSCONTRACTID);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransContractId.
     * @param value value to set the  TransContractId
     */
    public void setTransContractId(Number value) {
        setAttributeInternal(TRANSCONTRACTID, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TransProjectId.
     * @return the TransProjectId
     */
    public Number getTransProjectId() {
        return (Number) getAttributeInternal(TRANSPROJECTID);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransProjectId.
     * @param value value to set the  TransProjectId
     */
    public void setTransProjectId(Number value) {
        setAttributeInternal(TRANSPROJECTID, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TransSetId.
     * @return the TransSetId
     */
    public Number getTransSetId() {
        return (Number) getAttributeInternal(TRANSSETID);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransSetId.
     * @param value value to set the  TransSetId
     */
    public void setTransSetId(Number value) {
        setAttributeInternal(TRANSSETID, value);
    }

    /**
     * Gets the attribute value for TIMESHEET_DATE using the alias name TimesheetDate1.
     * @return the TIMESHEET_DATE
     */
    public Date getTimesheetDate1() {
        return (Date) getAttributeInternal(TIMESHEETDATE1);
    }

    /**
     * Sets <code>value</code> as attribute value for TIMESHEET_DATE using the alias name TimesheetDate1.
     * @param value value to set the TIMESHEET_DATE
     */
    public void setTimesheetDate1(Date value) {
        setAttributeInternal(TIMESHEETDATE1, value);
    }

    /**
     * Gets the view accessor <code>RowSet</code> LookupsLOV1.
     */
    public RowSet getLookupsLOV1() {
        return (RowSet) getAttributeInternal(LOOKUPSLOV1);
    }

    /**
     * Gets the view accessor <code>RowSet</code> TasksLOV1.
     */
    public RowSet getTasksLOV1() {
        return (RowSet) getAttributeInternal(TASKSLOV1);
    }

    /**
     * Gets the view accessor <code>RowSet</code> ExpenditureTypesLOV1.
     */
    public RowSet getExpenditureTypesLOV1() {
        return (RowSet) getAttributeInternal(EXPENDITURETYPESLOV1);
    }

    /**
     * Gets the view accessor <code>RowSet</code> TsAssetsLovVO1.
     */
    public RowSet getTsAssetsLovVO1() {
        return (RowSet) getAttributeInternal(TSASSETSLOVVO1);
    }

    /**
     * Gets the view accessor <code>RowSet</code> TsAssetOperatorLovVO1.
     */
    public RowSet getTsAssetOperatorLovVO1() {
        return (RowSet) getAttributeInternal(TSASSETOPERATORLOVVO1);
    }
}

