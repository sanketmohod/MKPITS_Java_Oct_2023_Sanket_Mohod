package com.mkpits.generics;

import java.util.ArrayList;
import java.util.List;

public class IntegerArrayList {

	public static void main(String[] args) {
		// Generic - bounded by datatype
         List<Integer> integerList = new ArrayList<Integer>();//List - predefined/interface class which use to create the array list
         integerList.add(12);// objectName.add() - is a method to add the element of array
         integerList.add(22);
         integerList.add(54);
         integerList.add(35);
         integerList.add(40);
         System.out.println("Numeric values.............");
//         for (int i = 0; i < integerList.size(); i++) {
//			System.out.println(integerList.get(i));
//		}
         for (Integer integer : integerList) {
			System.out.println(integer);
		}
         
	}

}
