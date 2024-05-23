package com.mkpits.collectiondemo;

import java.util.ArrayList;

public class JoinTwoArrayList {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>();
		ArrayList<Integer> list1 = new ArrayList<Integer>();

		list.add(10);
		list.add(20);
		list.add(30);
		
		list1.add(40);
		list1.add(50);
		list1.add(60);
		
		for (Integer integer : list) {
			System.out.println(integer);
		}
		
		System.out.println("adding elements to lins1.....");
		for (Integer integer : list1) {
			System.out.println(integer);
		}
		
		list.addAll(list1);
		System.out.println("Combine Two ArrayList....");
		
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		list2.addAll(list);
		System.out.println(list2);
		
	}

}
