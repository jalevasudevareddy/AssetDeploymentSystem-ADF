package bean;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.el.ELContext;
import javax.el.ExpressionFactory;
import javax.el.ValueExpression;

import javax.faces.application.Application;
import javax.faces.context.FacesContext;

import oracle.adf.share.ADFContext;
import oracle.adf.share.logging.ADFLogger;
import java.io.ByteArrayOutputStream;
import javax.xml.namespace.QName;
import javax.xml.soap.SOAPMessage;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.Dispatch;
import javax.xml.ws.Service;
import java.util.List;
import javax.xml.soap.SOAPBody;
import javax.xml.soap.SOAPBodyElement;
import javax.xml.soap.SOAPHeader;
import javax.xml.ws.soap.SOAPBinding;
import javax.xml.soap.MessageFactory;
import oracle.adf.share.ADFContext;
import oracle.adf.view.rich.component.rich.output.RichOutputText;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class JWTConfigBean {
    
    private ADFLogger logger;
    private String isValidated = "Y";
    Map<String, String> pHeader;
    private RichOutputText notificationCount;

    public JWTConfigBean() {
        super();
        logger = ADFLogger.createADFLogger(this.getClass());
    }
    public String loadJWTInfo() {

        HashMap jwtMap = (HashMap)getEL("#{pageFlowScope.JwtData}");
        pHeader = (Map<String, String>)new HashMap<String, String>();
        pHeader.put("fusionEndpointURL",
                    (String)jwtMap.get("fusionEndpointURL"));
        pHeader.put("fusionExtServiceEndPoint",
                    (String)jwtMap.get("fusionExtServiceEndPoint"));
        pHeader.put("fusionTxnManagerEndPoint",
                    (String)jwtMap.get("fusionTxnManagerEndPoint"));
        pHeader.put("fusionFetchSize", (String)jwtMap.get("fusionFetchSize"));
       setEL("#{pageFlowScope.fusionJWTTokenEndpoint}",
                                    jwtMap.get("fusionJWTTokenEndpoint"));
        
   
        pHeader.put("ameAppURL", (String)jwtMap.get("ameAppURL"));
        String jwt = (String) getEL("#{pageFlowScope.jwt}");

        if (jwt == null) {
            setIsValidated("N");
            return "InvalidJwt";

        }

        if (jwt != null) {
            setIsValidated("Y");
            pHeader.put("fusionJWTToken", jwt);
        }
       
        setEL("#{sessionScope.pHeader}", pHeader);
        return "Loaded";
    }


    public void loadUserInfo() {
        UserInfo uinfo = (UserInfo)getEL("#{sessionScope.jwtUserContext}");
        Map userMap = new HashMap();
        String userName = uinfo.getUserName();
        String userId = uinfo.getUserId();
        String userBuId = uinfo.getBusinessUnitId();
        String personId = uinfo.getPersonId();
        String userFullName =
            uinfo.getFirstName() + (uinfo.getMiddleNames() != null ?
                                    " " + uinfo.getMiddleNames() : "") +
            (uinfo.getLastName() != null ? " " + uinfo.getLastName() : "");


        if (userId != null) {
            userMap.put("UserName", userName);
            userMap.put("UserId", userId);
            userMap.put("userBuId", userBuId);
            userMap.put("personId", personId);
            userMap.put("userFullName", userFullName);
        } else {
            userName = "Consultant";    
            userId = "-1";
            userMap.put("UserName", "Consultant");
            userMap.put("UserId", "-1");
            userMap.put("personId", "-1");
        }
        setEL("#{sessionScope.userMap}", userMap);
                    setEL("#{sessionScope.UserName}", userName);
                    setEL("#{sessionScope.UserId}", userId);
                    System.out.println("User ID : " + userMap.get("UserId"));
        
    }

    private void setEL(String expression, Object newValue) {
        FacesContext facesContext = FacesContext.getCurrentInstance();
        Application app = facesContext.getApplication();
        ExpressionFactory elFactory = app.getExpressionFactory();
        ELContext elContext = facesContext.getELContext();
        ValueExpression valueExp =
            elFactory.createValueExpression(elContext, expression,
                                            Object.class);
        Class bindClass = valueExp.getType(elContext);
        if (bindClass.isPrimitive() || bindClass.isInstance(newValue)) {
            valueExp.setValue(elContext, newValue);
        }
    }

    private Object getEL(String expression) {
        FacesContext facesContext = FacesContext.getCurrentInstance();
        Application app = facesContext.getApplication();
        ExpressionFactory elFactory = app.getExpressionFactory();
        ELContext elContext = facesContext.getELContext();
        ValueExpression valueExp =
            elFactory.createValueExpression(elContext, expression,
                                            Object.class);
        return valueExp.getValue(elContext);
    }

    public void setIsValidated(String isValidated) {
        this.isValidated = isValidated;
    }

    public String getIsValidated() {
        return isValidated;
    }
//    //Added on 26-04-2022
//          static org.apache.log4j.Logger logger1 = Logger.getLogger(JWTConfigBean.class);
          
          private String getFirstChildNodeValue(Document doc, String namespaceURI, String namespaceLocalName)
          {
            String nodeValue = null;
            if (doc != null)
            {
              NodeList nlist = doc.getElementsByTagNameNS(namespaceURI, namespaceLocalName);
              if ((nlist != null) && (nlist.getLength() > 0) && (nlist.item(0).getChildNodes().getLength() > 0))
              {
                Node n = nlist.item(0).getFirstChild();
                if (n.getNodeValue() != null) {
                  nodeValue = nlist.item(0).getFirstChild().getNodeValue();
                }
              }
            }
            return nodeValue;
          }
       public String findSelfUserDetails(){

           String message = "Success";
           try{
           String jwt = (String) ADFContext.getCurrent()
                                           .getPageFlowScope()
                                           .get("jwt");
           String endPoint = (String) ADFContext.getCurrent()
                                                .getPageFlowScope()
                                                .get("fusionJWTTokenEndpoint");
           UserInfo currentUser = new UserInfo();
             QName serviceName = new QName("http://xmlns.oracle.com/apps/hcm/people/roles/userDetailsServiceV2/", "UserDetailsService");
                 
             QName portName = new QName("http://xmlns.oracle.com/apps/hcm/people/roles/userDetailsServiceV2/", "UserDetailsServiceSoapHttpPort");
             
             Service service = Service.create(serviceName);
             
             service.addPort(portName, "http://schemas.xmlsoap.org/wsdl/soap/http", endPoint);
             
             Dispatch<SOAPMessage> dispatch = service.createDispatch(portName, SOAPMessage.class, Service.Mode.MESSAGE);
             
             BindingProvider bp = dispatch;
             
           Map<String, Object> rc = bp.getRequestContext();
                 rc.put("javax.xml.ws.soap.http.soapaction.use", Boolean.TRUE);
                 rc.put("javax.xml.ws.soap.http.soapaction.uri", "http://xmlns.oracle.com/apps/hcm/people/roles/userDetailsServiceV2/findSelfUserDetails");
                 if ((jwt != null) && (jwt.length() > 0))
                 {
                   String authZParameterValue = "Bearer " + jwt;
                   
                   Map<String, List<String>> authMap = new HashMap();
                   List<String> authZList = new ArrayList();
                   authZList.add(authZParameterValue);
                   
                   authMap.put("Authorization", authZList);
                   rc.put("javax.xml.ws.http.request.headers", authMap);
                 }
                 else
                 {
                   rc.put("javax.xml.ws.security.auth.username", "hcm.n");
                   rc.put("javax.xml.ws.security.auth.password", "NalBFLT@789");
                 }
                 MessageFactory factory = ((SOAPBinding)bp.getBinding()).getMessageFactory();
                 
                 SOAPMessage request1 = factory.createMessage();
                 
                 SOAPHeader header = request1.getSOAPHeader();
                 
                 SOAPBody body = request1.getSOAPBody();
                 
                 QName payloadName = new QName("http://xmlns.oracle.com/apps/hcm/people/roles/userDetailsServiceV2/types/", "findSelfUserDetails", "typ");
                 
                 SOAPBodyElement payload = body.addBodyElement(payloadName);
                 
                 SOAPMessage reply = null;
                 Map<String, Object> req;
                 try
                 {
                   reply = (SOAPMessage)dispatch.invoke(request1);
                 }
                 catch (Exception wse)
                 {
                   wse.printStackTrace();
                   if ((wse.getMessage() != null) ) {
                     System.out.println("Unauthorized: User Token Invalid or Expired.");
                     return "Error";
                   }
                 }
               Document doc = reply.getSOAPBody().extractContentAsDocument();
               
               
               currentUser.setPersonId(getFirstChildNodeValue(doc, "http://xmlns.oracle.com/apps/hcm/people/roles/userDetailsServiceV2/", "PersonId"));
                     
                     currentUser.setPersonNumber(getFirstChildNodeValue(doc, "http://xmlns.oracle.com/apps/hcm/people/roles/userDetailsServiceV2/", "PersonNumber"));
                     
                     currentUser.setUserId(getFirstChildNodeValue(doc, "http://xmlns.oracle.com/apps/hcm/people/roles/userDetailsServiceV2/", "UserId"));
                     
                     currentUser.setUserName(getFirstChildNodeValue(doc, "http://xmlns.oracle.com/apps/hcm/people/roles/userDetailsServiceV2/", "Username"));
                     
                     currentUser.setUserGUID(getFirstChildNodeValue(doc, "http://xmlns.oracle.com/apps/hcm/people/roles/userDetailsServiceV2/", "UserGUID"));
                     
                     currentUser.setActiveFlag(getFirstChildNodeValue(doc, "http://xmlns.oracle.com/apps/hcm/people/roles/userDetailsServiceV2/", "ActiveFlag"));
                     
                     currentUser.setUserDistinguishedName(getFirstChildNodeValue(doc, "http://xmlns.oracle.com/apps/hcm/people/roles/userDetailsServiceV2/", "UserDistinguishedName"));
                     
                     currentUser.setTitle(getFirstChildNodeValue(doc, "http://xmlns.oracle.com/apps/hcm/people/roles/userDetailsServiceV2/", "Title"));
                     
                     currentUser.setLastName(getFirstChildNodeValue(doc, "http://xmlns.oracle.com/apps/hcm/people/roles/userDetailsServiceV2/", "LastName"));
                     
                     currentUser.setFirstName(getFirstChildNodeValue(doc, "http://xmlns.oracle.com/apps/hcm/people/roles/userDetailsServiceV2/", "FirstName"));
                     
                     currentUser.setMiddleNames(getFirstChildNodeValue(doc, "http://xmlns.oracle.com/apps/hcm/people/roles/userDetailsServiceV2/", "MiddleNames"));
                     
                     currentUser.setDisplayName(getFirstChildNodeValue(doc, "http://xmlns.oracle.com/apps/hcm/people/roles/userDetailsServiceV2/", "DisplayName"));
                     
                     currentUser.setSuffix(getFirstChildNodeValue(doc, "http://xmlns.oracle.com/apps/hcm/people/roles/userDetailsServiceV2/", "Suffix"));
                     
                     currentUser.setHonors(getFirstChildNodeValue(doc, "http://xmlns.oracle.com/apps/hcm/people/roles/userDetailsServiceV2/", "Honors"));
                     
                     currentUser.setPreNameAdjunct(getFirstChildNodeValue(doc, "http://xmlns.oracle.com/apps/hcm/people/roles/userDetailsServiceV2/", "PreNameAdjunct"));
                     
                     currentUser.setKnownAs(getFirstChildNodeValue(doc, "http://xmlns.oracle.com/apps/hcm/people/roles/userDetailsServiceV2/", "KnownAs"));
                     
                     currentUser.setEmailAddress(getFirstChildNodeValue(doc, "http://xmlns.oracle.com/apps/hcm/people/roles/userDetailsServiceV2/", "EmailAddress"));
                     
                     currentUser.setPhoneId(getFirstChildNodeValue(doc, "http://xmlns.oracle.com/apps/hcm/people/roles/userDetailsServiceV2/", "PhoneId"));
                     
                     currentUser.setPhoneAreaCode(getFirstChildNodeValue(doc, "http://xmlns.oracle.com/apps/hcm/people/roles/userDetailsServiceV2/", "PhoneAreaCode"));
                     
                     currentUser.setPhoneCountryCodeNumber(getFirstChildNodeValue(doc, "http://xmlns.oracle.com/apps/hcm/people/roles/userDetailsServiceV2/", "PhoneCountryCodeNumber"));
                     
                     currentUser.setPhoneNumber(getFirstChildNodeValue(doc, "http://xmlns.oracle.com/apps/hcm/people/roles/userDetailsServiceV2/", "PhoneNumber"));
                     
                     currentUser.setLanguage(getFirstChildNodeValue(doc, "http://xmlns.oracle.com/apps/hcm/people/roles/userDetailsServiceV2/", "Language"));
                     
                     currentUser.setDateFormat(getFirstChildNodeValue(doc, "http://xmlns.oracle.com/apps/hcm/people/roles/userDetailsServiceV2/", "DateFormat"));
                     
                     currentUser.setTimeFormat(getFirstChildNodeValue(doc, "http://xmlns.oracle.com/apps/hcm/people/roles/userDetailsServiceV2/", "TimeFormat"));
                     
                     currentUser.setCurrency(getFirstChildNodeValue(doc, "http://xmlns.oracle.com/apps/hcm/people/roles/userDetailsServiceV2/", "Currency"));
                     
                     currentUser.setGroupingSeparator(getFirstChildNodeValue(doc, "http://xmlns.oracle.com/apps/hcm/people/roles/userDetailsServiceV2/", "GroupingSeparator"));
                     
                     currentUser.setDecimalSeparator(getFirstChildNodeValue(doc, "http://xmlns.oracle.com/apps/hcm/people/roles/userDetailsServiceV2/", "DecimalSeparator"));
                     
                     currentUser.setTimeZone(getFirstChildNodeValue(doc, "http://xmlns.oracle.com/apps/hcm/people/roles/userDetailsServiceV2/", "TimeZone"));
                     
                     currentUser.setClientEncoding(getFirstChildNodeValue(doc, "http://xmlns.oracle.com/apps/hcm/people/roles/userDetailsServiceV2/", "ClientEncoding"));
                     
                     currentUser.setTerritory(getFirstChildNodeValue(doc, "http://xmlns.oracle.com/apps/hcm/people/roles/userDetailsServiceV2/", "Territory"));
                     
                     currentUser.setFontSize(getFirstChildNodeValue(doc, "http://xmlns.oracle.com/apps/hcm/people/roles/userDetailsServiceV2/", "FontSize"));
                     
                     NodeList nlist = doc.getElementsByTagNameNS("http://xmlns.oracle.com/apps/hcm/people/roles/userDetailsServiceV2/", "AccessibilityMode");
                     if ((nlist != null) && (nlist.getLength() > 0) && (nlist.item(0).getChildNodes().getLength() > 0))
                     {
                       Node n = nlist.item(0).getFirstChild();
                       if (n.getNodeValue() != null) {
                         currentUser.setAccessibilityMode(n.getNodeValue());
                       }
                     }
                     currentUser.setColorContrast(getFirstChildNodeValue(doc, "http://xmlns.oracle.com/apps/hcm/people/roles/userDetailsServiceV2/", "ColorContrast"));
                     
                     currentUser.setServerTime(getFirstChildNodeValue(doc, "http://xmlns.oracle.com/apps/hcm/people/roles/userDetailsServiceV2/", "ServerTime"));
                     
                     currentUser.setServerTimeForUserInfo(getFirstChildNodeValue(doc, "http://xmlns.oracle.com/apps/hcm/people/roles/userDetailsServiceV2/", "ServerTimeForUserInfo"));
                     
                     currentUser.setBusinessUnitId(getFirstChildNodeValue(doc, "http://xmlns.oracle.com/apps/hcm/people/roles/userDetailsServiceV2/", "BusinessUnitId"));
                     
                     currentUser.setBusinessUnitName(getFirstChildNodeValue(doc, "http://xmlns.oracle.com/apps/hcm/people/roles/userDetailsServiceV2/", "BusinessUnitName"));
                     
                     currentUser.setLegalEntityName(getFirstChildNodeValue(doc, "http://xmlns.oracle.com/apps/hcm/people/roles/userDetailsServiceV2/", "LegalEntityName"));
                     
                     currentUser.setPersonTypeId(getFirstChildNodeValue(doc, "http://xmlns.oracle.com/apps/hcm/people/roles/userDetailsServiceV2/", "PersonTypeId"));
                     
                     currentUser.setSystemPersonType(getFirstChildNodeValue(doc, "http://xmlns.oracle.com/apps/hcm/people/roles/userDetailsServiceV2/", "SystemPersonType"));
                     
                     currentUser.setUserPersonType(getFirstChildNodeValue(doc, "http://xmlns.oracle.com/apps/hcm/people/roles/userDetailsServiceV2/", "UserPersonType"));
                     
                     currentUser.setJobName(getFirstChildNodeValue(doc, "http://xmlns.oracle.com/apps/hcm/people/roles/userDetailsServiceV2/", "JobName"));
                     
                     currentUser.setDepartmentName(getFirstChildNodeValue(doc, "http://xmlns.oracle.com/apps/hcm/people/roles/userDetailsServiceV2/", "DepartmentName"));
                     
                     currentUser.setLocationTownOrCity(getFirstChildNodeValue(doc, "http://xmlns.oracle.com/apps/hcm/people/roles/userDetailsServiceV2/", "LocationTownOrCity"));
                     
                     currentUser.setLocationPostalCode(getFirstChildNodeValue(doc, "http://xmlns.oracle.com/apps/hcm/people/roles/userDetailsServiceV2/", "LocationPostalCode"));
                     
                     currentUser.setLocationCountry(getFirstChildNodeValue(doc, "http://xmlns.oracle.com/apps/hcm/people/roles/userDetailsServiceV2/", "LocationCountry"));
               
               ADFContext.getCurrent().getSessionScope().put("jwtUserContext", currentUser);
           }catch(Exception e){
               e.printStackTrace();
               message = e.getMessage();
           }
           if("Success".equalsIgnoreCase(message )){
               return "Success";
           }else{
               return "Error";
           }
         }

    public void setNotificationCount(RichOutputText notificationCount) {
        this.notificationCount = notificationCount;
    }

    public RichOutputText getNotificationCount() {
        return notificationCount;
    }
}
