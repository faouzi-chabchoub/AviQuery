package dev.avi.query.list;

import java.util.List;

 class QueryList<T> {
	List<T> list;

	public QueryList(List<T> list) {
		this.list = list;
	}

	public List<T> getList() {
		return list;
	}

	public void setList(List<T> list) {
		this.list = list;
	}
	
}
