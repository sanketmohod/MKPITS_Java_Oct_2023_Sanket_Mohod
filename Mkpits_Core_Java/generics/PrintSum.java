package com.mkpits.generics;

public class PrintSum<T extends Number> {
	// bounded datatype
	public void print(T arr[]) {
		int sum = 0;
		for (T t : arr) {
			sum = sum + t.intValue();
		}
		System.out.println("Sum of array is : " +sum);
	}
}
