package com.mkpits.collectionhashmap;

import java.util.HashMap;

public class HashMapClearMethod {

	public static void main(String[] args) {

		HashMap<String, String> map = new HashMap<String, String>();
		// Adding elements
		map.put("Rohit", "Hitman");
		map.put("Virat", "King");
		map.put("Dhoni", "Master Mind");
		// print size
		System.out.println("Size is : "+map.size());
		//print map
		System.out.println("HashMap set : "+map);
		// .clear method
		map.clear();
		System.out.println("After clear() : "+map);
	}

}
