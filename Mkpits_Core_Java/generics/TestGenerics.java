package com.mkpits.generics;

public class TestGenerics {

	public static void main(String[] args) {
		// 
		Test<Integer> intObj = new Test<Integer>(45);
		
		System.out.println(intObj.getObject());
		
		Test<String> stringObj = new Test<String>("Rohit");
		
		System.out.println(stringObj.getObject());

	}

}
