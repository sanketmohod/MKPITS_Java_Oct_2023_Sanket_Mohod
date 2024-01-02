package com.mkpits.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class InsertionOfArray {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub`	
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        InsertionOfArray irt = new InsertionOfArray();
         irt.getInsertion();
        //irt.insertX(0, null, 0, 0);
	}

	private void getInsertion() throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int arr[] = {10,51,78,21,64,94,26};
		int length = arr.length;
		System.out.println("Given array : ");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		System.out.println("Enter the number : ");
		int number = Integer.parseInt(br.readLine());
		System.out.println("Enter the index value : ");
		int index = Integer.parseInt(br.readLine());
	    int arr1[] = new int [length+1];
	    for(int i=0;i<length+1;i++) {
	    	if(i < index - 1) {
	    		arr1[i] = arr[i];
	    	}else if(i == index - 1) {
	    		arr1[i] = number;
	    	}else {
	    		arr1[i] = arr[i - 1];
	    	}
	    	
	    }
    	System.out.println("New array will be : "+Arrays.toString(arr1)+ "\n"+number+" element added at index of : "+index);


	}

		
		
	
         
}
