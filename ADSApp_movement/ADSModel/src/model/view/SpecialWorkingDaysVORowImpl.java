package model.view;

import model.entity.XxadsSpecialWorkingDaysEOImpl;

import oracle.jbo.domain.Date;
import oracle.jbo.domain.Number;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Wed Oct 12 10:44:32 IST 2022
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class SpecialWorkingDaysVORowImpl extends ViewRowImpl {


    public static final int ENTITY_XXADSSPECIALWORKINGDAYSEO = 0;

    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    protected enum AttributesEnum {
        BuId,
        CreatedBy,
        CreationDate,
        LastUpdateDate,
        LastUpdatedBy,
        NoOfHrs,
        ObjectVersionNumber,
        Ot1Hrs,
        Ot2Hrs,
        SpDayId,
        SpEffectiveEndDate,
        SpEffectiveStartDate,
        SpHolidayName,
        TransSpROFlag,
        TransBuName;
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


    public static final int BUID = AttributesEnum.BuId.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int CREATIONDATE = AttributesEnum.CreationDate.index();
    public static final int LASTUPDATEDATE = AttributesEnum.LastUpdateDate.index();
    public static final int LASTUPDATEDBY = AttributesEnum.LastUpdatedBy.index();
    public static final int NOOFHRS = AttributesEnum.NoOfHrs.index();
    public static final int OBJECTVERSIONNUMBER = AttributesEnum.ObjectVersionNumber.index();
    public static final int OT1HRS = AttributesEnum.Ot1Hrs.index();
    public static final int OT2HRS = AttributesEnum.Ot2Hrs.index();
    public static final int SPDAYID = AttributesEnum.SpDayId.index();
    public static final int SPEFFECTIVEENDDATE = AttributesEnum.SpEffectiveEndDate.index();
    public static final int SPEFFECTIVESTARTDATE = AttributesEnum.SpEffectiveStartDate.index();
    public static final int SPHOLIDAYNAME = AttributesEnum.SpHolidayName.index();
    public static final int TRANSSPROFLAG = AttributesEnum.TransSpROFlag.index();
    public static final int TRANSBUNAME = AttributesEnum.TransBuName.index();

    /**
     * This is the default constructor (do not remove).
     */
    public SpecialWorkingDaysVORowImpl() {
    }

    /**
     * Gets XxadsSpecialWorkingDaysEO entity object.
     * @return the XxadsSpecialWorkingDaysEO
     */
    public XxadsSpecialWorkingDaysEOImpl getXxadsSpecialWorkingDaysEO() {
        return (XxadsSpecialWorkingDaysEOImpl) getEntity(ENTITY_XXADSSPECIALWORKINGDAYSEO);
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
     * Gets the attribute value for NO_OF_HRS using the alias name NoOfHrs.
     * @return the NO_OF_HRS
     */
    public Number getNoOfHrs() {
        return (Number) getAttributeInternal(NOOFHRS);
    }

    /**
     * Sets <code>value</code> as attribute value for NO_OF_HRS using the alias name NoOfHrs.
     * @param value value to set the NO_OF_HRS
     */
    public void setNoOfHrs(Number value) {
        setAttributeInternal(NOOFHRS, value);
    }

    /**
     * Gets the attribute value for OBJECT_VERSION_NUMBER using the alias name ObjectVersionNumber.
     * @return the OBJECT_VERSION_NUMBER
     */
    public Number getObjectVersionNumber() {
        return (Number) getAttributeInternal(OBJECTVERSIONNUMBER);
    }

    /**
     * Gets the attribute value for OT1_HRS using the alias name Ot1Hrs.
     * @return the OT1_HRS
     */
    public Number getOt1Hrs() {
        return (Number) getAttributeInternal(OT1HRS);
    }

    /**
     * Sets <code>value</code> as attribute value for OT1_HRS using the alias name Ot1Hrs.
     * @param value value to set the OT1_HRS
     */
    public void setOt1Hrs(Number value) {
        setAttributeInternal(OT1HRS, value);
    }

    /**
     * Gets the attribute value for OT2_HRS using the alias name Ot2Hrs.
     * @return the OT2_HRS
     */
    public Number getOt2Hrs() {
        return (Number) getAttributeInternal(OT2HRS);
    }

    /**
     * Sets <code>value</code> as attribute value for OT2_HRS using the alias name Ot2Hrs.
     * @param value value to set the OT2_HRS
     */
    public void setOt2Hrs(Number value) {
        setAttributeInternal(OT2HRS, value);
    }

    /**
     * Gets the attribute value for SP_DAY_ID using the alias name SpDayId.
     * @return the SP_DAY_ID
     */
    public Number getSpDayId() {
        return (Number) getAttributeInternal(SPDAYID);
    }

    /**
     * Sets <code>value</code> as attribute value for SP_DAY_ID using the alias name SpDayId.
     * @param value value to set the SP_DAY_ID
     */
    public void setSpDayId(Number value) {
        setAttributeInternal(SPDAYID, value);
    }

    /**
     * Gets the attribute value for SP_EFFECTIVE_END_DATE using the alias name SpEffectiveEndDate.
     * @return the SP_EFFECTIVE_END_DATE
     */
    public Date getSpEffectiveEndDate() {
        return (Date) getAttributeInternal(SPEFFECTIVEENDDATE);
    }

    /**
     * Sets <code>value</code> as attribute value for SP_EFFECTIVE_END_DATE using the alias name SpEffectiveEndDate.
     * @param value value to set the SP_EFFECTIVE_END_DATE
     */
    public void setSpEffectiveEndDate(Date value) {
        setAttributeInternal(SPEFFECTIVEENDDATE, value);
    }

    /**
     * Gets the attribute value for SP_EFFECTIVE_START_DATE using the alias name SpEffectiveStartDate.
     * @return the SP_EFFECTIVE_START_DATE
     */
    public Date getSpEffectiveStartDate() {
        return (Date) getAttributeInternal(SPEFFECTIVESTARTDATE);
    }

    /**
     * Sets <code>value</code> as attribute value for SP_EFFECTIVE_START_DATE using the alias name SpEffectiveStartDate.
     * @param value value to set the SP_EFFECTIVE_START_DATE
     */
    public void setSpEffectiveStartDate(Date value) {
        setAttributeInternal(SPEFFECTIVESTARTDATE, value);
    }

    /**
     * Gets the attribute value for SP_HOLIDAY_NAME using the alias name SpHolidayName.
     * @return the SP_HOLIDAY_NAME
     */
    public String getSpHolidayName() {
        return (String) getAttributeInternal(SPHOLIDAYNAME);
    }

    /**
     * Sets <code>value</code> as attribute value for SP_HOLIDAY_NAME using the alias name SpHolidayName.
     * @param value value to set the SP_HOLIDAY_NAME
     */
    public void setSpHolidayName(String value) {
        setAttributeInternal(SPHOLIDAYNAME, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TransSpROFlag.
     * @return the TransSpROFlag
     */
    public String getTransSpROFlag() {
        return (String) getAttributeInternal(TRANSSPROFLAG);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransSpROFlag.
     * @param value value to set the  TransSpROFlag
     */
    public void setTransSpROFlag(String value) {
        setAttributeInternal(TRANSSPROFLAG, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TransBuName.
     * @return the TransBuName
     */
    public String getTransBuName() {
        return (String) getAttributeInternal(TRANSBUNAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransBuName.
     * @param value value to set the  TransBuName
     */
    public void setTransBuName(String value) {
        setAttributeInternal(TRANSBUNAME, value);
    }
}

