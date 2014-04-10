package persistence;

import java.lang.annotation.Annotation;

import org.apache.commons.proxy.Interceptor;
import org.apache.commons.proxy.Invocation;

public class MyInterceptor implements Interceptor{

	Buffer buffer = new Buffer();	
	FakeDb db = new FakeDb();
	
	@Override
	public Object intercept(Invocation arg0) throws Throwable {

		if (arg0.getMethod().invoke(arg0.getProxy(), arg0.getArguments()) == null){
			Annotation[] annotations = arg0.getMethod().getAnnotations();
			PersistedEntity entity = buffer.getEntity(((IPojo1) arg0.getProxy()).getId());
	
			if( entity != null ){
				entity.getValue(0);
			} else {
				entity = new PersistedEntity(0);
			}

		}
		return null;
	}

}
