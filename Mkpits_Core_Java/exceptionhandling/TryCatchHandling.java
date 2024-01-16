package com.mkpits.exceptionhandling;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TryCatchHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int arr[] = new int[5];
        try {
        	System.out.println(arr[5]);
        }catch(ArrayIndexOutOfBoundsException e) {
        	e.printStackTrace();
        }
        int x=12,y=0;
        try {
        	System.out.println(x/y);
        }catch(ArithmeticException e) {
        	e.printStackTrace();
        }
        System.out.println("Exception");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your name : ");
        try {
        String name = br.readLine();
        }catch(Exception e) {
        	e.printStackTrace();
        }finally {
        	System.out.println("Exception is closed.");
        }
	}

}
