package com.mkpits.arrays;

import java.util.Arrays;

public class ProblemSolving1 {
     // find the greatest element of array and the factorial of that number
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       // int arr[] = {50,70,20,30,80,40};
		int arr[] = {5,7,2,3,8,4};
        Arrays.sort(arr);
        System.out.println("Array in ascending order : ");
        for(int i=0;i<arr.length;i++) {
        	System.out.println(arr[i]);
        }
        int largNumb = arr[0];

        for(int i=0;i<arr.length;i++) {
        	if(largNumb < arr[i]) {
        		largNumb = arr[i];
        	}

        }
        System.out.println();
		System.out.println("Largest number of array is : "+largNumb);
		int fact = 1;
        
        for(int i=1;i<=largNumb;i++) {
        	fact = fact * i;
        }
        System.out.println("Factorial of "+largNumb+" is : "+fact);
	}

}
