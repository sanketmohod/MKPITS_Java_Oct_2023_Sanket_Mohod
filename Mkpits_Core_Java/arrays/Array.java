package com.mkpits.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Array {
    //Array - is an collection of similar data items.
	// array is start with the index value of '0' - bcoz of addressing
	// Arrays are used to store multiple values in a single variable.
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
        // Declaration of array
		int arr[];
		int []arr1;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// Construction/Initialization of array
		// Assigning values to array
		String name[] = {"karan","aashik","raj","rohit"};
		// length of array
		System.out.println("Length of array : "+name.length);
		int arr2[] = new int[5];
		System.out.println("length of array arr2[] : "+arr2.length);
		System.out.println();
		System.out.println("Enter the 5 elements : ");

		for(int i=0;i<arr2.length;i++) {
			arr2[i] = Integer.parseInt(br.readLine()); // input from user
		}
		System.out.println();
		System.out.println("Output..........");

		for(int i=0;i<arr2.length;i++) {
			System.out.println(arr2[i]);  // output		}
		
	}

	} 
	}
