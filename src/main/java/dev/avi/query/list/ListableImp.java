package dev.avi.query.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

abstract class ListableImp<T,R> implements Listable<T,R>{
	
	ListableImp() {}
	
	protected QueryList<T> queryList = null;
	
	protected ListableImp(QueryList<T> queryList) {
		this.queryList = queryList;
	}
	
	protected List<T> getList(){
		return queryList.getList();
	}

	protected void setList(List<T> list) {
		queryList.setList(list);
	}

	//--------------------
	public abstract List<R> toList() ;

	//public abstract Object distinct() ;
	//-------------------------------
	public List<R> toListOrElse(List<R> arg0){
		List<R> res = toList();
		if(res==null||res.size()==0) {
			return arg0 ;
		}
		return res ;
	}

	public <E extends Exception> List<R> toListOrElseThrow(Supplier<E> exceptionSupplier) throws E{
		List<R> res = toList();
		if(res==null||res.size()==0) {
			throw exceptionSupplier.get();
		}
		return res ;
	}
	
	public List<R> evenRows(){
		List<R> res = toList();
		List<R> res1 = new ArrayList<>();
		for (int i = 0; i < res.size(); i++) {
			if(i%2==0) {
				res1.add(res.get(i));
			}
		}
		return res1 ;
	}

	public List<R> oddRows(){
		List<R> res = toList();
		List<R> res1 = new ArrayList<>();
		for (int i = 0; i < res.size(); i++) {
			if(i%2!=0) {
				res1.add(res.get(i));
			}
		}
		return res1 ;
	}

	public R first(){
		return toList().get(0) ;
	}

	public R firstOrElse(R arg0){
		List<R> res = toList();
		if(res==null || res.size()==0) {
			return arg0;
		}
		return toList().get(0) ;
	}

	public <E extends Exception> R firstOrElseThrow(Supplier<E> exceptionSupplier) throws E{
		List<R> res = toList();
		if(res==null || res.size()==0) {
			throw exceptionSupplier.get();
		}
		return toList().get(0) ;
	}

	public R last(){
		List<R> res = toList();
		return res.get(res.size()-1) ;
	}
	
	public int count(){
		return toList().size() ;
	}

	public R random(){
		List<R> res = toList();
		return res.get(new Random().nextInt(count())) ;
	}

	public boolean isPresent(){
		List<R> res = toList();
		return res!=null && res.size()>0 ;
	}

}
