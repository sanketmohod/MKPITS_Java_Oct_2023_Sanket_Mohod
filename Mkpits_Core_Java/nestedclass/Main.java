package com.mkpits.nestedclass;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         OuterClass outer = new OuterClass();
         OuterClass.InnerClass inner = outer.new InnerClass();
         OuterClass.InnerClass.MulClass mul = inner.new MulClass();
         OuterClass.InnerClass.MulClass.DivClass div = mul.new DivClass();
         OuterClass.InnerClass.MulClass.DivClass.ModClass mod = div.new ModClass();
         System.out.println("Addition is : " +(outer.x + inner.y));
         System.out.println("Subtraction is : "+inner.z);
         System.out.println("Multiplication is : "+mul.product);
         System.out.println("Division is : "+div.division);
         System.out.println("Modulus is : "+mod.modulus);
         
	}

}
