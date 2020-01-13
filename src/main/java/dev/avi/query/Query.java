package dev.avi.query;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import dev.avi.query.list.QueryFrom;
import dev.avi.query.list.QueryFromInteger;

/**
 * This class is the main class that start any query
 * 
 * this class is final cannot be inherited, has no purpose solely to group this 
 * methods for applying a query to a given or generated list 
 *
 * this library uses the Java Stream API and servers as a library wrapper
 * and make it easier to read Than the Stream API and create complex queries with syntax similar to SQL
 * 
 * if you are advanced in the Java Stream API this library may not help you very much but it will 
 * help the first learner and beginners.
 * 
 * <br/>
 * For example we have a list of vehicles we want to select the model name of each vehicle in list
 * vehicles is {@code List<Vehicle> vehicles}
 * <br/>
 * {@code
 * List<String> models = Query.From(vehicles).select(Vehicle::getModelName()).toList();
 * }
 * 
 * @author Faouzi Chabchoub
 * @see QueryFrom
 * @see QueryFromInteger
 * 
 */
public final class Query {

	private Query() {}
	
	/**
	 * set the list of {@code <T>} in which the query will be queried
	 * <pre>
	 * Example:
	 * {@code
     *     Query.From(someList);
     * }
     * </pre>
     *  
	 * @param list The java.util.List of {@code <T>} which will be queried
	 * @return a {@code QueryFrom} object that contains methods of the query
	 * 
	 */
	public static <T> QueryFrom<T> from(List<T> list) {
		return new QueryFrom<T>(list);
	}

	/**
	 * set the Array in  which the query will be converted to java.util.List of {@code <T>}
	 * call the <i>from</i> Method which has the java.util.List of {@code <T>} as parameter
	 * 
	 * @param array of {@code <T>} The Array which will be converted to java.util.List of {@code <T>}
	 * @return a {@code QueryFrom} object that contains methods of the query
	 * 
	 * <pre>{@code
     *     Query.From(someArray);
     * }</pre>
	 */
	public static <T> QueryFrom<T> from(T[] array) {
		return new QueryFrom<T>(Arrays.asList(array));
	}

	/**
	 * set the list of Integer in which the query will be queried
	 * 
	 * @param list of Integer The java.util.List of Integer which the query will be queried
	 * @return a {@code QueryFromInteger} object that contains methods for querying a set of integers
	 * 
	 * <pre>{@code
     *     Query.fromInt(someIntegerList);
     * }</pre>
	 */
	public static QueryFromInteger fromInt(List<Integer> list) {
		return new QueryFromInteger(list);
	}

	/**
	 * set the Array which the query will be converted to java.util.List of Integer
	 * call the <i>fromInt</i> method which has the java.util.List parameter of Integer as parameter
	 * @param array of Integer The Array which will be converted to java.util.List of Integer
	 * @return a {@code QueryFromInteger} object that contains methods for querying a set of integers
	 * 
	 * <pre>{@code
     *     Query.From(someIntegerArray);
     * }</pre>
	 */
	public static QueryFromInteger fromInt(Integer[] array) {
		return new QueryFromInteger(Arrays.asList(array));
	}

	/**
	 * Generate a sequential ordered list of Integer and returns {@code QueryFromInteger} that contains
	 * this list.
	 * from {@code start} (inclusive) to {@code end} (exclusive) by an incremental step of 1
	 * Call the <i> range </i> method which included {@code inclusive} parameter is set to false
     * @param start the (inclusive) initial value
     * @param end the exclusive upper bound
	 * @return a {@code QueryFromInteger} object that contains methods for querying a set of integers
	 * 
	 * <pre>{@code
     *     Query.range(1,5);
     * }</pre>
	 */
	public static QueryFromInteger range(int start, int end) {
		return range(start, end, false);
	}
	
	/**
	 * Generate a sequential ordered list of Integer and returns {@code QueryFromInteger} that contains
	 * this list.
	 * from {@code start} (inclusive) to {@code end} (inclusive/ exclusive) by an incremental step of 1
	 * if {@code inclusive} parameter is true {@code end} is inclusive else {@code end} is exclusive
     * @param start the (inclusive) initial value
     * @param end the (inclusive/ exclusive) upper bound
     * @param inclusive if true inclusive, if false exclusive
	 * @return a {@code QueryFromInteger} object that contains methods for querying a set of integers
	 * 
	 * <pre>{@code
     *     Query.range(1,5,true);
     * }</pre>
	 */
	public static QueryFromInteger range(int start, int end, boolean inclusive) {
		if(inclusive) {
			return new QueryFromInteger(IntStream.rangeClosed(start, end).boxed().collect(Collectors.toList()));
		}
		return new QueryFromInteger(IntStream.range(start, end).boxed().collect(Collectors.toList()));
	}
}
