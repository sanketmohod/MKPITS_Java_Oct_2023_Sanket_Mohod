package com.mkpits.collectionhashmap;

import java.util.HashMap;

public class HashMapCloneMethod {

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
		// .clone method
		
		System.out.println("After clone() : "+map.clone());
	
	}

}
