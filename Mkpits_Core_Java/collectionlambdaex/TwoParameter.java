package com.mkpits.collectionlambdaex;

public class TwoParameter {
    static void getTwo(TwoParameterInterface sp, Integer num1, Integer num2) {
    	sp.get(num1, num2);
    }
	public static void main(String[] args) {

		getTwo((x1, x2) -> System.out.println(x1+ "\n" +x2), 18, 45);
	}
	
}
