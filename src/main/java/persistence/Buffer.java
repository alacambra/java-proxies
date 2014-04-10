package persistence;

import java.util.HashMap;
import java.util.Map;

public class Buffer {
	private Map<Integer, PersistedEntity> buffer = new HashMap<Integer, PersistedEntity>();
	
	public PersistedEntity getEntity(Integer id){
		return buffer.get(id);
	}
	
	public void addEntity(PersistedEntity entity){
		if(buffer.containsKey(entity.getId())) return;
		buffer.put(entity.getId(), entity);
	}
}
