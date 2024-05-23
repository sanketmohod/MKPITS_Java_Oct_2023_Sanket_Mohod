package com.mkpits.collectiondemo;

import java.util.ArrayList;
import java.util.Iterator;

class ContainsMethod {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();
		ArrayList<String> list1 = new ArrayList<String>();

		list.add("Blue");
		list.add("Red");
		
		// adding to list1
		list1.add("Blue");
		list1.add("Black");
		
		ArrayList<String> result = new ArrayList<String>();
		for (String str : list) {
			result.add(list1.contains(str)? "Yes" : "No");
		}
		System.out.println(result);
	}

}
