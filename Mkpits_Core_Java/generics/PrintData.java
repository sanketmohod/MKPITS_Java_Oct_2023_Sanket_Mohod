package com.mkpits.generics;

public class PrintData<T> {
      // Not bound to any datatype      
	public void print(T[] arr) {
		for (T t : arr) {
			System.out.println(t);
		}
	}
}
