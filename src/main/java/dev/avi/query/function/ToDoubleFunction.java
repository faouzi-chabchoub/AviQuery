package dev.avi.query.function;

import java.util.function.Function;

@FunctionalInterface
public interface ToDoubleFunction<T> extends Function<T,Double>{
	Double apply(T value);
}
