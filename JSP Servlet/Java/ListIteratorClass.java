package com.mkpits.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorClass {

	public static void main(String[] args) {
		
		List<Integer> intArray = new ArrayList<Integer>();
		// adding elements
		intArray.add(10);
		intArray.add(20);
		intArray.add(30);
		intArray.add(40);
		intArray.add(50);
		// print the elements of array
		System.out.println(intArray);
		// Now implementing Iterator
		ListIterator<Integer> ls = intArray.listIterator();
		System.out.println("Froword series : ");
		while(ls.hasNext()) {
			System.out.println(ls.next());
		}
		System.out.println("Backward series : ");
		while(ls.hasPrevious()) {
			System.out.println(ls.previous());
		}

	}

}
