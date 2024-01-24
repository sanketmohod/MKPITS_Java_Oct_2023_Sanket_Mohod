package com.mkpits.collectionset;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MathUnionSet {
    // Union set - its a combination of two or more set which didn't repeat any element
	public static void main(String[] args) {

		// we required two set to find out the union
		// creating set1
		Set<Integer> set1 = new HashSet<Integer>();
		set1.addAll(Arrays.asList(new Integer[] {1, 2, 4, 8, 0, 3, 6, 7}));
		// print set1
		System.out.println(" First set : " +set1);//it print the elements of set in ascending order
		// creating set2
		Set<Integer> set2 = new HashSet<Integer>();
		set2.addAll(Arrays.asList(new Integer[] {3, 2, 3, 9, 0, 5, 1, 4}));
		// print set2
		System.out.println("Second set : "+set2);
		// Now finding union of two set
		Set<Integer> unionSet = new HashSet<Integer>(set1);
		unionSet.addAll(set2);// it add all elements and remove repeated elements
		System.out.println("Union of two set is : "+unionSet);
	}

}
