package com.mkpits.collectionlinklist;

import java.util.LinkedList;

public class LinkedListClearMethod {

	public static void main(String[] args) {

		// creating object of LinkeList class
				LinkedList<String> list = new LinkedList<String>();
				// adding elements
				list.add("Shri sir");
				list.add("Karan");
				list.add("Ashik");
				list.add("Raj");
				list.add("Samiksha");
				System.out.println("Your list : "+list);
				// .clear method
				list.clear();//it will clear all the elements of list
				System.out.println("After clear() method : "+list);
	}

}
