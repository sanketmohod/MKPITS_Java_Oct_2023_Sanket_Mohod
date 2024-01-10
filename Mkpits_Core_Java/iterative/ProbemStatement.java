package com.mkpits.iterative;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProbemStatement {
	// sum of digit is single digit eg. 456 - 15 - 6
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		int rem;
		int result=0,res=0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number : ");
		int numb = Integer.parseInt(br.readLine());
		while (numb != 0) {
			rem = numb % 10;
			result = result + rem;
			numb = numb / 10;
		}
		
		while(result!=0) {
			rem = result % 10;
			res = res + rem;
			result = result / 10;
		}
		System.out.println(res);
	}
}
