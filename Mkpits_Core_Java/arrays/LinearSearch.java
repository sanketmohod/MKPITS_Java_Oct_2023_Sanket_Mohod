package com.mkpits.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
// Linear Search - is used to search the index key elements of array
public class LinearSearch {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int arr[] = {10,20,50,40,30};
        int key;
       // Arrays.sort(arr);// sorting array in ascending order
        // Arrays.sort(arr, Collections.reverseOrder()); // To sort array in descending order the array should be declare by class type variable
        System.out.println("Elements of array is : ");
        for(int i=0;i<arr.length;i++) {
        	System.out.println(arr[i]);
        }
        System.out.println("Enter the element of array you want to search : ");
        key = Integer.parseInt(br.readLine());
        for(int i=0;i<arr.length;i++) {
        if(arr[i]==key) {
        	System.out.println("Array index found at : " +i);
        }
	}
              
	}

	
	}

