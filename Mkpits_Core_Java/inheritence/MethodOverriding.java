package com.mkpits.inheritence;

public class MethodOverriding {
// Method overriding - same method with same parameter basically use in inheritance 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         AreaOfTriengle ar = new AreaOfTriengle();
         ar.getData(25, 20);
         ar.getArea();
         
         ar = new AreaOfRectangle();// calling constructor of sub class using object reference of super class
         ar.getData(40, 30);
         ar.getArea();
		
         
//         AreaOfTriengle ar = new AreaOfRectangle();
//         ar.getData(25, 20);
//         ar.getArea();
//         
//         ar = new AreaOfTriengle();// calling constructor of sub class using object reference of super class
//         ar.getData(40, 30);
//         ar.getArea();
	}

}
