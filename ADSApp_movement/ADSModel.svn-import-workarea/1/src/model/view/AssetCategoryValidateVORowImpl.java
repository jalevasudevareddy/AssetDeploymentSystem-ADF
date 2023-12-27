package model.view;

import model.entity.XxadsAssetCategoryEOImpl;

import oracle.jbo.domain.Date;
import oracle.jbo.domain.Number;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Thu Oct 13 13:07:56 IST 2022
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class AssetCategoryValidateVORowImpl extends ViewRowImpl {
    public static final int ENTITY_XXADSASSETCATEGORYEO = 0;

    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    protected enum AttributesEnum {
        ActiveFlag,
        AssetCategory,
        BuId,
        CategoryId,
        CategoryType,
        CreatedBy,
        CreationDate,
        Description,
        FusionCategoryId,
        HiringItemId,
        InspectionCheck,
        LastUpdateDate,
        LastUpdatedBy,
        MobilizationFlag,
        ObjectVersionNumber,
        OrganizationId,
        UsagePool;
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
    public static final int ASSETCATEGORY = AttributesEnum.AssetCategory.index();
    public static final int BUID = AttributesEnum.BuId.index();
    public static final int CATEGORYID = AttributesEnum.CategoryId.index();
    public static final int CATEGORYTYPE = AttributesEnum.CategoryType.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int CREATIONDATE = AttributesEnum.CreationDate.index();
    public static final int DESCRIPTION = AttributesEnum.Description.index();
    public static final int FUSIONCATEGORYID = AttributesEnum.FusionCategoryId.index();
    public static final int HIRINGITEMID = AttributesEnum.HiringItemId.index();
    public static final int INSPECTIONCHECK = AttributesEnum.InspectionCheck.index();
    public static final int LASTUPDATEDATE = AttributesEnum.LastUpdateDate.index();
    public static final int LASTUPDATEDBY = AttributesEnum.LastUpdatedBy.index();
    public static final int MOBILIZATIONFLAG = AttributesEnum.MobilizationFlag.index();
    public static final int OBJECTVERSIONNUMBER = AttributesEnum.ObjectVersionNumber.index();
    public static final int ORGANIZATIONID = AttributesEnum.OrganizationId.index();
    public static final int USAGEPOOL = AttributesEnum.UsagePool.index();

    /**
     * This is the default constructor (do not remove).
     */
    public AssetCategoryValidateVORowImpl() {
    }

    /**
     * Gets XxadsAssetCategoryEO entity object.
     * @return the XxadsAssetCategoryEO
     */
    public XxadsAssetCategoryEOImpl getXxadsAssetCategoryEO() {
        return (XxadsAssetCategoryEOImpl) getEntity(ENTITY_XXADSASSETCATEGORYEO);
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
     * Gets the attribute value for ASSET_CATEGORY using the alias name AssetCategory.
     * @return the ASSET_CATEGORY
     */
    public String getAssetCategory() {
        return (String) getAttributeInternal(ASSETCATEGORY);
    }

    /**
     * Sets <code>value</code> as attribute value for ASSET_CATEGORY using the alias name AssetCategory.
     * @param value value to set the ASSET_CATEGORY
     */
    public void setAssetCategory(String value) {
        setAttributeInternal(ASSETCATEGORY, value);
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
     * Gets the attribute value for CATEGORY_ID using the alias name CategoryId.
     * @return the CATEGORY_ID
     */
    public Number getCategoryId() {
        return (Number) getAttributeInternal(CATEGORYID);
    }

    /**
     * Sets <code>value</code> as attribute value for CATEGORY_ID using the alias name CategoryId.
     * @param value value to set the CATEGORY_ID
     */
    public void setCategoryId(Number value) {
        setAttributeInternal(CATEGORYID, value);
    }

    /**
     * Gets the attribute value for CATEGORY_TYPE using the alias name CategoryType.
     * @return the CATEGORY_TYPE
     */
    public String getCategoryType() {
        return (String) getAttributeInternal(CATEGORYTYPE);
    }

    /**
     * Sets <code>value</code> as attribute value for CATEGORY_TYPE using the alias name CategoryType.
     * @param value value to set the CATEGORY_TYPE
     */
    public void setCategoryType(String value) {
        setAttributeInternal(CATEGORYTYPE, value);
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
     * Gets the attribute value for FUSION_CATEGORY_ID using the alias name FusionCategoryId.
     * @return the FUSION_CATEGORY_ID
     */
    public Number getFusionCategoryId() {
        return (Number) getAttributeInternal(FUSIONCATEGORYID);
    }

    /**
     * Sets <code>value</code> as attribute value for FUSION_CATEGORY_ID using the alias name FusionCategoryId.
     * @param value value to set the FUSION_CATEGORY_ID
     */
    public void setFusionCategoryId(Number value) {
        setAttributeInternal(FUSIONCATEGORYID, value);
    }

    /**
     * Gets the attribute value for HIRING_ITEM_ID using the alias name HiringItemId.
     * @return the HIRING_ITEM_ID
     */
    public Number getHiringItemId() {
        return (Number) getAttributeInternal(HIRINGITEMID);
    }

    /**
     * Sets <code>value</code> as attribute value for HIRING_ITEM_ID using the alias name HiringItemId.
     * @param value value to set the HIRING_ITEM_ID
     */
    public void setHiringItemId(Number value) {
        setAttributeInternal(HIRINGITEMID, value);
    }

    /**
     * Gets the attribute value for INSPECTION_CHECK using the alias name InspectionCheck.
     * @return the INSPECTION_CHECK
     */
    public String getInspectionCheck() {
        return (String) getAttributeInternal(INSPECTIONCHECK);
    }

    /**
     * Sets <code>value</code> as attribute value for INSPECTION_CHECK using the alias name InspectionCheck.
     * @param value value to set the INSPECTION_CHECK
     */
    public void setInspectionCheck(String value) {
        setAttributeInternal(INSPECTIONCHECK, value);
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
     * Gets the attribute value for MOBILIZATION_FLAG using the alias name MobilizationFlag.
     * @return the MOBILIZATION_FLAG
     */
    public String getMobilizationFlag() {
        return (String) getAttributeInternal(MOBILIZATIONFLAG);
    }

    /**
     * Sets <code>value</code> as attribute value for MOBILIZATION_FLAG using the alias name MobilizationFlag.
     * @param value value to set the MOBILIZATION_FLAG
     */
    public void setMobilizationFlag(String value) {
        setAttributeInternal(MOBILIZATIONFLAG, value);
    }

    /**
     * Gets the attribute value for OBJECT_VERSION_NUMBER using the alias name ObjectVersionNumber.
     * @return the OBJECT_VERSION_NUMBER
     */
    public Number getObjectVersionNumber() {
        return (Number) getAttributeInternal(OBJECTVERSIONNUMBER);
    }

    /**
     * Gets the attribute value for ORGANIZATION_ID using the alias name OrganizationId.
     * @return the ORGANIZATION_ID
     */
    public Number getOrganizationId() {
        return (Number) getAttributeInternal(ORGANIZATIONID);
    }

    /**
     * Sets <code>value</code> as attribute value for ORGANIZATION_ID using the alias name OrganizationId.
     * @param value value to set the ORGANIZATION_ID
     */
    public void setOrganizationId(Number value) {
        setAttributeInternal(ORGANIZATIONID, value);
    }

    /**
     * Gets the attribute value for USAGE_POOL using the alias name UsagePool.
     * @return the USAGE_POOL
     */
    public String getUsagePool() {
        return (String) getAttributeInternal(USAGEPOOL);
    }

    /**
     * Sets <code>value</code> as attribute value for USAGE_POOL using the alias name UsagePool.
     * @param value value to set the USAGE_POOL
     */
    public void setUsagePool(String value) {
        setAttributeInternal(USAGEPOOL, value);
    }
}
