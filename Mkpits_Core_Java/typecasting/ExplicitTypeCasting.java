package com.mkpits.typecasting;

public class ExplicitTypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // Explicit/Narrowing - it has high priority than implicit casting
		// we can cast large type value into the small type(Compare to Implicit - only casting of small type into large type
		// Types - Type Casting between primitive type - both source and destination are of primitive type 
		getExplicit();
	}

	private static void getExplicit() {
		// TODO Auto-generated method stub
		short n = 25;
		short n1 = 45;
		// short n2 = n + n1; - short not be converted to short
		short n2 = (short)(n + n1); // Explicit - primitive type of same type
		System.out.println(n2);
		byte s = 12;
		byte s1 = 15;
		short s2 = (short)(s + s1); // Explicit - byte value  converted into the short type
		System.out.println(s2);
	}

}
