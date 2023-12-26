package com.mkpits.typecasting;

public class ObjectToPrimitive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // Explicit - Between Object to primitive
		getObjectToPrim();
	}

	private static void getObjectToPrim() {
		// TODO Auto-generated method stub
		String name = "25.45";   // Here 'name' is String type object and we can store it into primitive data type 
		float num = Float.parseFloat(name); // Float - is wrapper class which help to casting if any types of value
		int num1 = (int)Float.parseFloat(name);  // calling object to primitive
		System.out.println(num);
		System.out.println(num1);
		float l = new Float(name); // casting by instance
		System.out.println(l);
		
		
	}

}
