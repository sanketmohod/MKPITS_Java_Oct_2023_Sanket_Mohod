package com.mkpits.collectionset;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MathInteresectionSet {
  //  Intersection set - its a set of repeated elements of two/more set
	public static void main(String[] args) {

		// To find out set of intersection we required two/more set
		// creating set1
		Set<Integer> set1 = new HashSet<Integer>();
		set1.addAll(Arrays.asList(new Integer[] {0, 1, 8, 5, 1, 3, 7, 4}));
		//print set1
		System.out.println("First set1 : "+set1);
		// Creating set2
		Set<Integer> set2 = new HashSet<Integer>();
		set2.addAll(Arrays.asList(new Integer[] {2, 4, 5, 0, 7, 8, 9, 6}));
		// print set2
		System.out.println("Second set2 : "+set2);
		// Intersection set
		Set<Integer> intsecSet = new HashSet<Integer>(set1);
		intsecSet.retainAll(set2);// it will print set of repeated elements
		System.out.println("Intersection set : "+intsecSet);
		}
	}


