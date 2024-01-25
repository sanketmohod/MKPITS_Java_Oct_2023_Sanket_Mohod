package com.mkpits.collectionhashmap;

import java.util.HashMap;

public class ConstructorHashMap2 {

	public static void main(String[] args) {

		// HashMap(int initialCapacity, float loadFactor) - It creates a HashMap instance with a specified initial capacity and specified load factor.
		HashMap<Integer, String> map = new HashMap<>(3, 0.75f);
		// adding elements to map
		map.put(1, "Sunday");
		map.put(2, "Monday");
		map.put(3, "Tuesday");
		map.put(4, "Wensday");
		
		// now creating one more instance of HashMap
		HashMap<Integer, String> map1 = new HashMap<Integer, String>(5, 0.5f);
		// adding elements to map1
		map1.put(5, "Thusday");
		map1.put(6, "friday");
		map1.put(7, "Saturday");
		
		// printing map
		System.out.println("Set of map : "+map);
		System.out.println("Set of map1 : "+map1);


	}

}
