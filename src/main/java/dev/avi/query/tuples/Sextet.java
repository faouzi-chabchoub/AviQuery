package dev.avi.query.tuples;
/**
 * @author faouzi
 *
 */
public class Sextet<R0,R1,R2,R3,R4,R5> implements Tuple{
	private R0 value0;
	private R1 value1;
	private R2 value2;
	private R3 value3;
	private R4 value4;
	private R5 value5;
	
	public Sextet(R0 value0, R1 value1, R2 value2, R3 value3, R4 value4, R5 value5) {
		this.value0 = value0;
		this.value1 = value1;
		this.value2 = value2;
		this.value3 = value3;
		this.value4 = value4;
		this.value5 = value5;
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
	public R3 getValue3() {
		return value3;
	}
	public void setValue3(R3 value3) {
		this.value3 = value3;
	}
	public R4 getValue4() {
		return value4;
	}
	public void setValue4(R4 value4) {
		this.value4 = value4;
	}
	public R5 getValue5() {
		return value5;
	}
	public void setValue5(R5 value5) {
		this.value5 = value5;
	}

}
