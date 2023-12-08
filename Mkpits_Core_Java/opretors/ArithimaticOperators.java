package com.mkpits.opretors;

public class ArithimaticOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Operator - are the symbol by which can used to perform arithmetic operations
		// Arithmetic Operators - +, -, *, /, %
		// calling all the entities in one method                     
        // we can directly access static operation
        getOperatins();
        System.out.println("\n");
        System.out.println("Calling indivisual method by object reference : ");
        // we can individually call the method for individual operator by creating object reference for non static method
        ArithimaticOperators art = new ArithimaticOperators();
        art.getAdd(56, 44); // non static method with argument and return type
        art.getSub();       // non static method with no return type 
        getMul(15, 5);      // static method with argument and return type 
        getDiv();           // static method with no return type 
        art.getMod(113, 20); // non static method with argument and return type
	}

	private int getMod(int numb1, int numb2) {
		// TODO Auto-generated method stub
		int mod = numb1 % numb2;
		System.out.println("Modulus is : ");
		return mod;
	}

	private static void getDiv() {
		// TODO Auto-generated method stub
		int numb1 = 400, numb2 = 36;
		float div = numb1/numb2;
		System.out.println("Devision of two number is : "+div);
	}
 
	private static int getMul(int numb1, int numb2) {
		// TODO Auto-generated method stub
		int mul = numb1 * numb2;
		System.out.println("Multiplication is : "+mul);
		return mul;
	}

	private void getSub() {
		// TODO Auto-generated method stub
		int numb1 = 23;
		int numb2 = 12;
		int sub = numb1 - numb2;
		System.out.println("Subtraction is : "+sub);
	}

	private int getAdd(int numb1, int numb2) {
		// TODO Auto-generated method stub
		int add = numb1 + numb2;
		System.out.println("Addition of two number is : "+add);
		return add;
	}

	private static void getOperatins() {
		// TODO Auto-generated method stub
		int firstNum = 20;
		int secondNum = 12;
		int sum = firstNum + secondNum;
		System.out.println("Addition of two number is : "+sum);
		int sub = firstNum - secondNum;
		System.out.println("Subraction of two number is : "+sub);
		int mul = firstNum * secondNum;
		System.out.println("Multiplication of two number is : "+mul);
		float div = firstNum / secondNum;
		System.out.println("Division of two number is : "+div);
		int mod = firstNum % secondNum;
		System.out.println("Modulus of two number is : "+mod);
	}
	

}
