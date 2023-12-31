package model.lov;

import java.math.BigDecimal;

import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Mon Jan 02 15:13:51 IST 2023
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class ReceiptDeploymentNoLOVVORowImpl extends ViewRowImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    protected enum AttributesEnum {
        DoId,
        DoNumber,
        CustomerType,
        CustomerTypeDesc,
        ProjectId,
        ProjectName,
        Division,
        DivFlexValueId,
        DivFlexValueSetId,
        DeptFlexValueId,
        DeptFlexValueSetId,
        DepartmentCode,
        DepartmentName,
        DepartmentDesc,
        CustomerId,
        CustomerName,
        CustSiteId,
        SiteUseId,
        SiteDesc,
        AllocationId,
        MasterContractId;
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


    public static final int DOID = AttributesEnum.DoId.index();
    public static final int DONUMBER = AttributesEnum.DoNumber.index();
    public static final int CUSTOMERTYPE = AttributesEnum.CustomerType.index();
    public static final int CUSTOMERTYPEDESC = AttributesEnum.CustomerTypeDesc.index();
    public static final int PROJECTID = AttributesEnum.ProjectId.index();
    public static final int PROJECTNAME = AttributesEnum.ProjectName.index();
    public static final int DIVISION = AttributesEnum.Division.index();
    public static final int DIVFLEXVALUEID = AttributesEnum.DivFlexValueId.index();
    public static final int DIVFLEXVALUESETID = AttributesEnum.DivFlexValueSetId.index();
    public static final int DEPTFLEXVALUEID = AttributesEnum.DeptFlexValueId.index();
    public static final int DEPTFLEXVALUESETID = AttributesEnum.DeptFlexValueSetId.index();
    public static final int DEPARTMENTCODE = AttributesEnum.DepartmentCode.index();
    public static final int DEPARTMENTNAME = AttributesEnum.DepartmentName.index();
    public static final int DEPARTMENTDESC = AttributesEnum.DepartmentDesc.index();
    public static final int CUSTOMERID = AttributesEnum.CustomerId.index();
    public static final int CUSTOMERNAME = AttributesEnum.CustomerName.index();
    public static final int CUSTSITEID = AttributesEnum.CustSiteId.index();
    public static final int SITEUSEID = AttributesEnum.SiteUseId.index();
    public static final int SITEDESC = AttributesEnum.SiteDesc.index();
    public static final int ALLOCATIONID = AttributesEnum.AllocationId.index();
    public static final int MASTERCONTRACTID = AttributesEnum.MasterContractId.index();

    /**
     * This is the default constructor (do not remove).
     */
    public ReceiptDeploymentNoLOVVORowImpl() {
    }

    /**
     * Gets the attribute value for the calculated attribute DoId.
     * @return the DoId
     */
    public BigDecimal getDoId() {
        return (BigDecimal) getAttributeInternal(DOID);
    }

    /**
     * Gets the attribute value for the calculated attribute DoNumber.
     * @return the DoNumber
     */
    public String getDoNumber() {
        return (String) getAttributeInternal(DONUMBER);
    }

    /**
     * Gets the attribute value for the calculated attribute CustomerType.
     * @return the CustomerType
     */
    public String getCustomerType() {
        return (String) getAttributeInternal(CUSTOMERTYPE);
    }

    /**
     * Gets the attribute value for the calculated attribute CustomerTypeDesc.
     * @return the CustomerTypeDesc
     */
    public String getCustomerTypeDesc() {
        return (String) getAttributeInternal(CUSTOMERTYPEDESC);
    }

    /**
     * Gets the attribute value for the calculated attribute ProjectId.
     * @return the ProjectId
     */
    public BigDecimal getProjectId() {
        return (BigDecimal) getAttributeInternal(PROJECTID);
    }

    /**
     * Gets the attribute value for the calculated attribute ProjectName.
     * @return the ProjectName
     */
    public String getProjectName() {
        return (String) getAttributeInternal(PROJECTNAME);
    }

    /**
     * Gets the attribute value for the calculated attribute Division.
     * @return the Division
     */
    public String getDivision() {
        return (String) getAttributeInternal(DIVISION);
    }

    /**
     * Gets the attribute value for the calculated attribute DivFlexValueId.
     * @return the DivFlexValueId
     */
    public BigDecimal getDivFlexValueId() {
        return (BigDecimal) getAttributeInternal(DIVFLEXVALUEID);
    }

    /**
     * Gets the attribute value for the calculated attribute DivFlexValueSetId.
     * @return the DivFlexValueSetId
     */
    public BigDecimal getDivFlexValueSetId() {
        return (BigDecimal) getAttributeInternal(DIVFLEXVALUESETID);
    }

    /**
     * Gets the attribute value for the calculated attribute DeptFlexValueId.
     * @return the DeptFlexValueId
     */
    public BigDecimal getDeptFlexValueId() {
        return (BigDecimal) getAttributeInternal(DEPTFLEXVALUEID);
    }

    /**
     * Gets the attribute value for the calculated attribute DeptFlexValueSetId.
     * @return the DeptFlexValueSetId
     */
    public BigDecimal getDeptFlexValueSetId() {
        return (BigDecimal) getAttributeInternal(DEPTFLEXVALUESETID);
    }

    /**
     * Gets the attribute value for the calculated attribute DepartmentCode.
     * @return the DepartmentCode
     */
    public String getDepartmentCode() {
        return (String) getAttributeInternal(DEPARTMENTCODE);
    }

    /**
     * Gets the attribute value for the calculated attribute DepartmentName.
     * @return the DepartmentName
     */
    public String getDepartmentName() {
        return (String) getAttributeInternal(DEPARTMENTNAME);
    }

    /**
     * Gets the attribute value for the calculated attribute DepartmentDesc.
     * @return the DepartmentDesc
     */
    public String getDepartmentDesc() {
        return (String) getAttributeInternal(DEPARTMENTDESC);
    }

    /**
     * Gets the attribute value for the calculated attribute CustomerId.
     * @return the CustomerId
     */
    public BigDecimal getCustomerId() {
        return (BigDecimal) getAttributeInternal(CUSTOMERID);
    }

    /**
     * Gets the attribute value for the calculated attribute CustomerName.
     * @return the CustomerName
     */
    public String getCustomerName() {
        return (String) getAttributeInternal(CUSTOMERNAME);
    }

    /**
     * Gets the attribute value for the calculated attribute CustSiteId.
     * @return the CustSiteId
     */
    public BigDecimal getCustSiteId() {
        return (BigDecimal) getAttributeInternal(CUSTSITEID);
    }

    /**
     * Gets the attribute value for the calculated attribute SiteUseId.
     * @return the SiteUseId
     */
    public BigDecimal getSiteUseId() {
        return (BigDecimal) getAttributeInternal(SITEUSEID);
    }

    /**
     * Gets the attribute value for the calculated attribute SiteDesc.
     * @return the SiteDesc
     */
    public String getSiteDesc() {
        return (String) getAttributeInternal(SITEDESC);
    }

    /**
     * Gets the attribute value for the calculated attribute AllocationId.
     * @return the AllocationId
     */
    public BigDecimal getAllocationId() {
        return (BigDecimal) getAttributeInternal(ALLOCATIONID);
    }

    /**
     * Gets the attribute value for the calculated attribute MasterContractId.
     * @return the MasterContractId
     */
    public BigDecimal getMasterContractId() {
        return (BigDecimal) getAttributeInternal(MASTERCONTRACTID);
    }
}

