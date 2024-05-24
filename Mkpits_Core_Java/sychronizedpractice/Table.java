package com.mkpits.sychronizedpractice;

public class Table {

	synchronized public void printTable(int n) {
		//synchronized (this) { // it will execute first tread then execute another thread it resolve the problem overlapping/interuption
		for(int i=1;i<=10;i++) {
		System.out.println(n * i);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		//}
		}
	}
}
 