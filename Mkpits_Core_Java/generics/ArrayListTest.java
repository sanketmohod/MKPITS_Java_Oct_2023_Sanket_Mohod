package com.mkpits.generics;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {

	public static void main(String[] args) {
        // To create instance of generic class
		List<String> colorList = new ArrayList<String>();
		colorList.add("Blue");
		colorList.add("Black");
		colorList.add("White");
		colorList.add("Red");
		colorList.add("Green");
		colorList.add("Yellow");
		colorList.add("Voilet");
		for (String string : colorList) {
			System.out.println(string);
		}
	}

}
