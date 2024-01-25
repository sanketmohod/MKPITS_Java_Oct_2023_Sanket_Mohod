package com.mkpits.collectionhashmap;

import java.util.HashMap;

public class RemoveMethodHashMap {

	public static void main(String[] args) {

		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(2, "Even");
		map.put(3, "Odd");
		map.put(23, "EvenOdd");
		map.put(32, "OddEven");
		// print size
		System.out.println("Size is : "+map.size());
		// print HashMap
		System.out.println("HashMap set is : "+map);
		// .remove method
		map.remove(3);// it takes key value 
		System.out.println("After remove() : "+map);
		
	}

}
