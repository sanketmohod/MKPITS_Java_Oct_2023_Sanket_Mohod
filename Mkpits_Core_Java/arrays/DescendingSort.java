package com.mkpits.arrays;

import java.util.Arrays;
import java.util.Collections;

public class DescendingSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Integer numb[] = {10,4,45,87,10,42,35,16,95,41};
        // we must have to initialized the by class variable to use Collection.reverseOrder() method 
        Arrays.sort(numb, Collections.reverseOrder());
        //Arrays.sort(numb,2,6, Collections.reverseOrder());
         // it will sort the elements from index 2 to 6
        // we can also find the index range of array in descending order
        System.out.println("Dscending order is : ");
        for (Integer i : numb) {
			System.out.println(i);
		}
	}

}
