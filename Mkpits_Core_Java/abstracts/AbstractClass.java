package com.mkpits.abstracts;

public class AbstractClass {
     // Abstraction - is the process of hiding the details information from user and provide only the functionality
	 // it achieved by abstract class, methods and interface
	 // abstract class - it can't instantiate by its own (Inherited by other class)
	 // Can't be used to create object
	 // abstract method can only be create in abstract class(abstract method don't have a body we can access the method into inherited class)
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubClass sc = new SubClass();
		sc.getMethod();
		sc.getMarks(80, 85, 87);
		sc.getTotal();
		sc.getAverage();
		sc.getCheck();
		
	}

}
