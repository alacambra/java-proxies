package persistence;

import org.apache.commons.proxy.Interceptor;
import org.apache.commons.proxy.Invocation;

public class MyInterceptor implements Interceptor{

	Buffer buffer = new Buffer();	
	FakeDb db = new FakeDb();
	
	@Override
	public Object intercept(Invocation arg0) throws Throwable {

		if (arg0.getMethod().invoke(arg0.getProxy(), arg0.getArguments()) == null){
			
			PersistedEntity entity = buffer.getEntity(((IPojo1) arg0.getProxy()).getId());
	
			if( entity != null ){
				entity.getValue(0);
			} else {
				entity = new PersistedEntity(0);
				buffer.addEntity(entity);
			}
			
			

		}
		
		return null;
		
	}

}
