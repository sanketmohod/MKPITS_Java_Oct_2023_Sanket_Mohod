package com.mkpits.collection;

import java.util.ArrayList;
import java.util.List;

public class EqualsMethod {
    
	public static void main(String[] args) {

		List<String> strArray = new ArrayList<String>();
		// adding elements
		strArray.add("Dog");
		strArray.add("Cat");
		strArray.add("Tiger");
		strArray.add("Goat");
		strArray.add("Rabbit");
		// print
		System.out.println("Elements os first array : "+strArray);
		// .equals() method - compare the contains 
		// it gives boolean value(true/false) as output
		boolean result = strArray.get(2).equals("Tiger");
		System.out.println(result);// it compares index value with the object
		boolean result1 = strArray.get(1).equals("Tiger");
		System.out.println(result1);
        
		// Now creating one more array list of String
		
		List<String> list = new ArrayList<String>();
		list.add("Ship");
		list.add("Hours");
		list.add("Tiger");
		list.add("Loin");
		list.add("Dog");
		System.out.println("Elements of second array : "+list);
		// Now compare the elements of two different list
		boolean result2 = list.get(2).equals(strArray.get(2));
		// after comparing index value of both the array list
		System.out.println(result2);
	}

}
