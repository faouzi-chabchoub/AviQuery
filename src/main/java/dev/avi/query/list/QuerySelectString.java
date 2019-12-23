package dev.avi.query.list;

import java.util.List;

public interface QuerySelectString<T> extends Jointable<T>,  Filterable<T, String>, Sortable<T, String>, Listable<T, String>{

	String concat();

	String join(String separator);

	List<List<String>> split(String separator);

	List<String> allToUpper();

	List<String> allToLower();

	List<String> allCapitalize();

}