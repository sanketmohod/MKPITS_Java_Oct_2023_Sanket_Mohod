package com.mkpits.arrays;

import java.util.Arrays;

public class SecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 12, 22, 84, 89, 54, 65, 52, 88, 90 };
		System.out.println("Elements of array is : ");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		int largeNumber = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (largeNumber < arr[i]) {
				largeNumber = arr[i];
			}
		}
		System.out.println();
	    System.out.println("Large elements of array is : "+largeNumber);// it gives large number
		
		// by sorting array we can simple findes out the second large elements
		 Arrays.sort(arr);
		 System.out.println("2nd large number of array is : " +arr[arr.length-2]);

	}

}
