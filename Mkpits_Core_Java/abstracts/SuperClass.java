package com.mkpits.abstracts;

public abstract class SuperClass {
 
	int sub1,sub2,sub3;
	int total;
	float average;
	abstract void getMethod();
	void getMarks(int sub1,int sub2,int sub3) {
		this.sub1 = sub1;
		this.sub2 = sub2;
		this.sub3 = sub3;
	}
	void getTotal() {
		total = sub1 + sub2 + sub3;
		System.out.println("Marks of three subjects is : "+total);
			
	}
	void getAverage() {
		average = total/3;
		System.out.println("Average is : "+average);
	}
	
}
