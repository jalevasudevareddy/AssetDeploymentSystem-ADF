package model.lov;

import java.math.BigDecimal;

import oracle.jbo.domain.Number;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Thu Dec 01 17:03:23 IST 2022
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class RentalContractQuotationSearchVORowImpl extends ViewRowImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    protected enum AttributesEnum {
        QuoteNumber,
        QuotationId;
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


    public static final int QUOTENUMBER = AttributesEnum.QuoteNumber.index();
    public static final int QUOTATIONID = AttributesEnum.QuotationId.index();

    /**
     * This is the default constructor (do not remove).
     */
    public RentalContractQuotationSearchVORowImpl() {
    }

    /**
     * Gets the attribute value for the calculated attribute QuoteNumber.
     * @return the QuoteNumber
     */
    public String getQuoteNumber() {
        return (String) getAttributeInternal(QUOTENUMBER);
    }

    /**
     * Gets the attribute value for the calculated attribute QuotationId.
     * @return the QuotationId
     */
    public oracle.jbo.domain.Number getQuotationId() {
        return (oracle.jbo.domain.Number) getAttributeInternal(QUOTATIONID);
    }
}
