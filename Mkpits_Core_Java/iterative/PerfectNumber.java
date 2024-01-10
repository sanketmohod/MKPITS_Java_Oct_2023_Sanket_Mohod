package com.mkpits.iterative;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PerfectNumber {
	// check weather the number is perfect or not
	// perfect number - the number whose sum of all factorial is same as given
	// number
	// eg. 28 - 1, 2, 4, 7, 14 (1+2+4+7+14 = 28)
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		PerfectNumber pr = new PerfectNumber();
		pr.getPrfectNumber();
	}

	private void getPrfectNumber() throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int sum = 0;
		System.out.println("Enter your number : ");
		int num = Integer.parseInt(br.readLine());
		for (int i = 1; i < num; i++) {
			if (num % i == 0) {
				sum = sum + i;
			}
		}
		if (sum == num) {
			System.out.println("Perfect number.");
		} else {
			System.out.println("Not Perfect number.");
		}
	}
}
