package com.mkpits.iterative;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ForLoop {
          // Factorial of number 
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  	   System.out.println("Enter the number : ");
  	   int n = Integer.parseInt(br.readLine());
 	   int fact = 1;
	   
       for(int i=1;i<=n;i++) { 
    	       
            fact = fact * i;
    	   
    	   }
       	   System.out.println("factorial of "+n+" is : " +fact);

       }

	}


