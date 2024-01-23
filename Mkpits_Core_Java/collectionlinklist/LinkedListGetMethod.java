package com.mkpits.collectionlinklist;

import java.util.LinkedList;

public class LinkedListGetMethod {

	public static void main(String[] args) {

		LinkedList list = new LinkedList();
		list.add("karan");
		list.add(22);
		list.add(true);
		list.add(51.24);
		// print list
		System.out.println("Your list contains the elements : "+list);
		// .get method
		System.out.println(list.get(2));//it gives the value at specific index
	}

}
