package com.mkpits.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ReverseNumber {
     // reverse order of array elements
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		ReverseNumber rn = new ReverseNumber();
		rn.getReverse();
	}

	private void getReverse() throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the size of array : ");
		int size = Integer.parseInt(br.readLine());
		int arr[] = new int[size];
		System.out.println("Enter the "+size+" elements of array : ");
		for(int i=0;i<arr.length;i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		System.out.println("Array in reverse order : ");
		for(int i=arr.length-1;i>=0;i--) {
			System.out.println(arr[i]);

		}
		
	}

}
