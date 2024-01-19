package com.mkpits.generics;
// we use <> to specify parameteries type
public class Test<T> {

	T obj;
	Test(T obj){
		this.obj = obj;
		
	}
	public T getObject() {
		return this.obj;
	}
}



    