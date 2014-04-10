package persistence;

import org.apache.commons.proxy.ProxyFactory;

public class EntityManager {
	
	Buffer buffer = new Buffer();
	ProxyFactory factory = new ProxyFactory();
	MyInvoker invoker = new MyInvoker();
	
	public static void main(String[] args){
		EntityManager manager = new EntityManager();
		IPojo1 p  = manager.fetch(1, IPojo1.class);
		p.getAttribute();
		manager.s().getId();
	}
	
	public <T> T fetch(Integer id, Class<T> clazz){
		Class<?>[] c = {clazz};
		T p = (T) factory.createInvokerProxy(invoker, c);
		
		return p;
	}
	
	public IPojo1 s(){
		Class[] c = {IPojo1.class};
		Pojo1 target = new Pojo1();
		return (IPojo1)factory.createInterceptorProxy(target, new MyInterceptor(), c);
	}
}
