package com.mkpits.math;

public class MathDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        MathDemo md = new MathDemo();
        md.mathDemo();
	}

	private void mathDemo() {
		// TODO Auto-generated method stub
		System.out.println(Math.abs(455486.6554));// return absolute value double variable
		System.out.println(Math.abs(45)); // return absolute value float variable
		//Math.abs() - return absolute values for all data type variable 
		System.out.println(Math.absExact(547)); //return exact values for all data types variable
		System.out.println(Math.addExact(425, 487));// return exact addition
		System.out.println(Math.cbrt(15625));//return cube root of double values
		System.out.println(Math.ceil(457.245));//return plus one greater value for double
		System.out.println(Math.floor(7845.987));//return same value of left side of decimal for double
		System.out.println(Math.copySign(484.54, 42.75));//return magnitude value
		System.out.println(Math.decrementExact(54));//decrement the int value by 1
		System.out.println(Math.incrementExact(123));//increment the int value by 1
		System.out.println(Math.exp(5));//return the 'e' to the power of number gives result in the form of double
		System.out.println(Math.expm1(2));//return e^x-1 where x - is number
		System.out.println(Math.floorDiv(45,5));// return division
		System.out.println(Math.floorMod(42, 5));//return modulus
		System.out.println(Math.fma(548.54, 45.57, 57.12));// return (a*b)+c in the form of double
		System.out.println(Math.getExponent(5));//return exponent
	}

}
