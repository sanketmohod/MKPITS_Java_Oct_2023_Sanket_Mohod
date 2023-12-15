package com.mkpits.iterative;

public class FibonacciSeries {
        // 1,1,2,3,5,8,13,21,34,...............
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numb1 = 1;
    	int numb2 = 1;
    	int numb3;
    	System.out.println(+numb1+ "\n" +numb2);
        for(int i= 1;i<=20;i++) {
        	
        	 numb3 = numb1 + numb2;
        	System.out.println(numb3);
        	
        	numb1 = numb2;
        	numb2 = numb3;
        }
	}

}
