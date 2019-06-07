package designpattern.singleton;

import javax.faces.bean.ManagedBean;

@ManagedBean(name="controllerBean_JavaSingleton")
public class ControllerBean_SimpleSingleton {
	/* SINGLETON */
	private static ControllerBean_SimpleSingleton INSTANCE = new ControllerBean_SimpleSingleton();	
	public static ControllerBean_SimpleSingleton getInstance()
    {   return INSTANCE;
    }	
	
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
