package persistence;

import java.lang.reflect.Method;

import org.apache.commons.proxy.Invoker;


public class MyInvoker implements Invoker {

	@Override
	public Object invoke(Object arg0, Method arg1, Object[] arg2) throws Throwable {
		System.out.println("proxy invoked");
		return null;
	}

}
