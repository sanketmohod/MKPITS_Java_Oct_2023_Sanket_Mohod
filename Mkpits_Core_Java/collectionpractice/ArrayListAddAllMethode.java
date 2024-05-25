package com.mkpits.collectionpractice;

import java.util.ArrayList;
import java.util.List;

public class ArrayListAddAllMethode {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();
		list.add(5);
		list.add(6);
		list.add(4);
		System.out.println(list);
		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(5);
		list1.add(6);
		list1.add(6);
		// addAll method it will add all the elements of another array 
		list.addAll(list1);
		System.out.println(list);
	}

}
