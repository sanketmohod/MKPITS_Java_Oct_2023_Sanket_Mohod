package com.mkpits.inheritence;

public class Super1 {
   int x;
   public Super1()
   {
	   System.out.println("This is my default constructer of Super1 class");
   }
   public Super1(int x) {
	   this.x = x;
	   System.out.println("This is my parameterised constructer having value : "+x);
   }
}
