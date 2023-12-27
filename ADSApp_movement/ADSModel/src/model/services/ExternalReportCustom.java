//package model.services;
//
//import com.sun.xml.internal.ws.developer.WSBindingProvider;
//
//import java.io.ByteArrayOutputStream;
//
//import java.util.Map;
//
//import weblogic.wsee.jws.jaxws.owsm.SecurityPoliciesFeature;
//import com.oracle.xmlns.oxp.service.publicreportservice.ArrayOfParamNameValue;
//import com.oracle.xmlns.oxp.service.publicreportservice.ArrayOfString;
//import com.oracle.xmlns.oxp.service.publicreportservice.ExternalReportWSSService;
//import com.oracle.xmlns.oxp.service.publicreportservice.ExternalReportWSSService_Service;
//
//import com.oracle.xmlns.oxp.service.publicreportservice.ParamNameValue;
//import com.oracle.xmlns.oxp.service.publicreportservice.ReportRequest;
//
//import com.oracle.xmlns.oxp.service.publicreportservice.ReportResponse;
//import com.oracle.xmlns.oxp.service.publicreportservice.RunReport;
//
//import com.oracle.xmlns.oxp.service.publicreportservice.RunReportResponse;
//import javax.xml.parsers.DocumentBuilder;
//import javax.xml.parsers.DocumentBuilderFactory;
//import javax.xml.ws.WebServiceRef;
//
//import oracle.adf.share.ADFContext;
//
//import oracle.wsm.security.util.SecurityConstants;
//
//import org.w3c.dom.Document;
//import org.w3c.dom.NodeList;
//
//import weblogic.wsee.jws.jaxws.owsm.SecurityPoliciesFeature;

package model.services;

import com.oracle.xmlns.oxp.service.publicreportservice.ArrayOfParamNameValue;
import com.oracle.xmlns.oxp.service.publicreportservice.ArrayOfString;
import com.oracle.xmlns.oxp.service.publicreportservice.ExternalReportWSSService;
import com.oracle.xmlns.oxp.service.publicreportservice.ExternalReportWSSService_Service;

import com.oracle.xmlns.oxp.service.publicreportservice.ParamNameValue;
import com.oracle.xmlns.oxp.service.publicreportservice.ReportRequest;

import com.oracle.xmlns.oxp.service.publicreportservice.ReportResponse;
import com.oracle.xmlns.oxp.service.publicreportservice.RunReport;

import com.oracle.xmlns.oxp.service.publicreportservice.RunReportResponse;

import com.sun.xml.ws.developer.WSBindingProvider;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.WebServiceRef;

import oracle.adf.share.ADFContext;

import oracle.wsm.security.util.SecurityConstants;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;


import weblogic.wsee.jws.jaxws.owsm.SecurityPoliciesFeature;
import weblogic.wsee.jws.jaxws.owsm.SecurityPolicyFeature;
public class ExternalReportCustom {
    @WebServiceRef
    private static ExternalReportWSSService_Service externalReportWSSService_Service;
    ExternalReportWSSService externalReportWSSService;
    Map sessMap = ADFContext.getCurrent().getSessionScope();
    
    public ExternalReportCustom() {
        super();
        externalReportWSSService_Service =
                new ExternalReportWSSService_Service();
        SecurityPoliciesFeature securityFeatures =
            new SecurityPoliciesFeature(new String[] { "oracle/wss_username_token_over_ssl_client_policy" });
        externalReportWSSService =
                externalReportWSSService_Service.getExternalReportWSSService(securityFeatures);
        // Add your code to call the desired methods.
        WSBindingProvider wsbp = (WSBindingProvider)externalReportWSSService;

        Map<String, Object> requestContext = wsbp.getRequestContext();

        String serviceEndpoint =
            "https://fa-eqir-dev15-saasfademo1.ds-fa.oraclepdemos.com/xmlpserver/services/ExternalReportWSSService?WSDL";
        String serviceUsername = "technical";
        String servicePassword = "NalsBkhTest@789";
        requestContext.put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY,
                           serviceEndpoint);
//        requestContext.put(WSBindingProvider.USERNAME_PROPERTY,
//                                                   serviceUsername);
//        requestContext.put(WSBindingProvider.PASSWORD_PROPERTY,
//                                                   servicePassword);
        requestContext.put(SecurityConstants.ClientConstants.WSS_CSF_KEY,"IntegrationUser");
    }
    
    public byte[] generateRentalQuotationPDFReportData(ByteArrayOutputStream data) throws Exception {
        byte[] baReport = new byte[0];
        try {
            ReportRequest repreq = new ReportRequest();
            
            repreq.setReportAbsolutePath("/Custom/PAAS/ADS/Rental Quote Print Report.xdo");
            repreq.setSizeOfDataChunkDownload(-1);
            repreq.setReportData(data.toByteArray());
            repreq.setAttributeFormat("pdf");
            repreq.setFlattenXML(false);
            RunReport runrep = new RunReport();
            runrep.setReportRequest(repreq);
            ReportResponse represp = null;
            represp = externalReportWSSService.runReport(repreq, null);
            baReport = represp.getReportBytes();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return baReport;
    }
    
    public byte[] generateReportData(String path, String type, ByteArrayOutputStream data) throws Exception {
        byte[] baReport = new byte[0];
        try {
            ReportRequest repreq = new ReportRequest();
            
            repreq.setReportAbsolutePath(path);
            repreq.setSizeOfDataChunkDownload(-1);
            repreq.setReportData(data.toByteArray());
            repreq.setAttributeFormat(type);
            repreq.setFlattenXML(false);
            RunReport runrep = new RunReport();
            runrep.setReportRequest(repreq);
            ReportResponse represp = null;
            represp = externalReportWSSService.runReport(repreq, null);
            baReport = represp.getReportBytes();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return baReport;
    }
    
    public byte[] generateQuotePrintReportWaagner(ByteArrayOutputStream data) throws Exception {
        byte[] baReport = new byte[0];
        try {
            ReportRequest repreq = new ReportRequest();
            
            repreq.setReportAbsolutePath("/Custom/PAAS/ADS/Rental Quote Print Report(Waagner).xdo");
            repreq.setSizeOfDataChunkDownload(-1);
            repreq.setReportData(data.toByteArray());
            repreq.setAttributeFormat("pdf");
            repreq.setFlattenXML(false);
            RunReport runrep = new RunReport();
            runrep.setReportRequest(repreq);
            ReportResponse represp = null;
            represp = externalReportWSSService.runReport(repreq, null);
            baReport = represp.getReportBytes();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return baReport;
    }
    
    public byte[] generateQuotePrintReportCMPH(ByteArrayOutputStream data) throws Exception {
        byte[] baReport = new byte[0];
        try {
            ReportRequest repreq = new ReportRequest();
            
            repreq.setReportAbsolutePath("/Custom/PAAS/ADS/Rental Quote Print Report(CMPH).xdo");
            repreq.setSizeOfDataChunkDownload(-1);
            repreq.setReportData(data.toByteArray());
            repreq.setAttributeFormat("pdf");
            repreq.setFlattenXML(false);
            RunReport runrep = new RunReport();
            runrep.setReportRequest(repreq);
            ReportResponse represp = null;
            represp = externalReportWSSService.runReport(repreq, null);
            baReport = represp.getReportBytes();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return baReport;
    }

    
    public byte[] generateDOPrintReport(ByteArrayOutputStream data) throws Exception {
        byte[] baReport = new byte[0];
        try {
            ReportRequest repreq = new ReportRequest();
            
            repreq.setReportAbsolutePath("/Custom/PAAS/ADS/Delivery Note Print Report.xdo");
            repreq.setSizeOfDataChunkDownload(-1);
            repreq.setReportData(data.toByteArray());
            repreq.setAttributeFormat("docx");
            repreq.setFlattenXML(false);
            RunReport runrep = new RunReport();
            runrep.setReportRequest(repreq);
            ReportResponse represp = null;
            represp = externalReportWSSService.runReport(repreq, null);
            baReport = represp.getReportBytes();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return baReport;
    }
    
    public byte[] generateDRPrintReport(ByteArrayOutputStream data) throws Exception {
        byte[] baReport = new byte[0];
        try {
            ReportRequest repreq = new ReportRequest();
            
            repreq.setReportAbsolutePath("/Custom/PAAS/ADS/Collection Note Print Report.xdo");
            repreq.setSizeOfDataChunkDownload(-1);
            repreq.setReportData(data.toByteArray());
            repreq.setAttributeFormat("pdf");
            repreq.setFlattenXML(false);
            RunReport runrep = new RunReport();
            runrep.setReportRequest(repreq);
            ReportResponse represp = null;
            represp = externalReportWSSService.runReport(repreq, null);
            baReport = represp.getReportBytes();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return baReport;
    }
    
    
}
