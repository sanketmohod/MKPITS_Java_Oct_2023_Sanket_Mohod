package com.mkpits.generics;

public class SumClass {

	public static void main(String[] args) {
		
		//Bounded to integer data type
        Integer[] arr = {15, 20, 41, 23, 32};
        PrintSum<Integer> arraySum = new PrintSum<>();
        arraySum.print(arr);
	}

}
