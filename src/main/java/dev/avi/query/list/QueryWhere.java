package dev.avi.query.list;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class QueryWhere<T, R> extends QueryObject<T, R> implements Sortable<T, R> {
	ListableImp<T, R> listable;
	List<Predicate<T>> conditions = new ArrayList<Predicate<T>>();

	QueryWhere(ListableImp<T, R> listable, QueryList<T> queryList, Predicate<T> condition) {
		super(queryList);
		this.listable = listable;
		conditions.add(condition);
	}

	public QueryWhere<T, R> and(Predicate<T> condition) {
		conditions.add(condition);
		return this;
	};

	@Override
	public List<R> toList() {
		setList(getList().stream().filter(e->{
			return conditions.stream()
					.map(c->c.test(e))
					.reduce(Boolean::logicalAnd).orElse(false);
		}).collect(Collectors.toList()));
		
		return listable.toList();
	}

}
