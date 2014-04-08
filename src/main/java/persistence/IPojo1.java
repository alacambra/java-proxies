package persistence;

import java.util.List;

public interface IPojo1 {

	public abstract String getAttribute();

	public abstract void setAttribute(String attribute);

	public abstract List<Pojo2> getPojos();

	public abstract void setPojos(List<Pojo2> pojos);

}