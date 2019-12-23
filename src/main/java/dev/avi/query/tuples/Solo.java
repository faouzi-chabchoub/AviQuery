package dev.avi.query.tuples;

/**
 * @author faouzi
 *
 */
public class Solo<R0> implements Tuple{
	private R0 value0;
	
	public Solo(R0 value0) {
		this.value0 = value0;
	}

	public R0 getValue0() {
		return value0;
	}

	public void setValue0(R0 value0) {
		this.value0 = value0;
	}


}
