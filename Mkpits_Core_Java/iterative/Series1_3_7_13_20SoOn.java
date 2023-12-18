package com.mkpits.iterative;

public class Series1_3_7_13_20SoOn {
         // Series = 1 3 7 13 21 31 ..............
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int series = 0;
		int a = 1;
         for(int i=0;i<=10;i++) {
        	 series = (i*i) + a;
        	 System.out.println(series);
        	 a++;
         }
         
	}

}
