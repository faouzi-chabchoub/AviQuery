package dev.avi.query.function;

import java.util.function.Function;

@FunctionalInterface
public interface ToLongFunction<T> extends Function<T,Long>{
	Long apply(T value);
}
