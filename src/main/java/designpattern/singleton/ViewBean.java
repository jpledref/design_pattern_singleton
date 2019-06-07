package designpattern.singleton;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

@ManagedBean(name="viewBean")
public class ViewBean {	 
	 
	 //##### Simple Singleton Initialization #####  
	 private ControllerBean_SimpleSingleton controllerBean_SimpleSingleton = ControllerBean_SimpleSingleton.getInstance();
	 			 
	 //##### EJB Singleton Initialization #####
	 /*   
	    //In the constructor
		InitialContext context;
		try {
			context = new InitialContext();
			controllerBean_EjbSingleton = (ControllerBean_EjbSingleton) context.lookup("java:global/designpattern.observer/ControllerBean_EjbSingleton!designpattern.observer.ControllerBean_EjbSingleton");
		} catch (NamingException e) {
			e.printStackTrace();
		}
		
		//or
		
		Use @EJB
	 */
	 @EJB
	 private ControllerBean_EjbSingleton controllerBean_EjbSingleton;
	 
	//##### Application-scoped Singleton Declaration #####
	 private ControllerBean_AppScopedSingleton controllerBean_AppScopedSingleton;
	
	 public ViewBean(){	
		//##### Application-scoped Singleton Initialization #####   
		FacesContext facesContext = FacesContext.getCurrentInstance();		
		controllerBean_AppScopedSingleton = (ControllerBean_AppScopedSingleton)facesContext.getApplication().createValueBinding("#{controllerBean_AppScopedSingleton}").getValue(facesContext);
	 }	 
	 
	 /*Getters*/	
	 /**
	  * Get Counter value of Application-scoped Singleton
	  * @return counter
	  */
	 public String getCounterAppScopedSingleton() {	
		 return controllerBean_AppScopedSingleton.getCounter();
	 }	
	 
	 /**
	  * Get Counter value of Simple Singleton
	  * @return counter
	  */
	 public String getCounterSimpleSingleton() {		 
		 return controllerBean_SimpleSingleton.getCounter();
	 }	
	 
	 /**
	  * Get Counter value of Ejb Singleton
	  * @return counter
	  */
	 public String getCounterEjbSingleton() {		 
		 return controllerBean_EjbSingleton.getCounter();
	 }	
}
