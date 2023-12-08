package com.mkpits.scopeofvariable;

public class NonStaticVariable {
    public int mobile;
    public short num;
	public long account_num;
	public byte pincode;
	public char ch;
	public boolean isPresent;
	public float Decimal_value;
	public double ip_address;
	public String name;
	// By using non static variable we can print default values for all the data types
	public static void main(String[] args) {
		// non static variable - instance variable
		// it declare within the class and main method having scope in all over the class and other different classes.
		// we use non static variable as a scope of variable.
		// it gives as default values for all the data members
		// implementation
		NonStaticVariable nst = new NonStaticVariable();
		System.out.println("default value for int data type is : "+nst.mobile);
		System.out.println("default value for int short type is : "+nst.num);
		System.out.println("default value for long data type is : "+nst.account_num);
		System.out.println("default value for byte data type is : "+nst.pincode);
		System.out.println("default value for char data type is : "+nst.ch);
		System.out.println("default value for boolean data type is : "+nst.isPresent);
		System.out.println("default value for float data type is : "+nst.Decimal_value);
		System.out.println("default value for double data type is : "+nst.ip_address);
		System.out.println("default value for String data type is : "+nst.name);

	}

}
