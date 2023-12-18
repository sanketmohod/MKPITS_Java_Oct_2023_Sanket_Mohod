package com.mkpits.iterative;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MatchUserAndRandom {
            
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         int count = 0;
         int i=1;
        // System.out.println(number);
         int randomNumb = (int) (Math.random()*100);
         System.out.println(randomNumb);
         for( i=1;i<=10;i++) {
         System.out.println("Enter the number : ");
         int number = Integer.parseInt(br.readLine());
         
             if(randomNumb == number) {
        		 System.out.println("Congrats You Win.");
        		 count++;
        		 System.out.println("Number of attempt : "+count);
        		 break;
        	 }else if(randomNumb>number) {
        		 System.out.println("Value of random number is greater than user input.");
        		 count++;
        	 }else {
        		 System.out.println("Value of random number is less than user input.");
        		 count++;
        	 }
        	 
        	 
         }
         if(i>=11) {
        	 System.out.println();
         System.err.println("Sorry You Lost.");
	}
	}
}

