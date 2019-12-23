package dev.avi.query.list;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

import dev.avi.query.tuples.Triplet;

/**
 * @author faouzi
 *
 */
class QuerySelectTriplet<T, R0, R1, R2> extends QuerySelect<T,Triplet<R0, R1, R2>>{
	private  Function<T, R0> arg0;
	private  Function<T, R1> arg1;
	private  Function<T, R2> arg2;

	public QuerySelectTriplet(QueryList<T> queryList, Function<T, R0> arg0, Function<T, R1> arg1,
			Function<T, R2> arg2) {
		super(queryList);
		this.arg0= arg0;
		this.arg1= arg1;
		this.arg2= arg2;
	}

	@Override
	public List<Triplet<R0, R1, R2>> toList() {
		List<Triplet<R0, R1, R2>> list = new ArrayList<>();
		queryList.getList().forEach(e->{
			Triplet<R0, R1, R2> pair =new Triplet<>(arg0.apply(e),arg1.apply(e),arg2.apply(e));
			list.add(pair);
		}); 
		return list;
	}

}
