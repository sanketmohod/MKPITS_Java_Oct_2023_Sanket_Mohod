package com.mkpits.sychronizedpractice;

public class Notifiers implements Runnable {
	private Message msg;
	public Notifiers(Message msg) {
		this.msg = msg;
	}
	public void run() {
		String name = Thread.currentThread().getName();
		System.out.println(name+ " started");
		try {
			Thread.sleep(5000);
			synchronized (msg) {
				msg.setMsg(name+"work done");
				//
				msg.notifyAll();
			}
		} catch (InterruptedException e) {
             e.printStackTrace();		
             }
	}
}


