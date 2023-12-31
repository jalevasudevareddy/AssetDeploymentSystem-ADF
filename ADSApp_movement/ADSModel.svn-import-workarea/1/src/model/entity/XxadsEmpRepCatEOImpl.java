package model.entity;

import java.math.BigDecimal;

import java.sql.Timestamp;

import java.util.Map;

import oracle.adf.share.ADFContext;

import oracle.jbo.AttributeList;
import oracle.jbo.Key;
import oracle.jbo.domain.Date;
import oracle.jbo.domain.Number;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.SequenceImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Tue Oct 18 14:56:57 IST 2022
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class XxadsEmpRepCatEOImpl extends EntityImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    protected enum AttributesEnum {
        ReplacementId,
        EmpCategoryId,
        ReplacementCategoryId,
        ActiveFlag,
        CreationDate,
        CreatedBy,
        LastUpdateDate,
        LastUpdatedBy,
        ObjectVersionNumber,
        BuId,
        XxadsEmpCatEO;
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


    public static final int REPLACEMENTID = AttributesEnum.ReplacementId.index();
    public static final int EMPCATEGORYID = AttributesEnum.EmpCategoryId.index();
    public static final int REPLACEMENTCATEGORYID = AttributesEnum.ReplacementCategoryId.index();
    public static final int ACTIVEFLAG = AttributesEnum.ActiveFlag.index();
    public static final int CREATIONDATE = AttributesEnum.CreationDate.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int LASTUPDATEDATE = AttributesEnum.LastUpdateDate.index();
    public static final int LASTUPDATEDBY = AttributesEnum.LastUpdatedBy.index();
    public static final int OBJECTVERSIONNUMBER = AttributesEnum.ObjectVersionNumber.index();
    public static final int BUID = AttributesEnum.BuId.index();
    public static final int XXADSEMPCATEO = AttributesEnum.XxadsEmpCatEO.index();

    /**
     * This is the default constructor (do not remove).
     */
    public XxadsEmpRepCatEOImpl() {
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("model.entity.XxadsEmpRepCatEO");
    }


    protected void create(AttributeList attributeList) {
        super.create(attributeList);
        SequenceImpl seq = new SequenceImpl("xxads_emp_replace_category_s",getDBTransaction());
        setReplacementId(seq.getSequenceNumber());
    }
    
    private static final byte USERNAME_HISTORY_TYPE =13;
    
    @Override
    protected Object getHistoryContextForAttribute(AttributeDefImpl attr) {
    if (attr.getHistoryKind() == USERNAME_HISTORY_TYPE) {
       // Custom History type logic goes here
      return (String) ((Map)ADFContext.getCurrent().getSessionScope().get("userMap")).get("UserName");
    }
    return super.getHistoryContextForAttribute(attr);
    }


    /**
     * Gets the attribute value for ReplacementId, using the alias name ReplacementId.
     * @return the value of ReplacementId
     */
    public Number getReplacementId() {
        return (Number) getAttributeInternal(REPLACEMENTID);
    }

    /**
     * Sets <code>value</code> as the attribute value for ReplacementId.
     * @param value value to set the ReplacementId
     */
    public void setReplacementId(Number value) {
        setAttributeInternal(REPLACEMENTID, value);
    }

    /**
     * Gets the attribute value for EmpCategoryId, using the alias name EmpCategoryId.
     * @return the value of EmpCategoryId
     */
    public Number getEmpCategoryId() {
        return (Number) getAttributeInternal(EMPCATEGORYID);
    }

    /**
     * Sets <code>value</code> as the attribute value for EmpCategoryId.
     * @param value value to set the EmpCategoryId
     */
    public void setEmpCategoryId(Number value) {
        setAttributeInternal(EMPCATEGORYID, value);
    }

    /**
     * Gets the attribute value for ReplacementCategoryId, using the alias name ReplacementCategoryId.
     * @return the value of ReplacementCategoryId
     */
    public Number getReplacementCategoryId() {
        return (Number) getAttributeInternal(REPLACEMENTCATEGORYID);
    }

    /**
     * Sets <code>value</code> as the attribute value for ReplacementCategoryId.
     * @param value value to set the ReplacementCategoryId
     */
    public void setReplacementCategoryId(Number value) {
        setAttributeInternal(REPLACEMENTCATEGORYID, value);
    }

    /**
     * Gets the attribute value for ActiveFlag, using the alias name ActiveFlag.
     * @return the value of ActiveFlag
     */
    public String getActiveFlag() {
        return (String) getAttributeInternal(ACTIVEFLAG);
    }

    /**
     * Sets <code>value</code> as the attribute value for ActiveFlag.
     * @param value value to set the ActiveFlag
     */
    public void setActiveFlag(String value) {
        setAttributeInternal(ACTIVEFLAG, value);
    }

    /**
     * Gets the attribute value for CreationDate, using the alias name CreationDate.
     * @return the value of CreationDate
     */
    public Date getCreationDate() {
        return (Date) getAttributeInternal(CREATIONDATE);
    }


    /**
     * Gets the attribute value for CreatedBy, using the alias name CreatedBy.
     * @return the value of CreatedBy
     */
    public String getCreatedBy() {
        return (String) getAttributeInternal(CREATEDBY);
    }


    /**
     * Gets the attribute value for LastUpdateDate, using the alias name LastUpdateDate.
     * @return the value of LastUpdateDate
     */
    public Date getLastUpdateDate() {
        return (Date) getAttributeInternal(LASTUPDATEDATE);
    }


    /**
     * Gets the attribute value for LastUpdatedBy, using the alias name LastUpdatedBy.
     * @return the value of LastUpdatedBy
     */
    public String getLastUpdatedBy() {
        return (String) getAttributeInternal(LASTUPDATEDBY);
    }


    /**
     * Gets the attribute value for ObjectVersionNumber, using the alias name ObjectVersionNumber.
     * @return the value of ObjectVersionNumber
     */
    public Number getObjectVersionNumber() {
        return (Number) getAttributeInternal(OBJECTVERSIONNUMBER);
    }


    /**
     * Gets the attribute value for BuId, using the alias name BuId.
     * @return the value of BuId
     */
    public Number getBuId() {
        return (Number) getAttributeInternal(BUID);
    }

    /**
     * Sets <code>value</code> as the attribute value for BuId.
     * @param value value to set the BuId
     */
    public void setBuId(Number value) {
        setAttributeInternal(BUID, value);
    }

    /**
     * @return the associated entity XxadsEmpCatEOImpl.
     */
    public XxadsEmpCatEOImpl getXxadsEmpCatEO() {
        return (XxadsEmpCatEOImpl) getAttributeInternal(XXADSEMPCATEO);
    }

    /**
     * Sets <code>value</code> as the associated entity XxadsEmpCatEOImpl.
     */
    public void setXxadsEmpCatEO(XxadsEmpCatEOImpl value) {
        setAttributeInternal(XXADSEMPCATEO, value);
    }

    /**
     * @param replacementId key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(Number replacementId) {
        return new Key(new Object[] { replacementId });
    }


}

