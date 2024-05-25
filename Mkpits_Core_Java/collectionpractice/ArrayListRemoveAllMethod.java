package com.mkpits.collectionpractice;

import java.util.ArrayList;
import java.util.List;

public class ArrayListRemoveAllMethod {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
        System.out.println(list);
        // creating another array of elements to be remove from list
        List<Integer> list1 = new ArrayList<Integer>();
		list1.add(1);
		list1.add(8);
		list1.add(3);
		System.out.println(list1);
		// removeAll() method
		list.removeAll(list1);// it will remove all the elements from the list that are present in list1
		System.out.println(list);
	}

}
