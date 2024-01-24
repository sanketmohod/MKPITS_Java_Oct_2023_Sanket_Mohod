package com.mkpits.collectionset;

import java.util.HashSet;
import java.util.Set;

public class ContainsAllMethod {

	public static void main(String[] args) {
		
		Set<String> set = new HashSet<String>();
		// adding elements to set
		set.add("Rohit");
		set.add("Virat");
		set.add("Dhoni");
		set.add("Surya");
		// print set
		System.out.println(set);
		// Now creating one more set1
		Set<String> set1 = new HashSet<String>();
		// adding elements to set1
		set1.add("Virat");
		set1.add("Dhoni");
		set1.add("Rohit");
		set1.add("Surya");
		// print set1
		System.out.println(set1);
		// .containAll method
		System.out.println(set.containsAll(set1));// it gives boolean value (true/false)
		
	}

}
