package com.mkpits.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

public class AddMethod {

	public static void main(String[] args) {
		// created the object of interface List
		// which is implemented by class ArrayList
		List<String> list = new ArrayList<String>();
		// Using add method adding elements in array list
		list.add("Karan");// index 0
		list.add("Mohod");// index 1
		list.add(1, "@");// addind @ at index 1 and index one will be replace by index 2
		// adding string
		
		StringJoiner joiner = new StringJoiner(" ");//StringJoiner is the predefind class which is used to join the string
		StringJoiner str = joiner.add(list.get(0)).add(list.get(1));
		System.out.println("After joinning of two string : "+str);
        
		// print list of string
		System.out.println(list);

	}

}
