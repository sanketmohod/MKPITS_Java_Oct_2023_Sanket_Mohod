package com.mkpits.collectionpractice;

import java.util.ArrayList;
import java.util.List;

public class ArrayListSubListMethod {

	public static void main(String[] args) {

		List<String> fruits = new ArrayList<String>();
		fruits.add("mango");
		fruits.add("banan");
		fruits.add("graps");
		fruits.add("apple");
		System.out.println("liat of fruits : "+fruits);
		// subList() methode
		// sub list is the list of elements so we have to create another list to create a sublist of fruits
		List<String> subList = fruits.subList(1, 3);
		// herethis method is take index value as a argument
		// 1 - include, 3 - exclude so it will count the elements from index 1 to 2, index 3 is not included
		for (String string : subList) {
			System.out.println(string);

		}
	}

}
