package com.mkpits.generics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StringArrayList {

	public static void main(String[] args) {
		
        List<String> stringArray = new ArrayList<String>();//ArrayList - is a predefind class which use to create the array
        stringArray.add("Cricket Team of India");
        stringArray.add("Rohit Sharama");
        stringArray.add("Virat Kohali");
        stringArray.add("KL Rahul");
        stringArray.add("Surya Kumar Yadav");
        stringArray.add("Mohammad Shami");
        stringArray.add("Karan Mohod");
        stringArray.add("Jusprit Bumrah");
        stringArray.add("Raj Warhokar");
//        for (String string : stringArray) {
//			System.out.println(string);
//		}
        for (Iterator iterator = stringArray.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			System.out.println(string);
		}
        
	}

}
