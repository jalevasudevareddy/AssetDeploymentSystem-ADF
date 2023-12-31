package model.lov;

import java.math.BigDecimal;

import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Tue Oct 11 17:08:17 IST 2022
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class LookupTypeNewLOVVORowImpl extends ViewRowImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    protected enum AttributesEnum {
        ApplicationCode,
        ApplicationId,
        Description,
        LookupType,
        LookupTypeId,
        Meaning;
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

    public static final int APPLICATIONCODE = AttributesEnum.ApplicationCode.index();
    public static final int APPLICATIONID = AttributesEnum.ApplicationId.index();
    public static final int DESCRIPTION = AttributesEnum.Description.index();
    public static final int LOOKUPTYPE = AttributesEnum.LookupType.index();
    public static final int LOOKUPTYPEID = AttributesEnum.LookupTypeId.index();
    public static final int MEANING = AttributesEnum.Meaning.index();

    /**
     * This is the default constructor (do not remove).
     */
    public LookupTypeNewLOVVORowImpl() {
    }

    /**
     * Gets the attribute value for the calculated attribute ApplicationCode.
     * @return the ApplicationCode
     */
    public String getApplicationCode() {
        return (String) getAttributeInternal(APPLICATIONCODE);
    }

    /**
     * Gets the attribute value for the calculated attribute ApplicationId.
     * @return the ApplicationId
     */
    public BigDecimal getApplicationId() {
        return (BigDecimal) getAttributeInternal(APPLICATIONID);
    }

    /**
     * Gets the attribute value for the calculated attribute Description.
     * @return the Description
     */
    public String getDescription() {
        return (String) getAttributeInternal(DESCRIPTION);
    }

    /**
     * Gets the attribute value for the calculated attribute LookupType.
     * @return the LookupType
     */
    public String getLookupType() {
        return (String) getAttributeInternal(LOOKUPTYPE);
    }

    /**
     * Gets the attribute value for the calculated attribute LookupTypeId.
     * @return the LookupTypeId
     */
    public BigDecimal getLookupTypeId() {
        return (BigDecimal) getAttributeInternal(LOOKUPTYPEID);
    }

    /**
     * Gets the attribute value for the calculated attribute Meaning.
     * @return the Meaning
     */
    public String getMeaning() {
        return (String) getAttributeInternal(MEANING);
    }
}

