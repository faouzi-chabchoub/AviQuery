package dev.avi.query.list;

import java.util.function.Function;

class QuerySelectDouble<T> extends QuerySelectNumberImp<T, Double> {

	public QuerySelectDouble(QueryList<T> queryList, Function<T, Double> arg0) {
		super(queryList, arg0);
	}

	@Override
	public Double max() {
		return toList().stream().max(Double::compare).get();
	}

	@Override
	public Double min() {
		return toList().stream().min(Double::compare).get();
	}

	@Override
	public Double sum() {
		return toList().stream().mapToDouble(e->e).reduce(0, Double::sum);
	}

	@Override
	public Double sub() {
		return toList().stream().mapToDouble(e->e).skip(1).reduce(toList().get(0), (a, b) -> a - b);
	}

}
