package com.mkpits.collection;

import java.util.ArrayList;

public class ArrayListTypeCasting {

	public static void main(String[] args) {
	
		Integer[] arr = new Integer[10];
		arr[0] = 45;
		int x = arr[0];
        
		// Non generic version
		ArrayList list = new ArrayList();
		list.add(45);
		int numb = (int) list.get(0);//it return the object value so we have to type cast 
		System.out.println(numb);
		list.add("Rahul");
		String str = (String) list.get(1);
		System.out.println(str);
		
		// Generic version
		ArrayList<Double> arrDouble = new ArrayList<Double>();
		arrDouble.add(54.45);
		double d = arrDouble.get(0);
		System.out.println(d);
	}

}
