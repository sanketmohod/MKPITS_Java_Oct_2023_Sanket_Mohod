package com.mkpits.generics;

public class CompareStringContent {

	public static void main(String[] args) {
		
		String str = new String("MKPITS");
		String str1 = new String("MKPITS");
		if(str.equals(str1))// it compares the contains of string
			//if(str == str1)-it gives false value bcoz '==' compare the address value
		{
			System.out.println("Both string are equals.");
		}else {
			System.out.println("Strings are not equals.");
		}
	}

}
