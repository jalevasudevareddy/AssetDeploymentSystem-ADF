package model.view;

import model.entity.XxadsRentalContractChargesEOImpl;

import oracle.jbo.domain.Date;
import oracle.jbo.domain.Number;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Mon May 15 10:34:33 IST 2023
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class ContractChargesForCategoryVORowImpl extends ViewRowImpl {
    public static final int ENTITY_XXADSRENTALCONTRACTCHARGESEO = 0;

    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    protected enum AttributesEnum {
        ActiveFlag,
        Amount,
        AssetCategoryId,
        Billing,
        CategoryDescription,
        ChargeType,
        ContractChargeId,
        ContractId,
        CreatedBy,
        CreationDate,
        LastUpdateDate,
        LastUpdatedBy,
        MasterContractChargeId,
        MasterContractId,
        MasterRefChargeId,
        ObjectVersionNumber,
        ParentContractChargeId,
        ParentContractId,
        ParentRefChargeId,
        Quantity,
        ReferenceChargeId,
        RentalType,
        TaxRateCode,
        TaxRateId,
        TaxRatePercent,
        UnitAmount,
        VatTaxAmount;
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
    public static final int CATEGORYDESCRIPTION = AttributesEnum.CategoryDescription.index();
    public static final int CHARGETYPE = AttributesEnum.ChargeType.index();
    public static final int CONTRACTCHARGEID = AttributesEnum.ContractChargeId.index();
    public static final int CONTRACTID = AttributesEnum.ContractId.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int CREATIONDATE = AttributesEnum.CreationDate.index();
    public static final int LASTUPDATEDATE = AttributesEnum.LastUpdateDate.index();
    public static final int LASTUPDATEDBY = AttributesEnum.LastUpdatedBy.index();
    public static final int MASTERCONTRACTCHARGEID = AttributesEnum.MasterContractChargeId.index();
    public static final int MASTERCONTRACTID = AttributesEnum.MasterContractId.index();
    public static final int MASTERREFCHARGEID = AttributesEnum.MasterRefChargeId.index();
    public static final int OBJECTVERSIONNUMBER = AttributesEnum.ObjectVersionNumber.index();
    public static final int PARENTCONTRACTCHARGEID = AttributesEnum.ParentContractChargeId.index();
    public static final int PARENTCONTRACTID = AttributesEnum.ParentContractId.index();
    public static final int PARENTREFCHARGEID = AttributesEnum.ParentRefChargeId.index();
    public static final int QUANTITY = AttributesEnum.Quantity.index();
    public static final int REFERENCECHARGEID = AttributesEnum.ReferenceChargeId.index();
    public static final int RENTALTYPE = AttributesEnum.RentalType.index();
    public static final int TAXRATECODE = AttributesEnum.TaxRateCode.index();
    public static final int TAXRATEID = AttributesEnum.TaxRateId.index();
    public static final int TAXRATEPERCENT = AttributesEnum.TaxRatePercent.index();
    public static final int UNITAMOUNT = AttributesEnum.UnitAmount.index();
    public static final int VATTAXAMOUNT = AttributesEnum.VatTaxAmount.index();

    /**
     * This is the default constructor (do not remove).
     */
    public ContractChargesForCategoryVORowImpl() {
    }

    /**
     * Gets XxadsRentalContractChargesEO entity object.
     * @return the XxadsRentalContractChargesEO
     */
    public XxadsRentalContractChargesEOImpl getXxadsRentalContractChargesEO() {
        return (XxadsRentalContractChargesEOImpl) getEntity(ENTITY_XXADSRENTALCONTRACTCHARGESEO);
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
     * Gets the attribute value for CONTRACT_CHARGE_ID using the alias name ContractChargeId.
     * @return the CONTRACT_CHARGE_ID
     */
    public Number getContractChargeId() {
        return (Number) getAttributeInternal(CONTRACTCHARGEID);
    }

    /**
     * Sets <code>value</code> as attribute value for CONTRACT_CHARGE_ID using the alias name ContractChargeId.
     * @param value value to set the CONTRACT_CHARGE_ID
     */
    public void setContractChargeId(Number value) {
        setAttributeInternal(CONTRACTCHARGEID, value);
    }

    /**
     * Gets the attribute value for CONTRACT_ID using the alias name ContractId.
     * @return the CONTRACT_ID
     */
    public Number getContractId() {
        return (Number) getAttributeInternal(CONTRACTID);
    }

    /**
     * Sets <code>value</code> as attribute value for CONTRACT_ID using the alias name ContractId.
     * @param value value to set the CONTRACT_ID
     */
    public void setContractId(Number value) {
        setAttributeInternal(CONTRACTID, value);
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
     * Gets the attribute value for MASTER_CONTRACT_CHARGE_ID using the alias name MasterContractChargeId.
     * @return the MASTER_CONTRACT_CHARGE_ID
     */
    public Number getMasterContractChargeId() {
        return (Number) getAttributeInternal(MASTERCONTRACTCHARGEID);
    }

    /**
     * Sets <code>value</code> as attribute value for MASTER_CONTRACT_CHARGE_ID using the alias name MasterContractChargeId.
     * @param value value to set the MASTER_CONTRACT_CHARGE_ID
     */
    public void setMasterContractChargeId(Number value) {
        setAttributeInternal(MASTERCONTRACTCHARGEID, value);
    }

    /**
     * Gets the attribute value for MASTER_CONTRACT_ID using the alias name MasterContractId.
     * @return the MASTER_CONTRACT_ID
     */
    public Number getMasterContractId() {
        return (Number) getAttributeInternal(MASTERCONTRACTID);
    }

    /**
     * Sets <code>value</code> as attribute value for MASTER_CONTRACT_ID using the alias name MasterContractId.
     * @param value value to set the MASTER_CONTRACT_ID
     */
    public void setMasterContractId(Number value) {
        setAttributeInternal(MASTERCONTRACTID, value);
    }

    /**
     * Gets the attribute value for MASTER_REF_CHARGE_ID using the alias name MasterRefChargeId.
     * @return the MASTER_REF_CHARGE_ID
     */
    public Number getMasterRefChargeId() {
        return (Number) getAttributeInternal(MASTERREFCHARGEID);
    }

    /**
     * Sets <code>value</code> as attribute value for MASTER_REF_CHARGE_ID using the alias name MasterRefChargeId.
     * @param value value to set the MASTER_REF_CHARGE_ID
     */
    public void setMasterRefChargeId(Number value) {
        setAttributeInternal(MASTERREFCHARGEID, value);
    }

    /**
     * Gets the attribute value for OBJECT_VERSION_NUMBER using the alias name ObjectVersionNumber.
     * @return the OBJECT_VERSION_NUMBER
     */
    public Number getObjectVersionNumber() {
        return (Number) getAttributeInternal(OBJECTVERSIONNUMBER);
    }

    /**
     * Gets the attribute value for PARENT_CONTRACT_CHARGE_ID using the alias name ParentContractChargeId.
     * @return the PARENT_CONTRACT_CHARGE_ID
     */
    public Number getParentContractChargeId() {
        return (Number) getAttributeInternal(PARENTCONTRACTCHARGEID);
    }

    /**
     * Sets <code>value</code> as attribute value for PARENT_CONTRACT_CHARGE_ID using the alias name ParentContractChargeId.
     * @param value value to set the PARENT_CONTRACT_CHARGE_ID
     */
    public void setParentContractChargeId(Number value) {
        setAttributeInternal(PARENTCONTRACTCHARGEID, value);
    }

    /**
     * Gets the attribute value for PARENT_CONTRACT_ID using the alias name ParentContractId.
     * @return the PARENT_CONTRACT_ID
     */
    public Number getParentContractId() {
        return (Number) getAttributeInternal(PARENTCONTRACTID);
    }

    /**
     * Sets <code>value</code> as attribute value for PARENT_CONTRACT_ID using the alias name ParentContractId.
     * @param value value to set the PARENT_CONTRACT_ID
     */
    public void setParentContractId(Number value) {
        setAttributeInternal(PARENTCONTRACTID, value);
    }

    /**
     * Gets the attribute value for PARENT_REF_CHARGE_ID using the alias name ParentRefChargeId.
     * @return the PARENT_REF_CHARGE_ID
     */
    public Number getParentRefChargeId() {
        return (Number) getAttributeInternal(PARENTREFCHARGEID);
    }

    /**
     * Sets <code>value</code> as attribute value for PARENT_REF_CHARGE_ID using the alias name ParentRefChargeId.
     * @param value value to set the PARENT_REF_CHARGE_ID
     */
    public void setParentRefChargeId(Number value) {
        setAttributeInternal(PARENTREFCHARGEID, value);
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
    }

    /**
     * Gets the attribute value for REFERENCE_CHARGE_ID using the alias name ReferenceChargeId.
     * @return the REFERENCE_CHARGE_ID
     */
    public Number getReferenceChargeId() {
        return (Number) getAttributeInternal(REFERENCECHARGEID);
    }

    /**
     * Sets <code>value</code> as attribute value for REFERENCE_CHARGE_ID using the alias name ReferenceChargeId.
     * @param value value to set the REFERENCE_CHARGE_ID
     */
    public void setReferenceChargeId(Number value) {
        setAttributeInternal(REFERENCECHARGEID, value);
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
        setAttributeInternal(VATTAXAMOUNT, value);
    }
}

