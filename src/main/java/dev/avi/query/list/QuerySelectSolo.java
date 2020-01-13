package dev.avi.query.list;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author faouzi
 *
 */
 class QuerySelectSolo<T,R> extends QuerySelect<T,R> implements Jointable<T>{

	private Function<T, R> arg0;

	public QuerySelectSolo(QueryList<T> queryList,Function<T,R> arg0) {
		super(queryList);
		this.arg0 = arg0;
	}

	@Override
	public List<R> toList() {
		return queryList.getList().stream().map(arg0).collect(Collectors.toList());
	}

	public QueryFrom<T> intersect(List<T> list) {
		Set<T> distancList = getList().stream().distinct().collect(Collectors.toSet());
		Set<T> distancList1 = list.stream().distinct().collect(Collectors.toSet());		
		return new QueryFrom<T>(distancList.stream().distinct().filter(distancList1::contains) .collect(Collectors.toList()));
	}
	
	public <R1> QueryFrom<T> intersect(List<T> list, Function<T, R1> function) {
		Set<T> distancList = getList().stream().distinct().collect(Collectors.toSet());
		Set<T> distancList1 = list.stream().distinct().collect(Collectors.toSet());
		return new QueryFrom<T>(distancList.stream().distinct().filter(e-> contains(distancList1,function,e)) .collect(Collectors.toList()));
	}
	
	

	public QueryFrom<T> union(List<T> list) {
		Set<T> distancList = getList().stream().distinct().collect(Collectors.toSet());
		Set<T> distancList1 = list.stream().distinct().collect(Collectors.toSet());
        Set<T> set = new HashSet<T>();
        set.addAll(distancList);
        set.addAll(distancList1);
        return new QueryFrom<T>( set.stream().distinct().collect(Collectors.toList()));
	}
	
	public QueryFrom<T> difference(List<T> list) {
		Set<T> distancList = getList().stream().distinct().collect(Collectors.toSet());
		Set<T> distancList1 = list.stream().distinct().collect(Collectors.toSet());
        Set<T> set = new HashSet<T>();
        set.addAll(distancList.stream().distinct().filter(e-> !distancList1.contains(e)) .collect(Collectors.toList()));
        set.addAll(distancList1.stream().distinct().filter(e-> !distancList.contains(e)) .collect(Collectors.toList()));
        return new QueryFrom<T>( set.stream().distinct().collect(Collectors.toList()));
	}
	
	public<R1> QueryFrom<T> difference(List<T> list, Function<T, R1> function) {
		Set<T> distancList = getList().stream().distinct().collect(Collectors.toSet());
		Set<T> distancList1 = list.stream().distinct().collect(Collectors.toSet());
        Set<T> set = new HashSet<T>();
        set.addAll(distancList.stream().distinct().filter(e-> !contains(distancList1,function,e)) .collect(Collectors.toList()));
        set.addAll(distancList1.stream().distinct().filter(e-> !contains(distancList1,function,e)) .collect(Collectors.toList()));
        return new QueryFrom<T>( set.stream().distinct().collect(Collectors.toList()));
	}
	

	public QueryFrom<T> left(List<T> list) {
		Set<T> distancList = getList().stream().distinct().collect(Collectors.toSet());
		Set<T> distancList1 = list.stream().distinct().collect(Collectors.toSet());
		return new QueryFrom<T>( distancList.stream().distinct().filter(e-> !distancList1.contains(e)) .collect(Collectors.toList()));
	}
	
	public<R1> QueryFrom<T> left(List<T> list, Function<T, R1> function) {
		Set<T> distancList = getList().stream().distinct().collect(Collectors.toSet());
		Set<T> distancList1 = list.stream().distinct().collect(Collectors.toSet());
		return new QueryFrom<T>( distancList.stream().distinct().filter(e-> !contains(distancList1,function,e)) .collect(Collectors.toList()));
	}
	
	public QueryFrom<T> right(List<T> list) {
		Set<T> distancList = getList().stream().distinct().collect(Collectors.toSet());
		Set<T> distancList1 = list.stream().distinct().collect(Collectors.toSet());
		return new QueryFrom<T>(distancList1.stream().distinct().filter(e-> !distancList.contains(e)) .collect(Collectors.toList()));
	}

	public<R1> QueryFrom<T> right(List<T> list, Function<T, R1> function) {
		Set<T> distancList = getList().stream().distinct().collect(Collectors.toSet());
		Set<T> distancList1 = list.stream().distinct().collect(Collectors.toSet());
		return new QueryFrom<T>( distancList1.stream().distinct().filter(e-> !contains(distancList,function,e)) .collect(Collectors.toList()));
	}

	private <R1> boolean contains(Set<T> distancList1, Function<T, R1> function, T e) {
		for (T t : distancList1) {
			if(function.apply(t).equals(function.apply(e))) {
				return true;
			}
		}
		return false;
	}

}
