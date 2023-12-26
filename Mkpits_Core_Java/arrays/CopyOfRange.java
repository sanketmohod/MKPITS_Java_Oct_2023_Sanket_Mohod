package com.mkpits.arrays;

import java.util.Arrays;

public class CopyOfRange {
        // Array.copyOfRange() - is method which is used to copy the elements between the required range
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int jerseyNumber[] = {45,7,18,10,1,8,17,12,55};
        // int[] copy =  Array.copyOfRange(source array,index from start,index to end)
        int[] number = new int[5];
        number =  Arrays.copyOfRange(jerseyNumber,2,7);
        for (int i : number) {
			System.out.println(i);
		}
	}

}
