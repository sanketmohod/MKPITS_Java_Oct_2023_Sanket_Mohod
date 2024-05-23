package com.mkpits.collectiondemo;

import java.util.ArrayList;

public class ReplaceElement {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
        for (Integer integer : list) {
			System.out.println(integer);
		}
        // replace 2 element with other value
        list.set(2, 80);
        System.out.println(list);

	}

}
