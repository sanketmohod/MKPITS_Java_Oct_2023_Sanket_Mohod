package com.mkpits.collectionlinklist;

import java.util.LinkedList;

public class LinkedListCloneMethod {

	public static void main(String[] args) {
		
		LinkedList<String> list1 = new LinkedList<String>();
		list1.add("Pranay");
		list1.add("Vinay");
		list1.add("Hrash");
		list1.add("Regved");
		list1.add("Chetan");
		System.out.println("Your list : "+list1);
		// .clone method
		list1.clone();
		System.out.println("After clone : " +list1);
		

	}

}
