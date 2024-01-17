package com.mkpits.generics;

import java.util.ArrayList;

public class BooleanArrayList {
	static Boolean isActive,isPresent=true,isNumber;

	public static void main(String[] args) {

		ArrayList<Boolean> booleanArray = new ArrayList<Boolean>();
		booleanArray.add(true);
		booleanArray.add(isActive);//it gives default value of boolean - null
		booleanArray.add(isPresent);// it gives true - initialized by boolean value true
		booleanArray.add(false);
		booleanArray.add(isNumber);
		System.out.println("Boolean values...........");
		for (Boolean boolean1 : booleanArray) {
			System.out.println(boolean1);
		}

	}

}
