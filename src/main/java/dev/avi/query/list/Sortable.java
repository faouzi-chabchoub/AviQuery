package dev.avi.query.list;

import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

import dev.avi.query.Ordered;
import dev.avi.query.function.*;

public interface Sortable<T,R> {

	public Listable<T,R> orderBy(ToStringFunction<T> keyExtractor);
	public Listable<T,R> orderBy(ToStringFunction<T> keyExtractor, Ordered ordered);

	public Listable<T,R> orderBy(ToIntFunction<T> keyExtractor);
	public Listable<T,R> orderBy(ToIntFunction<T> keyExtractor, Ordered ordered);

	public Listable<T,R> orderBy(ToDoubleFunction<T> keyExtractor);
	public Listable<T,R> orderBy(ToDoubleFunction<T> keyExtractor, Ordered ordered);

	public Listable<T,R> orderBy(ToLongFunction<T> keyExtractor);
	public Listable<T,R> orderBy(ToLongFunction<T> keyExtractor, Ordered ordered);

	public Listable<T,R> orderBy(ToBooleanFunction<T> keyExtractor);
	public Listable<T,R> orderBy(ToBooleanFunction<T> keyExtractor, Ordered ordered);

}
