package dev.avi.query.list;

import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

import dev.avi.query.Ordered;
import dev.avi.query.function.ToBooleanFunction;
import dev.avi.query.function.ToStringFunction;

 abstract class QueryObject<T,R> extends ListableImp<T,R> implements Sortable<T, R> {

	protected QueryObject(QueryList<T> queryList) {
		super(queryList);
	}

	@Override
	public Listable<T, R> orderBy(ToStringFunction<T> keyExtractor) {
		return new QueryListOrder<>(this,queryList,keyExtractor);
	}

	@Override
	public Listable<T, R> orderBy(ToStringFunction<T> keyExtractor, Ordered ordered) {
		return new QueryListOrder<>(this,queryList,keyExtractor, ordered);
	}

	@Override
	public Listable<T, R> orderBy(ToIntFunction<T> keyExtractor) {
		return new QueryListOrder<>(this,queryList,keyExtractor);
	}

	@Override
	public Listable<T, R> orderBy(ToIntFunction<T> keyExtractor, Ordered ordered) {
		return new QueryListOrder<>(this,queryList,keyExtractor,ordered);
	}

	@Override
	public Listable<T, R> orderBy(ToDoubleFunction<T> keyExtractor) {
		return new QueryListOrder<>(this,queryList,keyExtractor);
	}

	@Override
	public Listable<T, R> orderBy(ToDoubleFunction<T> keyExtractor, Ordered ordered) {
		return new QueryListOrder<>(this,queryList,keyExtractor,ordered);
	}

	@Override
	public Listable<T, R> orderBy(ToLongFunction<T> keyExtractor) {
		return new QueryListOrder<>(this,queryList,keyExtractor);
	}

	@Override
	public Listable<T, R> orderBy(ToLongFunction<T> keyExtractor, Ordered ordered) {
		return new QueryListOrder<>(this,queryList,keyExtractor,ordered);
	}

	@Override
	public Listable<T, R> orderBy(ToBooleanFunction<T> keyExtractor) {
		return new QueryListOrder<>(this,queryList,keyExtractor);
	}

	@Override
	public Listable<T, R> orderBy(ToBooleanFunction<T> keyExtractor, Ordered ordered) {
		return new QueryListOrder<>(this,queryList,keyExtractor,ordered);
	}

}
