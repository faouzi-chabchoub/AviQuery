package dev.avi.query.list;

import java.util.List;
import java.util.function.Function;

public interface Jointable<T> {

	public QueryFrom<T> intersect(List<T> list);
	public<R> QueryFrom<T> intersect(List<T> list, Function<T, R> function);
	public QueryFrom<T> union(List<T> list);
	public QueryFrom<T> difference(List<T> list);
	public<R> QueryFrom<T> difference(List<T> list, Function<T, R> function);
	public QueryFrom<T> left(List<T> list);
	public<R> QueryFrom<T> left(List<T> list, Function<T, R> function);
	public QueryFrom<T> right(List<T> list);
	public<R> QueryFrom<T> right(List<T> list, Function<T, R> function);
}
