package com.mkpits.generics;

import java.util.ArrayList;

public class CharecterArrayList {

	public static void main(String[] args) {
		
		ArrayList<Character> charecterArray = new ArrayList<Character>();
		charecterArray.add('K');
		charecterArray.add('A');
		charecterArray.add('R');
		charecterArray.add('A');
		charecterArray.add('N');
		System.out.println("Characters are...........");
		for (Character character : charecterArray) {
			System.out.println(character);
		}

	}

}
