package com.mkpits.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProblemSolving {
	// Delete the elements in array and find its index value
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 int arr[] = { 70, 50, 20, 70, 80, 60, 90, 70 };
		System.out.println("length of array is : " + arr.length);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		int arrNumb;
		System.out.println("enter the number of array you want to delete : ");
		arrNumb = Integer.parseInt(br.readLine());
		for (int i = 0; i < arr.length; i++) {
				if (arr[i] == arrNumb) {
					continue;
				}

            System.out.println(arr[i]);
            
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==arrNumb) {
				System.out.println("element deleted at index : "+i);
			}
		}
		
	}
}