package com.mkpits.inheritence;
//Intermediate/Parents class
public class SubOperation extends AddOperation  {
 
	public void getSub() {
		int sub = numb1 - numb2;
		System.out.println("Subtraction of "+numb1+" and "+numb2+" is : "+sub);
	}
}
