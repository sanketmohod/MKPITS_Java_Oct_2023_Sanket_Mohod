package com.mkpits.collection;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		
		// Non generic version
		ArrayList list = new ArrayList();//it will gives all types of data in the form of object
		list.add(45);
		list.add(24.64f);
		list.add(true);
		list.add("Rohit");
		for (Object obj : list) {  // Array list return the valuse in the form of object
			System.out.println(obj);
		}
		
		// Generic version
		ArrayList<String> arrString = new ArrayList<String>();
		arrString.add("Karan");
	    arrString.add("Sanket");
	    //arrString.add(58);  // it gives compile time error bcoz array list is bounded by type string
	    System.out.println(arrString.get(0));
	    System.out.println(arrString.get(1));
	}

}
