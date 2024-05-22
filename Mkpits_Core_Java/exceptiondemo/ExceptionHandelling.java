package com.mkpits.exceptiondemo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExceptionHandelling {

	public static void main(String[] args) {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number : ");
		
		try {
			int num = Integer.parseInt(br.readLine());
			// it throws the exception inst
			if(num%2==0) {
				System.out.println("You have entered even number");
			}else {
				System.out.println("You have entered odd numbers");
			}
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
