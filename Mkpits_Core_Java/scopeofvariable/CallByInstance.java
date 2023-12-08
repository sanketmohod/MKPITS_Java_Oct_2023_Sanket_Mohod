package com.mkpits.scopeofvariable;

public class CallByInstance {

	public static void main(String[] args) {
		// we can access static variable into the other class by using instance variable
		// instance - the variable declared inside the class but outside the scope of block, constructor and method are known as instance variable
		StaticVariable st = new StaticVariable();
		// here, StaticVariable - class
		// st - object of class
		// new StaticVariable - instance of class
		System.out.println(new StaticVariable().staticVariable);
		// calling variable by instance of the class
		// we can call static variable by using object of the class
		System.out.println(st.stringName);
		st.operations();  // we can call the method by objectName.methodName
		
		
	}
        
}
