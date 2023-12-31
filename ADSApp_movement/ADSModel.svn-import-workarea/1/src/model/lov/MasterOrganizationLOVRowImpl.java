package model.lov;

import java.math.BigDecimal;

import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Wed Oct 19 16:54:30 IST 2022
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class MasterOrganizationLOVRowImpl extends ViewRowImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    protected enum AttributesEnum {
        MasterOrganizationId,
        OrganizationName,
        OrganizationCode,
        BuId;
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

    public static final int MASTERORGANIZATIONID = AttributesEnum.MasterOrganizationId.index();
    public static final int ORGANIZATIONNAME = AttributesEnum.OrganizationName.index();
    public static final int ORGANIZATIONCODE = AttributesEnum.OrganizationCode.index();
    public static final int BUID = AttributesEnum.BuId.index();

    /**
     * This is the default constructor (do not remove).
     */
    public MasterOrganizationLOVRowImpl() {
    }

    /**
     * Gets the attribute value for the calculated attribute MasterOrganizationId.
     * @return the MasterOrganizationId
     */
    public BigDecimal getMasterOrganizationId() {
        return (BigDecimal) getAttributeInternal(MASTERORGANIZATIONID);
    }

    /**
     * Gets the attribute value for the calculated attribute OrganizationName.
     * @return the OrganizationName
     */
    public String getOrganizationName() {
        return (String) getAttributeInternal(ORGANIZATIONNAME);
    }

    /**
     * Gets the attribute value for the calculated attribute OrganizationCode.
     * @return the OrganizationCode
     */
    public String getOrganizationCode() {
        return (String) getAttributeInternal(ORGANIZATIONCODE);
    }

    /**
     * Gets the attribute value for the calculated attribute BuId.
     * @return the BuId
     */
    public BigDecimal getBuId() {
        return (BigDecimal) getAttributeInternal(BUID);
    }

}

