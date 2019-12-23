package dev.avi.query.list;

import java.util.List;

public class QueryFromInteger extends QueryFrom<Integer>{

	public QueryFromInteger(List<Integer> list) {
		super(list);
	}
	
	public Integer max() {
		return getList().stream().max(Integer::compare).get();
	}

	public Integer min() {
		return getList().stream().min(Integer::compare).get();
	}

	public Integer sum() {
		return getList().stream().reduce(0, (a, b) -> a + b);
	}

	public Integer sub() {
		return getList().stream().skip(1).reduce(getList().get(0), (a, b) -> a - b);
	}

	public Double average() {
		return toList().stream().mapToInt(e->e.intValue()).average().getAsDouble();
	}


}
