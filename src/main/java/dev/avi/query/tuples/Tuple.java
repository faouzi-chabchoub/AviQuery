package dev.avi.query.tuples;

/**
 * @author faouzi
 *
 */
public interface Tuple {

	static <R0,R1> Duet<R0,R1> create(R0 arg0, R1 arg1){
		return new Duet<R0,R1>(arg0,arg1);
	}
}
