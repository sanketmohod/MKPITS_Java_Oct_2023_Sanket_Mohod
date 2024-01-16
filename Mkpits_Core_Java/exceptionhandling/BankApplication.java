package com.mkpits.exceptionhandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BankApplication {
	static int balance, withdraw, deposite, amount;
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankApplication bank = new BankApplication();
		try {
			char ch = 'Y';
			while (ch == 'y' || ch == 'Y') {
				System.out.println("1. Deposite\n2. Withdraw\n3. Check Balance\n Enter Your Choice : ");
				int choice = Integer.parseInt(br.readLine());
				switch (choice) {
				case 1:
					bank.getDeposite();
					break;
				case 2:
					bank.getWithdraw();
					break;
				case 3:
					bank.getBalance();
					break;
				default:
					System.out.println("Invalid choice.");
				}
				System.out.println("Do you wants to continue y/Y");
				ch = (char) br.read();
				br.readLine();
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	private void getDeposite() {
		System.out.println("Enter your amount to deposite : ");
		try {
			deposite = Integer.parseInt(br.readLine());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.balance += deposite;
		System.out.println("Balance : " + balance);
	}

	private void getWithdraw() throws LessBalanceException {
		System.out.println("Enter your amount to withdraw : ");
		try {
			withdraw = Integer.parseInt(br.readLine());
		} catch (IOException e) {
			e.printStackTrace();
		}
		if ((balance - withdraw) < 500) {
			throw new LessBalanceException(balance);
		} else {
			balance -= withdraw;
		}
		System.out.println("Balance : " + balance);

	}

	private void getBalance() {
		System.out.println("Your current balance is : " + balance);
	}

}
