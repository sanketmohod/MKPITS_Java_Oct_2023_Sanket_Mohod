package com.mkpits.scopeofvariable;

public class NonStaticVariable_1 {

	public int otp = 4545;
    public short num = 25;
	public long account_num = 54545445454l;
	public byte roll_no = 15;
	public char ch = 'K';
	public boolean isPresent = true;
	public float Decimal_value = 5.12f;
	public double Double_value = 45.4845455;
	public String name = "Sanket Mohod";
	public static void main(String[] args) {
		// non static variable - instance variable
		// it declare within the class and main method having scope in all over the class and other different classes.
		// we use non static variable as a scope of variable.
		// it gives as default values for all the data members
		// implementation
		NonStaticVariable_1 nst = new NonStaticVariable_1();
		// To call the static variable we have to create the object of the class
		// Objname.Variablename - To call the static variable
		System.out.println("OTP is : "+nst.otp);
		System.out.println("return number is : "+nst.num);
		System.out.println("Account no. is : "+nst.account_num);
		System.out.println("Roll number is : "+nst.roll_no);
		System.out.println("My first charecter of name is : "+nst.ch);
		System.out.println("Boolean value is : "+nst.isPresent);
		System.out.println("Return decimal value is : "+nst.Decimal_value);
		System.out.println("Return double value is : "+nst.Double_value);
		System.out.println("My name is : "+nst.name);
        System.out.println("this all about non static variable");
}
}