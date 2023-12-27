package model.lov;

import java.math.BigDecimal;

import java.sql.Timestamp;

import oracle.jbo.domain.Date;
import oracle.jbo.domain.NClobDomain;
import oracle.jbo.domain.Number;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Fri Nov 18 11:30:52 IST 2022
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class QuoteAssetRequestLinesLovVORowImpl extends ViewRowImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    protected enum AttributesEnum {
        LineId,
        LineNum,
        CharLineNum,
        RentalType,
        TransRentalType,
        AssetCategoryId,
        TransCategory,
        TransCategoryDescr,
        Quantity,
        HiringBasisRuleId,
        HiringBasis,
        FixedVariable,
        OperatorOption,
        TransOperatorOption,
        FuelOption,
        TransFuelOption,
        ShiftType,
        MobilizationFlag,
        TransMobilization,
        TransShift,
        OnHireDate,
        OffHireDate,
        StandardRate,
        Ot1Rate,
        Ot2Rate;
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


    public static final int LINEID = AttributesEnum.LineId.index();
    public static final int LINENUM = AttributesEnum.LineNum.index();
    public static final int CHARLINENUM = AttributesEnum.CharLineNum.index();
    public static final int RENTALTYPE = AttributesEnum.RentalType.index();
    public static final int TRANSRENTALTYPE = AttributesEnum.TransRentalType.index();
    public static final int ASSETCATEGORYID = AttributesEnum.AssetCategoryId.index();
    public static final int TRANSCATEGORY = AttributesEnum.TransCategory.index();
    public static final int TRANSCATEGORYDESCR = AttributesEnum.TransCategoryDescr.index();
    public static final int QUANTITY = AttributesEnum.Quantity.index();
    public static final int HIRINGBASISRULEID = AttributesEnum.HiringBasisRuleId.index();
    public static final int HIRINGBASIS = AttributesEnum.HiringBasis.index();
    public static final int FIXEDVARIABLE = AttributesEnum.FixedVariable.index();
    public static final int OPERATOROPTION = AttributesEnum.OperatorOption.index();
    public static final int TRANSOPERATOROPTION = AttributesEnum.TransOperatorOption.index();
    public static final int FUELOPTION = AttributesEnum.FuelOption.index();
    public static final int TRANSFUELOPTION = AttributesEnum.TransFuelOption.index();
    public static final int SHIFTTYPE = AttributesEnum.ShiftType.index();
    public static final int MOBILIZATIONFLAG = AttributesEnum.MobilizationFlag.index();
    public static final int TRANSMOBILIZATION = AttributesEnum.TransMobilization.index();
    public static final int TRANSSHIFT = AttributesEnum.TransShift.index();
    public static final int ONHIREDATE = AttributesEnum.OnHireDate.index();
    public static final int OFFHIREDATE = AttributesEnum.OffHireDate.index();
    public static final int STANDARDRATE = AttributesEnum.StandardRate.index();
    public static final int OT1RATE = AttributesEnum.Ot1Rate.index();
    public static final int OT2RATE = AttributesEnum.Ot2Rate.index();

    /**
     * This is the default constructor (do not remove).
     */
    public QuoteAssetRequestLinesLovVORowImpl() {
    }

    /**
     * Gets the attribute value for the calculated attribute LineId.
     * @return the LineId
     */
    public oracle.jbo.domain.Number getLineId() {
        return (oracle.jbo.domain.Number) getAttributeInternal(LINEID);
    }

    /**
     * Gets the attribute value for the calculated attribute LineNum.
     * @return the LineNum
     */
    public Number getLineNum() {
        return (Number) getAttributeInternal(LINENUM);
    }

    /**
     * Gets the attribute value for the calculated attribute CharLineNum.
     * @return the CharLineNum
     */
    public String getCharLineNum() {
        return (String) getAttributeInternal(CHARLINENUM);
    }

    /**
     * Gets the attribute value for the calculated attribute RentalType.
     * @return the RentalType
     */
    public String getRentalType() {
        return (String) getAttributeInternal(RENTALTYPE);
    }

    /**
     * Gets the attribute value for the calculated attribute TransRentalType.
     * @return the TransRentalType
     */
    public String getTransRentalType() {
        return (String) getAttributeInternal(TRANSRENTALTYPE);
    }

    /**
     * Gets the attribute value for the calculated attribute AssetCategoryId.
     * @return the AssetCategoryId
     */
    public String getAssetCategoryId() {
        return (String) getAttributeInternal(ASSETCATEGORYID);
    }

    /**
     * Gets the attribute value for the calculated attribute TransCategory.
     * @return the TransCategory
     */
    public String getTransCategory() {
        return (String) getAttributeInternal(TRANSCATEGORY);
    }

    /**
     * Gets the attribute value for the calculated attribute TransCategoryDescr.
     * @return the TransCategoryDescr
     */
    public String getTransCategoryDescr() {
        return (String) getAttributeInternal(TRANSCATEGORYDESCR);
    }

    /**
     * Gets the attribute value for the calculated attribute Quantity.
     * @return the Quantity
     */
    public Number getQuantity() {
        return (Number) getAttributeInternal(QUANTITY);
    }

    /**
     * Gets the attribute value for the calculated attribute HiringBasisRuleId.
     * @return the HiringBasisRuleId
     */
    public Number getHiringBasisRuleId() {
        return (Number) getAttributeInternal(HIRINGBASISRULEID);
    }

    /**
     * Gets the attribute value for the calculated attribute HiringBasis.
     * @return the HiringBasis
     */
    public String getHiringBasis() {
        return (String) getAttributeInternal(HIRINGBASIS);
    }

    /**
     * Gets the attribute value for the calculated attribute FixedVariable.
     * @return the FixedVariable
     */
    public String getFixedVariable() {
        return (String) getAttributeInternal(FIXEDVARIABLE);
    }

    /**
     * Gets the attribute value for the calculated attribute OperatorOption.
     * @return the OperatorOption
     */
    public String getOperatorOption() {
        return (String) getAttributeInternal(OPERATOROPTION);
    }

    /**
     * Gets the attribute value for the calculated attribute TransOperatorOption.
     * @return the TransOperatorOption
     */
    public String getTransOperatorOption() {
        return (String) getAttributeInternal(TRANSOPERATOROPTION);
    }

    /**
     * Gets the attribute value for the calculated attribute FuelOption.
     * @return the FuelOption
     */
    public String getFuelOption() {
        return (String) getAttributeInternal(FUELOPTION);
    }

    /**
     * Gets the attribute value for the calculated attribute TransFuelOption.
     * @return the TransFuelOption
     */
    public String getTransFuelOption() {
        return (String) getAttributeInternal(TRANSFUELOPTION);
    }

    /**
     * Gets the attribute value for the calculated attribute ShiftType.
     * @return the ShiftType
     */
    public String getShiftType() {
        return (String) getAttributeInternal(SHIFTTYPE);
    }

    /**
     * Gets the attribute value for the calculated attribute MobilizationFlag.
     * @return the MobilizationFlag
     */
    public String getMobilizationFlag() {
        return (String) getAttributeInternal(MOBILIZATIONFLAG);
    }

    /**
     * Gets the attribute value for the calculated attribute TransMobilization.
     * @return the TransMobilization
     */
    public String getTransMobilization() {
        return (String) getAttributeInternal(TRANSMOBILIZATION);
    }

    /**
     * Gets the attribute value for the calculated attribute TransShift.
     * @return the TransShift
     */
    public String getTransShift() {
        return (String) getAttributeInternal(TRANSSHIFT);
    }

    /**
     * Gets the attribute value for the calculated attribute OnHireDate.
     * @return the OnHireDate
     */
    public Date getOnHireDate() {
        return (Date) getAttributeInternal(ONHIREDATE);
    }

    /**
     * Gets the attribute value for the calculated attribute OffHireDate.
     * @return the OffHireDate
     */
    public Date getOffHireDate() {
        return (Date) getAttributeInternal(OFFHIREDATE);
    }

    /**
     * Gets the attribute value for the calculated attribute StandardRate.
     * @return the StandardRate
     */
    public Number getStandardRate() {
        return (Number) getAttributeInternal(STANDARDRATE);
    }

    /**
     * Gets the attribute value for the calculated attribute Ot1Rate.
     * @return the Ot1Rate
     */
    public Number getOt1Rate() {
        return (Number) getAttributeInternal(OT1RATE);
    }

    /**
     * Gets the attribute value for the calculated attribute Ot2Rate.
     * @return the Ot2Rate
     */
    public Number getOt2Rate() {
        return (Number) getAttributeInternal(OT2RATE);
    }
}
