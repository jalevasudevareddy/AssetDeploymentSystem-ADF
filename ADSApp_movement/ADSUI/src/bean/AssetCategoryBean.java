package bean;

import javax.faces.application.FacesMessage;
import javax.faces.event.ActionEvent;
import javax.faces.event.ValueChangeEvent;

import oracle.adf.share.ADFContext;
import oracle.adf.view.rich.component.rich.input.RichInputComboboxListOfValues;
import oracle.adf.view.rich.component.rich.layout.RichPanelHeader;

public class AssetCategoryBean extends CommonBean{
    private RichPanelHeader asstCategoryPageBind;
    private RichInputComboboxListOfValues lookupTypeBind;

    public AssetCategoryBean() {
        super();
    }

    public void addAssetCategoryActList(ActionEvent actionEvent) {
        try {
            String message=(String)executeMethod("addAssetCategory");
       } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void deleteAsstCategoryActList(ActionEvent actionEvent) {
        try {
            String message=(String)executeMethod("deleteAssetCategory");
           if (!"Success".equalsIgnoreCase(message)) {
               addPartialTrigger(getAsstCategoryPageBind());
               showPopupMessage(message, FacesMessage.SEVERITY_ERROR);
           }else {
               addPartialTrigger(getAsstCategoryPageBind());
           }
       } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void assetCategoryValChList(ValueChangeEvent valueChangeEvent) {
        valueChangeEvent.getComponent().processUpdates(getFacesContextCurrentInstance());
        String oldAssetCategoryValue = (String) valueChangeEvent.getOldValue();
        ADFContext.getCurrent().getPageFlowScope().put("AssetCategoryOldValue", oldAssetCategoryValue);
        String msg = (String) executeMethod("assetCategoryValueChangeList");
        if (!"Success".equalsIgnoreCase(msg)) {
            addPartialTrigger(getAsstCategoryPageBind());
            showPopupMessage(msg, FacesMessage.SEVERITY_ERROR);
        }else {
            addPartialTrigger(getAsstCategoryPageBind());
        }
    }

    public void saveAL(ActionEvent actionEvent) {
        try 
        {
            save();
            addPartialTrigger(getAsstCategoryPageBind());
        }
        catch(Exception e) 
        {
            e.printStackTrace();    
        }
    }

    public void saveCloseAL(ActionEvent actionEvent) {
        try 
        {
            save();
            closeCurrentActivity(actionEvent);
        }
        catch(Exception e) 
        {
            e.printStackTrace();    
        }
    }

    public void cancelAL(ActionEvent actionEvent) {
        try 
        {
            cancel();
            closeCurrentActivity(actionEvent);
        }
        catch(Exception e) 
        {
            e.printStackTrace();    
        }
    }

    public void setAsstCategoryPageBind(RichPanelHeader asstCategoryPageBind) {
        this.asstCategoryPageBind = asstCategoryPageBind;
    }

    public RichPanelHeader getAsstCategoryPageBind() {
        return asstCategoryPageBind;
    }

    public void asstAttrDeleteActList(ActionEvent actionEvent) {
        try {
           String message=(String)executeMethod("deleteAssetAttribute");
           if (!"Success".equalsIgnoreCase(message)) {
               showPopupMessage(message, FacesMessage.SEVERITY_ERROR);
           }
       } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void asstAttributeAddActList(ActionEvent actionEvent) {
        try {
            String message=(String)executeMethod("addAssetAttribute");
       } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void repCategoryAdd(ActionEvent actionEvent) {
        try {
            String message=(String)executeMethod("repCategoryAdd");
       } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void repCatDelete(ActionEvent actionEvent) {
        try {
            String message=(String)executeMethod("repCategoryDelete");
            if (!"Success".equalsIgnoreCase(message)) {
                showPopupMessage(message, FacesMessage.SEVERITY_ERROR);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void asstAttributeValChList(ValueChangeEvent valueChangeEvent) {
        valueChangeEvent.getComponent().processUpdates(getFacesContextCurrentInstance());
        String msg = (String) executeMethod("assetAttributeValueChangeList");
        if (!"Success".equalsIgnoreCase(msg)) {
            addPartialTrigger(getAsstCategoryPageBind());
            showPopupMessage(msg, FacesMessage.SEVERITY_ERROR);
        }else {
            addPartialTrigger(getAsstCategoryPageBind());
        }
    }

    public void repCategoryValChList(ValueChangeEvent valueChangeEvent) {
        valueChangeEvent.getComponent().processUpdates(getFacesContextCurrentInstance());
        String msg = (String) executeMethod("repCategoryValueChangeList");
        if (!"Success".equalsIgnoreCase(msg)) {
            addPartialTrigger(getAsstCategoryPageBind());
            showPopupMessage(msg, FacesMessage.SEVERITY_ERROR);
        }else {
            addPartialTrigger(getAsstCategoryPageBind());
        }
    }

    public void setLookupTypeBind(RichInputComboboxListOfValues lookupTypeBind) {
        this.lookupTypeBind = lookupTypeBind;
    }

    public RichInputComboboxListOfValues getLookupTypeBind() {
        return lookupTypeBind;
    }

    public void dataTypeValChList(ValueChangeEvent valueChangeEvent) {
        valueChangeEvent.getComponent().processUpdates(getFacesContextCurrentInstance());
        Integer datatype = (Integer) getEL("#{row.bindings.DataType.inputValue}");
        Integer n=new Integer(3);
        if(datatype!=null && n.compareTo(datatype)!=0)
        {
            setEL("#{row.bindings.LookupType.inputValue}", null);
        }
        addPartialTrigger(getLookupTypeBind());
    }
}
