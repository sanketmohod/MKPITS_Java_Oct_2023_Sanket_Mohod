package com.mkpits.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MultidimensionalUserInput {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number of rows");
        int row = Integer.parseInt(br.readLine()) ;
        System.out.println("Enter number of coloums : ");
        int coloum = Integer.parseInt(br.readLine()) ;
        int arr[][] = new int[row][coloum];
		System.out.println("Enter the elements of array : ");

        for(int i=0;i<row;i++) {
        	for(int j=0;j<coloum;j++) {

				 arr[i][j] =   Integer.parseInt(br.readLine()) ;
        	}
        }
        System.out.println();
        System.out.println("Output in matrix form..........");
        for(int i=0;i<row;i++) {
        	for(int j=0;j<coloum;j++) {

        		System.out.print(arr[i][j]+ " | ");
        	}
        	System.out.println();
        }
        
	}

}
