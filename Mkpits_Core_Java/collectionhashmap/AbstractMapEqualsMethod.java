package com.mkpits.collectionhashmap;

import java.util.AbstractMap;
import java.util.IdentityHashMap;

public class AbstractMapEqualsMethod {

	public static void main(String[] args) {
		
		// AbstractMap.equals - is a method use to check the equality of two map
		AbstractMap<Integer, String> map = new IdentityHashMap<Integer, String>();
		// adding elements to map
		map.put(10, "Ten");
		map.put(20, "Twenty");
		map.put(30, "Thirty");
		map.put(40, "Fourty");
		map.put(50, "Fifty");
		
		
		// Creating one more map1
		AbstractMap<Integer, String> map1 = new IdentityHashMap<Integer, String>();
		// adding elements to map
		map1.put(10, "Ten");
		map1.put(20, "Twenty");
		map1.put(30, "Thirty");
		map1.put(40, "Fourty");
		map1.put(50, "Fifty");
		
		// print map
		System.out.println("First map : "+map);
		// print map1
		System.out.println("Second map : "+map1);
        // .equals method
		boolean value = map.equals(map1);
		System.out.println("After .equals() method : "+value);
	}

}
