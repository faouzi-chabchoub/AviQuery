package dev.avi.query;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import dev.avi.query.list.QueryFrom;
import dev.avi.query.list.QueryFromInteger;

public class Query {

	private Query() {}

	public static <T> QueryFrom<T> from(List<T> list) {
		return new QueryFrom<T>(list);
	}

	public static <T> QueryFrom<T> from(T[] array) {
		return new QueryFrom<T>(Arrays.asList(array));
	}

	public static QueryFromInteger fromInt(List<Integer> list) {
		return new QueryFromInteger(list);
	}

	public static QueryFromInteger range(int from, int to) {
		return range(from, to, false);
	}
	
	public static QueryFromInteger range(int from, int to, boolean closed) {
		if(closed) {
			return new QueryFromInteger(IntStream.rangeClosed(from, to).boxed().collect(Collectors.toList()));
		}
		return new QueryFromInteger(IntStream.range(from, to).boxed().collect(Collectors.toList()));
	}
}
