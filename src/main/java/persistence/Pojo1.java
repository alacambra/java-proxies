package persistence;

public class Pojo1 implements IPojo1 {

	Integer id;
	
	@LoadMe
	private String value;
	
	public Pojo1(){}
	
	
	@Override
	public String getAttribute() {
		return value;
	}

	@Override
	public void setAttribute(String attribute) {
	}

	@Override
	public Integer getId() {
		return id;
	}
}

