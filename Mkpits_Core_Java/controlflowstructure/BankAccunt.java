package com.mkpits.controlflowstructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BankAccunt {
	String name, gender, mobile;
	String bankName = "Axis Bank";
	long accountNumber;
	int age;
	float balance, deposite, withdraw;
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BankAccunt account = new BankAccunt();
		char ch = 'y';
		while (ch == 'y' || ch == 'Y') {
			System.out.println(
					"Enter your choice \n1. Create Accuont\n2. Deposite\n3. withdraw\n4. Check Baance\n5. Account Details");
			int choice = Integer.parseInt(br.readLine());
			switch (choice) {
			case 1:
				account.createAccount();
				break;
			case 2:
				account.getDeposite();
				break;
			case 3:
				account.getWithdraw();
				break;
			case 4:
				account.checkBalance();
				break;
			case 5:
				account.accountDetais();
				break;
			default:
				System.out.println("Enter your valid choice.");
				break;
			}
			System.out.println("Do you want to contineu....Y/N");
			ch = (char) br.read();
			br.readLine();
		}
	}

	private void createAccount() throws IOException {
		// TODO Auto-generated method stub

		System.out.println("Enter your name : ");

		while (true) {
			name = br.readLine();

			if (name.isEmpty()) {
				System.out.println("Enter your name first.");
				continue;
			}
			break;
		}
		System.out.println("Enter your age : ");
		age = Integer.parseInt(br.readLine());

		System.out.println("Enter your mobile number : ");

		while (true) {
			mobile = br.readLine();
			if (mobile.isEmpty() || mobile.length() != 10 || !mobile.matches("\\d+")) {
				System.out.println("Mobile number is invalid please re-enter.");
				continue;
			}
			break;
		}

		System.out.println("Enter your gender : ");
		while (true) {
			gender = br.readLine();

			if (gender.isEmpty()) {
				System.out.println("Enter your gender first.");
				continue;
			}
			break;
		}
		accountNumber = (long) Math.floor(Math.random() * (1000000000000l));
	}

	private void getDeposite() throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Enter your ammount to depodite : ");
		deposite = Float.parseFloat(br.readLine());
		balance = balance + deposite;
	}

	private void getWithdraw() throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Enter your amount to withdraw : ");
		withdraw = Float.parseFloat(br.readLine());
		balance = balance - withdraw;
	}

	private void checkBalance() throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Check your balance : ");
		// balance = Float.parseFloat(br.readLine());
		System.out.println("Your current balance is : " + balance);
	}

	private void accountDetais() {
		// TODO Auto-generated method stub
		System.out.println("Your name : " + name);
		System.out.println("Your age : " + age);
		System.out.println("Your mobile number : " + mobile);
		System.out.println("Your gender : " + gender);
		System.out.println("Bank name : " + bankName);
		System.out.println("Account number : " + accountNumber);
		System.out.println("Your deposite : " + deposite);
		System.out.println("Your withdraw : " + withdraw);
		System.out.println("Your current balance : " + balance);

	}

}
