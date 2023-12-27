package model.applicationModule;


import java.util.Map;

import model.applicationModule.common.SetupAM;

import model.lov.WeekDaysLOVImpl;

import model.lov.WeekDaysLOVRowImpl;

import model.progview.TransAccParamsSearchVOImpl;
import model.progview.TransAccParamsSearchVORowImpl;
import model.progview.TransAccessSecuritySearchVOImpl;
import model.progview.TransAccessSecuritySearchVORowImpl;
import model.progview.TransBuVOImpl;
import model.progview.TransBuVORowImpl;
import model.progview.TransDocumentSeqSearchVOImpl;
import model.progview.TransDocumentSeqSearchVORowImpl;
import model.progview.TransEmpCatBuVOImpl;
import model.progview.TransEmpCatBuVORowImpl;
import model.progview.TransExceptionDaysSearchVOImpl;

import model.progview.TransHiringBasisSearchVOImpl;
import model.progview.TransRentalMasterSearchVOImpl;


import model.progview.TransTemplateVOImpl;

import model.searchview.TransEmpMasterSearchVOImpl;

import model.view.AllEmployeesValidateVOImpl;
import model.view.AssetAccessoriesVOImpl;
import model.view.AssetAttributeVOImpl;
import model.view.AssetAttributeValidateVOImpl;
import model.view.AssetCategoryVOImpl;
import model.view.AssetCategoryValidateVOImpl;
import model.view.BuAccParamsValidateVOImpl;
import model.view.BuAccountingParamsVOImpl;
import model.view.DivisionAccountMapVOImpl;
import model.view.DivisionAccountMapValidateVOImpl;
import model.view.DocumentSequenceVOImpl;
import model.view.DocumentSequenceValidateVOImpl;
import model.view.EmpAsstCatMapVOImpl;
import model.view.EmpAsstCatMapValidateVOImpl;
import model.view.EmpCatVOImpl;
import model.view.EmpCatValidateVOImpl;
import model.view.EmpRepCatEOImpl;
import model.view.EmpRepCatValidateVOImpl;
import model.view.EmployeeActiveAssetVOImpl;
import model.view.EmployeeCertificationsVOImpl;
import model.view.EmployeeCertificationsValidateVOImpl;
import model.view.EmployeeMasterVOImpl;
import model.view.EmployeeMasterValidateVOImpl;
import model.view.ExceptionDaysVOImpl;
import model.view.GroupCustomerMapVOImpl;
import model.view.GroupCustomerMapValidateVOImpl;
import model.view.HiringBasisRulesVOImpl;
import model.view.HiringBasisValidateVOImpl;
import model.view.LookupTypeValidateVOImpl;
import model.view.LookupTypesVOImpl;
import model.view.LookupValuesVOImpl;

import model.progview.TransExceptionDaysSearchVORowImpl;

import model.progview.TransHiringBasisSearchVORowImpl;

import model.searchview.AssetMasterSearchVOImpl;

import model.searchview.AssetMasterSearchVORowImpl;
import model.searchview.AssetMstrAttrsPopulateVOImpl;

import model.searchview.AssetMstrAttrsPopulateVORowImpl;

import model.searchview.TransAssetMasterSearchVOImpl;

import model.searchview.TransAssetMasterSearchVORowImpl;

import model.progview.TransRentalMasterSearchVORowImpl;

import model.progview.TransTemplateVORowImpl;

import model.searchview.TransEmpMasterSearchVORowImpl;

import model.view.AccessSecurityHdrVOImpl;
import model.view.AccessSecurityHdrVORowImpl;
import model.view.AccessSecurityHdrValidateVOImpl;
import model.view.AccessSecurityHdrValidateVORowImpl;
import model.view.AccessSecurityLinesVOImpl;
import model.view.AccessSecurityLinesVORowImpl;
import model.view.AccessSecurityLinesValidateVOImpl;
import model.view.AccessSecurityLinesValidateVORowImpl;
import model.view.AssetAccessoriesVORowImpl;
import model.view.AssetAttributeVOImpl;
import model.view.AssetAttributeVORowImpl;
import model.view.AssetAttributeValidateVOImpl;
import model.view.AssetAttributeValidateVORowImpl;
import model.view.AssetCategoryVOImpl;
import model.view.AssetCategoryVORowImpl;
import model.view.AssetCategoryValidateVOImpl;
import model.view.AssetCategoryValidateVORowImpl;
import model.view.AssetCertificationsVOImpl;
import model.view.AssetCertificationsVORowImpl;
import model.view.AssetHierarchyVOImpl;
import model.view.AssetHierarchyVORowImpl;
import model.view.AssetMasterAttributesVOImpl;
import model.view.AssetMasterAttributesVORowImpl;
import model.view.AssetMasterVOImpl;
import model.view.AssetMasterVORowImpl;
import model.view.AssetOperatorVOImpl;
import model.view.AssetOperatorVORowImpl;
import model.view.BuAccParamsValidateVOImpl;
import model.view.BuAccParamsValidateVORowImpl;
import model.view.BuAccountingParamsVOImpl;
import model.view.BuAccountingParamsVORowImpl;
import model.view.DivisionAccountMapVORowImpl;
import model.view.DivisionAccountMapValidateVORowImpl;
import model.view.DocumentSequenceVORowImpl;
import model.view.DocumentSequenceValidateVORowImpl;
import model.view.EmpAsstCatMapVOImpl;
import model.view.EmpAsstCatMapVORowImpl;
import model.view.EmpAsstCatMapValidateVOImpl;
import model.view.EmpAsstCatMapValidateVORowImpl;
import model.view.EmpCatVOImpl;
import model.view.EmpCatVORowImpl;
import model.view.EmpCatValidateVOImpl;
import model.view.EmpCatValidateVORowImpl;
import model.view.EmpRepCatEOImpl;
import model.view.EmpRepCatEORowImpl;
import model.view.EmpRepCatValidateVOImpl;
import model.view.EmpRepCatValidateVORowImpl;
import model.view.EmployeeActiveAssetVORowImpl;
import model.view.EmployeeCertificationsVORowImpl;
import model.view.EmployeeCertificationsValidateVORowImpl;
import model.view.EmployeeMasterVORowImpl;
import model.view.EmployeeMasterValidateVORowImpl;
import model.view.ExceptionDaysVOImpl;
import model.view.ExceptionDaysVORowImpl;
import model.view.GroupCustomerMapVOImpl;
import model.view.GroupCustomerMapVORowImpl;
import model.view.GroupCustomerMapValidateVOImpl;
import model.view.GroupCustomerMapValidateVORowImpl;
import model.view.HiringBasisRulesVOImpl;

import model.view.HiringBasisRulesVORowImpl;
import model.view.LookupTypeValidateVOImpl;
import model.view.LookupTypeValidateVORowImpl;
import model.view.LookupTypesVOImpl;
import model.view.LookupTypesVORowImpl;
import model.view.LookupValuesVOImpl;
import model.view.LookupValuesVORowImpl;
import model.view.LookupValuesValidateVOImpl;
import model.view.LookupValuesValidateVORowImpl;
import model.view.RentalMasterVOImpl;
import model.view.RentalMasterVORowImpl;
import model.view.RentalMasterValidateVOImpl;
import model.view.RentalMasterValidateVORowImpl;
import model.view.ReplacementCategoryVOImpl;
import model.view.ReplacementCategoryVORowImpl;
import model.view.ReplacementCategoryValidateVOImpl;
import model.view.ReplacementCategoryValidateVORowImpl;
import model.view.SpecialWorkingDaysVOImpl;
import model.view.SpecialWorkingDaysVORowImpl;
import model.view.SpecialWorkingDaysValidateVOImpl;

import model.view.SpecialWorkingDaysValidateVORowImpl;
import model.view.SystemOptionsVOImpl;
import model.view.SystemOptionsVORowImpl;
import model.view.TermsCondsTemplateVOImpl;
import model.view.TermsCondsTemplateVORowImpl;
import model.view.WeekOffDaysVOImpl;

import model.view.WeekOffDaysVORowImpl;

import oracle.adf.share.ADFContext;

import oracle.jbo.RowSetIterator;
import oracle.jbo.domain.Date;
import oracle.jbo.server.ApplicationModuleImpl;
import oracle.jbo.server.SequenceImpl;
import oracle.jbo.server.ViewLinkImpl;
import oracle.jbo.server.ViewObjectImpl;


// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Mon Oct 10 17:24:25 IST 2022
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class SetupAMImpl extends ApplicationModuleImpl implements SetupAM {
    /**
     * This is the default constructor (do not remove).
     */
    public SetupAMImpl() {
    }

    /**
     * Container's getter for LookupTypesVO1.
     * @return LookupTypesVO1
     */
    public LookupTypesVOImpl getLookupTypesVO1() {
        return (LookupTypesVOImpl) findViewObject("LookupTypesVO1");
    }

    /**
     * Container's getter for LookupValuesVO1.
     * @return LookupValuesVO1
     */
    public LookupValuesVOImpl getLookupValuesVO1() {
        return (LookupValuesVOImpl) findViewObject("LookupValuesVO1");
    }

    /**
     * Container's getter for LookupHdrToLinesVL1.
     * @return LookupHdrToLinesVL1
     */
    public ViewLinkImpl getLookupHdrToLinesVL1() {
        return (ViewLinkImpl) findViewLink("LookupHdrToLinesVL1");
    }

    /**
     * Container's getter for SystemOptionsVO1.
     * @return SystemOptionsVO1
     */
    public SystemOptionsVOImpl getSystemOptionsVO1() {
        return (SystemOptionsVOImpl) findViewObject("SystemOptionsVO1");
    }
    
    public void addSystemOptions() 
    {
        try 
        {
            SystemOptionsVORowImpl  newRow = (SystemOptionsVORowImpl) getSystemOptionsVO1().createRow();
            getSystemOptionsVO1().insertRow(newRow);           
            newRow.setActiveFlag("Y");
        }
        catch(Exception e) 
        {
            e.printStackTrace();    
        }
    }
    
    public String validateSystemBU() 
    {
        String msg = "Success";
        try 
        {
            SystemOptionsVORowImpl currRow = (SystemOptionsVORowImpl) getSystemOptionsVO1().getCurrentRow();
            getSystemOptionsVO2().setApplyViewCriteriaName("SystemOptionsVOCriteria");
           getSystemOptionsVO2().setNamedWhereClauseParam("p_bu_id", currRow.getBuId());
            getSystemOptionsVO2().setNamedWhereClauseParam("p_sys_id", currRow.getSystemId());
           getSystemOptionsVO2().executeQuery();
            
            if(getSystemOptionsVO2().getRowCount() > 0) 
            {
                currRow.setBuId(null);
                currRow.setTransBuName(null);
                return "Entered Business Unit already exists";
            }
        }
        catch(Exception e) 
        {
            e.printStackTrace();
            return e.getMessage();
        }
        return msg;
    }
    public String LookUpTypeValueChange(){
        String message = "Success";
        try{

            LookupTypesVORowImpl hdrRow = (LookupTypesVORowImpl)getLookupTypesVO1().getCurrentRow();
            LookupValuesVORowImpl currRow =
                (LookupValuesVORowImpl)getLookupValuesVO1().getCurrentRow();
            String  lookupType = hdrRow.getLookupType();
            if(hdrRow.getLookupType().contains("%") || hdrRow.getLookupType().contains("&")){
                hdrRow.setLookupType(null);
                return "LookUp Type "+lookupType+" contains '%' or '&', which is not allowed. Enter a Unique LookUp Type";
            }else{
                    getLookupTypeValidateVO1().setApplyViewCriteriaName(null);
                    getLookupTypeValidateVO1().executeQuery();
                    
                    getLookupTypeValidateVO1().setApplyViewCriteriaName("LookupTypeValidateVOCriteria");
                    getLookupTypeValidateVO1().setNamedWhereClauseParam("p_application_id",hdrRow.getApplicationId());
                    getLookupTypeValidateVO1().setNamedWhereClauseParam("p_lookup_type",hdrRow.getLookupType());
                    getLookupTypeValidateVO1().setNamedWhereClauseParam("p_lookup_type_id",hdrRow.getLookupTypeId());                      
                    getLookupTypeValidateVO1().executeQuery();
                    
                    Long rowCount = getLookupTypeValidateVO1().getEstimatedRowCount();
                        if(rowCount >= 1){
                            LookupTypeValidateVORowImpl lookupRow = (LookupTypeValidateVORowImpl)getLookupTypeValidateVO1().first();
                            String  lookupCode = lookupRow.getLookupType();
                            hdrRow.setLookupType(null);
                            return "LookUp Type "+lookupCode+" already exists. Enter a Unique LookUp Type";
                            
                        }   
            }
        }catch(Exception e){
        message = e.getMessage();
        e.printStackTrace();
        }
        return message;
    }
    public void addLokupLine(){
        try {
            LookupTypesVORowImpl hdrRow = (LookupTypesVORowImpl)getLookupTypesVO1().getCurrentRow();
            LookupValuesVORowImpl lineRow =
                (LookupValuesVORowImpl)getLookupValuesVO1().createRow();
            lineRow.setApplicationId(hdrRow.getApplicationId());
            lineRow.setApplicationCode(hdrRow.getApplicationCode());
            lineRow.setLookupType(hdrRow.getLookupType());
            //lineRow.setStartDate(hdrRow.getStartDate());
            getLookupValuesVO1().insertRow(lineRow);
            getLookupValuesVO1().executeQuery();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public String DeleteLookupLine(){
        String message = "Success";
        try{

            LookupTypesVORowImpl hdrRow = (LookupTypesVORowImpl)getLookupTypesVO1().getCurrentRow();
            LookupValuesVORowImpl currRow =
                (LookupValuesVORowImpl)getLookupValuesVO1().getCurrentRow();
            if(currRow!=null && currRow.getEntity(0).getEntityState() == 0){
                currRow.remove();
    //                getLookupValuesVO1().executeQuery();
            }else if(currRow.getEntity(0).getEntityState() != 0){
                return "Record already Saved. Can't be deleted.";
            }
        }catch(Exception e){
        message = e.getMessage();
        e.printStackTrace();
        }
        return message;
    }
    public String lookUpCodeValueChange(){
        String message = "Success";
        try{

            LookupTypesVORowImpl hdrRow = (LookupTypesVORowImpl)getLookupTypesVO1().getCurrentRow();
            LookupValuesVORowImpl currRow =
                (LookupValuesVORowImpl)getLookupValuesVO1().getCurrentRow();
                
                    getLookupValuesValidateVO1().setApplyViewCriteriaName(null);
                    getLookupValuesValidateVO1().executeQuery();
                    
                    getLookupValuesValidateVO1().setApplyViewCriteriaName("LookupValuesValidateVOCriteria");
                    getLookupValuesValidateVO1().setNamedWhereClauseParam("p_application_id",currRow.getApplicationId());
                    getLookupValuesValidateVO1().setNamedWhereClauseParam("p_lookup_code",currRow.getLookupCode());
                    getLookupValuesValidateVO1().setNamedWhereClauseParam("p_lookup_code_id",currRow.getLookupCodeId());  
                    getLookupValuesValidateVO1().setNamedWhereClauseParam("p_lookup_type",currRow.getLookupType());
                    getLookupValuesValidateVO1().executeQuery();
                    
                    Long rowCount = getLookupValuesValidateVO1().getEstimatedRowCount();
                        if(rowCount >= 1){
                            LookupValuesValidateVORowImpl lookupRow = (LookupValuesValidateVORowImpl)getLookupValuesValidateVO1().first();
                            String  lookupCode = lookupRow.getLookupCode();
                            String looupType = lookupRow.getLookupType();
                            currRow.setLookupCode(null);
                            return "LookUp Code "+lookupCode+" already exists for the LookUp Type "+looupType+". Please give another Lookup Code";
                            
                        }
            message = "Success";
        
        }catch(Exception e){
        message = e.getMessage();
        e.printStackTrace();
        }
        return message;
    }
    /**
     * Container's getter for SystemOptionsVO2.
     * @return SystemOptionsVO2
     */
    public SystemOptionsVOImpl getSystemOptionsVO2() {
        return (SystemOptionsVOImpl) findViewObject("SystemOptionsVO2");
    }
    
    public String saveSystemOptions() 
    {
        String msg = "Success";
        try 
        {
            RowSetIterator itr = getSystemOptionsVO1().createRowSetIterator(null);     
            while(itr.hasNext()) 
            {
                SystemOptionsVORowImpl currRow = (SystemOptionsVORowImpl) itr.next();
                if(currRow.getEntity(0).getEntityState() == 0 || currRow.getEntity(0).getEntityState() == 2)
                {
                    if(!("Y".equals(currRow.getActiveFlag())))
                    {
                        Date d = new Date();
                        currRow.setInactiveDate((Date)d.getCurrentDate());
                        currRow.setDivisionRequired("N");
                    }
                    else if("Y".equals(currRow.getActiveFlag())) 
                    {
                        currRow.setInactiveDate(null);    
                    }
                }
            }
        }
        catch(Exception e) 
        {
            e.printStackTrace();    
            return e.getMessage();
        }
        return msg;
    }
    
    public String empCatCodeValChList()
    {
        String message="Success";
        try {
            EmpCatVOImpl table=getEmpCatVO1();
            EmpCatVORowImpl row = (EmpCatVORowImpl) table.getCurrentRow();
            
            EmpCatValidateVOImpl validateTable=getEmpCatValidateVO1();
            validateTable.setApplyViewCriteriaName(null);
            validateTable.executeQuery();
            validateTable.setApplyViewCriteriaName("EmpCatValidateVOCriteria");
            validateTable.setNamedWhereClauseParam("p_bu_id", row.getBuId());
           validateTable.setNamedWhereClauseParam("p_emp_category_code", row.getEmpCategoryCode());
           validateTable.setNamedWhereClauseParam("p_emp_category_id", row.getEmpCategoryId());
            validateTable.executeQuery();
            EmpCatValidateVORowImpl validateRow = (EmpCatValidateVORowImpl) validateTable.first();
            if(validateRow!=null)
            {
                row.setEmpCategoryCode(null);
                return "Employee Category Code already exists. Please enter a unique value.";
            }
       } catch (Exception e) {
            message=e.getMessage();
            e.printStackTrace();
        }
        return message;
    }
    /**
     * Container's getter for LookupTypeValidateVO1.
     * @return LookupTypeValidateVO1
     */
    public LookupTypeValidateVOImpl getLookupTypeValidateVO1() {
        return (LookupTypeValidateVOImpl) findViewObject("LookupTypeValidateVO1");
    }

    /**
     * Container's getter for LookupValuesValidateVO1.
     * @return LookupValuesValidateVO1
     */
    public LookupValuesValidateVOImpl getLookupValuesValidateVO1() {
        return (LookupValuesValidateVOImpl) findViewObject("LookupValuesValidateVO1");
    }

    /**
     * Container's getter for TransExceptionDaysSearchVO1.
     * @return TransExceptionDaysSearchVO1
     */
    public TransExceptionDaysSearchVOImpl getTransExceptionDaysSearchVO1() {
        return (TransExceptionDaysSearchVOImpl) findViewObject("TransExceptionDaysSearchVO1");
    }

    public void createTransWeekExceptionDaysSearch(){
        try
        {
            getTransExceptionDaysSearchVO1().executeQuery();
                       
            TransExceptionDaysSearchVORowImpl transRow = (TransExceptionDaysSearchVORowImpl) getTransExceptionDaysSearchVO1().createRow();
            getTransExceptionDaysSearchVO1().insertRow(transRow);
            
            getExceptionDaysVO1().executeEmptyRowSet();
            getWeekOffDaysVO1().executeEmptyRowSet(); 
            getSpecialWorkingDaysVO1().executeEmptyRowSet();
            
            
        }catch(Exception e){
            e.printStackTrace();
        }
    }


    /**
     * Container's getter for ExceptionDaysVO1.
     * @return ExceptionDaysVO1
     */
    public ExceptionDaysVOImpl getExceptionDaysVO1() {
        return (ExceptionDaysVOImpl) findViewObject("ExceptionDaysVO1");
    }

    /**
     * Container's getter for SpecialWorkingDaysVO1.
     * @return SpecialWorkingDaysVO1
     */
    public SpecialWorkingDaysVOImpl getSpecialWorkingDaysVO1() {
        return (SpecialWorkingDaysVOImpl) findViewObject("SpecialWorkingDaysVO1");
    }

    /**
     * Container's getter for WeekOffDaysVO1.
     * @return WeekOffDaysVO1
     */
    public WeekOffDaysVOImpl getWeekOffDaysVO1() {
        return (WeekOffDaysVOImpl) findViewObject("WeekOffDaysVO1");
    }
    
    public String searchWeekExceptionDays() 
    {
        String msg = "Success";
        try 
        {
            TransExceptionDaysSearchVORowImpl transRow = (TransExceptionDaysSearchVORowImpl) getTransExceptionDaysSearchVO1().getCurrentRow();
            if(transRow.getTransBuId() != null) 
            {
               
                getExceptionDaysVO1().setApplyViewCriteriaName(null);
                getExceptionDaysVO1().executeQuery();
                
                getExceptionDaysVO1().setApplyViewCriteriaName("ExceptionDaysVOCriteria");
                getExceptionDaysVO1().setNamedWhereClauseParam("p_bu_id",transRow.getTransBuId());
                getExceptionDaysVO1().executeQuery();
                
                getWeekOffDaysVO1().setApplyViewCriteriaName(null);
                getWeekOffDaysVO1().executeQuery();
                
                getWeekOffDaysVO1().setApplyViewCriteriaName("WeekOffDaysVOCriteria");
                getWeekOffDaysVO1().setNamedWhereClauseParam("p_bu_id",transRow.getTransBuId());
                getWeekOffDaysVO1().executeQuery();
                if(getWeekOffDaysVO1().getRowCount() == 0) 
                {
                    insertWeekoffDays(transRow.getTransBuId());
                }
                
                getSpecialWorkingDaysVO1().setApplyViewCriteriaName(null);
                getSpecialWorkingDaysVO1().executeQuery();
                
                getSpecialWorkingDaysVO1().setApplyViewCriteriaName("SpecialWorkingDaysVOCriteria");
                getSpecialWorkingDaysVO1().setNamedWhereClauseParam("p_bu_id",transRow.getTransBuId());
                getSpecialWorkingDaysVO1().executeQuery();
                
            }
            else 
            {
                getExceptionDaysVO1().executeEmptyRowSet();
                getWeekOffDaysVO1().executeEmptyRowSet();
                getSpecialWorkingDaysVO1().executeEmptyRowSet();
                return "Please enter business unit";    
            }
        }
        catch(Exception e) 
        {
            e.printStackTrace();
            return e.getMessage();
        }
        return msg;
    }
    
    
    public void addExceptionDay() 
    {
        try 
        {
            TransExceptionDaysSearchVORowImpl transRow = (TransExceptionDaysSearchVORowImpl) getTransExceptionDaysSearchVO1().getCurrentRow();
            if(transRow != null) 
            {
                ExceptionDaysVORowImpl newRow = (ExceptionDaysVORowImpl) getExceptionDaysVO1().createRow();
                getExceptionDaysVO1().insertRow(newRow);
                newRow.setBuId(transRow.getTransBuId());
            }
        }
        catch(Exception e) 
        {
            e.printStackTrace();    
        }
    }
    
    public void addSpecialWorkingDays() 
    {
        try 
        {
            TransExceptionDaysSearchVORowImpl transRow = (TransExceptionDaysSearchVORowImpl) getTransExceptionDaysSearchVO1().getCurrentRow();
            if(transRow != null) 
            {
                SpecialWorkingDaysVORowImpl newRow = (SpecialWorkingDaysVORowImpl) getSpecialWorkingDaysVO1().createRow();
                getSpecialWorkingDaysVO1().insertRow(newRow);
                newRow.setBuId(transRow.getTransBuId());
            }
        }
        catch(Exception e) 
        {
            e.printStackTrace();    
        }
    }

    /**
     * Container's getter for WeekOffDaysVO2.
     * @return WeekOffDaysVO2
     */
    public WeekOffDaysVOImpl getWeekOffDaysVO2() {
        return (WeekOffDaysVOImpl) findViewObject("WeekOffDaysVO2");
    }
    
    public String deleteExceptionDay() 
    {
        String msg = "Success";
        try 
        {
            ExceptionDaysVORowImpl currRow = (ExceptionDaysVORowImpl) getExceptionDaysVO1().getCurrentRow();
            if(currRow != null)
            {
                Date d = new Date();
                if(currRow.getExceptionDate() != null && ((oracle.jbo.domain.Date)d.getCurrentDate()).compareTo(currRow.getExceptionDate()) > 0 && currRow.getEntity(0).getEntityState() != 0)
                {
                    return "Back dated records cannot be deleted.";   
                }
                currRow.remove();
            }
            
        }
        catch(Exception e) 
        {
            e.printStackTrace();
            return e.getMessage();
        }
        return msg;
    }
    
    public String deleteSpecialWorkingDay() 
    {
        String msg = "Success";
        try 
        {
            SpecialWorkingDaysVORowImpl currRow = (SpecialWorkingDaysVORowImpl) getSpecialWorkingDaysVO1().getCurrentRow();
            if(currRow != null && currRow.getSpEffectiveStartDate() != null && currRow.getSpEffectiveEndDate() !=null)
            {
                Date d = new Date();
                if( (currRow.getSpEffectiveStartDate() != null &&  ((oracle.jbo.domain.Date)d.getCurrentDate()).compareTo(currRow.getSpEffectiveStartDate()) > 0) || ( currRow.getSpEffectiveEndDate() != null &&((Date)d.getCurrentDate()).compareTo(currRow.getSpEffectiveEndDate()) > 0))
                {
                    return "Back dated records cannot be deleted.";   
                }
                currRow.remove();
            }
            else {
                currRow.remove();
            }
        }
        catch(Exception e) 
        {
            e.printStackTrace();
            return e.getMessage();
        }
        return msg;
    }
    
    
    public String deleteSystemOption() 
    {
        String msg = "Success";
        try 
        {
            SystemOptionsVORowImpl currRow = (SystemOptionsVORowImpl) getSystemOptionsVO1().getCurrentRow();
            if(currRow!=null && currRow.getEntity(0).getEntityState() == 0)
            {
                currRow.remove();
            }
            else 
            {
                return "Saved record cannot be deleted.";    
            }
        }
        catch(Exception e) 
        {
            e.printStackTrace();
            return e.getMessage();
        }
        return msg;
    }
    public String addAssetCategory()
    {
        String message="Success";
        try {
            AssetCategoryVOImpl table=getAssetCategoryVO1();
            AssetCategoryVORowImpl row = (AssetCategoryVORowImpl) table.createRow();
            
            TransBuVOImpl buTable=getTransBuVO1();
            TransBuVORowImpl buRow = (TransBuVORowImpl) buTable.getCurrentRow();
            table.insertRow(row);
            row.setTransBu(buRow.getTransBuName());
            row.setTransMobilization("No");
            row.setMobilizationFlag("N");
            row.setTransUsagePool("Rental");
            row.setUsagePool("R");
            row.setTransInspectionCheck("No");
            row.setInspectionCheck("N");
            row.setTransActiveFlag("Yes");
            row.setActiveFlag("Y");
            
       } catch (Exception e) {
            message=e.getMessage();
            e.printStackTrace();
        }
        return message;
    }
    
    public String addEmpCategory()
    {
        String message="Success";
        try {
            EmpCatVOImpl table=getEmpCatVO1();
            EmpCatVORowImpl row = (EmpCatVORowImpl) table.createRow();
            table.insertRow(row);
       } catch (Exception e) {
            message=e.getMessage();
            e.printStackTrace();
        }
        return message;
    }
    
    public String deleteEmployeeCategory()
    {
        String message="Success";
        try {
            EmpCatVOImpl table=getEmpCatVO1();
            EmpCatVORowImpl row = (EmpCatVORowImpl) table.getCurrentRow();
            
           if(row.getEntity(0).getEntityState() != 0)
           {
               return "Saved rows cannot be deleted.";
           }
            else
           {
                EmpRepCatValidateVOImpl attrTable=getEmpRepCatValidateVO1();
                attrTable.setApplyViewCriteriaName(null);
                attrTable.executeQuery();
                attrTable.setApplyViewCriteriaName("EmpRepCatValidateVOCriteria");
                attrTable.setNamedWhereClauseParam("p_emp_category_id", row.getEmpCategoryId());
                attrTable.executeQuery();
                EmpRepCatValidateVORowImpl attrRow = (EmpRepCatValidateVORowImpl) attrTable.first();
                if(attrRow!=null)
                {
                    return "Please delete replacement categories first.";
                }
                EmpAsstCatMapValidateVOImpl repTable=getEmpAsstCatMapValidateVO1();
                repTable.setApplyViewCriteriaName(null);
                repTable.executeQuery();
                repTable.setApplyViewCriteriaName("EmpAsstCatMapValidateVOCriteria");
                repTable.setNamedWhereClauseParam("p_emp_category_id", row.getEmpCategoryId());
                repTable.executeQuery();
                EmpAsstCatMapValidateVORowImpl repRow = (EmpAsstCatMapValidateVORowImpl) attrTable.first();
                if(repRow!=null)
                {
                   return "Please delete asset category mappings first.";
                }
                
                table.removeCurrentRow();
            }
       } catch (Exception e) {
            message=e.getMessage();
            e.printStackTrace();
        }
        return message;
    }
    
    public String deleteAssetCategory()
    {
        String message="Success";
        try {
            AssetCategoryVOImpl table=getAssetCategoryVO1();
            AssetCategoryVORowImpl row = (AssetCategoryVORowImpl) table.getCurrentRow();
            
            if(row.getEntity(0).getEntityState() != 0)
            {
                return "Saved rows cannot be deleted.";
            }
            else
            {
                AssetAttributeValidateVOImpl attrTable=getAssetAttributeValidateVO1();
                attrTable.setApplyViewCriteriaName(null);
                attrTable.executeQuery();
                attrTable.setApplyViewCriteriaName("AssetAttributeValidateVOCriteria");
                attrTable.setNamedWhereClauseParam("p_category_id", row.getCategoryId());
                attrTable.executeQuery();
                AssetAttributeValidateVORowImpl attrRow = (AssetAttributeValidateVORowImpl) attrTable.first();
                if(attrRow!=null)
                {
                    return "Please delete asset attributes first.";
                }
                ReplacementCategoryValidateVOImpl repTable=getReplacementCategoryValidateVO1();
                repTable.setApplyViewCriteriaName(null);
                repTable.executeQuery();
                repTable.setApplyViewCriteriaName("ReplacementCategoryValidateVOCriteria");
                repTable.setNamedWhereClauseParam("p_category_id", row.getCategoryId());
                repTable.executeQuery();
                ReplacementCategoryValidateVORowImpl repRow = (ReplacementCategoryValidateVORowImpl) attrTable.first();
                if(repRow!=null)
                {
                   return "Please delete replacement categories first.";
                }
                
                table.removeCurrentRow();
            }
            
       } catch (Exception e) {
            message=e.getMessage();
            e.printStackTrace();
        }
        return message;
    }

    /**
     * Container's getter for HiringBasisRulesVO1.
     * @return HiringBasisRulesVO1
     */
    public HiringBasisRulesVOImpl getHiringBasisRulesVO1() {
        return (HiringBasisRulesVOImpl) findViewObject("HiringBasisRulesVO1");
    }
    
    public String createTransHiringBasisSearch(){
        String message = "Success";
        try {
            getTransHiringBasisSearchVO1().executeQuery();
            TransHiringBasisSearchVORowImpl searchRow =
                (TransHiringBasisSearchVORowImpl) getTransHiringBasisSearchVO1().first();
            if(searchRow != null){
                searchRow.remove();
            }
            searchRow = (TransHiringBasisSearchVORowImpl) getTransHiringBasisSearchVO1().createRow();
            getTransHiringBasisSearchVO1().insertRow(searchRow);
            ADFContext.getCurrent().getPageFlowScope().put("isHiringBasisChanged","N");
        }catch (Exception e) {
            e.printStackTrace();
            message = e.getMessage();
        }
        return message;
    }
    
    public String hbrSearchBuChange(){
        String message = "Success";
        try {
            TransHiringBasisSearchVORowImpl searchRow =
                (TransHiringBasisSearchVORowImpl) getTransHiringBasisSearchVO1().getCurrentRow();
            if(searchRow != null){
                if(!"Y".equals(searchRow.getTransSrcDivRequired())){
                    getHiringBasisRulesVO1().setNamedWhereClauseParam("p_bu_id", searchRow.getTransSrcBuId());
                    getHiringBasisRulesVO1().setNamedWhereClauseParam("p_div_flex_val_id", searchRow.getTransDivFlexValueId());
                    getHiringBasisRulesVO1().executeQuery();
                }else{
                    searchRow.setTransDivision(null);
                    searchRow.setTransDivFlexValueId(null);
                }
            }
        }catch (Exception e) {
            e.printStackTrace();
            message = e.getMessage();
        }
        return message;
    }    
    
    public String hbrSearchDivChange(){
        String message = "Success";
        try {
            TransHiringBasisSearchVORowImpl searchRow =
                (TransHiringBasisSearchVORowImpl) getTransHiringBasisSearchVO1().getCurrentRow();
            if(searchRow != null){
                if("Y".equals(searchRow.getTransSrcDivRequired())){
                    getHiringBasisRulesVO1().setNamedWhereClauseParam("p_bu_id", searchRow.getTransSrcBuId());
                    getHiringBasisRulesVO1().setNamedWhereClauseParam("p_div_flex_val_id", searchRow.getTransDivFlexValueId());
                    getHiringBasisRulesVO1().executeQuery();
                }
            }
        }catch (Exception e) {
            e.printStackTrace();
            message = e.getMessage();
        }
        return message;
    }
    
    public String createHiringBasisRule(){
        String message = "Success";
        try {
            TransHiringBasisSearchVORowImpl searchRow =
                (TransHiringBasisSearchVORowImpl) getTransHiringBasisSearchVO1().getCurrentRow();
            if(searchRow != null && searchRow.getTransSrcBuId() != null){
                if("Y".equals(searchRow.getTransSrcDivRequired()) && searchRow.getTransDivision() == null){
                    return "Please provide Division to add Hiring Basis";
                }else{
                    HiringBasisRulesVOImpl hiringVO = getHiringBasisRulesVO1();
                    HiringBasisRulesVORowImpl newRow = (HiringBasisRulesVORowImpl) hiringVO.createRow();
                    hiringVO.insertRow(newRow);
                    newRow.setBuId(searchRow.getTransSrcBuId());
                    newRow.setDivision(searchRow.getTransDivision());
                    newRow.setDivFlexValueId(searchRow.getTransDivFlexValueId());                    
                }
            }else{
                return "Please provide Business Unit to add Hiring Basis";
            }
        }catch (Exception e) {
            message = e.getMessage();
            e.printStackTrace();
        }
        return message;
    }
    
    public void insertWeekoffDays(oracle.jbo.domain.Number bu_id) 
    {
        try 
        {
            getWeekDaysLOV1().executeQuery();
            
            RowSetIterator itr = getWeekDaysLOV1().createRowSetIterator(null);
            while(itr.hasNext()) 
            {
                WeekDaysLOVRowImpl  currRow = (WeekDaysLOVRowImpl) itr.next();
                
                WeekOffDaysVORowImpl  newRow = (WeekOffDaysVORowImpl) getWeekOffDaysVO1().createRow();
                getWeekOffDaysVO1().insertRow(newRow);
                newRow.setWeekOffDay(currRow.getWeekDay());
                newRow.setBuId(bu_id);
                newRow.setWeekOffFlag("N");
                newRow.setTransWeekOffFlag("No");
                
            }
        }
        catch(Exception e) 
        {
            e.printStackTrace();    
        }
    }

    /**
     * Container's getter for WeekDaysLOV1.
     * @return WeekDaysLOV1
     */
    public WeekDaysLOVImpl getWeekDaysLOV1() {
        return (WeekDaysLOVImpl) findViewObject("WeekDaysLOV1");
    }
    
    public String validateExceptionDate() 
    {
        String msg = "Success";
        try 
        {
            ExceptionDaysVORowImpl currRow = (ExceptionDaysVORowImpl) getExceptionDaysVO1().getCurrentRow();
            
            getExceptionDaysVO2().setApplyViewCriteriaName(null);
            getExceptionDaysVO2().executeQuery();
            
            getExceptionDaysVO2().setApplyViewCriteriaName("ExceptionDaysVOCriteria1");
            getExceptionDaysVO2().setNamedWhereClauseParam("p_bu_id",currRow.getBuId());
            getExceptionDaysVO2().setNamedWhereClauseParam("p_exc_line_id",currRow.getExceptionId());
            getExceptionDaysVO2().executeQuery();
            
            if(getExceptionDaysVO2().getRowCount() > 0) 
            {
                RowSetIterator filItr = getExceptionDaysVO2().createRowSetIterator(null);
                while(filItr.hasNext()) 
                {
                    ExceptionDaysVORowImpl filRow = (ExceptionDaysVORowImpl) filItr.next();
                    if(filRow.getExceptionDate().dateValue().compareTo(currRow.getExceptionDate().dateValue()) == 0) 
                    {
                        currRow.setExceptionDate(null);
                        return "Exception already exists for the given date.Please select another date.";    
                    }
                }

            }
            
            if(currRow!=null && currRow.getEntity(0).getEntityState() == 2)
            {
                Date d = new Date();
                if((d.getCurrentDate().dateValue()).compareTo(currRow.getExceptionDate().dateValue()) > 0)
                {
                    currRow.setExceptionDate(null);
                    return "Exception date should be on or after current date - " + d.getCurrentDate().dateValue();   
                }
            }
        }
        catch(Exception e) 
        {
            e.printStackTrace();
            return e.getMessage();
        }
        return msg;
    }
    
    public void refreshData() 
    {
        try 
        {
            TransExceptionDaysSearchVORowImpl transRow = (TransExceptionDaysSearchVORowImpl) getTransExceptionDaysSearchVO1().getCurrentRow();
            if(transRow.getTransBuId() != null) 
            {
               
                getExceptionDaysVO1().setApplyViewCriteriaName(null);
                getExceptionDaysVO1().executeQuery();
                
                getExceptionDaysVO1().setApplyViewCriteriaName("ExceptionDaysVOCriteria");
                getExceptionDaysVO1().setNamedWhereClauseParam("p_bu_id",transRow.getTransBuId());
                getExceptionDaysVO1().executeQuery();
                
                getWeekOffDaysVO1().setApplyViewCriteriaName(null);
                getWeekOffDaysVO1().executeQuery();
                
                getWeekOffDaysVO1().setApplyViewCriteriaName("WeekOffDaysVOCriteria");
                getWeekOffDaysVO1().setNamedWhereClauseParam("p_bu_id",transRow.getTransBuId());
                getWeekOffDaysVO1().executeQuery();
                
                getSpecialWorkingDaysVO1().setApplyViewCriteriaName(null);
                getSpecialWorkingDaysVO1().executeQuery();
                
                getSpecialWorkingDaysVO1().setApplyViewCriteriaName("SpecialWorkingDaysVOCriteria");
                getSpecialWorkingDaysVO1().setNamedWhereClauseParam("p_bu_id",transRow.getTransBuId());
                getSpecialWorkingDaysVO1().executeQuery();
                
            }
        }
        catch(Exception e) 
        {
            e.printStackTrace();
        }
    }


    public String createTransBuRow()
    {
        String message="Success";
        try {
            TransBuVOImpl table=getTransBuVO1();
            TransBuVORowImpl row = (TransBuVORowImpl) table.createRow();
            table.insertRow(row);
       } catch (Exception e) {
            message=e.getMessage();
            e.printStackTrace();
        }
        return message;
    }
    public String assetCategoryValueChangeList()
    {
        String message="Success";
        try {
            AssetCategoryVOImpl table=getAssetCategoryVO1();
            AssetCategoryVORowImpl row = (AssetCategoryVORowImpl) table.getCurrentRow();
            if(row.getAssetCategory()!=null)
            {
                AssetCategoryValidateVOImpl validateVo=getAssetCategoryValidateVO1();
                validateVo.setApplyViewCriteriaName(null);
                validateVo.executeQuery();
                validateVo.setApplyViewCriteriaName("AssetCategoryValidateVOCriteria");
                validateVo.executeQuery();
                validateVo.setNamedWhereClauseParam("p_category_id", row.getCategoryId());
                validateVo.setNamedWhereClauseParam("p_asset_category", row.getAssetCategory());
                validateVo.setNamedWhereClauseParam("p_bu_id", row.getBuId());
                validateVo.executeQuery();
                AssetCategoryValidateVORowImpl validateRow = (AssetCategoryValidateVORowImpl) validateVo.first();
                if(validateRow!=null)
                {
                    String assetCategoryOldValue = (String) ADFContext.getCurrent()
                                                                      .getPageFlowScope()
                                                                      .get("AssetCategoryOldValue");
                    row.setAssetCategory(assetCategoryOldValue);
                    message="Entered Asset Category already exists in this Business Unit. Please enter business unit";
                }
            }
       } catch (Exception e) {
            message=e.getMessage();
            e.printStackTrace();
        }
        return message;
    }
    public String addAssetAttribute()
    {
        String message="Success";
        try {
            AssetAttributeVOImpl table=getAssetAttributeVO1();
            AssetAttributeVORowImpl row = (AssetAttributeVORowImpl) table.createRow();
            table.insertRow(row);
       } catch (Exception e) {
            message=e.getMessage();
            e.printStackTrace();
        }
        return message;
    }
    public String deleteAssetAttribute()
    {
        String message="Success";
        try {
            AssetAttributeVOImpl table=getAssetAttributeVO1();
            AssetAttributeVORowImpl row = (AssetAttributeVORowImpl) table.getCurrentRow();
            
           if(row.getEntity(0).getEntityState() != 0)
           {
               return "Saved rows cannot be deleted.";
            }
            else
           {
                table.removeCurrentRow();
            }
            
       } catch (Exception e) {
            message=e.getMessage();
            e.printStackTrace();
        }
        return message;
    }
    public String repCategoryAdd()
    {
        String message="Success";
        try {
            ReplacementCategoryVOImpl table=getReplacementCategoryVO1();
            ReplacementCategoryVORowImpl row = (ReplacementCategoryVORowImpl) table.createRow();
            table.insertRow(row);
            
            AssetCategoryVOImpl asstCatTable=getAssetCategoryVO1();
            AssetCategoryVORowImpl asstCatRow = (AssetCategoryVORowImpl) asstCatTable.getCurrentRow();
            
            row.setTransMainCategory(asstCatRow.getAssetCategory());
            row.setTransMainCategoryDesc(asstCatRow.getDescription());
            row.setTransActive("Yes");
            row.setActiveFlag("Y");
            
            
       } catch (Exception e) {
            message=e.getMessage();
            e.printStackTrace();
        }
        return message;
    }
    public String repCategoryDelete()
    {
        String message="Success";
        try {
            ReplacementCategoryVOImpl table=getReplacementCategoryVO1();
            ReplacementCategoryVORowImpl row = (ReplacementCategoryVORowImpl) table.getCurrentRow();
            if(row.getEntity(0).getEntityState() != 0)
            {
                return "Saved rows cannot be deleted.";
            }
            else
            {
                table.removeCurrentRow();
            }
            
       } catch (Exception e) {
            message=e.getMessage();
            e.printStackTrace();
        }
        return message;
    }
    public String assetAttributeValueChangeList()
    {
        String message="Success";
        try {
            AssetAttributeVOImpl assAtt=getAssetAttributeVO1();
            AssetAttributeVORowImpl assAttRow = (AssetAttributeVORowImpl) assAtt.getCurrentRow();
            
            AssetAttributeValidateVOImpl vTable=getAssetAttributeValidateVO1();
            vTable.setApplyViewCriteriaName(null);
            vTable.executeQuery();
            vTable.setApplyViewCriteriaName("AssetAttributeValidateVOCriteria1");
            vTable.setNamedWhereClauseParam("p_category_id", assAttRow.getCategoryId());
            System.out.println(assAttRow.getAttributeId());
           vTable.setNamedWhereClauseParam("p_attribute_id", assAttRow.getAttributeId());
           vTable.setNamedWhereClauseParam("p_asset_attribute", assAttRow.getAssetAttribute());
            vTable.executeQuery();
            
            AssetAttributeValidateVORowImpl vRow = (AssetAttributeValidateVORowImpl) vTable.first();
            if(vRow!=null)
            {
                assAttRow.setTransAssetAttribute(null);
                assAttRow.setAssetAttribute(null);
                return "Selected Asset Attribute already selected under this asset category. Please selected different attribute.";
            }
            
       } catch (Exception e) {
            message=e.getMessage();
            e.printStackTrace();
        }
        return message;
    }
    public String repCategoryValueChangeList()
    {
        String message="Success";
        try {
            ReplacementCategoryVOImpl repCatTable=getReplacementCategoryVO1();
            ReplacementCategoryVORowImpl repCatRow = (ReplacementCategoryVORowImpl) repCatTable.getCurrentRow();
            
           ReplacementCategoryValidateVOImpl vTable=getReplacementCategoryValidateVO1();
           vTable.setApplyViewCriteriaName(null);
           vTable.executeQuery();
           vTable.setApplyViewCriteriaName("ReplacementCategoryValidateVOCriteria1");
           vTable.setNamedWhereClauseParam("p_category_id", repCatRow.getCategoryId());
           vTable.setNamedWhereClauseParam("p_replacement_category_id", repCatRow.getReplacementCategoryId());
           vTable.setNamedWhereClauseParam("p_replacement_id", repCatRow.getReplacementId());
           vTable.executeQuery();
           
           ReplacementCategoryValidateVORowImpl vRow = (ReplacementCategoryValidateVORowImpl) vTable.first();
           if(vRow!=null)
           {
               repCatRow.setTransRepCategory(null);
               repCatRow.setTransRepCategoryDesc(null);
               repCatRow.setReplacementCategoryId(null);
               return "Selected Replacement Category already selected under this asset category. Please selected different Replacement Category.";
           }
       } catch (Exception e) {
            message=e.getMessage();
            e.printStackTrace();
        }
        return message;
    }
    
    public String deleteEmpRepCat()
    {
        String message="Success";
        try {
            EmpRepCatEOImpl table=getEmpRepCatEO1();
            EmpRepCatEORowImpl row = (EmpRepCatEORowImpl) table.getCurrentRow();
            if(row.getEntity(0).getEntityState() != 0)
            {
                return "Saved rows cannot be deleted.";
            }
            else
            {
                table.removeCurrentRow();
            }
       } catch (Exception e) {
            message=e.getMessage();
            e.printStackTrace();
        }
        return message;
    }
    public String addEmpAsstCat()
    {
        String message="Success";
        try {
            EmpAsstCatMapVOImpl table=getEmpAsstCatMapVO1();
            EmpAsstCatMapVORowImpl row = (EmpAsstCatMapVORowImpl) table.createRow();
            table.insertRow(row);
            
            EmpCatVOImpl empCatTable=getEmpCatVO1();
            EmpCatVORowImpl empCatRow = (EmpCatVORowImpl) empCatTable.getCurrentRow();
            row.setTransMainCategory(empCatRow.getEmpCategoryCode());
            row.setTransMainCatDesc(empCatRow.getDescription());
       } catch (Exception e) {
            message=e.getMessage();
            e.printStackTrace();
        }
        return message;
    }
    public String deleteEmpAsstCatMap()
    {
        String message="Success";
        try {
            EmpAsstCatMapVOImpl table=getEmpAsstCatMapVO1();
            EmpAsstCatMapVORowImpl row = (EmpAsstCatMapVORowImpl) table.getCurrentRow();
           if(row.getEntity(0).getEntityState() != 0)
           {
               return "Saved rows cannot be deleted.";
           }
           else
           {
               table.removeCurrentRow();
           }
       } catch (Exception e) {
            message=e.getMessage();
            e.printStackTrace();
        }
        return message;
    }
    public String astCatValChList()
    {
        String message="Success";
        try {
           EmpAsstCatMapVOImpl table=getEmpAsstCatMapVO1();
            EmpAsstCatMapVORowImpl row = (EmpAsstCatMapVORowImpl) table.getCurrentRow();
            
            EmpAsstCatMapValidateVOImpl validateTable=getEmpAsstCatMapValidateVO1();
            validateTable.setApplyViewCriteriaName(null);
            validateTable.executeQuery();
            validateTable.setApplyViewCriteriaName("EmpAsstCatMapValidateVOCriteria1");
            validateTable.setNamedWhereClauseParam("p_header_id", row.getHeaderId());
           validateTable.setNamedWhereClauseParam("p_emp_category_id", row.getEmpCategoryId());
           validateTable.setNamedWhereClauseParam("p_asset_category_id", row.getAssetCategoryId());
            validateTable.executeQuery();
            EmpAsstCatMapValidateVORowImpl validateRow = (EmpAsstCatMapValidateVORowImpl) validateTable.first();
            if(validateRow!=null)
            {
                row.setTransAssetCategory(null);
                row.setTransAssetCategoryDesc(null);
                row.setAssetCategoryId(null);
                return "Asset category has already selected. Please select unique value.";
            }
            
       } catch (Exception e) {
            message=e.getMessage();
            e.printStackTrace();
        }
        return message;
    }
    /**
     * Container's getter for TransBuVO1.
     * @return TransBuVO1
     */
    public TransBuVOImpl getTransBuVO1() {
        return (TransBuVOImpl) findViewObject("TransBuVO1");
    }

    /**
     * Container's getter for AssetCategoryVO1.
     * @return AssetCategoryVO1
     */
    public AssetCategoryVOImpl getAssetCategoryVO1() {
        return (AssetCategoryVOImpl) findViewObject("AssetCategoryVO1");
    }

    /**
     * Container's getter for TransBuToAssetCategoryVL1.
     * @return TransBuToAssetCategoryVL1
     */
    public ViewLinkImpl getTransBuToAssetCategoryVL1() {
        return (ViewLinkImpl) findViewLink("TransBuToAssetCategoryVL1");
    }

    /**
     * Container's getter for AssetAttributeVO1.
     * @return AssetAttributeVO1
     */
    public AssetAttributeVOImpl getAssetAttributeVO1() {
        return (AssetAttributeVOImpl) findViewObject("AssetAttributeVO1");
    }

    /**
     * Container's getter for CategoryToAssetAttributeVL1.
     * @return CategoryToAssetAttributeVL1
     */
    public ViewLinkImpl getCategoryToAssetAttributeVL1() {
        return (ViewLinkImpl) findViewLink("CategoryToAssetAttributeVL1");
    }

    /**
     * Container's getter for ReplacementCategoryVO1.
     * @return ReplacementCategoryVO1
     */
    public ReplacementCategoryVOImpl getReplacementCategoryVO1() {
        return (ReplacementCategoryVOImpl) findViewObject("ReplacementCategoryVO1");
    }

    /**
     * Container's getter for CategoryToAssetReplacementVL1.
     * @return CategoryToAssetReplacementVL1
     */
    public ViewLinkImpl getCategoryToAssetReplacementVL1() {
        return (ViewLinkImpl) findViewLink("CategoryToAssetReplacementVL1");
    }

    /**
     * Container's getter for AssetCategoryValidateVO1.
     * @return AssetCategoryValidateVO1
     */
    public AssetCategoryValidateVOImpl getAssetCategoryValidateVO1() {
        return (AssetCategoryValidateVOImpl) findViewObject("AssetCategoryValidateVO1");
    }

    /**
     * Container's getter for AssetAttributeValidateVO1.
     * @return AssetAttributeValidateVO1
     */
    public AssetAttributeValidateVOImpl getAssetAttributeValidateVO1() {
        return (AssetAttributeValidateVOImpl) findViewObject("AssetAttributeValidateVO1");
    }

    /**
     * Container's getter for ReplacementCategoryValidateVO1.
     * @return ReplacementCategoryValidateVO1
     */
    public ReplacementCategoryValidateVOImpl getReplacementCategoryValidateVO1() {
        return (ReplacementCategoryValidateVOImpl) findViewObject("ReplacementCategoryValidateVO1");
    }
    public String deleteHiringBasisRule(){
        String message = "Success";
        try {
            HiringBasisRulesVOImpl hiringVO = getHiringBasisRulesVO1();
            HiringBasisRulesVORowImpl currRow = (HiringBasisRulesVORowImpl) hiringVO.getCurrentRow();
            if(currRow.getEntity(0).getEntityState() == 0){
                currRow.remove();    
            }else{
                message = "Cannot delete Hiring Basis "+currRow.getHiringBasis() +", as Record is already saved.";
            }
            
        }catch (Exception e) {
            message = e.getMessage();
            e.printStackTrace();
        }
        return message;
    }
    
    public String saveHiringBasisRule(){
        String message = "Success";
        oracle.jbo.domain.Number tot = new oracle.jbo.domain.Number(0);
        try {
            HiringBasisRulesVOImpl hiringVO = getHiringBasisRulesVO1();
            RowSetIterator rs = hiringVO.createRowSetIterator(null);
            while(rs.hasNext()){
                HiringBasisRulesVORowImpl currRow = (HiringBasisRulesVORowImpl) rs.next();
                if(currRow.getEntity(0).getEntityState() == 0 || currRow.getEntity(0).getEntityState() == 2){
                    if("Variable".equals(currRow.getTransFixedVariable())){
                        tot = (currRow.getNoOfHours() != null ? currRow.getNoOfHours() : new oracle.jbo.domain.Number(0))
                                      .add((currRow.getOt1Hours() != null ? currRow.getOt1Hours() : new oracle.jbo.domain.Number(0))
                                                   .add((currRow.getOt2Hours() != null ? currRow.getOt2Hours() : new oracle.jbo.domain.Number(0))));
                        if(tot.compareTo(24)!=0){
                            if("Success".equals(message)){
                                message = "Sum of Hours should be 24 for Hiring Basis "+currRow.getHiringBasis();
                            }else{
                                message=message+"_"+"Sum of Hours should be 24 for Hiring Basis "+currRow.getHiringBasis();
                            }
                        }
                    }
                }
            }
        }catch (Exception e) {
            message = e.getMessage();
            e.printStackTrace();
        }
        return message;
    }
    
    public String hiringBasisHoursChange(){
        String message = "Success";
        oracle.jbo.domain.Number tot = new oracle.jbo.domain.Number(0);
        try {
            HiringBasisRulesVORowImpl currRow = (HiringBasisRulesVORowImpl) getHiringBasisRulesVO1().getCurrentRow();
            if(currRow != null && "Variable".equals(currRow.getTransFixedVariable()) 
                    && currRow.getNoOfHours() != null && currRow.getOt1Hours() != null && currRow.getOt2Hours()!= null){
                tot = (currRow.getNoOfHours() != null ? currRow.getNoOfHours() : new oracle.jbo.domain.Number(0))
                              .add((currRow.getOt1Hours() != null ? currRow.getOt1Hours() : new oracle.jbo.domain.Number(0))
                                           .add((currRow.getOt2Hours() != null ? currRow.getOt2Hours() : new oracle.jbo.domain.Number(0))));
                if(tot.compareTo(24)!=0){
                    message = "Sum of Hours should be 24 for Hiring Basis "+currRow.getHiringBasis();                        
                }
            }
        }catch (Exception e) {
            e.printStackTrace();
            message = e.getMessage();
        }
        return message;
    }
    
    public String fixedVariableChange(){
        String message = "Success";
        try {
            HiringBasisRulesVORowImpl currRow = (HiringBasisRulesVORowImpl) getHiringBasisRulesVO1().getCurrentRow();
            if(currRow != null && "F".equals(currRow.getFixedVariable())){
                currRow.setNoOfHours(null);
                currRow.setOt1Hours(null);
                currRow.setOt2Hours(null);
            }
        }catch (Exception e) {
            e.printStackTrace();
            message=e.getMessage();
        }
        return message;
    }
    
    public String hiringBasisDaysChange(){
        String message = "Success";
        try {
            HiringBasisRulesVORowImpl currRow = (HiringBasisRulesVORowImpl) getHiringBasisRulesVO1().getCurrentRow();
            if(currRow != null && "W".equals(currRow.getPeriodIdentifier()) && currRow.getNoOfDays() != null){
                if(currRow.getNoOfDays().compareTo(7) > 0){
                    currRow.setNoOfDays(null);
                    message = "Days should be maximum 7 for Week";
                }
            }
        }catch (Exception e) {
            e.printStackTrace();
            message = e.getMessage();
        }
        return message;        
    }

    public String hiringBasisChange(){
        String message = "Success";
        try {            
            HiringBasisRulesVORowImpl currRow = (HiringBasisRulesVORowImpl) getHiringBasisRulesVO1().getCurrentRow();
            if(currRow != null && currRow.getHiringBasis() != null){
                getHiringBasisValidateVO1().setApplyViewCriteriaName(null);
                getHiringBasisValidateVO1().executeQuery();
                
                getHiringBasisValidateVO1().setNamedWhereClauseParam("p_hiring_basis", currRow.getHiringBasis());
                getHiringBasisValidateVO1().setNamedWhereClauseParam("p_rule_id", currRow.getRuleId());
                getHiringBasisValidateVO1().setNamedWhereClauseParam("p_bu_id", currRow.getBuId());
                getHiringBasisValidateVO1().setNamedWhereClauseParam("p_div_flex_val_id", currRow.getDivFlexValueId());
                getHiringBasisValidateVO1().setApplyViewCriteriaName("HiringBasisValidateVOCriteria");
                getHiringBasisValidateVO1().executeQuery();
                
                if(getHiringBasisValidateVO1().getRowCount() > 0){                    
                    message = "Hiring Basis "+currRow.getHiringBasis()+" already exists. Enter a unique value";
                    currRow.setHiringBasis(null);
                }
            }
        }catch (Exception e) {
            message = e.getMessage();
            e.printStackTrace();
        }
        return message;
    }
    
    public String rentalTypeChange(){
        String message = "Success";
        try {
            HiringBasisRulesVORowImpl currRow = (HiringBasisRulesVORowImpl) getHiringBasisRulesVO1().getCurrentRow();
            if(currRow != null && !("Asset".equals(currRow.getRentalType()))){
                currRow.setTransPeriodIdentifier(null);
                currRow.setPeriodIdentifier(null);
                currRow.setTransFixedVariable(null);
                currRow.setFixedVariable(null);
                currRow.setNoOfHours(null);
                currRow.setOt1Hours(null);
                currRow.setOt2Hours(null);
            }
        }catch (Exception e) {
            e.printStackTrace();
            message=e.getMessage();
        }
        return message;
    }
    
    public String saveWeekExceptionDays() 
    {
        String message = null;
        oracle.jbo.domain.Number totalHrs;
        oracle.jbo.domain.Date previousEndDate = null; 
        int count = 0;
        try 
        {
            RowSetIterator itr = getSpecialWorkingDaysVO1().createRowSetIterator(null);
            while(itr.hasNext()) 
            {
                totalHrs = new oracle.jbo.domain.Number(0);
                SpecialWorkingDaysVORowImpl currRow = (SpecialWorkingDaysVORowImpl) itr.next();
                if( currRow.getEntity(0).getEntityState() == 0 || currRow.getEntity(0).getEntityState() == 2)
                {
                    
                    getSpecialWorkingDaysValidateVO1().setApplyViewCriteriaName(null);
                    getSpecialWorkingDaysValidateVO1().executeQuery();
//                    
                    getSpecialWorkingDaysValidateVO1().setApplyViewCriteriaName("SpecialWorkingDaysValidateVOCriteria");
                    getSpecialWorkingDaysValidateVO1().setNamedWhereClauseParam("p_bu_id",currRow.getBuId());
                    getSpecialWorkingDaysValidateVO1().setNamedWhereClauseParam("p_sp_line_id",currRow.getSpDayId());
                    getSpecialWorkingDaysValidateVO1().executeQuery();
//                    
                    RowSetIterator filteredRows = getSpecialWorkingDaysValidateVO1().createRowSetIterator(null);
//                    
                    while(filteredRows.hasNext()){
                        SpecialWorkingDaysValidateVORowImpl currFilRow = (SpecialWorkingDaysValidateVORowImpl)filteredRows.next();
                        if(currFilRow.getSpEffectiveStartDate().compareTo(currRow.getSpEffectiveStartDate()) > 0){
                            if(currRow.getSpEffectiveEndDate() == null){
                                message = (message == null ? "" : message + "_") + "Special Working Day already exists for Business Unit "+ currFilRow.getTransBuName()  +". Enter a unique value.";
                            }
                            else if(currFilRow.getSpEffectiveStartDate().compareTo(currRow.getSpEffectiveEndDate())<=0){
                               message = (message == null ? "" : message + "_") + "Special Working Day already exists for Business Unit "+ currFilRow.getTransBuName() +". Enter a unique value.";
                           }
                        }
                        else if(currFilRow.getSpEffectiveStartDate().compareTo(currRow.getSpEffectiveStartDate()) < 0){
                            if(currFilRow.getSpEffectiveEndDate() == null){
                                message = (message == null ? "" : message + "_") + "Special Working Day already exists for Business Unit "+ currFilRow.getTransBuName()  +". Enter a unique value.";
                            }
                            else if(currRow.getSpEffectiveStartDate().compareTo(currFilRow.getSpEffectiveEndDate()) <= 0){
                                message = (message == null ? "" : message + "_") + "The given dates for business "+currFilRow.getTransBuName() +" are invalid. This record causes an overlap with an existing combination.";
                            }
                        }
                        else{
                            message = (message == null ? "" : message + "_") + "Special Working Day already exists for Business Unit "+ currRow.getTransBuName() +". Enter a unique value.";
                        }
                    }
                                     
                    if(currRow.getNoOfHrs().compareTo(0) < 0 ||  currRow.getOt1Hrs().compareTo(0) < 0 || currRow.getOt2Hrs().compareTo(0) < 0)
                    {
                        if(currRow.getNoOfHrs().compareTo(0) < 0) 
                        {
                            currRow.setNoOfHrs(null);    
                        }
                        if(currRow.getOt1Hrs().compareTo(0) < 0) 
                        {
                            currRow.setOt1Hrs(null);    
                        }
                        if(currRow.getOt2Hrs().compareTo(0) < 0) 
                        {
                            currRow.setOt2Hrs(null);    
                        }
                        message = (message == null ? "" : message + "_") + "Hours should be greater than 0 for Holiday - "+currRow.getSpHolidayName();    
                    }
                    else
                    {
                        totalHrs = currRow.getNoOfHrs().add(currRow.getOt1Hrs()).add(currRow.getOt2Hrs());
                        if(totalHrs.compareTo(24) != 0) 
                        {
                            message = (message == null ? "" : message + "_") + "Sum of hours should be equal to 24.";    
                        }
                    }
                }
            }
            
            TransExceptionDaysSearchVORowImpl searchRow =
                (TransExceptionDaysSearchVORowImpl) getTransExceptionDaysSearchVO1().getCurrentRow();
            if(searchRow != null){
                RowSetIterator docItr  = getDocumentSequenceVO1().createRowSetIterator(null);
                while(docItr.hasNext())
                {
                    DocumentSequenceVORowImpl currRow = (DocumentSequenceVORowImpl) docItr.next();
                    if( currRow.getEntity(0).getEntityState() == 0 || currRow.getEntity(0).getEntityState() == 2)
                    {
                        if(currRow != null && currRow.getDocumentCode()!= null && currRow.getBuId() != null){
                    getDocumentSequenceValidateVO1().setApplyViewCriteriaName(null);
                    getDocumentSequenceValidateVO1().executeQuery();
                    
//                    getDocumentSequenceValidateVO1().setNamedWhereClauseParam("p_bu_id", currRow.getBuId());
                    getDocumentSequenceValidateVO1().setNamedWhereClauseParam("p_doc_code", currRow.getDocumentCode());
                    getDocumentSequenceValidateVO1().setNamedWhereClauseParam("p_doc_seq_id", currRow.getDocSequenceId());
                    getDocumentSequenceValidateVO1().setApplyViewCriteriaName("DocumentSequenceValidateVOCriteria");
                    getDocumentSequenceValidateVO1().setOrderByClause("XxadsDocumentSequenceEO.EFFECTIVE_TO desc");
                    getDocumentSequenceValidateVO1().executeQuery();
                    
                    
                    DocumentSequenceValidateVORowImpl previousRow =
                        (DocumentSequenceValidateVORowImpl) getDocumentSequenceValidateVO1().first();
                    if(previousRow != null && previousRow.getEffectiveTo() != null){
                        previousEndDate = new oracle.jbo.domain.Date(previousRow.getEffectiveTo());
                    }
                    
                    if(currRow.getEffectiveFrom() != null){
                        RowSetIterator filteredRows = getDocumentSequenceValidateVO1().createRowSetIterator(null);
                                            
                        while(filteredRows.hasNext()){
                            DocumentSequenceValidateVORowImpl currFilRow = (DocumentSequenceValidateVORowImpl)filteredRows.next();
                            if(currFilRow.getEffectiveFrom().compareTo(currRow.getEffectiveFrom()) > 0){
                                if(currRow.getEffectiveTo() == null){
                                    count = 1;
                                }
                                else if(currFilRow.getEffectiveFrom().compareTo(currRow.getEffectiveTo())<=0){
                                   count = 1;
                               }
                            }
                            else if(currFilRow.getEffectiveFrom().compareTo(currRow.getEffectiveFrom()) < 0){
                                if(currFilRow.getEffectiveTo() == null){
                                    count = 1;
                                }
                                else if(currRow.getEffectiveFrom().compareTo(currFilRow.getEffectiveTo()) <= 0){
                                    count = 2;
                                }
                            }
                            else{
                                count = 1;
                            }
                        }
                    }
                    if(count > 0){
                        message = "Document sequence is already "+searchRow.getTransBuName()+"for the given dates range";
                        currRow.setDocumentCode(null);
                        currRow.setTransDocumentName(null);
                        currRow.setEffectiveFrom(null);
                        currRow.setEffectiveTo(null);
                        
                    }
                    else if(getDocumentSequenceValidateVO1().getRowCount() > 0)
                    {
                        if(previousEndDate != null){
                            currRow.setEffectiveFrom ((Date) new oracle.jbo.domain.Date(previousEndDate)
                                                     .addJulianDays(1, 0));
                            currRow.setTransEffectiveFromEditFlag("N");
                        }
                        
                        if(currRow.getEffectiveTo() != null){
                            java.sql.Timestamp datetime = new java.sql.Timestamp(System.currentTimeMillis());
                            oracle.jbo.domain.Date currDate = new  oracle.jbo.domain.Date(datetime);
                            
                            if(currDate.compareTo(currRow.getEffectiveTo()) < 0){
                                currRow.setEffectiveTo(null);
                                message = "Effective To should be only on or before Current Date";
                            }
                        }
                    }
                    else {
//                        currRow.setEffectiveFrom(null);
                        currRow.setTransEffectiveFromEditFlag(null);
                    }
                }
                    }
                }
            }
            
            if(message == null) 
            {
                message = "Success";    
            }
        }
        catch(Exception e) 
        {
            e.printStackTrace();
            return e.getMessage();
        }
        return message;
    }

    /**
     * Container's getter for SpecialWorkingDaysValidateVO1.
     * @return SpecialWorkingDaysValidateVO1
     */
    public SpecialWorkingDaysValidateVOImpl getSpecialWorkingDaysValidateVO1() {
        return (SpecialWorkingDaysValidateVOImpl) findViewObject("SpecialWorkingDaysValidateVO1");
    }


    /**
     * Container's getter for ExceptionDaysVO2.
     * @return ExceptionDaysVO2
     */
    public ExceptionDaysVOImpl getExceptionDaysVO2() {
        return (ExceptionDaysVOImpl) findViewObject("ExceptionDaysVO2");
    }
    
    public String validateSpEndDate() 
    {
        String message = "Success";
        try 
        {
            SpecialWorkingDaysVORowImpl currRow = (SpecialWorkingDaysVORowImpl) getSpecialWorkingDaysVO1().getCurrentRow();
            if( currRow.getEntity(0).getEntityState() == 0 || currRow.getEntity(0).getEntityState() == 2)
            {
                
                getSpecialWorkingDaysValidateVO1().setApplyViewCriteriaName(null);
                getSpecialWorkingDaysValidateVO1().executeQuery();
            //
                getSpecialWorkingDaysValidateVO1().setApplyViewCriteriaName("SpecialWorkingDaysValidateVOCriteria");
                getSpecialWorkingDaysValidateVO1().setNamedWhereClauseParam("p_bu_id",currRow.getBuId());
                getSpecialWorkingDaysValidateVO1().setNamedWhereClauseParam("p_sp_line_id",currRow.getSpDayId());
                getSpecialWorkingDaysValidateVO1().executeQuery();
            //
                RowSetIterator filteredRows = getSpecialWorkingDaysValidateVO1().createRowSetIterator(null);
            //
                while(filteredRows.hasNext()){
                    SpecialWorkingDaysValidateVORowImpl currFilRow = (SpecialWorkingDaysValidateVORowImpl)filteredRows.next();
                    if(currFilRow.getSpEffectiveStartDate().compareTo(currRow.getSpEffectiveStartDate()) > 0){
                        if(currRow.getSpEffectiveEndDate() == null){
                            currRow.setSpEffectiveEndDate(null);
                            return "Special Working Day already exists for Business Unit "+ currFilRow.getTransBuName()  +". Enter a unique value.";
                        }
                  else if(currFilRow.getSpEffectiveStartDate().compareTo(currRow.getSpEffectiveEndDate())<=0){
                            currRow.setSpEffectiveEndDate(null);
                               return "Special Working Day already exists for Business Unit "+ currFilRow.getTransBuName() +". Enter a unique value.";
                        }
                    }
                    else if(currFilRow.getSpEffectiveStartDate().compareTo(currRow.getSpEffectiveStartDate()) < 0){
                        if(currFilRow.getSpEffectiveEndDate() == null)
                        {
                            currRow.setSpEffectiveEndDate(null);
                            return "Special Working Day already exists for Business Unit "+ currFilRow.getTransBuName()  +". Enter a unique value.";
                        }
                        else if(currFilRow.getSpEffectiveEndDate() != null && currRow.getSpEffectiveStartDate().compareTo(currFilRow.getSpEffectiveEndDate()) <= 0){
                            currRow.setSpEffectiveEndDate(null);
                            return "The given dates for business "+currFilRow.getTransBuName() +" are invalid. This record causes an overlap with an existing combination.";
                        }
                    }
                    else{
                        currRow.setSpEffectiveEndDate(null);
                        return"Special Working Day already exists for Business Unit "+ currFilRow.getTransBuName() +". Enter a unique value.";
                    }
                }

            }
            if(message == null) 
            {
                message = "Success";    
            }
        }
        catch(Exception e) 
        {
            e.printStackTrace();
            return e.getMessage();
        }
        return message;
    }
    
    public String validateSpStartDate() 
    {
        String message = "Success";
        try 
        {
            SpecialWorkingDaysVORowImpl currRow = (SpecialWorkingDaysVORowImpl) getSpecialWorkingDaysVO1().getCurrentRow();
            if( currRow.getEntity(0).getEntityState() == 0 || currRow.getEntity(0).getEntityState() == 2)
            {
                
                getSpecialWorkingDaysValidateVO1().setApplyViewCriteriaName(null);
                getSpecialWorkingDaysValidateVO1().executeQuery();
            //
                getSpecialWorkingDaysValidateVO1().setApplyViewCriteriaName("SpecialWorkingDaysValidateVOCriteria");
                getSpecialWorkingDaysValidateVO1().setNamedWhereClauseParam("p_bu_id",currRow.getBuId());
                getSpecialWorkingDaysValidateVO1().setNamedWhereClauseParam("p_sp_line_id",currRow.getSpDayId());
                getSpecialWorkingDaysValidateVO1().executeQuery();
            //
                RowSetIterator filteredRows = getSpecialWorkingDaysValidateVO1().createRowSetIterator(null);
            //
                while(filteredRows.hasNext()){
                    SpecialWorkingDaysValidateVORowImpl currFilRow = (SpecialWorkingDaysValidateVORowImpl)filteredRows.next();
                    if(currFilRow.getSpEffectiveStartDate().compareTo(currRow.getSpEffectiveStartDate()) > 0){
                        if(currRow.getSpEffectiveEndDate() == null){
                            currRow.setSpEffectiveStartDate(null);
                            return "Special Working Day already exists for Business Unit "+ currFilRow.getTransBuName()  +". Enter a unique value.";
                        }
                    else if(currRow.getSpEffectiveEndDate() != null && currFilRow.getSpEffectiveStartDate().compareTo(currRow.getSpEffectiveEndDate())<=0){
                            currRow.setSpEffectiveStartDate(null);
                               return "Special Working Day already exists for Business Unit "+ currFilRow.getTransBuName() +". Enter a unique value.";
                        }
                    }
                    else if(currFilRow.getSpEffectiveStartDate().compareTo(currRow.getSpEffectiveStartDate()) < 0){
                        if(currFilRow.getSpEffectiveEndDate() == null)
                        {
                            currRow.setSpEffectiveStartDate(null);
                            return "Special Working Day already exists for Business Unit "+ currFilRow.getTransBuName()  +". Enter a unique value.";
                        }
                        else if(currFilRow.getSpEffectiveEndDate() != null && currRow.getSpEffectiveStartDate().compareTo(currFilRow.getSpEffectiveEndDate()) <= 0){
                            currRow.setSpEffectiveStartDate(null);
                            return "The given dates for business "+currFilRow.getTransBuName() +" are invalid. This record causes an overlap with an existing combination.";
                        }
                    }
                    else{
                        currRow.setSpEffectiveStartDate(null);
                        return"Special Working Day already exists for Business Unit "+ currFilRow.getTransBuName() +". Enter a unique value.";
                    }
                }

            }
        }
        catch(Exception e) 
        {
            e.printStackTrace();
            return e.getMessage();
        }
        return message;
    }
    
    public String createTransBuEmpCatRow()
    {
        String message="Success";
        try {
            TransEmpCatBuVOImpl table=getTransEmpCatBuVO1();
            TransEmpCatBuVORowImpl row=(TransEmpCatBuVORowImpl)table.createRow();
            
            table.insertRow(row);
       } catch (Exception e) {
            message=e.getMessage();
            e.printStackTrace();
        }
        return message;
    }
    
    public String deleteLookupType()
    {
        String message="Success";
        try {
            LookupTypesVOImpl table=getLookupTypesVO1();
            LookupTypesVORowImpl row = (LookupTypesVORowImpl) table.getCurrentRow();
            if(row.getEntity(0).getEntityState() == 0)
            {
                table.removeCurrentRow();
            }
            else
            {
                return "Saved records cannot be deleted.";
            }
       } catch (Exception e) {
            message=e.getMessage();
            e.printStackTrace();
        }
        return message;
    }
    public String addEmpRepCat()
    {
        String message="Success";
        try {
            EmpCatVOImpl empCatTable=getEmpCatVO1();
            EmpCatVORowImpl empCatRow = (EmpCatVORowImpl) empCatTable.getCurrentRow();
            
            EmpRepCatEOImpl table=getEmpRepCatEO1();
            EmpRepCatEORowImpl row = (EmpRepCatEORowImpl) table.createRow();
            table.insertRow(row);
            
            row.setTransMainCategory(empCatRow.getEmpCategoryCode());
            row.setTransMainCatDescription(empCatRow.getDescription());
       } catch (Exception e) {
            message=e.getMessage();
            e.printStackTrace();
        }
        return message;
    }
    public String repCatValChList()
    {
        String message="Success";
        try {
            EmpRepCatEOImpl repTable=getEmpRepCatEO1();
            EmpRepCatEORowImpl repRow = (EmpRepCatEORowImpl) repTable.getCurrentRow();
            
            EmpRepCatValidateVOImpl validateTable=getEmpRepCatValidateVO1();
            validateTable.setApplyViewCriteriaName(null);
            validateTable.executeQuery();
            validateTable.setApplyViewCriteriaName("EmpRepCatValidateVOCriteria1");
            validateTable.setNamedWhereClauseParam("p_emp_category_id", repRow.getEmpCategoryId());
           validateTable.setNamedWhereClauseParam("p_rep_category_id", repRow.getReplacementCategoryId());
           validateTable.setNamedWhereClauseParam("p_replacement_id", repRow.getReplacementId());
            validateTable.executeQuery();
            EmpRepCatValidateVORowImpl validateRow = (EmpRepCatValidateVORowImpl) validateTable.first();
            if(validateRow!=null)
            {
                repRow.setTransRepCategory(null);
                repRow.setTransRepCatDesc(null);
                repRow.setReplacementCategoryId(null);
                return "This Employee category has already selected as replacement category.Please select different category.";
            }
       } catch (Exception e) {
            message=e.getMessage();
            e.printStackTrace();
        }
        return message;
    }
    /**
     * Container's getter for TransEmpCatBuVO1.
     * @return TransEmpCatBuVO1
     */
    public TransEmpCatBuVOImpl getTransEmpCatBuVO1() {
        return (TransEmpCatBuVOImpl) findViewObject("TransEmpCatBuVO1");
    }

    /**
     * Container's getter for EmpCatVO1.
     * @return EmpCatVO1
     */
    public EmpCatVOImpl getEmpCatVO1() {
        return (EmpCatVOImpl) findViewObject("EmpCatVO1");
    }

    /**
     * Container's getter for BuToEmpCatVL1.
     * @return BuToEmpCatVL1
     */
    public ViewLinkImpl getBuToEmpCatVL1() {
        return (ViewLinkImpl) findViewLink("BuToEmpCatVL1");
    }

    /**
     * Container's getter for EmpRepCatEO1.
     * @return EmpRepCatEO1
     */
    public EmpRepCatEOImpl getEmpRepCatEO1() {
        return (EmpRepCatEOImpl) findViewObject("EmpRepCatEO1");
    }

    /**
     * Container's getter for EmpCatToRepCatVL1.
     * @return EmpCatToRepCatVL1
     */
    public ViewLinkImpl getEmpCatToRepCatVL1() {
        return (ViewLinkImpl) findViewLink("EmpCatToRepCatVL1");
    }

    /**
     * Container's getter for EmpAsstCatMapVO1.
     * @return EmpAsstCatMapVO1
     */
    public EmpAsstCatMapVOImpl getEmpAsstCatMapVO1() {
        return (EmpAsstCatMapVOImpl) findViewObject("EmpAsstCatMapVO1");
    }

    /**
     * Container's getter for EmpCatToAsstCatMapVL1.
     * @return EmpCatToAsstCatMapVL1
     */
    public ViewLinkImpl getEmpCatToAsstCatMapVL1() {
        return (ViewLinkImpl) findViewLink("EmpCatToAsstCatMapVL1");
    }

    /**
     * Container's getter for EmpRepCatValidateVO1.
     * @return EmpRepCatValidateVO1
     */
    public EmpRepCatValidateVOImpl getEmpRepCatValidateVO1() {
        return (EmpRepCatValidateVOImpl) findViewObject("EmpRepCatValidateVO1");
    }

    /**
     * Container's getter for EmpAsstCatMapValidateVO1.
     * @return EmpAsstCatMapValidateVO1
     */
    public EmpAsstCatMapValidateVOImpl getEmpAsstCatMapValidateVO1() {
        return (EmpAsstCatMapValidateVOImpl) findViewObject("EmpAsstCatMapValidateVO1");
    }

    /**
     * Container's getter for TransAccessSecuritySearchVO1.
     * @return TransAccessSecuritySearchVO1
     */
    public TransAccessSecuritySearchVOImpl getTransAccessSecuritySearchVO1() {
        return (TransAccessSecuritySearchVOImpl) findViewObject("TransAccessSecuritySearchVO1");
    }


    /**
     * Container's getter for HiringBasisRulesVO2.
     * @return HiringBasisRulesVO2
     */
    public HiringBasisRulesVOImpl getHiringBasisRulesVO2() {
        return (HiringBasisRulesVOImpl) findViewObject("HiringBasisRulesVO2");
    }
    
    public void createTransAccessSecuritySearch(){
        try
        {
            getTransAccessSecuritySearchVO1().executeQuery();
                       
            TransAccessSecuritySearchVORowImpl transRow = (TransAccessSecuritySearchVORowImpl) getTransAccessSecuritySearchVO1().createRow();
            getTransAccessSecuritySearchVO1().insertRow(transRow);
            
//            getAccessSecurityHdrVO1().executeEmptyRowSet();
//            getAccessSecurityLinesVO1().executeEmptyRowSet(); 
            
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    /**
     * Container's getter for EmpCatValidateVO1.
     * @return EmpCatValidateVO1
     */
    public EmpCatValidateVOImpl getEmpCatValidateVO1() {
        return (EmpCatValidateVOImpl) findViewObject("EmpCatValidateVO1");
    }

    /**
     * Container's getter for TransAccParamsSearchVO1.
     * @return TransAccParamsSearchVO1
     */
    public TransAccParamsSearchVOImpl getTransAccParamsSearchVO1() {
        return (TransAccParamsSearchVOImpl) findViewObject("TransAccParamsSearchVO1");
    }


    public String createAccountingParam(){
        String message = "Success";
        try {
            TransAccParamsSearchVORowImpl searchRow =
                (TransAccParamsSearchVORowImpl) getTransAccParamsSearchVO1().getCurrentRow();
            if(searchRow != null && searchRow.getTransBuId() != null){
                if(("Y".equals(searchRow.getTransDivisionRequired()) && searchRow.getTransDivFlexValueId() != null) || !"Y".equals(searchRow.getTransDivisionRequired())){
                    BuAccountingParamsVORowImpl newRow =
                        (BuAccountingParamsVORowImpl) getBuAccountingParamsVO1().createRow();
                    newRow.setTransSetId(searchRow.getTransSetId());
                    newRow.setDivision(searchRow.getTransDivision());
                    newRow.setFlexValueSetId(searchRow.getTransDivFlexValSetId());
                    newRow.setBuId(searchRow.getTransBuId());
                    newRow.setFlexValueId(searchRow.getTransDivFlexValueId());
                    
                    getBuAccountingParamsVO1().insertRow(newRow);
                }else if("Y".equals(searchRow.getTransDivisionRequired())){
                    message = "Please select Division to add the record";
                }
            }else if(searchRow.getTransBuId() == null){
                message = "Please select Business Unit to add the record";
            }
        }catch (Exception e) {
            message = e.getMessage();
            e.printStackTrace();
        }
        return message;
    }
    
    public String createRentalRate(){
        String message = "Success";
        try {
            TransRentalMasterSearchVORowImpl searchRow=(TransRentalMasterSearchVORowImpl)getTransRentalMasterSearchVO1().getCurrentRow();
            if(searchRow != null && searchRow.getTransBuId() != null){
                if(("Y".equals(searchRow.getTransDivisionRequired()) && searchRow.getTransFlexValueId() != null) || !"Y".equals(searchRow.getTransDivisionRequired())){
                    RentalMasterVORowImpl newRow=(RentalMasterVORowImpl)getRentalMasterVO1().createRow();
                    
                    getRentalMasterVO1().insertRow(newRow);
                    newRow.setBuId(searchRow.getTransBuId());
                    newRow.setDivision(searchRow.getTransDivision());
                    newRow.setFlexValueId(searchRow.getTransFlexValueId());
                    newRow.setFlexValueSetId(searchRow.getTransFlexValueSetId());
                    newRow.setTransPrecision(searchRow.getTransPrecision());
                    newRow.setRentalType("A");
                    newRow.setTransRentalType("Asset");
                }else if("Y".equals(searchRow.getTransDivisionRequired())){
                    message = "Please select Division to add the record";
                }
            }else if(searchRow.getTransBuId() == null){
                message = "Please select Business Unit to add the record";
            }
        }catch (Exception e) {
            message = e.getMessage();
            e.printStackTrace();
        }
        return message;
    }
    
    public String createGroupCustomerMap(){
        String message = "Success";
        try {
            TransAccParamsSearchVORowImpl searchRow =
                (TransAccParamsSearchVORowImpl) getTransAccParamsSearchVO1().getCurrentRow();
            if(searchRow != null && searchRow.getTransBuId() != null){
                if(("Y".equals(searchRow.getTransDivisionRequired()) && searchRow.getTransDivFlexValueId() != null) || !"Y".equals(searchRow.getTransDivisionRequired())){
                    GroupCustomerMapVORowImpl newRow =
                        (GroupCustomerMapVORowImpl) getGroupCustomerMapVO1().createRow();                    
                    
                    getGroupCustomerMapVO1().insertRow(newRow);
                    
                    newRow.setTransSourceLedgerId(searchRow.getTransLedgerId());
                    newRow.setBuId(searchRow.getTransBuId());
                    newRow.setFlexValueId(searchRow.getTransDivFlexValueId());
                }else if("Y".equals(searchRow.getTransDivisionRequired())){
                    message = "Please select Division to add Group Customer Mapping";
                }
            }else if(searchRow.getTransBuId() == null){
                message = "Please select Business Unit to add Group Customer Mapping";
            }
        }catch (Exception e) {
            message = e.getMessage();
            e.printStackTrace();
        }
        return message;
    }
    
    public String acctParamsSetupTypeChange(){
        String message = "Success";
        oracle.jbo.domain.Date previousEndDate = null; 
        int count = 0;
        try {
            TransAccParamsSearchVORowImpl searchRow =
                (TransAccParamsSearchVORowImpl) getTransAccParamsSearchVO1().getCurrentRow();
            if(searchRow != null){
                BuAccountingParamsVORowImpl currRow = (BuAccountingParamsVORowImpl) getBuAccountingParamsVO1().getCurrentRow();
                if(currRow != null && currRow.getSource()!= null && currRow.getSetupType() != null){
                    getBuAccParamsValidateVO1().setApplyViewCriteriaName(null);
                    getBuAccParamsValidateVO1().executeQuery();
                    
                    getBuAccParamsValidateVO1().setNamedWhereClauseParam("p_bu_id", currRow.getBuId());
                    getBuAccParamsValidateVO1().setNamedWhereClauseParam("p_flex_value_id", currRow.getFlexValueId() == null ? new oracle.jbo.domain.Number(2) : currRow.getFlexValueId());
                    getBuAccParamsValidateVO1().setNamedWhereClauseParam("p_source", currRow.getSource());
                    getBuAccParamsValidateVO1().setNamedWhereClauseParam("p_setup_type", currRow.getSetupType());
                    getBuAccParamsValidateVO1().setNamedWhereClauseParam("p_header_id", currRow.getHeaderId());
                    getBuAccParamsValidateVO1().setApplyViewCriteriaName("BuAccParamsValidateVOCriteria");
                    getBuAccParamsValidateVO1().setOrderByClause("XxadsBuAccountingParamsEO.EFFECTIVE_TO desc");
                    getBuAccParamsValidateVO1().executeQuery();
                    
                    
                    BuAccParamsValidateVORowImpl previousRow =
                        (BuAccParamsValidateVORowImpl) getBuAccParamsValidateVO1().first();
                    if(previousRow != null && previousRow.getEffectiveTo() != null){
                        previousEndDate = new oracle.jbo.domain.Date(previousRow.getEffectiveTo());
                    }
                    
                    if(currRow.getEffectiveFrom() != null){
                        RowSetIterator filteredRows = getBuAccParamsValidateVO1().createRowSetIterator(null);
                                            
                        while(filteredRows.hasNext()){
                            BuAccParamsValidateVORowImpl currFilRow = (BuAccParamsValidateVORowImpl)filteredRows.next();
                            if(currFilRow.getEffectiveFrom().compareTo(currRow.getEffectiveFrom()) > 0){
                                if(currRow.getEffectiveTo() == null){
                                    count = 1;
                                }
                                else if(currFilRow.getEffectiveFrom().compareTo(currRow.getEffectiveTo())<=0){
                                   count = 1;
                               }
                            }
                            else if(currFilRow.getEffectiveFrom().compareTo(currRow.getEffectiveFrom()) < 0){
                                if(currFilRow.getEffectiveTo() == null){
                                    count = 1;
                                }
                                else if(currRow.getEffectiveFrom().compareTo(currFilRow.getEffectiveTo()) <= 0){
                                    count = 2;
                                }
                            }
                            else{
                                count = 1;
                            }
                        }
                    }
                    if(count > 0){
                        message = "Accounting Parameters are already defined for Business Unit "+searchRow.getTransBuName()+
                                        (searchRow.getTransDivision() == null ? ", " : ", Division "+searchRow.getTransDivision()+", ")+
                                        "Source "+currRow.getSource()+
                                        ", Setup Type "+currRow.getTransSetupType()+" for the given dates range";
                        currRow.setTransSetupType(null);
                        currRow.setSetupType(null);
                        currRow.setArSourceId(null);
                        currRow.setTransARSource(null);
                        currRow.setTransARTrxnType(null);
                        currRow.setArTrxnTypeId(null);
                        currRow.setArContext(null);
                        currRow.setTransARContext(null);
                        currRow.setUserJeSourceName(null);
                        currRow.setTransGLSource(null);
                        currRow.setUserJeCategoryName(null);
                        currRow.setTransGLCategory(null);
                        currRow.setTransPADocCategory(null);
                        currRow.setPaDocumentCategory(null);
                        currRow.setEffectiveTo(null);
                        currRow.setEffectiveFrom(null);
                    }else{
                        if("GL".equals(currRow.getTransSetupType())){
                            currRow.setArSourceId(null);
                            currRow.setTransARSource(null);
                            currRow.setTransARTrxnType(null);
                            currRow.setArTrxnTypeId(null);
                            currRow.setArContext(null);
                            currRow.setTransARContext(null);
                            currRow.setTransPADocCategory(null);
                            currRow.setPaDocumentCategory(null);
                        }else if("AR".equals(currRow.getTransSetupType())){
                            currRow.setUserJeSourceName(null);
                            currRow.setTransGLSource(null);
                            currRow.setUserJeCategoryName(null);
                            currRow.setTransGLCategory(null);
                            currRow.setTransPADocCategory(null);
                            currRow.setPaDocumentCategory(null);
                        }else if("PA".equals(currRow.getTransSetupType())){
                            currRow.setArSourceId(null);
                            currRow.setTransARSource(null);
                            currRow.setTransARTrxnType(null);
                            currRow.setArTrxnTypeId(null);
                            currRow.setArContext(null);
                            currRow.setTransARContext(null);
                            currRow.setUserJeSourceName(null);
                            currRow.setTransGLSource(null);
                            currRow.setUserJeCategoryName(null);
                            currRow.setTransGLCategory(null);
                        }
                        if(previousEndDate != null){
                            currRow.setEffectiveFrom((Date) new oracle.jbo.domain.Date(previousEndDate)
                                                     .addJulianDays(1, 0));
                            currRow.setTransEffectiveFromEditFlag("N");
                        }  
                        else if(count == 0 &&  previousEndDate == null) {
                            if(ADFContext.getCurrent().getPageFlowScope().get("accParamFromDateChanged") == null || ! "Y".equals(ADFContext.getCurrent().getPageFlowScope().get("accParamFromDateChanged"))){
                                currRow.setEffectiveFrom(null);
                            }
                            currRow.setTransEffectiveFromEditFlag(null);
                        }
                    }
                }
            }
        }catch (Exception e) {
            message = e.getMessage();
            e.printStackTrace();
        }
        return message;
    }
    
    public String accParamsEndDateChange(){
        String message = "Success";
        try {
            BuAccountingParamsVORowImpl currRow =
                (BuAccountingParamsVORowImpl) getBuAccountingParamsVO1().getCurrentRow();
            if(currRow != null && currRow.getEffectiveTo() != null){
                java.sql.Timestamp datetime = new java.sql.Timestamp(System.currentTimeMillis());
                oracle.jbo.domain.Date currDate = new  oracle.jbo.domain.Date(datetime);
                
                if(currDate.compareTo(currRow.getEffectiveTo()) > 0){
                    currRow.setEffectiveTo(null);
                    message = "Effective To should be only be after Current Date";
                }
            }
        }catch (Exception e) {
            message = e.getMessage();
            e.printStackTrace();
        }
        return message;
    }    
    
    public String grpCustEndDateChange(){
        String message = "Success";
        try {
            GroupCustomerMapVORowImpl currRow =
                (GroupCustomerMapVORowImpl) getGroupCustomerMapVO1().getCurrentRow();
            if(currRow != null && currRow.getEffectiveToDate() != null){
                java.sql.Timestamp datetime = new java.sql.Timestamp(System.currentTimeMillis());
                oracle.jbo.domain.Date currDate = new  oracle.jbo.domain.Date(datetime);
                
                if(currDate.compareTo(currRow.getEffectiveToDate()) > 0){
                    currRow.setEffectiveToDate(null);
                    message = "Effective To should be only be after Current Date";
                }
            }
        }catch (Exception e) {
            message = e.getMessage();
            e.printStackTrace();
        }
        return message;
    }
    
    public String acctParamsReqBuChange(){
        String message = "Success";
        oracle.jbo.domain.Date previousEndDate = null;
        try {
            TransAccParamsSearchVORowImpl searchRow =
                (TransAccParamsSearchVORowImpl) getTransAccParamsSearchVO1().getCurrentRow();
            if(searchRow != null){
                GroupCustomerMapVORowImpl currRow =
                    (GroupCustomerMapVORowImpl) getGroupCustomerMapVO1().getCurrentRow();
                if(currRow != null && currRow.getRequestingBuId()!= null){
                    getGroupCustomerMapValidateVO1().setApplyViewCriteriaName(null);
                    getGroupCustomerMapValidateVO1().executeQuery();
                    
                    getGroupCustomerMapValidateVO1().setNamedWhereClauseParam("p_bu_id", currRow.getBuId());
                    getGroupCustomerMapValidateVO1().setNamedWhereClauseParam("p_flex_value_id", currRow.getFlexValueId() == null ? new oracle.jbo.domain.Number(2) : currRow.getFlexValueId());
                    getGroupCustomerMapValidateVO1().setNamedWhereClauseParam("p_req_bu_id", currRow.getRequestingBuId());
                    getGroupCustomerMapValidateVO1().setNamedWhereClauseParam("p_mapping_id", currRow.getMappingId());
                    
                    getGroupCustomerMapValidateVO1().setApplyViewCriteriaName("GroupCustomerMapValidateVOCriteria");
                    getGroupCustomerMapValidateVO1().setOrderByClause("XxadsGroupCustomerMapEO.EFFECTIVE_TO_DATE desc");
                    getGroupCustomerMapValidateVO1().executeQuery();
                    
                    
                    GroupCustomerMapValidateVORowImpl previousRow =
                        (GroupCustomerMapValidateVORowImpl) getGroupCustomerMapValidateVO1().first();
                    if(previousRow != null && previousRow.getEffectiveToDate() != null){
                        previousEndDate = new oracle.jbo.domain.Date(previousRow.getEffectiveToDate());
                    }
                    
                    if(currRow.getEffectiveFromDate() != null){
                        RowSetIterator filteredRows = getGroupCustomerMapValidateVO1().createRowSetIterator(null);
                                            
                        while(filteredRows.hasNext()){
                            GroupCustomerMapValidateVORowImpl currFilRow = (GroupCustomerMapValidateVORowImpl)filteredRows.next();
                            if(currFilRow.getEffectiveFromDate().compareTo(currRow.getEffectiveFromDate()) > 0){
                                if(currRow.getEffectiveToDate() == null){
                                    return "Group Customer is already defined for "+ currRow.getTransRequestingBU()+" for the given dates range";
                                }
                                else if(currFilRow.getEffectiveFromDate().compareTo(currRow.getEffectiveToDate())<=0){
                                   return "Group Customer is already defined for "+ currRow.getTransRequestingBU()+" for the given dates range";
                               }
                            }
                            else if(currFilRow.getEffectiveFromDate().compareTo(currRow.getEffectiveFromDate()) < 0){
                                if(currFilRow.getEffectiveToDate() == null){
                                    return "Group Customer is already defined for "+ currRow.getTransRequestingBU()+" for the given dates range";
                                }
                                else if(currRow.getEffectiveFromDate().compareTo(currFilRow.getEffectiveToDate()) <= 0){
                             return "Group Customer is already defined for "+ currRow.getTransRequestingBU()+" for the given dates range";
                                }
                            }
                            else{
                                return "Group Customer is already defined for "+ currRow.getTransRequestingBU()+" for the given dates range";
                            }
                        }
                    }
                    if(previousEndDate != null){
                        currRow.setEffectiveFromDate((Date) new oracle.jbo.domain.Date(previousEndDate)
                                                 .addJulianDays(1, 0));
                        currRow.setTransEffFromDateEditFlag("N");
                    }
                    
                    if(currRow.getEffectiveToDate() != null){
                        java.sql.Timestamp datetime = new java.sql.Timestamp(System.currentTimeMillis());
                        oracle.jbo.domain.Date currDate = new  oracle.jbo.domain.Date(datetime);
                        
                        if(currDate.compareTo(currRow.getEffectiveToDate()) > 0){
                            currRow.setEffectiveToDate(null);
                            message = "Effective To Date should be only be after Current Date";
                        }
                    }
                }
            }
        }catch (Exception e) {
            message = e.getMessage();
            e.printStackTrace();
        }
        return message;
    }
    
    public String createAccParamsTransSearch(){
        String message = "Success";
        try {
            TransAccParamsSearchVORowImpl row =
                (TransAccParamsSearchVORowImpl) getTransAccParamsSearchVO1().getCurrentRow();
            if(row != null){
                row.remove();
            }
            getTransAccParamsSearchVO1().insertRow(getTransAccParamsSearchVO1().createRow());
            ADFContext.getCurrent().getPageFlowScope().put("buChangeFlag", "Y");
        }catch (Exception e) {
            e.printStackTrace();
            message = e.getMessage();
        }
        return message;
    }
    
    public String searchBuAccountingParams(){
        String message = "Success";
        try {
            TransAccParamsSearchVORowImpl searchRow =
                (TransAccParamsSearchVORowImpl) getTransAccParamsSearchVO1().getCurrentRow();
            String onlyBuChangeFlag = (String) ADFContext.getCurrent()
                                                         .getPageFlowScope()
                                                         .get("onlyBuChangeFlag");
            if("Y".equalsIgnoreCase(onlyBuChangeFlag))
            {
                searchRow.setTransDivision(null);
//                searchRow.setTransDivisionRequired(null);
//                searchRow.setTransDivisionSegment(null);
                searchRow.setTransDivFlexValueId(null);
                searchRow.setTransDivFlexValSetId(null);
                ADFContext.getCurrent().getPageFlowScope().put("onlyBuChangeFlag", "N");
            }
            
            if(searchRow != null && searchRow.getTransBuId() != null){
                if(("Y".equals(searchRow.getTransDivisionRequired()) && searchRow.getTransDivision() != null) || !("Y".equals(searchRow.getTransDivisionRequired()))){
                    getBuAccountingParamsVO1().setNamedWhereClauseParam("p_search_bu_id", searchRow.getTransBuId());
                    getBuAccountingParamsVO1().setNamedWhereClauseParam("p_flex_value_id", searchRow.getTransDivFlexValueId());
                    getBuAccountingParamsVO1().executeQuery();
                    
                    getGroupCustomerMapVO1().setNamedWhereClauseParam("p_bu_id", searchRow.getTransBuId());
                    getGroupCustomerMapVO1().setNamedWhereClauseParam("p_flex_value_id", searchRow.getTransDivFlexValueId());
                    getGroupCustomerMapVO1().executeQuery();
                    
                    getDivisionAccountMapVO1().setNamedWhereClauseParam("p_search_bu_id", searchRow.getTransBuId());
                    getDivisionAccountMapVO1().setNamedWhereClauseParam("p_flex_value_id", searchRow.getTransDivFlexValueId());
                    getDivisionAccountMapVO1().executeQuery();
                }
            }
        }catch (Exception e) {
            e.printStackTrace();
            message = e.getMessage();
        }
        return message;
    }
    
    public String searchBuRentalMaster(){
        String message = "Success";
        try {
            TransRentalMasterSearchVORowImpl searchRow =
                (TransRentalMasterSearchVORowImpl) getTransRentalMasterSearchVO1().getCurrentRow();
            String rentalOnlyBuFlag = (String) ADFContext.getCurrent()
                                                         .getPageFlowScope()
                                                         .get("rentalOnlyBuFlag");
            if("Y".equalsIgnoreCase(rentalOnlyBuFlag))
            {
                searchRow.setTransDivision(null);
                searchRow.setTransDivisionRequired(null);
                searchRow.setTransFlexValueId(null);
                searchRow.setTransFlexValueSetId(null);
            }
            if(searchRow != null && searchRow.getTransBuId() != null){
                if(("Y".equals(searchRow.getTransDivisionRequired()) && searchRow.getTransDivision() != null) || !("Y".equals(searchRow.getTransDivisionRequired()))){
                    getRentalMasterVO1().setNamedWhereClauseParam("p_search_bu_id", searchRow.getTransBuId());
                    getRentalMasterVO1().setNamedWhereClauseParam("p_flex_value_id", searchRow.getTransFlexValueId());
                    getRentalMasterVO1().executeQuery();
                    
                }
            }
        }catch (Exception e) {
            e.printStackTrace();
            message = e.getMessage();
        }
        return message;
    }
    public String insertTransRentalMasterRow()
    {
        String message="Success";
        try {
            TransRentalMasterSearchVOImpl table=getTransRentalMasterSearchVO1();
            TransRentalMasterSearchVORowImpl row = (TransRentalMasterSearchVORowImpl) table.createRow();
            table.insertRow(row);
           ADFContext.getCurrent().getPageFlowScope().put("rentalbuChangeFlag", "Y");
            
            getRentalMasterVO1().executeEmptyRowSet();
            
       } catch (Exception e) {
            message=e.getMessage();
            e.printStackTrace();
        }
        return message;
    }
    
    public String rentalMasterUniquenes(){
        String message = "Success";
        oracle.jbo.domain.Date previousEndDate = null; 
        int count = 0;
        try {
            TransRentalMasterSearchVORowImpl searchRow=(TransRentalMasterSearchVORowImpl)getTransRentalMasterSearchVO1().getCurrentRow();
            if(searchRow!=null)
            {
                RentalMasterVORowImpl currRow=(RentalMasterVORowImpl)getRentalMasterVO1().getCurrentRow();
                if(currRow!=null && currRow.getAssetCategoryId()!=null && currRow.getHiringRuleId()!=null)
                {
                    getRentalMasterValidateVO1().setApplyViewCriteriaName(null);
                    getRentalMasterValidateVO1().executeQuery();
                    
                    getRentalMasterValidateVO1().setNamedWhereClauseParam("p_bu_id", currRow.getBuId());
                    getRentalMasterValidateVO1().setNamedWhereClauseParam("p_flex_value_id", currRow.getFlexValueId() == null ? new oracle.jbo.domain.Number(2) : currRow.getFlexValueId());
                    getRentalMasterValidateVO1().setNamedWhereClauseParam("p_asset_category_id", currRow.getAssetCategoryId());
                    getRentalMasterValidateVO1().setNamedWhereClauseParam("p_hiring_rule_id", currRow.getHiringRuleId());
                    getRentalMasterValidateVO1().setNamedWhereClauseParam("p_rate_id", currRow.getRateId());
                    getRentalMasterValidateVO1().setNamedWhereClauseParam("p_rental_type", currRow.getRentalType());
                    getRentalMasterValidateVO1().setApplyViewCriteriaName("RentalMasterValidateVOCriteria");
                    getRentalMasterValidateVO1().executeQuery();
                    getRentalMasterValidateVO1().setOrderByClause("XxadsRentalRateMasterEO.EFFECTIVE_TO_DATE desc");
                    
                    RentalMasterValidateVORowImpl previousRow =
                       (RentalMasterValidateVORowImpl) getRentalMasterValidateVO1().first();
                   if(previousRow != null && previousRow.getEffectiveToDate() != null){
                       previousEndDate = new oracle.jbo.domain.Date(previousRow.getEffectiveToDate());
                   }
                                           
                    if(currRow.getEffectiveFromDate() != null){
                        RowSetIterator filteredRows = getRentalMasterValidateVO1().createRowSetIterator(null);
                                            
                        while(filteredRows.hasNext()){
                            RentalMasterValidateVORowImpl currFilRow = (RentalMasterValidateVORowImpl)filteredRows.next();
                            if(currFilRow.getEffectiveFromDate().compareTo(currRow.getEffectiveFromDate()) > 0){
                                String rentalStartDateFlag = (String) ADFContext.getCurrent()
                                                                      .getPageFlowScope()
                                                                      .get("rentalStartDateFlag");
                                
                                if(currRow.getEffectiveToDate() == null){
                                    count = 1;
                                }
                                else if(currRow.getEffectiveToDate() != null && currFilRow.getEffectiveFromDate().compareTo(currRow.getEffectiveToDate())<=0){
                                   count = 1;
                               }
                            }
                            else if(currFilRow.getEffectiveFromDate().compareTo(currRow.getEffectiveFromDate()) < 0){
                                if(currFilRow.getEffectiveToDate() == null){
                                    count = 1;
                                }
                                else if(currRow.getEffectiveFromDate().compareTo(currFilRow.getEffectiveToDate()) <= 0){
                                    count = 2;
                                }
                            }
                            else{
                                count = 1;
                            }
                        }
                    }//
                    if(count>0)
                    {
                        message = "Rental Rate is already defined for Business Unit "+searchRow.getTransBuName()+
                                        (searchRow.getTransDivision() == null ? ", " : ", Division "+searchRow.getTransDivision()+", ")+
                                        "Rental Type "+ currRow.getTransRentalType() +
                                        ", Asset Category "+currRow.getTransAssetCategory()+
                                        ", Hiring Basis "+currRow.getTransHiringBasis()+" for the given dates range";
                        String rentalflagValue = (String) ADFContext.getCurrent()
                                                              .getPageFlowScope()
                                                              .get("rentalAsstCategoryFlag");
                        if("Y".equalsIgnoreCase(rentalflagValue))
                        {
                            currRow.setTransAssetCategory(null);
                            currRow.setAssetCategoryId(null);
                        }
                        else  if("Y".equalsIgnoreCase((String) ADFContext.getCurrent()
                                                              .getPageFlowScope()
                                                              .get("rentalTypeFlag")))
                        {
                            currRow.setEffectiveFromDate(null);
                            
                        }
                        else  if("Y".equalsIgnoreCase((String) ADFContext.getCurrent()
                                                              .getPageFlowScope()
                                                              .get("rentalStartDateFlag")))
                        {
                            currRow.setEffectiveFromDate(null);
                            
                        }
                        else  if("Y".equalsIgnoreCase((String) ADFContext.getCurrent()
                                                              .getPageFlowScope()
                                                              .get("rentalEndDateFlag")))
                        {
                            currRow.setEffectiveToDate(null);
                        }
                    }
                    else
                    {
                        if(previousEndDate != null)
                        {
                            currRow.setEffectiveFromDate((Date)new oracle.jbo.domain.Date(previousEndDate)
                                                 .addJulianDays(1, 0));
                            currRow.setTransEffectiveFromDateEditFlag("N");
                        }    
                        if(currRow.getEffectiveToDate() != null){
                            java.sql.Timestamp datetime = new java.sql.Timestamp(System.currentTimeMillis());
                            oracle.jbo.domain.Date currDate = new  oracle.jbo.domain.Date(datetime);
                            
                            if(currDate.compareTo(currRow.getEffectiveToDate()) < 0){
                                currRow.setEffectiveToDate(null);
                                message = "Effective To should be only on or before Current Date";
                            }
                        }  
                    }
                    
                }
            }
            
        }catch (Exception e) {
            message = e.getMessage();
            e.printStackTrace();
        }
        return message;
    }
    /**
     * Container's getter for BuAccountingParamsVO1.
     * @return BuAccountingParamsVO1
     */
    public BuAccountingParamsVOImpl getBuAccountingParamsVO1() {
        return (BuAccountingParamsVOImpl) findViewObject("BuAccountingParamsVO1");
    }

    /**
     * Container's getter for GroupCustomerMapVO1.
     * @return GroupCustomerMapVO1
     */
    public GroupCustomerMapVOImpl getGroupCustomerMapVO1() {
        return (GroupCustomerMapVOImpl) findViewObject("GroupCustomerMapVO1");
    }

    /**
     * Container's getter for BuAccParamsValidateVO1.
     * @return BuAccParamsValidateVO1
     */
    public BuAccParamsValidateVOImpl getBuAccParamsValidateVO1() {
        return (BuAccParamsValidateVOImpl) findViewObject("BuAccParamsValidateVO1");
    }

    /**
     * Container's getter for GroupCustomerMapValidateVO1.
     * @return GroupCustomerMapValidateVO1
     */
    public GroupCustomerMapValidateVOImpl getGroupCustomerMapValidateVO1() {
        return (GroupCustomerMapValidateVOImpl) findViewObject("GroupCustomerMapValidateVO1");
    }

    /**
     * Container's getter for RentalMasterVO1.
     * @return RentalMasterVO1
     */
    public RentalMasterVOImpl getRentalMasterVO1() {
        return (RentalMasterVOImpl) findViewObject("RentalMasterVO1");
    }

    /**
     * Container's getter for TransRentalMasterSearchVO1.
     * @return TransRentalMasterSearchVO1
     */
    public TransRentalMasterSearchVOImpl getTransRentalMasterSearchVO1() {
        return (TransRentalMasterSearchVOImpl) findViewObject("TransRentalMasterSearchVO1");
    }

    /**
     * Container's getter for RentalMasterValidateVO1.
     * @return RentalMasterValidateVO1
     */
    public RentalMasterValidateVOImpl getRentalMasterValidateVO1() {
        return (RentalMasterValidateVOImpl) findViewObject("RentalMasterValidateVO1");
    }  
    public void addAccessSecurity() 
    {
        try 
        {
            TransAccessSecuritySearchVORowImpl transRow =
                (TransAccessSecuritySearchVORowImpl) getTransAccessSecuritySearchVO1().getCurrentRow();
            if(transRow != null && transRow.getTransBuId() != null && ( ("Y".equals(transRow.getTransDivisionRequired()) && transRow.getTransDivision() != null ) || (!("Y".equals(transRow.getTransDivisionRequired())) )) )
            {
                AccessSecurityHdrVORowImpl newRow = (AccessSecurityHdrVORowImpl) getAccessSecurityHdrVO1().createRow();
                getAccessSecurityHdrVO1().insertRow(newRow);
                newRow.setBuId(transRow.getTransBuId());
                newRow.setFlexValueId(transRow.getTransFlexValueId());
                newRow.setFlexValueSetId(transRow.getTransFlexValueSetId());
                newRow.setDivision(transRow.getTransDivision());
                ADFContext.getCurrent().getPageFlowScope().put("enableRoleDetails", "N");
                
            }
        }
        catch(Exception e) 
        {
            e.printStackTrace();    
        }
    }
    
    public String searchAccessSecurity() 
    {
        String msg = "Success";
        try 
        {
            TransAccessSecuritySearchVORowImpl transRow =
                (TransAccessSecuritySearchVORowImpl) getTransAccessSecuritySearchVO1().getCurrentRow();
            if(transRow != null && transRow.getTransBuId() != null) 
            {
                    getAccessSecurityHdrVO1().setNamedWhereClauseParam("p_bu_id", transRow.getTransBuId());
                    getAccessSecurityHdrVO1().setNamedWhereClauseParam("p_flex_value_id", transRow.getTransFlexValueId());
                    getAccessSecurityHdrVO1().executeQuery();
                    System.out.println("Count: "+getAccessSecurityHdrVO1().getRowCount());
            }
        }
        catch(Exception e) 
        {
            e.printStackTrace();    
            return e.getMessage();
        }
        return msg;
    }
    
    public String resetAccessSecuritySearch()
    {
        String msg = "Success";
        try{
            TransAccessSecuritySearchVORowImpl transRow =
                (TransAccessSecuritySearchVORowImpl) getTransAccessSecuritySearchVO1().getCurrentRow();
            if(transRow != null){
        //
                transRow.setTransBuName(null);
                transRow.setTransBuId(null);
                transRow.setTransFlexValueId(null);
                transRow.setTransFlexValueSetId(null);
                transRow.setTransDivision(null);
                transRow.setTransDivisionRequired(null);
                
                getAccessSecurityHdrVO1().setNamedWhereClauseParam("p_bu_id", null);
                getAccessSecurityHdrVO1().setNamedWhereClauseParam("p_flex_value_id", null);
                getAccessSecurityHdrVO1().executeQuery();
                
//                getRetroCalculationVO1().executeQuery();
            }
        }
        catch(Exception e) 
        {
            e.printStackTrace();
            return e.getMessage();
        }
        return msg;
    }
    
    public String addSecurityRole() 
    {
        String msg = "Success";
        try 
        {
            AccessSecurityHdrVORowImpl hdrRow =
                (AccessSecurityHdrVORowImpl) getAccessSecurityHdrVO1().getCurrentRow();
            if(hdrRow.getAccessLevel() != null && hdrRow.getEndDate() == null && "S".equals(hdrRow.getAccessLevel()))
            {
                AccessSecurityLinesVORowImpl newRow = (AccessSecurityLinesVORowImpl) getAccessSecurityLinesVO1().createRow();
                getAccessSecurityLinesVO1().insertRow(newRow);
                newRow.setTransSourceBuId(hdrRow.getBuId());
                newRow.setTransSourceStartDate(hdrRow.getStartDate());
                newRow.setActiveFlag("Y");
            }
            else if(hdrRow.getAccessLevel() != null)
            {
                return "Role Details can be entered only for Specific access level.";    
            }
            else if(hdrRow.getEndDate() != null) {
                return "Cannot add new role for users having End Date.";
            }
        }
        catch(Exception e) 
        {
            e.printStackTrace();    
            return e.getMessage();
        }
        return msg;
    }
    
    public String deleteUserSecurity()
    {
        String message="Success";
        try {
            AccessSecurityHdrVOImpl table=getAccessSecurityHdrVO1();
            AccessSecurityHdrVORowImpl row = (AccessSecurityHdrVORowImpl) table.getCurrentRow();
            
            if(row.getEntity(0).getEntityState() != 0)
            {
                return "Saved rows cannot be deleted.";
            }
            else
            {
                getAccessSecurityLinesValidateVO1().setApplyViewCriteriaName(null);
                getAccessSecurityLinesValidateVO1().executeQuery();
                getAccessSecurityLinesValidateVO1().setApplyViewCriteriaName("AccessSecurityLinesValidateVOCriteria");
                getAccessSecurityLinesValidateVO1().setNamedWhereClauseParam("p_hdr_id", row.getHeaderId());
                getAccessSecurityLinesValidateVO1().executeQuery();
                AccessSecurityLinesValidateVORowImpl firstRow = (AccessSecurityLinesValidateVORowImpl) getAccessSecurityLinesValidateVO1().first();
                if(firstRow!=null)
                {
                    return "Please delete asset attributes first.";
                }
                               
                table.removeCurrentRow();
            }
            
       } catch (Exception e) {
            message=e.getMessage();
            e.printStackTrace();
        }
        return message;
    }

    /**
     * Container's getter for AccessSecurityLinesValidateVO1.
     * @return AccessSecurityLinesValidateVO1
     */
    public AccessSecurityLinesValidateVOImpl getAccessSecurityLinesValidateVO1() {
        return (AccessSecurityLinesValidateVOImpl) findViewObject("AccessSecurityLinesValidateVO1");
    }

        
    public String saveAccessSecurity() 
    {
        String emsg = "E";
        String wmsg = "W";
        try 
        {
            TransAccessSecuritySearchVORowImpl transRow =
                (TransAccessSecuritySearchVORowImpl) getTransAccessSecuritySearchVO1().getCurrentRow();
            RowSetIterator hdrItr = getAccessSecurityHdrVO1().createRowSetIterator(null);
            while(hdrItr.hasNext()) 
            {
                AccessSecurityHdrVORowImpl currRow = (AccessSecurityHdrVORowImpl) hdrItr.next();  
                if(currRow.getEntity(0).getEntityState() == 0 || currRow.getEntity(0).getEntityState() == 2) 
                {
                    
                    getAccessSecurityHdrValidateVO1().setApplyViewCriteriaName(null);
                    getAccessSecurityHdrValidateVO1().executeQuery();
                    
                    getAccessSecurityHdrValidateVO1().setApplyViewCriteriaName("AccessSecurityHdrValidateVOCriteria");
                    getAccessSecurityHdrValidateVO1().setNamedWhereClauseParam("p_bu_id",currRow.getBuId());
                    getAccessSecurityHdrValidateVO1().setNamedWhereClauseParam("p_hdr_id",currRow.getHeaderId());
                    getAccessSecurityHdrValidateVO1().setNamedWhereClauseParam("p_user_id",currRow.getUserId());
                    getAccessSecurityHdrValidateVO1().executeQuery();
                    
                    RowSetIterator filteredRows = getAccessSecurityHdrValidateVO1().createRowSetIterator(null);
                    while(filteredRows.hasNext()){
                        AccessSecurityHdrValidateVORowImpl currFilRow = (AccessSecurityHdrValidateVORowImpl)filteredRows.next();
                       if(currFilRow.getStartDate()!= null && currRow.getStartDate() != null)
                       {
                            if(currFilRow.getStartDate().compareTo(currRow.getStartDate()) > 0){
                                if(currRow.getEndDate() == null)
                                {
                                    if((currFilRow.getDivision() == null && currRow.getDivision()== null)
                                        || (currRow.getDivision()!= null && currFilRow.getDivision() !=null && currRow.getDivision().equals(currFilRow.getDivision()))
                                    )
                                    {
                                        currRow.setStartDate(null);
                                        currRow.setEndDate(null);
                                        return (emsg == null ? "" : emsg + "_") +  currRow. getTransUserName() +" is already active in Business Unit : "+ transRow.getTransBuName()  +" and Division : " +currFilRow.getDivision()+" for the given dates. Enter a unique value.";
                                    }
                                    else 
                                    {
                                        
                                        return (wmsg == null ? "" : wmsg + "_") + currRow.getHeaderId()+"_"+ currRow. getTransUserName() +" is already active in Business Unit : "+ transRow.getTransBuName()  +" and Division : " +currFilRow.getDivision()+" for the given dates.";
                                    }
                                    
    
                                }
                                else if(currFilRow.getStartDate().compareTo(currRow.getEndDate())<=0){
                                   
                                   if((currFilRow.getDivision() == null && currRow.getDivision() == null)
                                       || (currRow.getDivision()!= null && currFilRow.getDivision() != null && currRow.getDivision().equals(currFilRow.getDivision()))
                                   )
                                   {
//                                                                              currRow.setStartDate(null);
                                       currRow.setEndDate(null);
                                       return (emsg == null ? "" : emsg + "_") +  currRow. getTransUserName() +" is already active in Business Unit : "+ transRow.getTransBuName()  +" and Division : " +currFilRow.getDivision()+" for the given dates. Enter a unique value.";
                                   }
                                   else 
                                   {
//                                       msg = (msg == null ? "" : msg + "_") + "W";
                                       return (wmsg == null ? "" : wmsg + "_") +currRow.getHeaderId()+"_"+  currRow. getTransUserName() +" is already active in Business Unit :"+ transRow.getTransBuName()  +" and Division : " +currFilRow.getDivision()+" for the given dates.";
    //                                   ADFContext.getCurrent().getPageFlowScope().put("msgType", "W");
                                   }
                                   
                               }
                            }
                            else if(currFilRow.getStartDate().compareTo(currRow.getStartDate()) < 0){
                                if(currFilRow.getEndDate() == null){
                                    
                                    if((currFilRow.getDivision() == null && currRow.getDivision() == null)
                                        || (currRow.getDivision()!= null && currFilRow.getDivision() !=null && currRow.getDivision().equals(currFilRow.getDivision()))
                                    )
                                    {
                                        currRow.setStartDate(null);
                                        currRow.setEndDate(null);
                                        return (emsg == null ? "" : emsg + "_") +  currRow. getTransUserName() +" is already active in Business Unit : "+ transRow.getTransBuName()  +" and Division : " +currFilRow.getDivision()+" for the given dates. Enter a unique value.";
                                    }
                                    else 
                                    {
//                                        msg = (msg == null ? "" : msg + "_") + "W";
                                       return (wmsg == null ? "" : wmsg + "_") +currRow.getHeaderId()+"_"+  currRow. getTransUserName() +" is already active in Business Unit : "+ transRow.getTransBuName()  +" and Division : " +currFilRow.getDivision()+" for the given dates." +
                                           "";
//    //                                    ADFContext.getCurrent().getPageFlowScope().put("msgType", "W");
                                    }
                                    
                                }
                                else if(currRow.getStartDate().compareTo(currFilRow.getEndDate()) <= 0){
                                    if((currRow.getDivision() == null && currRow.getDivision() == null)
                                        || (currRow.getDivision()!= null && currFilRow.getDivision() != null  && currRow.getDivision().equals(currFilRow.getDivision()))
                                    )
                                    {
                                        currRow.setStartDate(null);
                                        currRow.setEndDate(null);
                                        return (emsg == null ? "" : emsg + "_") + "The given dates for Business Unit : "+transRow.getTransBuName() +", Division : " +currFilRow.getDivision()+" and User :  " +currFilRow.getTransUserName()+ "  are invalid. This record causes an overlap with an existing combination.";
                                    }
                                    else 
                                    {
                                        return (wmsg == null ? "" : wmsg + "_") + currRow.getHeaderId()+"_"+"The given dates for Business Unit : "+transRow.getTransBuName() +", Division : " +currFilRow.getDivision()+" and User : "+currFilRow.getTransUserName()+"  are invalid. This record causes an overlap with an existing combination.";
                                    }
                                    
                                }
                            }
                            else{
                            
                            if((currFilRow.getDivision() == null && currRow.getDivision() == null)
                                || (currRow.getDivision()!= null && currFilRow.getDivision() != null &&  currRow.getDivision().equals(currFilRow.getDivision()))
                            )
                            {
                                currRow.setStartDate(null);
                                currRow.setEndDate(null);
                                return (emsg == null ? "" : emsg + "_") +  currRow. getTransUserName() +" is already active in Business Unit : "+ transRow.getTransBuName()  +" and Division : " +currFilRow.getDivision()+" for the given dates. Enter a unique value.";
                            }
                            else 
                            {
                               return (wmsg == null ? "" : wmsg + "_") + currRow.getHeaderId()+"_"+ currRow. getTransUserName() +" is already active in Business Unit : "+ transRow.getTransBuName()  +" and Division : " +currFilRow.getDivision()+" for the given dates.";
//                                msg = (msg == null ? "" : msg + "_") + "W";
////                                ADFContext.getCurrent().getPageFlowScope().put("msgType", "W");
                            }
                            
                        }
                       }
                    }
                
                    if("S".equals(currRow.getAccessLevel()))
                    {
                        getAccessSecurityLinesValidateVO1().setApplyViewCriteriaName("AccessSecurityLinesValidateVOCriteria");
                        getAccessSecurityLinesValidateVO1().setNamedWhereClauseParam("p_hdr_id", currRow.getHeaderId());
                        getAccessSecurityLinesValidateVO1().executeQuery();
                        
                        if(getAccessSecurityLinesValidateVO1().getRowCount() == new Long(0)) 
                        {
//                            msg = (msg == null ? "" : msg + "_") + "E"; 
                            return (emsg == null ? "" : emsg + "_") + "Missing Role Details!! Role Details are mandatory for the user : "+ currRow. getTransUserName() + " with Specific Access Level.";
                        }
                    }
                }
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
            return e.getMessage();
        }
        if(emsg.length() > 1)
        {
            return emsg;
        }
        else if(wmsg.length() > 1)
        {
            return wmsg;
        }
        else {
            return "Success";
        }
    }

    /**
     * Container's getter for AccessSecurityHdrValidateVO1.
     * @return AccessSecurityHdrValidateVO1
     */
    public AccessSecurityHdrValidateVOImpl getAccessSecurityHdrValidateVO1() {
        return (AccessSecurityHdrValidateVOImpl) findViewObject("AccessSecurityHdrValidateVO1");
    }

    /**
     * Container's getter for AssetMasterSearchVO1.
     * @return AssetMasterSearchVO1
     */
    public AssetMasterSearchVOImpl getAssetMasterSearchVO1() {
        return (AssetMasterSearchVOImpl) findViewObject("AssetMasterSearchVO1");
    }

    /**
     * Container's getter for AssetMasterVO1.
     * @return AssetMasterVO1
     */
    public AssetMasterVOImpl getAssetMasterVO1() {
        return (AssetMasterVOImpl) findViewObject("AssetMasterVO1");
    }

    /**
     * Container's getter for AssetMasterAttributesVO1.
     * @return AssetMasterAttributesVO1
     */
    public AssetMasterAttributesVOImpl getAssetMasterAttributesVO1() {
        return (AssetMasterAttributesVOImpl) findViewObject("AssetMasterAttributesVO1");
    }

    /**
     * Container's getter for AssetHierarchyVO1.
     * @return AssetHierarchyVO1
     */
    public AssetHierarchyVOImpl getAssetHierarchyVO1() {
        return (AssetHierarchyVOImpl) findViewObject("AssetHierarchyVO1");
    }

    /**
     * Container's getter for AssetCertificationsVO1.
     * @return AssetCertificationsVO1
     */
    public AssetCertificationsVOImpl getAssetCertificationsVO1() {
        return (AssetCertificationsVOImpl) findViewObject("AssetCertificationsVO1");
    }

    /**
     * Container's getter for AssetAccessoriesVO1.
     * @return AssetAccessoriesVO1
     */
    public AssetAccessoriesVOImpl getAssetAccessoriesVO1() {
        return (AssetAccessoriesVOImpl) findViewObject("AssetAccessoriesVO1");
    }

    /**
     * Container's getter for AssetOperatorVO1.
     * @return AssetOperatorVO1
     */
    public AssetOperatorVOImpl getAssetOperatorVO1() {
        return (AssetOperatorVOImpl) findViewObject("AssetOperatorVO1");
    }
    
    public String createAsset(){
        String message = "Success";
        try {
            getAssetMasterVO1().executeQuery();
            AssetMasterVORowImpl newRow = (AssetMasterVORowImpl) getAssetMasterVO1().createRow();
            getAssetMasterVO1().insertRow(newRow);
            newRow.setDeploymentStatus("A");
            newRow.setTransDeploymentStatus("Available");
        }catch (Exception e) {
            e.printStackTrace();
            message = e.getMessage();
        }
        return message;
    }
    
    public String editAsset(){
        String message = "Success";
        try {
            AssetMasterSearchVORowImpl searchRow =
                (AssetMasterSearchVORowImpl) getAssetMasterSearchVO1().getCurrentRow();
            if(searchRow != null){
                getAssetMasterVO1().setNamedWhereClauseParam("p_asset_id", searchRow.getAssetId());
                getAssetMasterVO1().executeQuery();
                
                getAssetMasterAttributesVO1().setNamedWhereClauseParam("p_asset_id", searchRow.getAssetId());
                getAssetMasterAttributesVO1().executeQuery();
                
                getAssetHierarchyVO1().setNamedWhereClauseParam("p_asset_id", searchRow.getAssetId());
                getAssetHierarchyVO1().executeQuery();
                
                getAssetOperatorVO1().setNamedWhereClauseParam("p_asset_id", searchRow.getAssetId());
                getAssetOperatorVO1().executeQuery();
                
                getAssetAccessoriesVO1().setNamedWhereClauseParam("p_asset_id", searchRow.getAssetId());
                getAssetAccessoriesVO1().executeQuery();
                
                getAssetCertificationsVO1().setNamedWhereClauseParam("p_asset_id", searchRow.getAssetId());
                getAssetCertificationsVO1().executeQuery();
            }
        }catch (Exception e) {
            e.printStackTrace();
            message = e.getMessage();
        }
        return message;
    }
    
    public String assetMasterCategoryChange(){
        String message = "Success";
        try {
            AssetMasterVORowImpl currRow = (AssetMasterVORowImpl) getAssetMasterVO1().getCurrentRow();
            if(currRow != null && currRow.getAssetCategoryId() != null){
                //Check whether already lines are there
                if(getAssetMasterAttributesVO1().getRowCount() > 0){
                    message = "W";
                    RowSetIterator rs = getAssetMasterAttributesVO1().createRowSetIterator(null);
                    while(rs.hasNext()){
                        AssetMasterAttributesVORowImpl attrRow = (AssetMasterAttributesVORowImpl) rs.next();
                        if(attrRow != null){
                            attrRow.remove();
                        }
                    }
                }
                getAssetMasterAttributesVO1().clearCache();
                //Populate Asset Attributes of the corresponding Category
                getAssetMstrAttrsPopulateVO1().setNamedWhereClauseParam("p_category_id", currRow.getAssetCategoryId());
                getAssetMstrAttrsPopulateVO1().executeQuery();
                
                RowSetIterator attrRows = getAssetMstrAttrsPopulateVO1().createRowSetIterator(null);
                while(attrRows.hasNext()){
                    AssetMstrAttrsPopulateVORowImpl attrRow = (AssetMstrAttrsPopulateVORowImpl) attrRows.next();
                    AssetMasterAttributesVORowImpl newRow =
                        (AssetMasterAttributesVORowImpl) getAssetMasterAttributesVO1().createRow();
                    getAssetMasterAttributesVO1().insertRow(newRow);
                    
                    newRow.setAssetId(currRow.getAssetId());
                    newRow.setCategoryAttrId(attrRow.getAttributeId());
                    newRow.setTransAttributeName(attrRow.getAttributeName());
                    newRow.setTransDataType(attrRow.getDataType());
                    newRow.setTransLov(attrRow.getLookupType());
                    newRow.setTransRequired(attrRow.getRequiredFlag());                    
                }
                
            }
        }catch (Exception e) {
            message = e.getMessage();
            e.printStackTrace();
        }
        return message;
    }
    
    public String createAssetHierarchy(){
        String message = "Success";
        try {
            AssetMasterVORowImpl currRow = (AssetMasterVORowImpl) getAssetMasterVO1().getCurrentRow();
            if(currRow != null){
                AssetHierarchyVORowImpl hierRow = (AssetHierarchyVORowImpl) getAssetHierarchyVO1().createRow();
                getAssetHierarchyVO1().insertRow(hierRow);
                hierRow.setAssetId(currRow.getAssetId());
            }
        }catch (Exception e) {
            message = e.getMessage();
            e.printStackTrace();
        }
        return message;
    }
    
    public String assetHierAttchDtChange(){
        String message = "Success";
        try {
            AssetMasterVORowImpl currRow = (AssetMasterVORowImpl) getAssetMasterVO1().getCurrentRow();
            if(currRow != null){
                AssetHierarchyVORowImpl hierRow = (AssetHierarchyVORowImpl) getAssetHierarchyVO1().getCurrentRow();
                if(hierRow != null){
                    getAssetHierarchyVO2().setNamedWhereClauseParam("p_asset_id", currRow.getAssetId());
                    getAssetHierarchyVO2().setApplyViewCriteriaName(null);
                    getAssetHierarchyVO2().executeQuery();
                    
                    getAssetHierarchyVO2().setNamedWhereClauseParam("p_hierarchy_id", hierRow.getHierarchyId());
                    getAssetHierarchyVO2().setApplyViewCriteriaName("AssetHierarchyVOCriteria");
                    getAssetHierarchyVO2().executeQuery();
                    
                    RowSetIterator rs = getAssetHierarchyVO2().createRowSetIterator(null);
                    while(rs.hasNext()){
                        AssetHierarchyVORowImpl hierFilRow = (AssetHierarchyVORowImpl) rs.next();
                        if(hierFilRow.getAttachedDate().compareTo(hierRow.getAttachedDate()) > 0){
                            if(hierRow.getDetachedDate() == null){
                                message = "Parent Asset is already active for the given date. Please check.";
                            }
                            else if(hierFilRow.getAttachedDate().compareTo(hierRow.getDetachedDate())<=0){
                               message = "Parent Asset is already active for the given date. Please check.";
                           }
                        }
                        else if(hierFilRow.getAttachedDate().compareTo(hierRow.getAttachedDate()) < 0){
                            if(hierFilRow.getDetachedDate() == null){
                                message = "Parent Asset is already active for the given date. Please check.";
                            }
                            else if(hierRow.getAttachedDate().compareTo(hierFilRow.getDetachedDate()) <= 0){
                                message = "Parent Asset is already active for the given date. Please check.";
                            }
                        }
                        else{
                            message = "Parent Asset is already active for the given date. Please check.";
                        }
                    }
                    if(!"Success".equals(message)){
                        hierRow.setAttachedDate(null);
                    }
                }
            }
            
        }catch (Exception e) {
            message = e.getMessage();
            e.printStackTrace();
        }
        return message;
    }
    
    public String assetOperShiftChange(){
        String message = "Success";
        try {
            AssetMasterVORowImpl currRow = (AssetMasterVORowImpl) getAssetMasterVO1().getCurrentRow();
            if(currRow != null){
                AssetOperatorVORowImpl operRow = (AssetOperatorVORowImpl) getAssetOperatorVO1().getCurrentRow();
                if(operRow != null){
                    getAssetOperatorVO2().setNamedWhereClauseParam("p_asset_id", currRow.getAssetId());
                    getAssetOperatorVO2().setApplyViewCriteriaName(null);
                    getAssetOperatorVO2().executeQuery();
                    
                    getAssetOperatorVO2().setNamedWhereClauseParam("p_shift", operRow.getShift());
                    getAssetOperatorVO2().setNamedWhereClauseParam("p_operator_id", operRow.getOperatorId());
                    getAssetOperatorVO2().setApplyViewCriteriaName("AssetOperatorVOCriteria");
                    getAssetOperatorVO2().executeQuery();
                    
                    if(getAssetOperatorVO2().getRowCount() > 0){
                        message = "Shift "+operRow.getTransShift()+" is already defined. Please check.";
                        operRow.setShift(null);
                        operRow.setTransShift(null);                        
                    }
                }
            }
        }catch (Exception e) {
            e.printStackTrace();
            message = e.getMessage();
        }
        return message;
    }
    
    public String assetCertTypeChange(){
        String message = "Success";
        try {
            AssetMasterVORowImpl currRow = (AssetMasterVORowImpl) getAssetMasterVO1().getCurrentRow();
            if(currRow != null){
                AssetCertificationsVORowImpl certRow = (AssetCertificationsVORowImpl) getAssetCertificationsVO1().getCurrentRow();
                if(certRow != null && certRow.getCertificationType() != null && certRow.getValidFromDate() != null){
                    getAssetCertificationsVO2().setNamedWhereClauseParam("p_asset_id", currRow.getAssetId());
                    getAssetCertificationsVO2().setApplyViewCriteriaName(null);
                    getAssetCertificationsVO2().executeQuery();
                    
                    getAssetCertificationsVO2().setNamedWhereClauseParam("p_certificate_id", certRow.getCertificateId());
                    getAssetCertificationsVO2().setNamedWhereClauseParam("p_certification_type", certRow.getCertificationType());
                    getAssetCertificationsVO2().setApplyViewCriteriaName("AssetCertificationsVOCriteria");
                    getAssetCertificationsVO2().executeQuery();
                    
                    RowSetIterator rs = getAssetCertificationsVO2().createRowSetIterator(null);
                    while(rs.hasNext()){
                        AssetCertificationsVORowImpl certFilRow = (AssetCertificationsVORowImpl) rs.next();
                        if(certFilRow.getValidFromDate().compareTo(certRow.getValidFromDate()) > 0){
                            if(certRow.getValidToDate() == null){
                                message = "Certification Type"+ certRow.getTransCertificationType() +" is already defined for the given dates. Please check.";
                            }
                            else if(certFilRow.getValidFromDate().compareTo(certRow.getValidToDate())<=0){
                               message = "Certification Type"+ certRow.getTransCertificationType() +" is already defined for the given dates. Please check.";
                           }
                        }
                        else if(certFilRow.getValidFromDate().compareTo(certRow.getValidFromDate()) < 0){
                            if(certFilRow.getValidToDate() == null){
                                message = "Certification Type" + certRow.getTransCertificationType() + " is already defined for the given dates. Please check.";
                            }
                            else if(certRow.getValidFromDate().compareTo(certFilRow.getValidToDate()) <= 0){
                                message = "Certification Type"+ certRow.getTransCertificationType() +" is already defined for the given dates. Please check.";
                            }
                        }
                        else{
                            message = "Certification Type"+ certRow.getTransCertificationType() +" is already defined for the given dates. Please check.";
                        }
                    }
                    if(!"Success".equals(message)){
                        certRow.setValidFromDate(null);
                        certRow.setTransCertificationType(null);
                        certRow.setCertificationType(null);
                    }
                }
            }
            
        }catch (Exception e) {
            message = e.getMessage();
            e.printStackTrace();
        }
        return message;
    }

    public String assetAccessoryTypeChange(){
        String message = "Success";
        try {
            AssetMasterVORowImpl currRow = (AssetMasterVORowImpl) getAssetMasterVO1().getCurrentRow();
            if(currRow != null){
                AssetAccessoriesVORowImpl accessRow = (AssetAccessoriesVORowImpl) getAssetAccessoriesVO1().getCurrentRow();
                if(accessRow != null){
                    getAssetAccessoriesVO2().setNamedWhereClauseParam("p_asset_id", currRow.getAssetId());
                    getAssetAccessoriesVO2().setApplyViewCriteriaName(null);
                    getAssetAccessoriesVO2().executeQuery();
                    
                    getAssetAccessoriesVO2().setNamedWhereClauseParam("p_accessory_type", accessRow.getAccessoryType());
                    getAssetAccessoriesVO2().setNamedWhereClauseParam("p_accessory_id", accessRow.getAccessoryId());
                    getAssetAccessoriesVO2().setNamedWhereClauseParam("p_hdr_id", accessRow.getAssetId());
                    getAssetAccessoriesVO2().setApplyViewCriteriaName("AssetAccessoriesVOCriteria");
                    getAssetAccessoriesVO2().executeQuery();
                    
                    if(getAssetAccessoriesVO2().getRowCount() > 0){
                        message = "Accessory Type  "+accessRow.getTransAccessoryType()+" is already defined. Please check.";
                        accessRow.setAccessoryType(null);
                        accessRow.setTransAccessoryType(null);                        
                    }
                }
            }
        }catch (Exception e) {
            e.printStackTrace();
            message = e.getMessage();
        }
        return message;
    }
    
    /**
     * Container's getter for AssetMstrAttrsPopulateVO1.
     * @return AssetMstrAttrsPopulateVO1
     */
    public AssetMstrAttrsPopulateVOImpl getAssetMstrAttrsPopulateVO1() {
        return (AssetMstrAttrsPopulateVOImpl) findViewObject("AssetMstrAttrsPopulateVO1");
    }

    /**
     * Container's getter for AssetHierarchyVO2.
     * @return AssetHierarchyVO2
     */
    public AssetHierarchyVOImpl getAssetHierarchyVO2() {
        return (AssetHierarchyVOImpl) findViewObject("AssetHierarchyVO2");
    }

    /**
     * Container's getter for AssetOperatorVO2.
     * @return AssetOperatorVO2
     */
    public AssetOperatorVOImpl getAssetOperatorVO2() {
        return (AssetOperatorVOImpl) findViewObject("AssetOperatorVO2");
    }

    /**
     * Container's getter for AssetCertificationsVO2.
     * @return AssetCertificationsVO2
     */
    public AssetCertificationsVOImpl getAssetCertificationsVO2() {
        return (AssetCertificationsVOImpl) findViewObject("AssetCertificationsVO2");
    }
    
    public String validateStartDate() 
    {
        String msg = "Success";
        try 
        {
            TransAccessSecuritySearchVORowImpl transRow =
                (TransAccessSecuritySearchVORowImpl) getTransAccessSecuritySearchVO1().getCurrentRow();
            AccessSecurityHdrVORowImpl currRow = (AccessSecurityHdrVORowImpl) getAccessSecurityHdrVO1().getCurrentRow();
            if(currRow!=null &&(currRow.getEntity(0).getEntityState() == 0 || currRow.getEntity(0).getEntityState() == 2 )) {                   
                    getAccessSecurityHdrValidateVO1().setApplyViewCriteriaName(null);
                    getAccessSecurityHdrValidateVO1().executeQuery();
                //
                    getAccessSecurityHdrValidateVO1().setApplyViewCriteriaName("AccessSecurityHdrValidateVOCriteria");
                    getAccessSecurityHdrValidateVO1().setNamedWhereClauseParam("p_bu_id",currRow.getBuId());
                    getAccessSecurityHdrValidateVO1().setNamedWhereClauseParam("p_hdr_id",currRow.getHeaderId());
                    getAccessSecurityHdrValidateVO1().setNamedWhereClauseParam("p_user_id",currRow.getUserId());
                    getAccessSecurityHdrValidateVO1().executeQuery();
                //
                    RowSetIterator filteredRows = getAccessSecurityHdrValidateVO1().createRowSetIterator(null);
                //
                    while(filteredRows.hasNext()){
                        AccessSecurityHdrValidateVORowImpl currFilRow = (AccessSecurityHdrValidateVORowImpl)filteredRows.next();
                       if(currFilRow.getStartDate()!= null && currRow.getStartDate() != null)
                       {
                            if(currFilRow.getStartDate().compareTo(currRow.getStartDate()) > 0)
                            {
                                if(currRow.getEndDate() == null) 
                                {
                                    if((currFilRow.getDivision() == null && currRow.getDivision()== null)
                                        || (currRow.getDivision()!= null && currFilRow.getDivision() != null && currRow.getDivision().equals(currFilRow.getDivision()))
                                    )
                                    {
                                        currRow.setStartDate(null);
                                        currRow.setEndDate(null);
                                        return currRow. getTransUserName() +" is already active in Business Unit : " +transRow.getTransBuName()  +" and Division : " +currFilRow.getDivision()+" for the given dates. Enter a unique value.";
                                    }
                                }
                                else if(currRow.getEndDate() != null && currFilRow.getStartDate().compareTo(currRow.getEndDate())<=0){
                                   
                                   if((currFilRow.getDivision() == null && currRow.getDivision()== null)
                                       || (currRow.getDivision()!= null && currFilRow.getDivision() != null && currRow.getDivision().equals(currFilRow.getDivision()))
                                   )
                                   {
                                       currRow.setStartDate(null);
                                       currRow.setEndDate(null);
                                       return currRow. getTransUserName() +" is already active in Business Unit : " +transRow.getTransBuName()  +" and Division : " +currFilRow.getDivision()+" for the given dates. Enter a unique value.";
                                   }
                                   else 
                                   {
                                       return  "W_"+ currRow.getHeaderId()+"_"+currRow. getTransUserName() +" is already active in Business Unit : " +transRow.getTransBuName()  +" and Division : " +currFilRow.getDivision()+" for the given dates. ";
                                   }
                               }
                            }
                            else if(currFilRow.getStartDate().compareTo(currRow.getStartDate()) < 0){
                                if(currFilRow.getEndDate() == null){
                                    
                                    if((currFilRow.getDivision() == null && currRow.getDivision() == null)
                                        || (currRow.getDivision()!= null && currFilRow.getDivision() !=null && currRow.getDivision().equals(currFilRow.getDivision()))
                                    )
                                    {
                                        currRow.setStartDate(null);
                                        currRow.setEndDate(null);
                                        return currRow. getTransUserName() +" is already active in Business Unit : " +transRow.getTransBuName()  +" and Division : " +currFilRow.getDivision()+" for the given dates. Enter a unique value.";
                                        
                                    }
                                    else 
                                    {
                                        return  "W_"+ currRow.getHeaderId()+"_"+currRow. getTransUserName() +" is already active in Business Unit : " +transRow.getTransBuName()  +" and Division : " +currFilRow.getDivision()+" for the given dates. ";
                                    }
                                }
                                else if(currFilRow.getEndDate()!=null && currRow.getStartDate().compareTo(currFilRow.getEndDate()) <= 0){
                                    if((currRow.getDivision() == null && currRow.getDivision()== null)
                                        || (currRow.getDivision()!= null && currFilRow.getDivision() != null  && currRow.getDivision().equals(currFilRow.getDivision()))
                                    )
                                    {
                                        currRow.setStartDate(null);
                                        currRow.setEndDate(null);
                                        return  "The given dates for business "+transRow.getTransBuName() +", Division : "+currFilRow.getDivision() + " and Username: "+currFilRow.getTransUserName()+" are invalid. This record causes an overlap with an existing combination.";
                                        
                                    }
                                    else 
                                    {
                                        return  "W_"+currRow.getHeaderId()+"_"+ currRow. getTransUserName() +" is already active in Business Unit : " +transRow.getTransBuName()  +" and Division : " +currFilRow.getDivision()+" for the given dates. ";
                                    }
                                }
                            }
                            else{
                            
                            if((currFilRow.getDivision() == null && currRow.getDivision() == null)
                                || (currRow.getDivision()!= null && currFilRow.getDivision() != null &&  currRow.getDivision().equals(currFilRow.getDivision()))
                            )
                            {
                                currRow.setStartDate(null);
                                currRow.setEndDate(null);
                                 return currRow. getTransUserName() +" is already active in Business Unit : " +transRow.getTransBuName()  +" and Division : " +currFilRow.getDivision()+" for the given dates. Enter a unique value.";
                             }
                            else 
                            {
                                return  "W_"+ currRow.getHeaderId()+"_"+currRow. getTransUserName() +" is already active in Business Unit : " +transRow.getTransBuName()  +" and Division : " +currFilRow.getDivision()+" for the given dates. ";
                            }
                        }
                       }
                    }
                
//                    if("S".equals(currRow.getAccessLevel()))
//                    {
//                        getAccessSecurityLinesValidateVO1().setApplyViewCriteriaName("AccessSecurityLinesValidateVOCriteria");
//                        getAccessSecurityLinesValidateVO1().setNamedWhereClauseParam("p_hdr_id", currRow.getHeaderId());
//                        getAccessSecurityLinesValidateVO1().executeQuery();
//                        
//                        if(getAccessSecurityLinesValidateVO1().getRowCount() == new Long(0)) 
//                        {
//                            msg = "Missing Role Details!! Role Details are mandatory for the user : "+ currRow. getTransUserName() + " with Specific Access Level.";
//                        }
//                    }
            }
        }
        catch(Exception e) 
        {
            e.printStackTrace();
            return e.getMessage();
        }
            return "Success";
    }
    
    public String duplicatesWarning()
    {
        String msg = "Success";
        try 
        {
            Map pageFlowScope = ADFContext.getCurrent().getPageFlowScope();
           String header_id = (String)pageFlowScope.get("headerId");
            if(header_id != null) 
            {
                RowSetIterator itr =  getAccessSecurityHdrVO1().createRowSetIterator(null);   
                while(itr.hasNext()) 
                {
                    AccessSecurityHdrVORowImpl currRow = (AccessSecurityHdrVORowImpl) itr.next();
                    if(header_id.equals(currRow.getHeaderId().stringValue()))
                    {
                        currRow.setTransUserName(null);
                        currRow.setStartDate(null);
                        currRow.setUserId(null);
                    }
                }
            }
//            else
//            {
//            AccessSecurityHdrVORowImpl currRow = (AccessSecurityHdrVORowImpl) getAccessSecurityHdrVO1().getCurrentRow();
//            currRow.setTransUserName(null);
//            currRow.setStartDate(null);
//            currRow.setUserId(null);
//            }
        }
        catch(Exception e) 
        {
            e.printStackTrace();
            return e.getMessage();
        }
        return msg;
    }
    
    public String validateEndDate() 
    {
        String msg = "Success";
        try 
        {
            TransAccessSecuritySearchVORowImpl transRow =
                (TransAccessSecuritySearchVORowImpl) getTransAccessSecuritySearchVO1().getCurrentRow();
            AccessSecurityHdrVORowImpl currRow = (AccessSecurityHdrVORowImpl) getAccessSecurityHdrVO1().getCurrentRow();
            if(currRow!=null &&(currRow.getEntity(0).getEntityState() == 0 || currRow.getEntity(0).getEntityState() == 2 )) {                   
                    getAccessSecurityHdrValidateVO1().setApplyViewCriteriaName(null);
                    getAccessSecurityHdrValidateVO1().executeQuery();
                //
                    getAccessSecurityHdrValidateVO1().setApplyViewCriteriaName("AccessSecurityHdrValidateVOCriteria");
                    getAccessSecurityHdrValidateVO1().setNamedWhereClauseParam("p_bu_id",currRow.getBuId());
                    getAccessSecurityHdrValidateVO1().setNamedWhereClauseParam("p_hdr_id",currRow.getHeaderId());
                    getAccessSecurityHdrValidateVO1().setNamedWhereClauseParam("p_user_id",currRow.getUserId());
                    getAccessSecurityHdrValidateVO1().executeQuery();
                //
                    RowSetIterator filteredRows = getAccessSecurityHdrValidateVO1().createRowSetIterator(null);
                //
                    while(filteredRows.hasNext()){
                        AccessSecurityHdrValidateVORowImpl currFilRow = (AccessSecurityHdrValidateVORowImpl)filteredRows.next();
                       if(currFilRow.getStartDate()!= null && currRow.getStartDate() != null)
                       {
                            if(currFilRow.getStartDate().compareTo(currRow.getStartDate()) > 0){
                                    if(currRow.getEndDate() == null)
                                    {
                                        if((currFilRow.getDivision() == null && currRow.getDivision()== null)
                                            || (currRow.getDivision()!= null && currFilRow.getDivision() !=null && currRow.getDivision().equals(currFilRow.getDivision()))
                                        )
                                        {
                                            currRow.setEndDate(null);
                                            return currRow. getTransUserName() +" is already active in Business Unit : "+ transRow.getTransBuName()  +" for the given dates. Enter a unique value.";
//                                            currRow.setStartDate(null);
                                            
                                        }
                                        else
                                        {
                                            return  "W_"+ currRow.getHeaderId()+"_"+currRow. getTransUserName() +" is already active in Business Unit : " +transRow.getTransBuName()  +" and Division : " +currFilRow.getDivision()+" for the given dates. ";
                                        }
                                    }
                                    else if(currRow.getEndDate() != null && currFilRow.getStartDate().compareTo(currRow.getEndDate())<=0){
                                   
                                   if((currFilRow.getDivision() == null && currRow.getDivision()== null)
                                       || (currRow.getDivision()!= null && currFilRow.getDivision() != null && currRow.getDivision().equals(currFilRow.getDivision()))
                                   )
                                   {
                                       currRow.setEndDate(null);
                                       return currRow. getTransUserName() +" is already active in Business Unit : "+ transRow.getTransBuName()  +" for the given dates. Enter a unique value.";
                                   }
                                   else 
                                   {
                                       return  "W_"+ currRow.getHeaderId()+"_"+currRow. getTransUserName() +" is already active in Business Unit : " +transRow.getTransBuName()  +" and Division : " +currFilRow.getDivision()+" for the given dates. ";
                                   }
                               }
                            }
                            else if(currFilRow.getStartDate().compareTo(currRow.getStartDate()) < 0){
                                if(currFilRow.getEndDate() == null){
                                    
                                    if((currFilRow.getDivision() == null && currRow.getDivision() == null)
                                        || (currRow.getDivision()!= null && currFilRow.getDivision() !=null && currRow.getDivision().equals(currFilRow.getDivision()))
                                    )
                                    {
                                        currRow.setEndDate(null);
                                        return currRow. getTransUserName() +" is already active in Business Unit : " +transRow.getTransBuName()  +" and Division : " +currFilRow.getDivision()+" for the given dates. Enter a unique value.";
                                    }
                                    else 
                                    { 
                                        return  "W_"+ currRow.getHeaderId()+"_"+currRow. getTransUserName() +" is already active in Business Unit : " +transRow.getTransBuName()  +" and Division : " +currFilRow.getDivision()+" for the given dates. ";
                                    }
                                }
                                else if(currFilRow.getEndDate()!=null && currRow.getStartDate().compareTo(currFilRow.getEndDate()) <= 0){
                                    if((currRow.getDivision() == null && currRow.getDivision()== null)
                                        || (currRow.getDivision()!= null && currFilRow.getDivision() != null  && currRow.getDivision().equals(currFilRow.getDivision()))
                                    )
                                    {
                                        currRow.setEndDate(null);
                                        return  "The given dates for business "+transRow.getTransBuName() +", Division : "+currFilRow.getDivision() + " and Username: "+currFilRow.getTransUserName()+" are invalid. This record causes an overlap with an existing combination.";
                                       
                                    }
                                    else 
                                    {
                                        return  "W_"+ currRow.getHeaderId()+"_"+currRow. getTransUserName() +" is already active in Business Unit : " +transRow.getTransBuName()  +" and Division : " +currFilRow.getDivision()+" for the given dates. ";
                                    }
                                }
                            }
                            else{
                            
                            if((currFilRow.getDivision() == null && currRow.getDivision() == null)
                                || (currRow.getDivision()!= null && currFilRow.getDivision() != null &&  currRow.getDivision().equals(currFilRow.getDivision()))
                            )
                            {
                                currRow.setEndDate(null);   
                                return currRow. getTransUserName() +" is already active in Business Unit : " +transRow.getTransBuName()  +" and Division : " +currFilRow.getDivision()+" for the given dates. Enter a unique value.";
                            }
                            else 
                            {
                                return  "W_"+ currRow.getHeaderId()+"_"+currRow. getTransUserName() +" is already active in Business Unit : " +transRow.getTransBuName()  +" and Division : " +currFilRow.getDivision()+" for the given dates. ";
                            }
                        }
                       }
                    }
                
//                    if("S".equals(currRow.getAccessLevel()))
//                    {
//                        getAccessSecurityLinesValidateVO1().setApplyViewCriteriaName("AccessSecurityLinesValidateVOCriteria");
//                        getAccessSecurityLinesValidateVO1().setNamedWhereClauseParam("p_hdr_id", currRow.getHeaderId());
//                        getAccessSecurityLinesValidateVO1().executeQuery();
//                        
//                        if(getAccessSecurityLinesValidateVO1().getRowCount() == new Long(0)) 
//                        {
//                            return "Missing Role Details!! Role Details are mandatory for the user : "+ currRow. getTransUserName() + " with Specific Access Level.";
//                        }
//                    }
            }
        }
        catch(Exception e) 
        {
            e.printStackTrace();
            return e.getMessage();
        }
        return msg;
    }
      
        
    /**
     * Container's getter for TransAssetMasterSearchVO1.
     * @return TransAssetMasterSearchVO1
     */
    public TransAssetMasterSearchVOImpl getTransAssetMasterSearchVO1() {
        return (TransAssetMasterSearchVOImpl) findViewObject("TransAssetMasterSearchVO1");
    }
    
    public String searchAssets(){
        String message = "Success";
        try {
            TransAssetMasterSearchVORowImpl transRow =
                (TransAssetMasterSearchVORowImpl) getTransAssetMasterSearchVO1().getCurrentRow();
            if(transRow != null && transRow.getTransBuId() != null){
                if(("Y".equals(transRow.getTransDivisionRequired()) && transRow.getTransDivision() != null) || !("Y".equals(transRow.getTransDivisionRequired()))){
                    getAssetMasterSearchVO1().setNamedWhereClauseParam("p_bu_id", transRow.getTransBuId());
                    getAssetMasterSearchVO1().setNamedWhereClauseParam("p_division", transRow.getTransDivision());
                    getAssetMasterSearchVO1().setNamedWhereClauseParam("p_asset_source", transRow.getAssetSource());
                    getAssetMasterSearchVO1().setNamedWhereClauseParam("p_asset_number", transRow.getTransAssetNumber());
                    getAssetMasterSearchVO1().setNamedWhereClauseParam("p_asset_category_id", transRow.getTransAssetCategoryId());
                    getAssetMasterSearchVO1().setNamedWhereClauseParam("p_maint_asset_id", transRow.getTransMainAssetId());
                    getAssetMasterSearchVO1().setNamedWhereClauseParam("p_working_status", transRow.getWorkingStatus());
                    getAssetMasterSearchVO1().setNamedWhereClauseParam("p_usage_pool", transRow.getUsagePool());
                    
                    getAssetMasterSearchVO1().executeQuery();
                }else{
                    return "Division is required";
                }
            }else{
                return "Business Unit is required.";
            }
        }catch (Exception e) {
            message = e.getMessage();
            e.printStackTrace();
        }
        return message;
    }
    
    public String resetAssetSearch(){
        String message = "Success";
        try {
            TransAssetMasterSearchVORowImpl transRow =
                (TransAssetMasterSearchVORowImpl) getTransAssetMasterSearchVO1().getCurrentRow();
            if(transRow != null){
                transRow.remove();
                
                getTransAssetMasterSearchVO1().executeQuery();
                transRow = (TransAssetMasterSearchVORowImpl) getTransAssetMasterSearchVO1().createRow();
                getTransAssetMasterSearchVO1().insertRow(transRow);
                
                transRow.setTransBuId(null);                
                transRow.setTransAssetNumber(null);
                transRow.setTransAssetSource(null);
                transRow.setAssetSource(null);
                transRow.setTransAssetCategory(null);
                transRow.setTransAssetCategoryId(null);
                transRow.setTransDivision(null);
                transRow.setTransMainAssetId(null);
                transRow.setTransMainAssetNo(null);
                transRow.setTransWorkingStatus(null);
                transRow.setWorkingStatus(null);
                transRow.setTransUsagePool(null);
                transRow.setUsagePool(null);
                transRow.setTransDivisionRequired(null);
                transRow.setTransDivSegment(null);
                transRow.setTransBuName(null);
                
                getAssetMasterSearchVO1().setNamedWhereClauseParam("p_bu_id", null);
                getAssetMasterSearchVO1().setNamedWhereClauseParam("p_division", null);
                getAssetMasterSearchVO1().setNamedWhereClauseParam("p_asset_source", null);
                getAssetMasterSearchVO1().setNamedWhereClauseParam("p_asset_number", null);
                getAssetMasterSearchVO1().setNamedWhereClauseParam("p_asset_category_id", null);
                getAssetMasterSearchVO1().setNamedWhereClauseParam("p_maint_asset_id", null);
                getAssetMasterSearchVO1().setNamedWhereClauseParam("p_working_status", null);
                getAssetMasterSearchVO1().setNamedWhereClauseParam("p_usage_pool", null);
                
                getAssetMasterSearchVO1().executeQuery();
            }
        }catch (Exception e) {
            e.printStackTrace();
            message = e.getMessage();
        }
        return message;
    }
    
    public String setAssetSearch(){
        String message = "Success";
        try {
            getTransAssetMasterSearchVO1().executeQuery();
            TransAssetMasterSearchVORowImpl transRow =
                (TransAssetMasterSearchVORowImpl) getTransAssetMasterSearchVO1().getCurrentRow();
            if(transRow == null){
                transRow = (TransAssetMasterSearchVORowImpl) getTransAssetMasterSearchVO1().createRow();
                getTransAssetMasterSearchVO1().insertRow(transRow);
            }
            Map pageFlowScope = ADFContext.getCurrent().getPageFlowScope();
            transRow.setTransBuName((String) pageFlowScope.get("asBu"));
            transRow.setTransBuId((oracle.jbo.domain.Number) pageFlowScope.get("asBuId"));                
            transRow.setTransAssetNumber((String) pageFlowScope.get("asAssetNum"));
            transRow.setTransAssetSource((String) pageFlowScope.get("asAssetSource"));
            transRow.setAssetSource((String) pageFlowScope.get("asAssetSrcCode"));
            transRow.setTransAssetCategory((String) pageFlowScope.get("asAssetCatgry"));
            transRow.setTransAssetCategoryId((oracle.jbo.domain.Number) pageFlowScope.get("asAssetCatgryId"));            
            transRow.setTransMainAssetId((oracle.jbo.domain.Number) pageFlowScope.get("asMainAssetId"));
            transRow.setTransMainAssetNo((String) pageFlowScope.get("asMainAssetNum"));
            transRow.setTransWorkingStatus((String) pageFlowScope.get("asWorkingStat"));
            transRow.setWorkingStatus((String) pageFlowScope.get("asWorkingStatCode"));
            transRow.setTransUsagePool((String) pageFlowScope.get("asUsagePool"));
            transRow.setUsagePool((String) pageFlowScope.get("asUsagePoolCode"));
            transRow.setTransDivisionRequired((String) pageFlowScope.get("asDivRequired"));
            transRow.setTransDivSegment((String) pageFlowScope.get("asDivSegment"));
            transRow.setTransDivision((String) pageFlowScope.get("asDiv"));
            
            getAssetMasterSearchVO1().setNamedWhereClauseParam("p_bu_id", transRow.getTransBuId());
            getAssetMasterSearchVO1().setNamedWhereClauseParam("p_division", transRow.getTransDivision());
            getAssetMasterSearchVO1().setNamedWhereClauseParam("p_asset_source", transRow.getAssetSource());
            getAssetMasterSearchVO1().setNamedWhereClauseParam("p_asset_number", transRow.getTransAssetNumber());
            getAssetMasterSearchVO1().setNamedWhereClauseParam("p_asset_category_id", transRow.getTransAssetCategoryId());
            getAssetMasterSearchVO1().setNamedWhereClauseParam("p_maint_asset_id", transRow.getTransMainAssetId());
            getAssetMasterSearchVO1().setNamedWhereClauseParam("p_working_status", transRow.getWorkingStatus());
            getAssetMasterSearchVO1().setNamedWhereClauseParam("p_usage_pool", transRow.getUsagePool());
            
            getAssetMasterSearchVO1().executeQuery();
            
        }catch (Exception e) {
            message = e.getMessage();
            e.printStackTrace();
        }
        return message;
    }
    
    public String createTransAssetSearch(){
        String message = "Success";
        try {
            getTransAssetMasterSearchVO1().executeQuery();
            TransAssetMasterSearchVORowImpl transRow =
                (TransAssetMasterSearchVORowImpl) getTransAssetMasterSearchVO1().getCurrentRow();
            if(transRow != null){
                transRow.remove();
            }
            transRow = (TransAssetMasterSearchVORowImpl) getTransAssetMasterSearchVO1().createRow();
            getTransAssetMasterSearchVO1().insertRow(transRow);
        }catch (Exception e) {
            e.printStackTrace();
            message = e.getMessage();
        }
        return message;
    }
    
    public String assetBuChange(){
        String message = "Success";
        try {
            AssetMasterVORowImpl currRow = (AssetMasterVORowImpl) getAssetMasterVO1().getCurrentRow();
            if(currRow != null){
                currRow.setDivision(null);
                currRow.setDivFlexValSetId(null);
                currRow.setDivFlexValueId(null);
                currRow.setTransAssetCategory(null);
                currRow.setTransAssetCategoryDescr(null);
                currRow.setAssetCategoryId(null);
                
                if(getAssetMasterAttributesVO1().getRowCount() > 0){
                    RowSetIterator rs = getAssetMasterAttributesVO1().createRowSetIterator(null);
                    while(rs.hasNext()){
                        AssetMasterAttributesVORowImpl attrRow = (AssetMasterAttributesVORowImpl) rs.next();
                        if(attrRow != null){
                            attrRow.remove();
                        }
                    }
                }
                
                currRow.setMaintOrgId(null);
                currRow.setTransMaintOrg(null);
                currRow.setTransMaintAssetNum(null);
                currRow.setMaintAssetId(null);
                currRow.setTransMaintAssetItem(null);
                currRow.setTransItemCategory(null);
                currRow.setTransFACategory(null);
                currRow.setFaCategoryId(null);
                currRow.setTransFANumber(null);
                currRow.setFixedAssetId(null);
                currRow.setTransPoNumber(null);
                currRow.setPoHeaderId(null);
                currRow.setTransPoLineNum(null);
                currRow.setTransPoPrice(null);
                currRow.setPoLineId(null);
                currRow.setTransPoSupplierName(null);
                
            }
        }catch (Exception e) {
            e.printStackTrace();
            message = e.getMessage();
        }
        return message;
    }
    
    public String assetSearchBuChange(){
        String message = "Success";
        try {
            TransAssetMasterSearchVORowImpl currRow = (TransAssetMasterSearchVORowImpl) getTransAssetMasterSearchVO1().getCurrentRow();
            if(currRow != null){
                currRow.setTransDivision(null);
                currRow.setTransAssetCategory(null);
                currRow.setTransAssetCategoryId(null);
                currRow.setTransMainAssetId(null);
                currRow.setTransMainAssetNo(null);
            }
        }catch (Exception e) {
            message = e.getMessage();
            e.printStackTrace();
        }
        return message;
    }
    
    public String validateCustomerType() 
    {
        String msg = "Success";    
        try 
        {
            AccessSecurityLinesVORowImpl currRow =
                (AccessSecurityLinesVORowImpl) getAccessSecurityLinesVO1().getCurrentRow();
            if(currRow.getCustomerType() != null) 
            {
                getAccessSecurityLinesValidateVO1().setApplyViewCriteriaName(null);
                getAccessSecurityLinesValidateVO1().executeQuery();
                getAccessSecurityLinesValidateVO1().setApplyViewCriteriaName("AccessSecurityLinesValidateVOCriteria1");
                getAccessSecurityLinesValidateVO1().setNamedWhereClauseParam("p_hdr_id", currRow.getHeaderId());
                getAccessSecurityLinesValidateVO1().setNamedWhereClauseParam("p_line_id", currRow.getLineId());
                getAccessSecurityLinesValidateVO1().executeQuery();
                
                RowSetIterator itr = getAccessSecurityLinesValidateVO1().createRowSetIterator(null);
                while(itr.hasNext())
                {
                    AccessSecurityLinesValidateVORowImpl validateRow = (AccessSecurityLinesValidateVORowImpl) itr.next();
                    if("C".equals(currRow.getCustomerType())) 
                    {
                        if(validateRow.getCustAccountId() == new oracle.jbo.domain.Number(-1))
                        {
                            currRow.setTransCustomerType(null);
                            currRow.setCustomerType(null);
                            return validateRow.getTransAccessType() + "Access exists for all the customers of requesting BU :" + currRow.getTransReqBuName()+". Please select another customer type.";
                        }
                    }
                    else if("P".equals(currRow.getCustomerType())) 
                    {
                        if(validateRow.getProjectId() == new oracle.jbo.domain.Number(-1))
                        {
                            currRow.setTransCustomerType(null);
                            currRow.setCustomerType(null);
                            return validateRow.getTransAccessType() + "Access exists for all the projects of requesting BU :" + currRow.getTransReqBuName()+". Please select another customer type.";
                        }
                    }
                    else if("DV".equals(currRow.getCustomerType())) 
                    {
                        if(validateRow.getFlexValueId() == new oracle.jbo.domain.Number(-1))
                        {
                            currRow.setTransCustomerType(null);
                            currRow.setCustomerType(null);
                            return validateRow.getTransAccessType() + "Access exists for all the divisions of requesting BU :" + currRow.getTransReqBuName()+". Please select another customer type.";
                        }
                    }
                    else if("D".equals(currRow.getCustomerType())) 
                    {
                        if(validateRow.getDeptFlexValueId() == new oracle.jbo.domain.Number(-1))
                        {
                            currRow.setTransCustomerType(null);
                            currRow.setCustomerType(null);
                            return validateRow.getTransAccessType() + "Access exists for all the departments of requesting BU :" + currRow.getTransReqBuName()+". Please select another customer type.";
                        }
                    }
                }
            }
            
        }
        catch(Exception e) 
        {
            e.printStackTrace();
            return e.getMessage();
        }
        return msg;
    }
    
    public String validateCustomerTypeValues() 
    {
        String msg  = "Success";
        try 
        {
            AccessSecurityLinesVORowImpl currRow =
                (AccessSecurityLinesVORowImpl) getAccessSecurityLinesVO1().getCurrentRow();
            if(currRow!=null)
            {
                getAccessSecurityLinesValidateVO1().setApplyViewCriteriaName(null);
                getAccessSecurityLinesValidateVO1().executeQuery();
                
                if("C".equals(currRow.getCustomerType()))
                {
                    getAccessSecurityLinesValidateVO1().setApplyViewCriteriaName("AccessSecurityLinesValidateVOCriteria2");
                    getAccessSecurityLinesValidateVO1().setNamedWhereClauseParam("p_hdr_id", currRow.getHeaderId());
                    getAccessSecurityLinesValidateVO1().setNamedWhereClauseParam("p_line_id", currRow.getLineId());
                    getAccessSecurityLinesValidateVO1().setNamedWhereClauseParam("p_cust_accc_id", currRow.getCustAccountId());
                    getAccessSecurityLinesValidateVO1().setNamedWhereClauseParam("p_cust_accc_site_id", currRow.getCustAcctSiteId());
                    getAccessSecurityLinesValidateVO1().setNamedWhereClauseParam("p_cust_type", currRow.getCustomerType());
                    getAccessSecurityLinesValidateVO1().executeQuery();
                    
                    if(currRow.getCustomerType() != null && getAccessSecurityLinesValidateVO1().getRowCount() > 0) {
                        currRow.setCustAccountId(null);
                        currRow.setCustAcctSiteId(null);
                        currRow.setTransCustomerName(null);
                        currRow.setTransCustSiteName(null);
                        return "Role already exists for the given Customer !" ;
                    }
                }
                
                else if("D".equals(currRow.getCustomerType()) || "DV".equals(currRow.getCustomerType()))
                {
                    getAccessSecurityLinesValidateVO1().setApplyViewCriteriaName("AccessSecurityLinesValidateVOCriteria3");
                    getAccessSecurityLinesValidateVO1().setNamedWhereClauseParam("p_hdr_id", currRow.getHeaderId());
                    getAccessSecurityLinesValidateVO1().setNamedWhereClauseParam("p_line_id", currRow.getLineId());
                    if("D".equals(currRow.getCustomerType()))
                    {
                        getAccessSecurityLinesValidateVO1().setNamedWhereClauseParam("p_flex_value_id", currRow.getDeptFlexValueId());
                        getAccessSecurityLinesValidateVO1().setNamedWhereClauseParam("p_flex_value_site_id", currRow.getDeptFlexValueSetId());
                    }
                    else if("DV".equals(currRow.getCustomerType())) 
                    {
                        getAccessSecurityLinesValidateVO1().setNamedWhereClauseParam("p_flex_value_id", currRow.getFlexValueId());
                        getAccessSecurityLinesValidateVO1().setNamedWhereClauseParam("p_flex_value_site_id", currRow.getFlexValueSetId());
                    }
                    getAccessSecurityLinesValidateVO1().setNamedWhereClauseParam("p_cust_type", currRow.getCustomerType());
                    getAccessSecurityLinesValidateVO1().executeQuery();
                    
                    if(currRow.getCustomerType() != null && getAccessSecurityLinesValidateVO1().getRowCount() > 0) {
                        currRow.setFlexValueId(null);
                        currRow.setFlexValueSetId(null);
                        currRow.setTransRoleDivision(null);
                        currRow.setDepartmentCode(null);
                        currRow.setDepartmentName(null);
                        currRow.setDeptFlexValueId(null);
                        currRow.setDeptFlexValueSetId(null);
                        currRow.setTransDeptCodeName(null);
                        return "Role already exists for the given  " + ("D".equals(currRow.getCustomerType()) ? "Department" : "Division") + " !";
                    }
                }
                else if("P".equals(currRow.getCustomerType()))
                {
                    getAccessSecurityLinesValidateVO1().setApplyViewCriteriaName("AccessSecurityLinesValidateVOCriteria4");
                    getAccessSecurityLinesValidateVO1().setNamedWhereClauseParam("p_hdr_id", currRow.getHeaderId());
                    getAccessSecurityLinesValidateVO1().setNamedWhereClauseParam("p_line_id", currRow.getLineId());
                    getAccessSecurityLinesValidateVO1().setNamedWhereClauseParam("p_project_id", currRow.getProjectId());
                    getAccessSecurityLinesValidateVO1().setNamedWhereClauseParam("p_cust_type", currRow.getCustomerType());
                    getAccessSecurityLinesValidateVO1().executeQuery();
                    
                    if(currRow.getCustomerType() != null && getAccessSecurityLinesValidateVO1().getRowCount() > 0) {
                        currRow.setTransProjectName(null);
                        currRow.setProjectId(null);
                        return "Role already exists for the given Project !";
                    }
                }
                
                
                
            }
        }
        catch(Exception e) 
        {
            e.printStackTrace();
            return e.getMessage();
        }
        return msg;
    }
    

    /**
     * Container's getter for AssetAccessoriesVO2.
     * @return AssetAccessoriesVO2
     */
    public AssetAccessoriesVOImpl getAssetAccessoriesVO2() {
        return (AssetAccessoriesVOImpl) findViewObject("AssetAccessoriesVO2");
    }

    /**
     * Container's getter for TransEmpMasterSearchVO1.
     * @return TransEmpMasterSearchVO1
     */
    public TransEmpMasterSearchVOImpl getTransEmpMasterSearchVO1() {
        return (TransEmpMasterSearchVOImpl) findViewObject("TransEmpMasterSearchVO1");
    }

    /**
     * Container's getter for EmployeeMasterVO1.
     * @return EmployeeMasterVO1
     */
    public EmployeeMasterVOImpl getEmployeeMasterVO1() {
        return (EmployeeMasterVOImpl) findViewObject("EmployeeMasterVO1");
    }

    /**
     * Container's getter for EmployeeCertificationsVO1.
     * @return EmployeeCertificationsVO1
     */
    public EmployeeCertificationsVOImpl getEmployeeCertificationsVO1() {
        return (EmployeeCertificationsVOImpl) findViewObject("EmployeeCertificationsVO1");
    }

    /**
     * Container's getter for EmpMasterToCertificatesVL1.
     * @return EmpMasterToCertificatesVL1
     */
    public ViewLinkImpl getEmpMasterToCertificatesVL1() {
        return (ViewLinkImpl) findViewLink("EmpMasterToCertificatesVL1");
    }
    
    public String createTransEmpMasterSearch(){
        String message = "Success";
        try {
            TransEmpMasterSearchVORowImpl transRow =
                (TransEmpMasterSearchVORowImpl) getTransEmpMasterSearchVO1().getCurrentRow();
            if(transRow != null){
                transRow.remove();
            }
            getTransEmpMasterSearchVO1().executeQuery();
            TransEmpMasterSearchVORowImpl currRow =
                (TransEmpMasterSearchVORowImpl) getTransEmpMasterSearchVO1().createRow();
            getTransEmpMasterSearchVO1().insertRow(currRow);
        }catch (Exception e) {
            e.printStackTrace();
            message = e.getMessage();
        }
        return message;
    }
    
    public String searchEmpMaster(){
        String message = "Success";
        try {
            TransEmpMasterSearchVORowImpl transRow =
                (TransEmpMasterSearchVORowImpl) getTransEmpMasterSearchVO1().getCurrentRow();
            if(transRow != null && transRow.getTransBuId() != null){
                if(("Y".equals(transRow.getTransDivRequired()) && transRow.getTransDivision() != null) || !("Y".equals(transRow.getTransDivRequired()))){
                    getEmployeeMasterVO1().setNamedWhereClauseParam("p_bu_id", transRow.getTransBuId());
                    getEmployeeMasterVO1().setNamedWhereClauseParam("p_div_flex_val_id", transRow.getTransDivFlexValueId());
                    getEmployeeMasterVO1().setNamedWhereClauseParam("p_emp_category_id", transRow.getTransEmpCategoryId());
                    getEmployeeMasterVO1().setNamedWhereClauseParam("p_emp_source", transRow.getTransEmpSourceCode());
                    getEmployeeMasterVO1().setNamedWhereClauseParam("p_employee_id", transRow.getTransEmployeeId());
                    getEmployeeMasterVO1().setNamedWhereClauseParam("p_active_flag", transRow.getTransActiveFlag());
                    
                    getEmployeeMasterVO1().executeQuery();                    
                    getEmployeeCertificationsVO1().executeQuery();
                    
                }else{
                    return "Division is required";
                }
            }else{
                return "Business Unit is required";
            }
        }catch (Exception e) {
            e.printStackTrace();
            message = e.getMessage();
        }
        return message;
    }
    
    public String resetEmpSearch(){
        String message = "Success";
        try {
            TransEmpMasterSearchVORowImpl transRow =
                (TransEmpMasterSearchVORowImpl) getTransEmpMasterSearchVO1().getCurrentRow();
            transRow.setTransBuId(null);
            transRow.setTransBuName(null);
            transRow.setTransEmpCategory(null);
            transRow.setTransEmpCategoryId(null);
            transRow.setTransEmpSource(null);
            transRow.setTransEmpSourceCode(null);
            transRow.setTransDivision(null);
            transRow.setTransDivFlexValSetId(null);
            transRow.setTransDivFlexValueId(null);
            transRow.setTransDivRequired(null);
            transRow.setTransDivSegment(null);
            transRow.setTransEmployeeId(null);
            transRow.setTransEmployeeName(null);
            transRow.setTransEmployeeNumber(null);
            transRow.setTransActiveFlag("N");
            
            getEmployeeMasterVO1().setNamedWhereClauseParam("p_bu_id", null);
            getEmployeeMasterVO1().setNamedWhereClauseParam("p_div_flex_val_id", null);
            getEmployeeMasterVO1().setNamedWhereClauseParam("p_emp_category_id", null);
            getEmployeeMasterVO1().setNamedWhereClauseParam("p_emp_source", null);
            getEmployeeMasterVO1().setNamedWhereClauseParam("p_employee_id", null);
            getEmployeeMasterVO1().setNamedWhereClauseParam("p_active_flag", "N");
            
            getEmployeeMasterVO1().executeQuery();                    
            getEmployeeCertificationsVO1().executeQuery();
            
            
        }catch (Exception e) {
            e.printStackTrace();
            message = e.getMessage();
        }
        return message;
    }
    
    public String empSourceChange(){
        String message = "Success";
        try {
            EmployeeMasterVORowImpl currRow = (EmployeeMasterVORowImpl) getEmployeeMasterVO1().getCurrentRow();
            if(currRow != null){
                currRow.setEmployeeId(null);
                currRow.setEmployeeName(null);
                currRow.setEmployeeNum(null);
                currRow.setTransEmployeeNum(null);
                currRow.setTransEmpJob(null);
                currRow.setTransEmpPosition(null);
                currRow.setDocumentNumber(null);
                currRow.setSupplierId(null);
                currRow.setTransSupplierName(null);
                currRow.setEffectiveFrom(null);
                currRow.setEffectiveTo(null);
                currRow.setTransEffectiveFromEditFlag("Y");
            }
        }catch (Exception e) {
            e.printStackTrace();
            message = e.getMessage();
        }
        return message;
    }
    
    public String deleteEmployee(){    
        String message = "Success";
        try {
            EmployeeMasterVORowImpl currRow = (EmployeeMasterVORowImpl) getEmployeeMasterVO1().getCurrentRow();
            if(currRow != null){
                //Check whether there is any asset assigned for the employee
                getEmployeeActiveAssetVO1().setNamedWhereClauseParam("p_employee_id", currRow.getEmployeeId());
                getEmployeeActiveAssetVO1().executeQuery();
                
                if(getEmployeeActiveAssetVO1().getRowCount() > 0){
                    RowSetIterator rs = getEmployeeActiveAssetVO1().createRowSetIterator(null);
                    while(rs.hasNext()){
                        EmployeeActiveAssetVORowImpl row = (EmployeeActiveAssetVORowImpl) rs.next();
                        message = ("Success".equals(message) ? "Employee is assigned to " : ", ")+ row.getAssetNumber();
                    }
                }else{
                    currRow.remove();
                }
            }
            if(!"Success".equals(message)){
                message = message + "Please remove the assignment in Asset Master and continue.";
            }
        }catch (Exception e) {
            e.printStackTrace();
            message = e.getMessage();
        }
        return message;
    }
    
    public String empEffectiveToChange(){
        String message = "Success";
        try {
            EmployeeMasterVORowImpl currRow = (EmployeeMasterVORowImpl) getEmployeeMasterVO1().getCurrentRow();
            if(currRow != null){
                //Check whether there is any asset assigned for the employee
                getEmployeeActiveAssetVO1().setNamedWhereClauseParam("p_employee_id", currRow.getEmployeeId());
                getEmployeeActiveAssetVO1().executeQuery();
                
                if(getEmployeeActiveAssetVO1().getRowCount() > 0){
                    RowSetIterator rs = getEmployeeActiveAssetVO1().createRowSetIterator(null);
                    while(rs.hasNext()){
                        EmployeeActiveAssetVORowImpl row = (EmployeeActiveAssetVORowImpl) rs.next();
                        message = ("Success".equals(message) ? "Employee is assigned to Asset(s)" : ", ")+ row.getAssetNumber();
                    }
                }
                else
                {
                    message = validateEmpToDates();
                }
            }
            if(!"Success".equals(message)){
                message = message + "Please remove the assignment in Asset Master and continue.";
            }
        }catch (Exception e) {
            message = e.getMessage();
            e.printStackTrace();
        }
        return message;
    }

    /**
     * Container's getter for EmployeeActiveAssetVO1.
     * @return EmployeeActiveAssetVO1
     */
    public EmployeeActiveAssetVOImpl getEmployeeActiveAssetVO1() {
        return (EmployeeActiveAssetVOImpl) findViewObject("EmployeeActiveAssetVO1");
    }

    public void searchRentalRates() 
    {
        try 
        {
            TransRentalMasterSearchVORowImpl searchRow =
                (TransRentalMasterSearchVORowImpl) getTransRentalMasterSearchVO1().getCurrentRow();
            getRentalMasterVO1().setApplyViewCriteriaName(null);
            getRentalMasterVO1().executeQuery();
            
            getRentalMasterVO1().setApplyViewCriteriaName("RentalMasterVOCriteria");
            getRentalMasterVO1().setNamedWhereClauseParam("p_search_bu_id", searchRow.getTransBuId());
            getRentalMasterVO1().setNamedWhereClauseParam("p_flex_value_id", searchRow.getTransFlexValueId());
            getRentalMasterVO1().setNamedWhereClauseParam("p_flex_value_set_id", searchRow.getTransFlexValueSetId());
            getRentalMasterVO1().executeQuery();
        }
        catch(Exception e) 
        {
            e.printStackTrace();    
        }
    }
    
    public void resetRentalSearch() 
    {
        try 
        {
            TransRentalMasterSearchVORowImpl searchRow =
                (TransRentalMasterSearchVORowImpl) getTransRentalMasterSearchVO1().getCurrentRow();
            searchRow.setTransBuId(null);
            searchRow.setTransBuName(null);
            searchRow.setTransBuCurrency(null);
            searchRow.setTransFlexValueId(null);
            searchRow.setTransFlexValueSetId(null);
            searchRow.setTransDivision(null);
            searchRow.setTransDivSegmentNum(null);
            searchRow.setTransDivisionRequired(null);
            
            
            getRentalMasterVO1().executeEmptyRowSet();
        }
        catch(Exception e) 
        {
            e.printStackTrace();    
        }
    }
    
    public String saveRentalRates() 
    {
        String message = "Success";
        oracle.jbo.domain.Date previousEndDate = null; 
        int count = 0;
        try 
        {
            TransRentalMasterSearchVORowImpl searchRow=(TransRentalMasterSearchVORowImpl)getTransRentalMasterSearchVO1().getCurrentRow();
            if(searchRow!=null)
            {
                RowSetIterator itr = getRentalMasterVO1().createRowSetIterator(null);
                while(itr.hasNext())
                {
                    RentalMasterVORowImpl currRow=(RentalMasterVORowImpl)itr.next();
                    if(currRow!=null && currRow.getAssetCategoryId()!=null && currRow.getHiringRuleId()!=null)
                    {                        
                        getRentalMasterValidateVO1().setApplyViewCriteriaName(null);
                        getRentalMasterValidateVO1().executeQuery();
                        
                        getRentalMasterValidateVO1().setNamedWhereClauseParam("p_bu_id", currRow.getBuId());
                        getRentalMasterValidateVO1().setNamedWhereClauseParam("p_flex_value_id", currRow.getFlexValueId() == null ? new oracle.jbo.domain.Number(2) : currRow.getFlexValueId());
                        getRentalMasterValidateVO1().setNamedWhereClauseParam("p_asset_category_id", currRow.getAssetCategoryId());
                        getRentalMasterValidateVO1().setNamedWhereClauseParam("p_hiring_rule_id", currRow.getHiringRuleId());
                        getRentalMasterValidateVO1().setNamedWhereClauseParam("p_rate_id", currRow.getRateId());
                        getRentalMasterValidateVO1().setNamedWhereClauseParam("p_rental_type", currRow.getRentalType());
                        getRentalMasterValidateVO1().setApplyViewCriteriaName("RentalMasterValidateVOCriteria");
                        getRentalMasterValidateVO1().executeQuery();
                        getRentalMasterValidateVO1().setOrderByClause("XxadsRentalRateMasterEO.EFFECTIVE_TO_DATE desc");
                        
                        RentalMasterValidateVORowImpl previousRow =
                           (RentalMasterValidateVORowImpl) getRentalMasterValidateVO1().first();
                       if(previousRow != null && previousRow.getEffectiveToDate() != null){
                           previousEndDate = new oracle.jbo.domain.Date(previousRow.getEffectiveToDate());
                       }
                        
                        if(currRow.getEffectiveFromDate() != null){
                        RowSetIterator filteredRows = getRentalMasterValidateVO1().createRowSetIterator(null);
                                            
                        while(filteredRows.hasNext()){
                            RentalMasterValidateVORowImpl currFilRow = (RentalMasterValidateVORowImpl)filteredRows.next();
                            if(currFilRow.getEffectiveFromDate().compareTo(currRow.getEffectiveFromDate()) > 0){
                                String rentalStartDateFlag = (String) ADFContext.getCurrent()
                                                                      .getPageFlowScope()
                                                                      .get("rentalStartDateFlag");
                                
                                if(currRow.getEffectiveToDate() == null){
                                    count = 1;
                                }
                                else if(currRow.getEffectiveToDate() != null && currFilRow.getEffectiveFromDate().compareTo(currRow.getEffectiveToDate())<=0){
                                   count = 1;
                               }
                            }
                            else if(currFilRow.getEffectiveFromDate().compareTo(currRow.getEffectiveFromDate()) < 0){
                                if(currFilRow.getEffectiveToDate() == null){
                                    count = 1;
                                }
                                else if(currRow.getEffectiveFromDate().compareTo(currFilRow.getEffectiveToDate()) <= 0){
                                    count = 2;
                                }
                            }
                            else{
                                count = 1;
                            }
                        }
                    }//
                        
                         if(count>0)
                        {
                            message = "Rental Rate Master already defined for Business Unit "+searchRow.getTransBuName()+
                                            (searchRow.getTransDivision() == null ? ", " : ", Division "+searchRow.getTransDivision()+", ")+
                                            "Rental Type "+currRow.getTransRentalType() +
                                            "Asset Category "+currRow.getTransAssetCategory()+
                                            ", Hiring Basis "+currRow.getTransHiringBasis()+" for the given dates range";
                            String rentalflagValue = (String) ADFContext.getCurrent()
                                                                  .getPageFlowScope()
                                                                  .get("rentalAsstCategoryFlag");
                            if("Y".equalsIgnoreCase(rentalflagValue))
                            {
                                currRow.setTransAssetCategory(null);
                                currRow.setAssetCategoryId(null);
                            }
                        }
                        else
                        {
                            if(previousEndDate != null){
                                currRow.setEffectiveFromDate ((Date) new oracle.jbo.domain.Date(previousEndDate)
                                                         .addJulianDays(1, 0));
                                currRow.setTransEffectiveFromDateEditFlag("N");
                            }
                            
                            if(currRow.getEffectiveToDate() != null){
                                java.sql.Timestamp datetime = new java.sql.Timestamp(System.currentTimeMillis());
                                oracle.jbo.domain.Date currDate = new  oracle.jbo.domain.Date(datetime);
                                
                                if(currDate.compareTo(currRow.getEffectiveToDate()) < 0){
                                    currRow.setEffectiveToDate(null);
                                    message = "Effective To should be only on or before Current Date";
                                }
                            }  
                        }
                        
                    }
                
                }
            }
        }
        catch(Exception e) 
        {
            e.printStackTrace();
            return e.getMessage();
        }
        return message;
    }
    
    public String validateAssetRentalHrs() 
    {
        String msg = "Success";
        try 
        {
            RentalMasterVORowImpl currRow = (RentalMasterVORowImpl) getRentalMasterVO1().getCurrentRow();
            if(currRow!=null) {
                if(currRow.getStandardRate() != null  &&  currRow.getStandardRate().compareTo(0) < 0) {
                    currRow.setStandardRate(null);
                    return "Asset Standard Rate per hour should be greater than or equal to 0";
                }
                else  if(currRow.getOt1Rate() != null  &&  currRow.getOt1Rate().compareTo(0) < 0) {
                    currRow.setOt1Rate(null);
                    return "Asset Ot1 Rate per hour should be greater than or equal to 0";
                }
                else if(currRow.getOt2Rate() != null  &&  currRow.getOt2Rate().compareTo(0) < 0) {
                    currRow.setOt2Rate(null);
                    return "Asset Ot2 Rate per hour should be greater than or equal to 0";
                }
            }
        }
        catch(Exception e) 
        {
            e.printStackTrace();
            return e.getMessage();
        }
        return msg;
    }
    
    public String rentalRateUnitRateChange(){
        String message = "Success";
        try {
            RentalMasterVORowImpl currRow = (RentalMasterVORowImpl) getRentalMasterVO1().getCurrentRow();
            if(currRow != null && currRow.getTransNoofDays() != null && currRow.getUnitRate() != null && currRow.getTransStandardHours() != null){
                oracle.jbo.domain.Number noOfDays = new oracle.jbo.domain.Number(currRow.getTransNoofDays());
                oracle.jbo.domain.Number unitRate = new oracle.jbo.domain.Number(currRow.getUnitRate());
                oracle.jbo.domain.Number stdHours = new oracle.jbo.domain.Number(currRow.getTransStandardHours());
                
                if(stdHours.compareTo(0) > 0){
                    currRow.setStandardRate(new oracle.jbo.domain.Number(unitRate.divide(noOfDays.multiply(stdHours))));
                }
            }
        }catch (Exception e) {
            e.printStackTrace();
            message = e.getMessage();
        }
        return message;
    }
    
    public String addNewDocSeq() 
    {
        String msg = "Success";    
        try 
        {
            TransExceptionDaysSearchVORowImpl searchRow =
                (TransExceptionDaysSearchVORowImpl) getTransExceptionDaysSearchVO1().getCurrentRow();
            
            DocumentSequenceVORowImpl newRow = (DocumentSequenceVORowImpl) getDocumentSequenceVO1().createRow();
            getDocumentSequenceVO1().insertRow(newRow);
            newRow.setBuId(searchRow.getTransBuId());
//            Date d =  new Date();
//            newRow.setEffectiveFrom((Date)d.getCurrentDate());
        }
        catch(Exception e) 
        {
            e.printStackTrace();
            return e.getMessage();
        }
        return msg;
    }

    /**
     * Container's getter for DocumentSequenceVO1.
     * @return DocumentSequenceVO1
     */
    public DocumentSequenceVOImpl getDocumentSequenceVO1() {
        return (DocumentSequenceVOImpl) findViewObject("DocumentSequenceVO1");
    }
    
    public String deleteDocSeq() 
    {
        String msg = "Success";
        try 
        {
            DocumentSequenceVORowImpl currRow = (DocumentSequenceVORowImpl) getDocumentSequenceVO1().getCurrentRow();
            if(currRow!=null && currRow.getEntity(0).getEntityState() == 0)
            {
                currRow.remove();
            }
            else 
            {
                return "Saved record cannot be deleted.";    
            }
        }
        catch(Exception e) 
        {
            e.printStackTrace();
            return e.getMessage();
        }
        return msg;
    }
    
    public String validateSeqDates()
    {
        String message = "Success";
        oracle.jbo.domain.Date previousEndDate = null; 
        int count = 0;
        try 
        {
            TransExceptionDaysSearchVORowImpl searchRow =
                (TransExceptionDaysSearchVORowImpl) getTransExceptionDaysSearchVO1().getCurrentRow();
            if(searchRow != null){
                DocumentSequenceVORowImpl currRow = (DocumentSequenceVORowImpl) getDocumentSequenceVO1().getCurrentRow();
                if(currRow != null && currRow.getDocumentCode()!= null && currRow.getBuId() != null){
                    getDocumentSequenceValidateVO1().setApplyViewCriteriaName(null);
                    getDocumentSequenceValidateVO1().executeQuery();
                    
//                    getDocumentSequenceValidateVO1().setNamedWhereClauseParam("p_bu_id", currRow.getBuId());
                    getDocumentSequenceValidateVO1().setNamedWhereClauseParam("p_doc_code", currRow.getDocumentCode());
                    getDocumentSequenceValidateVO1().setNamedWhereClauseParam("p_doc_seq_id", currRow.getDocSequenceId());
                    getDocumentSequenceValidateVO1().setApplyViewCriteriaName("DocumentSequenceValidateVOCriteria");
                    getDocumentSequenceValidateVO1().setOrderByClause("XxadsDocumentSequenceEO.EFFECTIVE_TO desc");
                    getDocumentSequenceValidateVO1().executeQuery();
                    
                    previousEndDate = null; 
                    DocumentSequenceValidateVORowImpl previousRow =
                        (DocumentSequenceValidateVORowImpl) getDocumentSequenceValidateVO1().first();
                    if(previousRow != null && previousRow.getEffectiveTo() != null){
                        previousEndDate = new oracle.jbo.domain.Date(previousRow.getEffectiveTo());
                    }
                    
                    if(currRow.getEffectiveFrom() != null){
                        RowSetIterator filteredRows = getDocumentSequenceValidateVO1().createRowSetIterator(null);
                                            
                        while(filteredRows.hasNext()){
                            DocumentSequenceValidateVORowImpl currFilRow = (DocumentSequenceValidateVORowImpl)filteredRows.next();
                            if(currFilRow.getEffectiveFrom().compareTo(currRow.getEffectiveFrom()) > 0){
                                if(currRow.getEffectiveTo() == null){
                                    count = 1;
                                }
                                else if(currFilRow.getEffectiveFrom().compareTo(currRow.getEffectiveTo())<=0){
                                   count = 1;
                               }
                            }
                            else if(currFilRow.getEffectiveFrom().compareTo(currRow.getEffectiveFrom()) < 0){
                                if(currFilRow.getEffectiveTo() == null){
                                    count = 1;
                                }
                                else if(currRow.getEffectiveFrom().compareTo(currFilRow.getEffectiveTo()) <= 0){
                                    count = 2;
                                }
                            }
                            else{
                                count = 1;
                            }
                        }
                    }
                    if(count > 0){
                        message = "Document sequence is already defined "+searchRow.getTransBuName()+"for the given dates range";
                        currRow.setDocumentCode(null);
                        currRow.setTransDocumentName(null);
                        currRow.setEffectiveFrom(null);
                        currRow.setEffectiveTo(null);
                        
                    }
                    else
                    {
                        if(previousEndDate != null){
                            currRow.setEffectiveFrom ((Date) new oracle.jbo.domain.Date(previousEndDate)
                                                     .addJulianDays(1, 0));
                            currRow.setTransEffectiveFromEditFlag("N");
                        }
                        
                        if(currRow.getEffectiveTo() != null){
                            java.sql.Timestamp datetime = new java.sql.Timestamp(System.currentTimeMillis());
                            oracle.jbo.domain.Date currDate = new  oracle.jbo.domain.Date(datetime);
                            
                            if(currDate.compareTo(currRow.getEffectiveTo()) < 0){
                                currRow.setEffectiveTo(null);
                                message = "Effective To should be only on or before Current Date";
                            }
                        }
                    }
                }
            }
        }
        catch(Exception e) 
        {
            e.printStackTrace();
            return e.getMessage();
        }
        return message;
    }

    /**
     * Container's getter for DocumentSequenceValidateVO1.
     * @return DocumentSequenceValidateVO1
     */
    public DocumentSequenceValidateVOImpl getDocumentSequenceValidateVO1() {
        return (DocumentSequenceValidateVOImpl) findViewObject("DocumentSequenceValidateVO1");
    }
    
    public String validateDocument() 
    {   
        String msg = "Success";
        oracle.jbo.domain.Date previousEndDate = null; 
        TransExceptionDaysSearchVORowImpl searchRow =
            (TransExceptionDaysSearchVORowImpl) getTransExceptionDaysSearchVO1().getCurrentRow();
        try
        {
            DocumentSequenceVORowImpl currRow = (DocumentSequenceVORowImpl) getDocumentSequenceVO1().getCurrentRow();
            getDocumentSequenceValidateVO1().setApplyViewCriteriaName(null);
            getDocumentSequenceValidateVO1().executeQuery();
            
//            getDocumentSequenceValidateVO1().setNamedWhereClauseParam("p_bu_id", currRow.getBuId());
            getDocumentSequenceValidateVO1().setNamedWhereClauseParam("p_doc_code", currRow.getDocumentCode());
            getDocumentSequenceValidateVO1().setNamedWhereClauseParam("p_doc_seq_id", currRow.getDocSequenceId());
            getDocumentSequenceValidateVO1().setApplyViewCriteriaName("DocumentSequenceValidateVOCriteria");
            getDocumentSequenceValidateVO1().setOrderByClause("XxadsDocumentSequenceEO.EFFECTIVE_TO desc");
            getDocumentSequenceValidateVO1().executeQuery();
            
            previousEndDate = null; 
            DocumentSequenceValidateVORowImpl previousRow =
                (DocumentSequenceValidateVORowImpl) getDocumentSequenceValidateVO1().first();
            if(previousRow != null && previousRow.getEffectiveTo() != null)
            {
                previousEndDate = new oracle.jbo.domain.Date(previousRow.getEffectiveTo());
                currRow.setEffectiveFrom((Date) new oracle.jbo.domain.Date(previousEndDate)
                                         .addJulianDays(1, 0));
                currRow.setTransEffectiveFromEditFlag("N");
            }
            else if(getDocumentSequenceValidateVO1().getRowCount() == 0)
            {
                Date d=new Date();
                currRow.setEffectiveFrom((Date)d.getCurrentDate());
            }
            else 
            {
                currRow.setTransDocumentName(null);
                currRow.setDocumentCode(null);
                return "Document sequence is already defined for Business Unit "+searchRow.getTransBuName()+"for the given dates range";
            }
            System.out.println(currRow.getEffectiveFrom() + " - ghjvsdgh");
        }
        catch(Exception e) 
        {
            e.printStackTrace();
            return e.getMessage();
        }
        return msg;
    }
    
    public String validateHiringBasis() 
    {
        String message = "Success";
        oracle.jbo.domain.Date previousEndDate = null; 
        int count = 0;
        try {
            TransRentalMasterSearchVORowImpl searchRow=(TransRentalMasterSearchVORowImpl)getTransRentalMasterSearchVO1().getCurrentRow();
            if(searchRow!=null)
            {
                RentalMasterVORowImpl currRow=(RentalMasterVORowImpl)getRentalMasterVO1().getCurrentRow();
                if(currRow!=null && currRow.getAssetCategoryId()!=null && currRow.getHiringRuleId()!=null)
                {
                    getRentalMasterValidateVO1().setApplyViewCriteriaName(null);
                    getRentalMasterValidateVO1().executeQuery();
                    
                    getRentalMasterValidateVO1().setNamedWhereClauseParam("p_bu_id", currRow.getBuId());
                    getRentalMasterValidateVO1().setNamedWhereClauseParam("p_flex_value_id", currRow.getFlexValueId() == null ? new oracle.jbo.domain.Number(2) : currRow.getFlexValueId());
                    getRentalMasterValidateVO1().setNamedWhereClauseParam("p_asset_category_id", currRow.getAssetCategoryId());
                    getRentalMasterValidateVO1().setNamedWhereClauseParam("p_hiring_rule_id", currRow.getHiringRuleId());
                    getRentalMasterValidateVO1().setNamedWhereClauseParam("p_rate_id", currRow.getRateId());
                    getRentalMasterValidateVO1().setNamedWhereClauseParam("p_rental_type", currRow.getRentalType());
                    getRentalMasterValidateVO1().setApplyViewCriteriaName("RentalMasterValidateVOCriteria");
                    getRentalMasterValidateVO1().executeQuery();
                    getRentalMasterValidateVO1().setOrderByClause("XxadsRentalRateMasterEO.EFFECTIVE_TO_DATE desc");
                    
                    RentalMasterValidateVORowImpl previousRow =
                       (RentalMasterValidateVORowImpl) getRentalMasterValidateVO1().first();
                   if(previousRow != null && previousRow.getEffectiveToDate() != null){
                       previousEndDate = new oracle.jbo.domain.Date(previousRow.getEffectiveToDate());
                   }
                    if(previousEndDate != null)
                    {
                        currRow.setEffectiveFromDate ((Date) new oracle.jbo.domain.Date(previousEndDate)
                                                 .addJulianDays(1, 0));
                        currRow.setTransEffectiveFromDateEditFlag("N");
                    }
                    else if(getRentalMasterValidateVO1().getRowCount() > 0)
                    {
                        String hb = currRow.getTransHiringBasis();
                        currRow.setTransHiringBasis(null);
                        currRow.setHiringRuleId(null);
                        currRow.setEffectiveFromDate(null);
                        currRow.setTransEffectiveFromDateEditFlag(null);
                        return  "Active Rental Rate exists for the given Business Unit "+searchRow.getTransBuName()+
                                        (searchRow.getTransDivision() == null ? ", " : ", Division "+searchRow.getTransDivision()+", ")+
                                        "Asset Category "+currRow.getTransAssetCategory()+
                                        ", Hiring Basis "+hb+" for the given dates range";
                    }
                    else {
                        currRow.setEffectiveFromDate(null);
                        currRow.setTransEffectiveFromDateEditFlag(null);
                    }
                }
                       
            }
        }
        catch(Exception e) 
        {
            e.printStackTrace();
            return e.getMessage();
        }
        return message;
    }
    
    public String validateInternalEmpDuplicates() 
    {
        String message = "Success";
        oracle.jbo.domain.Date previousEndDate = null; 
        int count = 0;
        try 
        {
            TransEmpMasterSearchVORowImpl searchRow=(TransEmpMasterSearchVORowImpl)getTransEmpMasterSearchVO1().getCurrentRow();
            if(searchRow!=null)
            {
                EmployeeMasterVORowImpl currRow=(EmployeeMasterVORowImpl)getEmployeeMasterVO1().getCurrentRow();
                if(currRow!=null && currRow.getEmployeeId()!=null)
                {
                    getEmployeeMasterValidateVO1().setApplyViewCriteriaName(null);
                    getEmployeeMasterValidateVO1().executeQuery();
                    
                    getEmployeeMasterValidateVO1().setNamedWhereClauseParam("p_master_id", currRow.getMasterId());
                    getEmployeeMasterValidateVO1().setNamedWhereClauseParam("p_emp_id", currRow.getEmployeeId());
                    getEmployeeMasterValidateVO1().setApplyViewCriteriaName("EmployeeMasterValidateVOCriteria");
                    getEmployeeMasterValidateVO1().executeQuery();
                    getEmployeeMasterValidateVO1().setOrderByClause("XxadsEmployeeMasterEO.EFFECTIVE_TO desc");
                    
                   EmployeeMasterValidateVORowImpl previousRow =
                       (EmployeeMasterValidateVORowImpl) getEmployeeMasterValidateVO1().first();
                   if(previousRow != null && previousRow.getEffectiveTo() != null){
                       previousEndDate = new oracle.jbo.domain.Date(previousRow.getEffectiveTo());
                   }
                    if(previousEndDate != null)
                    {
                        currRow.setEffectiveFrom ((Date) new oracle.jbo.domain.Date(previousEndDate)
                                                 .addJulianDays(1, 0));
                        currRow.setTransEffectiveFromEditFlag("N");
                    }
                    else if(getEmployeeMasterValidateVO1().getRowCount() > 0)
                    {
                        currRow.setTransEmployeeNum(null);
                        currRow.setEmployeeName(null);
                        currRow.setEmployeeNum(null);
                        currRow.setEmployeeId(null);
                        return  "Given Employee is active in the given Business Unit "+searchRow.getTransBuName()+
                                        (searchRow.getTransDivision() == null ? ", " : ", Division "+searchRow.getTransDivision())+
                                       " for the given dates range";
                    }
//                    String empName = currRow.getEmployeeName();
//                currRow.setEmployeeNum(currRow.getTransEmployeeNum());
//                currRow.setEmployeeName(empName);
                }
                       
            }
        }
        catch(Exception e) 
        {
            e.printStackTrace();
            return e.getMessage();
        }
        return message;
    }

    /**
     * Container's getter for EmployeeMasterValidateVO1.
     * @return EmployeeMasterValidateVO1
     */
    public EmployeeMasterValidateVOImpl getEmployeeMasterValidateVO1() {
        return (EmployeeMasterValidateVOImpl) findViewObject("EmployeeMasterValidateVO1");
    }
    
    public String empEffectiveFromChange() 
    {
        String message = "Success";
        oracle.jbo.domain.Date previousEndDate = null; 
        int count = 0;
        try 
        {
            TransEmpMasterSearchVORowImpl searchRow =
                (TransEmpMasterSearchVORowImpl) getTransEmpMasterSearchVO1().getCurrentRow();
            if(searchRow != null){
                EmployeeMasterVORowImpl currRow = (EmployeeMasterVORowImpl) getEmployeeMasterVO1().getCurrentRow();
                    
                if(currRow != null  && (currRow.getEntity(0).getEntityState() == 0 || currRow.getEntity(0).getEntityState() == 2 ) && currRow.getEmployeeId()!= null && currRow.getEffectiveFrom() != null){
                getEmployeeMasterValidateVO1().setApplyViewCriteriaName(null);
                getEmployeeMasterValidateVO1().executeQuery();
                
                getEmployeeMasterValidateVO1().setNamedWhereClauseParam("p_master_id", currRow.getMasterId());
                getEmployeeMasterValidateVO1().setNamedWhereClauseParam("p_emp_id", currRow.getEmployeeId());
                getEmployeeMasterValidateVO1().setApplyViewCriteriaName("EmployeeMasterValidateVOCriteria");
                getEmployeeMasterValidateVO1().executeQuery();
                getEmployeeMasterValidateVO1().setOrderByClause("XxadsEmployeeMasterEO.EFFECTIVE_TO desc");
                
                previousEndDate = null; 
                EmployeeMasterValidateVORowImpl previousRow =
                    (EmployeeMasterValidateVORowImpl) getEmployeeMasterValidateVO1().first();
                if(previousRow != null && previousRow.getEffectiveTo() != null){
                    previousEndDate = new oracle.jbo.domain.Date(previousRow.getEffectiveTo());
                }
                
                if(currRow.getEffectiveFrom() != null){
                    RowSetIterator filteredRows = getEmployeeMasterValidateVO1().createRowSetIterator(null);
                                        
                    while(filteredRows.hasNext()){
                        EmployeeMasterValidateVORowImpl currFilRow = (EmployeeMasterValidateVORowImpl)filteredRows.next();
                        if(currFilRow.getEffectiveFrom().compareTo(currRow.getEffectiveFrom()) > 0){
                            if(currRow.getEffectiveTo() == null){
                                count = 1;
                            }
                            else if(currFilRow.getEffectiveFrom().compareTo(currRow.getEffectiveTo())<=0){
                               count = 1;
                           }
                        }
                        else if(currFilRow.getEffectiveFrom().compareTo(currRow.getEffectiveFrom()) < 0){
                            if(currFilRow.getEffectiveTo() == null){
                                count = 1;
                            }
                            else if(currRow.getEffectiveFrom().compareTo(currFilRow.getEffectiveTo()) <= 0){
                                count = 2;
                            }
                        }
                        else{
                            count = 1;
                        }
                    }
                }
                if(count > 0){
                    message = "Given Employee is active in the Business Unit "+searchRow.getTransBuName()+"for the given dates range";
                    currRow.setEffectiveFrom(null);
                    currRow.setEffectiveTo(null);
                }
                else
                {
                    if(previousEndDate != null){
                        currRow.setEffectiveFrom ((Date) new oracle.jbo.domain.Date(previousEndDate)
                                                 .addJulianDays(1, 0));
                        currRow.setTransEffectiveFromEditFlag("N");
                    }
                    
                    if(currRow.getEffectiveTo() != null){
                        java.sql.Timestamp datetime = new java.sql.Timestamp(System.currentTimeMillis());
                        oracle.jbo.domain.Date currDate = new  oracle.jbo.domain.Date(datetime);
                        
                        if(currDate.compareTo(currRow.getEffectiveTo()) < 0){
                            currRow.setEffectiveTo(null);
                            message = "Effective To should be only on or before Current Date";
                        }
                    }
                }
            }
        }
        }
        catch(Exception e) 
        {
            e.printStackTrace();    
            return e.getMessage();
        }
        return message;
    }
    
    public String validateEmpToDates() 
    {
        String message = "Success";
        oracle.jbo.domain.Date previousEndDate = null; 
        int count = 0;
        try 
        {
            TransEmpMasterSearchVORowImpl searchRow =
                (TransEmpMasterSearchVORowImpl) getTransEmpMasterSearchVO1().getCurrentRow();
            if(searchRow != null){
                EmployeeMasterVORowImpl currRow = (EmployeeMasterVORowImpl) getEmployeeMasterVO1().getCurrentRow();
                if(currRow != null  && (currRow.getEntity(0).getEntityState() == 0 || currRow.getEntity(0).getEntityState() == 2 ) && currRow.getEmployeeId()!= null && currRow.getEffectiveFrom() != null){
                    getEmployeeMasterValidateVO1().setApplyViewCriteriaName(null);
                    getEmployeeMasterValidateVO1().executeQuery();
                    
                    getEmployeeMasterValidateVO1().setNamedWhereClauseParam("p_master_id", currRow.getMasterId());
                    getEmployeeMasterValidateVO1().setNamedWhereClauseParam("p_emp_id", currRow.getEmployeeId());
                    getEmployeeMasterValidateVO1().setApplyViewCriteriaName("EmployeeMasterValidateVOCriteria");
                    getEmployeeMasterValidateVO1().executeQuery();
                    getEmployeeMasterValidateVO1().setOrderByClause("XxadsEmployeeMasterEO.EFFECTIVE_TO desc");
                    
                    previousEndDate = null; 
                    EmployeeMasterValidateVORowImpl previousRow =
                        (EmployeeMasterValidateVORowImpl) getEmployeeMasterValidateVO1().first();
                    if(previousRow != null && previousRow.getEffectiveTo() != null){
                        previousEndDate = new oracle.jbo.domain.Date(previousRow.getEffectiveTo());
                    }
                    
                    if(currRow.getEffectiveFrom() != null){
                        RowSetIterator filteredRows = getEmployeeMasterValidateVO1().createRowSetIterator(null);
                                            
                        while(filteredRows.hasNext()){
                            EmployeeMasterValidateVORowImpl currFilRow = (EmployeeMasterValidateVORowImpl)filteredRows.next();
                            if(currFilRow.getEffectiveFrom().compareTo(currRow.getEffectiveFrom()) > 0){
                                if(currRow.getEffectiveTo() == null){
                                    count = 1;
                                }
                                else if(currFilRow.getEffectiveFrom().compareTo(currRow.getEffectiveTo())<=0){
                                   count = 1;
                               }
                            }
                            else if(currFilRow.getEffectiveFrom().compareTo(currRow.getEffectiveFrom()) < 0){
                                if(currFilRow.getEffectiveTo() == null){
                                    count = 1;
                                }
                                else if(currRow.getEffectiveFrom().compareTo(currFilRow.getEffectiveTo()) <= 0){
                                    count = 2;
                                }
                            }
                            else{
                                count = 1;
                            }
                        }
                    }
                    if(count > 0){
                        message = "Given Employee is active in the Business Unit "+searchRow.getTransBuName()+"for the given dates range";
                        currRow.setEffectiveTo(null);
                    }
                    else
                    {
                        if(previousEndDate != null){
                            currRow.setEffectiveFrom ((Date) new oracle.jbo.domain.Date(previousEndDate)
                                                     .addJulianDays(1, 0));
                            currRow.setTransEffectiveFromEditFlag("N");
                        }
                        
                        if(currRow.getEffectiveTo() != null){
                            java.sql.Timestamp datetime = new java.sql.Timestamp(System.currentTimeMillis());
                            oracle.jbo.domain.Date currDate = new  oracle.jbo.domain.Date(datetime);
                            
                            if(currDate.compareTo(currRow.getEffectiveTo()) < 0){
                                currRow.setEffectiveTo(null);
                                message = "Effective To should be only on or before Current Date";
                            }
                        }
                    }
                }
            }
        }
        catch(Exception e) 
        {
            e.printStackTrace();    
            return e.getMessage();
        }
        return message;
    }
    
    public void addNewEmp() 
    {
        try 
        {
            TransEmpMasterSearchVORowImpl searchRow =
                (TransEmpMasterSearchVORowImpl) getTransEmpMasterSearchVO1().getCurrentRow();
            if(searchRow!=null) 
            {
                EmployeeMasterVORowImpl newRow = (EmployeeMasterVORowImpl) getEmployeeMasterVO1().createRow();
                getEmployeeMasterVO1().insertRow(newRow);
                newRow.setBuId(searchRow.getTransBuId());
                newRow.setDivision(searchRow.getTransDivision());
                newRow.setDivFlexValueId(searchRow.getTransDivFlexValueId());
                newRow.setDivFlexValueSetId(searchRow.getTransDivFlexValSetId());
                newRow.setDeploymentStatus("A");
                newRow.setTransDeploymentStatus("Available");
            }
        }
        catch(Exception e) 
        {
            e.printStackTrace();    
        }
    }
    
    public String validateHiredEmpDuplicates() 
    {
        String message = "Success";
        oracle.jbo.domain.Date previousEndDate = null; 
        String empName = null;
        oracle.jbo.domain.Number employeeId = null;
        int count = 0;
        try 
        {
            TransEmpMasterSearchVORowImpl searchRow =
                (TransEmpMasterSearchVORowImpl) getTransEmpMasterSearchVO1().getCurrentRow();
            if(searchRow != null)
            {
                EmployeeMasterVORowImpl currRow = (EmployeeMasterVORowImpl) getEmployeeMasterVO1().getCurrentRow();
                if(currRow != null  && (currRow.getEntity(0).getEntityState() == 0 || currRow.getEntity(0).getEntityState() == 2 )) 
                {
            
                    if("H".equals(currRow.getEmployeeSource())) 
                    {
                        getAllEmployeesValidateVO1().setApplyViewCriteriaName(null);   
                        getAllEmployeesValidateVO1().executeQuery();
                        
                        getAllEmployeesValidateVO1().setNamedWhereClauseParam("p_emp_num", currRow.getEmployeeNum());
                        getAllEmployeesValidateVO1().setApplyViewCriteriaName("AllEmployeesValidateVOCriteria");
                        getAllEmployeesValidateVO1().executeQuery();
                        
                        if(getAllEmployeesValidateVO1().getRowCount() > 0) {
                            currRow.setEmployeeNum(null);
                            return "Given employee number already exists in Internal Source.";
                        }
                    }
                    if(currRow != null  && (currRow.getEntity(0).getEntityState() == 0 || currRow.getEntity(0).getEntityState() == 2 ) && currRow.getEmployeeNum()!= null )
                    {
                        getEmployeeMasterValidateVO1().setApplyViewCriteriaName(null);
                        getEmployeeMasterValidateVO1().executeQuery();
                        
                        getEmployeeMasterValidateVO1().setNamedWhereClauseParam("p_master_id", currRow.getMasterId());
                        getEmployeeMasterValidateVO1().setNamedWhereClauseParam("p_emp_num", currRow.getEmployeeNum());
                        getEmployeeMasterValidateVO1().setApplyViewCriteriaName("EmployeeMasterValidateVOCriteria1");
                        getEmployeeMasterValidateVO1().executeQuery();
                        getEmployeeMasterValidateVO1().setOrderByClause("XxadsEmployeeMasterEO.EFFECTIVE_TO desc");
                         
                        previousEndDate = null; 
                        EmployeeMasterValidateVORowImpl previousRow =
                            (EmployeeMasterValidateVORowImpl) getEmployeeMasterValidateVO1().first();
                        if(previousRow != null && previousRow.getEffectiveTo() != null){
                            previousEndDate = new oracle.jbo.domain.Date(previousRow.getEffectiveTo());
                            empName = previousRow.getEmployeeName();
                            employeeId = previousRow.getEmployeeId();
                        }
    
    
                            if(previousEndDate != null){
                                currRow.setEffectiveFrom ((Date) new oracle.jbo.domain.Date(previousEndDate)
                                                         .addJulianDays(1, 0));
                                currRow.setTransEffectiveFromEditFlag("N");
                                currRow.setEmployeeName(empName);
                                currRow.setEmployeeId(employeeId);
                            }
                            else if(getEmployeeMasterValidateVO1().getRowCount() > 0)
                            {
                                message = "Given Employee is active in the Business Unit "+searchRow.getTransBuName()+"for the given dates range";
                                currRow.setEmployeeNum(null);
                                currRow.setEmployeeName(empName);
                                currRow.setEmployeeId(employeeId);
    //                            SequenceImpl seq = new SequenceImpl("XXADS_EMPLOYEE_MASTER_S",getDBTransaction());
                                
                            }
                            else 
                            {
                                currRow.setEffectiveFrom(null);
                                currRow.setTransEffectiveFromEditFlag("Y");
                                currRow.setEmployeeId(currRow.getMasterId());
                            }
                             
                    }
                }
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();    
            return e.getMessage();
        }
        return message;
    }

    /**
     * Container's getter for AllEmployeesValidateVO1.
     * @return AllEmployeesValidateVO1
     */
    public AllEmployeesValidateVOImpl getAllEmployeesValidateVO1() {
        return (AllEmployeesValidateVOImpl) findViewObject("AllEmployeesValidateVO1");
    }
    
    public String empNameChange() 
    {
        String message = "Success";    
        try 
        {
            TransEmpMasterSearchVORowImpl searchRow =
                (TransEmpMasterSearchVORowImpl) getTransEmpMasterSearchVO1().getCurrentRow();
            if(searchRow != null)
            {
                EmployeeMasterVORowImpl currRow = (EmployeeMasterVORowImpl) getEmployeeMasterVO1().getCurrentRow();
                if(currRow != null  && (currRow.getEntity(0).getEntityState() == 0 || currRow.getEntity(0).getEntityState() == 2 ) && currRow.getEmployeeName() != null) 
                {
                    if("H".equals(currRow.getEmployeeSource())) 
                    {
                        getEmployeeMasterValidateVO1().setApplyViewCriteriaName(null);
                        getEmployeeMasterValidateVO1().executeQuery();
                        
                        getEmployeeMasterValidateVO1().setNamedWhereClauseParam("p_master_id", currRow.getMasterId());
                        getEmployeeMasterValidateVO1().setNamedWhereClauseParam("p_emp_num", currRow.getEmployeeNum());
                        getEmployeeMasterValidateVO1().setNamedWhereClauseParam("p_emp_name", currRow.getEmployeeName());
                        getEmployeeMasterValidateVO1().setApplyViewCriteriaName("EmployeeMasterValidateVOCriteria2");
                        getEmployeeMasterValidateVO1().executeQuery();
                        getEmployeeMasterValidateVO1().setOrderByClause("XxadsEmployeeMasterEO.EFFECTIVE_TO desc");
                        
                        if(getEmployeeMasterValidateVO1().getRowCount() > 0) {
                            
                            EmployeeMasterValidateVORowImpl previousRow =
                                (EmployeeMasterValidateVORowImpl) getEmployeeMasterValidateVO1().first();
                            currRow.setEmployeeName(null);
                            return "Given employee name doesn't match the existing name - "+previousRow.getEmployeeName();
                        }
                    }
                 
                }
            }
        }
        catch(Exception e) 
        {
            e.printStackTrace();
            return e.getMessage();
        }
        return message;
    }
    
    public String empCertificateSubTypeChange() 
    {
        String message = "Success";    
        try 
        {
            EmployeeCertificationsVORowImpl currRow = (EmployeeCertificationsVORowImpl) getEmployeeCertificationsVO1().getCurrentRow();
            if(currRow != null  && (currRow.getEntity(0).getEntityState() == 0 || currRow.getEntity(0).getEntityState() == 2 ) && currRow.getSubType() != null )
            {
                getEmployeeCertificationsValidateVO1().setApplyViewCriteriaName(null);
                getEmployeeCertificationsValidateVO1().executeQuery();
                
                getEmployeeCertificationsValidateVO1().setNamedWhereClauseParam("p_cert_id", currRow.getCertificationId());
                getEmployeeCertificationsValidateVO1().setNamedWhereClauseParam("p_cert_sub_type", currRow.getSubType());
                getEmployeeCertificationsValidateVO1().setNamedWhereClauseParam("p_cert_type", currRow.getCertificationType());
                getEmployeeCertificationsValidateVO1().setNamedWhereClauseParam("p_master_id", currRow.getMasterId());
                getEmployeeCertificationsValidateVO1().setApplyViewCriteriaName("EmployeeCertificationsValidateVOCriteria");
                getEmployeeCertificationsValidateVO1().executeQuery();
                getEmployeeCertificationsValidateVO1().setOrderByClause("XxadsEmpCertificationsEO.VALID_TO_DATE desc");
                 
                EmployeeCertificationsValidateVORowImpl previousRow =
                    (EmployeeCertificationsValidateVORowImpl) getEmployeeCertificationsValidateVO1().first();

                     if(previousRow.getValidToDate() == null && getEmployeeCertificationsValidateVO1().getRowCount() > 0)
                    {
                        message = "Active Certification Sub type exists for the given dates range";
                        currRow.setTransSubType(null);
                        currRow.setSubType(null);
                    }
                                         
            }
        }
        catch(Exception e) 
        {
            e.printStackTrace();
            return e.getMessage();
        }
        return message;
    }

    /**
     * Container's getter for EmployeeCertificationsValidateVO1.
     * @return EmployeeCertificationsValidateVO1
     */
    public EmployeeCertificationsValidateVOImpl getEmployeeCertificationsValidateVO1() {
        return (EmployeeCertificationsValidateVOImpl) findViewObject("EmployeeCertificationsValidateVO1");
    }
    
    public String empCertFromDateChange() 
    {
        String message = "Success";    
        int count = 0;
        try 
        {
            EmployeeCertificationsVORowImpl currRow = (EmployeeCertificationsVORowImpl) getEmployeeCertificationsVO1().getCurrentRow();
            if(currRow != null  && (currRow.getEntity(0).getEntityState() == 0 || currRow.getEntity(0).getEntityState() == 2 ) && currRow.getSubType() != null )
            {
                getEmployeeCertificationsValidateVO1().setApplyViewCriteriaName(null);
                getEmployeeCertificationsValidateVO1().executeQuery();
                
                getEmployeeCertificationsValidateVO1().setNamedWhereClauseParam("p_cert_id", currRow.getCertificationId());
                getEmployeeCertificationsValidateVO1().setNamedWhereClauseParam("p_cert_sub_type", currRow.getSubType());
                getEmployeeCertificationsValidateVO1().setNamedWhereClauseParam("p_cert_type", currRow.getCertificationType());
                getEmployeeCertificationsValidateVO1().setNamedWhereClauseParam("p_master_id", currRow.getMasterId());
                getEmployeeCertificationsValidateVO1().setApplyViewCriteriaName("EmployeeCertificationsValidateVOCriteria");
                getEmployeeCertificationsValidateVO1().executeQuery();
                getEmployeeCertificationsValidateVO1().setOrderByClause("XxadsEmpCertificationsEO.VALID_TO_DATE desc");
                 
                EmployeeCertificationsValidateVORowImpl previousRow =
                    (EmployeeCertificationsValidateVORowImpl) getEmployeeCertificationsValidateVO1().first();
                
                if(currRow.getValidFromDate() != null){
                    RowSetIterator filteredRows = getEmployeeCertificationsValidateVO1().createRowSetIterator(null);
                                        
                    while(filteredRows.hasNext()){
                        EmployeeCertificationsValidateVORowImpl currFilRow = (EmployeeCertificationsValidateVORowImpl)filteredRows.next();
                        if(currFilRow.getValidFromDate().compareTo(currRow.getValidFromDate()) > 0){
                            if(currRow.getValidToDate() == null){
                                count = 1;
                            }
                            else if(currFilRow.getValidFromDate().compareTo(currRow.getValidToDate())<=0){
                               count = 1;
                           }
                        }
                        else if(currFilRow.getValidFromDate().compareTo(currRow.getValidFromDate()) < 0){
                            if(currFilRow.getValidToDate() == null){
                                count = 1;
                            }
                            else if(currRow.getValidFromDate().compareTo(currFilRow.getValidToDate()) <= 0){
                                count = 2;
                            }
                        }
                        else{
                            count = 1;
                        }
                    }
                }
                if(count > 0){
                        currRow.setValidToDate(null);
                        return "Active Certification Sub type exists for the given dates range";
                    }
                                         
            }
        }
        catch(Exception e) 
        {
            e.printStackTrace();
            return e.getMessage();
        }
        return message;
    }
    
    public String empCertToDateChange() 
    {
        String message = "Success";    
        int count = 0;
        try 
        {
            EmployeeCertificationsVORowImpl currRow = (EmployeeCertificationsVORowImpl) getEmployeeCertificationsVO1().getCurrentRow();
            if(currRow != null  && (currRow.getEntity(0).getEntityState() == 0 || currRow.getEntity(0).getEntityState() == 2 ) && currRow.getSubType() != null )
            {
                getEmployeeCertificationsValidateVO1().setApplyViewCriteriaName(null);
                getEmployeeCertificationsValidateVO1().executeQuery();
                
                getEmployeeCertificationsValidateVO1().setNamedWhereClauseParam("p_cert_id", currRow.getCertificationId());
                getEmployeeCertificationsValidateVO1().setNamedWhereClauseParam("p_cert_sub_type", currRow.getSubType());
                getEmployeeCertificationsValidateVO1().setNamedWhereClauseParam("p_cert_type", currRow.getCertificationType());
                getEmployeeCertificationsValidateVO1().setNamedWhereClauseParam("p_master_id", currRow.getMasterId());
                getEmployeeCertificationsValidateVO1().setApplyViewCriteriaName("EmployeeCertificationsValidateVOCriteria");
                getEmployeeCertificationsValidateVO1().executeQuery();
                getEmployeeCertificationsValidateVO1().setOrderByClause("XxadsEmpCertificationsEO.VALID_TO_DATE desc");
                 
                EmployeeCertificationsValidateVORowImpl previousRow =
                    (EmployeeCertificationsValidateVORowImpl) getEmployeeCertificationsValidateVO1().first();
                
                if(currRow.getValidFromDate() != null){
                    RowSetIterator filteredRows = getEmployeeCertificationsValidateVO1().createRowSetIterator(null);
                                        
                    while(filteredRows.hasNext()){
                        EmployeeCertificationsValidateVORowImpl currFilRow = (EmployeeCertificationsValidateVORowImpl)filteredRows.next();
                        if(currFilRow.getValidFromDate().compareTo(currRow.getValidFromDate()) > 0){
                            if(currRow.getValidToDate() == null){
                                count = 1;
                            }
                            else if(currFilRow.getValidFromDate().compareTo(currRow.getValidToDate())<=0){
                               count = 1;
                           }
                        }
                        else if(currFilRow.getValidFromDate().compareTo(currRow.getValidFromDate()) < 0){
                            if(currFilRow.getValidToDate() == null){
                                count = 1;
                            }
                            else if(currRow.getValidFromDate().compareTo(currFilRow.getValidToDate()) <= 0){
                                count = 2;
                            }
                        }
                        else{
                            count = 1;
                        }
                    }
                }
                if(count > 0){
                        currRow.setValidFromDate(null);
                        return "Active Certification Sub type exists for the given dates range";
                    }
                                         
            }
        }
        catch(Exception e) 
        {
            e.printStackTrace();
            return e.getMessage();
        }
        return message;
    }
    
    public String saveEmployee() 
    {
        String message = "Success";
        oracle.jbo.domain.Date previousEndDate = null; 
        int count = 0;
        try 
        {
            //validate employees
            TransEmpMasterSearchVORowImpl searchRow =
                (TransEmpMasterSearchVORowImpl) getTransEmpMasterSearchVO1().getCurrentRow();
            if(searchRow != null){
                RowSetIterator empItr = getEmployeeMasterVO1().createRowSetIterator(null);
                while(empItr.hasNext())
                {
                    EmployeeMasterVORowImpl currRow = (EmployeeMasterVORowImpl) empItr.next();
                    if(currRow != null  && (currRow.getEntity(0).getEntityState() == 0 || currRow.getEntity(0).getEntityState() == 2 ) && currRow.getEmployeeId()!= null && currRow.getEffectiveFrom() != null){
                    getEmployeeMasterValidateVO1().setApplyViewCriteriaName(null);
                    getEmployeeMasterValidateVO1().executeQuery();
                    
                    getEmployeeMasterValidateVO1().setNamedWhereClauseParam("p_master_id", currRow.getMasterId());
                    getEmployeeMasterValidateVO1().setNamedWhereClauseParam("p_emp_id", currRow.getEmployeeId());
                    getEmployeeMasterValidateVO1().setApplyViewCriteriaName("EmployeeMasterValidateVOCriteria");
                    getEmployeeMasterValidateVO1().executeQuery();
                    getEmployeeMasterValidateVO1().setOrderByClause("XxadsEmployeeMasterEO.EFFECTIVE_TO desc");
                    
                    previousEndDate = null; 
                    EmployeeMasterValidateVORowImpl previousRow =
                        (EmployeeMasterValidateVORowImpl) getEmployeeMasterValidateVO1().first();
                    if(previousRow != null && previousRow.getEffectiveTo() != null){
                        previousEndDate = new oracle.jbo.domain.Date(previousRow.getEffectiveTo());
                    }
                    
                    if(currRow.getEffectiveFrom() != null){
                        RowSetIterator filteredRows = getEmployeeMasterValidateVO1().createRowSetIterator(null);
                                            
                        while(filteredRows.hasNext()){
                            EmployeeMasterValidateVORowImpl currFilRow = (EmployeeMasterValidateVORowImpl)filteredRows.next();
                            if(currFilRow.getEffectiveFrom().compareTo(currRow.getEffectiveFrom()) > 0){
                                if(currRow.getEffectiveTo() == null){
                                    count = 1;
                                }
                                else if(currFilRow.getEffectiveFrom().compareTo(currRow.getEffectiveTo())<=0){
                                   count = 1;
                               }
                            }
                            else if(currFilRow.getEffectiveFrom().compareTo(currRow.getEffectiveFrom()) < 0){
                                if(currFilRow.getEffectiveTo() == null){
                                    count = 1;
                                }
                                else if(currRow.getEffectiveFrom().compareTo(currFilRow.getEffectiveTo()) <= 0){
                                    count = 2;
                                }
                            }
                            else{
                                count = 1;
                            }
                        }
                    }
                    if(count > 0){
                        currRow.setEffectiveTo(null);
                        return "Employee : "+currRow.getEmployeeNum() + " is active in the Business Unit "+searchRow.getTransBuName()+"for the given dates range";
                    }
                    else
                    {
                        if(previousEndDate != null){
                            currRow.setEffectiveFrom ((Date) new oracle.jbo.domain.Date(previousEndDate)
                                                     .addJulianDays(1, 0));
                            currRow.setTransEffectiveFromEditFlag("N");
                        }
                        
                        if(currRow.getEffectiveTo() != null){
                            java.sql.Timestamp datetime = new java.sql.Timestamp(System.currentTimeMillis());
                            oracle.jbo.domain.Date currDate = new  oracle.jbo.domain.Date(datetime);
                            
                            if(currDate.compareTo(currRow.getEffectiveTo()) < 0){
                                currRow.setEffectiveTo(null);
                                return "Effective To should be only on or before Current Date for the employee : "+ currRow.getEmployeeName();
                            }
                        }
                    }
                }
                }
            }
            //validate certificates
            RowSetIterator certItr = getEmployeeCertificationsVO1().createRowSetIterator(null);
            while(certItr.hasNext())
            {
                EmployeeCertificationsVORowImpl certCurrRow = (EmployeeCertificationsVORowImpl) certItr.next();
                if(certCurrRow != null  && (certCurrRow.getEntity(0).getEntityState() == 0 || certCurrRow.getEntity(0).getEntityState() == 2 ))
                {
                    getEmployeeCertificationsValidateVO1().setApplyViewCriteriaName(null);
                    getEmployeeCertificationsValidateVO1().executeQuery();
                    
                    getEmployeeCertificationsValidateVO1().setNamedWhereClauseParam("p_cert_id", certCurrRow.getCertificationId());
                    getEmployeeCertificationsValidateVO1().setNamedWhereClauseParam("p_cert_sub_type", certCurrRow.getSubType());
                    getEmployeeCertificationsValidateVO1().setNamedWhereClauseParam("p_cert_type", certCurrRow.getCertificationType());
                    getEmployeeCertificationsValidateVO1().setNamedWhereClauseParam("p_master_id", certCurrRow.getMasterId());
                    getEmployeeCertificationsValidateVO1().setApplyViewCriteriaName("EmployeeCertificationsValidateVOCriteria");
                    getEmployeeCertificationsValidateVO1().executeQuery();
                    getEmployeeCertificationsValidateVO1().setOrderByClause("XxadsEmpCertificationsEO.VALID_TO_DATE desc");
                     
                    EmployeeCertificationsValidateVORowImpl previousRow =
                        (EmployeeCertificationsValidateVORowImpl) getEmployeeCertificationsValidateVO1().first();
                    
                    if(certCurrRow.getValidFromDate() != null){
                        RowSetIterator filteredRows = getEmployeeCertificationsValidateVO1().createRowSetIterator(null);
                                            
                        while(filteredRows.hasNext()){
                            EmployeeCertificationsValidateVORowImpl currFilRow = (EmployeeCertificationsValidateVORowImpl)filteredRows.next();
                            if(currFilRow.getValidFromDate().compareTo(certCurrRow.getValidFromDate()) > 0){
                                if(certCurrRow.getValidToDate() == null){
                                    count = 1;
                                }
                                else if(currFilRow.getValidFromDate().compareTo(certCurrRow.getValidToDate())<=0){
                                   count = 1;
                               }
                            }
                            else if(currFilRow.getValidFromDate().compareTo(certCurrRow.getValidFromDate()) < 0){
                                if(currFilRow.getValidToDate() == null){
                                    count = 1;
                                }
                                else if(certCurrRow.getValidFromDate().compareTo(currFilRow.getValidToDate()) <= 0){
                                    count = 2;
                                }
                            }
                            else{
                                count = 1;
                            }
                        }
                    }
                    if(count > 0)
                    {
                        getEmployeeMasterVO2().setApplyViewCriteriaName(null);
                        getEmployeeMasterVO2().executeQuery();
                        
                        getEmployeeMasterVO2().setApplyViewCriteriaName("EmployeeMasterVOCriteria");
                        getEmployeeMasterVO2().setNamedWhereClauseParam("p_master_id", certCurrRow.getMasterId());
                        getEmployeeMasterVO2().executeQuery();
                        
                        EmployeeMasterVORowImpl empRow = (EmployeeMasterVORowImpl) getEmployeeMasterVO2().first();
                        
                        return "Active Certification Sub type exists for the employee : "+empRow.getEmployeeName()+"for the given dates range";
                    }
                                             
                }
            }
        }
        catch(Exception e) 
        {
            e.printStackTrace();
            return e.getMessage();
        }
        return message;
    }

    /**
     * Container's getter for EmployeeMasterVO2.
     * @return EmployeeMasterVO2
     */
    public EmployeeMasterVOImpl getEmployeeMasterVO2() {
        return (EmployeeMasterVOImpl) findViewObject("EmployeeMasterVO2");
    }
    
    public String updateCurrSequence()
    {
        String msg = "Success";
        try 
        {
            DocumentSequenceVORowImpl currRow = (DocumentSequenceVORowImpl) getDocumentSequenceVO1().getCurrentRow();
            if(currRow.getStartingSeqNum() != null  &&  currRow.getStartingSeqNum().compareTo(0) < 0) {
                currRow.setStartingSeqNum(null);
                currRow.setCurrentSeqNum(null);
                return "Starting Sequence number should be greater than 0";
            }
            else if(currRow.getStartingSeqNum() != null)
            {
                currRow.setCurrentSeqNum(currRow.getStartingSeqNum());    
            }
        }
        catch(Exception e) 
        {
            e.printStackTrace();
            return e.getMessage();
        }
        return msg;
    }

    /**
     * Container's getter for AccessSecurityHdrVO1.
     * @return AccessSecurityHdrVO1
     */
    public AccessSecurityHdrVOImpl getAccessSecurityHdrVO1() {
        return (AccessSecurityHdrVOImpl) findViewObject("AccessSecurityHdrVO1");
    }

    /**
     * Container's getter for AccessSecurityLinesVO1.
     * @return AccessSecurityLinesVO1
     */
    public AccessSecurityLinesVOImpl getAccessSecurityLinesVO1() {
        return (AccessSecurityLinesVOImpl) findViewObject("AccessSecurityLinesVO1");
    }

    /**
     * Container's getter for AccessSecurityHdrToLinesVL1.
     * @return AccessSecurityHdrToLinesVL1
     */
    public ViewLinkImpl getAccessSecurityHdrToLinesVL1() {
        return (ViewLinkImpl) findViewLink("AccessSecurityHdrToLinesVL1");
    }
    
    public String empCatHrsChange(){
        String message = "Success";
        oracle.jbo.domain.Number tot = new oracle.jbo.domain.Number(0);
        try {
            EmpCatVORowImpl currRow = (EmpCatVORowImpl) getEmpCatVO1().getCurrentRow();
            if(currRow != null && currRow.getStandardHours() != null && currRow.getOt1Hours() != null && currRow.getOt2Hours()!= null)
            {
                if(currRow.getStandardHours().intValue() < 0) 
                {
                    currRow.setStandardHours(null);
                    return "Standard Hours cannot be negative.";    
                }
                if(currRow.getOt1Hours().intValue() < 0) 
                {
                    currRow.setOt1Hours(null);
                    return "OT1 Hours cannot be negative.";    
                }
                if(currRow.getOt2Hours().intValue() < 0) 
                {
                    currRow.setOt2Hours(null);
                    return "OT2 Hours cannot be negative.";    
                }
                tot = (currRow.getStandardHours() != null ? currRow.getStandardHours() : new oracle.jbo.domain.Number(0))
                              .add((currRow.getOt1Hours() != null ? currRow.getOt1Hours() : new oracle.jbo.domain.Number(0))
                                           .add((currRow.getOt2Hours() != null ? currRow.getOt2Hours() : new oracle.jbo.domain.Number(0))));
                if(tot.compareTo(24)!=0){
                    currRow.setStandardHours(null);
                    currRow.setOt1Hours(null);
                    currRow.setOt2Hours(null);
                    message = "Sum of Hours should be 24 for Employee Category - "+currRow.getEmpCategoryCode();                        
                }
            }
        }catch (Exception e) {
            e.printStackTrace();
            message = e.getMessage();
        }
        return message;
    }


/*---------------------------------------------------------------------------Manage Templates ---------------------------------------------------------------------------*/

    /**
     * Container's getter for TermsCondsTemplateVO1.
     * @return TermsCondsTemplateVO1
     */
    public TermsCondsTemplateVOImpl getTermsCondsTemplateVO1() {
        return (TermsCondsTemplateVOImpl) findViewObject("TermsCondsTemplateVO1");
    }
    
    public String createTemplate() {
        String message = "Success";
        try 
        {
            TransTemplateVORowImpl transRow = (TransTemplateVORowImpl) getTransTemplateVO1().getCurrentRow();
            if(transRow != null && transRow.getTransBuName() != null && (("Y".equals(transRow.getTransDivisionRequired()) && transRow.getTransDivision() != null) || "N".equals(transRow.getTransDivisionRequired()))){
                getTermsCondsTemplateVO1().executeEmptyRowSet();
                
                TermsCondsTemplateVORowImpl newRow = (TermsCondsTemplateVORowImpl) getTermsCondsTemplateVO1().createRow();
                getTermsCondsTemplateVO1().insertRow(newRow);
                newRow.setActiveFlag("Y");
                newRow.setTransBuName(transRow.getTransBuName());
                newRow.setBuId(transRow.getTransBuId());
                newRow.setTransDivisionRequired(transRow.getTransDivisionRequired());
                newRow.setTransDivSegment(transRow.getTransDivSegment());
                newRow.setDivision(transRow.getTransDivision());
                newRow.setDivFlexValueId(transRow.getTransDivFlexValueId());
            }else if(transRow.getTransBuName() != null){
                return "Please enter Business unit to continue";
            }else{
                return "Please enter Division to continue";
            }
        }
        catch(Exception e) 
        {
            message = e.getMessage();
            e.printStackTrace();
        }
        return message;
    }
    
    public void searchTemplate() 
    {
        try 
        {
            TransTemplateVORowImpl transRow = (TransTemplateVORowImpl) getTransTemplateVO1().getCurrentRow();
            getTermsCondsTemplateVO1().executeEmptyRowSet();
//            TermsCondsTemplateVORowImpl currRow = (TermsCondsTemplateVORowImpl) getTermsCondsTemplateVO1().getCurrentRow();

            getTermsCondsTemplateVO1().setNamedWhereClauseParam("p_template_id", transRow.getTransTemplateId());
            getTermsCondsTemplateVO1().setNamedWhereClauseParam("p_bu_id", transRow.getTransBuId());
            getTermsCondsTemplateVO1().setNamedWhereClauseParam("p_div_flex_id", transRow.getTransDivFlexValueId());
            getTermsCondsTemplateVO1().setApplyViewCriteriaName("TermsCondsTemplateVOCriteria");
            getTermsCondsTemplateVO1().executeQuery();
        }
        catch(Exception e) 
        {
            e.printStackTrace();    
        }
    }

    /**
     * Container's getter for TransTemplateVO1.
     * @return TransTemplateVO1
     */
    public TransTemplateVOImpl getTransTemplateVO1() {
        return (TransTemplateVOImpl) findViewObject("TransTemplateVO1");
    }
    
    public void createTransTemplateSearch(){
        try
        {
            TransTemplateVORowImpl transCurrRow =
                (TransTemplateVORowImpl) getTransTemplateVO1().getCurrentRow();
            if(transCurrRow != null){
                transCurrRow.remove();
            }
            
            getTransTemplateVO1().executeQuery();
                       
            TransTemplateVORowImpl transRow = (TransTemplateVORowImpl) getTransTemplateVO1().createRow();
            getTransTemplateVO1().insertRow(transRow);
            
            
            getTermsCondsTemplateVO1().executeEmptyRowSet();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public void setCurrentTransTemplateRow() 
    {
        try 
        {
            TermsCondsTemplateVORowImpl currRow = (TermsCondsTemplateVORowImpl) getTermsCondsTemplateVO1().getCurrentRow();
            if(currRow != null && currRow.getTemplateName() != null && currRow.getTemplateInfo() != null && "N".equals((String) ADFContext.getCurrent()
                                                            .getPageFlowScope()
                                                            .get("isTemplateSaved"))) 
            {
                
                          
                TransTemplateVORowImpl transRow = (TransTemplateVORowImpl) getTransTemplateVO1().getCurrentRow();
                transRow.setTransTemplateName(currRow.getTemplateName());
                transRow.setTransTemplateId(currRow.getTemplateId());
                transRow.setTransBuId(currRow.getBuId());
                transRow.setTransDivFlexValueId(currRow.getDivFlexValueId());
                transRow.setTransDivision(currRow.getDivision());
                searchTemplate();
            }

        }
        catch(Exception e) 
        {
            e.printStackTrace();    
        }
    }
    
    public String checkDuplicateTemplate() 
    {
        String message = "Success";
        try 
        {
            TermsCondsTemplateVORowImpl currRow = (TermsCondsTemplateVORowImpl) getTermsCondsTemplateVO1().getCurrentRow();

            getTermsCondsTemplateVO2().setNamedWhereClauseParam("p_template_name", currRow.getTemplateName());
            getTermsCondsTemplateVO2().setNamedWhereClauseParam("p_template_id", currRow.getTemplateId());
            getTermsCondsTemplateVO2().setApplyViewCriteriaName("TermsCondsTemplateVOCriteria1");
            getTermsCondsTemplateVO2().executeQuery();
            
            if(getTermsCondsTemplateVO2().getRowCount() > 0) 
            {
                currRow.setTemplateName(null);
                return "Given Template name already exists. Please enter new name.";    
            }
        }
        catch(Exception e) 
        {
            message = e.getMessage();
            e.printStackTrace();
        }
        return message;
    }
    
    public void changeActiveFlag() 
    {
        try 
        {
            TransTemplateVORowImpl transRow = (TransTemplateVORowImpl) getTransTemplateVO1().getCurrentRow();
            
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        
    }

    /*---------------------------------------------------------------------------Methods end ---------------------------------------------------------------------------*/

    /**
     * Container's getter for TermsCondsTemplateVO2.
     * @return TermsCondsTemplateVO2
     */
    public TermsCondsTemplateVOImpl getTermsCondsTemplateVO2() {
        return (TermsCondsTemplateVOImpl) findViewObject("TermsCondsTemplateVO2");
    }

    /**
     * Container's getter for DivisionAccountMapVO1.
     * @return DivisionAccountMapVO1
     */
    public DivisionAccountMapVOImpl getDivisionAccountMapVO1() {
        return (DivisionAccountMapVOImpl) findViewObject("DivisionAccountMapVO1");
    }
    
    public String createDivisionAccMap(){
        String message = "Success";
        try {
            TransAccParamsSearchVORowImpl searchRow =
                (TransAccParamsSearchVORowImpl) getTransAccParamsSearchVO1().getCurrentRow();
            if(searchRow != null && searchRow.getTransBuId() != null && searchRow.getTransDivision() != null ){
                
                    DivisionAccountMapVORowImpl newRow =
                    (DivisionAccountMapVORowImpl) getDivisionAccountMapVO1().createRow();                    
                    
                    getDivisionAccountMapVO1().insertRow(newRow);
                    newRow.setBuId(searchRow.getTransBuId());
                    newRow.setDivFlexValueId(searchRow.getTransDivFlexValueId());
                    newRow.setDivision(searchRow.getTransDivision());
                
                }
            else if(searchRow.getTransBuId() == null){
                message = "Please select Business Unit to add InterDivision Accounts Mapping";
            }
            else if(searchRow.getTransDivision() == null){
                message = "Please select Division to add InterDivision Accounts Mapping";
            }
            
            
        }catch (Exception e) {
            message = e.getMessage();
            e.printStackTrace();
        }
        return message;
    }
    
    public String startDateDivisonAccMap(){
        String message = "Success";
        oracle.jbo.domain.Date previousEndDate = null;
        try {
            TransAccParamsSearchVORowImpl searchRow =
                (TransAccParamsSearchVORowImpl) getTransAccParamsSearchVO1().getCurrentRow();
            if(searchRow != null){
                DivisionAccountMapVORowImpl currRow =
                    (DivisionAccountMapVORowImpl) getDivisionAccountMapVO1().getCurrentRow();
                if(currRow != null && currRow.getBuId()!= null){
                    getDivisionAccountMapValidateVO1().setApplyViewCriteriaName(null);
                    getDivisionAccountMapValidateVO1().executeQuery();
                    
                    getDivisionAccountMapValidateVO1().setNamedWhereClauseParam("p_bu_id", currRow.getBuId());
                    getDivisionAccountMapValidateVO1().setNamedWhereClauseParam("p_event_type", currRow.getEventType());
                    getDivisionAccountMapValidateVO1().setNamedWhereClauseParam("p_debit_credit", currRow.getDebitCredit());
                    getDivisionAccountMapValidateVO1().setNamedWhereClauseParam("p_mapping_id", currRow.getMappingId());
                    
                    getDivisionAccountMapValidateVO1().setApplyViewCriteriaName("DivisionAccountMapValidateVOCriteria");
                    getDivisionAccountMapValidateVO1().setOrderByClause("XxadsDivisionAccountMapEO.END_DATE desc");
                    getDivisionAccountMapValidateVO1().executeQuery();
                    
                    
                    DivisionAccountMapValidateVORowImpl previousRow =
                        (DivisionAccountMapValidateVORowImpl) getDivisionAccountMapValidateVO1().first();
                    if(previousRow != null && previousRow.getEndDate() != null){
                        previousEndDate = new oracle.jbo.domain.Date(previousRow.getEndDate());
                    }
                    
                    if(currRow.getStartDate() != null){
                        RowSetIterator filteredRows = getDivisionAccountMapValidateVO1().createRowSetIterator(null);
                                            
                        while(filteredRows.hasNext()){
                            DivisionAccountMapValidateVORowImpl currFilRow = (DivisionAccountMapValidateVORowImpl)filteredRows.next();
                            if(currFilRow.getStartDate().compareTo(currRow.getStartDate()) > 0){
                                if(currRow.getEndDate() == null){
                                    return "Enter End Date which is less than "+currFilRow.getStartDate();
                                }
                                else if(currFilRow.getStartDate().compareTo(currRow.getEndDate())<=0){
                                   currRow.setEndDate(null);
                                   return "Event Type is already defined for "+ currRow.getEventType()+" for the given dates range";
                               }
                            }
                            else if(currFilRow.getStartDate().compareTo(currRow.getStartDate()) < 0){
                                if(currFilRow.getEndDate() == null){
                                    currRow.setStartDate(null);
                                    return "Event Type is already defined for "+ currRow.getEventType()+" for the given dates range";
                                }
                                else if(currRow.getStartDate().compareTo(currFilRow.getEndDate()) <= 0){
                                    currRow.setStartDate(null);
                                    currRow.setEndDate(null);
                                    return "Event Type is already defined for "+ currRow.getEventType()+" for the given dates range";
                                }
                            }
                            else{
                                currRow.setStartDate(null); 
                                return "Event Type is already defined for "+ currRow.getEventType()+" for the given dates range";
                            }
                        }
                    }
                    if(previousEndDate != null){
                        currRow.setStartDate((Date) new oracle.jbo.domain.Date(previousEndDate)
                                                 .addJulianDays(1, 0));
                        //currRow.setTransEffFromDateEditFlag("N");
                    }
                    
                   
                }
            }
        }catch (Exception e) {
            message = e.getMessage();
            e.printStackTrace();
        }
        return message;
    }

    /**
     * Container's getter for DivisionAccountMapValidateVO1.
     * @return DivisionAccountMapValidateVO1
     */
    public DivisionAccountMapValidateVOImpl getDivisionAccountMapValidateVO1() {
        return (DivisionAccountMapValidateVOImpl) findViewObject("DivisionAccountMapValidateVO1");
    }
    
    public String endDateDivAccMap(){
        String message = "Success";
        try {
            DivisionAccountMapVORowImpl currRow =
                (DivisionAccountMapVORowImpl) getDivisionAccountMapVO1().getCurrentRow();
            if(currRow != null && currRow.getEndDate() != null){
                java.sql.Timestamp datetime = new java.sql.Timestamp(System.currentTimeMillis());
                oracle.jbo.domain.Date currDate = new  oracle.jbo.domain.Date(datetime);
                
                if(currDate.compareTo(currRow.getEndDate()) > 0){
                    currRow.setEndDate(null);
                    message = "Effective To should be only be after Current Date";
                }
            }
        }catch (Exception e) {
            message = e.getMessage();
            e.printStackTrace();
        }
        return message;
    }
    
    public String saveStartDateDivisonAccMap(){
        String message = "Success";
        oracle.jbo.domain.Date previousEndDate = null;
        try {
            TransAccParamsSearchVORowImpl searchRow =
                (TransAccParamsSearchVORowImpl) getTransAccParamsSearchVO1().getCurrentRow();
            if(searchRow != null){
                DivisionAccountMapVORowImpl currRow =
                    (DivisionAccountMapVORowImpl) getDivisionAccountMapVO1().getCurrentRow();
            if(currRow != null && currRow.getBuId()!= null){
                if(currRow.getEntity(0).getEntityState() == 0 || currRow.getEntity(0).getEntityState() == 2)
                 {
                     {
                    getDivisionAccountMapValidateVO1().setApplyViewCriteriaName(null);
                    getDivisionAccountMapValidateVO1().executeQuery();
                    
                    getDivisionAccountMapValidateVO1().setNamedWhereClauseParam("p_bu_id", currRow.getBuId());
                    getDivisionAccountMapValidateVO1().setNamedWhereClauseParam("p_event_type", currRow.getEventType());
                    getDivisionAccountMapValidateVO1().setNamedWhereClauseParam("p_debit_credit", currRow.getDebitCredit());
                    getDivisionAccountMapValidateVO1().setNamedWhereClauseParam("p_mapping_id", currRow.getMappingId());
                    
                    getDivisionAccountMapValidateVO1().setApplyViewCriteriaName("DivisionAccountMapValidateVOCriteria");
                    getDivisionAccountMapValidateVO1().setOrderByClause("XxadsDivisionAccountMapEO.END_DATE desc");
                    getDivisionAccountMapValidateVO1().executeQuery();
                    
                    
                    DivisionAccountMapValidateVORowImpl previousRow =
                        (DivisionAccountMapValidateVORowImpl) getDivisionAccountMapValidateVO1().first();
                    if(previousRow != null && previousRow.getEndDate() != null){
                        previousEndDate = new oracle.jbo.domain.Date(previousRow.getEndDate());
                    }
                    
                    if(currRow.getStartDate() != null){
                        RowSetIterator filteredRows = getDivisionAccountMapValidateVO1().createRowSetIterator(null);
                                            
                        while(filteredRows.hasNext()){
                            DivisionAccountMapValidateVORowImpl currFilRow = (DivisionAccountMapValidateVORowImpl)filteredRows.next();
                            if(currFilRow.getStartDate().compareTo(currRow.getStartDate()) > 0){
                                if(currRow.getEndDate() == null){
                                    return "Enter End Date which is less than "+currFilRow.getStartDate();
                                }
                                else if(currFilRow.getStartDate().compareTo(currRow.getEndDate())<=0){
                                   return "Event Type is already defined for "+ currRow.getEventType()+" for the given dates range";
                               }
                            }
                            else if(currFilRow.getStartDate().compareTo(currRow.getStartDate()) < 0){
                                if(currFilRow.getEndDate() == null){
                                    return "Event Type is already defined for "+ currRow.getEventType()+" for the given dates range";
                                }
                                else if(currRow.getStartDate().compareTo(currFilRow.getEndDate()) <= 0){
                                    return "Event Type is already defined for "+ currRow.getEventType()+" for the given dates range";
                                }
                            }
                            else{
                               return "Event Type is already defined for "+ currRow.getEventType()+" for the given dates range";
                            }
                        }
                    }
                    if(previousEndDate != null){
                        currRow.setStartDate((Date) new oracle.jbo.domain.Date(previousEndDate)
                                                 .addJulianDays(1, 0));
                        //currRow.setTransEffFromDateEditFlag("N");
                    }
                    
                } 
                }
            }
            }
        }catch (Exception e) {
            message = e.getMessage();
            e.printStackTrace();
        }
        return message;
    }

    /**
     * Container's getter for TransHiringBasisSearchVO1.
     * @return TransHiringBasisSearchVO1
     */
    public TransHiringBasisSearchVOImpl getTransHiringBasisSearchVO1() {
        return (TransHiringBasisSearchVOImpl) findViewObject("TransHiringBasisSearchVO1");
    }

    /**
     * Container's getter for HiringBasisValidateVO1.
     * @return HiringBasisValidateVO1
     */
    public HiringBasisValidateVOImpl getHiringBasisValidateVO1() {
        return (HiringBasisValidateVOImpl) findViewObject("HiringBasisValidateVO1");
    }
    
    public String TemplateSearchBuChange(){
        String message = "Success";
        try {
            TransTemplateVORowImpl currRow = (TransTemplateVORowImpl) getTransTemplateVO1().getCurrentRow();
            if(currRow != null){
                currRow.setTransDivision(null);
                //currRow.setTransDivSegment(null);
                }
        }catch (Exception e) {
            message = e.getMessage();
            e.printStackTrace();
        }
        return message;
    }
    
    
    public String templateBuChange(){
        String message = "Success";
        try {
            TermsCondsTemplateVORowImpl currRow = (TermsCondsTemplateVORowImpl) getTermsCondsTemplateVO1().getCurrentRow();
            if(currRow != null){
                currRow.setDivision(null);
                currRow.setDivFlexValueId(null);
                currRow.setTemplateName(null);
                currRow.setTemplateInfo(null);
                currRow.setActiveFlag(null);}
        }catch (Exception e) {
            e.printStackTrace();
            message = e.getMessage();
        }
        return message;
    }
    
//------------------------------------Added By Manoj -------------------------------------------    
   
    public String createTransDocumentSeqSearch(){
        String message = "Success";
        try {
            getTransDocumentSeqSearchVO1().executeQuery();
            TransDocumentSeqSearchVORowImpl searchRow =
                (TransDocumentSeqSearchVORowImpl) getTransDocumentSeqSearchVO1().first();
            if(searchRow != null){
                searchRow.remove();
            }
            searchRow = (TransDocumentSeqSearchVORowImpl) getTransDocumentSeqSearchVO1().createRow();
            getTransDocumentSeqSearchVO1().insertRow(searchRow);
            ADFContext.getCurrent().getPageFlowScope().put("isDocumentSequenceChanged","N");
            
            getDocumentSequenceVO2().setApplyViewCriteriaName("DocumentSequenceVOCriteria1");
            getDocumentSequenceVO2().setNamedWhereClauseParam("p_bu_id",null);
            getDocumentSequenceVO2().executeQuery();
        }catch (Exception e) {
            e.printStackTrace();
            message = e.getMessage();
        }
        return message;
    }
    
    public String dsSearchBuChange(){
        String message = "Success";
        try {
            TransDocumentSeqSearchVORowImpl searchRow =
                (TransDocumentSeqSearchVORowImpl) getTransDocumentSeqSearchVO1().getCurrentRow();
            if(searchRow != null){
                if(!"Y".equals(searchRow.getTransSrcDivRequired())){
                    getDocumentSequenceVO2().setApplyViewCriteriaName(null);
                    getDocumentSequenceVO2().executeQuery();
                    getDocumentSequenceVO2().setApplyViewCriteriaName("DocumentSequenceVOCriteria1");
                    getDocumentSequenceVO2().setNamedWhereClauseParam("p_bu_id", searchRow.getTransSrcBuId());
                    getDocumentSequenceVO2().executeQuery();                
                }else{
                    searchRow.setTransDivision(null);
                    searchRow.setTransDivFlexValueId(null);
                }
            }
        }catch (Exception e) {
            e.printStackTrace();
            message = e.getMessage();
        }
        return message;
    }    
    
    public String dsSearchDivChange(){
        String message = "Success";
        try {
            TransDocumentSeqSearchVORowImpl searchRow =
                (TransDocumentSeqSearchVORowImpl) getTransDocumentSeqSearchVO1().getCurrentRow();
            if(searchRow != null){
                if("Y".equals(searchRow.getTransSrcDivRequired())){
                    getDocumentSequenceVO2().setApplyViewCriteriaName(null);
                    getDocumentSequenceVO2().executeQuery();
                    getDocumentSequenceVO2().setApplyViewCriteriaName("DocumentSequenceVOCriteria");
                    getDocumentSequenceVO2().setNamedWhereClauseParam("p_bu_id", searchRow.getTransSrcBuId());
                    getDocumentSequenceVO2().setNamedWhereClauseParam("p_div_flex_val_id", searchRow.getTransDivFlexValueId());
                    getDocumentSequenceVO2().executeQuery();
                }
            }
        }catch (Exception e) {
            e.printStackTrace();
            message = e.getMessage();
        }
        return message;
    }
    
    public String createDocumentSequence(){
        String message = "Success";
        try {
            TransDocumentSeqSearchVORowImpl searchRow =
                (TransDocumentSeqSearchVORowImpl) getTransDocumentSeqSearchVO1().getCurrentRow();
            if(searchRow != null && searchRow.getTransSrcBuId() != null){
                if("Y".equals(searchRow.getTransSrcDivRequired()) && searchRow.getTransDivision() == null){
                    return "Please provide Division to add Document";
                }else{
                    DocumentSequenceVOImpl hiringVO = getDocumentSequenceVO2();
                    DocumentSequenceVORowImpl newRow = (DocumentSequenceVORowImpl) hiringVO.createRow();
                    hiringVO.insertRow(newRow);
                    newRow.setBuId(searchRow.getTransSrcBuId());
                    newRow.setDivision(searchRow.getTransDivision());
                    newRow.setDivFlexValueId(searchRow.getTransDivFlexValueId());                                         
                }
            }else{
                return "Please provide Business Unit to add Document";
            }
        }catch (Exception e) {
            message = e.getMessage();
            e.printStackTrace();
        }
        return message;
    }
    
    
    public String validateSeqenceDates()
    {
        String message = "Success";
        oracle.jbo.domain.Date previousEndDate = null; 
        int count = 0;
        try 
        {
            TransDocumentSeqSearchVORowImpl searchRow =
                (TransDocumentSeqSearchVORowImpl) getTransDocumentSeqSearchVO1().getCurrentRow();
            if(searchRow != null){
                DocumentSequenceVORowImpl currRow = (DocumentSequenceVORowImpl) getDocumentSequenceVO2().getCurrentRow();
                if(currRow != null && currRow.getDocumentCode()!= null && currRow.getBuId() != null && currRow.getDivisionCode()!= null){
                    getDocumentSequenceValidateVO1().setApplyViewCriteriaName(null);
                    getDocumentSequenceValidateVO1().executeQuery();
                    
                    getDocumentSequenceValidateVO1().setNamedWhereClauseParam("p_bu_id", currRow.getBuId());
                    getDocumentSequenceValidateVO1().setNamedWhereClauseParam("p_doc_code", currRow.getDocumentCode());
                    getDocumentSequenceValidateVO1().setNamedWhereClauseParam("p_doc_seq_id", currRow.getDocSequenceId());
                    getDocumentSequenceValidateVO1().setApplyViewCriteriaName("DocumentSequenceValidateVOCriteria2");
                    getDocumentSequenceValidateVO1().setOrderByClause("XxadsDocumentSequenceEO.EFFECTIVE_TO desc");
                    getDocumentSequenceValidateVO1().executeQuery();
                    
                    previousEndDate = null; 
                    RowSetIterator rs = getDocumentSequenceValidateVO1().createRowSetIterator(null);
                    while(rs.hasNext()){
                        DocumentSequenceValidateVORowImpl previousRow =
                            (DocumentSequenceValidateVORowImpl) rs.next();
                        if(previousRow != null && (("Y".equals(searchRow.getTransSrcDivRequired()) && currRow.getDivision().equals(previousRow.getDivision())) 
                                                   || ("N".equals(searchRow.getTransSrcDivRequired())))){
                            if(previousRow.getEffectiveTo() != null && (previousEndDate == null || ( previousEndDate!= null && previousEndDate.compareTo(previousRow.getEffectiveTo()) < 0))){
                                previousEndDate = new oracle.jbo.domain.Date(previousRow.getEffectiveTo());
                            }
                        }
                    }
                    
                    
                    if(currRow.getEffectiveFrom() != null){
                        RowSetIterator filteredRows = getDocumentSequenceValidateVO1().createRowSetIterator(null);
                                            
                        while(filteredRows.hasNext()){
                            DocumentSequenceValidateVORowImpl currFilRow = (DocumentSequenceValidateVORowImpl)filteredRows.next();
                            if(currFilRow != null && (("Y".equals(searchRow.getTransSrcDivRequired()) && currRow.getDivision().equals(currFilRow.getDivision())) 
                                                       || ("N".equals(searchRow.getTransSrcDivRequired())))){
                                if(currFilRow.getEffectiveFrom().compareTo(currRow.getEffectiveFrom()) > 0){
                                    if(currRow.getEffectiveTo() == null){
                                        count = 1;
                                    }
                                    else if(currFilRow.getEffectiveFrom().compareTo(currRow.getEffectiveTo())<=0){
                                       count = 1;
                                   }
                                }
                                else if(currFilRow.getEffectiveFrom().compareTo(currRow.getEffectiveFrom()) < 0){
                                    if(currFilRow.getEffectiveTo() == null){
                                        count = 1;
                                    }
                                    else if(currRow.getEffectiveFrom().compareTo(currFilRow.getEffectiveTo()) <= 0){
                                        count = 2;
                                    }
                                }
                                else{
                                    count = 1;
                                }
                            }
                        }
                    }
                    if(count > 0){
                        if("Y".equals(searchRow.getTransSrcDivRequired())){
                            message = "Document sequence is already defined for "+currRow.getTransDocumentName()+" in Business Unit "+searchRow.getTransSrcBu()+", Division "+searchRow.getTransDivision();
                        }else{
                            message = "Document sequence is already defined for "+currRow.getTransDocumentName()+" in Business Unit "+searchRow.getTransSrcBu();
                        }

                        currRow.setEffectiveFrom(null);
                        currRow.setEffectiveTo(null);
                        
                    }
                    else
                    {
                        if(previousEndDate != null){
                            currRow.setEffectiveFrom ((Date) new oracle.jbo.domain.Date(previousEndDate)
                                                     .addJulianDays(1, 0));
                            currRow.setTransEffectiveFromEditFlag("N");
                        }
                        
                        if(currRow.getEffectiveTo() != null){
                            java.sql.Timestamp datetime = new java.sql.Timestamp(System.currentTimeMillis());
                            oracle.jbo.domain.Date currDate = new  oracle.jbo.domain.Date(datetime);
                            
                            if(currDate.compareTo(currRow.getEffectiveTo()) < 0){
                                currRow.setEffectiveTo(null);
                                message = "Effective To should be only on or before Current Date";
                            }
                        }
                    }
                }
            }
        }
        catch(Exception e) 
        {
            e.printStackTrace();
            return e.getMessage();
        }
        return message;
    }
    
    
    public String saveDocumentSequence(){
        String message = null;
        oracle.jbo.domain.Date previousEndDate = null; 
        int count = 0;
        try 
        {
            TransDocumentSeqSearchVORowImpl searchRow =
                (TransDocumentSeqSearchVORowImpl) getTransDocumentSeqSearchVO1().getCurrentRow();
            if(searchRow != null){
                RowSetIterator docItr  = getDocumentSequenceVO2().createRowSetIterator(null);
                while(docItr.hasNext())
                {
                    DocumentSequenceVORowImpl currRow = (DocumentSequenceVORowImpl) docItr.next();
                    if( currRow.getEntity(0).getEntityState() == 0)
                    {
                        if(currRow != null && currRow.getDocumentCode()!= null && currRow.getBuId() != null){
                            getDocumentSequenceValidateVO1().setApplyViewCriteriaName(null);
                            getDocumentSequenceValidateVO1().executeQuery();
                            
                            getDocumentSequenceValidateVO1().setNamedWhereClauseParam("p_bu_id", currRow.getBuId());
                            getDocumentSequenceValidateVO1().setNamedWhereClauseParam("p_doc_code", currRow.getDocumentCode());
                            getDocumentSequenceValidateVO1().setNamedWhereClauseParam("p_doc_seq_id", currRow.getDocSequenceId());
        
                            getDocumentSequenceValidateVO1().setApplyViewCriteriaName("DocumentSequenceValidateVOCriteria2");
                            getDocumentSequenceValidateVO1().setOrderByClause("XxadsDocumentSequenceEO.EFFECTIVE_TO desc");
                            getDocumentSequenceValidateVO1().executeQuery();
                            
                            previousEndDate = null; 
                            RowSetIterator rs = getDocumentSequenceValidateVO1().createRowSetIterator(null);
                            while(rs.hasNext()){
                                DocumentSequenceValidateVORowImpl previousRow =
                                    (DocumentSequenceValidateVORowImpl) rs.next();
                                if(previousRow != null && (("Y".equals(searchRow.getTransSrcDivRequired()) && currRow.getDivision().equals(previousRow.getDivision())) 
                                                           || ("N".equals(searchRow.getTransSrcDivRequired())))){
                                    if(previousRow.getEffectiveTo() != null && (previousEndDate == null || ( previousEndDate!= null && previousEndDate.compareTo(previousRow.getEffectiveTo()) < 0))){
                                        previousEndDate = new oracle.jbo.domain.Date(previousRow.getEffectiveTo());
                                    }
                                }
                            }
                            
                            
                            if(currRow.getEffectiveFrom() != null){
                                RowSetIterator filteredRows = getDocumentSequenceValidateVO1().createRowSetIterator(null);
                                                    
                                while(filteredRows.hasNext()){
                                    DocumentSequenceValidateVORowImpl currFilRow = (DocumentSequenceValidateVORowImpl)filteredRows.next();
                                    if(currFilRow != null && (("Y".equals(searchRow.getTransSrcDivRequired()) && currRow.getDivision().equals(currFilRow.getDivision())) 
                                                               || ("N".equals(searchRow.getTransSrcDivRequired())))){
                                        if(currFilRow.getEffectiveFrom().compareTo(currRow.getEffectiveFrom()) > 0){
                                            if(currRow.getEffectiveTo() == null){
                                                count = 1;
                                            }
                                            else if(currFilRow.getEffectiveFrom().compareTo(currRow.getEffectiveTo())<=0){
                                               count = 1;
                                           }
                                        }
                                        else if(currFilRow.getEffectiveFrom().compareTo(currRow.getEffectiveFrom()) < 0){
                                            if(currFilRow.getEffectiveTo() == null){
                                                count = 1;
                                            }
                                            else if(currRow.getEffectiveFrom().compareTo(currFilRow.getEffectiveTo()) <= 0){
                                                count = 2;
                                            }
                                        }
                                        else{
                                            count = 1;
                                        }
                                    }
                                }
                            }
                            if(count > 0){
                                if("Y".equals(searchRow.getTransSrcDivRequired())){
                                    message = "Document sequence is already defined for "+currRow.getTransDocumentName()+" in Business Unit "+searchRow.getTransSrcBu()+", Division "+searchRow.getTransDivision();
                                }else{
                                    message = "Document sequence is already defined for "+currRow.getTransDocumentName()+" in Business Unit "+searchRow.getTransSrcBu();
                                }
                                currRow.setDocumentCode(null);
                                currRow.setTransDocumentName(null);
                                currRow.setEffectiveFrom(null);
                                currRow.setEffectiveTo(null);
                                
                            }
                            else if(getDocumentSequenceValidateVO1().getRowCount() > 0)
                            {
                                if(previousEndDate != null){
                                    currRow.setEffectiveFrom ((Date) new oracle.jbo.domain.Date(previousEndDate)
                                                             .addJulianDays(1, 0));
                                    currRow.setTransEffectiveFromEditFlag("N");
                                }
                                
                                if(currRow.getEffectiveTo() != null){
                                    java.sql.Timestamp datetime = new java.sql.Timestamp(System.currentTimeMillis());
                                    oracle.jbo.domain.Date currDate = new  oracle.jbo.domain.Date(datetime);
                                    
                                    if(currDate.compareTo(currRow.getEffectiveTo()) < 0){
                                        currRow.setEffectiveTo(null);
                                        message = "Effective To should be only on or before Current Date";
                                    }
                                }
                            }
                        }
                    }
                }
            }
            
            if(message == null) 
            {
                message = "Success";    
            }
        }
        catch(Exception e) 
        {
            e.printStackTrace();
            return e.getMessage();
        }
        return message;
    }
    
    public String deleteDocumentSeq() 
    {
        String msg = "Success";
        try 
        {
            DocumentSequenceVORowImpl currRow = (DocumentSequenceVORowImpl) getDocumentSequenceVO2().getCurrentRow();
            if(currRow!=null && currRow.getEntity(0).getEntityState() == 0)
            {
                currRow.remove();
            }
            else 
            {
                return "Saved record cannot be deleted.";    
            }
        }
        catch(Exception e) 
        {
            e.printStackTrace();
            return e.getMessage();
        }
        return msg;
    }


    public String validateDocumentSeq() 
    {   
        String msg = "Success";
        oracle.jbo.domain.Date previousEndDate = null; 
        TransDocumentSeqSearchVORowImpl searchRow =
            (TransDocumentSeqSearchVORowImpl) getTransDocumentSeqSearchVO1().getCurrentRow();
        try
        {
            DocumentSequenceVORowImpl currRow = (DocumentSequenceVORowImpl) getDocumentSequenceVO2().getCurrentRow();
            
            if(currRow.getDocumentCode() != null && currRow.getDivisionCode() != null){
                getDocumentSequenceValidateVO1().setApplyViewCriteriaName(null);
                getDocumentSequenceValidateVO1().executeQuery();
                
                getDocumentSequenceValidateVO1().setNamedWhereClauseParam("p_bu_id", currRow.getBuId());
                getDocumentSequenceValidateVO1().setNamedWhereClauseParam("p_doc_code", currRow.getDocumentCode());
                getDocumentSequenceValidateVO1().setNamedWhereClauseParam("p_doc_seq_id", currRow.getDocSequenceId());
                getDocumentSequenceValidateVO1().setNamedWhereClauseParam("p_div_code", currRow.getDivisionCode());
    
                getDocumentSequenceValidateVO1().setApplyViewCriteriaName("DocumentSequenceValidateVOCriteria1");
                getDocumentSequenceValidateVO1().setOrderByClause("XxadsDocumentSequenceEO.EFFECTIVE_TO desc");
                getDocumentSequenceValidateVO1().executeQuery();
                
                previousEndDate = null; 
                RowSetIterator rs = getDocumentSequenceValidateVO1().createRowSetIterator(null);
                while(rs.hasNext()){
                    DocumentSequenceValidateVORowImpl previousRow =
                        (DocumentSequenceValidateVORowImpl) rs.next();
                    if(previousRow != null && (("Y".equals(searchRow.getTransSrcDivRequired()) && currRow.getDivision().equals(previousRow.getDivision())) 
                                               || ("N".equals(searchRow.getTransSrcDivRequired())))){
                        if(previousRow.getEffectiveTo() != null && previousEndDate.compareTo(previousRow.getEffectiveTo()) < 0){
                            previousEndDate = new oracle.jbo.domain.Date(previousRow.getEffectiveTo());
                        }else if(previousRow.getEffectiveTo() == null){
                            if("Y".equals(searchRow.getTransSrcDivRequired())){
                                msg = "Document sequence is already defined with Division Code "+currRow.getTransDivisionCode()+" for "+currRow.getTransDocumentName()+" in Business Unit "+searchRow.getTransSrcBu()+", Division "+searchRow.getTransDivision();
                            }else{
                                msg = "Document sequence is already defined with Division Code "+currRow.getTransDivisionCode()+" for "+currRow.getTransDocumentName()+" in Business Unit "+searchRow.getTransSrcBu();
                            }
                            currRow.setTransDivisionCode(null);
                            currRow.setDivisionCode(null);
                            return msg;
                        }
                    }
                }
            }
            
            if(currRow.getDocumentCode() != null){
                getDocumentSequenceValidateVO1().setApplyViewCriteriaName(null);
                getDocumentSequenceValidateVO1().executeQuery();
                
                getDocumentSequenceValidateVO1().setNamedWhereClauseParam("p_bu_id", currRow.getBuId());
                getDocumentSequenceValidateVO1().setNamedWhereClauseParam("p_doc_code", currRow.getDocumentCode());
                getDocumentSequenceValidateVO1().setNamedWhereClauseParam("p_doc_seq_id", currRow.getDocSequenceId());
            
                getDocumentSequenceValidateVO1().setApplyViewCriteriaName("DocumentSequenceValidateVOCriteria2");
                getDocumentSequenceValidateVO1().setOrderByClause("XxadsDocumentSequenceEO.EFFECTIVE_TO desc");
                getDocumentSequenceValidateVO1().executeQuery();
                
                previousEndDate = null; 
                RowSetIterator rs = getDocumentSequenceValidateVO1().createRowSetIterator(null);
                while(rs.hasNext()){
                    DocumentSequenceValidateVORowImpl previousRow =
                        (DocumentSequenceValidateVORowImpl) rs.next();
                    if(previousRow != null && (("Y".equals(searchRow.getTransSrcDivRequired()) && currRow.getDivision().equals(previousRow.getDivision())) 
                                               || ("N".equals(searchRow.getTransSrcDivRequired())))){
                        if(previousRow.getEffectiveTo() != null && (previousEndDate == null || ( previousEndDate!= null && previousEndDate.compareTo(previousRow.getEffectiveTo()) < 0))){
                            previousEndDate = new oracle.jbo.domain.Date(previousRow.getEffectiveTo());
                        }else if(previousRow.getEffectiveTo() == null){
                            if("Y".equals(searchRow.getTransSrcDivRequired())){
                                msg = "Document sequence is already defined for "+currRow.getTransDocumentName()+" in Business Unit "+searchRow.getTransSrcBu()+", Division "+searchRow.getTransDivision();
                            }else{
                                msg = "Document sequence is already defined for "+currRow.getTransDocumentName()+" in Business Unit "+searchRow.getTransSrcBu();
                            }
                            currRow.setTransDocumentName(null);
                            currRow.setDocumentCode(null);
                            return msg;
                        }
                    }
                }
            }
                        
            if(getDocumentSequenceValidateVO1().getRowCount() == 0)
            {
                Date d=new Date();
                currRow.setEffectiveFrom((Date)d.getCurrentDate());
            }else if(previousEndDate != null)
            {
                currRow.setEffectiveFrom((Date) new oracle.jbo.domain.Date(previousEndDate)
                                         .addJulianDays(1, 0));
                currRow.setTransEffectiveFromEditFlag("N");
            }
        }
        catch(Exception e) 
        {
            e.printStackTrace();
            return e.getMessage();
        }
        return msg;
    } 
    
    
    public String updateCurrSeq()
    {
        String msg = "Success";
        try 
        {
            DocumentSequenceVORowImpl currRow = (DocumentSequenceVORowImpl) getDocumentSequenceVO2().getCurrentRow();
            if(currRow.getStartingSeqNum() != null  &&  currRow.getStartingSeqNum().compareTo(0) < 0) {
                currRow.setStartingSeqNum(null);
                currRow.setCurrentSeqNum(null);
                return "Starting Sequence number should be greater than 0";
            }
            else if(currRow.getStartingSeqNum() != null)
            {
                currRow.setCurrentSeqNum(currRow.getStartingSeqNum());    
            }
        }
        catch(Exception e) 
        {
            e.printStackTrace();
            return e.getMessage();
        }
        return msg;
    }
    /**
     * Container's getter for TransDocumentSeqSearchVO1.
     * @return TransDocumentSeqSearchVO1
     */
    public TransDocumentSeqSearchVOImpl getTransDocumentSeqSearchVO1() {
        return (TransDocumentSeqSearchVOImpl) findViewObject("TransDocumentSeqSearchVO1");
    }

    /**
     * Container's getter for DocumentSequenceVO2.
     * @return DocumentSequenceVO2
     */
    public DocumentSequenceVOImpl getDocumentSequenceVO2() {
        return (DocumentSequenceVOImpl) findViewObject("DocumentSequenceVO2");
    }
    
//------------------------------------------Added By Manoj ---------------------------------------    
}
