package com.mkpits.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArmstrongNumber {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		int ramainder,result=0;
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       System.out.println("Enter the number : ");
       int n = Integer.parseInt(br.readLine());
       int number = n;
       while(number != 0) {
    	   ramainder = number % 10;
    	   result = (int) (result + Math.pow(ramainder, 3));
    	   number = number / 10;
       }
       if(result == n) {
    	   System.out.println("Number is armstrong.");
       }
       else
       {
    	   System.out.println("Number is not armstrong.");
       }
	}

}
