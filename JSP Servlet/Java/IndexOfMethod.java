package com.mkpits.collection;

import java.util.ArrayList;
import java.util.List;

public class IndexOfMethod {

	public static void main(String[] args) {

		List<Integer> arrInteger = new ArrayList<Integer>();
		// Adding elements
		arrInteger.add(45);
		arrInteger.add(18);
		arrInteger.add(10);
		arrInteger.add(45);
		arrInteger.add(18);
		arrInteger.add(07);
		// Print array list
		System.out.println(arrInteger);
		// finding index value of 45
		System.out.println(arrInteger.indexOf(45));// index value 0
		// finding last element of 45
		System.out.println(arrInteger.lastIndexOf(45));// index value 3
		System.out.println(arrInteger.indexOf(18));// index value 1
		System.out.println(arrInteger.lastIndexOf(18)); // index value 4
		
	}

}
