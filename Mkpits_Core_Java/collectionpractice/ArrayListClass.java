package com.mkpits.collectionpractice;

import java.util.ArrayList;
import java.util.List;

public class ArrayListClass {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();
		// adding elements to list
		list.add(10);
		list.add(20);
		list.add(30);
		System.out.println(list);
		// size() method gives the size of list
		System.out.println(list.size());
	}

}
