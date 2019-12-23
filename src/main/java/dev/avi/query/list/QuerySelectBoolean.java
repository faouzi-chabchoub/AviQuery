package dev.avi.query.list;

public interface QuerySelectBoolean<T>  extends Jointable<T>,  Filterable<T, Boolean>, Sortable<T, Boolean>, Listable<T, Boolean>{

	public Boolean andAll();
	public Boolean orAll();
	public Boolean xorAll();
}
