package com.mkpits.controlflowstructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ElseIfLadder {
    //  Greatest of three number
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the value of first number : ");
        int numb1 = Integer.parseInt(br.readLine());
        System.out.println("Enter the value of second number : ");
        int numb2 = Integer.parseInt(br.readLine());
        System.out.println("Enter the value of third number : ");
        int numb3 = Integer.parseInt(br.readLine());
        if((numb1 > numb2) && (numb1 > numb3)) {
        	System.out.println("Greatest number is : "+numb1);	
        }else if((numb2 > numb1) && (numb2 > numb3)) {
        	System.out.println("Greatest number is : "+numb2);
        }else {
        	System.out.println("Greatest number is : "+numb3);
        }
	}

}
