package com.mkpits.string;

public class StringBufferInfo {
		// TODO Auto-generated constructor stub
		// StringBuffer - is same as string and having space complexity(by which we can manage the space)
	    // Initial capacity - 16 character  
	    // Compare to String - 'StringBuffer' is mutable we can change its value
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        StringBufferInfo sbi = new StringBufferInfo();
        sbi.stringBufferOverviewe();
	}

		public void stringBufferOverviewe() {
			// TODO Auto-generated method stub
			String message = "To be a developer in java full stack";
			StringBuffer str = new StringBuffer(message);
			// StringBuffer is initialize by instance
			String message1 = " Trainer must be like shri sir.";
			char[] ch = {'K', 'A', 'R', 'A', 'N'};
			//str = str.append(message1);// it join two string
//			System.out.println(" " +str);
//			System.out.println(str.append(true));//it appends the specific word/character or boolean value
//			System.out.println(str.append(ch));//it appends the characters as a string
//			System.out.println(str.append(ch, 0, 2));
//			// offset - is the starting index of character array and 2 - is number of character
			//len - 
//			System.out.println(str.append(message1));//it appends the character of string
//			int count = str.capacity();//it return the current capacity plus initial capacity(16)
//			System.out.println(count);
//			char cha = str.charAt(6);//return character value at specified index
//			System.out.println(cha);
//			StringBuffer c = str.deleteCharAt(9);
//			System.out.println(c);//delete the character at specified index
//			StringBuffer cc = str.delete(20, 30);
//			System.out.println(cc);//delete character values between the index
		//	System.out.println(message1.chars());// return byte value of string
		//	System.out.println(str.insert(2," rohit"));//we can insert the character/number/string from any index
		//	System.out.println(str.insert(3, message1,0,3));//we can insert character between the index
			System.out.println(str.lastIndexOf(message1));
		}

}
