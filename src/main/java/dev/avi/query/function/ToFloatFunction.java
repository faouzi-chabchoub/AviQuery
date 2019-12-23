package dev.avi.query.function;

import java.util.function.Function;

@FunctionalInterface
public interface ToFloatFunction<T> extends Function<T,Float>{
	Float apply(T value);
}
