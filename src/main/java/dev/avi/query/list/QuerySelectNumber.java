package dev.avi.query.list;

public interface QuerySelectNumber<T, R extends Number>  extends Jointable<T>,  Filterable<T, R>, Sortable<T, R>, Listable<T, R>{

	public R max();

	public R min() ;

	public R sum();

	public R sub();
	
	public Double average();

}
