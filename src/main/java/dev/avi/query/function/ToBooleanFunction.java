package dev.avi.query.function;

import java.util.function.Function;

/**
 * @author faouzi
 *
 */
@FunctionalInterface
public interface ToBooleanFunction<T> extends Function<T,Boolean>{
	Boolean apply(T value);
}
