package persistence;

import java.util.List;

public class Pojo1 implements IPojo1 {

	Integer id;
	
	@LoadMe
	private String value;
	
	List<Pojo2> pojos;

	public Pojo1(){}
	
	
	@Override
	public String getAttribute() {
		return value;
	}

	@Override
	public void setAttribute(String attribute) {
	}

	@Override
	public List<Pojo2> getPojos() {
		return pojos;
	}

	@Override
	public void setPojos(List<Pojo2> pojos) {
		this.pojos = pojos;
	}
	
	@Override
	public Integer getId() {
		return id;
	}
}

