package com.mkpits.collection;

import java.util.ArrayList;

public class ArrayTypeSafty {

	public static void main(String[] args) {
		
		Integer[] arr = new Integer[10];
		arr[0] = 14;
		arr[1] = 25;
		//arr[2] = "MKPITS"; // it gives compile time error bcoz array of type Integer
		
		Integer i = 20;
		// Instance of
		System.out.println(i instanceof Integer);// it will gives the boolean value as output
		
		// non generic version
		ArrayList list = new ArrayList();
		list.add(45);
		list.add(12.45f);
		list.add(true);
		list.add("Karan");
		for (Object obj : list) {
			System.out.println(obj);
		}
		
		// Generic version
		ArrayList<String> arrString = new ArrayList<String>();
		arrString.add("Amaravati");
		arrString.add("Nagpur");
		arrString.add("Pune");
		arrString.add("Akola");
		arrString.add("Yevatmal");
		for (String str : arrString) {
			System.out.println(str);
		}

	}

}
