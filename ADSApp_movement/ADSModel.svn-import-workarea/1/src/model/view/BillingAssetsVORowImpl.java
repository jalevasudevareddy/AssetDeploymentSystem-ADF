package model.view;

import java.math.BigDecimal;

import model.entity.XxadsBillingAssetsEOImpl;

import oracle.jbo.RowSet;
import oracle.jbo.domain.Date;
import oracle.jbo.domain.Number;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Tue Jan 31 10:05:33 IST 2023
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class BillingAssetsVORowImpl extends ViewRowImpl {


    public static final int ENTITY_XXADSBILLINGASSETSEO = 0;

    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    protected enum AttributesEnum {
        AssetDiscountAmt,
        AssetGrossAmt,
        AssetId,
        AssetLineId,
        AssetOt1Hours,
        AssetOt1Rate,
        AssetOt2Hours,
        AssetOt2Rate,
        AssetStandardRate,
        AssetStdHours,
        CreatedBy,
        CreationDate,
        HeaderId,
        LastUpdateDate,
        LastUpdatedBy,
        ObjectVersionNumber,
        RentalType,
        TsLineId,
        TransRenatlType,
        TransAssetType,
        TransAssetNumber,
        TransAssetDesc,
        TransPlateNumber,
        TransHiringBasis,
        TransNetAmount,
        NoOfTrips,
        TaxRateId,
        TaxRateCode,
        TaxRatePercent,
        VatTaxAmount,
        TaxCodesLOV1;
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


    public static final int ASSETDISCOUNTAMT = AttributesEnum.AssetDiscountAmt.index();
    public static final int ASSETGROSSAMT = AttributesEnum.AssetGrossAmt.index();
    public static final int ASSETID = AttributesEnum.AssetId.index();
    public static final int ASSETLINEID = AttributesEnum.AssetLineId.index();
    public static final int ASSETOT1HOURS = AttributesEnum.AssetOt1Hours.index();
    public static final int ASSETOT1RATE = AttributesEnum.AssetOt1Rate.index();
    public static final int ASSETOT2HOURS = AttributesEnum.AssetOt2Hours.index();
    public static final int ASSETOT2RATE = AttributesEnum.AssetOt2Rate.index();
    public static final int ASSETSTANDARDRATE = AttributesEnum.AssetStandardRate.index();
    public static final int ASSETSTDHOURS = AttributesEnum.AssetStdHours.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int CREATIONDATE = AttributesEnum.CreationDate.index();
    public static final int HEADERID = AttributesEnum.HeaderId.index();
    public static final int LASTUPDATEDATE = AttributesEnum.LastUpdateDate.index();
    public static final int LASTUPDATEDBY = AttributesEnum.LastUpdatedBy.index();
    public static final int OBJECTVERSIONNUMBER = AttributesEnum.ObjectVersionNumber.index();
    public static final int RENTALTYPE = AttributesEnum.RentalType.index();
    public static final int TSLINEID = AttributesEnum.TsLineId.index();
    public static final int TRANSRENATLTYPE = AttributesEnum.TransRenatlType.index();
    public static final int TRANSASSETTYPE = AttributesEnum.TransAssetType.index();
    public static final int TRANSASSETNUMBER = AttributesEnum.TransAssetNumber.index();
    public static final int TRANSASSETDESC = AttributesEnum.TransAssetDesc.index();
    public static final int TRANSPLATENUMBER = AttributesEnum.TransPlateNumber.index();
    public static final int TRANSHIRINGBASIS = AttributesEnum.TransHiringBasis.index();
    public static final int TRANSNETAMOUNT = AttributesEnum.TransNetAmount.index();
    public static final int NOOFTRIPS = AttributesEnum.NoOfTrips.index();
    public static final int TAXRATEID = AttributesEnum.TaxRateId.index();
    public static final int TAXRATECODE = AttributesEnum.TaxRateCode.index();
    public static final int TAXRATEPERCENT = AttributesEnum.TaxRatePercent.index();
    public static final int VATTAXAMOUNT = AttributesEnum.VatTaxAmount.index();
    public static final int TAXCODESLOV1 = AttributesEnum.TaxCodesLOV1.index();

    /**
     * This is the default constructor (do not remove).
     */
    public BillingAssetsVORowImpl() {
    }

    /**
     * Gets XxadsBillingAssetsEO entity object.
     * @return the XxadsBillingAssetsEO
     */
    public XxadsBillingAssetsEOImpl getXxadsBillingAssetsEO() {
        return (XxadsBillingAssetsEOImpl) getEntity(ENTITY_XXADSBILLINGASSETSEO);
    }

    /**
     * Gets the attribute value for ASSET_DISCOUNT_AMT using the alias name AssetDiscountAmt.
     * @return the ASSET_DISCOUNT_AMT
     */
    public Number getAssetDiscountAmt() {
        return (Number) getAttributeInternal(ASSETDISCOUNTAMT);
    }

    /**
     * Sets <code>value</code> as attribute value for ASSET_DISCOUNT_AMT using the alias name AssetDiscountAmt.
     * @param value value to set the ASSET_DISCOUNT_AMT
     */
    public void setAssetDiscountAmt(Number value) {
        setAttributeInternal(ASSETDISCOUNTAMT, value);
    }

    /**
     * Gets the attribute value for ASSET_GROSS_AMT using the alias name AssetGrossAmt.
     * @return the ASSET_GROSS_AMT
     */
    public Number getAssetGrossAmt() {
        return (Number) getAttributeInternal(ASSETGROSSAMT);
    }

    /**
     * Sets <code>value</code> as attribute value for ASSET_GROSS_AMT using the alias name AssetGrossAmt.
     * @param value value to set the ASSET_GROSS_AMT
     */
    public void setAssetGrossAmt(Number value) {
        setAttributeInternal(ASSETGROSSAMT, value);
        setVatTaxAmount(new oracle.jbo.domain.Number(0));
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
     * Gets the attribute value for ASSET_LINE_ID using the alias name AssetLineId.
     * @return the ASSET_LINE_ID
     */
    public Number getAssetLineId() {
        return (Number) getAttributeInternal(ASSETLINEID);
    }

    /**
     * Sets <code>value</code> as attribute value for ASSET_LINE_ID using the alias name AssetLineId.
     * @param value value to set the ASSET_LINE_ID
     */
    public void setAssetLineId(Number value) {
        setAttributeInternal(ASSETLINEID, value);
    }

    /**
     * Gets the attribute value for ASSET_OT1_HOURS using the alias name AssetOt1Hours.
     * @return the ASSET_OT1_HOURS
     */
    public Number getAssetOt1Hours() {
        return (Number) getAttributeInternal(ASSETOT1HOURS);
    }

    /**
     * Sets <code>value</code> as attribute value for ASSET_OT1_HOURS using the alias name AssetOt1Hours.
     * @param value value to set the ASSET_OT1_HOURS
     */
    public void setAssetOt1Hours(Number value) {
        setAttributeInternal(ASSETOT1HOURS, value);
    }

    /**
     * Gets the attribute value for ASSET_OT1_RATE using the alias name AssetOt1Rate.
     * @return the ASSET_OT1_RATE
     */
    public Number getAssetOt1Rate() {
        return (Number) getAttributeInternal(ASSETOT1RATE);
    }

    /**
     * Sets <code>value</code> as attribute value for ASSET_OT1_RATE using the alias name AssetOt1Rate.
     * @param value value to set the ASSET_OT1_RATE
     */
    public void setAssetOt1Rate(Number value) {
        setAttributeInternal(ASSETOT1RATE, value);
    }

    /**
     * Gets the attribute value for ASSET_OT2_HOURS using the alias name AssetOt2Hours.
     * @return the ASSET_OT2_HOURS
     */
    public Number getAssetOt2Hours() {
        return (Number) getAttributeInternal(ASSETOT2HOURS);
    }

    /**
     * Sets <code>value</code> as attribute value for ASSET_OT2_HOURS using the alias name AssetOt2Hours.
     * @param value value to set the ASSET_OT2_HOURS
     */
    public void setAssetOt2Hours(Number value) {
        setAttributeInternal(ASSETOT2HOURS, value);
    }

    /**
     * Gets the attribute value for ASSET_OT2_RATE using the alias name AssetOt2Rate.
     * @return the ASSET_OT2_RATE
     */
    public Number getAssetOt2Rate() {
        return (Number) getAttributeInternal(ASSETOT2RATE);
    }

    /**
     * Sets <code>value</code> as attribute value for ASSET_OT2_RATE using the alias name AssetOt2Rate.
     * @param value value to set the ASSET_OT2_RATE
     */
    public void setAssetOt2Rate(Number value) {
        setAttributeInternal(ASSETOT2RATE, value);
    }

    /**
     * Gets the attribute value for ASSET_STANDARD_RATE using the alias name AssetStandardRate.
     * @return the ASSET_STANDARD_RATE
     */
    public Number getAssetStandardRate() {
        return (Number) getAttributeInternal(ASSETSTANDARDRATE);
    }

    /**
     * Sets <code>value</code> as attribute value for ASSET_STANDARD_RATE using the alias name AssetStandardRate.
     * @param value value to set the ASSET_STANDARD_RATE
     */
    public void setAssetStandardRate(Number value) {
        setAttributeInternal(ASSETSTANDARDRATE, value);
    }

    /**
     * Gets the attribute value for ASSET_STD_HOURS using the alias name AssetStdHours.
     * @return the ASSET_STD_HOURS
     */
    public Number getAssetStdHours() {
        return (Number) getAttributeInternal(ASSETSTDHOURS);
    }

    /**
     * Sets <code>value</code> as attribute value for ASSET_STD_HOURS using the alias name AssetStdHours.
     * @param value value to set the ASSET_STD_HOURS
     */
    public void setAssetStdHours(Number value) {
        setAttributeInternal(ASSETSTDHOURS, value);
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
     * Gets the attribute value for HEADER_ID using the alias name HeaderId.
     * @return the HEADER_ID
     */
    public Number getHeaderId() {
        return (Number) getAttributeInternal(HEADERID);
    }

    /**
     * Sets <code>value</code> as attribute value for HEADER_ID using the alias name HeaderId.
     * @param value value to set the HEADER_ID
     */
    public void setHeaderId(Number value) {
        setAttributeInternal(HEADERID, value);
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
     * Gets the attribute value for RENTAL_TYPE using the alias name RentalType.
     * @return the RENTAL_TYPE
     */
    public String getRentalType() {
        return (String) getAttributeInternal(RENTALTYPE);
    }

    /**
     * Sets <code>value</code> as attribute value for RENTAL_TYPE using the alias name RentalType.
     * @param value value to set the RENTAL_TYPE
     */
    public void setRentalType(String value) {
        setAttributeInternal(RENTALTYPE, value);
    }

    /**
     * Gets the attribute value for TS_LINE_ID using the alias name TsLineId.
     * @return the TS_LINE_ID
     */
    public Number getTsLineId() {
        return (Number) getAttributeInternal(TSLINEID);
    }

    /**
     * Sets <code>value</code> as attribute value for TS_LINE_ID using the alias name TsLineId.
     * @param value value to set the TS_LINE_ID
     */
    public void setTsLineId(Number value) {
        setAttributeInternal(TSLINEID, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TransRenatlType.
     * @return the TransRenatlType
     */
    public String getTransRenatlType() {
        return (String) getAttributeInternal(TRANSRENATLTYPE);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransRenatlType.
     * @param value value to set the  TransRenatlType
     */
    public void setTransRenatlType(String value) {
        setAttributeInternal(TRANSRENATLTYPE, value);
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
     * Gets the attribute value for the calculated attribute TransPlateNumber.
     * @return the TransPlateNumber
     */
    public String getTransPlateNumber() {
        return (String) getAttributeInternal(TRANSPLATENUMBER);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransPlateNumber.
     * @param value value to set the  TransPlateNumber
     */
    public void setTransPlateNumber(String value) {
        setAttributeInternal(TRANSPLATENUMBER, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TransHiringBasis.
     * @return the TransHiringBasis
     */
    public String getTransHiringBasis() {
        return (String) getAttributeInternal(TRANSHIRINGBASIS);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransHiringBasis.
     * @param value value to set the  TransHiringBasis
     */
    public void setTransHiringBasis(String value) {
        setAttributeInternal(TRANSHIRINGBASIS, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TransNetAmount.
     * @return the TransNetAmount
     */
    public Number getTransNetAmount() {
        return (Number) getAttributeInternal(TRANSNETAMOUNT);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransNetAmount.
     * @param value value to set the  TransNetAmount
     */
    public void setTransNetAmount(Number value) {
        setAttributeInternal(TRANSNETAMOUNT, value);
    }

    /**
     * Gets the attribute value for NO_OF_TRIPS using the alias name NoOfTrips.
     * @return the NO_OF_TRIPS
     */
    public Number getNoOfTrips() {
        return (Number) getAttributeInternal(NOOFTRIPS);
    }

    /**
     * Sets <code>value</code> as attribute value for NO_OF_TRIPS using the alias name NoOfTrips.
     * @param value value to set the NO_OF_TRIPS
     */
    public void setNoOfTrips(Number value) {
        setAttributeInternal(NOOFTRIPS, value);
    }

    /**
     * Gets the attribute value for TAX_RATE_ID using the alias name TaxRateId.
     * @return the TAX_RATE_ID
     */
    public Number getTaxRateId() {
        return (Number) getAttributeInternal(TAXRATEID);
    }

    /**
     * Sets <code>value</code> as attribute value for TAX_RATE_ID using the alias name TaxRateId.
     * @param value value to set the TAX_RATE_ID
     */
    public void setTaxRateId(Number value) {
        setAttributeInternal(TAXRATEID, value);
    }

    /**
     * Gets the attribute value for TAX_RATE_CODE using the alias name TaxRateCode.
     * @return the TAX_RATE_CODE
     */
    public String getTaxRateCode() {
        return (String) getAttributeInternal(TAXRATECODE);
    }

    /**
     * Sets <code>value</code> as attribute value for TAX_RATE_CODE using the alias name TaxRateCode.
     * @param value value to set the TAX_RATE_CODE
     */
    public void setTaxRateCode(String value) {
        setAttributeInternal(TAXRATECODE, value);
    }

    /**
     * Gets the attribute value for TAX_RATE_PERCENT using the alias name TaxRatePercent.
     * @return the TAX_RATE_PERCENT
     */
    public Number getTaxRatePercent() {
        return (Number) getAttributeInternal(TAXRATEPERCENT);
    }

    /**
     * Sets <code>value</code> as attribute value for TAX_RATE_PERCENT using the alias name TaxRatePercent.
     * @param value value to set the TAX_RATE_PERCENT
     */
    public void setTaxRatePercent(Number value) {
        setAttributeInternal(TAXRATEPERCENT, value);
        setVatTaxAmount(new oracle.jbo.domain.Number(0));
    }

    /**
     * Gets the attribute value for VAT_TAX_AMOUNT using the alias name VatTaxAmount.
     * @return the VAT_TAX_AMOUNT
     */
    public Number getVatTaxAmount() {
        return (Number) getAttributeInternal(VATTAXAMOUNT);
    }

    /**
     * Sets <code>value</code> as attribute value for VAT_TAX_AMOUNT using the alias name VatTaxAmount.
     * @param value value to set the VAT_TAX_AMOUNT
     */
    public void setVatTaxAmount(Number value) {
        oracle.jbo.domain.Number zero = new oracle.jbo.domain.Number(0);
        oracle.jbo.domain.Number val = new oracle.jbo.domain.Number((getTaxRatePercent() != null ? getTaxRatePercent(): zero).divide(100)
                                            .multiply(getAssetGrossAmt() != null ? getAssetGrossAmt(): zero));
        setAttributeInternal(VATTAXAMOUNT, val);
    }


    /**
     * Gets the view accessor <code>RowSet</code> TaxCodesLOV1.
     */
    public RowSet getTaxCodesLOV1() {
        return (RowSet) getAttributeInternal(TAXCODESLOV1);
    }
}

