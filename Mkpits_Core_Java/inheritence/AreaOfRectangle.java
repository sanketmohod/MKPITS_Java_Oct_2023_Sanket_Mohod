package com.mkpits.inheritence;

public class AreaOfRectangle extends AreaOfTriengle {

	void getArea() {
		
		area = length * brength;
		System.out.println("Area of rectangle is : "+area);
	}
}
