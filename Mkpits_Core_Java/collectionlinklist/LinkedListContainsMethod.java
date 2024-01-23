package com.mkpits.collectionlinklist;

import java.util.LinkedList;

public class LinkedListContainsMethod {

	public static void main(String[] args) {

		LinkedList list = new LinkedList();
		list.add("karan");
		list.add(22);
		list.add(true);
		list.add(51.24);
		// print list
		System.out.println("Your list contains the elements : "+list);
		// .contains method
		System.out.println(list.contains(22));// it will check the value of object and gives boolean value as output
		
	}

}
