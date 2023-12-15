package com.mkpits.iterative;

public class UseOfContinue {
        // continue - is a keyword which is use to break one iteration in the loop when the specific condition is occurred then continue with the iteration. 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
           for(int i=0;i<=10;i++) {
        	   if(i*2==8) {
        		   continue; // if the condition is occurred then it will skip that value and continue with the iteration
        	   }
        	   System.out.println(i);
           }
           
           // Using while loop
           System.out.println();
           System.out.println("Using while loop.............");
           int i=0;
           while(i<=10) {
        	   if(i/2==3) {
        		   i++;
        		   continue; // it will skip the values as condition is occurred then iteration will be continue
        	   }        	   
        	   System.out.println(i);
        	   i++;
        	   
           }
	}

}
