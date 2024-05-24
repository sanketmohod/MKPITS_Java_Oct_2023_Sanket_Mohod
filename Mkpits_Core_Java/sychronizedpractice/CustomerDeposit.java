package com.mkpits.sychronizedpractice;

public class CustomerDeposit {

	private int amount;

	synchronized void deposit(int amount){    
		System.out.println("going to deposit...");    
		this.amount+=amount;    
		System.out.println("deposit completed... ");    
		notify();    
		}    
}
