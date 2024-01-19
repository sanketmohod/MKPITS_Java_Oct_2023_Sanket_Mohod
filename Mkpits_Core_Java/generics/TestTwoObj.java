package com.mkpits.generics;
  // here, we are passing two parameterized type
public class TestTwoObj<S, I> {
    // S - String object, I - Integer
	S obj;
	I obj1;
	TestTwoObj(S obj, I obj1){ // Constructor
		this.obj = obj;
		this.obj1 = obj1;
	}
	public void getObject() {
		System.out.println(obj);
		System.out.println(obj1);
	}
}
