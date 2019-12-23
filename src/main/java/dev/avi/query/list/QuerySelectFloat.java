package dev.avi.query.list;

import java.util.List;
import java.util.function.Function;

class QuerySelectFloat<T> extends QuerySelectNumberImp<T, Float> {

	public QuerySelectFloat(QueryList<T> queryList, Function<T, Float> arg0) {
		super(queryList, arg0);
	}

	@Override
	public Float max() {
		return toList().stream().max(Float::compare).get();
	}

	@Override
	public Float min() {
		return toList().stream().min(Float::compare).get();
	}

	@Override
	public Float sum() {
		float sum=0f;
		for (float e : toList()) { sum+=e; }
		return sum;
	}

	@Override
	public Float sub() {
		List<Float> list = toList();
		float sub=0f;
		if(list!=null && list.size()>0) {
			sub=list.get(0);
			for (int i = 1; i < list.size(); i++) {
				sub-=list.get(i);
			}
		}
		return sub;
	}

}
