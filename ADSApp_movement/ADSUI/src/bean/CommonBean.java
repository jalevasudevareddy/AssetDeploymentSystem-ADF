package bean;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.el.ELContext;
import javax.el.ExpressionFactory;
import javax.el.MethodExpression;
import javax.el.ValueExpression;

import javax.faces.application.Application;
import javax.faces.application.FacesMessage;
import javax.faces.application.NavigationHandler;
import javax.faces.application.ViewHandler;
import javax.faces.component.UIComponent;
import javax.faces.component.UIViewRoot;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.faces.event.FacesEvent;

import oracle.adf.model.BindingContext;
import oracle.adf.model.DataControlFrame;
import oracle.adf.model.binding.DCBindingContainer;
import oracle.adf.model.binding.DCIteratorBinding;
import oracle.adf.share.ADFContext;
import oracle.adf.view.rich.component.rich.RichPopup;
import oracle.adf.view.rich.component.rich.fragment.RichRegion;
import oracle.adf.view.rich.context.AdfFacesContext;

import oracle.binding.BindingContainer;
import oracle.binding.OperationBinding;

import oracle.jbo.Key;
import oracle.jbo.Row;
import oracle.jbo.RowSetIterator;

import oracle.ui.pattern.dynamicShell.TabContext;

import org.apache.myfaces.trinidad.model.RowKeySet;

public class CommonBean {
    private DataControlFrame dataControlFrame;
    public CommonBean() {
        super();
    }

    public Object executeMethod(String methodName) {
        BindingContainer bindingContainer =
            BindingContext.getCurrent().getCurrentBindingsEntry();
        OperationBinding operationBinding =
            bindingContainer.getOperationBinding(methodName);
        Object object = operationBinding.execute();
        return object;
    }
    public void navigateNew(String outcome) 
    {
        FacesContext facesContext = FacesContext.getCurrentInstance();
        NavigationHandler navHandler = facesContext.getApplication().getNavigationHandler();
        navHandler.handleNavigation(facesContext, null,outcome);
    }
    public Object executeMethod(String methodName, Map paramsMap) {
        BindingContainer bindingContainer =
            BindingContext.getCurrent().getCurrentBindingsEntry();
        OperationBinding operationBinding =
            bindingContainer.getOperationBinding(methodName);
        Map parameters = operationBinding.getParamsMap();
        parameters.putAll(paramsMap);
        Object object = operationBinding.execute();
        return object;
    }

    public void showPopup(RichPopup popup) {
        RichPopup.PopupHints hints = new RichPopup.PopupHints();
        popup.show(hints);
    }

    public void showPopupMessage(String message,
                                 FacesMessage.Severity messageType) {
        FacesMessage faceMessage = new FacesMessage(message);
        FacesContext facesContext = FacesContext.getCurrentInstance();
        faceMessage.setSeverity(messageType);
        facesContext.addMessage("", faceMessage);
    }

    public void save() {
        DataControlFrame dcf = null;
        try {
            BindingContext bc = BindingContext.getCurrent();
            String dcfName = bc.getCurrentDataControlFrame();
            dcf = bc.findDataControlFrame(dcfName);
            dcf.commit();
        } catch (Exception e) {
            if (dcf != null) {
                dcf.commit();
            }
        }
    }

    public void cancel() {
        BindingContext bc = BindingContext.getCurrent();
        String dcfName = bc.getCurrentDataControlFrame();
        DataControlFrame dcf = bc.findDataControlFrame(dcfName);
        if (dcf.isTransactionDirty()) {
            dcf.rollback();
        }
    }

    public Map getCurrentSessionScope() {
        Map sessionScope = ADFContext.getCurrent().getSessionScope();
        return sessionScope;
    }

    public Map getCurrentPageFlowScope() {
        Map pageFlowScope =
            AdfFacesContext.getCurrentInstance().getPageFlowScope();
        return pageFlowScope;
    }

    public void editDocument(ActionEvent ae) {
        BindingContainer bindings =
            BindingContext.getCurrent().getCurrentBindingsEntry();
        OperationBinding methodbind =
            bindings.getOperationBinding("editDocument");
        //        methodbind.execute();
        navigate(ae, "edit");
    }


    public void navigate(FacesEvent event, String outcome) {
        RichRegion regionComponent = null;
        for (UIComponent uic = event.getComponent().getParent(); uic != null;
             uic = uic.getParent()) {
            if (uic instanceof RichRegion) {
                regionComponent = (RichRegion)uic;
                break;
            }
        }
        if (regionComponent != null) {
            FacesContext fc = FacesContext.getCurrentInstance();
            ExpressionFactory ef = fc.getApplication().getExpressionFactory();
            ELContext elc = fc.getELContext();
            MethodExpression me =
                ef.createMethodExpression(elc, outcome, String.class,
                                          new Class[] { });
            regionComponent.queueActionEventInRegion(me, null, null, false, -1,
                                                     -1, event.getPhaseId());
        }
    }

    public void setEL(String expression, Object newValue) {
        FacesContext facesContext = FacesContext.getCurrentInstance();
        Application app = facesContext.getApplication();
        ExpressionFactory elFactory = app.getExpressionFactory();
        ELContext elContext = facesContext.getELContext();
        ValueExpression valueExp =
            elFactory.createValueExpression(elContext, expression,
                                            Object.class);
        Class bindClass = valueExp.getType(elContext);
        //        if (bindClass.isPrimitive() || bindClass.isInstance(newValue)) {
        valueExp.setValue(elContext, newValue);
        //        }
    }

    public void addPartialTrigger(UIComponent uiComponent) {
        AdfFacesContext adfFacesContext = AdfFacesContext.getCurrentInstance();
        adfFacesContext.addPartialTarget(uiComponent);
    }

    public Object getEL(String expression) {
        FacesContext facesContext = FacesContext.getCurrentInstance();
        Application app = facesContext.getApplication();
        ExpressionFactory elFactory = app.getExpressionFactory();
        ELContext elContext = facesContext.getELContext();
        ValueExpression valueExp =
            elFactory.createValueExpression(elContext, expression,
                                            Object.class);
        return valueExp.getValue(elContext);
    }


    public void deleteRows(RowKeySet rowKeySet,
                           String iterator) throws Exception {
        RowKeySet selectedRowsSet = rowKeySet;
        Iterator selectedEmpIter = selectedRowsSet.iterator();
        DCBindingContainer dcBindingContainer =
            (DCBindingContainer)BindingContext.getCurrent().getCurrentBindingsEntry();
        DCIteratorBinding dcIter =
            dcBindingContainer.findIteratorBinding(iterator);
        RowSetIterator empRSIter = dcIter.getRowSetIterator();
        while (selectedEmpIter.hasNext()) {
            Key key = (Key)((List)selectedEmpIter.next()).get(0);
            Row currentRow = empRSIter.getRow(key);
            if (currentRow != null) {
                currentRow.remove();
            }
        }
    }
    
    public void commitDataControlFrame() throws Exception {
        dataControlFrame.commit();
    }

    public void rollbackDataControlFrame() throws Exception {
        dataControlFrame.rollback();
    }
    public FacesContext getFacesContextCurrentInstance() {
        return FacesContext.getCurrentInstance();
    }
    
    public void closeCurrentActivity(ActionEvent actionEvent)
       {
       TabContext tabContext = TabContext.getCurrentInstance();
       int tabIndex = tabContext.getSelectedTabIndex();
       if (tabIndex != -1)
       {
       tabContext.removeTab(tabIndex);
       }
       }
    
    public void refreshPage(){
          FacesContext fc = FacesContext.getCurrentInstance();
          String refreshpage = fc.getViewRoot().getViewId();
          ViewHandler ViewH = fc.getApplication().getViewHandler();
          UIViewRoot UIV = ViewH.createView(fc,refreshpage);
          UIV.setViewId(refreshpage);
          fc.setViewRoot(UIV);
      }
}
