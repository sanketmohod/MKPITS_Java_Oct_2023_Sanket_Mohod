package com.mkpits.collectionhashmap;

import java.util.AbstractMap;
import java.util.IdentityHashMap;

public class AbstractMapHashCode {

	public static void main(String[] args) {

		// .hashCode - is the method which return hashcode value for specific code
		AbstractMap<String, Integer> map = new IdentityHashMap<String, Integer>();
		// adding elements
		map.put("Java", 1);
		map.put("DotNet", 2);
		map.put("Web Developement", 3);
		map.put("Angular", 4);
		// print map
		System.out.println(map);
		// .hashCode method
		System.out.println("hashcode is : "+map.hashCode());
	}

}
