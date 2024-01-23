package com.mkpits.collectionlinklist;

import java.util.LinkedList;

public class LinkListClass {
// LinkList - is a predefind class which is used to the list of elements
	public static void main(String[] args) {
		
		// Creating object of class link list
		LinkedList<String> ls = new LinkedList<String>();
		// now adding elements
		System.out.println("Add colors : ");
		ls.add("Blue");
		ls.add("Black");
		ls.add(2,"Red");
		ls.addFirst("White");
		ls.addLast("Voilet");
		System.out.println("After adding the colors list : "+ls);
		ls.remove("Red");
		ls.remove(2);
		ls.removeFirst();
		ls.removeLast();
		System.out.println("Updated list : "+ls);

	}

}
