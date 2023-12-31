package model.searchview;

import java.util.ArrayList;
import java.util.Collection;

import java.util.HashMap;

import oracle.jbo.Key;
import oracle.jbo.RangePagingDataFilter;
import oracle.jbo.ScrollableDataFilter;
import oracle.jbo.server.ProgrammaticViewObjectImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Wed Dec 21 17:23:37 IST 2022
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class TransDeploymentOrderSearchVOImpl extends ProgrammaticViewObjectImpl {
    /**
     * This is the default constructor (do not remove).
     */
    public TransDeploymentOrderSearchVOImpl() {
    }

    /**
     * getRangePagingData - for custom java data source support.
     */
    public Collection<Object> getRangePagingData(RangePagingDataFilter filter) {
        Collection<Object> value = super.getRangePagingData(filter);
        return value;
    }

    /**
     * retrieveDataByKey - for custom java data source support.
     */
    public Collection<Object> retrieveDataByKey(Key key, int size) {
        Collection<Object> value = super.retrieveDataByKey(key, size);
        return value;
    }

    /**
     * getScrollableData - for custom java data source support.
     */
    public Collection<Object> getScrollableData(ScrollableDataFilter filter) {
        ArrayList<Object> rows =  new ArrayList<Object>();         
        HashMap<Object, Object> row = new HashMap<Object, Object>();      
        row.put("TransSrcBuId", null);
        row.put("TransSrcBuName", null);
        row.put("TransSrcDivision", null);
        row.put("TransSrcDivFlexValueId", null);
        row.put("TransSrcDivFlexValueSetId", null);
        row.put("TransReqBuId", null);
        row.put("TransReqBuName", null);
        row.put("TransContractNumber", null);
        row.put("TransContractId", null);
        row.put("TransCustTypeCode", null);
        row.put("TransCustType", null);
        row.put("TransProjectId", null);
        row.put("TransProject", null);
        row.put("TransDivision", null);
        row.put("TransDivFlexValueId", null);
        
        row.put("TransDeptName", null);
        row.put("TransDeptFlexValueId", null);
        row.put("TransCustomerName", null);
        row.put("TransCustomerId", null);
        row.put("TransSrcDivRequired", null);
        row.put("TransOrderNumber", null);
        row.put("TransOrderDate", null);
        
        row.put("TransSrcDivSegmentNumber", null);
        row.put("TransReqDivSegmentNumber", null);
        row.put("TransReqDeptSegmentNumber", null);
        
        return rows;
    }
}

