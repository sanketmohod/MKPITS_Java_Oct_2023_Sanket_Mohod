package com.mkpits.collectionhashmap;

import java.util.HashMap;

public class ContainsValueMethod {

	public static void main(String[] args) {

		HashMap<Integer, String> map = new HashMap<Integer, String>();
		// adding element
		map.put(10, "Ten");
		map.put(7, "Seven");
		map.put(5, "Five");
		map.put(3, "Three");
		// print size 
		System.out.println("Size is : "+map.size());
		// print map
		System.out.println("HashMap set : "+map);
		// .containValue method
		boolean value = map.containsValue("Five");// it will check the object value
		System.out.println("After containValue() : "+value);
		System.out.println(map.containsValue("One"));// false
	}

}
