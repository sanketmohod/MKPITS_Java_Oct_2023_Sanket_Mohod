package com.mkpits.inheritence;

public class ParentesChildClass {
         // Method / Constructor over riding (same method and having same parameters) 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ChildClass cs = new ChildClass();
        // when we are calling default constructor of child class then default constructor of parents class automatically called
        cs.getName("Rohit");
        cs.getGender("Male");
        ChildClass cs1 = new ChildClass(7821043842l);
        ChildClass cs2 = new ChildClass(12487);
        
	}

}
