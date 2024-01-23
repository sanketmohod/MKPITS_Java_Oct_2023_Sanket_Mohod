package com.mkpits.collectionlinklist;

import java.util.LinkedList;

public class LinkListAddMethod {

	public static void main(String[] args) {
		
		// creating empty link list 
		LinkedList list = new LinkedList();
		// adding elements
		list.add(45);
		list.add("Rohit");
		list.add(18);
		list.add("Virat");
		list.add(true);
		System.out.println(list);
		// adding more elements
		list.add("Dhoni");
		list.add(07);
		System.out.println("Updated list : "+list);
		

	}

}
