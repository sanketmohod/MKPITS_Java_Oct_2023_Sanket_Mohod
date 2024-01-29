package com.mkpits.collectionlambdaex;
  
public class LambdaTest {
    // Lambda expression - Lambda Expressions in Java are the same as lambda functions which are the short block of code that accepts input as parameters and returns a resultant value.
	public static void main(String[] args) {
   
		// Creating object f interface
		// Implementing lambda expression
		TestInterface obj = x -> System.out.println(x * 5);
		// calling default method
		obj.print();

		// Now calling abstract method of interface
		obj.getParameter(5);
		
	}

}
