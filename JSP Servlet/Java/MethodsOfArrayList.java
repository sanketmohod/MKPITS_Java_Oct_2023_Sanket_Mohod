package com.mkpits.collection;

import java.util.ArrayList;
import java.util.List;

public class MethodsOfArrayList {

	public static void main(String[] args) {
		// created object of interface List
		// implented by class ArrayList
		List<Integer> arrInteger = new ArrayList<Integer>();
		// adding elements with its index value
		arrInteger.add(0, 10);// index 0 value 10
		arrInteger.add(1, 20);// index 1 value 20
		arrInteger.add(2, 30);// index 2 value 30
		// print array of integer
		System.out.println(arrInteger); 
		
		// now creating one more array list of integer
		List<Integer> arrInteger1 = new ArrayList<Integer>();
		arrInteger1.add(10);// direct adding value from index 0
		arrInteger1.add(40);
		arrInteger1.add(50);
		arrInteger1.add(60);
		System.out.println(arrInteger1);
		
		// Now adding all elements of arrInteger to arrInteger1 at index 2
		arrInteger1.addAll(2, arrInteger);// adding arrInteger at index 2
		System.out.println(arrInteger1);
		
		// remove element at index 3 
		arrInteger1.remove(3);
		// updated array list
		System.out.println(arrInteger1);
		
		// replace index 2 with 50 in arrInteger list
		arrInteger.set(2, 50);
		// updated array list
		System.out.println(arrInteger);
		// print the index value of 1 in arrInteger1
		System.out.println(arrInteger1.get(1));
		// indexOf() method
		int indexValue = arrInteger1.indexOf(40);// it gives the index value of object
		System.out.println(indexValue);
		
		// contains() method
		boolean value = arrInteger1.contains(50);// it gives boolean value (true/false)
		System.out.println(value);
		
	}

}
