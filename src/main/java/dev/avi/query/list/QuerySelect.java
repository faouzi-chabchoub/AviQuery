package dev.avi.query.list;

import java.util.function.Function;
import java.util.function.Predicate;

import dev.avi.query.function.ToBooleanFunction;
import dev.avi.query.function.ToDoubleFunction;
import dev.avi.query.function.ToFloatFunction;
import dev.avi.query.function.ToIntegerFunction;
import dev.avi.query.function.ToLongFunction;
import dev.avi.query.function.ToStringFunction;
import dev.avi.query.tuples.Duet;
import dev.avi.query.tuples.Triplet;

/**
 * @author faouzi
 *
 */
public abstract class QuerySelect<T,R> extends QueryObject<T, R> implements Filterable<T, R>{
	
	protected QueryList<T> queryList;

	QuerySelect(QueryList<T> queryList) {
		super(queryList);
		this.queryList=queryList;
	}

	@Override
	public QueryWhere<T, R> where(Predicate<T> condition) {
		return new QueryWhere<>(this,queryList,condition);
	}

	protected static <T, R> QuerySelectSolo<T, R> select(QueryList<T> qlist, Function<T, R> arg0) {
		return new QuerySelectSolo<T, R>(qlist, arg0);
	}

	protected static <T> QuerySelectNumber<T , Integer> select(QueryList<T> qlist, ToIntegerFunction<T> arg0) {
		return new QuerySelectInteger<T>(qlist, arg0);
	}
	
	protected static <T> QuerySelectNumber<T , Long> select(QueryList<T> qlist, ToLongFunction<T> arg0) {
		return new QuerySelectLong<T>(qlist, arg0);
	}
	
	protected static <T> QuerySelectNumber<T , Double> select(QueryList<T> qlist, ToDoubleFunction<T> arg0) {
		return new QuerySelectDouble<T>(qlist, arg0);
	}

	protected static <T> QuerySelectNumber<T , Float> select(QueryList<T> qlist, ToFloatFunction<T> arg0) {
		return new QuerySelectFloat<T>(qlist, arg0);
	}

	protected static <T> QuerySelectBoolean<T> select(QueryList<T> qlist, ToBooleanFunction<T> arg0) {
		return new QuerySelectBooleanImp<T>(qlist, arg0);
	}

	protected static <T> QuerySelectString<T> select(QueryList<T> qlist, ToStringFunction<T> arg0) {
		return new QuerySelectStringImp<T>(qlist, arg0);
	}

	protected static <T, R0, R1> QuerySelect<T, Duet<R0, R1>> select(QueryList<T> qlist, Function<T, R0> arg0,
			Function<T, R1> arg1) {
		return new QuerySelectDuet<T, R0, R1>(qlist, arg0, arg1);
	}

	protected static <T, R0, R1, R2> QuerySelect<T, Triplet<R0, R1, R2>> select(QueryList<T> qlist, Function<T, R0> arg0,
			Function<T, R1> arg1, Function<T, R2> arg2) {
		return new QuerySelectTriplet<T, R0, R1, R2>(qlist, arg0, arg1, arg2);
	}

	protected static <T, R0, R1, R2, R3> QuerySelectQuartet<T, R0, R1, R2, R3> select(QueryList<T> qlist, Function<T, R0> arg0,
			Function<T, R1> arg1, Function<T, R2> arg2, Function<T, R3> arg3) {
		return new QuerySelectQuartet<T, R0, R1, R2, R3>(qlist, arg0, arg1, arg2, arg3);
	}

	protected static <T, R0, R1, R2, R3, R4> QuerySelectQuintet<T, R0, R1, R2, R3, R4> select(QueryList<T> qlist, Function<T, R0> arg0,
			Function<T, R1> arg1, Function<T, R2> arg2, Function<T, R3> arg3, Function<T, R4> arg4) {
		return new QuerySelectQuintet<T, R0, R1, R2, R3, R4>(qlist, arg0, arg1, arg2, arg3, arg4);
	}

	protected static <T, R0, R1, R2, R3, R4, R5> QuerySelectSextet<T, R0, R1, R2, R3, R4, R5> select(QueryList<T> qlist, Function<T, R0> arg0,
			Function<T, R1> arg1, Function<T, R2> arg2, Function<T, R3> arg3, Function<T, R4> arg4,
			Function<T, R5> arg5) {
		return new QuerySelectSextet<T, R0, R1, R2, R3, R4, R5>(qlist, arg0, arg1, arg2, arg3, arg4, arg5);
	}

	protected static <T, R0, R1, R2, R3, R4, R5, R6> QuerySelectSeptet<T, R0, R1, R2, R3, R4, R5, R6> select(QueryList<T> qlist, Function<T, R0> arg0,
			Function<T, R1> arg1, Function<T, R2> arg2, Function<T, R3> arg3, Function<T, R4> arg4,
			Function<T, R5> arg5, Function<T, R6> arg6) {
		return new QuerySelectSeptet<T, R0, R1, R2, R3, R4, R5, R6>(qlist, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}

	protected static <T, R0, R1, R2, R3, R4, R5, R6, R7> QuerySelectOctet<T, R0, R1, R2, R3, R4, R5, R6, R7> select(QueryList<T> qlist,
			Function<T, R0> arg0, Function<T, R1> arg1, Function<T, R2> arg2, Function<T, R3> arg3,
			Function<T, R4> arg4, Function<T, R5> arg5, Function<T, R6> arg6, Function<T, R7> arg7) {
		return new QuerySelectOctet<T, R0, R1, R2, R3, R4, R5, R6, R7>(qlist, arg0, arg1, arg2, arg3, arg4, arg5, arg6,
				arg7);
	}

	protected static <T, R0, R1, R2, R3, R4, R5, R6, R7, R8> QuerySelectNonet<T, R0, R1, R2, R3, R4, R5, R6, R7, R8> select(QueryList<T> qlist,
			Function<T, R0> arg0, Function<T, R1> arg1, Function<T, R2> arg2, Function<T, R3> arg3,
			Function<T, R4> arg4, Function<T, R5> arg5, Function<T, R6> arg6, Function<T, R7> arg7,
			Function<T, R8> arg8) {
		return new QuerySelectNonet<T, R0, R1, R2, R3, R4, R5, R6, R7, R8>(qlist, arg0, arg1, arg2, arg3, arg4, arg5,
				arg6, arg7, arg8);
	}

	protected static <T, R0, R1, R2, R3, R4, R5, R6, R7, R8, R9> QuerySelectDecet<T, R0, R1, R2, R3, R4, R5, R6, R7, R8, R9> select(QueryList<T> qlist,
			Function<T, R0> arg0, Function<T, R1> arg1, Function<T, R2> arg2, Function<T, R3> arg3,
			Function<T, R4> arg4, Function<T, R5> arg5, Function<T, R6> arg6, Function<T, R7> arg7,
			Function<T, R8> arg8, Function<T, R9> arg9) {
		return new QuerySelectDecet<T, R0, R1, R2, R3, R4, R5, R6, R7, R8, R9>(qlist, arg0, arg1, arg2, arg3, arg4, arg5,
				arg6, arg7, arg8, arg9);
	}

	protected static <T, R0, R1, R2, R3, R4, R5, R6, R7, R8, R9, R10> QuerySelectUndectet<T, R0, R1, R2, R3, R4, R5, R6, R7, R8, R9, R10> select(QueryList<T> qlist,
			Function<T, R0> arg0, Function<T, R1> arg1, Function<T, R2> arg2, Function<T, R3> arg3,
			Function<T, R4> arg4, Function<T, R5> arg5, Function<T, R6> arg6, Function<T, R7> arg7,
			Function<T, R8> arg8, Function<T, R9> arg9, Function<T, R10> arg10) {
		return new QuerySelectUndectet<T, R0, R1, R2, R3, R4, R5, R6, R7, R8, R9, R10>(qlist, arg0, arg1, arg2, arg3,
				arg4, arg5, arg6, arg7, arg8, arg9, arg10);
	}

	protected static <T, R0, R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, R11> QuerySelectDuodectet<T, R0, R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, R11> select(
			QueryList<T> qlist, Function<T, R0> arg0, Function<T, R1> arg1, Function<T, R2> arg2,
			Function<T, R3> arg3, Function<T, R4> arg4, Function<T, R5> arg5, Function<T, R6> arg6,
			Function<T, R7> arg7, Function<T, R8> arg8, Function<T, R9> arg9, Function<T, R10> arg10,
			Function<T, R11> arg11) {
		return new QuerySelectDuodectet<T, R0, R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, R11>(qlist, arg0, arg1, arg2,
				arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11);
	}

	protected static<T, R0, R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, R11, R12> QuerySelectTredectet<T, R0, R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, R11, R12> select(
			QueryList<T> qlist, Function<T, R0> arg0, Function<T, R1> arg1, Function<T, R2> arg2,
			Function<T, R3> arg3, Function<T, R4> arg4, Function<T, R5> arg5, Function<T, R6> arg6,
			Function<T, R7> arg7, Function<T, R8> arg8, Function<T, R9> arg9, Function<T, R10> arg10,
			Function<T, R11> arg11, Function<T, R12> arg12) {
		return new QuerySelectTredectet<T, R0, R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, R11, R12>(qlist, arg0, arg1,
				arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12);
	}

}
