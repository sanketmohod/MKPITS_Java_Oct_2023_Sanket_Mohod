package com.mkpits.collectiondemo;

import java.util.ArrayList;

public class EqualsMethod {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();
		list.add("rahul");
		list.add("pratik");
		list.add("shashank");
		for (String string : list) {
			System.out.println(string);
		}
		System.out.println("another array list with elements...");

		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("rahul");
		list1.add("aakash");
		list1.add("shashank");
		for (String string : list1) {
			System.out.println(string);
		}
		System.out.println("Equals method compare both the array list\ngives boolean value");
		boolean res = list.equals(list1);
		System.out.println("after compared : "+res);
	}

}
