package persistence;

import java.util.List;

public interface IPojo1 {

	String getAttribute();

	void setAttribute(String attribute);

	List<Pojo2> getPojos();

	void setPojos(List<Pojo2> pojos);

	Integer getId();

}