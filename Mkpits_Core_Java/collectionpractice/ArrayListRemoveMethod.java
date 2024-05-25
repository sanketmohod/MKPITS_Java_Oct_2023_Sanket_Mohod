package com.mkpits.collectionpractice;

import java.util.ArrayList;
import java.util.List;

public class ArrayListRemoveMethod {

	public static void main(String[] args) {
//
//		List<String> list = new ArrayList<String>();
//		list.add("karan");
//		list.add("rahul");
//		list.add("sumit");
//		System.out.println(list);
//		// remove() method - remove the object from the list
//		list.remove("karan");// it will take object as a argument or index value of object
//		System.out.println("after removed : "+list);
//		list.remove(1);// it will remove the element at index value 1
//		System.out.println("after removed index element at position 1 : "+list);
		
		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(10);
		list1.add(20);
		list1.add(30);
		list1.add(1);
		System.out.println(list1);
		// remove method() as we have integer array then we have to pass index value as argument
		list1.remove(1);
		System.out.println(list1);
		list1.remove(20); // it throws indexOutOfBoundException
		System.out.println(list1);
	}

}
