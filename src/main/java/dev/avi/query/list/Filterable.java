package dev.avi.query.list;

import java.util.function.Predicate;

public interface Filterable<T,R> {
	public QueryWhere<T,R> where(Predicate<T> condition);
}
