package com.mkpits.exceptiondemo;

public class NestedTryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // outer try block
		try {
			// inner try block
			try {
				System.out.println("going to divide by zero");
				int a = 20/0;
			} catch (ArithmeticException e) {
				// TODO: handle exception
				e.printStackTrace();
				// it trace or find out the which type of exception is occured
			}
			System.out.println("Succes");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
