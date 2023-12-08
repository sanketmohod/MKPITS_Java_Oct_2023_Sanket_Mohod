package com.mkpits.typecasting;

public class ImplicitTypeCasting {
          // Type Casting - conversion of values into one to another type(data types)
	      // Types - Implicit/Explicit
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          byte num1 = 10;
          byte num2 = 30;
          // Implicit - casting of small type value into large type value
          int num3 = num1 + num2;
          System.out.println(num3);
          long num4 = num3; // we can directly store the int type value into long type
          System.out.println(num4);    
	}	

}
