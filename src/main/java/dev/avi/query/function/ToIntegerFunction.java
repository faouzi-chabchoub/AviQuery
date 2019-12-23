package dev.avi.query.function;

import java.util.function.Function;

@FunctionalInterface
public interface ToIntegerFunction<T> extends Function<T,Integer>{
	Integer apply(T value);
}
