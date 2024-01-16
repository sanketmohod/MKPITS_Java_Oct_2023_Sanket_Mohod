package com.mkpits.exceptionhandling;

public class LessBalanceException extends Exception{
          int amount;
	public LessBalanceException() {
		System.out.println("Default Constructer Called.");
	}
	public LessBalanceException(int amount) {
		this.amount = amount;
	}
	public String toString() {
		return "Insufficient Balance " +amount;
		
	}
}
