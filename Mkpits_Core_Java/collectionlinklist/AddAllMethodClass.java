package com.mkpits.collectionlinklist;

import java.util.LinkedList;

public class AddAllMethodClass {

	public static void main(String[] args) {
        // creating object of LinkeList class
		LinkedList<String> list = new LinkedList<String>();
		// adding elements
		list.add("Shri sir");
		list.add("Karan");
		list.add("Ashik");
		list.add("Raj");
		list.add("Samiksha");
		System.out.println("First list : "+list);
		// Creating one more list
		LinkedList<String> list1 = new LinkedList<String>();
		list1.add("Pranay");
		list1.add("Vinay");
		list1.add("Hrash");
		list1.add("Regved");
		list1.add("Chetan");
		System.out.println("Second list : "+list1);
		//.addAll method
		list.addAll(list1);
		System.out.println("Updated list : "+list);
	}

}
