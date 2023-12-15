package com.mkpits.opretors;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConditionalOperator {
       // Conditional/ternary operator
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         System.out.println("Enter the first number : ");
         int numb1 = Integer.parseInt(br.readLine());
         System.out.println("Enter the second number : ");
         int numb2 = Integer.parseInt(br.readLine());
          System.out.println((numb1>numb2)? ""+numb1+" is greater" : ""+numb2+" is greater");
       // String result =  (numb1>numb2)? ""+numb1+" is greater" : ""+numb2+" is greater";
       // System.out.println(result);
	}

}
