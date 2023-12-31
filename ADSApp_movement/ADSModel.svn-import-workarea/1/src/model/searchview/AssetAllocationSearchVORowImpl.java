package model.searchview;

import model.entity.XxadsAssetAllocationEOImpl;

import oracle.jbo.domain.Date;
import oracle.jbo.domain.Number;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Fri Dec 09 10:56:17 IST 2022
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class AssetAllocationSearchVORowImpl extends ViewRowImpl {


    public static final int ENTITY_XXADSASSETALLOCATIONEO = 0;

    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    protected enum AttributesEnum {
        AllocationDate,
        AllocationId,
        AllocationNumber,
        AllocationStatus,
        ApprovedDate,
        ContractId,
        CreatedBy,
        CreationDate,
        CustSiteId,
        CustomerId,
        CustomerType,
        DepartmentCode,
        DepartmentName,
        DeptFlexValueId,
        DeptFlexValueSetId,
        DivFlexValueId,
        DivFlexValueSetId,
        Division,
        LastUpdateDate,
        LastUpdatedBy,
        MasterContractId,
        ObjectVersionNumber,
        PreparedBy,
        PreparedOn,
        ProjectId,
        Remarks,
        ReqBuId,
        SiteUseId,
        SrcBuId,
        SrcDivFlexValSetId,
        SrcDivFlexValueId,
        SrcDivision,
        SubmittedBy,
        SubmittedDate,
        TransSrcBu,
        TransReqBu,
        TransContractNumber,
        TransCustomerType,
        TransProject,
        TransCustomerName,
        TransCustomerSite,
        TransDeptName,
        TransAllocationStatus,
        TransPRInterfacedDtlCount,
        TransAllocationNumber;
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


    public static final int ALLOCATIONDATE = AttributesEnum.AllocationDate.index();
    public static final int ALLOCATIONID = AttributesEnum.AllocationId.index();
    public static final int ALLOCATIONNUMBER = AttributesEnum.AllocationNumber.index();
    public static final int ALLOCATIONSTATUS = AttributesEnum.AllocationStatus.index();
    public static final int APPROVEDDATE = AttributesEnum.ApprovedDate.index();
    public static final int CONTRACTID = AttributesEnum.ContractId.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int CREATIONDATE = AttributesEnum.CreationDate.index();
    public static final int CUSTSITEID = AttributesEnum.CustSiteId.index();
    public static final int CUSTOMERID = AttributesEnum.CustomerId.index();
    public static final int CUSTOMERTYPE = AttributesEnum.CustomerType.index();
    public static final int DEPARTMENTCODE = AttributesEnum.DepartmentCode.index();
    public static final int DEPARTMENTNAME = AttributesEnum.DepartmentName.index();
    public static final int DEPTFLEXVALUEID = AttributesEnum.DeptFlexValueId.index();
    public static final int DEPTFLEXVALUESETID = AttributesEnum.DeptFlexValueSetId.index();
    public static final int DIVFLEXVALUEID = AttributesEnum.DivFlexValueId.index();
    public static final int DIVFLEXVALUESETID = AttributesEnum.DivFlexValueSetId.index();
    public static final int DIVISION = AttributesEnum.Division.index();
    public static final int LASTUPDATEDATE = AttributesEnum.LastUpdateDate.index();
    public static final int LASTUPDATEDBY = AttributesEnum.LastUpdatedBy.index();
    public static final int MASTERCONTRACTID = AttributesEnum.MasterContractId.index();
    public static final int OBJECTVERSIONNUMBER = AttributesEnum.ObjectVersionNumber.index();
    public static final int PREPAREDBY = AttributesEnum.PreparedBy.index();
    public static final int PREPAREDON = AttributesEnum.PreparedOn.index();
    public static final int PROJECTID = AttributesEnum.ProjectId.index();
    public static final int REMARKS = AttributesEnum.Remarks.index();
    public static final int REQBUID = AttributesEnum.ReqBuId.index();
    public static final int SITEUSEID = AttributesEnum.SiteUseId.index();
    public static final int SRCBUID = AttributesEnum.SrcBuId.index();
    public static final int SRCDIVFLEXVALSETID = AttributesEnum.SrcDivFlexValSetId.index();
    public static final int SRCDIVFLEXVALUEID = AttributesEnum.SrcDivFlexValueId.index();
    public static final int SRCDIVISION = AttributesEnum.SrcDivision.index();
    public static final int SUBMITTEDBY = AttributesEnum.SubmittedBy.index();
    public static final int SUBMITTEDDATE = AttributesEnum.SubmittedDate.index();
    public static final int TRANSSRCBU = AttributesEnum.TransSrcBu.index();
    public static final int TRANSREQBU = AttributesEnum.TransReqBu.index();
    public static final int TRANSCONTRACTNUMBER = AttributesEnum.TransContractNumber.index();
    public static final int TRANSCUSTOMERTYPE = AttributesEnum.TransCustomerType.index();
    public static final int TRANSPROJECT = AttributesEnum.TransProject.index();
    public static final int TRANSCUSTOMERNAME = AttributesEnum.TransCustomerName.index();
    public static final int TRANSCUSTOMERSITE = AttributesEnum.TransCustomerSite.index();
    public static final int TRANSDEPTNAME = AttributesEnum.TransDeptName.index();
    public static final int TRANSALLOCATIONSTATUS = AttributesEnum.TransAllocationStatus.index();
    public static final int TRANSPRINTERFACEDDTLCOUNT = AttributesEnum.TransPRInterfacedDtlCount.index();
    public static final int TRANSALLOCATIONNUMBER = AttributesEnum.TransAllocationNumber.index();

    /**
     * This is the default constructor (do not remove).
     */
    public AssetAllocationSearchVORowImpl() {
    }

    /**
     * Gets XxadsAssetAllocationEO entity object.
     * @return the XxadsAssetAllocationEO
     */
    public XxadsAssetAllocationEOImpl getXxadsAssetAllocationEO() {
        return (XxadsAssetAllocationEOImpl) getEntity(ENTITY_XXADSASSETALLOCATIONEO);
    }

    /**
     * Gets the attribute value for ALLOCATION_DATE using the alias name AllocationDate.
     * @return the ALLOCATION_DATE
     */
    public Date getAllocationDate() {
        return (Date) getAttributeInternal(ALLOCATIONDATE);
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
     * Gets the attribute value for ALLOCATION_NUMBER using the alias name AllocationNumber.
     * @return the ALLOCATION_NUMBER
     */
    public String getAllocationNumber() {
        return (String) getAttributeInternal(ALLOCATIONNUMBER);
    }

    /**
     * Sets <code>value</code> as attribute value for ALLOCATION_NUMBER using the alias name AllocationNumber.
     * @param value value to set the ALLOCATION_NUMBER
     */
    public void setAllocationNumber(String value) {
        setAttributeInternal(ALLOCATIONNUMBER, value);
    }

    /**
     * Gets the attribute value for ALLOCATION_STATUS using the alias name AllocationStatus.
     * @return the ALLOCATION_STATUS
     */
    public String getAllocationStatus() {
        return (String) getAttributeInternal(ALLOCATIONSTATUS);
    }

    /**
     * Sets <code>value</code> as attribute value for ALLOCATION_STATUS using the alias name AllocationStatus.
     * @param value value to set the ALLOCATION_STATUS
     */
    public void setAllocationStatus(String value) {
        setAttributeInternal(ALLOCATIONSTATUS, value);
    }

    /**
     * Gets the attribute value for APPROVED_DATE using the alias name ApprovedDate.
     * @return the APPROVED_DATE
     */
    public Date getApprovedDate() {
        return (Date) getAttributeInternal(APPROVEDDATE);
    }

    /**
     * Sets <code>value</code> as attribute value for APPROVED_DATE using the alias name ApprovedDate.
     * @param value value to set the APPROVED_DATE
     */
    public void setApprovedDate(Date value) {
        setAttributeInternal(APPROVEDDATE, value);
    }

    /**
     * Gets the attribute value for CONTRACT_ID using the alias name ContractId.
     * @return the CONTRACT_ID
     */
    public Number getContractId() {
        return (Number) getAttributeInternal(CONTRACTID);
    }

    /**
     * Sets <code>value</code> as attribute value for CONTRACT_ID using the alias name ContractId.
     * @param value value to set the CONTRACT_ID
     */
    public void setContractId(Number value) {
        setAttributeInternal(CONTRACTID, value);
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
     * Gets the attribute value for CUST_SITE_ID using the alias name CustSiteId.
     * @return the CUST_SITE_ID
     */
    public Number getCustSiteId() {
        return (Number) getAttributeInternal(CUSTSITEID);
    }

    /**
     * Sets <code>value</code> as attribute value for CUST_SITE_ID using the alias name CustSiteId.
     * @param value value to set the CUST_SITE_ID
     */
    public void setCustSiteId(Number value) {
        setAttributeInternal(CUSTSITEID, value);
    }

    /**
     * Gets the attribute value for CUSTOMER_ID using the alias name CustomerId.
     * @return the CUSTOMER_ID
     */
    public Number getCustomerId() {
        return (Number) getAttributeInternal(CUSTOMERID);
    }

    /**
     * Sets <code>value</code> as attribute value for CUSTOMER_ID using the alias name CustomerId.
     * @param value value to set the CUSTOMER_ID
     */
    public void setCustomerId(Number value) {
        setAttributeInternal(CUSTOMERID, value);
    }

    /**
     * Gets the attribute value for CUSTOMER_TYPE using the alias name CustomerType.
     * @return the CUSTOMER_TYPE
     */
    public String getCustomerType() {
        return (String) getAttributeInternal(CUSTOMERTYPE);
    }

    /**
     * Sets <code>value</code> as attribute value for CUSTOMER_TYPE using the alias name CustomerType.
     * @param value value to set the CUSTOMER_TYPE
     */
    public void setCustomerType(String value) {
        setAttributeInternal(CUSTOMERTYPE, value);
    }

    /**
     * Gets the attribute value for DEPARTMENT_CODE using the alias name DepartmentCode.
     * @return the DEPARTMENT_CODE
     */
    public String getDepartmentCode() {
        return (String) getAttributeInternal(DEPARTMENTCODE);
    }

    /**
     * Sets <code>value</code> as attribute value for DEPARTMENT_CODE using the alias name DepartmentCode.
     * @param value value to set the DEPARTMENT_CODE
     */
    public void setDepartmentCode(String value) {
        setAttributeInternal(DEPARTMENTCODE, value);
    }

    /**
     * Gets the attribute value for DEPARTMENT_NAME using the alias name DepartmentName.
     * @return the DEPARTMENT_NAME
     */
    public String getDepartmentName() {
        return (String) getAttributeInternal(DEPARTMENTNAME);
    }

    /**
     * Sets <code>value</code> as attribute value for DEPARTMENT_NAME using the alias name DepartmentName.
     * @param value value to set the DEPARTMENT_NAME
     */
    public void setDepartmentName(String value) {
        setAttributeInternal(DEPARTMENTNAME, value);
    }

    /**
     * Gets the attribute value for DEPT_FLEX_VALUE_ID using the alias name DeptFlexValueId.
     * @return the DEPT_FLEX_VALUE_ID
     */
    public Number getDeptFlexValueId() {
        return (Number) getAttributeInternal(DEPTFLEXVALUEID);
    }

    /**
     * Sets <code>value</code> as attribute value for DEPT_FLEX_VALUE_ID using the alias name DeptFlexValueId.
     * @param value value to set the DEPT_FLEX_VALUE_ID
     */
    public void setDeptFlexValueId(Number value) {
        setAttributeInternal(DEPTFLEXVALUEID, value);
    }

    /**
     * Gets the attribute value for DEPT_FLEX_VALUE_SET_ID using the alias name DeptFlexValueSetId.
     * @return the DEPT_FLEX_VALUE_SET_ID
     */
    public Number getDeptFlexValueSetId() {
        return (Number) getAttributeInternal(DEPTFLEXVALUESETID);
    }

    /**
     * Sets <code>value</code> as attribute value for DEPT_FLEX_VALUE_SET_ID using the alias name DeptFlexValueSetId.
     * @param value value to set the DEPT_FLEX_VALUE_SET_ID
     */
    public void setDeptFlexValueSetId(Number value) {
        setAttributeInternal(DEPTFLEXVALUESETID, value);
    }

    /**
     * Gets the attribute value for DIV_FLEX_VALUE_ID using the alias name DivFlexValueId.
     * @return the DIV_FLEX_VALUE_ID
     */
    public Number getDivFlexValueId() {
        return (Number) getAttributeInternal(DIVFLEXVALUEID);
    }

    /**
     * Sets <code>value</code> as attribute value for DIV_FLEX_VALUE_ID using the alias name DivFlexValueId.
     * @param value value to set the DIV_FLEX_VALUE_ID
     */
    public void setDivFlexValueId(Number value) {
        setAttributeInternal(DIVFLEXVALUEID, value);
    }

    /**
     * Gets the attribute value for DIV_FLEX_VALUE_SET_ID using the alias name DivFlexValueSetId.
     * @return the DIV_FLEX_VALUE_SET_ID
     */
    public Number getDivFlexValueSetId() {
        return (Number) getAttributeInternal(DIVFLEXVALUESETID);
    }

    /**
     * Sets <code>value</code> as attribute value for DIV_FLEX_VALUE_SET_ID using the alias name DivFlexValueSetId.
     * @param value value to set the DIV_FLEX_VALUE_SET_ID
     */
    public void setDivFlexValueSetId(Number value) {
        setAttributeInternal(DIVFLEXVALUESETID, value);
    }

    /**
     * Gets the attribute value for DIVISION using the alias name Division.
     * @return the DIVISION
     */
    public String getDivision() {
        return (String) getAttributeInternal(DIVISION);
    }

    /**
     * Sets <code>value</code> as attribute value for DIVISION using the alias name Division.
     * @param value value to set the DIVISION
     */
    public void setDivision(String value) {
        setAttributeInternal(DIVISION, value);
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
     * Gets the attribute value for MASTER_CONTRACT_ID using the alias name MasterContractId.
     * @return the MASTER_CONTRACT_ID
     */
    public Number getMasterContractId() {
        return (Number) getAttributeInternal(MASTERCONTRACTID);
    }

    /**
     * Sets <code>value</code> as attribute value for MASTER_CONTRACT_ID using the alias name MasterContractId.
     * @param value value to set the MASTER_CONTRACT_ID
     */
    public void setMasterContractId(Number value) {
        setAttributeInternal(MASTERCONTRACTID, value);
    }

    /**
     * Gets the attribute value for OBJECT_VERSION_NUMBER using the alias name ObjectVersionNumber.
     * @return the OBJECT_VERSION_NUMBER
     */
    public Number getObjectVersionNumber() {
        return (Number) getAttributeInternal(OBJECTVERSIONNUMBER);
    }

    /**
     * Gets the attribute value for PREPARED_BY using the alias name PreparedBy.
     * @return the PREPARED_BY
     */
    public String getPreparedBy() {
        return (String) getAttributeInternal(PREPAREDBY);
    }


    /**
     * Gets the attribute value for PREPARED_ON using the alias name PreparedOn.
     * @return the PREPARED_ON
     */
    public Date getPreparedOn() {
        return (Date) getAttributeInternal(PREPAREDON);
    }


    /**
     * Gets the attribute value for PROJECT_ID using the alias name ProjectId.
     * @return the PROJECT_ID
     */
    public Number getProjectId() {
        return (Number) getAttributeInternal(PROJECTID);
    }

    /**
     * Sets <code>value</code> as attribute value for PROJECT_ID using the alias name ProjectId.
     * @param value value to set the PROJECT_ID
     */
    public void setProjectId(Number value) {
        setAttributeInternal(PROJECTID, value);
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
     * Gets the attribute value for REQ_BU_ID using the alias name ReqBuId.
     * @return the REQ_BU_ID
     */
    public Number getReqBuId() {
        return (Number) getAttributeInternal(REQBUID);
    }

    /**
     * Sets <code>value</code> as attribute value for REQ_BU_ID using the alias name ReqBuId.
     * @param value value to set the REQ_BU_ID
     */
    public void setReqBuId(Number value) {
        setAttributeInternal(REQBUID, value);
    }

    /**
     * Gets the attribute value for SITE_USE_ID using the alias name SiteUseId.
     * @return the SITE_USE_ID
     */
    public Number getSiteUseId() {
        return (Number) getAttributeInternal(SITEUSEID);
    }

    /**
     * Sets <code>value</code> as attribute value for SITE_USE_ID using the alias name SiteUseId.
     * @param value value to set the SITE_USE_ID
     */
    public void setSiteUseId(Number value) {
        setAttributeInternal(SITEUSEID, value);
    }

    /**
     * Gets the attribute value for SRC_BU_ID using the alias name SrcBuId.
     * @return the SRC_BU_ID
     */
    public Number getSrcBuId() {
        return (Number) getAttributeInternal(SRCBUID);
    }

    /**
     * Sets <code>value</code> as attribute value for SRC_BU_ID using the alias name SrcBuId.
     * @param value value to set the SRC_BU_ID
     */
    public void setSrcBuId(Number value) {
        setAttributeInternal(SRCBUID, value);
    }

    /**
     * Gets the attribute value for SRC_DIV_FLEX_VAL_SET_ID using the alias name SrcDivFlexValSetId.
     * @return the SRC_DIV_FLEX_VAL_SET_ID
     */
    public Number getSrcDivFlexValSetId() {
        return (Number) getAttributeInternal(SRCDIVFLEXVALSETID);
    }

    /**
     * Sets <code>value</code> as attribute value for SRC_DIV_FLEX_VAL_SET_ID using the alias name SrcDivFlexValSetId.
     * @param value value to set the SRC_DIV_FLEX_VAL_SET_ID
     */
    public void setSrcDivFlexValSetId(Number value) {
        setAttributeInternal(SRCDIVFLEXVALSETID, value);
    }

    /**
     * Gets the attribute value for SRC_DIV_FLEX_VALUE_ID using the alias name SrcDivFlexValueId.
     * @return the SRC_DIV_FLEX_VALUE_ID
     */
    public Number getSrcDivFlexValueId() {
        return (Number) getAttributeInternal(SRCDIVFLEXVALUEID);
    }

    /**
     * Sets <code>value</code> as attribute value for SRC_DIV_FLEX_VALUE_ID using the alias name SrcDivFlexValueId.
     * @param value value to set the SRC_DIV_FLEX_VALUE_ID
     */
    public void setSrcDivFlexValueId(Number value) {
        setAttributeInternal(SRCDIVFLEXVALUEID, value);
    }

    /**
     * Gets the attribute value for SRC_DIVISION using the alias name SrcDivision.
     * @return the SRC_DIVISION
     */
    public String getSrcDivision() {
        return (String) getAttributeInternal(SRCDIVISION);
    }

    /**
     * Sets <code>value</code> as attribute value for SRC_DIVISION using the alias name SrcDivision.
     * @param value value to set the SRC_DIVISION
     */
    public void setSrcDivision(String value) {
        setAttributeInternal(SRCDIVISION, value);
    }

    /**
     * Gets the attribute value for SUBMITTED_BY using the alias name SubmittedBy.
     * @return the SUBMITTED_BY
     */
    public String getSubmittedBy() {
        return (String) getAttributeInternal(SUBMITTEDBY);
    }

    /**
     * Sets <code>value</code> as attribute value for SUBMITTED_BY using the alias name SubmittedBy.
     * @param value value to set the SUBMITTED_BY
     */
    public void setSubmittedBy(String value) {
        setAttributeInternal(SUBMITTEDBY, value);
    }

    /**
     * Gets the attribute value for SUBMITTED_DATE using the alias name SubmittedDate.
     * @return the SUBMITTED_DATE
     */
    public Date getSubmittedDate() {
        return (Date) getAttributeInternal(SUBMITTEDDATE);
    }

    /**
     * Sets <code>value</code> as attribute value for SUBMITTED_DATE using the alias name SubmittedDate.
     * @param value value to set the SUBMITTED_DATE
     */
    public void setSubmittedDate(Date value) {
        setAttributeInternal(SUBMITTEDDATE, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TransSrcBu.
     * @return the TransSrcBu
     */
    public String getTransSrcBu() {
        return (String) getAttributeInternal(TRANSSRCBU);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransSrcBu.
     * @param value value to set the  TransSrcBu
     */
    public void setTransSrcBu(String value) {
        setAttributeInternal(TRANSSRCBU, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TransReqBu.
     * @return the TransReqBu
     */
    public String getTransReqBu() {
        return (String) getAttributeInternal(TRANSREQBU);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransReqBu.
     * @param value value to set the  TransReqBu
     */
    public void setTransReqBu(String value) {
        setAttributeInternal(TRANSREQBU, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TransContractNumber.
     * @return the TransContractNumber
     */
    public String getTransContractNumber() {
        return (String) getAttributeInternal(TRANSCONTRACTNUMBER);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransContractNumber.
     * @param value value to set the  TransContractNumber
     */
    public void setTransContractNumber(String value) {
        setAttributeInternal(TRANSCONTRACTNUMBER, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TransCustomerType.
     * @return the TransCustomerType
     */
    public String getTransCustomerType() {
        return (String) getAttributeInternal(TRANSCUSTOMERTYPE);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransCustomerType.
     * @param value value to set the  TransCustomerType
     */
    public void setTransCustomerType(String value) {
        setAttributeInternal(TRANSCUSTOMERTYPE, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TransProject.
     * @return the TransProject
     */
    public String getTransProject() {
        return (String) getAttributeInternal(TRANSPROJECT);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransProject.
     * @param value value to set the  TransProject
     */
    public void setTransProject(String value) {
        setAttributeInternal(TRANSPROJECT, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TransCustomerName.
     * @return the TransCustomerName
     */
    public String getTransCustomerName() {
        return (String) getAttributeInternal(TRANSCUSTOMERNAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransCustomerName.
     * @param value value to set the  TransCustomerName
     */
    public void setTransCustomerName(String value) {
        setAttributeInternal(TRANSCUSTOMERNAME, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TransCustomerSite.
     * @return the TransCustomerSite
     */
    public String getTransCustomerSite() {
        return (String) getAttributeInternal(TRANSCUSTOMERSITE);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransCustomerSite.
     * @param value value to set the  TransCustomerSite
     */
    public void setTransCustomerSite(String value) {
        setAttributeInternal(TRANSCUSTOMERSITE, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TransDeptName.
     * @return the TransDeptName
     */
    public String getTransDeptName() {
        return (String) getAttributeInternal(TRANSDEPTNAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransDeptName.
     * @param value value to set the  TransDeptName
     */
    public void setTransDeptName(String value) {
        setAttributeInternal(TRANSDEPTNAME, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TransAllocationStatus.
     * @return the TransAllocationStatus
     */
    public String getTransAllocationStatus() {
        return (String) getAttributeInternal(TRANSALLOCATIONSTATUS);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransAllocationStatus.
     * @param value value to set the  TransAllocationStatus
     */
    public void setTransAllocationStatus(String value) {
        setAttributeInternal(TRANSALLOCATIONSTATUS, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TransPRInterfacedDflCount.
     * @return the TransPRInterfacedDflCount
     */
    public Integer getTransPRInterfacedDtlCount() {
        return (Integer) getAttributeInternal(TRANSPRINTERFACEDDTLCOUNT);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransPRInterfacedDflCount.
     * @param value value to set the  TransPRInterfacedDflCount
     */
    public void setTransPRInterfacedDtlCount(Integer value) {
        setAttributeInternal(TRANSPRINTERFACEDDTLCOUNT, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TransAllocationNumber.
     * @return the TransAllocationNumber
     */
    public Number getTransAllocationNumber() {
        return (Number) getAttributeInternal(TRANSALLOCATIONNUMBER);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransAllocationNumber.
     * @param value value to set the  TransAllocationNumber
     */
    public void setTransAllocationNumber(Number value) {
        setAttributeInternal(TRANSALLOCATIONNUMBER, value);
    }


}

