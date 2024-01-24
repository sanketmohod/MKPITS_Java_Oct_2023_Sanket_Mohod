package com.mkpits.collectionset;

import java.util.HashSet;
import java.util.Set;

public class SetSizeMethod {
    // .size() - method is used to find the size of set or gives the number of elements presents in  the set
	public static void main(String[] args) {
        // Creating object of Set
		// Implemented by HashSet
		Set<Integer> set = new HashSet<Integer>();
		// adding elements
		set.add(07);
		set.add(10);
		set.add(17);
		set.add(18);
		set.add(45);
		// print 
		System.out.println("Your set : "+set);
		// .size() method
		System.out.println("Size of set is : "+set.size());
	}

}
