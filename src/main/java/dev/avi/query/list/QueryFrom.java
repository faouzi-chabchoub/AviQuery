package dev.avi.query.list;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import dev.avi.query.function.ToBooleanFunction;
import dev.avi.query.function.ToDoubleFunction;
import dev.avi.query.function.ToFloatFunction;
import dev.avi.query.function.ToIntegerFunction;
import dev.avi.query.function.ToLongFunction;
import dev.avi.query.function.ToStringFunction;
import dev.avi.query.tuples.Decet;
import dev.avi.query.tuples.Duet;
import dev.avi.query.tuples.Duodectet;
import dev.avi.query.tuples.Nonet;
import dev.avi.query.tuples.Octet;
import dev.avi.query.tuples.Quartet;
import dev.avi.query.tuples.Quintet;
import dev.avi.query.tuples.Septet;
import dev.avi.query.tuples.Sextet;
import dev.avi.query.tuples.Tredectet;
import dev.avi.query.tuples.Triplet;
import dev.avi.query.tuples.Undectet;

public class QueryFrom<T> extends QueryObject<T, T> implements Filterable<T, T>,Jointable<T> {
	
	public QueryFrom(List<T> list) {
		super(new QueryList<T>(list));
	}
	
	public <R> QuerySelect<T, R> select(Function<T, R> arg0) {
		return QuerySelect.select(queryList, arg0);
	}

	public QuerySelectNumber<T , Integer> selectInteger(ToIntegerFunction<T> arg0) {
		return QuerySelect.select(queryList, arg0);
	}

	public QuerySelectNumber<T , Long> selectLong(ToLongFunction<T> arg0) {
		return QuerySelect.select(queryList, arg0);
	}

	public QuerySelectNumber<T , Double> selectDouble(ToDoubleFunction<T> arg0) {
		return QuerySelect.select(queryList, arg0);
	}

	public QuerySelectNumber<T , Float> selectFloat(ToFloatFunction<T> arg0) {
		return QuerySelect.select(queryList, arg0);
	}

	public <R> QuerySelectString<T> selectString(ToStringFunction<T> arg0) {
		return QuerySelect.select(queryList, arg0);
	}

	public <R> QuerySelectBoolean<T> selectBoolean(ToBooleanFunction<T> arg0) {
		return QuerySelect.select(queryList, arg0);
	}

	public <R0, R1> QuerySelect<T, Duet<R0, R1>> select(Function<T, R0> arg0, Function<T, R1> arg1) {
		return QuerySelect.select(queryList, arg0,arg1);
	}

	public <R0, R1, R2> QuerySelect<T, Triplet<R0, R1, R2>> select(Function<T, R0> arg0, Function<T, R1> arg1,
			Function<T, R2> arg2) {
		return QuerySelect.select(queryList, arg0, arg1, arg2);
	}

	public <R0, R1, R2, R3> QuerySelect<T, Quartet<R0, R1, R2, R3>> select(Function<T, R0> arg0, Function<T, R1> arg1,
			Function<T, R2> arg2, Function<T, R3> arg3) {
		return QuerySelect.select(queryList, arg0, arg1, arg2, arg3);
	}

	public <R0, R1, R2, R3, R4> QuerySelect<T, Quintet<R0, R1, R2, R3, R4>> select(Function<T, R0> arg0,
			Function<T, R1> arg1, Function<T, R2> arg2, Function<T, R3> arg3, Function<T, R4> arg4) {
		return QuerySelect.select(queryList, arg0, arg1, arg2, arg3, arg4);
	}

	public <R0, R1, R2, R3, R4, R5> QuerySelect<T, Sextet<R0, R1, R2, R3, R4, R5>> select(Function<T, R0> arg0,
			Function<T, R1> arg1, Function<T, R2> arg2, Function<T, R3> arg3, Function<T, R4> arg4,
			Function<T, R5> arg5) {
		return QuerySelect.select(queryList, arg0, arg1, arg2, arg3, arg4, arg5);
	}

	public <R0, R1, R2, R3, R4, R5, R6> QuerySelect<T, Septet<R0, R1, R2, R3, R4, R5, R6>> select(Function<T, R0> arg0,
			Function<T, R1> arg1, Function<T, R2> arg2, Function<T, R3> arg3, Function<T, R4> arg4,
			Function<T, R5> arg5, Function<T, R6> arg6) {
		return QuerySelect.select(queryList, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}
	
	public <R0, R1, R2, R3, R4, R5, R6, R7> QuerySelect<T, Octet<R0, R1, R2, R3, R4, R5, R6, R7>> select(
			Function<T, R0> arg0, Function<T, R1> arg1, Function<T, R2> arg2, Function<T, R3> arg3,
			Function<T, R4> arg4, Function<T, R5> arg5, Function<T, R6> arg6, Function<T, R7> arg7) {
		return QuerySelect.select(queryList, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
	}
	
	public <R0, R1, R2, R3, R4, R5, R6, R7, R8> QuerySelect<T, Nonet<R0, R1, R2, R3, R4, R5, R6, R7, R8>> select(
			Function<T, R0> arg0, Function<T, R1> arg1, Function<T, R2> arg2, Function<T, R3> arg3,
			Function<T, R4> arg4, Function<T, R5> arg5, Function<T, R6> arg6, Function<T, R7> arg7,
			Function<T, R8> arg8) {
		return QuerySelect.select(queryList, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
	}

	public <R0, R1, R2, R3, R4, R5, R6, R7, R8, R9> QuerySelect<T, Decet<R0, R1, R2, R3, R4, R5, R6, R7, R8, R9>> select(
			Function<T, R0> arg0, Function<T, R1> arg1, Function<T, R2> arg2, Function<T, R3> arg3,
			Function<T, R4> arg4, Function<T, R5> arg5, Function<T, R6> arg6, Function<T, R7> arg7,
			Function<T, R8> arg8, Function<T, R9> arg9) {
		return QuerySelect.select(queryList, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9);
	}

	public <R0, R1, R2, R3, R4, R5, R6, R7, R8, R9, R10> QuerySelect<T, Undectet<R0, R1, R2, R3, R4, R5, R6, R7, R8, R9, R10>> select(
			Function<T, R0> arg0, Function<T, R1> arg1, Function<T, R2> arg2, Function<T, R3> arg3,
			Function<T, R4> arg4, Function<T, R5> arg5, Function<T, R6> arg6, Function<T, R7> arg7,
			Function<T, R8> arg8, Function<T, R9> arg9, Function<T, R10> arg10) {
		return QuerySelect.select(queryList, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10);
	}

	public <R0, R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, R11> QuerySelect<T, Duodectet<R0, R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, R11>> select(
			Function<T, R0> arg0, Function<T, R1> arg1, Function<T, R2> arg2, Function<T, R3> arg3,
			Function<T, R4> arg4, Function<T, R5> arg5, Function<T, R6> arg6, Function<T, R7> arg7,
			Function<T, R8> arg8, Function<T, R9> arg9, Function<T, R10> arg10, Function<T, R11> arg11) {
		return QuerySelect.select(queryList, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11);
	}

	public <R0, R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, R11, R12> QuerySelect<T, Tredectet<R0, R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, R11, R12>> select(
			Function<T, R0> arg0, Function<T, R1> arg1, Function<T, R2> arg2, Function<T, R3> arg3,
			Function<T, R4> arg4, Function<T, R5> arg5, Function<T, R6> arg6, Function<T, R7> arg7,
			Function<T, R8> arg8, Function<T, R9> arg9, Function<T, R10> arg10, Function<T, R11> arg11,
			Function<T, R12> arg12) {
		return QuerySelect.select(queryList, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12);
	}

	@Override
	public QueryWhere<T, T> where(Predicate<T> condition) {
		return new QueryWhere<>(this,queryList, condition);
	}

	public QueryFrom<T> distinct() {
		setList(toList().stream().distinct().collect(Collectors.toList()));
		return this;
	}

	
	@Override
	public List<T> toList() {
		return getList();
	}
	
	public QueryFrom<T> intersect(List<T> list) {
		Set<T> distancList = getList().stream().distinct().collect(Collectors.toSet());
		Set<T> distancList1 = list.stream().distinct().collect(Collectors.toSet());		
		setList(distancList.stream().distinct().filter(distancList1::contains) .collect(Collectors.toList()));
		return this;
	}
	
	public <R> QueryFrom<T> intersect(List<T> list, Function<T, R> function) {
		Set<T> distancList = getList().stream().distinct().collect(Collectors.toSet());
		Set<T> distancList1 = list.stream().distinct().collect(Collectors.toSet());
		setList(distancList.stream().distinct().filter(e-> contains(distancList1,function,e)) .collect(Collectors.toList()));
		return this;
	}
	
	

	public QueryFrom<T> union(List<T> list) {
		Set<T> distancList = getList().stream().distinct().collect(Collectors.toSet());
		Set<T> distancList1 = list.stream().distinct().collect(Collectors.toSet());
        Set<T> set = new HashSet<T>();
        set.addAll(distancList);
        set.addAll(distancList1);
		setList( set.stream().distinct().collect(Collectors.toList()));
		return this;
	}
	
	public QueryFrom<T> difference(List<T> list) {
		Set<T> distancList = getList().stream().distinct().collect(Collectors.toSet());
		Set<T> distancList1 = list.stream().distinct().collect(Collectors.toSet());
        Set<T> set = new HashSet<T>();
        set.addAll(distancList.stream().distinct().filter(e-> !distancList1.contains(e)) .collect(Collectors.toList()));
        set.addAll(distancList1.stream().distinct().filter(e-> !distancList.contains(e)) .collect(Collectors.toList()));
		setList( set.stream().distinct().collect(Collectors.toList()));
		return this;
	}
	
	public<R> QueryFrom<T> difference(List<T> list, Function<T, R> function) {
		Set<T> distancList = getList().stream().distinct().collect(Collectors.toSet());
		Set<T> distancList1 = list.stream().distinct().collect(Collectors.toSet());
        Set<T> set = new HashSet<T>();
        set.addAll(distancList.stream().distinct().filter(e-> !contains(distancList1,function,e)) .collect(Collectors.toList()));
        set.addAll(distancList1.stream().distinct().filter(e-> !contains(distancList1,function,e)) .collect(Collectors.toList()));
		setList( set.stream().distinct().collect(Collectors.toList()));
		return this;
	}
	

	public QueryFrom<T> left(List<T> list) {
		Set<T> distancList = getList().stream().distinct().collect(Collectors.toSet());
		Set<T> distancList1 = list.stream().distinct().collect(Collectors.toSet());
		setList( distancList.stream().distinct().filter(e-> !distancList1.contains(e)) .collect(Collectors.toList()));
		return this;
	}
	
	public<R> QueryFrom<T> left(List<T> list, Function<T, R> function) {
		Set<T> distancList = getList().stream().distinct().collect(Collectors.toSet());
		Set<T> distancList1 = list.stream().distinct().collect(Collectors.toSet());
		setList( distancList.stream().distinct().filter(e-> !contains(distancList1,function,e)) .collect(Collectors.toList()));
		return this;
	}
	
	public QueryFrom<T> right(List<T> list) {
		Set<T> distancList = getList().stream().distinct().collect(Collectors.toSet());
		Set<T> distancList1 = list.stream().distinct().collect(Collectors.toSet());
		setList( distancList1.stream().distinct().filter(e-> !distancList.contains(e)) .collect(Collectors.toList()));
		return this;
	}

	public<R> QueryFrom<T> right(List<T> list, Function<T, R> function) {
		Set<T> distancList = getList().stream().distinct().collect(Collectors.toSet());
		Set<T> distancList1 = list.stream().distinct().collect(Collectors.toSet());
		setList( distancList1.stream().distinct().filter(e-> !contains(distancList,function,e)) .collect(Collectors.toList()));
		return this;
	}
	private<R> boolean contains(Set<T> distancList1, Function<T, R> function, T e) {
		for (T t : distancList1) {
			if(function.apply(t).equals(function.apply(e))) {
				return true;
			}
		}
		return false;
	}
}
