package dev.avi.query.list;

import java.util.function.Function;

class QuerySelectInteger<T> extends QuerySelectNumberImp<T, Integer> {

	public QuerySelectInteger(QueryList<T> queryList, Function<T, Integer> arg0) {
		super(queryList, arg0);
	}

	@Override
	public Integer max() {
		return toList().stream().max(Integer::compare).get();
	}

	@Override
	public Integer min() {
		return toList().stream().min(Integer::compare).get();
	}

	@Override
	public Integer sum() {
		return toList().stream().reduce(0, Integer::sum);
	}

	@Override
	public Integer sub() {
		return toList().stream().skip(1).reduce(toList().get(0), (a, b) -> a - b);
	}

}
