package dev.avi.query.list;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

import dev.avi.query.tuples.Quartet;

/**
 * @author faouzi
 *
 */
class QuerySelectQuartet<T, R0, R1, R2, R3> extends QuerySelect<T,Quartet<R0,R1,R2,R3>> {

	private  Function<T, R0> arg0;
	private  Function<T, R1> arg1;
	private  Function<T, R2> arg2;
	private  Function<T, R3> arg3;

	public QuerySelectQuartet(QueryList<T> queryList, Function<T, R0> arg0, Function<T, R1> arg1,
			Function<T, R2> arg2, Function<T, R3> arg3) {
		super(queryList);
		this.arg0= arg0;
		this.arg1= arg1;
		this.arg2= arg2;
		this.arg3= arg3;
	}

	@Override
	public List<Quartet<R0,R1,R2,R3>> toList() {
		List<Quartet<R0,R1,R2,R3>> list = new ArrayList<>();
		queryList.getList().forEach(e->{
			Quartet<R0,R1,R2,R3> pair =
					new Quartet<>(arg0.apply(e),arg1.apply(e),arg2.apply(e),arg3.apply(e));
			list.add(pair);
		}); 
		return list;
	}
}
