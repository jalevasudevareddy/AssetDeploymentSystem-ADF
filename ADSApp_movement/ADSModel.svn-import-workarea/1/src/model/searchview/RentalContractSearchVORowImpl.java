package model.searchview;

import model.entity.XxadsRentalContractEOImpl;

import oracle.jbo.domain.Date;
import oracle.jbo.domain.Number;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Thu Dec 01 17:36:45 IST 2022
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class RentalContractSearchVORowImpl extends ViewRowImpl {


    public static final int ENTITY_XXADSRENTALCONTRACTEO = 0;

    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    protected enum AttributesEnum {
        ActiveFlag,
        ApprovedDate,
        ContractDate,
        ContractId,
        ContractNumber,
        ContractSource,
        ContractStatus,
        ContractType,
        CreatedBy,
        CreationDate,
        CustSiteId,
        CustomerId,
        CustomerStatus,
        CustomerType,
        DepartmentCode,
        DepartmentName,
        DeptFlexValueId,
        DeptFlexValueSetId,
        DivFlexValSetId,
        DivFlexValueId,
        LastUpdateDate,
        LastUpdatedBy,
        MasterContractId,
        MasterReferenceId,
        Note,
        ObjectVersionNumber,
        ParentContractId,
        ParentReferenceId,
        PaymentTermId,
        PreparedBy,
        ProjectId,
        ReferenceId,
        Remarks,
        ReqBuId,
        RevisedBy,
        RevisedOn,
        RevisionNumber,
        RevisionReason,
        ScopeOfWork,
        SiteUseId,
        SrcBuId,
        SrcDivFlexValId,
        SrcDivFlexValSetId,
        SrcDivision,
        SubmittedBy,
        SubmittedDate,
        TermsConditions,
        ValidFrom,
        ValidTo,
        TransSourceBu,
        TransReqBu,
        TransContractSource,
        TransCustomerType,
        TransCustomerName,
        TransCustomerSite,
        TransProject,
        TransDivision,
        TransDepartment,
        TransContractNumber;
        private static AttributesEnum[] vals = null;
        ;
        private static final int firstIndex = 0;

        protected int index() {
            return RentalContractSearchVORowImpl.AttributesEnum.firstIndex() + ordinal();
        }

        protected static final int firstIndex() {
            return firstIndex;
        }

        protected static int count() {
            return RentalContractSearchVORowImpl.AttributesEnum.firstIndex() + RentalContractSearchVORowImpl.AttributesEnum
                                                                                                            .staticValues().length;
        }

        protected static final AttributesEnum[] staticValues() {
            if (vals == null) {
                vals = RentalContractSearchVORowImpl.AttributesEnum.values();
            }
            return vals;
        }
    }


    public static final int ACTIVEFLAG = AttributesEnum.ActiveFlag.index();
    public static final int APPROVEDDATE = AttributesEnum.ApprovedDate.index();
    public static final int CONTRACTDATE = AttributesEnum.ContractDate.index();
    public static final int CONTRACTID = AttributesEnum.ContractId.index();
    public static final int CONTRACTNUMBER = AttributesEnum.ContractNumber.index();
    public static final int CONTRACTSOURCE = AttributesEnum.ContractSource.index();
    public static final int CONTRACTSTATUS = AttributesEnum.ContractStatus.index();
    public static final int CONTRACTTYPE = AttributesEnum.ContractType.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int CREATIONDATE = AttributesEnum.CreationDate.index();
    public static final int CUSTSITEID = AttributesEnum.CustSiteId.index();
    public static final int CUSTOMERID = AttributesEnum.CustomerId.index();
    public static final int CUSTOMERSTATUS = AttributesEnum.CustomerStatus.index();
    public static final int CUSTOMERTYPE = AttributesEnum.CustomerType.index();
    public static final int DEPARTMENTCODE = AttributesEnum.DepartmentCode.index();
    public static final int DEPARTMENTNAME = AttributesEnum.DepartmentName.index();
    public static final int DEPTFLEXVALUEID = AttributesEnum.DeptFlexValueId.index();
    public static final int DEPTFLEXVALUESETID = AttributesEnum.DeptFlexValueSetId.index();
    public static final int DIVFLEXVALSETID = AttributesEnum.DivFlexValSetId.index();
    public static final int DIVFLEXVALUEID = AttributesEnum.DivFlexValueId.index();
    public static final int LASTUPDATEDATE = AttributesEnum.LastUpdateDate.index();
    public static final int LASTUPDATEDBY = AttributesEnum.LastUpdatedBy.index();
    public static final int MASTERCONTRACTID = AttributesEnum.MasterContractId.index();
    public static final int MASTERREFERENCEID = AttributesEnum.MasterReferenceId.index();
    public static final int NOTE = AttributesEnum.Note.index();
    public static final int OBJECTVERSIONNUMBER = AttributesEnum.ObjectVersionNumber.index();
    public static final int PARENTCONTRACTID = AttributesEnum.ParentContractId.index();
    public static final int PARENTREFERENCEID = AttributesEnum.ParentReferenceId.index();
    public static final int PAYMENTTERMID = AttributesEnum.PaymentTermId.index();
    public static final int PREPAREDBY = AttributesEnum.PreparedBy.index();
    public static final int PROJECTID = AttributesEnum.ProjectId.index();
    public static final int REFERENCEID = AttributesEnum.ReferenceId.index();
    public static final int REMARKS = AttributesEnum.Remarks.index();
    public static final int REQBUID = AttributesEnum.ReqBuId.index();
    public static final int REVISEDBY = AttributesEnum.RevisedBy.index();
    public static final int REVISEDON = AttributesEnum.RevisedOn.index();
    public static final int REVISIONNUMBER = AttributesEnum.RevisionNumber.index();
    public static final int REVISIONREASON = AttributesEnum.RevisionReason.index();
    public static final int SCOPEOFWORK = AttributesEnum.ScopeOfWork.index();
    public static final int SITEUSEID = AttributesEnum.SiteUseId.index();
    public static final int SRCBUID = AttributesEnum.SrcBuId.index();
    public static final int SRCDIVFLEXVALID = AttributesEnum.SrcDivFlexValId.index();
    public static final int SRCDIVFLEXVALSETID = AttributesEnum.SrcDivFlexValSetId.index();
    public static final int SRCDIVISION = AttributesEnum.SrcDivision.index();
    public static final int SUBMITTEDBY = AttributesEnum.SubmittedBy.index();
    public static final int SUBMITTEDDATE = AttributesEnum.SubmittedDate.index();
    public static final int TERMSCONDITIONS = AttributesEnum.TermsConditions.index();
    public static final int VALIDFROM = AttributesEnum.ValidFrom.index();
    public static final int VALIDTO = AttributesEnum.ValidTo.index();
    public static final int TRANSSOURCEBU = AttributesEnum.TransSourceBu.index();
    public static final int TRANSREQBU = AttributesEnum.TransReqBu.index();
    public static final int TRANSCONTRACTSOURCE = AttributesEnum.TransContractSource.index();
    public static final int TRANSCUSTOMERTYPE = AttributesEnum.TransCustomerType.index();
    public static final int TRANSCUSTOMERNAME = AttributesEnum.TransCustomerName.index();
    public static final int TRANSCUSTOMERSITE = AttributesEnum.TransCustomerSite.index();
    public static final int TRANSPROJECT = AttributesEnum.TransProject.index();
    public static final int TRANSDIVISION = AttributesEnum.TransDivision.index();
    public static final int TRANSDEPARTMENT = AttributesEnum.TransDepartment.index();
    public static final int TRANSCONTRACTNUMBER = AttributesEnum.TransContractNumber.index();

    /**
     * This is the default constructor (do not remove).
     */
    public RentalContractSearchVORowImpl() {
    }

    /**
     * Gets XxadsRentalContractEO entity object.
     * @return the XxadsRentalContractEO
     */
    public XxadsRentalContractEOImpl getXxadsRentalContractEO() {
        return (XxadsRentalContractEOImpl) getEntity(ENTITY_XXADSRENTALCONTRACTEO);
    }

    /**
     * Gets the attribute value for ACTIVE_FLAG using the alias name ActiveFlag.
     * @return the ACTIVE_FLAG
     */
    public String getActiveFlag() {
        return (String) getAttributeInternal(ACTIVEFLAG);
    }

    /**
     * Sets <code>value</code> as attribute value for ACTIVE_FLAG using the alias name ActiveFlag.
     * @param value value to set the ACTIVE_FLAG
     */
    public void setActiveFlag(String value) {
        setAttributeInternal(ACTIVEFLAG, value);
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
     * Gets the attribute value for CONTRACT_DATE using the alias name ContractDate.
     * @return the CONTRACT_DATE
     */
    public Date getContractDate() {
        return (Date) getAttributeInternal(CONTRACTDATE);
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
     * Gets the attribute value for CONTRACT_NUMBER using the alias name ContractNumber.
     * @return the CONTRACT_NUMBER
     */
    public String getContractNumber() {
        try 
        {
            return (String) getAttributeInternal(CONTRACTNUMBER) + " | "+ getRevisionNumber().toString();
        }
        catch (Exception e) 
        {
            e.printStackTrace();
            return (String) getAttributeInternal(CONTRACTNUMBER);
        }
    }

    /**
     * Sets <code>value</code> as attribute value for CONTRACT_NUMBER using the alias name ContractNumber.
     * @param value value to set the CONTRACT_NUMBER
     */
    public void setContractNumber(String value) {
        setAttributeInternal(CONTRACTNUMBER, value);
    }

    /**
     * Gets the attribute value for CONTRACT_SOURCE using the alias name ContractSource.
     * @return the CONTRACT_SOURCE
     */
    public String getContractSource() {
        return (String) getAttributeInternal(CONTRACTSOURCE);
    }

    /**
     * Sets <code>value</code> as attribute value for CONTRACT_SOURCE using the alias name ContractSource.
     * @param value value to set the CONTRACT_SOURCE
     */
    public void setContractSource(String value) {
        setAttributeInternal(CONTRACTSOURCE, value);
    }

    /**
     * Gets the attribute value for CONTRACT_STATUS using the alias name ContractStatus.
     * @return the CONTRACT_STATUS
     */
    public String getContractStatus() {
        return (String) getAttributeInternal(CONTRACTSTATUS);
    }

    /**
     * Sets <code>value</code> as attribute value for CONTRACT_STATUS using the alias name ContractStatus.
     * @param value value to set the CONTRACT_STATUS
     */
    public void setContractStatus(String value) {
        setAttributeInternal(CONTRACTSTATUS, value);
    }

    /**
     * Gets the attribute value for CONTRACT_TYPE using the alias name ContractType.
     * @return the CONTRACT_TYPE
     */
    public String getContractType() {
        return (String) getAttributeInternal(CONTRACTTYPE);
    }

    /**
     * Sets <code>value</code> as attribute value for CONTRACT_TYPE using the alias name ContractType.
     * @param value value to set the CONTRACT_TYPE
     */
    public void setContractType(String value) {
        setAttributeInternal(CONTRACTTYPE, value);
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
     * Gets the attribute value for CUSTOMER_STATUS using the alias name CustomerStatus.
     * @return the CUSTOMER_STATUS
     */
    public String getCustomerStatus() {
        return (String) getAttributeInternal(CUSTOMERSTATUS);
    }

    /**
     * Sets <code>value</code> as attribute value for CUSTOMER_STATUS using the alias name CustomerStatus.
     * @param value value to set the CUSTOMER_STATUS
     */
    public void setCustomerStatus(String value) {
        setAttributeInternal(CUSTOMERSTATUS, value);
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
     * Gets the attribute value for DIV_FLEX_VAL_SET_ID using the alias name DivFlexValSetId.
     * @return the DIV_FLEX_VAL_SET_ID
     */
    public Number getDivFlexValSetId() {
        return (Number) getAttributeInternal(DIVFLEXVALSETID);
    }

    /**
     * Sets <code>value</code> as attribute value for DIV_FLEX_VAL_SET_ID using the alias name DivFlexValSetId.
     * @param value value to set the DIV_FLEX_VAL_SET_ID
     */
    public void setDivFlexValSetId(Number value) {
        setAttributeInternal(DIVFLEXVALSETID, value);
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
     * Gets the attribute value for MASTER_REFERENCE_ID using the alias name MasterReferenceId.
     * @return the MASTER_REFERENCE_ID
     */
    public Number getMasterReferenceId() {
        return (Number) getAttributeInternal(MASTERREFERENCEID);
    }

    /**
     * Sets <code>value</code> as attribute value for MASTER_REFERENCE_ID using the alias name MasterReferenceId.
     * @param value value to set the MASTER_REFERENCE_ID
     */
    public void setMasterReferenceId(Number value) {
        setAttributeInternal(MASTERREFERENCEID, value);
    }

    /**
     * Gets the attribute value for NOTE using the alias name Note.
     * @return the NOTE
     */
    public String getNote() {
        return (String) getAttributeInternal(NOTE);
    }

    /**
     * Sets <code>value</code> as attribute value for NOTE using the alias name Note.
     * @param value value to set the NOTE
     */
    public void setNote(String value) {
        setAttributeInternal(NOTE, value);
    }

    /**
     * Gets the attribute value for OBJECT_VERSION_NUMBER using the alias name ObjectVersionNumber.
     * @return the OBJECT_VERSION_NUMBER
     */
    public Number getObjectVersionNumber() {
        return (Number) getAttributeInternal(OBJECTVERSIONNUMBER);
    }

    /**
     * Gets the attribute value for PARENT_CONTRACT_ID using the alias name ParentContractId.
     * @return the PARENT_CONTRACT_ID
     */
    public Number getParentContractId() {
        return (Number) getAttributeInternal(PARENTCONTRACTID);
    }

    /**
     * Sets <code>value</code> as attribute value for PARENT_CONTRACT_ID using the alias name ParentContractId.
     * @param value value to set the PARENT_CONTRACT_ID
     */
    public void setParentContractId(Number value) {
        setAttributeInternal(PARENTCONTRACTID, value);
    }

    /**
     * Gets the attribute value for PARENT_REFERENCE_ID using the alias name ParentReferenceId.
     * @return the PARENT_REFERENCE_ID
     */
    public Number getParentReferenceId() {
        return (Number) getAttributeInternal(PARENTREFERENCEID);
    }

    /**
     * Sets <code>value</code> as attribute value for PARENT_REFERENCE_ID using the alias name ParentReferenceId.
     * @param value value to set the PARENT_REFERENCE_ID
     */
    public void setParentReferenceId(Number value) {
        setAttributeInternal(PARENTREFERENCEID, value);
    }

    /**
     * Gets the attribute value for PAYMENT_TERM_ID using the alias name PaymentTermId.
     * @return the PAYMENT_TERM_ID
     */
    public Number getPaymentTermId() {
        return (Number) getAttributeInternal(PAYMENTTERMID);
    }

    /**
     * Sets <code>value</code> as attribute value for PAYMENT_TERM_ID using the alias name PaymentTermId.
     * @param value value to set the PAYMENT_TERM_ID
     */
    public void setPaymentTermId(Number value) {
        setAttributeInternal(PAYMENTTERMID, value);
    }

    /**
     * Gets the attribute value for PREPARED_BY using the alias name PreparedBy.
     * @return the PREPARED_BY
     */
    public String getPreparedBy() {
        return (String) getAttributeInternal(PREPAREDBY);
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
     * Gets the attribute value for REFERENCE_ID using the alias name ReferenceId.
     * @return the REFERENCE_ID
     */
    public Number getReferenceId() {
        return (Number) getAttributeInternal(REFERENCEID);
    }

    /**
     * Sets <code>value</code> as attribute value for REFERENCE_ID using the alias name ReferenceId.
     * @param value value to set the REFERENCE_ID
     */
    public void setReferenceId(Number value) {
        setAttributeInternal(REFERENCEID, value);
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
     * Gets the attribute value for REVISED_BY using the alias name RevisedBy.
     * @return the REVISED_BY
     */
    public String getRevisedBy() {
        return (String) getAttributeInternal(REVISEDBY);
    }

    /**
     * Sets <code>value</code> as attribute value for REVISED_BY using the alias name RevisedBy.
     * @param value value to set the REVISED_BY
     */
    public void setRevisedBy(String value) {
        setAttributeInternal(REVISEDBY, value);
    }

    /**
     * Gets the attribute value for REVISED_ON using the alias name RevisedOn.
     * @return the REVISED_ON
     */
    public Date getRevisedOn() {
        return (Date) getAttributeInternal(REVISEDON);
    }

    /**
     * Sets <code>value</code> as attribute value for REVISED_ON using the alias name RevisedOn.
     * @param value value to set the REVISED_ON
     */
    public void setRevisedOn(Date value) {
        setAttributeInternal(REVISEDON, value);
    }

    /**
     * Gets the attribute value for REVISION_NUMBER using the alias name RevisionNumber.
     * @return the REVISION_NUMBER
     */
    public Number getRevisionNumber() {
        return (Number) getAttributeInternal(REVISIONNUMBER);
    }

    /**
     * Sets <code>value</code> as attribute value for REVISION_NUMBER using the alias name RevisionNumber.
     * @param value value to set the REVISION_NUMBER
     */
    public void setRevisionNumber(Number value) {
        setAttributeInternal(REVISIONNUMBER, value);
    }

    /**
     * Gets the attribute value for REVISION_REASON using the alias name RevisionReason.
     * @return the REVISION_REASON
     */
    public String getRevisionReason() {
        return (String) getAttributeInternal(REVISIONREASON);
    }

    /**
     * Sets <code>value</code> as attribute value for REVISION_REASON using the alias name RevisionReason.
     * @param value value to set the REVISION_REASON
     */
    public void setRevisionReason(String value) {
        setAttributeInternal(REVISIONREASON, value);
    }

    /**
     * Gets the attribute value for SCOPE_OF_WORK using the alias name ScopeOfWork.
     * @return the SCOPE_OF_WORK
     */
    public String getScopeOfWork() {
        return (String) getAttributeInternal(SCOPEOFWORK);
    }

    /**
     * Sets <code>value</code> as attribute value for SCOPE_OF_WORK using the alias name ScopeOfWork.
     * @param value value to set the SCOPE_OF_WORK
     */
    public void setScopeOfWork(String value) {
        setAttributeInternal(SCOPEOFWORK, value);
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
     * Gets the attribute value for SRC_DIV_FLEX_VAL_ID using the alias name SrcDivFlexValId.
     * @return the SRC_DIV_FLEX_VAL_ID
     */
    public Number getSrcDivFlexValId() {
        return (Number) getAttributeInternal(SRCDIVFLEXVALID);
    }

    /**
     * Sets <code>value</code> as attribute value for SRC_DIV_FLEX_VAL_ID using the alias name SrcDivFlexValId.
     * @param value value to set the SRC_DIV_FLEX_VAL_ID
     */
    public void setSrcDivFlexValId(Number value) {
        setAttributeInternal(SRCDIVFLEXVALID, value);
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
     * Gets the attribute value for TERMS_CONDITIONS using the alias name TermsConditions.
     * @return the TERMS_CONDITIONS
     */
    public String getTermsConditions() {
        return (String) getAttributeInternal(TERMSCONDITIONS);
    }

    /**
     * Sets <code>value</code> as attribute value for TERMS_CONDITIONS using the alias name TermsConditions.
     * @param value value to set the TERMS_CONDITIONS
     */
    public void setTermsConditions(String value) {
        setAttributeInternal(TERMSCONDITIONS, value);
    }

    /**
     * Gets the attribute value for VALID_FROM using the alias name ValidFrom.
     * @return the VALID_FROM
     */
    public Date getValidFrom() {
        return (Date) getAttributeInternal(VALIDFROM);
    }

    /**
     * Sets <code>value</code> as attribute value for VALID_FROM using the alias name ValidFrom.
     * @param value value to set the VALID_FROM
     */
    public void setValidFrom(Date value) {
        setAttributeInternal(VALIDFROM, value);
    }

    /**
     * Gets the attribute value for VALID_TO using the alias name ValidTo.
     * @return the VALID_TO
     */
    public Date getValidTo() {
        return (Date) getAttributeInternal(VALIDTO);
    }

    /**
     * Sets <code>value</code> as attribute value for VALID_TO using the alias name ValidTo.
     * @param value value to set the VALID_TO
     */
    public void setValidTo(Date value) {
        setAttributeInternal(VALIDTO, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TransSourceBu.
     * @return the TransSourceBu
     */
    public String getTransSourceBu() {
        return (String) getAttributeInternal(TRANSSOURCEBU);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransSourceBu.
     * @param value value to set the  TransSourceBu
     */
    public void setTransSourceBu(String value) {
        setAttributeInternal(TRANSSOURCEBU, value);
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
     * Gets the attribute value for the calculated attribute TransContractSource.
     * @return the TransContractSource
     */
    public String getTransContractSource() {
        return (String) getAttributeInternal(TRANSCONTRACTSOURCE);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransContractSource.
     * @param value value to set the  TransContractSource
     */
    public void setTransContractSource(String value) {
        setAttributeInternal(TRANSCONTRACTSOURCE, value);
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
     * Gets the attribute value for the calculated attribute TransDivision.
     * @return the TransDivision
     */
    public String getTransDivision() {
        return (String) getAttributeInternal(TRANSDIVISION);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransDivision.
     * @param value value to set the  TransDivision
     */
    public void setTransDivision(String value) {
        setAttributeInternal(TRANSDIVISION, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TransDepartment.
     * @return the TransDepartment
     */
    public String getTransDepartment() {
        return (String) getAttributeInternal(TRANSDEPARTMENT);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransDepartment.
     * @param value value to set the  TransDepartment
     */
    public void setTransDepartment(String value) {
        setAttributeInternal(TRANSDEPARTMENT, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TransContractNumber.
     * @return the TransContractNumber
     */
    public Number getTransContractNumber() {
        return (Number) getAttributeInternal(TRANSCONTRACTNUMBER);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransContractNumber.
     * @param value value to set the  TransContractNumber
     */
    public void setTransContractNumber(Number value) {
        setAttributeInternal(TRANSCONTRACTNUMBER, value);
    }
}

