package com.mkpits.scopeofvariable;

public class StaticVariable {
	static int staticVariable = 15;
    static String stringName = "karan mohod";
	public static void main(String[] args) {
		  String name1 = "Sanket";
		// Static variable - Class variable - reference variable
        // Definition - the variable is declare by the static key word
		// static variable is declare within the class and method
		// Implementation
		// static int a = 10; - we can not declare static variable inside any method
	    System.out.println(name1);
		System.out.println("staticVariable = "+staticVariable);
		// we can call static variable by direct using variable name
	    // we can access the static variable inside the method
		
		
	} 
	void operations() {
		int a = 20,b = 5;
		int sum = a + b;
		int sub = a - b;
		int mul = a * b;
		float div = a / b;
		int mod = a % b;
		System.out.println("sum is : "+sum);
		System.out.println("sub is : "+sub);
		System.out.println("mul is : "+mul);
		System.out.println("div is : "+div);
		System.out.println("mod is : "+mod);
	}
	
	static {
		// static is a block has first preference in java we can access it within the class
		// we used static block when we want to access some type of data before execution of main method
		// we can call it anywhere within the class
		String name = "Karan";
		String email = "karanmohod19@gmail.com";
		System.out.println(name);
		System.out.println(email);
	}
	
}	    
