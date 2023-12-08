2package com.mkpits.opretors;

public class AssignmentOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // Assignment Operator - =, +=, -+, *=, /=, %=
		getAssignment();
	}

	private static void getAssignment() {
		// TODO Auto-generated method stub
		int numb = 10;
		System.out.println(numb);
		numb += 8; // numb = numb + 8 (numb = 18)
		System.out.println(numb);
		numb -= 5; // numb = numb - 5  (numb = 13)
		System.out.println(numb);
		numb *= 7; // numb = numb * 7  (numb = 91)
		System.out.println(numb);
		numb /= 2; // numb = numb / 2   (numb = 45)
		System.out.println(numb);
	}

}
