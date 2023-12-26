package com.mkpits.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SortingNumber {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter 5 numbers : ");
        int arr[] = new int[5];
        // User input
		for(int i=0;i<arr.length;i++) {
        	arr[i] = Integer.parseInt(br.readLine());
        }
		// Output
		System.out.println();
		System.out.println("Output........");

		for(int i=0;i<arr.length;i++) {
			System.out.println("Number of arr["+i+"] : "+arr[i]);
        }
		// Sorting in ascending order
		System.out.println();
		System.err.println("Sorting in ascending order : ");

        for(int i=0;i<arr.length;i++) {
        	for(int j=i+1;j<arr.length;j++) {
        		if(arr[i]>arr[j]) {       // if we want to arrange elements in descending order then reverse the condition if(arr[i]<arr[j])
        			int temp = arr[i];
        			arr[i]=arr[j];
        			arr[j]=temp;
        		}
        	}
        }
        for(int i=0;i<arr.length;i++) {
        	System.out.println(arr[i]);
        }
	}

}
