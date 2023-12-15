package com.mkpits.iterative;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumOfNaturalNumber {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number : ");
        int n = Integer.parseInt(br.readLine());
        
        int sum = 0;
        for(int i=1;i<=n;i++) {
        	sum = sum + i;
        }
        System.out.println("Sum of "+n+" natural number is : "+sum);
	}

}
