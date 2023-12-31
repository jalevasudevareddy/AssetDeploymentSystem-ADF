package model.view;

import model.entity.XxadsEmpCatEOImpl;

import oracle.jbo.domain.Date;
import oracle.jbo.domain.Number;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Thu Oct 20 17:09:58 IST 2022
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class EmpCatValidateVORowImpl extends ViewRowImpl {
    public static final int ENTITY_XXADSEMPCATEO = 0;

    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    protected enum AttributesEnum {
        ActiveFlag,
        BuId,
        CreatedBy,
        CreationDate,
        Description,
        EmpCategoryCode,
        EmpCategoryId,
        LastUpdateDate,
        LastUpdatedBy,
        ObjectVersionNumber;
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
    public static final int ACTIVEFLAG = AttributesEnum.ActiveFlag.index();
    public static final int BUID = AttributesEnum.BuId.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int CREATIONDATE = AttributesEnum.CreationDate.index();
    public static final int DESCRIPTION = AttributesEnum.Description.index();
    public static final int EMPCATEGORYCODE = AttributesEnum.EmpCategoryCode.index();
    public static final int EMPCATEGORYID = AttributesEnum.EmpCategoryId.index();
    public static final int LASTUPDATEDATE = AttributesEnum.LastUpdateDate.index();
    public static final int LASTUPDATEDBY = AttributesEnum.LastUpdatedBy.index();
    public static final int OBJECTVERSIONNUMBER = AttributesEnum.ObjectVersionNumber.index();

    /**
     * This is the default constructor (do not remove).
     */
    public EmpCatValidateVORowImpl() {
    }

    /**
     * Gets XxadsEmpCatEO entity object.
     * @return the XxadsEmpCatEO
     */
    public XxadsEmpCatEOImpl getXxadsEmpCatEO() {
        return (XxadsEmpCatEOImpl) getEntity(ENTITY_XXADSEMPCATEO);
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
     * Gets the attribute value for BU_ID using the alias name BuId.
     * @return the BU_ID
     */
    public Number getBuId() {
        return (Number) getAttributeInternal(BUID);
    }

    /**
     * Sets <code>value</code> as attribute value for BU_ID using the alias name BuId.
     * @param value value to set the BU_ID
     */
    public void setBuId(Number value) {
        setAttributeInternal(BUID, value);
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
     * Gets the attribute value for DESCRIPTION using the alias name Description.
     * @return the DESCRIPTION
     */
    public String getDescription() {
        return (String) getAttributeInternal(DESCRIPTION);
    }

    /**
     * Sets <code>value</code> as attribute value for DESCRIPTION using the alias name Description.
     * @param value value to set the DESCRIPTION
     */
    public void setDescription(String value) {
        setAttributeInternal(DESCRIPTION, value);
    }

    /**
     * Gets the attribute value for EMP_CATEGORY_CODE using the alias name EmpCategoryCode.
     * @return the EMP_CATEGORY_CODE
     */
    public String getEmpCategoryCode() {
        return (String) getAttributeInternal(EMPCATEGORYCODE);
    }

    /**
     * Sets <code>value</code> as attribute value for EMP_CATEGORY_CODE using the alias name EmpCategoryCode.
     * @param value value to set the EMP_CATEGORY_CODE
     */
    public void setEmpCategoryCode(String value) {
        setAttributeInternal(EMPCATEGORYCODE, value);
    }

    /**
     * Gets the attribute value for EMP_CATEGORY_ID using the alias name EmpCategoryId.
     * @return the EMP_CATEGORY_ID
     */
    public Number getEmpCategoryId() {
        return (Number) getAttributeInternal(EMPCATEGORYID);
    }

    /**
     * Sets <code>value</code> as attribute value for EMP_CATEGORY_ID using the alias name EmpCategoryId.
     * @param value value to set the EMP_CATEGORY_ID
     */
    public void setEmpCategoryId(Number value) {
        setAttributeInternal(EMPCATEGORYID, value);
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
}

