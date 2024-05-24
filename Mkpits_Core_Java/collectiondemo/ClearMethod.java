package com.mkpits.collectiondemo;

import java.util.ArrayList;

public class ClearMethod {

	public static void main(String[] args) {

		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(11);
		list.add(12);
		list.add(13);
		
		for (Integer integer : list) {
			System.out.println(integer);
		}
		System.out.println("Clear Method..............");
		list.clear();// it delete all the elements from arraylist and gives null arra list
		System.out.println(list);
	}

}
