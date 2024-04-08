package com.mkpits.collection;
     //  Parameterized Generic 
public class ParameterizeGenerics<T> {
         
	public void print(T[] tArray) {
		for (T t : tArray) {
			System.out.println(t);
		}
	}
	public static void main(String[] args) {
		 // Generic Integer Array
         Integer[] intArray = {10, 20, 30, 40, 50};
         ParameterizeGenerics<Integer> arrInteger = new ParameterizeGenerics<Integer>();
         arrInteger.print(intArray);
         
         // Generic String Array
         String[] strArray = {"Karan", "Rohit", "Sanket", "Shri sir"};
         ParameterizeGenerics<String> arrString = new ParameterizeGenerics<String>();
         arrString.print(strArray);
	}

}
