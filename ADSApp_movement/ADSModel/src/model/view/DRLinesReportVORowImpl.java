package model.view;

import oracle.jbo.domain.Number;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Tue Apr 11 15:39:42 IST 2023
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class DRLinesReportVORowImpl extends ViewRowImpl {

    public static final int ENTITY_XXADSDRLINESREPORTEO = 0;

    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    protected enum AttributesEnum {
        AssetCategory,
        Description,
        DrId,
        Quantity;
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

    public static final int ASSETCATEGORY = AttributesEnum.AssetCategory.index();
    public static final int DESCRIPTION = AttributesEnum.Description.index();
    public static final int DRID = AttributesEnum.DrId.index();
    public static final int QUANTITY = AttributesEnum.Quantity.index();

    /**
     * This is the default constructor (do not remove).
     */
    public DRLinesReportVORowImpl() {
    }
}

