package dev.avi.query.list;

import java.util.function.Function;

abstract class QuerySelectNumberImp<T, R extends Number> extends QuerySelectSolo<T,R> implements QuerySelectNumber<T, R>{

	public QuerySelectNumberImp(QueryList<T> queryList, Function<T, R> arg0) {
		super(queryList, arg0);
	}
	
	@Override
	public Double average() {
		return toList().stream().mapToDouble(e->e.intValue()).average().getAsDouble();
	}

}
