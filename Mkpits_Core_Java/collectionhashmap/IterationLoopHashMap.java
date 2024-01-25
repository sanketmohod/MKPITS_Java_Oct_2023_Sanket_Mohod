package com.mkpits.collectionhashmap;

import java.util.HashMap;
import java.util.Map.Entry;
   // Iterator/Traversal/Looping
public class IterationLoopHashMap {

	public static void main(String[] args) {

		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "Karan");
		map.put(2, "Saurao");
		map.put(3, "Prajwal");
		// print size
		System.out.println("Size is : "+map.size());
		System.out.println("HashMap set : "+map);
		// loops
		for (Entry<Integer, String> entry : map.entrySet()) {
			
			System.out.println("Key : " +entry.getKey()+ " with value : "+entry.getValue());
			
		}
		
		
		
//		System.out.println("Keys value : ");
//		var keySet = map.keySet();
//		for (Integer key : keySet) {
//			System.out.println(key);
//		}
//		System.out.println("Values of keys : ");
//		var valueSet = map.values();
//		for (String value : valueSet) {
//			System.out.println(value);
//		}
		
		
		System.out.println("-------------------for each loop-----------");
		System.out.println("Keys values ; ");
		for (Integer key : map.keySet()) {
			System.out.println(key);
		}
		System.out.println("Values of keys : ");
		for (String value : map.values()) {
			System.out.println(value);
		}
		
		
		System.out.println("---------------by for each---------------");
		System.out.println("Keys values : ");
		map.keySet().forEach(System.out::println);
		System.out.println("Values os keys : ");
		map.values().forEach(System.out::println);
		
		
		System.out.println("------------By lamda expression-------------");
		System.out.println("Keys values :");
		map.keySet().forEach(k -> System.out.println(k));
		System.out.println("Values of keys : ");
		map.values().forEach(v -> System.out.println(v));
	}

}
