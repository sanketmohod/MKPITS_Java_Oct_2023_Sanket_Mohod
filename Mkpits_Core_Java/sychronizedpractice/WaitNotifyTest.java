package com.mkpits.sychronizedpractice;

public class WaitNotifyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Message msg = new Message("process it");
		Waiter waiter1 = new Waiter(msg);
		new Thread(waiter1, "waiter1").start();
		
		Waiter waiter2 = new Waiter(msg);
		new Thread(waiter2, "waiter2").start();
		
		Notifiers notifier = new Notifiers(msg);
		new Thread(notifier, "notifier").start();
		System.out.println("All the threads are started");
	}

}
