package model.entity;

import java.math.BigDecimal;

import oracle.jbo.Key;
import oracle.jbo.domain.NClobDomain;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Fri Apr 28 18:13:25 IST 2023
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class XxadsGatePassReportLinesEOImpl extends EntityImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    protected enum AttributesEnum {
        DoId,
        DoLineId,
        ContractId,
        UnitRate,
        Quantity;
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


    public static final int DOID = AttributesEnum.DoId.index();
    public static final int DOLINEID = AttributesEnum.DoLineId.index();
    public static final int CONTRACTID = AttributesEnum.ContractId.index();
    public static final int UNITRATE = AttributesEnum.UnitRate.index();
    public static final int QUANTITY = AttributesEnum.Quantity.index();

    /**
     * This is the default constructor (do not remove).
     */
    public XxadsGatePassReportLinesEOImpl() {
    }

    /**
     * @param doLineId key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(oracle.jbo.domain.Number doLineId) {
        return new Key(new Object[] { doLineId });
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("model.entity.XxadsGatePassReportLinesEO");
    }


}

