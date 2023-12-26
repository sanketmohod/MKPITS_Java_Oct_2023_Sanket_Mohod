package com.mkpits.arrays;

public class StringInReverseOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String name = "Sanket Mohod";
        System.out.println(name);
       // System.out.println(name.length()); // for finding the length of string we used .length() method/function
        System.out.println();
        char ch[] = name.toCharArray(); // this method read each character of string
       // System.out.println(ch.length);   // for finding the length of array we used .length variable
        System.out.println("Reverse Order of string............");
        for(int i=name.length() - 1;i>=0;i--) {
        	System.out.print(ch[i]);
        }
	}

}
