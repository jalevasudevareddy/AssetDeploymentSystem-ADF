package model.lov;

import java.math.BigDecimal;

import oracle.jbo.domain.Number;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Fri Dec 02 16:53:54 IST 2022
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class ContractReferenceNumLovVORowImpl extends ViewRowImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    protected enum AttributesEnum {
        ReferenceId,
        ContractSource,
        ReferenceNumber,
        TransCustomerType,
        CustomerType,
        TransProject,
        ProjectId,
        TransDivision,
        DivFlexValueId,
        DivFlexValSetId,
        TransDepartment,
        DepartmentName,
        DepartmentCode,
        DeptFlexValueId,
        DeptFlexValueSetId,
        TransCustomer,
        CustomerId,
        TransCustomerSite,
        SiteUseId,
        CustSiteId,
        MasterId,
        ParentId;
        private static AttributesEnum[] vals = null;
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


    public static final int REFERENCEID = AttributesEnum.ReferenceId.index();
    public static final int CONTRACTSOURCE = AttributesEnum.ContractSource.index();
    public static final int REFERENCENUMBER = AttributesEnum.ReferenceNumber.index();
    public static final int TRANSCUSTOMERTYPE = AttributesEnum.TransCustomerType.index();
    public static final int CUSTOMERTYPE = AttributesEnum.CustomerType.index();
    public static final int TRANSPROJECT = AttributesEnum.TransProject.index();
    public static final int PROJECTID = AttributesEnum.ProjectId.index();
    public static final int TRANSDIVISION = AttributesEnum.TransDivision.index();
    public static final int DIVFLEXVALUEID = AttributesEnum.DivFlexValueId.index();
    public static final int DIVFLEXVALSETID = AttributesEnum.DivFlexValSetId.index();
    public static final int TRANSDEPARTMENT = AttributesEnum.TransDepartment.index();
    public static final int DEPARTMENTNAME = AttributesEnum.DepartmentName.index();
    public static final int DEPARTMENTCODE = AttributesEnum.DepartmentCode.index();
    public static final int DEPTFLEXVALUEID = AttributesEnum.DeptFlexValueId.index();
    public static final int DEPTFLEXVALUESETID = AttributesEnum.DeptFlexValueSetId.index();
    public static final int TRANSCUSTOMER = AttributesEnum.TransCustomer.index();
    public static final int CUSTOMERID = AttributesEnum.CustomerId.index();
    public static final int TRANSCUSTOMERSITE = AttributesEnum.TransCustomerSite.index();
    public static final int SITEUSEID = AttributesEnum.SiteUseId.index();
    public static final int CUSTSITEID = AttributesEnum.CustSiteId.index();
    public static final int MASTERID = AttributesEnum.MasterId.index();
    public static final int PARENTID = AttributesEnum.ParentId.index();

    /**
     * This is the default constructor (do not remove).
     */
    public ContractReferenceNumLovVORowImpl() {
    }

    /**
     * Gets the attribute value for the calculated attribute ReferenceId.
     * @return the ReferenceId
     */
    public Number getReferenceId() {
        return (Number) getAttributeInternal(REFERENCEID);
    }

    /**
     * Gets the attribute value for the calculated attribute ContractSource.
     * @return the ContractSource
     */
    public String getContractSource() {
        return (String) getAttributeInternal(CONTRACTSOURCE);
    }

    /**
     * Gets the attribute value for the calculated attribute ReferenceNumber.
     * @return the ReferenceNumber
     */
    public String getReferenceNumber() {
        return (String) getAttributeInternal(REFERENCENUMBER);
    }

    /**
     * Gets the attribute value for the calculated attribute TransCustomerType.
     * @return the TransCustomerType
     */
    public String getTransCustomerType() {
        return (String) getAttributeInternal(TRANSCUSTOMERTYPE);
    }

    /**
     * Gets the attribute value for the calculated attribute CustomerType.
     * @return the CustomerType
     */
    public String getCustomerType() {
        return (String) getAttributeInternal(CUSTOMERTYPE);
    }

    /**
     * Gets the attribute value for the calculated attribute TransProject.
     * @return the TransProject
     */
    public String getTransProject() {
        return (String) getAttributeInternal(TRANSPROJECT);
    }

    /**
     * Gets the attribute value for the calculated attribute ProjectId.
     * @return the ProjectId
     */
    public oracle.jbo.domain.Number getProjectId() {
        return (oracle.jbo.domain.Number) getAttributeInternal(PROJECTID);
    }

    /**
     * Gets the attribute value for the calculated attribute TransDivision.
     * @return the TransDivision
     */
    public String getTransDivision() {
        return (String) getAttributeInternal(TRANSDIVISION);
    }

    /**
     * Gets the attribute value for the calculated attribute DivFlexValueId.
     * @return the DivFlexValueId
     */
    public Number getDivFlexValueId() {
        return (Number) getAttributeInternal(DIVFLEXVALUEID);
    }

    /**
     * Gets the attribute value for the calculated attribute DivFlexValSetId.
     * @return the DivFlexValSetId
     */
    public Number getDivFlexValSetId() {
        return (Number) getAttributeInternal(DIVFLEXVALSETID);
    }

    /**
     * Gets the attribute value for the calculated attribute TransDepartment.
     * @return the TransDepartment
     */
    public String getTransDepartment() {
        return (String) getAttributeInternal(TRANSDEPARTMENT);
    }

    /**
     * Gets the attribute value for the calculated attribute DepartmentName.
     * @return the DepartmentName
     */
    public String getDepartmentName() {
        return (String) getAttributeInternal(DEPARTMENTNAME);
    }

    /**
     * Gets the attribute value for the calculated attribute DepartmentCode.
     * @return the DepartmentCode
     */
    public String getDepartmentCode() {
        return (String) getAttributeInternal(DEPARTMENTCODE);
    }

    /**
     * Gets the attribute value for the calculated attribute DeptFlexValueId.
     * @return the DeptFlexValueId
     */
    public Number getDeptFlexValueId() {
        return (Number) getAttributeInternal(DEPTFLEXVALUEID);
    }

    /**
     * Gets the attribute value for the calculated attribute DeptFlexValueSetId.
     * @return the DeptFlexValueSetId
     */
    public Number getDeptFlexValueSetId() {
        return (Number) getAttributeInternal(DEPTFLEXVALUESETID);
    }

    /**
     * Gets the attribute value for the calculated attribute TransCustomer.
     * @return the TransCustomer
     */
    public String getTransCustomer() {
        return (String) getAttributeInternal(TRANSCUSTOMER);
    }

    /**
     * Gets the attribute value for the calculated attribute CustomerId.
     * @return the CustomerId
     */
    public Number getCustomerId() {
        return (Number) getAttributeInternal(CUSTOMERID);
    }

    /**
     * Gets the attribute value for the calculated attribute TransCustomerSite.
     * @return the TransCustomerSite
     */
    public String getTransCustomerSite() {
        return (String) getAttributeInternal(TRANSCUSTOMERSITE);
    }

    /**
     * Gets the attribute value for the calculated attribute SiteUseId.
     * @return the SiteUseId
     */
    public Number getSiteUseId() {
        return (Number) getAttributeInternal(SITEUSEID);
    }

    /**
     * Gets the attribute value for the calculated attribute CustSiteId.
     * @return the CustSiteId
     */
    public Number getCustSiteId() {
        return (Number) getAttributeInternal(CUSTSITEID);
    }

    /**
     * Gets the attribute value for the calculated attribute MasterId.
     * @return the MasterId
     */
    public Number getMasterId() {
        return (Number) getAttributeInternal(MASTERID);
    }

    /**
     * Gets the attribute value for the calculated attribute ParentId.
     * @return the ParentId
     */
    public Number getParentId() {
        return (Number) getAttributeInternal(PARENTID);
    }
}

