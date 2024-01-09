package com.mkpits.arrays;

public class MultidimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int [][]arr = {{1,23},{2,22},{3,20}};
        for(int i=0;i<3;i++) {
        	for(int j=0;j<2;j++) {
        		System.out.print(arr[i][j]+ " | ");
        	}
        	System.out.println();
        }
	}

}
