package dev.avi.query.list;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

import dev.avi.query.tuples.Undectet;

/**
 * @author faouzi
 *
 */
class QuerySelectUndectet<T, R0, R1, R2, R3, R4, R5, R6, R7, R8, R9, R10> 
extends QuerySelect<T, Undectet<R0, R1, R2, R3, R4, R5, R6, R7, R8, R9, R10>> {
	private  Function<T, R0> arg0;
	private  Function<T, R1> arg1;
	private  Function<T, R2> arg2;
	private  Function<T, R3> arg3;
	private  Function<T, R4> arg4;
	private  Function<T, R5> arg5;
	private  Function<T, R6> arg6;
	private  Function<T, R7> arg7;
	private  Function<T, R8> arg8;
	private  Function<T, R9> arg9;
	private  Function<T, R10> arg10;
	public QuerySelectUndectet(QueryList<T> queryList, Function<T, R0> arg0, Function<T, R1> arg1, Function<T, R2> arg2,
			Function<T, R3> arg3, Function<T, R4> arg4, Function<T, R5> arg5, Function<T, R6> arg6,
			Function<T, R7> arg7, Function<T, R8> arg8, Function<T, R9> arg9, Function<T, R10> arg10) {
		super(queryList);
		this.arg0 = arg0;
		this.arg1 = arg1;
		this.arg2 = arg2;
		this.arg3 = arg3;
		this.arg4 = arg4;
		this.arg5 = arg5;
		this.arg6 = arg6;
		this.arg7 = arg7;
		this.arg8 = arg8;
		this.arg9 = arg9;
		this.arg10 = arg10;
	}
	@Override
	public List<Undectet<R0, R1, R2, R3, R4, R5, R6, R7, R8, R9, R10>> toList() {
		List<Undectet<R0, R1, R2, R3, R4, R5, R6, R7, R8, R9, R10>> list = new ArrayList<>();
		queryList.getList().forEach(e->{
			list.add(new Undectet<R0, R1, R2, R3, R4, R5, R6, R7, R8, R9, R10>(arg0.apply(e),arg1.apply(e),arg2.apply(e), arg3.apply(e),
					arg4.apply(e),arg5.apply(e),arg6.apply(e),arg7.apply(e)
					,arg8.apply(e),arg9.apply(e),arg10.apply(e)));
		}); 
		return list;
	}

}
