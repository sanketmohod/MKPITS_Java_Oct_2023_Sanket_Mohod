package com.mkpits.collectionset;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MathDifferenceSet {
     // Difference of set - it will gives the set of elements which didn't contain both the set  
	public static void main(String[] args) {
        // we required two set to find out the difference of two set
		
		Set<Integer> set1 = new HashSet<Integer>();
		set1.addAll(Arrays.asList(new Integer[] {0, 1, 4, 5, 6, 3, 7, 9}));
		//print set1
		System.out.println("First set1 : "+set1);
		// Creating set2
		Set<Integer> set2 = new HashSet<Integer>();
		set2.addAll(Arrays.asList(new Integer[] {2, 4, 5, 0, 7, 8, 9, 6}));
		// print set2
		System.out.println("Second set2 : "+set2);
		// Difference set
		Set<Integer> diffSet = new HashSet<Integer>(set1);
		diffSet.removeAll(set2);
		// it will compare the set1 with set2 and gives the set of elements which are present in set1 but not in set2
		System.out.println("Difference of two set : "+diffSet);
	}

}
