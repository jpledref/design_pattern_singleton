package designpattern.singleton;

import javax.ejb.Singleton;
import javax.faces.bean.ManagedBean;

@Singleton
@ManagedBean(name="controllerBean_EjbSingleton")
public class ControllerBean_EjbSingleton {
	
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
