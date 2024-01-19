package com.mkpits.generics;

public class TestTwoGenerics {

	public static void main(String []args) {
		
		TestTwoObj<String, Integer> obj = new TestTwoObj("Rohit", 45);
		obj.getObject();

		TestTwoObj<String, Integer> obj1 = new TestTwoObj("Virat", 18);
		obj1.getObject();

		TestTwoObj<String, Integer> obj2 = new TestTwoObj("Dhoni", 07);
		obj2.getObject();
		
	}
}
