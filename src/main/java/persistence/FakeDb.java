package persistence;

import java.util.HashMap;
import java.util.Map;

public class FakeDb {
	
	Map<Integer, String> db = new HashMap<Integer, String>();
	
	public FakeDb(){
		db.put(0, "zero");
		db.put(1, "one");
		db.put(2, "two");
		db.put(3, "three");
	}
	
	public String getProperty(Integer property){
		return db.get(property);
	}
}