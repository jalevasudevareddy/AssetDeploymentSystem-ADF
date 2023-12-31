package model.entity;

import java.math.BigDecimal;

import java.sql.Timestamp;

import java.util.Map;

import oracle.adf.share.ADFContext;

import oracle.jbo.AttributeList;
import oracle.jbo.Key;
import oracle.jbo.domain.Date;
import oracle.jbo.domain.Number;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.SequenceImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Wed Oct 26 14:46:41 IST 2022
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class XxadsAssetCertificationsEOImpl extends EntityImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    protected enum AttributesEnum {
        CertificateId,
        AssetId,
        CertificationType,
        ReferenceNo,
        ValidFromDate,
        ValidToDate,
        ValidityCheck,
        Remarks,
        CreationDate,
        CreatedBy,
        LastUpdateDate,
        LastUpdatedBy,
        ObjectVersionNumber;
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

    public static final int CERTIFICATEID = AttributesEnum.CertificateId.index();
    public static final int ASSETID = AttributesEnum.AssetId.index();
    public static final int CERTIFICATIONTYPE = AttributesEnum.CertificationType.index();
    public static final int REFERENCENO = AttributesEnum.ReferenceNo.index();
    public static final int VALIDFROMDATE = AttributesEnum.ValidFromDate.index();
    public static final int VALIDTODATE = AttributesEnum.ValidToDate.index();
    public static final int VALIDITYCHECK = AttributesEnum.ValidityCheck.index();
    public static final int REMARKS = AttributesEnum.Remarks.index();
    public static final int CREATIONDATE = AttributesEnum.CreationDate.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int LASTUPDATEDATE = AttributesEnum.LastUpdateDate.index();
    public static final int LASTUPDATEDBY = AttributesEnum.LastUpdatedBy.index();
    public static final int OBJECTVERSIONNUMBER = AttributesEnum.ObjectVersionNumber.index();

    /**
     * This is the default constructor (do not remove).
     */
    public XxadsAssetCertificationsEOImpl() {
    }
    
    @Override
    protected Object getHistoryContextForAttribute(AttributeDefImpl attr) {
            if (attr.getHistoryKind() == USERNAME_HISTORY_TYPE) {
                    // Custom History type logic goes here
                    return (String)((Map)ADFContext.getCurrent().getSessionScope().get("userMap")).get("UserName");
            }
            return super.getHistoryContextForAttribute(attr);
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("model.entity.XxadsAssetCertificationsEO");
    }


    /**
     * Gets the attribute value for CertificateId, using the alias name CertificateId.
     * @return the value of CertificateId
     */
    public oracle.jbo.domain.Number getCertificateId() {
        return (oracle.jbo.domain.Number) getAttributeInternal(CERTIFICATEID);
    }

    /**
     * Sets <code>value</code> as the attribute value for CertificateId.
     * @param value value to set the CertificateId
     */
    public void setCertificateId(oracle.jbo.domain.Number value) {
        setAttributeInternal(CERTIFICATEID, value);
    }

    /**
     * Gets the attribute value for AssetId, using the alias name AssetId.
     * @return the value of AssetId
     */
    public Number getAssetId() {
        return (Number) getAttributeInternal(ASSETID);
    }

    /**
     * Sets <code>value</code> as the attribute value for AssetId.
     * @param value value to set the AssetId
     */
    public void setAssetId(Number value) {
        setAttributeInternal(ASSETID, value);
    }

    /**
     * Gets the attribute value for CertificationType, using the alias name CertificationType.
     * @return the value of CertificationType
     */
    public String getCertificationType() {
        return (String) getAttributeInternal(CERTIFICATIONTYPE);
    }

    /**
     * Sets <code>value</code> as the attribute value for CertificationType.
     * @param value value to set the CertificationType
     */
    public void setCertificationType(String value) {
        setAttributeInternal(CERTIFICATIONTYPE, value);
    }

    /**
     * Gets the attribute value for ReferenceNo, using the alias name ReferenceNo.
     * @return the value of ReferenceNo
     */
    public String getReferenceNo() {
        return (String) getAttributeInternal(REFERENCENO);
    }

    /**
     * Sets <code>value</code> as the attribute value for ReferenceNo.
     * @param value value to set the ReferenceNo
     */
    public void setReferenceNo(String value) {
        setAttributeInternal(REFERENCENO, value);
    }

    /**
     * Gets the attribute value for ValidFromDate, using the alias name ValidFromDate.
     * @return the value of ValidFromDate
     */
    public Date getValidFromDate() {
        return (Date) getAttributeInternal(VALIDFROMDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for ValidFromDate.
     * @param value value to set the ValidFromDate
     */
    public void setValidFromDate(Date value) {
        setAttributeInternal(VALIDFROMDATE, value);
    }

    /**
     * Gets the attribute value for ValidToDate, using the alias name ValidToDate.
     * @return the value of ValidToDate
     */
    public Date getValidToDate() {
        return (Date) getAttributeInternal(VALIDTODATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for ValidToDate.
     * @param value value to set the ValidToDate
     */
    public void setValidToDate(Date value) {
        setAttributeInternal(VALIDTODATE, value);
    }

    /**
     * Gets the attribute value for ValidityCheck, using the alias name ValidityCheck.
     * @return the value of ValidityCheck
     */
    public String getValidityCheck() {
        return (String) getAttributeInternal(VALIDITYCHECK);
    }

    /**
     * Sets <code>value</code> as the attribute value for ValidityCheck.
     * @param value value to set the ValidityCheck
     */
    public void setValidityCheck(String value) {
        setAttributeInternal(VALIDITYCHECK, value);
    }

    /**
     * Gets the attribute value for Remarks, using the alias name Remarks.
     * @return the value of Remarks
     */
    public String getRemarks() {
        return (String) getAttributeInternal(REMARKS);
    }

    /**
     * Sets <code>value</code> as the attribute value for Remarks.
     * @param value value to set the Remarks
     */
    public void setRemarks(String value) {
        setAttributeInternal(REMARKS, value);
    }

    /**
     * Gets the attribute value for CreationDate, using the alias name CreationDate.
     * @return the value of CreationDate
     */
    public Date getCreationDate() {
        return (Date) getAttributeInternal(CREATIONDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for CreationDate.
     * @param value value to set the CreationDate
     */
    public void setCreationDate(Date value) {
        setAttributeInternal(CREATIONDATE, value);
    }

    /**
     * Gets the attribute value for CreatedBy, using the alias name CreatedBy.
     * @return the value of CreatedBy
     */
    public String getCreatedBy() {
        return (String) getAttributeInternal(CREATEDBY);
    }

    /**
     * Sets <code>value</code> as the attribute value for CreatedBy.
     * @param value value to set the CreatedBy
     */
    public void setCreatedBy(String value) {
        setAttributeInternal(CREATEDBY, value);
    }

    /**
     * Gets the attribute value for LastUpdateDate, using the alias name LastUpdateDate.
     * @return the value of LastUpdateDate
     */
    public Date getLastUpdateDate() {
        return (Date) getAttributeInternal(LASTUPDATEDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for LastUpdateDate.
     * @param value value to set the LastUpdateDate
     */
    public void setLastUpdateDate(Date value) {
        setAttributeInternal(LASTUPDATEDATE, value);
    }

    /**
     * Gets the attribute value for LastUpdatedBy, using the alias name LastUpdatedBy.
     * @return the value of LastUpdatedBy
     */
    public String getLastUpdatedBy() {
        return (String) getAttributeInternal(LASTUPDATEDBY);
    }

    /**
     * Sets <code>value</code> as the attribute value for LastUpdatedBy.
     * @param value value to set the LastUpdatedBy
     */
    public void setLastUpdatedBy(String value) {
        setAttributeInternal(LASTUPDATEDBY, value);
    }

    /**
     * Gets the attribute value for ObjectVersionNumber, using the alias name ObjectVersionNumber.
     * @return the value of ObjectVersionNumber
     */
    public Number getObjectVersionNumber() {
        return (Number) getAttributeInternal(OBJECTVERSIONNUMBER);
    }

    /**
     * Sets <code>value</code> as the attribute value for ObjectVersionNumber.
     * @param value value to set the ObjectVersionNumber
     */
    public void setObjectVersionNumber(Number value) {
        setAttributeInternal(OBJECTVERSIONNUMBER, value);
    }


    /**
     * @param certificateId key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(Number certificateId) {
        return new Key(new Object[] { certificateId });
    }

    /**
     * Add attribute defaulting logic in this method.
     * @param attributeList list of attribute names/values to initialize the row
     */
    protected void create(AttributeList attributeList) {
        super.create(attributeList);
        SequenceImpl seq = new SequenceImpl("xxads_asset_operator_s", this.getDBTransaction());
        setCertificateId(seq.getSequenceNumber());
    }
}

