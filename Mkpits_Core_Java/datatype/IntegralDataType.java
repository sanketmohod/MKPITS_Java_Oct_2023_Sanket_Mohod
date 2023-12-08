package com.mkpits.datatype;

public class IntegralDataType {
    //DataType - Primitive/Predefined Or User-defind/Custom
	// DataType - are the predefined/user-defined key word used t declare the variable
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // Integral data type - int , byte, short, long - used to declare integer values 
		
		int intNumb = 245;
		// Memory - 4byte (as compare c/c++ it takes 2byte memory)
		// Range - (-2^n-1 To 2^n-1 - 1) - where n - no. of bits
		// -2^32-1 To 2^32-1 - 1   -   -2^31 To 2^31 - 1
		// Default value is zero '0'
		System.out.println(intNumb);
		byte byteNumb = 40;
		// Memory - 1byte 
		// Default value is zero '0'
		System.out.println(byteNumb);
		short shortNumb = 25;
		// Memory - 2byte 
		// Default value is zero '0'
		System.out.println(shortNumb);
		long longNumb = 4578524545l;
		// Memory - 8byte 
		// Default value is zero '0'
		// it must be appends the letter with L/l
		System.out.println(longNumb);
	}

}
