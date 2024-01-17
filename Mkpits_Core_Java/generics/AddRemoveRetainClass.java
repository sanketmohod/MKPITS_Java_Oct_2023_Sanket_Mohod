package com.mkpits.generics;

import java.util.ArrayList;
import java.util.List;

public class AddRemoveRetainClass {

	public static void main(String[] args) {
		
       List<String> arrStates = new ArrayList<String>();
       arrStates.add("Maharashtra");
       arrStates.add("Delhi");
       arrStates.add("Karnataka");
       arrStates.add("Rajstan");
       arrStates.add("Heydrabad");
       arrStates.add("Chandighar");
       System.out.println("Array of States : ");
       for (String string : arrStates) {
		System.out.println(string);
	}
       System.out.println();
       List<String> unionTer = new ArrayList<String>();
       if(unionTer.isEmpty()) {
       unionTer.add("Jummu and Kashmir");
       unionTer.add("Delhi");
       unionTer.add("Chandighar");
       unionTer.add("Daman diu");
       unionTer.add("Lakshdweep");
       }
       System.out.println("Array of union terrritories : ");
       for (String string : unionTer) {
		System.out.println(string);
	}
       System.out.println();
       arrStates.addAll(unionTer);
       System.out.println("Size of array of state involving union territories : "+arrStates.size());
       
       for (String string : arrStates) {
		System.out.println(string);
	}
//       System.out.println();
//       arrStates.removeAll(unionTer);
//       System.out.println("After removeAll() size of array states is : "+arrStates.size());
//       for (String string : arrStates) {
//		System.out.println(string);
//	}
       System.out.println();
       arrStates.retainAll(unionTer);
       System.out.println("After retainAll() size of array states is : "+arrStates.size());
       for (String string : arrStates) {
		System.out.println(string);
	}
	}

}
