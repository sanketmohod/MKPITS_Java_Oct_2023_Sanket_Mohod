package com.mkpits.collectionhashmap;

import java.util.HashMap;

public class EntrySetHashMap {

	public static void main(String[] args) {
		
		// entrySet() - it gives the element in set (in Square bracket)
		HashMap<String, String> map = new HashMap<String, String>();
		// Adding elements
		map.put("Rohit", "Hitman");
		map.put("Virat", "King");
		map.put("Dhoni", "Master Mind");
		// print size
		System.out.println("Size is : "+map.size());
		//print map
		System.out.println("HashMap set : "+map);
		// .entrySet method provides the set of given HashMap
		System.out.println("After entrySet() : "+map.entrySet());
	}

}
