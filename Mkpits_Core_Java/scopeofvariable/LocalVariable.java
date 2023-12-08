package com.mkpits.scopeofvariable;

public class LocalVariable {

	public static char[] localVariable;

	public static void main(String[] args) {
		// Scope - is nothing but the flexibility of variable i.e. accessibility of variable 
	    // Local variable - auto variable 
		// definition - the variable which declare inside any method or we can say pass as a argument to any method.
	    // Implementation
		
		int localVariable = 10;
		// we can not access the local variable out side the method
		// how to call local variable
		
	    System.out.println("localVariable = "+localVariable);
	   
		
	}
	   // System.out.println("localVariable = "+localVariable);
	// we can not access the local variable out side the method
}
