package model.view;

import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Mon Apr 10 14:49:39 IST 2023
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class ApprovalHoldCheckVORowImpl extends ViewRowImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    protected enum AttributesEnum {
        HoldFlag;
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

    public static final int HOLDFLAG = AttributesEnum.HoldFlag.index();

    /**
     * This is the default constructor (do not remove).
     */
    public ApprovalHoldCheckVORowImpl() {
    }

    /**
     * Gets the attribute value for the calculated attribute HoldFlag.
     * @return the HoldFlag
     */
    public String getHoldFlag() {
        return (String) getAttributeInternal(HOLDFLAG);
    }
}

