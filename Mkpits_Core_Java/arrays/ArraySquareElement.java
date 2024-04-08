package com.mkpits.arrays;

public class ArraySquareElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int[] arr1 = new int[arr.length];
        for(int i=0;i<arr.length;i++) {
        	arr1[i] = arr[i] * arr[i];
        	System.out.println(arr1[i]);
        }
	}

}
