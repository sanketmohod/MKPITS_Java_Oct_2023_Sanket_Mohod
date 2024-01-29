package com.mkpits.arrays;

import java.util.Arrays;

public class ProbleByGatiSir {
    // compare the similar elements of two array and print it
	public static void main(String[] args) {
		int temp = 0;

		int[] arr = {1, 2, 3, 4, 5, 6};
		int[] arr1 = {3, 4, 5, 7, 8};
		System.out.println("Size of first array : " +arr.length);
		System.out.println("Size of second array : " +arr1.length);
		System.out.println("Similar elements of array : ");
		for(int i=0;i<arr.length;i++) {
				 {
					for (int j = 0; j < arr1.length; j++) {
						if(arr[i] == arr1[j]) {
							System.out.println(arr[i]+ " at index : "+j);

						}

					}
					
			}
				
		}

	}

}
