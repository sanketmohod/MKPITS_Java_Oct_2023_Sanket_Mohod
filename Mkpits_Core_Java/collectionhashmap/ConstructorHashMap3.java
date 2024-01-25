package com.mkpits.collectionhashmap;

import java.util.HashMap;

public class ConstructorHashMap3 {

	public static void main(String[] args) {

		// HashMap(Map map) - It creates an instance of HashMap with the same mappings as the specified map.
		HashMap<Integer, String> map = new HashMap<>();
		// adding elements to map
		map.put(1, "Sunday");
		map.put(2, "Monday");
		map.put(3, "Tuesday");
		map.put(4, "Wensday");
		
		// now creating one more instance of HashMap
		HashMap<Integer, String> map1 = new HashMap<Integer, String>(map);
		
		// printing map
		System.out.println("Set of map : "+map);
		System.out.println("Set of map1 : "+map1);
	}

}
