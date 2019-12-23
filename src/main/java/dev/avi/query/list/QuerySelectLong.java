package dev.avi.query.list;

import java.util.function.Function;

class QuerySelectLong<T> extends QuerySelectNumberImp<T, Long> {

	public QuerySelectLong(QueryList<T> queryList, Function<T, Long> arg0) {
		super(queryList, arg0);
	}

	@Override
	public Long max() {
		return toList().stream().max(Long::compare).get();
	}

	@Override
	public Long min() {
		return toList().stream().min(Long::compare).get();
	}

	@Override
	public Long sum() {
		return toList().stream().mapToLong(e->e).reduce(0, Long::sum);
	}

	@Override
	public Long sub() {
		return toList().stream().mapToLong(e->e).skip(1).reduce(toList().get(0), (a, b) -> a - b);
	}

}
