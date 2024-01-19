package com.mkpits.collection;

import java.util.ArrayList;
import java.util.List;

public class SetMethodArrayList {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		// adding elements
		list.add("Rohit");
		list.add("Karan");
		list.add("Rihan");
		list.add("Dhoni");
		
		// print array list
		System.out.println("Written list of array : "+list);
		// using obj.set() method we can replace the value at any index
		list.set(1, "Sanket");
        list.set(3, "Mahi");
		System.out.println("Updated list : "+list);

	}

}
