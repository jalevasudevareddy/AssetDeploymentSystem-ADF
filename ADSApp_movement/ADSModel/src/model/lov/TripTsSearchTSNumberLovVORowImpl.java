package model.lov;

import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Mon Jan 16 16:41:07 IST 2023
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class TripTsSearchTSNumberLovVORowImpl extends ViewRowImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    protected enum AttributesEnum {
        TimesheetNumber;
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
    public static final int TIMESHEETNUMBER = AttributesEnum.TimesheetNumber.index();

    /**
     * This is the default constructor (do not remove).
     */
    public TripTsSearchTSNumberLovVORowImpl() {
    }

    /**
     * Gets the attribute value for the calculated attribute TimesheetNumber.
     * @return the TimesheetNumber
     */
    public String getTimesheetNumber() {
        return (String) getAttributeInternal(TIMESHEETNUMBER);
    }
}

