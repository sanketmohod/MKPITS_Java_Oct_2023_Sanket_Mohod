package com.mkpits.iterative;

public class UseOfBreak {
      // break : is a keyword basically use in switch statement and in the loop
	  // It is used to terminate the certain condition and goes out side the loop
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         for(int i=0;i<=10;i++) {
        	 if(i == 4) {
        		 break;  // if the condition i == 4 is true then break will executed and goes outside the loop and stop executing the loop
        	 }
        	 System.out.println(i);
         }
         
         // by using while loop
         System.out.println();
         System.out.println("Using while loop.........");
         int i = 0;
         while(i<=10) {
        	 System.out.println(i);
        	 i++;
        	 if(i%4==0) {
        		 break;
        	 }
         }
	}

}
