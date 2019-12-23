package dev.avi.query.list;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

import dev.avi.query.tuples.Quintet;

/**
 * @author faouzi
 *
 */
class QuerySelectQuintet<T, R0, R1, R2, R3, R4> extends QuerySelect<T,Quintet<R0,R1,R2,R3, R4>>{
	private  Function<T, R0> arg0;
	private  Function<T, R1> arg1;
	private  Function<T, R2> arg2;
	private  Function<T, R3> arg3;
	private  Function<T, R4> arg4;
	
	public QuerySelectQuintet(QueryList<T> queryList, Function<T, R0> arg0, Function<T, R1> arg1, Function<T, R2> arg2,
			Function<T, R3> arg3, Function<T, R4> arg4) {
		super(queryList);
		this.arg0 = arg0;
		this.arg1 = arg1;
		this.arg2 = arg2;
		this.arg3 = arg3;
		this.arg4 = arg4;
	}

	@Override
	public List<Quintet<R0, R1, R2, R3, R4>> toList() {
		List<Quintet<R0, R1, R2, R3, R4>> list = new ArrayList<>();
		queryList.getList().forEach(e->{
			Quintet<R0, R1, R2, R3, R4> pair =
					new Quintet<>(arg0.apply(e),arg1.apply(e)
							,arg2.apply(e),arg3.apply(e),arg4.apply(e));
			list.add(pair);
		}); 
		return list;
	}

}
