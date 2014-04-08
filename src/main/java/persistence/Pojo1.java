package persistence;

import java.util.List;

public class Pojo1 implements IPojo1 {

	private String attribute = "lalalala";
	List<Pojo2> pojos;

	public Pojo1(){}
	
	/* (non-Javadoc)
	 * @see persistence.IPojo1#getAttribute()
	 */
	@Override
	public String getAttribute() {
		return attribute;
	}

	/* (non-Javadoc)
	 * @see persistence.IPojo1#setAttribute(java.lang.String)
	 */
	@Override
	public void setAttribute(String attribute) {
		this.attribute = attribute;
	}

	/* (non-Javadoc)
	 * @see persistence.IPojo1#getPojos()
	 */
	@Override
	public List<Pojo2> getPojos() {
		return pojos;
	}

	/* (non-Javadoc)
	 * @see persistence.IPojo1#setPojos(java.util.List)
	 */
	@Override
	public void setPojos(List<Pojo2> pojos) {
		this.pojos = pojos;
	}
}

