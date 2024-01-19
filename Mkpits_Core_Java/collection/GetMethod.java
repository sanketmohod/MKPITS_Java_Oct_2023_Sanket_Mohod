package com.mkpits.collection;

import java.util.ArrayList;
import java.util.List;

public class GetMethod {

	public static void main(String[] args) {
		// Created object of interface List which is implemented by class ArrayList
		List<String> list = new ArrayList<String>();
       // Adding elements
		list.add("Sanket");// index value 0
		list.add("Ananta");// index value 1
		list.add("Mohod");// index value 2
		
		// Using .get() method we can call each elements os list
		String name = list.get(0);
		String fName = list.get(1);
		String sName = list.get(2);
		System.out.println(name);
		System.out.println(fName);
		System.out.println(sName);
		System.out.println("Combine list : "+list);
		
	}

}
