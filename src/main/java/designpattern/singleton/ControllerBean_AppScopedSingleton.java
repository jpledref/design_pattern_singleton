package designpattern.singleton;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

@ApplicationScoped
@ManagedBean(name="controllerBean_AppScopedSingleton")
public class ControllerBean_AppScopedSingleton {
	
	private int counter=0;
	
	/*Getters*/
	/**
	 * Basic getter
	 * @return counter
	 */
	public String getCounter() {
        return "Counter " + ++counter;
    }	

	
}
