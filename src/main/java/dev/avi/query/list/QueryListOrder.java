package dev.avi.query.list;

import java.util.Comparator;
import java.util.List;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;
import java.util.stream.Collectors;

import dev.avi.query.Ordered;
import dev.avi.query.function.ToBooleanFunction;
import dev.avi.query.function.ToStringFunction;

class QueryListOrder<T,R> extends ListableImp<T, R> {

	ListableImp<T, R> listable;
	
	public QueryListOrder(ListableImp<T, R> listable,QueryList<T> queryList,ToStringFunction<T> keyExtractor) {
		super(queryList);
		this.listable=listable;
		setList(
				getList()
				.stream().sorted(Comparator.comparing(keyExtractor))
			.collect(Collectors.toList())
			);
	}
	
	public QueryListOrder(ListableImp<T, R> listable,QueryList<T> queryList,ToStringFunction<T> keyExtractor, Ordered ordered) {
		super(queryList);
		this.listable=listable;
		if(ordered == Ordered.ASC) {
			
			setList(
					getList()
					.stream().sorted(Comparator.comparing(keyExtractor))
					.collect(Collectors.toList())
			);
		}else {
			
			setList(
					getList()
					.stream().sorted(Comparator.comparing(keyExtractor).reversed())
					.collect(Collectors.toList())
			);
		}
	}
	
	public QueryListOrder(ListableImp<T, R> listable,QueryList<T> queryList,ToIntFunction<T> keyExtractor) {
		super(queryList);
		this.listable=listable;

			setList(
					getList()
					.stream().sorted(Comparator.comparingInt(keyExtractor))
					.collect(Collectors.toList())
			);
	}
	
	public QueryListOrder(ListableImp<T, R> listable,QueryList<T> queryList,ToIntFunction<T> keyExtractor,Ordered ordered) {
		super(queryList);
		this.listable=listable;
		if(ordered == Ordered.ASC) {
			
			setList(
					getList()
					.stream().sorted(Comparator.comparingInt(keyExtractor))
					.collect(Collectors.toList())
			);
		}else {
			
			setList(
					getList()
					.stream().sorted(Comparator.comparingInt(keyExtractor).reversed())
					.collect(Collectors.toList())
			);
		}

	}
	
	public QueryListOrder(ListableImp<T, R> listable,QueryList<T> queryList,ToDoubleFunction<T> keyExtractor) {
		super(queryList);
		this.listable=listable;

			setList(
					getList()
					.stream().sorted(Comparator.comparingDouble(keyExtractor))
					.collect(Collectors.toList())
			);
	}

	public QueryListOrder(ListableImp<T, R> listable,QueryList<T> queryList,ToDoubleFunction<T> keyExtractor,Ordered ordered) {
		super(queryList);
		this.listable=listable;
		if(ordered == Ordered.ASC) {
			
			setList(
					getList()
					.stream().sorted(Comparator.comparingDouble(keyExtractor))
					.collect(Collectors.toList())
			);
		}else {
			
			setList(
					getList()
					.stream().sorted(Comparator.comparingDouble(keyExtractor).reversed())
					.collect(Collectors.toList())
			);
		}

	}
	
	public QueryListOrder(ListableImp<T, R> listable,QueryList<T> queryList,ToLongFunction<T> keyExtractor) {
		super(queryList);
		this.listable=listable;
			setList(
					getList()
					.stream().sorted(Comparator.comparingLong(keyExtractor))
					.collect(Collectors.toList())
			);
	}

	public QueryListOrder(ListableImp<T, R> listable,QueryList<T> queryList,ToLongFunction<T> keyExtractor,Ordered ordered) {
		super(queryList);
		this.listable=listable;
		if(ordered == Ordered.ASC) {
			
			setList(
					getList()
					.stream().sorted(Comparator.comparingLong(keyExtractor))
					.collect(Collectors.toList())
			);
		}else {
			
			setList(
					getList()
					.stream().sorted(Comparator.comparingLong(keyExtractor).reversed())
					.collect(Collectors.toList())
			);
		}

	}	
	
	public QueryListOrder(ListableImp<T, R> listable,QueryList<T> queryList,ToBooleanFunction<T> keyExtractor) {
		super(queryList);
		this.listable=listable;
			setList(
					getList()
					.stream().sorted(Comparator.comparing(keyExtractor))
					.collect(Collectors.toList())
			);
	}

	public QueryListOrder(ListableImp<T, R> listable,QueryList<T> queryList,ToBooleanFunction<T> keyExtractor,Ordered ordered) {
		super(queryList);
		this.listable=listable;

		if(ordered == Ordered.ASC) {
				
				setList(
					getList()
					.stream().sorted(Comparator.comparing(keyExtractor))
					.collect(Collectors.toList())
			);
		}else {
			
			setList(
					getList()
					.stream().sorted(Comparator.comparing(keyExtractor).reversed())
					.collect(Collectors.toList())
			);
		}

	}

	@Override
	public List<R> toList() {
		return listable.toList();
	}


}
