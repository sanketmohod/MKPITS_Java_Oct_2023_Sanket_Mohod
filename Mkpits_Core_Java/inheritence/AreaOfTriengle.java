package com.mkpits.inheritence;

public class AreaOfTriengle {
 
	 int length,brength;
	 float area;
	 void getData(int length, int brength) {
		 this.length = length;
		 this.brength = brength;
	 }
	 void getArea() {
		area =  (length * brength)/2;
		System.out.println("Area of triengle is : "+area);
	 }

}
