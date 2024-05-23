package com.mkpits.collectiondemo;

import java.util.ArrayList;

public final class CloneMethod {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
	    list.add(30);
	    for (Integer integer : list) {
			System.out.println(integer);
		}
	    System.out.println("Clone method......");
		ArrayList<Integer> list1 = new ArrayList<Integer>();
        list1 = (ArrayList)list.clone();
        System.out.println(list1);
	}
	
}
