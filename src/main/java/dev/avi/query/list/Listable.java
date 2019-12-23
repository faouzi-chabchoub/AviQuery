package dev.avi.query.list;

import java.util.List;
import java.util.function.Supplier;

public interface Listable<T, R> {
	public List<R> toList() ;
	public List<R> toListOrElse(List<R> arg0) ;
	public <E extends Exception> List<R> toListOrElseThrow(Supplier<E> exceptionSupplier) throws E ;
	public List<R> evenRows() ;
	public List<R> oddRows() ;
	public R first() ;
	public R firstOrElse(R arg0) ;
	public <E extends Exception> R firstOrElseThrow(Supplier<E> exceptionSupplier) throws E ;
	public R last() ;
	public int count() ;
	public R random() ;
	public boolean isPresent() ;
}
