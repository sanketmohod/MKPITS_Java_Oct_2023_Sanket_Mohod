package com.mkpits.collectiondemo;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>(5);
		list.add(10);
		list.add(50);
		list.add(30);
		list.add(40);
		list.add(30);
		for (Integer integer : list) {
			System.out.println(integer);
		}
	}

}
