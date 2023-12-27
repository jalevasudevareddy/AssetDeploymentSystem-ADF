package model.view;

import java.math.BigDecimal;

import model.entity.XxadsAssetAllocationDtlsEOImpl;

import oracle.jbo.RowSet;
import oracle.jbo.domain.Date;
import oracle.jbo.domain.Number;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Fri Dec 16 12:13:14 IST 2022
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class AssetAllocationDetailsVORowImpl extends ViewRowImpl {


    public static final int ENTITY_XXADSASSETALLOCATIONDTLSEO = 0;

    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    protected enum AttributesEnum {
        AllocationDetailId,
        AllocationId,
        AllocationLineId,
        AllocationLineNum,
        AssetId,
        AssetType,
        CreatedBy,
        CreationDate,
        DeploymentDate,
        DetailLineNum,
        LastUpdateDate,
        LastUpdatedBy,
        ObjectVersionNumber,
        OffHireDate,
        OnHireDate,
        PrHeaderId,
        PrLineId,
        Quantity,
        TransAssetType,
        MobilizationRequired,
        TransMobilizationRequired,
        TransAssetNumber,
        TransAssetDesc,
        DetailStatus,
        TransDetailStatus,
        TransAssetCategoryId,
        TransSrcBuId,
        TransSrcFlexValueId,
        PrNumber,
        TransDONumber,
        EmployeeId,
        EmployeeType,
        TransEmployeeType,
        TransEmpNumber,
        TransEmpName,
        TransRentalTypeCode,
        TransDtlPRInterfaceCount,
        TransAssetDeploymentStatus,
        LookupsLOV1,
        LookupsLOV2,
        AllocationAssetNumberLOV1,
        LookupsLOV3,
        ADSEmployeeLOV1;
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
    public static final int ALLOCATIONID = AttributesEnum.AllocationId.index();
    public static final int ALLOCATIONLINEID = AttributesEnum.AllocationLineId.index();
    public static final int ALLOCATIONLINENUM = AttributesEnum.AllocationLineNum.index();
    public static final int ASSETID = AttributesEnum.AssetId.index();
    public static final int ASSETTYPE = AttributesEnum.AssetType.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int CREATIONDATE = AttributesEnum.CreationDate.index();
    public static final int DEPLOYMENTDATE = AttributesEnum.DeploymentDate.index();
    public static final int DETAILLINENUM = AttributesEnum.DetailLineNum.index();
    public static final int LASTUPDATEDATE = AttributesEnum.LastUpdateDate.index();
    public static final int LASTUPDATEDBY = AttributesEnum.LastUpdatedBy.index();
    public static final int OBJECTVERSIONNUMBER = AttributesEnum.ObjectVersionNumber.index();
    public static final int OFFHIREDATE = AttributesEnum.OffHireDate.index();
    public static final int ONHIREDATE = AttributesEnum.OnHireDate.index();
    public static final int PRHEADERID = AttributesEnum.PrHeaderId.index();
    public static final int PRLINEID = AttributesEnum.PrLineId.index();
    public static final int QUANTITY = AttributesEnum.Quantity.index();
    public static final int TRANSASSETTYPE = AttributesEnum.TransAssetType.index();
    public static final int MOBILIZATIONREQUIRED = AttributesEnum.MobilizationRequired.index();
    public static final int TRANSMOBILIZATIONREQUIRED = AttributesEnum.TransMobilizationRequired.index();
    public static final int TRANSASSETNUMBER = AttributesEnum.TransAssetNumber.index();
    public static final int TRANSASSETDESC = AttributesEnum.TransAssetDesc.index();
    public static final int DETAILSTATUS = AttributesEnum.DetailStatus.index();
    public static final int TRANSDETAILSTATUS = AttributesEnum.TransDetailStatus.index();
    public static final int TRANSASSETCATEGORYID = AttributesEnum.TransAssetCategoryId.index();
    public static final int TRANSSRCBUID = AttributesEnum.TransSrcBuId.index();
    public static final int TRANSSRCFLEXVALUEID = AttributesEnum.TransSrcFlexValueId.index();
    public static final int PRNUMBER = AttributesEnum.PrNumber.index();
    public static final int TRANSDONUMBER = AttributesEnum.TransDONumber.index();
    public static final int EMPLOYEEID = AttributesEnum.EmployeeId.index();
    public static final int EMPLOYEETYPE = AttributesEnum.EmployeeType.index();
    public static final int TRANSEMPLOYEETYPE = AttributesEnum.TransEmployeeType.index();
    public static final int TRANSEMPNUMBER = AttributesEnum.TransEmpNumber.index();
    public static final int TRANSEMPNAME = AttributesEnum.TransEmpName.index();
    public static final int TRANSRENTALTYPECODE = AttributesEnum.TransRentalTypeCode.index();
    public static final int TRANSDTLPRINTERFACECOUNT = AttributesEnum.TransDtlPRInterfaceCount.index();
    public static final int TRANSASSETDEPLOYMENTSTATUS = AttributesEnum.TransAssetDeploymentStatus.index();
    public static final int LOOKUPSLOV1 = AttributesEnum.LookupsLOV1.index();
    public static final int LOOKUPSLOV2 = AttributesEnum.LookupsLOV2.index();
    public static final int ALLOCATIONASSETNUMBERLOV1 = AttributesEnum.AllocationAssetNumberLOV1.index();
    public static final int LOOKUPSLOV3 = AttributesEnum.LookupsLOV3.index();
    public static final int ADSEMPLOYEELOV1 = AttributesEnum.ADSEmployeeLOV1.index();

    /**
     * This is the default constructor (do not remove).
     */
    public AssetAllocationDetailsVORowImpl() {
    }

    /**
     * Gets XxadsAssetAllocationDtlsEO entity object.
     * @return the XxadsAssetAllocationDtlsEO
     */
    public XxadsAssetAllocationDtlsEOImpl getXxadsAssetAllocationDtlsEO() {
        return (XxadsAssetAllocationDtlsEOImpl) getEntity(ENTITY_XXADSASSETALLOCATIONDTLSEO);
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
     * Gets the attribute value for ALLOCATION_ID using the alias name AllocationId.
     * @return the ALLOCATION_ID
     */
    public Number getAllocationId() {
        return (Number) getAttributeInternal(ALLOCATIONID);
    }

    /**
     * Sets <code>value</code> as attribute value for ALLOCATION_ID using the alias name AllocationId.
     * @param value value to set the ALLOCATION_ID
     */
    public void setAllocationId(Number value) {
        setAttributeInternal(ALLOCATIONID, value);
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
     * Gets the attribute value for ALLOCATION_LINE_NUM using the alias name AllocationLineNum.
     * @return the ALLOCATION_LINE_NUM
     */
    public Number getAllocationLineNum() {
        return (Number) getAttributeInternal(ALLOCATIONLINENUM);
    }

    /**
     * Sets <code>value</code> as attribute value for ALLOCATION_LINE_NUM using the alias name AllocationLineNum.
     * @param value value to set the ALLOCATION_LINE_NUM
     */
    public void setAllocationLineNum(Number value) {
        setAttributeInternal(ALLOCATIONLINENUM, value);
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
     * Gets the attribute value for ASSET_TYPE using the alias name AssetType.
     * @return the ASSET_TYPE
     */
    public String getAssetType() {
        return (String) getAttributeInternal(ASSETTYPE);
    }

    /**
     * Sets <code>value</code> as attribute value for ASSET_TYPE using the alias name AssetType.
     * @param value value to set the ASSET_TYPE
     */
    public void setAssetType(String value) {
        setAttributeInternal(ASSETTYPE, value);
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
     * Gets the attribute value for DEPLOYMENT_DATE using the alias name DeploymentDate.
     * @return the DEPLOYMENT_DATE
     */
    public Date getDeploymentDate() {
        return (Date) getAttributeInternal(DEPLOYMENTDATE);
    }

    /**
     * Sets <code>value</code> as attribute value for DEPLOYMENT_DATE using the alias name DeploymentDate.
     * @param value value to set the DEPLOYMENT_DATE
     */
    public void setDeploymentDate(Date value) {
        setAttributeInternal(DEPLOYMENTDATE, value);
    }

    /**
     * Gets the attribute value for DETAIL_LINE_NUM using the alias name DetailLineNum.
     * @return the DETAIL_LINE_NUM
     */
    public String getDetailLineNum() {
        return (String) getAttributeInternal(DETAILLINENUM);
    }

    /**
     * Sets <code>value</code> as attribute value for DETAIL_LINE_NUM using the alias name DetailLineNum.
     * @param value value to set the DETAIL_LINE_NUM
     */
    public void setDetailLineNum(String value) {
        setAttributeInternal(DETAILLINENUM, value);
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
     * Gets the attribute value for OBJECT_VERSION_NUMBER using the alias name ObjectVersionNumber.
     * @return the OBJECT_VERSION_NUMBER
     */
    public Number getObjectVersionNumber() {
        return (Number) getAttributeInternal(OBJECTVERSIONNUMBER);
    }

    /**
     * Gets the attribute value for OFF_HIRE_DATE using the alias name OffHireDate.
     * @return the OFF_HIRE_DATE
     */
    public Date getOffHireDate() {
        return (Date) getAttributeInternal(OFFHIREDATE);
    }

    /**
     * Sets <code>value</code> as attribute value for OFF_HIRE_DATE using the alias name OffHireDate.
     * @param value value to set the OFF_HIRE_DATE
     */
    public void setOffHireDate(Date value) {
        setAttributeInternal(OFFHIREDATE, value);
    }

    /**
     * Gets the attribute value for ON_HIRE_DATE using the alias name OnHireDate.
     * @return the ON_HIRE_DATE
     */
    public Date getOnHireDate() {
        return (Date) getAttributeInternal(ONHIREDATE);
    }

    /**
     * Sets <code>value</code> as attribute value for ON_HIRE_DATE using the alias name OnHireDate.
     * @param value value to set the ON_HIRE_DATE
     */
    public void setOnHireDate(Date value) {
        setAttributeInternal(ONHIREDATE, value);
    }

    /**
     * Gets the attribute value for PR_HEADER_ID using the alias name PrHeaderId.
     * @return the PR_HEADER_ID
     */
    public Number getPrHeaderId() {
        return (Number) getAttributeInternal(PRHEADERID);
    }

    /**
     * Sets <code>value</code> as attribute value for PR_HEADER_ID using the alias name PrHeaderId.
     * @param value value to set the PR_HEADER_ID
     */
    public void setPrHeaderId(Number value) {
        setAttributeInternal(PRHEADERID, value);
    }

    /**
     * Gets the attribute value for PR_LINE_ID using the alias name PrLineId.
     * @return the PR_LINE_ID
     */
    public Number getPrLineId() {
        return (Number) getAttributeInternal(PRLINEID);
    }

    /**
     * Sets <code>value</code> as attribute value for PR_LINE_ID using the alias name PrLineId.
     * @param value value to set the PR_LINE_ID
     */
    public void setPrLineId(Number value) {
        setAttributeInternal(PRLINEID, value);
    }

    /**
     * Gets the attribute value for QUANTITY using the alias name Quantity.
     * @return the QUANTITY
     */
    public Number getQuantity() {
        return (Number) getAttributeInternal(QUANTITY);
    }

    /**
     * Sets <code>value</code> as attribute value for QUANTITY using the alias name Quantity.
     * @param value value to set the QUANTITY
     */
    public void setQuantity(Number value) {
        setAttributeInternal(QUANTITY, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TransAssetType.
     * @return the TransAssetType
     */
    public String getTransAssetType() {
        return (String) getAttributeInternal(TRANSASSETTYPE);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransAssetType.
     * @param value value to set the  TransAssetType
     */
    public void setTransAssetType(String value) {
        setAttributeInternal(TRANSASSETTYPE, value);
    }

    /**
     * Gets the attribute value for MOBILIZATION_REQUIRED using the alias name MobilizationRequired.
     * @return the MOBILIZATION_REQUIRED
     */
    public String getMobilizationRequired() {
        return (String) getAttributeInternal(MOBILIZATIONREQUIRED);
    }

    /**
     * Sets <code>value</code> as attribute value for MOBILIZATION_REQUIRED using the alias name MobilizationRequired.
     * @param value value to set the MOBILIZATION_REQUIRED
     */
    public void setMobilizationRequired(String value) {
        setAttributeInternal(MOBILIZATIONREQUIRED, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TransMobilizationRequired.
     * @return the TransMobilizationRequired
     */
    public String getTransMobilizationRequired() {
        return (String) getAttributeInternal(TRANSMOBILIZATIONREQUIRED);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransMobilizationRequired.
     * @param value value to set the  TransMobilizationRequired
     */
    public void setTransMobilizationRequired(String value) {
        setAttributeInternal(TRANSMOBILIZATIONREQUIRED, value);
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
     * Gets the attribute value for the calculated attribute TransAssetDesc.
     * @return the TransAssetDesc
     */
    public String getTransAssetDesc() {
        return (String) getAttributeInternal(TRANSASSETDESC);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransAssetDesc.
     * @param value value to set the  TransAssetDesc
     */
    public void setTransAssetDesc(String value) {
        setAttributeInternal(TRANSASSETDESC, value);
    }

    /**
     * Gets the attribute value for DETAIL_STATUS using the alias name DetailStatus.
     * @return the DETAIL_STATUS
     */
    public String getDetailStatus() {
        return (String) getAttributeInternal(DETAILSTATUS);
    }

    /**
     * Sets <code>value</code> as attribute value for DETAIL_STATUS using the alias name DetailStatus.
     * @param value value to set the DETAIL_STATUS
     */
    public void setDetailStatus(String value) {
        setAttributeInternal(DETAILSTATUS, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TransDetailStatus.
     * @return the TransDetailStatus
     */
    public String getTransDetailStatus() {
        return (String) getAttributeInternal(TRANSDETAILSTATUS);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransDetailStatus.
     * @param value value to set the  TransDetailStatus
     */
    public void setTransDetailStatus(String value) {
        setAttributeInternal(TRANSDETAILSTATUS, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TransAssetCategoryId.
     * @return the TransAssetCategoryId
     */
    public Number getTransAssetCategoryId() {
        return (Number) getAttributeInternal(TRANSASSETCATEGORYID);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransAssetCategoryId.
     * @param value value to set the  TransAssetCategoryId
     */
    public void setTransAssetCategoryId(Number value) {
        setAttributeInternal(TRANSASSETCATEGORYID, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TransSrcBuId.
     * @return the TransSrcBuId
     */
    public Number getTransSrcBuId() {
        return (Number) getAttributeInternal(TRANSSRCBUID);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransSrcBuId.
     * @param value value to set the  TransSrcBuId
     */
    public void setTransSrcBuId(Number value) {
        setAttributeInternal(TRANSSRCBUID, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TransSrcFlexValueId.
     * @return the TransSrcFlexValueId
     */
    public Number getTransSrcFlexValueId() {
        return (Number) getAttributeInternal(TRANSSRCFLEXVALUEID);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransSrcFlexValueId.
     * @param value value to set the  TransSrcFlexValueId
     */
    public void setTransSrcFlexValueId(Number value) {
        setAttributeInternal(TRANSSRCFLEXVALUEID, value);
    }

    /**
     * Gets the attribute value for PR_NUMBER using the alias name PrNumber.
     * @return the PR_NUMBER
     */
    public Number getPrNumber() {
        return (Number) getAttributeInternal(PRNUMBER);
    }

    /**
     * Sets <code>value</code> as attribute value for PR_NUMBER using the alias name PrNumber.
     * @param value value to set the PR_NUMBER
     */
    public void setPrNumber(Number value) {
        setAttributeInternal(PRNUMBER, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TransDONumber.
     * @return the TransDONumber
     */
    public String getTransDONumber() {
        return (String) getAttributeInternal(TRANSDONUMBER);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransDONumber.
     * @param value value to set the  TransDONumber
     */
    public void setTransDONumber(String value) {
        setAttributeInternal(TRANSDONUMBER, value);
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
     * Gets the attribute value for EMPLOYEE_TYPE using the alias name EmployeeType.
     * @return the EMPLOYEE_TYPE
     */
    public String getEmployeeType() {
        return (String) getAttributeInternal(EMPLOYEETYPE);
    }

    /**
     * Sets <code>value</code> as attribute value for EMPLOYEE_TYPE using the alias name EmployeeType.
     * @param value value to set the EMPLOYEE_TYPE
     */
    public void setEmployeeType(String value) {
        setAttributeInternal(EMPLOYEETYPE, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TransEmployeeType.
     * @return the TransEmployeeType
     */
    public String getTransEmployeeType() {
        return (String) getAttributeInternal(TRANSEMPLOYEETYPE);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransEmployeeType.
     * @param value value to set the  TransEmployeeType
     */
    public void setTransEmployeeType(String value) {
        setAttributeInternal(TRANSEMPLOYEETYPE, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TransEmpNumber.
     * @return the TransEmpNumber
     */
    public String getTransEmpNumber() {
        return (String) getAttributeInternal(TRANSEMPNUMBER);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransEmpNumber.
     * @param value value to set the  TransEmpNumber
     */
    public void setTransEmpNumber(String value) {
        setAttributeInternal(TRANSEMPNUMBER, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TransEmpName.
     * @return the TransEmpName
     */
    public String getTransEmpName() {
        return (String) getAttributeInternal(TRANSEMPNAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransEmpName.
     * @param value value to set the  TransEmpName
     */
    public void setTransEmpName(String value) {
        setAttributeInternal(TRANSEMPNAME, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TransRentalTypeCode.
     * @return the TransRentalTypeCode
     */
    public String getTransRentalTypeCode() {
        return (String) getAttributeInternal(TRANSRENTALTYPECODE);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransRentalTypeCode.
     * @param value value to set the  TransRentalTypeCode
     */
    public void setTransRentalTypeCode(String value) {
        setAttributeInternal(TRANSRENTALTYPECODE, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TransDtlPRInterfaceCount.
     * @return the TransDtlPRInterfaceCount
     */
    public Integer getTransDtlPRInterfaceCount() {
        return (Integer) getAttributeInternal(TRANSDTLPRINTERFACECOUNT);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransDtlPRInterfaceCount.
     * @param value value to set the  TransDtlPRInterfaceCount
     */
    public void setTransDtlPRInterfaceCount(Integer value) {
        setAttributeInternal(TRANSDTLPRINTERFACECOUNT, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TransAssetStatus.
     * @return the TransAssetStatus
     */
    public String getTransAssetDeploymentStatus() {
        return (String) getAttributeInternal(TRANSASSETDEPLOYMENTSTATUS);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransAssetDeploymentStatus.
     * @param value value to set the  TransAssetDeploymentStatus
     */
    public void setTransAssetDeploymentStatus(String value) {
        setAttributeInternal(TRANSASSETDEPLOYMENTSTATUS, value);
    }

    /**
     * Gets the view accessor <code>RowSet</code> LookupsLOV1.
     */
    public RowSet getLookupsLOV1() {
        return (RowSet) getAttributeInternal(LOOKUPSLOV1);
    }

    /**
     * Gets the view accessor <code>RowSet</code> LookupsLOV2.
     */
    public RowSet getLookupsLOV2() {
        return (RowSet) getAttributeInternal(LOOKUPSLOV2);
    }

    /**
     * Gets the view accessor <code>RowSet</code> AllocationAssetNumberLOV1.
     */
    public RowSet getAllocationAssetNumberLOV1() {
        return (RowSet) getAttributeInternal(ALLOCATIONASSETNUMBERLOV1);
    }

    /**
     * Gets the view accessor <code>RowSet</code> LookupsLOV3.
     */
    public RowSet getLookupsLOV3() {
        return (RowSet) getAttributeInternal(LOOKUPSLOV3);
    }

    /**
     * Gets the view accessor <code>RowSet</code> ADSEmployeeLOV1.
     */
    public RowSet getADSEmployeeLOV1() {
        return (RowSet) getAttributeInternal(ADSEMPLOYEELOV1);
    }
}
