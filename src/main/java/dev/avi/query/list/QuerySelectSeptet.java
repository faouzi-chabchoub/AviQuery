package dev.avi.query.list;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

import dev.avi.query.tuples.Septet;

/**
 * @author faouzi
 *
 */
class QuerySelectSeptet<T, R0, R1, R2, R3, R4, R5, R6> extends QuerySelect<T,Septet<R0,R1,R2,R3,R4,R5, R6>>{
	private  Function<T, R0> arg0;
	private  Function<T, R1> arg1;
	private  Function<T, R2> arg2;
	private  Function<T, R3> arg3;
	private  Function<T, R4> arg4;
	private  Function<T, R5> arg5;
	private  Function<T, R6> arg6;
	public QuerySelectSeptet(QueryList<T> queryList, Function<T, R0> arg0, Function<T, R1> arg1, Function<T, R2> arg2,
			Function<T, R3> arg3, Function<T, R4> arg4, Function<T, R5> arg5, Function<T, R6> arg6) {
		super(queryList);
		this.arg0 = arg0;
		this.arg1 = arg1;
		this.arg2 = arg2;
		this.arg3 = arg3;
		this.arg4 = arg4;
		this.arg5 = arg5;
		this.arg6 = arg6;
	}
	@Override
	public List<Septet<R0, R1, R2, R3, R4, R5, R6>> toList() {
		List<Septet<R0, R1, R2, R3, R4, R5, R6>> list = new ArrayList<>();
		queryList.getList().forEach(e->{
			Septet<R0, R1, R2, R3, R4, R5, R6> pair =
					new Septet<>(arg0.apply(e),arg1.apply(e),arg2.apply(e), arg3.apply(e),
							arg4.apply(e),arg5.apply(e),arg6.apply(e));
			list.add(pair);
		}); 
		return list;
	}

}
