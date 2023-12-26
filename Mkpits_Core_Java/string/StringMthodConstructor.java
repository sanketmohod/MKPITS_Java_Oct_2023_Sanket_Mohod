package com.mkpits.string;

public class StringMthodConstructor {
	static String fName = "Karan";
    static String lName = "Mohod";
	String fName1 = new String(fName);
    
    static String fullName = "SANKETMOHOD";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringMthodConstructor scm = new StringMthodConstructor();
        scm.joinString();
        scm.arrMethod();
        scm.stringMethod();
        }
	private void joinString() {
		// TODO Auto-generated method stub
		// System.out.println(String.join(":", fName, lName));
        String name = String.join(":", fName, lName);// Delimiter(":","@"," ","-") is used to concatenate two string 
        System.out.println(name);
	}
	private void arrMethod() {
		// TODO Auto-generated method stub
		int[] arr = {61, 62, 63, 64, 65, 66};
        System.out.println(new String(arr,0,5));//return ASCII values
        char[] ch = {'k', 'a', 'r', 'a', 'n'};
        System.out.println(String.copyValueOf(ch));//used for character array to combine all character and concatenate in single string
        System.out.println(String.copyValueOf(ch, 0, 2));// it gives 2 character values start from index 0
	}
	private void stringMethod() {
		// TODO Auto-generated method stub
		// Constructors of string........
        System.out.println(fName.charAt(3));//return the character on specific index
        System.out.println(lName.chars());//return byte values
        System.out.println(fName.codePointAt(2));// return unicode code point for character
        System.out.println(lName.codePointBefore(3));// return unicode code point for character
        System.out.println(fName.codePointCount(2, 4));// return index value between the characters on index
        System.out.println(lName.compareTo(fName));// it compare unicode value(ASCII values)(character values and it ignore same character value) of each character
        System.out.println(fName.compareToIgnoreCase(lName));//it return unicode value and ignore
        // Lexicographically - compare with ASCCI value
        System.out.println(fName.concat(lName));//concatenate/ string
        System.out.println(lName.contains("hod"));//it return boolean value 
        System.out.println(fName.contentEquals("Karan"));//it return boolean value if all the content of string is match then it will be true otherwise false
        System.out.println(lName.contentEquals(lName));
        System.out.println(fullName.endsWith("D"));// it returns boolean value
        System.out.println(fullName.startsWith("S"));
        System.out.println(fName.equals(fName1));//it return boolean value if both the string are same then it will be true otherwise false
	}

	

}
