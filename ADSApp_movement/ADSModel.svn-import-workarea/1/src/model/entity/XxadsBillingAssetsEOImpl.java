package model.entity;

import java.math.BigDecimal;

import java.sql.Timestamp;

import java.util.Map;

import oracle.adf.share.ADFContext;

import oracle.jbo.AttributeList;
import oracle.jbo.Key;
import oracle.jbo.domain.Date;
import oracle.jbo.domain.NClobDomain;
import oracle.jbo.domain.Number;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.SequenceImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Mon Jan 30 19:15:13 IST 2023
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class XxadsBillingAssetsEOImpl extends EntityImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    protected enum AttributesEnum {
        AssetLineId,
        HeaderId,
        TsLineId,
        RentalType,
        AssetId,
        AssetStdHours,
        AssetOt1Hours,
        AssetOt2Hours,
        AssetStandardRate,
        AssetOt1Rate,
        AssetOt2Rate,
        AssetGrossAmt,
        AssetDiscountAmt,
        CreationDate,
        CreatedBy,
        LastUpdateDate,
        LastUpdatedBy,
        ObjectVersionNumber,
        NoOfTrips,
        TaxRateCode,
        VatTaxAmount,
        TaxRateId,
        TaxRatePercent,
        XxadsBillingHdrEO;
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


    public static final int ASSETLINEID = AttributesEnum.AssetLineId.index();
    public static final int HEADERID = AttributesEnum.HeaderId.index();
    public static final int TSLINEID = AttributesEnum.TsLineId.index();
    public static final int RENTALTYPE = AttributesEnum.RentalType.index();
    public static final int ASSETID = AttributesEnum.AssetId.index();
    public static final int ASSETSTDHOURS = AttributesEnum.AssetStdHours.index();
    public static final int ASSETOT1HOURS = AttributesEnum.AssetOt1Hours.index();
    public static final int ASSETOT2HOURS = AttributesEnum.AssetOt2Hours.index();
    public static final int ASSETSTANDARDRATE = AttributesEnum.AssetStandardRate.index();
    public static final int ASSETOT1RATE = AttributesEnum.AssetOt1Rate.index();
    public static final int ASSETOT2RATE = AttributesEnum.AssetOt2Rate.index();
    public static final int ASSETGROSSAMT = AttributesEnum.AssetGrossAmt.index();
    public static final int ASSETDISCOUNTAMT = AttributesEnum.AssetDiscountAmt.index();
    public static final int CREATIONDATE = AttributesEnum.CreationDate.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int LASTUPDATEDATE = AttributesEnum.LastUpdateDate.index();
    public static final int LASTUPDATEDBY = AttributesEnum.LastUpdatedBy.index();
    public static final int OBJECTVERSIONNUMBER = AttributesEnum.ObjectVersionNumber.index();
    public static final int NOOFTRIPS = AttributesEnum.NoOfTrips.index();
    public static final int TAXRATECODE = AttributesEnum.TaxRateCode.index();
    public static final int VATTAXAMOUNT = AttributesEnum.VatTaxAmount.index();
    public static final int TAXRATEID = AttributesEnum.TaxRateId.index();
    public static final int TAXRATEPERCENT = AttributesEnum.TaxRatePercent.index();
    public static final int XXADSBILLINGHDREO = AttributesEnum.XxadsBillingHdrEO.index();

    /**
     * This is the default constructor (do not remove).
     */
    public XxadsBillingAssetsEOImpl() {
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("model.entity.XxadsBillingAssetsEO");
    }


    /**
     * Gets the attribute value for AssetLineId, using the alias name AssetLineId.
     * @return the value of AssetLineId
     */
    public oracle.jbo.domain.Number getAssetLineId() {
        return (oracle.jbo.domain.Number) getAttributeInternal(ASSETLINEID);
    }

    /**
     * Sets <code>value</code> as the attribute value for AssetLineId.
     * @param value value to set the AssetLineId
     */
    public void setAssetLineId(oracle.jbo.domain.Number value) {
        setAttributeInternal(ASSETLINEID, value);
    }

    /**
     * Gets the attribute value for HeaderId, using the alias name HeaderId.
     * @return the value of HeaderId
     */
    public Number getHeaderId() {
        return (Number) getAttributeInternal(HEADERID);
    }

    /**
     * Sets <code>value</code> as the attribute value for HeaderId.
     * @param value value to set the HeaderId
     */
    public void setHeaderId(Number value) {
        setAttributeInternal(HEADERID, value);
    }

    /**
     * Gets the attribute value for TsLineId, using the alias name TsLineId.
     * @return the value of TsLineId
     */
    public Number getTsLineId() {
        return (Number) getAttributeInternal(TSLINEID);
    }

    /**
     * Sets <code>value</code> as the attribute value for TsLineId.
     * @param value value to set the TsLineId
     */
    public void setTsLineId(Number value) {
        setAttributeInternal(TSLINEID, value);
    }

    /**
     * Gets the attribute value for RentalType, using the alias name RentalType.
     * @return the value of RentalType
     */
    public String getRentalType() {
        return (String) getAttributeInternal(RENTALTYPE);
    }

    /**
     * Sets <code>value</code> as the attribute value for RentalType.
     * @param value value to set the RentalType
     */
    public void setRentalType(String value) {
        setAttributeInternal(RENTALTYPE, value);
    }


    /**
     * Gets the attribute value for AssetId, using the alias name AssetId.
     * @return the value of AssetId
     */
    public Number getAssetId() {
        return (Number) getAttributeInternal(ASSETID);
    }

    /**
     * Sets <code>value</code> as the attribute value for AssetId.
     * @param value value to set the AssetId
     */
    public void setAssetId(Number value) {
        setAttributeInternal(ASSETID, value);
    }

    /**
     * Gets the attribute value for AssetStdHours, using the alias name AssetStdHours.
     * @return the value of AssetStdHours
     */
    public Number getAssetStdHours() {
        return (Number) getAttributeInternal(ASSETSTDHOURS);
    }

    /**
     * Sets <code>value</code> as the attribute value for AssetStdHours.
     * @param value value to set the AssetStdHours
     */
    public void setAssetStdHours(Number value) {
        setAttributeInternal(ASSETSTDHOURS, value);
    }

    /**
     * Gets the attribute value for AssetOt1Hours, using the alias name AssetOt1Hours.
     * @return the value of AssetOt1Hours
     */
    public Number getAssetOt1Hours() {
        return (Number) getAttributeInternal(ASSETOT1HOURS);
    }

    /**
     * Sets <code>value</code> as the attribute value for AssetOt1Hours.
     * @param value value to set the AssetOt1Hours
     */
    public void setAssetOt1Hours(Number value) {
        setAttributeInternal(ASSETOT1HOURS, value);
    }

    /**
     * Gets the attribute value for AssetOt2Hours, using the alias name AssetOt2Hours.
     * @return the value of AssetOt2Hours
     */
    public Number getAssetOt2Hours() {
        return (Number) getAttributeInternal(ASSETOT2HOURS);
    }

    /**
     * Sets <code>value</code> as the attribute value for AssetOt2Hours.
     * @param value value to set the AssetOt2Hours
     */
    public void setAssetOt2Hours(Number value) {
        setAttributeInternal(ASSETOT2HOURS, value);
    }

    /**
     * Gets the attribute value for AssetStandardRate, using the alias name AssetStandardRate.
     * @return the value of AssetStandardRate
     */
    public Number getAssetStandardRate() {
        return (Number) getAttributeInternal(ASSETSTANDARDRATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for AssetStandardRate.
     * @param value value to set the AssetStandardRate
     */
    public void setAssetStandardRate(Number value) {
        setAttributeInternal(ASSETSTANDARDRATE, value);
    }

    /**
     * Gets the attribute value for AssetOt1Rate, using the alias name AssetOt1Rate.
     * @return the value of AssetOt1Rate
     */
    public Number getAssetOt1Rate() {
        return (Number) getAttributeInternal(ASSETOT1RATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for AssetOt1Rate.
     * @param value value to set the AssetOt1Rate
     */
    public void setAssetOt1Rate(Number value) {
        setAttributeInternal(ASSETOT1RATE, value);
    }

    /**
     * Gets the attribute value for AssetOt2Rate, using the alias name AssetOt2Rate.
     * @return the value of AssetOt2Rate
     */
    public Number getAssetOt2Rate() {
        return (Number) getAttributeInternal(ASSETOT2RATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for AssetOt2Rate.
     * @param value value to set the AssetOt2Rate
     */
    public void setAssetOt2Rate(Number value) {
        setAttributeInternal(ASSETOT2RATE, value);
    }

    /**
     * Gets the attribute value for AssetGrossAmt, using the alias name AssetGrossAmt.
     * @return the value of AssetGrossAmt
     */
    public Number getAssetGrossAmt() {
        return (Number) getAttributeInternal(ASSETGROSSAMT);
    }

    /**
     * Sets <code>value</code> as the attribute value for AssetGrossAmt.
     * @param value value to set the AssetGrossAmt
     */
    public void setAssetGrossAmt(Number value) {
        setAttributeInternal(ASSETGROSSAMT, value);
    }

    /**
     * Gets the attribute value for AssetDiscountAmt, using the alias name AssetDiscountAmt.
     * @return the value of AssetDiscountAmt
     */
    public Number getAssetDiscountAmt() {
        return (Number) getAttributeInternal(ASSETDISCOUNTAMT);
    }

    /**
     * Sets <code>value</code> as the attribute value for AssetDiscountAmt.
     * @param value value to set the AssetDiscountAmt
     */
    public void setAssetDiscountAmt(Number value) {
        setAttributeInternal(ASSETDISCOUNTAMT, value);
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
     * Gets the attribute value for NoOfTrips, using the alias name NoOfTrips.
     * @return the value of NoOfTrips
     */
    public Number getNoOfTrips() {
        return (Number) getAttributeInternal(NOOFTRIPS);
    }

    /**
     * Sets <code>value</code> as the attribute value for NoOfTrips.
     * @param value value to set the NoOfTrips
     */
    public void setNoOfTrips(Number value) {
        setAttributeInternal(NOOFTRIPS, value);
    }

    /**
     * Gets the attribute value for TaxRateCode, using the alias name TaxRateCode.
     * @return the value of TaxRateCode
     */
    public String getTaxRateCode() {
        return (String) getAttributeInternal(TAXRATECODE);
    }

    /**
     * Sets <code>value</code> as the attribute value for TaxRateCode.
     * @param value value to set the TaxRateCode
     */
    public void setTaxRateCode(String value) {
        setAttributeInternal(TAXRATECODE, value);
    }

    /**
     * Gets the attribute value for VatTaxAmount, using the alias name VatTaxAmount.
     * @return the value of VatTaxAmount
     */
    public Number getVatTaxAmount() {
        return (Number) getAttributeInternal(VATTAXAMOUNT);
    }

    /**
     * Sets <code>value</code> as the attribute value for VatTaxAmount.
     * @param value value to set the VatTaxAmount
     */
    public void setVatTaxAmount(Number value) {
        setAttributeInternal(VATTAXAMOUNT, value);
    }

    /**
     * Gets the attribute value for TaxRateId, using the alias name TaxRateId.
     * @return the value of TaxRateId
     */
    public Number getTaxRateId() {
        return (Number) getAttributeInternal(TAXRATEID);
    }

    /**
     * Sets <code>value</code> as the attribute value for TaxRateId.
     * @param value value to set the TaxRateId
     */
    public void setTaxRateId(Number value) {
        setAttributeInternal(TAXRATEID, value);
    }

    /**
     * Gets the attribute value for TaxRatePercent, using the alias name TaxRatePercent.
     * @return the value of TaxRatePercent
     */
    public Number getTaxRatePercent() {
        return (Number) getAttributeInternal(TAXRATEPERCENT);
    }

    /**
     * Sets <code>value</code> as the attribute value for TaxRatePercent.
     * @param value value to set the TaxRatePercent
     */
    public void setTaxRatePercent(Number value) {
        setAttributeInternal(TAXRATEPERCENT, value);
    }

    /**
     * @return the associated entity XxadsBillingHdrEOImpl.
     */
    public XxadsBillingHdrEOImpl getXxadsBillingHdrEO() {
        return (XxadsBillingHdrEOImpl) getAttributeInternal(XXADSBILLINGHDREO);
    }

    /**
     * Sets <code>value</code> as the associated entity XxadsBillingHdrEOImpl.
     */
    public void setXxadsBillingHdrEO(XxadsBillingHdrEOImpl value) {
        setAttributeInternal(XXADSBILLINGHDREO, value);
    }


    /**
     * @param assetLineId key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(Number assetLineId) {
        return new Key(new Object[] { assetLineId });
    }

    /**
     * Add attribute defaulting logic in this method.
     * @param attributeList list of attribute names/values to initialize the row
     */
    protected void create(AttributeList attributeList) {
        super.create(attributeList);
        SequenceImpl seq = new SequenceImpl("XXADS_BILLING_ASSETS_S",getDBTransaction());
        setAssetLineId(seq.getSequenceNumber());
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
}
