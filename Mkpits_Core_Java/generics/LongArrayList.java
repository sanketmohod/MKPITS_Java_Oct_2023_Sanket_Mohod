package com.mkpits.generics;

import java.util.ArrayList;

public class LongArrayList {

	public static void main(String[] args) {
		
         ArrayList<Long> longArray = new ArrayList<Long>();
         longArray.add(542654822l);
         longArray.add(554545251l);
         longArray.add(254894545l);
         longArray.add(125489335l);
         longArray.add(987456845l);
         longArray.add(325477952l);
         System.out.println("Accounts Number data............");
         for (Long long1 : longArray) {
			System.out.println(long1);
		}
	}

}
