package com.mkpits.collectionhashmap;

import java.util.HashMap;

public class ContainsKeyMethod {

	public static void main(String[] args) {

		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("January", 1);
		map.put("April", 4);
		map.put("July", 7);
		map.put("September", 9);
		map.put("December", 12);
		// print size
		System.out.println("Size is : "+map.size());
		// print map
		System.out.println("HashMap set : "+map);
		// containsKey() method
		System.out.println(map.containsKey("July"));// it will gives boolean value true/false
		System.out.println(map.containsKey("rohit")); //false
		System.out.println(map.get("July"));// it will gives the key value of July which is 7
		if(map.containsKey("April")) {
			Integer key = map.get("April");
			System.out.println("Vlue of key April is : "+key);

		}
		
	}

}
