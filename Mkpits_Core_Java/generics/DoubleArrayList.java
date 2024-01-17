package com.mkpits.generics;

import java.util.ArrayList;

public class DoubleArrayList {

	public static void main(String[] args) {
		
		ArrayList<Double> doubleArray = new ArrayList<Double>();
		//doubleArray.add(21); - it gives compile time error bcoz array hold the values of type double
		doubleArray.add(21.45);
		doubleArray.add(54.47);
		doubleArray.add(32.42);
		doubleArray.add(65.45);
		doubleArray.add(20.41);
		doubleArray.add(78.90);
		System.out.println("Decimal values..............");
		for (int i = 0; i < doubleArray.size(); i++) {
			System.out.println(doubleArray.get(i));
		}
//		for (Double double1 : doubleArray) {
//			System.out.println(double1);
//		}
	}

}
