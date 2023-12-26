package com.mkpits.string;

public class StringBasics {
        // String - is a class type of variable used to store string values
	    // Strings are constant we can't change its value as we initialized
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String name = "Karan Mohod";
       System.out.println(name);
       System.out.println(name.length());
       String str = new String(name);// we can assign the value to another string by instance of string
       System.out.println(str);
	}

}
