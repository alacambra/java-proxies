package persistence;

import org.apache.commons.proxy.ObjectProvider;

public class MyObjectProvider implements ObjectProvider {

	@Override
	public Object getObject() {
		return new Pojo1();
	}

}
