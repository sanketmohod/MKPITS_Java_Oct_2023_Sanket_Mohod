package com.mkpits.collection;

import java.util.ArrayList;
import java.util.List;

public class RemoveMethod {

	public static void main(String[] args) {
		
		List<String> arrString = new ArrayList<String>();
		// adding elements 
		arrString.add("MI");
		arrString.add("CSK");
		arrString.add("RCB");
		arrString.add("SRH");
		arrString.add("KKR");
		arrString.add("RR");
		arrString.add("KXIP");
		// print list of teams
		System.out.println(arrString);
		
		// remove() method
		arrString.remove(3);// it remove the index value
		System.out.println("Uodated list : "+arrString);
		arrString.remove(5);
		System.out.println("Last Updated list : "+arrString);
	}

}
