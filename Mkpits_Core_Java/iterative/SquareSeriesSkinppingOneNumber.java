package com.mkpits.iterative;

public class SquareSeriesSkinppingOneNumber {
	// Series - 1 4 9 16 36 49 64 81 100 121 ........................
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int series = 0;
		for (int i = 1; i < 20; i++) {
			series = i * i;
			if (i == 5) {
				continue;
			}
			System.out.println(series);

		}

		// by using while loop.......
		System.out.println();
		System.err.println("Using while loop...........");
		int i = 1;
		while (i < 20) {
			series = i * i;

			if (i == 5) {
				i++;
				continue;
			}

			System.out.println(series);
		}
		
//		System.err.println("Without using continue key word.........");
//		
//		while(i<20) {
//			if(i!=5) {
//				series = i * i;
//				System.out.println(series);
//				
//			}
//			i++;
//		}
	}
}