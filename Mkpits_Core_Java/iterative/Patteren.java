package com.mkpits.iterative;

public class Patteren {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// square pattern of '*'
        for(int i=1;i<=5;i++) {
        	for(int j=1;j<=5;j++) {
        		System.out.print("* ");
        	}
        	System.out.println();	
        }
        System.out.println();
	  // Ascending pattern
	for(int i=1;i<=5;i++) {
    	for(int j=1;j<=i;j++) {
    		System.out.print("* ");
    	}
    	System.out.println();	
    }
	 System.out.println();
	// Dambaru.....
	for(int i=5;i>=1;i--) {
		for(int k=i;k<5;k++) {
			System.out.print("  ");
		}
    	for(int j=1;j<=i;j++) {
    		System.out.print("  * ");
    	}
    	System.out.println();	
    }
    	
	
	// Triangle Pattern
	for(int i=1;i<=5;i++) {
		for(int k=i;k<5;k++) {
			System.out.print("  ");
		}
    	for(int j=1;j<=i;j++) {
    		System.out.print("  * ");
    	}
    	System.out.println();	
    }
}
}
 