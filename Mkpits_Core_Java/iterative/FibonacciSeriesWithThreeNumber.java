package com.mkpits.iterative;

public class FibonacciSeriesWithThreeNumber {
      // Fibonacci series for three numbers
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a=0,b=1,c=2,total;
        System.out.println(a+ "\n" +b+ "\n" +c);
        for(int i=1;i<=20;i++) {
        	total = (a + b + c);
        	System.out.println(total);
        	a=b;
        	b=c;
        	c=total;
        }
	}

}
