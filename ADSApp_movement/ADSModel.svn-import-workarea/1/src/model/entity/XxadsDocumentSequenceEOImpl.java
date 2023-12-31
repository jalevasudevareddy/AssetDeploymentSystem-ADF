package model.entity;

import java.math.BigDecimal;

import java.sql.Timestamp;

import java.util.Map;

import oracle.adf.share.ADFContext;

import oracle.jbo.AttributeList;
import oracle.jbo.Key;
import oracle.jbo.domain.DBSequence;
import oracle.jbo.domain.Date;
import oracle.jbo.domain.Number;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.SequenceImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Mon Nov 07 12:49:25 IST 2022
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class XxadsDocumentSequenceEOImpl extends EntityImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    protected enum AttributesEnum {
        DocSequenceId,
        BuId,
        DocumentCode,
        StartingSeqNum,
        CurrentSeqNum,
        EffectiveFrom,
        EffectiveTo,
        CreatedBy,
        CreationDate,
        LastUpdatedBy,
        LastUpdateDate,
        ObjectVersionNumber,
        DivisionCode,
        DivFlexValueId,
        Division;
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

    private static final byte USERNAME_HISTORY_TYPE = 13;

    @Override
    protected Object getHistoryContextForAttribute(AttributeDefImpl attr) {
            if (attr.getHistoryKind() == USERNAME_HISTORY_TYPE) {
                    // Custom History type logic goes here
                    return (String)((Map)ADFContext.getCurrent().getSessionScope().get("userMap")).get("UserName");
            }
            return super.getHistoryContextForAttribute(attr);
    }


    public static final int DOCSEQUENCEID = AttributesEnum.DocSequenceId.index();
    public static final int BUID = AttributesEnum.BuId.index();
    public static final int DOCUMENTCODE = AttributesEnum.DocumentCode.index();
    public static final int STARTINGSEQNUM = AttributesEnum.StartingSeqNum.index();
    public static final int CURRENTSEQNUM = AttributesEnum.CurrentSeqNum.index();
    public static final int EFFECTIVEFROM = AttributesEnum.EffectiveFrom.index();
    public static final int EFFECTIVETO = AttributesEnum.EffectiveTo.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int CREATIONDATE = AttributesEnum.CreationDate.index();
    public static final int LASTUPDATEDBY = AttributesEnum.LastUpdatedBy.index();
    public static final int LASTUPDATEDATE = AttributesEnum.LastUpdateDate.index();
    public static final int OBJECTVERSIONNUMBER = AttributesEnum.ObjectVersionNumber.index();
    public static final int DIVISIONCODE = AttributesEnum.DivisionCode.index();
    public static final int DIVFLEXVALUEID = AttributesEnum.DivFlexValueId.index();
    public static final int DIVISION = AttributesEnum.Division.index();

    /**
     * This is the default constructor (do not remove).
     */
    public XxadsDocumentSequenceEOImpl() {
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("model.entity.XxadsDocumentSequenceEO");
    }


    /**
     * Gets the attribute value for DocSequenceId, using the alias name DocSequenceId.
     * @return the value of DocSequenceId
     */
    public oracle.jbo.domain.Number getDocSequenceId() {
        return (oracle.jbo.domain.Number) getAttributeInternal(DOCSEQUENCEID);
    }

    /**
     * Sets <code>value</code> as the attribute value for DocSequenceId.
     * @param value value to set the DocSequenceId
     */
    public void setDocSequenceId(oracle.jbo.domain.Number value) {
        setAttributeInternal(DOCSEQUENCEID, value);
    }

    /**
     * Gets the attribute value for BuId, using the alias name BuId.
     * @return the value of BuId
     */
    public Number getBuId() {
        return (Number) getAttributeInternal(BUID);
    }

    /**
     * Sets <code>value</code> as the attribute value for BuId.
     * @param value value to set the BuId
     */
    public void setBuId(Number value) {
        setAttributeInternal(BUID, value);
    }


    /**
     * Gets the attribute value for DocumentCode, using the alias name DocumentCode.
     * @return the value of DocumentCode
     */
    public String getDocumentCode() {
        return (String) getAttributeInternal(DOCUMENTCODE);
    }

    /**
     * Sets <code>value</code> as the attribute value for DocumentCode.
     * @param value value to set the DocumentCode
     */
    public void setDocumentCode(String value) {
        setAttributeInternal(DOCUMENTCODE, value);
    }

    /**
     * Gets the attribute value for StartingSeqNum, using the alias name StartingSeqNum.
     * @return the value of StartingSeqNum
     */
    public Number getStartingSeqNum() {
        return (Number) getAttributeInternal(STARTINGSEQNUM);
    }

    /**
     * Sets <code>value</code> as the attribute value for StartingSeqNum.
     * @param value value to set the StartingSeqNum
     */
    public void setStartingSeqNum(Number value) {
        setAttributeInternal(STARTINGSEQNUM, value);
    }

    /**
     * Gets the attribute value for CurrentSeqNum, using the alias name CurrentSeqNum.
     * @return the value of CurrentSeqNum
     */
    public Number getCurrentSeqNum() {
        return (Number) getAttributeInternal(CURRENTSEQNUM);
    }

    /**
     * Sets <code>value</code> as the attribute value for CurrentSeqNum.
     * @param value value to set the CurrentSeqNum
     */
    public void setCurrentSeqNum(Number value) {
        setAttributeInternal(CURRENTSEQNUM, value);
    }

    /**
     * Gets the attribute value for EffectiveFrom, using the alias name EffectiveFrom.
     * @return the value of EffectiveFrom
     */
    public Date getEffectiveFrom() {
        return (Date) getAttributeInternal(EFFECTIVEFROM);
    }

    /**
     * Sets <code>value</code> as the attribute value for EffectiveFrom.
     * @param value value to set the EffectiveFrom
     */
    public void setEffectiveFrom(Date value) {
        setAttributeInternal(EFFECTIVEFROM, value);
    }

    /**
     * Gets the attribute value for EffectiveTo, using the alias name EffectiveTo.
     * @return the value of EffectiveTo
     */
    public Date getEffectiveTo() {
        return (Date) getAttributeInternal(EFFECTIVETO);
    }

    /**
     * Sets <code>value</code> as the attribute value for EffectiveTo.
     * @param value value to set the EffectiveTo
     */
    public void setEffectiveTo(Date value) {
        setAttributeInternal(EFFECTIVETO, value);
    }

    /**
     * Gets the attribute value for CreatedBy, using the alias name CreatedBy.
     * @return the value of CreatedBy
     */
    public String getCreatedBy() {
        return (String) getAttributeInternal(CREATEDBY);
    }


    /**
     * Gets the attribute value for CreationDate, using the alias name CreationDate.
     * @return the value of CreationDate
     */
    public Date getCreationDate() {
        return (Date) getAttributeInternal(CREATIONDATE);
    }


    /**
     * Gets the attribute value for LastUpdatedBy, using the alias name LastUpdatedBy.
     * @return the value of LastUpdatedBy
     */
    public String getLastUpdatedBy() {
        return (String) getAttributeInternal(LASTUPDATEDBY);
    }


    /**
     * Gets the attribute value for LastUpdateDate, using the alias name LastUpdateDate.
     * @return the value of LastUpdateDate
     */
    public Date getLastUpdateDate() {
        return (Date) getAttributeInternal(LASTUPDATEDATE);
    }


    /**
     * Gets the attribute value for ObjectVersionNumber, using the alias name ObjectVersionNumber.
     * @return the value of ObjectVersionNumber
     */
    public Number getObjectVersionNumber() {
        return (Number) getAttributeInternal(OBJECTVERSIONNUMBER);
    }


    /**
     * Gets the attribute value for DivisionCode, using the alias name DivisionCode.
     * @return the value of DivisionCode
     */
    public String getDivisionCode() {
        return (String) getAttributeInternal(DIVISIONCODE);
    }

    /**
     * Sets <code>value</code> as the attribute value for DivisionCode.
     * @param value value to set the DivisionCode
     */
    public void setDivisionCode(String value) {
        setAttributeInternal(DIVISIONCODE, value);
    }

    /**
     * Gets the attribute value for DivFlexValueId, using the alias name DivFlexValueId.
     * @return the value of DivFlexValueId
     */
    public Number getDivFlexValueId() {
        return (Number) getAttributeInternal(DIVFLEXVALUEID);
    }

    /**
     * Sets <code>value</code> as the attribute value for DivFlexValueId.
     * @param value value to set the DivFlexValueId
     */
    public void setDivFlexValueId(Number value) {
        setAttributeInternal(DIVFLEXVALUEID, value);
    }

    /**
     * Gets the attribute value for Division, using the alias name Division.
     * @return the value of Division
     */
    public String getDivision() {
        return (String) getAttributeInternal(DIVISION);
    }

    /**
     * Sets <code>value</code> as the attribute value for Division.
     * @param value value to set the Division
     */
    public void setDivision(String value) {
        setAttributeInternal(DIVISION, value);
    }


    /**
     * @param docSequenceId key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(Number docSequenceId) {
        return new Key(new Object[] { docSequenceId });
    }

    /**
     * Add attribute defaulting logic in this method.
     * @param attributeList list of attribute names/values to initialize the row
     */
    protected void create(AttributeList attributeList) {
        super.create(attributeList);
        
        SequenceImpl seq = new SequenceImpl("xxads_document_sequence_s", this.getDBTransaction());
        setDocSequenceId(seq.getSequenceNumber());
    }
}

