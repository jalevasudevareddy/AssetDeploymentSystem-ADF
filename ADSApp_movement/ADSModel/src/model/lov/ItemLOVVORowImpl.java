package model.lov;

import java.math.BigDecimal;

import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Wed Oct 12 17:32:28 IST 2022
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class ItemLOVVORowImpl extends ViewRowImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    protected enum AttributesEnum {
        InventoryItemId,
        OrganizationId,
        ItemNumber,
        Description,
        UnitOfMeasure;
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


    public static final int INVENTORYITEMID = AttributesEnum.InventoryItemId.index();
    public static final int ORGANIZATIONID = AttributesEnum.OrganizationId.index();
    public static final int ITEMNUMBER = AttributesEnum.ItemNumber.index();
    public static final int DESCRIPTION = AttributesEnum.Description.index();
    public static final int UNITOFMEASURE = AttributesEnum.UnitOfMeasure.index();

    /**
     * This is the default constructor (do not remove).
     */
    public ItemLOVVORowImpl() {
    }

    /**
     * Gets the attribute value for the calculated attribute InventoryItemId.
     * @return the InventoryItemId
     */
    public BigDecimal getInventoryItemId() {
        return (BigDecimal) getAttributeInternal(INVENTORYITEMID);
    }

    /**
     * Gets the attribute value for the calculated attribute OrganizationId.
     * @return the OrganizationId
     */
    public BigDecimal getOrganizationId() {
        return (BigDecimal) getAttributeInternal(ORGANIZATIONID);
    }

    /**
     * Gets the attribute value for the calculated attribute ItemNumber.
     * @return the ItemNumber
     */
    public String getItemNumber() {
        return (String) getAttributeInternal(ITEMNUMBER);
    }

    /**
     * Gets the attribute value for the calculated attribute Description.
     * @return the Description
     */
    public String getDescription() {
        return (String) getAttributeInternal(DESCRIPTION);
    }

    /**
     * Gets the attribute value for the calculated attribute UnitOfMeasure.
     * @return the UnitOfMeasure
     */
    public String getUnitOfMeasure() {
        return (String) getAttributeInternal(UNITOFMEASURE);
    }
}
