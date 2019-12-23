package dev.avi.query.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

class QuerySelectStringImp<T> extends QuerySelectSolo<T,String> implements QuerySelectString<T>{

	QuerySelectStringImp(QueryList<T> queryList, Function<T, String> arg0) {
		super(queryList, arg0);
	}
	
	@Override
	public String concat() {
		return String.join("", toList());
	}
	
	@Override
	public String join(String separator) {
		return String.join(separator, toList());
	}
	
	@Override
	public List<List<String>> split(String separator) {
		List<String> list =toList();
		
		List<List<String>> sliptList = new ArrayList<>();
		list.forEach(e->{
			sliptList.add(Arrays.asList(e.split(separator)));
		});
		return sliptList;
	}
	
	@Override
	public List<String> allToUpper() {
		return toList().stream().map(e->e.toUpperCase()).collect(Collectors.toList());
	}
	
	@Override
	public List<String> allToLower() {
		return toList().stream().map(e->e.toLowerCase()).collect(Collectors.toList());
	}
	
	@Override
	public List<String> allCapitalize() {
		return toList().stream().map(e->capitalize(e)).collect(Collectors.toList());
	}
	
	private String capitalize(String arg0) {
		return arg0.substring(0, 1).toUpperCase() + arg0.substring(1);
	}
	
}
