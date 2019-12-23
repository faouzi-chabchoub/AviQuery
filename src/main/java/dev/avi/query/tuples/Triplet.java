package dev.avi.query.tuples;
/**
 * @author faouzi
 *
 */
public class Triplet<R0,R1,R2> implements Tuple{
	private R0 value0;
	private R1 value1;
	private R2 value2;
	
	public Triplet(R0 value0, R1 value1, R2 value2) {
		this.value0 = value0;
		this.value1 = value1;
		this.value2 = value2;
	}

	public R0 getValue0() {
		return value0;
	}

	public void setValue0(R0 value0) {
		this.value0 = value0;
	}

	public R1 getValue1() {
		return value1;
	}

	public void setValue1(R1 value1) {
		this.value1 = value1;
	}

	public R2 getValue2() {
		return value2;
	}

	public void setValue2(R2 value2) {
		this.value2 = value2;
	}

}
