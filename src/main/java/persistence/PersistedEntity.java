package persistence;

public class PersistedEntity {

	FakeDb db = new FakeDb();
	Integer id;
	
	public PersistedEntity(Integer id){
		this.id = id;
	}
	
	public String getValue(Integer key){
		return db.getProperty(key);
	}
	
	public Integer getId() {
		return id;
	}
	
	
}