package com.mkpits.enums;
   // why we use enum - when we have to used the values that doesn't change(date,month,day,color) for that purpose we use enum
public class EnumMonth {
         enum Month{
        	 JAUNARY,
        	 FEBRUARY,
        	 MARCH,
        	 APRIL,
        	 MAY,
        	 JUNE,
        	 JULY,
        	 AUG,
        	 SEPT,
        	 OCT,
        	 NOV,
        	 DEC
         }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Month month = Month.JULY;// Assigning JULY value to month variable
        switch(month) {
        case MAY:
        	System.out.println("Its 5th month.");
        	break;
        case JUNE:
        	System.out.println("Its 6th month.");
        	break;
        case JULY:
        	System.out.println("Its 7th month.");
        	break;
        case AUG:
        	System.out.println("Its 8th month.");
        	break;
        }
        System.out.println("Months of the year : ");
        for(Month m : Month.values()) {// enumName.values() - is the method by which we can read all the constant values are present in enum
			System.out.println(m);
		}
	}

}
