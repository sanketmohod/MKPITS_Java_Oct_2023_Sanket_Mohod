package com.mkpits.collectionhashmap;

import java.util.HashMap;

public class GetHashMapMethod {

	public static void main(String[] args) {

		// .get() - is it takes the value of key object and give its value(object)
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		// adding elements 
		map.put(1, "Allu Arjun");
		map.put(2, "Rocky");
		map.put(3, "RamCharan");
		
		
		// creating one more instance
		HashMap<String, Integer> map1 = new HashMap<String, Integer>();
		// adding elements
		map1.put("Arijit Singh", 4);
		map1.put("Atif Aslam", 5);
		map1.put("Sonu Nigham", 6);
		// print map
		System.out.println("HashMap is : "+map);
		//print map1
		System.out.println("HashMap of map1 is : "+map1);
		// .get method 
		System.out.println(map.get(2));//it will gives the value of key 2 - Rocky
		System.out.println(map1.get("Sonu Nigham"));
	}

}
