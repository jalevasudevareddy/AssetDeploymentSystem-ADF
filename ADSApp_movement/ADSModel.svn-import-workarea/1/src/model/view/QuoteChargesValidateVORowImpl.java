package model.view;

import model.entity.XxadsRentalQuoteChargesEOImpl;

import oracle.jbo.domain.Date;
import oracle.jbo.domain.Number;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Mon Nov 21 13:24:19 IST 2022
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class QuoteChargesValidateVORowImpl extends ViewRowImpl {
    public static final int ENTITY_XXADSRENTALQUOTECHARGESEO = 0;

    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    protected enum AttributesEnum {
        ActiveFlag,
        Amount,
        AssetCategoryId,
        Billing,
        ChargeType,
        CreatedBy,
        CreationDate,
        LastUpdateDate,
        LastUpdatedBy,
        MasterQuotationId,
        MasterQuoteChargeId,
        ObjectVersionNumber,
        ParentQuotationId,
        ParentQuoteChargeId,
        QuotationId,
        QuoteChargeId,
        RentalType;
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
    public static final int AMOUNT = AttributesEnum.Amount.index();
    public static final int ASSETCATEGORYID = AttributesEnum.AssetCategoryId.index();
    public static final int BILLING = AttributesEnum.Billing.index();
    public static final int CHARGETYPE = AttributesEnum.ChargeType.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int CREATIONDATE = AttributesEnum.CreationDate.index();
    public static final int LASTUPDATEDATE = AttributesEnum.LastUpdateDate.index();
    public static final int LASTUPDATEDBY = AttributesEnum.LastUpdatedBy.index();
    public static final int MASTERQUOTATIONID = AttributesEnum.MasterQuotationId.index();
    public static final int MASTERQUOTECHARGEID = AttributesEnum.MasterQuoteChargeId.index();
    public static final int OBJECTVERSIONNUMBER = AttributesEnum.ObjectVersionNumber.index();
    public static final int PARENTQUOTATIONID = AttributesEnum.ParentQuotationId.index();
    public static final int PARENTQUOTECHARGEID = AttributesEnum.ParentQuoteChargeId.index();
    public static final int QUOTATIONID = AttributesEnum.QuotationId.index();
    public static final int QUOTECHARGEID = AttributesEnum.QuoteChargeId.index();
    public static final int RENTALTYPE = AttributesEnum.RentalType.index();

    /**
     * This is the default constructor (do not remove).
     */
    public QuoteChargesValidateVORowImpl() {
    }

    /**
     * Gets XxadsRentalQuoteChargesEO entity object.
     * @return the XxadsRentalQuoteChargesEO
     */
    public XxadsRentalQuoteChargesEOImpl getXxadsRentalQuoteChargesEO() {
        return (XxadsRentalQuoteChargesEOImpl) getEntity(ENTITY_XXADSRENTALQUOTECHARGESEO);
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
     * Gets the attribute value for AMOUNT using the alias name Amount.
     * @return the AMOUNT
     */
    public Number getAmount() {
        return (Number) getAttributeInternal(AMOUNT);
    }

    /**
     * Sets <code>value</code> as attribute value for AMOUNT using the alias name Amount.
     * @param value value to set the AMOUNT
     */
    public void setAmount(Number value) {
        setAttributeInternal(AMOUNT, value);
    }

    /**
     * Gets the attribute value for ASSET_CATEGORY_ID using the alias name AssetCategoryId.
     * @return the ASSET_CATEGORY_ID
     */
    public Number getAssetCategoryId() {
        return (Number) getAttributeInternal(ASSETCATEGORYID);
    }

    /**
     * Sets <code>value</code> as attribute value for ASSET_CATEGORY_ID using the alias name AssetCategoryId.
     * @param value value to set the ASSET_CATEGORY_ID
     */
    public void setAssetCategoryId(Number value) {
        setAttributeInternal(ASSETCATEGORYID, value);
    }

    /**
     * Gets the attribute value for BILLING using the alias name Billing.
     * @return the BILLING
     */
    public String getBilling() {
        return (String) getAttributeInternal(BILLING);
    }

    /**
     * Sets <code>value</code> as attribute value for BILLING using the alias name Billing.
     * @param value value to set the BILLING
     */
    public void setBilling(String value) {
        setAttributeInternal(BILLING, value);
    }

    /**
     * Gets the attribute value for CHARGE_TYPE using the alias name ChargeType.
     * @return the CHARGE_TYPE
     */
    public String getChargeType() {
        return (String) getAttributeInternal(CHARGETYPE);
    }

    /**
     * Sets <code>value</code> as attribute value for CHARGE_TYPE using the alias name ChargeType.
     * @param value value to set the CHARGE_TYPE
     */
    public void setChargeType(String value) {
        setAttributeInternal(CHARGETYPE, value);
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
     * Gets the attribute value for MASTER_QUOTATION_ID using the alias name MasterQuotationId.
     * @return the MASTER_QUOTATION_ID
     */
    public Number getMasterQuotationId() {
        return (Number) getAttributeInternal(MASTERQUOTATIONID);
    }

    /**
     * Sets <code>value</code> as attribute value for MASTER_QUOTATION_ID using the alias name MasterQuotationId.
     * @param value value to set the MASTER_QUOTATION_ID
     */
    public void setMasterQuotationId(Number value) {
        setAttributeInternal(MASTERQUOTATIONID, value);
    }

    /**
     * Gets the attribute value for MASTER_QUOTE_CHARGE_ID using the alias name MasterQuoteChargeId.
     * @return the MASTER_QUOTE_CHARGE_ID
     */
    public Number getMasterQuoteChargeId() {
        return (Number) getAttributeInternal(MASTERQUOTECHARGEID);
    }

    /**
     * Sets <code>value</code> as attribute value for MASTER_QUOTE_CHARGE_ID using the alias name MasterQuoteChargeId.
     * @param value value to set the MASTER_QUOTE_CHARGE_ID
     */
    public void setMasterQuoteChargeId(Number value) {
        setAttributeInternal(MASTERQUOTECHARGEID, value);
    }

    /**
     * Gets the attribute value for OBJECT_VERSION_NUMBER using the alias name ObjectVersionNumber.
     * @return the OBJECT_VERSION_NUMBER
     */
    public Number getObjectVersionNumber() {
        return (Number) getAttributeInternal(OBJECTVERSIONNUMBER);
    }

    /**
     * Gets the attribute value for PARENT_QUOTATION_ID using the alias name ParentQuotationId.
     * @return the PARENT_QUOTATION_ID
     */
    public Number getParentQuotationId() {
        return (Number) getAttributeInternal(PARENTQUOTATIONID);
    }

    /**
     * Sets <code>value</code> as attribute value for PARENT_QUOTATION_ID using the alias name ParentQuotationId.
     * @param value value to set the PARENT_QUOTATION_ID
     */
    public void setParentQuotationId(Number value) {
        setAttributeInternal(PARENTQUOTATIONID, value);
    }

    /**
     * Gets the attribute value for PARENT_QUOTE_CHARGE_ID using the alias name ParentQuoteChargeId.
     * @return the PARENT_QUOTE_CHARGE_ID
     */
    public Number getParentQuoteChargeId() {
        return (Number) getAttributeInternal(PARENTQUOTECHARGEID);
    }

    /**
     * Sets <code>value</code> as attribute value for PARENT_QUOTE_CHARGE_ID using the alias name ParentQuoteChargeId.
     * @param value value to set the PARENT_QUOTE_CHARGE_ID
     */
    public void setParentQuoteChargeId(Number value) {
        setAttributeInternal(PARENTQUOTECHARGEID, value);
    }

    /**
     * Gets the attribute value for QUOTATION_ID using the alias name QuotationId.
     * @return the QUOTATION_ID
     */
    public Number getQuotationId() {
        return (Number) getAttributeInternal(QUOTATIONID);
    }

    /**
     * Sets <code>value</code> as attribute value for QUOTATION_ID using the alias name QuotationId.
     * @param value value to set the QUOTATION_ID
     */
    public void setQuotationId(Number value) {
        setAttributeInternal(QUOTATIONID, value);
    }

    /**
     * Gets the attribute value for QUOTE_CHARGE_ID using the alias name QuoteChargeId.
     * @return the QUOTE_CHARGE_ID
     */
    public Number getQuoteChargeId() {
        return (Number) getAttributeInternal(QUOTECHARGEID);
    }

    /**
     * Sets <code>value</code> as attribute value for QUOTE_CHARGE_ID using the alias name QuoteChargeId.
     * @param value value to set the QUOTE_CHARGE_ID
     */
    public void setQuoteChargeId(Number value) {
        setAttributeInternal(QUOTECHARGEID, value);
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
}

