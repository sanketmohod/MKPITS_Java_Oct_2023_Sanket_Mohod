package com.mkpits.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class AscendingSort {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int arrNumber[] = new int[10];
        System.out.println("Enter 10 elements of array : ");
        for(int i=0;i<arrNumber.length;i++) {
        	arrNumber[i] = Integer.parseInt(br.readLine());
        }
        System.out.println();
        System.out.println("Ascending order of array : ");
        Arrays.sort(arrNumber); // we can used predefined method to sort the array in ascending order
        for(int n : arrNumber) {
        	System.out.println(n);
        }
	}

}
