package com.mkpits.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SmallestNumberOfArray {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		SmallestNumberOfArray sna = new SmallestNumberOfArray();
		sna.getSmallestNumber();
	}

	private void getSmallestNumber() throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the size of array : ");
		int size = Integer.parseInt(br.readLine());
		int arr[] = new int[size];
		System.out.println("enter the " + size + " elements of array : ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		System.out.println("The elements of array is : ");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println();
		int smallestNumb = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (smallestNumb > arr[i]) {
				smallestNumb = arr[i];
			}
		}
		System.out.println("Smallest number of array is : " + smallestNumb);

	}

}
