package com.mkpits.exceptionhandling;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MultipleCatchHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int arr[] = new int[5];
        try {
        	System.out.println(arr[6]);
        }catch(ArithmeticException e) {
        	e.printStackTrace();
        }catch(ArrayIndexOutOfBoundsException e1) {
        	e1.printStackTrace();
        }catch(Exception e2) {
        	e2.printStackTrace();
        }
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter name : ");
        try {
            int x=15,y=0;
        	System.out.println(arr[5]);// we have to use separate try catch for each exception
        	System.out.println(x/y);   // as we written multiple exception in try the it will detect only first exception
        	String name = br.readLine();
        }catch(Exception e3) {
        	e3.printStackTrace();
        }
	}

}
