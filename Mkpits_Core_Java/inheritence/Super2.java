package com.mkpits.inheritence;

public class Super2 extends Super1 {
          public Super2() {
        	  System.out.println("This is my default constructer of Super2 class.");
          }
          public Super2(int x) {
        	  super(25);// use of super keyword
        	  x = x + super.x;
        	  System.out.println("This is my parameteries constructer having value : "+x);
          }
}
