package com.mkpits.iterative;

public class SquareSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   int square = 0;
           for(int i=1;i<=10;i++) {
        	  square = i * i;
        	  if(i%2==0) {
        		  i++;
        		  continue; // here we skipping square of the numbers which divisible by 2
        	  }
        	  System.out.println(square);
        	  i++;
           }
	}

}
