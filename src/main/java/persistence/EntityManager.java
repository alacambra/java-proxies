package persistence;

import org.apache.commons.proxy.Invoker;
import org.apache.commons.proxy.ProxyFactory;

public class EntityManager {
	
	public IPojo1 m(){
		ProxyFactory factory = new ProxyFactory();
		Invoker invoker = new MyInvoker();
		Class[] c = {Pojo1.class};
		IPojo1 p = (IPojo1) factory.createDelegatorProxy(new MyObjectProvider(), c);
		System.out.println(p.getAttribute());
		return p;
	}
	
	public static void main(String[] args){
		EntityManager manager = new EntityManager();
		manager.m().getAttribute();
	}
}
