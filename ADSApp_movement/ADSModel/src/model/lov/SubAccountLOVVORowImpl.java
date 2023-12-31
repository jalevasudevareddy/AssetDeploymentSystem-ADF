package model.lov;

import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Thu Mar 23 19:01:19 IST 2023
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class SubAccountLOVVORowImpl extends ViewRowImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    protected enum AttributesEnum {
        CodeDesc,
        FlexValue,
        Description,
        FlexValueSetId,
        FlexValueId,
        SegmentName;
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
    public static final int CODEDESC = AttributesEnum.CodeDesc.index();
    public static final int FLEXVALUE = AttributesEnum.FlexValue.index();
    public static final int DESCRIPTION = AttributesEnum.Description.index();
    public static final int FLEXVALUESETID = AttributesEnum.FlexValueSetId.index();
    public static final int FLEXVALUEID = AttributesEnum.FlexValueId.index();
    public static final int SEGMENTNAME = AttributesEnum.SegmentName.index();

    /**
     * This is the default constructor (do not remove).
     */
    public SubAccountLOVVORowImpl() {
    }
}

