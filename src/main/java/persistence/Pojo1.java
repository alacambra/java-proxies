package persistence;

import java.util.List;

public class Pojo1 implements IPojo1 {

	Integer id;
	
	@LoadMe
	private String value;
	
	private String attribute = "lalalala";
	List<Pojo2> pojos;

	public Pojo1(){}
	
	
	@Override
	public String getAttribute() {
		return attribute;
	}

	@Override
	public void setAttribute(String attribute) {
		this.attribute = attribute;
	}

	@Override
	public List<Pojo2> getPojos() {
		return pojos;
	}

	@Override
	public void setPojos(List<Pojo2> pojos) {
		this.pojos = pojos;
	}
}

