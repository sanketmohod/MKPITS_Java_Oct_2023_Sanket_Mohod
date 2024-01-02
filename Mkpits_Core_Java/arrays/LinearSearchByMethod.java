package com.mkpits.arrays;

public class LinearSearchByMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 10, 54, 74, 52, 14, 74 };
		int key = 52;
		System.out.println(key + " found at position : " + linearSearch(arr, key));
	}

	private static int linearSearch(int[] arr, int key) {
		// TODO Auto-generated method stub
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == key) {
				return i;
			}
		}
		return 0;
	}
}