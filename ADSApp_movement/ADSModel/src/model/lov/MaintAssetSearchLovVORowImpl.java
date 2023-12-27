package model.lov;

import java.math.BigDecimal;

import oracle.jbo.domain.NClobDomain;
import oracle.jbo.domain.Number;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Tue Nov 01 11:54:01 IST 2022
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class MaintAssetSearchLovVORowImpl extends ViewRowImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    protected enum AttributesEnum {
        AssetId,
        AssetNumber,
        Description,
        ItemId,
        ItemOrganizationId,
        ItemNumber,
        ItemDescription,
        CategoryName;
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


    public static final int ASSETID = AttributesEnum.AssetId.index();
    public static final int ASSETNUMBER = AttributesEnum.AssetNumber.index();
    public static final int DESCRIPTION = AttributesEnum.Description.index();
    public static final int ITEMID = AttributesEnum.ItemId.index();
    public static final int ITEMORGANIZATIONID = AttributesEnum.ItemOrganizationId.index();
    public static final int ITEMNUMBER = AttributesEnum.ItemNumber.index();
    public static final int ITEMDESCRIPTION = AttributesEnum.ItemDescription.index();
    public static final int CATEGORYNAME = AttributesEnum.CategoryName.index();

    /**
     * This is the default constructor (do not remove).
     */
    public MaintAssetSearchLovVORowImpl() {
    }

    /**
     * Gets the attribute value for the calculated attribute AssetId.
     * @return the AssetId
     */
    public Number getAssetId() {
        return (Number) getAttributeInternal(ASSETID);
    }

    /**
     * Gets the attribute value for the calculated attribute AssetNumber.
     * @return the AssetNumber
     */
    public String getAssetNumber() {
        return (String) getAttributeInternal(ASSETNUMBER);
    }

    /**
     * Gets the attribute value for the calculated attribute Description.
     * @return the Description
     */
    public String getDescription() {
        return (String) getAttributeInternal(DESCRIPTION);
    }

    /**
     * Gets the attribute value for the calculated attribute ItemId.
     * @return the ItemId
     */
    public Number getItemId() {
        return (Number) getAttributeInternal(ITEMID);
    }

    /**
     * Gets the attribute value for the calculated attribute ItemOrganizationId.
     * @return the ItemOrganizationId
     */
    public Number getItemOrganizationId() {
        return (Number) getAttributeInternal(ITEMORGANIZATIONID);
    }

    /**
     * Gets the attribute value for the calculated attribute ItemNumber.
     * @return the ItemNumber
     */
    public String getItemNumber() {
        return (String) getAttributeInternal(ITEMNUMBER);
    }

    /**
     * Gets the attribute value for the calculated attribute ItemDescription.
     * @return the ItemDescription
     */
    public String getItemDescription() {
        return (String) getAttributeInternal(ITEMDESCRIPTION);
    }

    /**
     * Gets the attribute value for the calculated attribute CategoryName.
     * @return the CategoryName
     */
    public String getCategoryName() {
        return (String) getAttributeInternal(CATEGORYNAME);
    }
}
