package com.mkpits.collectionset;

import java.util.EnumSet;
import java.util.Set;

enum Days{
	SUNDAY,
	MONDAY,
	TUESDAY,
	WENSDAY,
	THURSDAY,
	FRIDAY,
	SATURDAY,
};
public class EnumSet2 {
   
	public static void main(String[] args) {
        // Creating a set
		Set<Days> set;
		// adding days
		set = EnumSet.of(Days.SUNDAY, Days.MONDAY, Days.TUESDAY, Days.WENSDAY, Days.THURSDAY, Days.FRIDAY, Days.SATURDAY);
		System.out.println("Days of week : "+set);
	}

	

}
