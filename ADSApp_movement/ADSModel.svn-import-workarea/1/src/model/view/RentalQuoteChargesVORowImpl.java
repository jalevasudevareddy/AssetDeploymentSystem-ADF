package model.view;

import model.entity.XxadsRentalQuoteChargesEOImpl;

import oracle.jbo.RowSet;
import oracle.jbo.domain.Date;
import oracle.jbo.domain.Number;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Fri Nov 11 16:47:25 IST 2022
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class RentalQuoteChargesVORowImpl extends ViewRowImpl {


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
        TransAssetCategory,
        TransAssetCategoryDesc,
        TransChargeType,
        TransBilling,
        RentalType,
        TaxRateCode,
        TaxRateId,
        TaxRatePercent,
        VatTaxAmount,
        CategoryDescription,
        Quantity,
        UnitAmount,
        LookupsLOV1,
        LookupsLOV2,
        QuoteCategoriesLovVO1,
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
    public static final int TRANSASSETCATEGORY = AttributesEnum.TransAssetCategory.index();
    public static final int TRANSASSETCATEGORYDESC = AttributesEnum.TransAssetCategoryDesc.index();
    public static final int TRANSCHARGETYPE = AttributesEnum.TransChargeType.index();
    public static final int TRANSBILLING = AttributesEnum.TransBilling.index();
    public static final int RENTALTYPE = AttributesEnum.RentalType.index();
    public static final int TAXRATECODE = AttributesEnum.TaxRateCode.index();
    public static final int TAXRATEID = AttributesEnum.TaxRateId.index();
    public static final int TAXRATEPERCENT = AttributesEnum.TaxRatePercent.index();
    public static final int VATTAXAMOUNT = AttributesEnum.VatTaxAmount.index();
    public static final int CATEGORYDESCRIPTION = AttributesEnum.CategoryDescription.index();
    public static final int QUANTITY = AttributesEnum.Quantity.index();
    public static final int UNITAMOUNT = AttributesEnum.UnitAmount.index();
    public static final int LOOKUPSLOV1 = AttributesEnum.LookupsLOV1.index();
    public static final int LOOKUPSLOV2 = AttributesEnum.LookupsLOV2.index();
    public static final int QUOTECATEGORIESLOVVO1 = AttributesEnum.QuoteCategoriesLovVO1.index();
    public static final int TAXCODESLOV1 = AttributesEnum.TaxCodesLOV1.index();

    /**
     * This is the default constructor (do not remove).
     */
    public RentalQuoteChargesVORowImpl() {
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
        if(getQuantity()!= null && getUnitAmount() != null){
            oracle.jbo.domain.Number quantity = new oracle.jbo.domain.Number(getQuantity());
            oracle.jbo.domain.Number amount = new oracle.jbo.domain.Number(getUnitAmount());
            oracle.jbo.domain.Number totAmt = new oracle.jbo.domain.Number(quantity.multiply(amount));
            setAttributeInternal(AMOUNT, totAmt);
        }else{
            setAttributeInternal(AMOUNT, value);
        }
        setVatTaxAmount(new oracle.jbo.domain.Number(0));
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
     * Gets the attribute value for the calculated attribute TransAssetCategory.
     * @return the TransAssetCategory
     */
    public String getTransAssetCategory() {
        return (String) getAttributeInternal(TRANSASSETCATEGORY);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransAssetCategory.
     * @param value value to set the  TransAssetCategory
     */
    public void setTransAssetCategory(String value) {
        setAttributeInternal(TRANSASSETCATEGORY, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TransAssetCategoryDesc.
     * @return the TransAssetCategoryDesc
     */
    public String getTransAssetCategoryDesc() {
        return (String) getAttributeInternal(TRANSASSETCATEGORYDESC);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransAssetCategoryDesc.
     * @param value value to set the  TransAssetCategoryDesc
     */
    public void setTransAssetCategoryDesc(String value) {
        setAttributeInternal(TRANSASSETCATEGORYDESC, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TransChargeType.
     * @return the TransChargeType
     */
    public String getTransChargeType() {
        return (String) getAttributeInternal(TRANSCHARGETYPE);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransChargeType.
     * @param value value to set the  TransChargeType
     */
    public void setTransChargeType(String value) {
        setAttributeInternal(TRANSCHARGETYPE, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TransBilling.
     * @return the TransBilling
     */
    public String getTransBilling() {
        return (String) getAttributeInternal(TRANSBILLING);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransBilling.
     * @param value value to set the  TransBilling
     */
    public void setTransBilling(String value) {
        setAttributeInternal(TRANSBILLING, value);
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
        oracle.jbo.domain.Number val = ((getTaxRatePercent() != null ? getTaxRatePercent(): zero).divide(100)
                                            .multiply(getAmount() != null ? getAmount(): zero));
        setAttributeInternal(VATTAXAMOUNT, val);
    }

    /**
     * Gets the attribute value for CATEGORY_DESCRIPTION using the alias name CategoryDescription.
     * @return the CATEGORY_DESCRIPTION
     */
    public String getCategoryDescription() {
        return (String) getAttributeInternal(CATEGORYDESCRIPTION);
    }

    /**
     * Sets <code>value</code> as attribute value for CATEGORY_DESCRIPTION using the alias name CategoryDescription.
     * @param value value to set the CATEGORY_DESCRIPTION
     */
    public void setCategoryDescription(String value) {
        setAttributeInternal(CATEGORYDESCRIPTION, value);
    }

    /**
     * Gets the attribute value for QUANTITY using the alias name Quantity.
     * @return the QUANTITY
     */
    public Number getQuantity() {
        return (Number) getAttributeInternal(QUANTITY);
    }

    /**
     * Sets <code>value</code> as attribute value for QUANTITY using the alias name Quantity.
     * @param value value to set the QUANTITY
     */
    public void setQuantity(Number value) {
        setAttributeInternal(QUANTITY, value);
        setAmount(new oracle.jbo.domain.Number(0));
    }

    /**
     * Gets the attribute value for UNIT_AMOUNT using the alias name UnitAmount.
     * @return the UNIT_AMOUNT
     */
    public Number getUnitAmount() {
        return (Number) getAttributeInternal(UNITAMOUNT);
    }

    /**
     * Sets <code>value</code> as attribute value for UNIT_AMOUNT using the alias name UnitAmount.
     * @param value value to set the UNIT_AMOUNT
     */
    public void setUnitAmount(Number value) {
        setAttributeInternal(UNITAMOUNT, value);
        setAmount(new oracle.jbo.domain.Number(0));
    }

    /**
     * Gets the view accessor <code>RowSet</code> LookupsLOV1.
     */
    public RowSet getLookupsLOV1() {
        return (RowSet) getAttributeInternal(LOOKUPSLOV1);
    }

    /**
     * Gets the view accessor <code>RowSet</code> LookupsLOV2.
     */
    public RowSet getLookupsLOV2() {
        return (RowSet) getAttributeInternal(LOOKUPSLOV2);
    }

    /**
     * Gets the view accessor <code>RowSet</code> QuoteCategoriesLovVO1.
     */
    public RowSet getQuoteCategoriesLovVO1() {
        return (RowSet) getAttributeInternal(QUOTECATEGORIESLOVVO1);
    }

    /**
     * Gets the view accessor <code>RowSet</code> TaxCodesLOV1.
     */
    public RowSet getTaxCodesLOV1() {
        return (RowSet) getAttributeInternal(TAXCODESLOV1);
    }
}

