package model.applicationModule;

import java.sql.CallableStatement;

import java.sql.SQLException;

import java.util.HashMap;
import java.util.Map;
import java.sql.Types;

import model.applicationModule.common.ApprovalAM;

import oracle.adf.share.ADFContext;
import oracle.jbo.domain.Number;
import oracle.jbo.server.ApplicationModuleImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Wed Jan 18 10:13:24 IST 2023
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class ApprovalAMImpl extends ApplicationModuleImpl implements ApprovalAM {
    /**
     * This is the default constructor (do not remove).
     */
    public ApprovalAMImpl() {
    }
    private final String IS_EMPLOYEE_FINAL_APPROVER =
         "begin :1 := xxame_pkg.is_employee_final_approver(:2,:3,:4); end;";

    /**
     * Container's getter for CommonAM1.
     * @return CommonAM1
     */
    public ApplicationModuleImpl getCommonAM1() {
        return (ApplicationModuleImpl) findApplicationModule("CommonAM1");
    }
    
    public String approvalUser(){
            String message = "Success";
            try {
                Map sessionScope = ADFContext.getCurrent().getSessionScope();
                Map userMap = new HashMap();
                userMap.put("UserName", " ");
                userMap.put("UserId", "-5");
                userMap.put("personId", "");
                sessionScope.put("userMap", userMap);
            } catch (Exception e) {
                e.printStackTrace();
                message = e.getMessage();
            }
            return message;
        }
    
    public String callpkgForAMEProcess(Map paramsMap) 
    {
            CommonAMImpl commonAM = (CommonAMImpl)getCommonAM1();
            return commonAM.callAMEProcess(paramsMap); //from common am
        }
    
    public Boolean isEmployeeAFinalApproverNew(Map paramsMap) {   

        Boolean isFinalAppr = null;
        
        try {
            CallableStatement st =
                getDBTransaction().createCallableStatement(IS_EMPLOYEE_FINAL_APPROVER,
                                                           0);
            st.registerOutParameter(1, Types.NUMERIC);
            st.setLong(2,new Number(paramsMap.get("docId").toString()).longValue());
            st.setLong(3,new Number(paramsMap.get("docTypeId").toString()).longValue());
            st.setLong(4,new Number(paramsMap.get("currEmpId").toString()).longValue());
            st.execute();
            int apprLev = st.getInt(1);
            if (1 == apprLev) {
                isFinalAppr = true;
            } else {
                isFinalAppr = false;
            }

        System.out.println(isFinalAppr);

        } catch (SQLException e) {
         e.printStackTrace();
        }
        return isFinalAppr;
    }
     
    
}

