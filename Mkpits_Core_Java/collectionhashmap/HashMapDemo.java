package com.mkpits.collectionhashmap;

import java.util.HashMap;

public class HashMapDemo {
     // HashMap - A HashMap is a data structure that is used to store and retrieve values based on keys. 
	// HashMap is stores the values in (Key, value) form
	// One object(index) is used as a key of another object(value)
	// if we insert duplicate key in hashmap then it will replace the element with corresponding key
	// capacity - 16
	// it didn't provide sequence value
	// it will print the values along with key(index) element in ascending order
	// it doesn't allow duplicate key but it allows duplicate values
	public static void main(String[] args) {

		// creating the object of hash map
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		// adding key element and object value
		map.put(1, "MKPITS");// .put method use to add key element and its value
		map.put(2, "Nagpur");
		map.put(5, "Maxmall");
		map.put(3, "Sitabuldi"); // it will give the key value equal to the object value
		map.put(2, "Metro Station");// if we have a duplicate key then preference will go to the last key element
		// print size
		System.out.println("Size is : "+map.size());
		// print all elements of hash map
		System.out.println("HashMap set : "+map);
	}

}
