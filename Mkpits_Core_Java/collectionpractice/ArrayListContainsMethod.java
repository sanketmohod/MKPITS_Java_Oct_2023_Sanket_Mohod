package com.mkpits.collectionpractice;

import java.util.ArrayList;
import java.util.List;

public class ArrayListContainsMethod {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(11);
		list.add(12);
		list.add(13);
		System.out.println(list);
		// contains() method - it returns boolesn(true/false) value
		boolean res = list.contains(12);// it takes the object values as arguments
		System.out.println(res);
		
		// containsAll() method it will check two array list with havining same elements
		// creating another list

		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(14);
		list1.add(12);
		list1.add(13);
		boolean res1 = list.containsAll(list1);// it will take collection object(list object) as a argument
		System.out.println(list1);
		System.out.println(res1);
	}
}
