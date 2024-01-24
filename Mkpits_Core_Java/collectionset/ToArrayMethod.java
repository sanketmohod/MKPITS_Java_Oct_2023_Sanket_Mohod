package com.mkpits.collectionset;

import java.util.HashSet;
import java.util.Set;

public class ToArrayMethod {
    // toArray() - method is used to convert Set of elements to array form
	public static void main(String[] args) {

		Set<String> set = new HashSet<String>();
		set.add("Sunday");
		set.add("Monday");
		set.add("Tuesday");
		set.add("Wensday");
		set.add("Thusday");
		set.add("Friday");
		set.add("Saturday");
		// print
		System.out.println("Set of days : "+set);
		// Creating the array
		
		Object arr[] = set.toArray();
		System.out.println("Array form : ");
        for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
        
	}

}
