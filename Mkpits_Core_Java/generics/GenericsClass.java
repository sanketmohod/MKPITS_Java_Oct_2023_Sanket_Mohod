package com.mkpits.generics;

public class GenericsClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Not Bounded to any datatype
        System.out.println("Array of integer : ");
        Integer[] integerArray = {12, 22, 54, 15, 62, 84};
        PrintData<Integer> printArray = new PrintData<>();
        printArray.print(integerArray);
        System.out.println("Array of double elements : ");
        Double[] doubleArray = {12.41, 42.4, 56.8, 55.52, 62.85, 84.14};
        PrintData<Double> printArray1 = new PrintData<>();
        printArray1.print(doubleArray);
        System.out.println("Array of string : ");
        String[] stringArray = {"Rohit", "Virat", "Surya", "Shami", "Rahul"};
        PrintData<String> printArray2 = new PrintData<>();
        printArray2.print(stringArray);
       
        
	}

}
