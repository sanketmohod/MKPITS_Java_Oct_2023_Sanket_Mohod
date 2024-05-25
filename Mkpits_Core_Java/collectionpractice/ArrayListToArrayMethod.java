package com.mkpits.collectionpractice;

import java.util.ArrayList;
import java.util.List;

public class ArrayListToArrayMethod {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
        System.out.println(list);
        // toArray() method - used to convert array list into the simple array
        Object a[] = list.toArray();
        // Object - Class Object is the root of the class hierarchy.Every class has Object as a superclass. All objects,including arrays, implement the methods of this class.
        for (Object object : a) {
        	Integer temp = (Integer)object;
			System.out.println(temp);
		}
	}

}
