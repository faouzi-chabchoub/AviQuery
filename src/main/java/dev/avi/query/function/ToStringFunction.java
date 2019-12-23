package dev.avi.query.function;

import java.util.function.Function;

@FunctionalInterface
public interface ToStringFunction<T> extends Function<T,String>{
	String apply(T value);
}
