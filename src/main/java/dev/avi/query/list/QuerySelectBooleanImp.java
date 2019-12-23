package dev.avi.query.list;

import java.util.function.Function;

class QuerySelectBooleanImp<T> extends QuerySelectSolo<T,Boolean> implements QuerySelectBoolean<T>{

	public QuerySelectBooleanImp(QueryList<T> queryList, Function<T, Boolean> arg0) {
		super(queryList, arg0);
	}

	public Boolean andAll() {
		return toList().stream().reduce(Boolean.TRUE, Boolean::logicalAnd);
	}

	public Boolean orAll() {
		return toList().stream().reduce(Boolean.FALSE, Boolean::logicalOr);
	}

	public Boolean xorAll() {
		return toList().stream().reduce(Boolean.FALSE, Boolean::logicalXor);
	}

}
