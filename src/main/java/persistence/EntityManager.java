package persistence;

import org.apache.commons.proxy.ProxyFactory;

public class EntityManager {
	
	Buffer buffer = new Buffer();
	ProxyFactory factory = new ProxyFactory();
	MyInvoker invoker = new MyInvoker();
	
//	public IPojo1 m(){
//		
//		Invoker invoker = new MyInvoker();
//		Class[] c = {IPojo1.class};
////		IPojo1 p = (IPojo1) factory.createDelegatorProxy(new MyObjectProvider(), c);
////		Pojo1 p = (IPojo1) factory.createInterceptorProxy(target, interceptor, proxyClasses)
//		System.out.println(p.getAttribute());
//		return p;
//	}
	
	public static void main(String[] args){
		EntityManager manager = new EntityManager();
		IPojo1 p  = manager.fetch(1, IPojo1.class);
		p.getAttribute();
	}
	
	public <T> T fetch(Integer id, Class<T> clazz){
		Class<?>[] c = {clazz};
		T p = (T) factory.createInvokerProxy(invoker, c);
		
		return p;
	}
}
