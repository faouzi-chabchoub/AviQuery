package dev.avi.query.list;

import java.util.List;
import java.util.function.Function;

public interface Jointable<T> {

	public List<T> intersect(List<T> list);
	public<R> List<T> intersectBy(List<T> list, Function<T, R> function);
	public List<T> union(List<T> list);
	public List<T> difference(List<T> list);
	public<R> List<T> differenceBy(List<T> list, Function<T, R> function);
	public List<T> left(List<T> list);
	public<R> List<T> leftBy(List<T> list, Function<T, R> function);
	public List<T> right(List<T> list);
	public<R> List<T> rightBy(List<T> list, Function<T, R> function);
}
