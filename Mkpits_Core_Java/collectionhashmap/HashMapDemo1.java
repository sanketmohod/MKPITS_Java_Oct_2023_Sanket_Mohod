package com.mkpits.collectionhashmap;

import java.util.HashMap;

public class HashMapDemo1 {

	public static void main(String[] args) {

		// creating object of hash map contains(value, key)
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		// adding elements(values, key)
		map.put("karan", 45);
		map.put("Rehan", 7);
		map.put("Saurao", 18);
		map.put("Prajwal", 7);
		map.put("karan", 10);// if value is duplicated then the preference is go for last object value
		// print size
		System.out.println("Size is : "+map.size());
		// print hash map set
		System.out.println("HashMap set : "+map);
	}

}
