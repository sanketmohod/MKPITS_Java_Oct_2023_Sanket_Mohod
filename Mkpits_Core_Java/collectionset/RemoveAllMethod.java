package com.mkpits.collectionset;

import java.util.HashSet;
import java.util.Set;

public class RemoveAllMethod {

	public static void main(String[] args) {
        // Creating object of set which is implemented by class HasjSet
		Set<Integer> set = new HashSet<Integer>();
		// adding element to set
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(40);
		set.add(50);
		// print set
		System.out.println("Befor remove : " +set);
		// Now creating set1
		Set<Integer> set1 = new HashSet<Integer>();
		// adding elements to set1
		set1.add(30);
		set1.add(40);
		set1.add(50);
		// print set1
		System.out.println("Elements to remove from set : "+set1);
		set.removeAll(set1);
		System.out.println("After removeAll() : "+set);
		set.retainAll(set1);
		System.out.println("After retainAll() : "+set);
	}

}
