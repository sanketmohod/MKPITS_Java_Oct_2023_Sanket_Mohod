package com.mkpits.typecasting;

public class PrimitiveToObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // Explicit - Primitive to object type casting
		getPrimToObject();
		
	}

	private static void getPrimToObject() {
		// TODO Auto-generated method stub
		int rollNumb = 45;
		Integer integer = new Integer(rollNumb); // using wrapper class Integer we can cast primitive value to the object
		System.out.println(integer);
		long longNumb = 1484545425l;
		Long l = new Long(longNumb);    // ()
		System.out.println(l);
		Float f = new Float(longNumb);
		System.out.println(f);
		Double d = new Double(longNumb);
		System.out.println(d);
		String name = "777";
		Integer i = Integer.parseInt(name);  // String value to integer 
		System.err.println(i);
		Float f1 = Float.parseFloat(name);
		System.err.println(f1);
		Double d1 = Double.parseDouble(name);
		System.err.println(d1);
		
	}

}
