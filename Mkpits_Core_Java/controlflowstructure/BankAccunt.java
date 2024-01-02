package com.mkpits.controlflowstructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BankAccunt {
	String name,gender;
	String bankName = "Axis Bank";
	long mobile,accountNumber;
	int age;
	float balance,deposite,withdraw;
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BankAccunt account = new BankAccunt();
		char ch='y';
        while(ch=='y' || ch=='Y') {
        	System.out.println("Enter your choice \n1. Create Accuont\n2. Deposite\n3. withdraw\n4. Check Baance\n5. Account Details");
        	int choice = Integer.parseInt(br.readLine());
        	switch(choice) {
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
        	ch = (char)br.read();
        	br.readLine();
        }
	}
	private void createAccount() throws IOException {
		// TODO Auto-generated method stub
		
		System.out.println("Enter your name : ");
		name = br.readLine();
		System.out.println("Enter your age : ");
		age = Integer.parseInt(br.readLine());
		System.out.println("Enter your mobile number : ");
		mobile = Long.parseLong(br.readLine());
		System.out.println("Enter your gender : ");
		gender = br.readLine();
		accountNumber = (long) Math.floor(Math.random() *(1000000000000l));
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
		//balance = Float.parseFloat(br.readLine());
		System.out.println("Your current balance is : "+balance);
	}
	private void accountDetais() {
		// TODO Auto-generated method stub
		System.out.println("Your name : "+name);
		System.out.println("Your age : "+age);
		System.out.println("Your mobile number : "+mobile);
		System.out.println("Your gender : "+gender);
		System.out.println("Bank name : "+bankName);
		System.out.println("Account number : "+accountNumber);
		System.out.println("Your deposite : "+deposite);
		System.out.println("Your withdraw : "+withdraw);
		System.out.println("Your current balance : "+balance);


	}

}
