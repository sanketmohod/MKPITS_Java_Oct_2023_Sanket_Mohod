package com.mkpits.abstracts;

public class SubClass extends SuperClass {

	void getCheck() {
		if((sub1>35 && sub1<50) && (sub2>35 && sub2<50) && (sub3>35 && sub3<50) && (average>35 && average<50)) {
			System.out.println("Pass");
		}else if((sub1>=50 && sub2<70) && (sub2>=50 && sub2<70) && (sub3>=50 && sub3<70) && (average>=50 && average<70)) {
			System.out.println("Grade c");
		}else if((sub1>=70 && sub1<80) && (sub2>=70 && sub2<80) && (sub3>=70 && sub3<80) && (average>=70 && average<80 )) {
			System.out.println("Grade B");
		}else if((sub1>=80) && (sub2>=80) && (sub2>=80) && (average>=80)) {
			System.out.println("First Class");
		}else {
			System.out.println("Fail");
		}
	}

	@Override
	void getMethod() {
		// TODO Auto-generated method stub
		System.out.println("This is my abstract class.");
	}

	
}
