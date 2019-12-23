package dev.avi.query.list;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

import dev.avi.query.tuples.Duet;

/**
 * @author faouzi
 *
 */
class QuerySelectDuet<T,R0,R1> extends QuerySelect<T,Duet<R0,R1>>{

	private  Function<T, R0> arg0;
	private  Function<T, R1> arg1;

	public QuerySelectDuet(QueryList<T> queryList, Function<T, R0> arg0, Function<T, R1> arg1) {
		super(queryList);
		this.arg0= arg0;
		this.arg1= arg1;
	}

	public List<Duet<R0, R1>> toList() {
		List<Duet<R0,R1>> list = new ArrayList<Duet<R0,R1>>();
		getList().forEach(e->{
			Duet<R0,R1> pair =new Duet<R0,R1>(arg0.apply(e),arg1.apply(e));
			list.add(pair);
		}); 
		return list;
	}

}
