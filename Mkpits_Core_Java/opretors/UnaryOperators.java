package com.mkpits.opretors;

public class UnaryOperators {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
        // Unary Operators --> ++, --
		getUnary();
	}

	private static void getUnary() 
	{
		
		int rollNumb = 21;
		// For increment operator '++'
		System.out.println("By using increment operator '++' : ");
		System.out.println(rollNumb);  // P - 21 , M - 21
		// Post increment (variableName++)
		System.out.println(rollNumb++); // P - 21, M - 22
		// Pre increment (++VariableName)
		System.out.println(++rollNumb); // P - 23, M - 23
		System.out.println(rollNumb++); // P - 23, M - 24
		System.out.println(rollNumb++); // P - 24, M - 25
		System.out.println(++rollNumb); // P - 26, M - 26
		System.out.println(++rollNumb); // P - 27, M - 27
		  // here P - print , M - Memory
         // For decrement operator '--'
         // current value of rollNumb = 27
		System.out.println("By using decrement operator '--' : ");
		System.out.println(rollNumb);      // P - 27, M - 27
		// Pre decrement (--VariableName)
		System.out.println(--rollNumb);    // P - 26, M - 26
		// Post decrement (VariableName--)
		System.out.println(rollNumb--);    // P - 26, M - 25
		System.out.println(rollNumb--);    // P - 25, M - 24
		System.out.println(--rollNumb);    // P - 23, M - 23
		System.out.println(--rollNumb);    // P - 22, M - 22

	}

}
