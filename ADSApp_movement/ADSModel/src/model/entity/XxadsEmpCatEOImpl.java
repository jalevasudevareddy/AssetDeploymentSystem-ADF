package model.entity;

import java.math.BigDecimal;

import java.sql.Timestamp;

import java.util.Map;

import oracle.adf.share.ADFContext;

import oracle.jbo.AttributeList;
import oracle.jbo.Key;
import oracle.jbo.RowIterator;
import oracle.jbo.domain.Date;
import oracle.jbo.domain.Number;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.SequenceImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Tue Oct 18 14:52:08 IST 2022
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class XxadsEmpCatEOImpl extends EntityImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    protected enum AttributesEnum {
        EmpCategoryId,
        BuId,
        EmpCategoryCode,
        Description,
        ActiveFlag,
        CreationDate,
        CreatedBy,
        LastUpdateDate,
        LastUpdatedBy,
        ObjectVersionNumber,
        StandardHours,
        Ot1Hours,
        Ot2Hours,
        XxadsEmpRepCatEO,
        XxadsEmpAsstCatMapEO;
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


    public static final int EMPCATEGORYID = AttributesEnum.EmpCategoryId.index();
    public static final int BUID = AttributesEnum.BuId.index();
    public static final int EMPCATEGORYCODE = AttributesEnum.EmpCategoryCode.index();
    public static final int DESCRIPTION = AttributesEnum.Description.index();
    public static final int ACTIVEFLAG = AttributesEnum.ActiveFlag.index();
    public static final int CREATIONDATE = AttributesEnum.CreationDate.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int LASTUPDATEDATE = AttributesEnum.LastUpdateDate.index();
    public static final int LASTUPDATEDBY = AttributesEnum.LastUpdatedBy.index();
    public static final int OBJECTVERSIONNUMBER = AttributesEnum.ObjectVersionNumber.index();
    public static final int STANDARDHOURS = AttributesEnum.StandardHours.index();
    public static final int OT1HOURS = AttributesEnum.Ot1Hours.index();
    public static final int OT2HOURS = AttributesEnum.Ot2Hours.index();
    public static final int XXADSEMPREPCATEO = AttributesEnum.XxadsEmpRepCatEO.index();
    public static final int XXADSEMPASSTCATMAPEO = AttributesEnum.XxadsEmpAsstCatMapEO.index();

    /**
     * This is the default constructor (do not remove).
     */
    public XxadsEmpCatEOImpl() {
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("model.entity.XxadsEmpCatEO");
    }


    protected void create(AttributeList attributeList) {
        super.create(attributeList);
        SequenceImpl seq = new SequenceImpl("xxads_emp_category_s",getDBTransaction());
        setEmpCategoryId(seq.getSequenceNumber());
    //        setAttachmentCode("PROBATION CONFIRMATION");
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
     * Gets the attribute value for EmpCategoryCode, using the alias name EmpCategoryCode.
     * @return the value of EmpCategoryCode
     */
    public String getEmpCategoryCode() {
        return (String) getAttributeInternal(EMPCATEGORYCODE);
    }

    /**
     * Sets <code>value</code> as the attribute value for EmpCategoryCode.
     * @param value value to set the EmpCategoryCode
     */
    public void setEmpCategoryCode(String value) {
        setAttributeInternal(EMPCATEGORYCODE, value);
    }

    /**
     * Gets the attribute value for Description, using the alias name Description.
     * @return the value of Description
     */
    public String getDescription() {
        return (String) getAttributeInternal(DESCRIPTION);
    }

    /**
     * Sets <code>value</code> as the attribute value for Description.
     * @param value value to set the Description
     */
    public void setDescription(String value) {
        setAttributeInternal(DESCRIPTION, value);
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
     * Gets the attribute value for StandardHours, using the alias name StandardHours.
     * @return the value of StandardHours
     */
    public Number getStandardHours() {
        return (Number) getAttributeInternal(STANDARDHOURS);
    }

    /**
     * Sets <code>value</code> as the attribute value for StandardHours.
     * @param value value to set the StandardHours
     */
    public void setStandardHours(Number value) {
        setAttributeInternal(STANDARDHOURS, value);
    }

    /**
     * Gets the attribute value for Ot1Hours, using the alias name Ot1Hours.
     * @return the value of Ot1Hours
     */
    public Number getOt1Hours() {
        return (Number) getAttributeInternal(OT1HOURS);
    }

    /**
     * Sets <code>value</code> as the attribute value for Ot1Hours.
     * @param value value to set the Ot1Hours
     */
    public void setOt1Hours(Number value) {
        setAttributeInternal(OT1HOURS, value);
    }

    /**
     * Gets the attribute value for Ot2Hours, using the alias name Ot2Hours.
     * @return the value of Ot2Hours
     */
    public Number getOt2Hours() {
        return (Number) getAttributeInternal(OT2HOURS);
    }

    /**
     * Sets <code>value</code> as the attribute value for Ot2Hours.
     * @param value value to set the Ot2Hours
     */
    public void setOt2Hours(Number value) {
        setAttributeInternal(OT2HOURS, value);
    }

    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getXxadsEmpRepCatEO() {
        return (RowIterator) getAttributeInternal(XXADSEMPREPCATEO);
    }

    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getXxadsEmpAsstCatMapEO() {
        return (RowIterator) getAttributeInternal(XXADSEMPASSTCATMAPEO);
    }

    /**
     * @param empCategoryId key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(Number empCategoryId) {
        return new Key(new Object[] { empCategoryId });
    }


}

