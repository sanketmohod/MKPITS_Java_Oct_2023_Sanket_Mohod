package com.mkpits.collectionpractice;

import java.util.ArrayList;
import java.util.List;

public class ArrayListAddSetGetMethode {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		System.out.println(list);
		list.add(2, 80);// it add the element at index value and shift remainings elements to rights
		System.out.println("after adding 80 at index 2 : "+list);
		list.set(1, 90);// it will replace the element at index value
		System.out.println("After set 90 at index 1 : "+list);
		System.out.println(list.get(4));// it will return the object value prsent at index 4
	}

}
