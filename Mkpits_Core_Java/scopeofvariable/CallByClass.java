package com.mkpits.scopeofvariable;

public class CallByClass {

	public static void main(String[] args) {
		// we can call static variable into the other class by class name
		// CallByClass - System.out.println(className.Variablename);
        System.out.println(StaticVariable.staticVariable);
        // we can call static variable by giving class name
        System.out.println(LocalVariable.class); // it gives the address of that class
        // we can not access local variable into the other class
        System.out.println(StaticVariable.stringName);
        
	}

}
