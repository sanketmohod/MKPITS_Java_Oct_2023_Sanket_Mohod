package com.mkpits.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class SortArrayList {

	public static void main(String[] args) {
		
		List<Integer> intArray = new ArrayList<Integer>();
		//adding elements
		intArray.add(12);
		intArray.add(14);
		intArray.add(8);
		intArray.add(4);
		intArray.add(16);
		intArray.add(6);
		System.out.println("Array list  : "+intArray);
		
		// Sort array in ascending order
		Collections.sort(intArray);
		System.out.println("Ascending sort : "+intArray);
		// Sort array in descending order
		Collections.sort(intArray, Collections.reverseOrder());
		System.out.println("Descending sort : "+intArray);
	}

}
