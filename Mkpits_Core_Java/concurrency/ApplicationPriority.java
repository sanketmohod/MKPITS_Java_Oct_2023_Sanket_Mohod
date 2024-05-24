package com.mkpits.concurrency;

public class ApplicationPriority extends Thread{

	public static void main(String[] args) {

		Priority1 p1 = new Priority1();
		Priority2 p2 = new Priority2();
		Priority3 p3 = new Priority3();
		
		p1.setPriority(3);
		p2.setPriority(2);
		p3.setPriority(1);
		System.out.println(p1.getPriority());
		System.out.println(p2.getPriority());
		System.out.println(p3.getPriority());
		System.out.println("Names of Thread : "+Thread.currentThread().getName());
		System.out.println("Priority is : "+Thread.currentThread().getPriority());
		
	}

}
