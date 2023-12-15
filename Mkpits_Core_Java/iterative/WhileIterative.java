package com.mkpits.iterative;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WhileIterative {
        String name,gender;
        int age;
        float deposite,withdraw,balance;
        long mobile,aadharNumber,accountNumber;
        static BufferedReader br;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WhileIterative wi = new WhileIterative();
		br = new BufferedReader(new InputStreamReader(System.in));
		char ch = 'Y';
		while(ch == 'y' || ch == 'Y') {
			System.out.println("Enter your choice : \n1. Create Account \n2. Deposite \n3. Withdrwa \n4. Check Balance \n5. Account Details");
			int choice = Integer.parseInt(br.readLine());
			switch(choice) {
			case 1:
				wi.creatAccount();
				break;
			case 2:
				wi.depositeAmount();
				break;
			case 3:
				wi.withdrawAmount();
				break;
			case 4:
				wi.checkBalance();
				break;
			case 5:
				wi.accountDetails();
				break;
				default :
					System.out.println("Invalid case....");
					break;
			}
			System.out.println("Would you like to contineu y/n");
			ch = (char)br.read();
			br.readLine();
	}

}
	private void accountDetails() {
		// TODO Auto-generated method stub
		System.out.println("Name of holder : "+name);
		System.out.println("Mobile number is : "+mobile);
		System.out.println("Age is : "+age);
		System.out.println("Aadhar number : "+aadharNumber);
		System.out.println("Gender : "+gender);
		accountNumber = (long)Math.floor(Math.random()*1000000000);
		System.out.println("Account number : "+accountNumber);
		System.out.println("Current balance : "+balance);
	}
	private void checkBalance() throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		System.out.println("balance is");
		balance = Float.parseFloat(br.readLine());
		balance = this.deposite - this.withdraw;
		System.out.println("Current Balance is :"+balance);
	}
	private void withdrawAmount() throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Enter your withdraw amount : ");
		withdraw = Float.parseFloat(br.readLine());
		
	}
	private void depositeAmount() throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Enter the deposite amount : ");
		deposite = Float.parseFloat(br.readLine());
	}
	private void creatAccount() throws IOException {
		// TODO Auto-generated method stub
		System.out.println("Enter your name : ");
		name = br.readLine();
		System.out.println("Enter your mobile number : ");
		mobile = Long.parseLong(br.readLine());
		System.out.println("Enter your age : ");
		age = Integer.parseInt(br.readLine());
		System.out.println("Enter your aadhar number");
		aadharNumber = Long.parseLong(br.readLine());
		System.out.println("Enter your gender : ");
		gender = br.readLine();
		System.out.println();
		System.out.println("Your account is created.");
	}
}