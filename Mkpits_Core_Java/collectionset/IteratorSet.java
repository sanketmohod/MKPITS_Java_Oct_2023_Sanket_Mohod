package com.mkpits.collectionset;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;



public class IteratorSet {
    //  Iterator - is a predefind class by which we can iterate the set
	public static void main(String[] args) {
		
		Set<String> stringSet = new HashSet<String>();
		stringSet.add("Shri sir");
		stringSet.add("Karan");
		stringSet.add("Rohit");
		stringSet.add("Raj");
		stringSet.add("Ashik");
		//System.out.println(stringSet);
		Iterator<String> itr = stringSet.iterator();
		while(!itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}

}
