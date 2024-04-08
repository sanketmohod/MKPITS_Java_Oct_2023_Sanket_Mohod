package com.mkpits.arrays;

public class Program_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int square =0;
        int sum = 0;
        for(int i=0;i<arr.length;i=+2){
            square = arr[i] * arr[i];
            sum = sum + square;
        }
        System.out.println(sum);
	}

}
