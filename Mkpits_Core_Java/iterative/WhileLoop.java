package com.mkpits.iterative;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class WhileLoop {
	String firstName,lastName,holderName;
    long mobile, aadharNumb, accountNumb;
    int age,otp;
    float amount,withdraw,balance = 6500f;
	static  BufferedReader br;

public static void main(String[] args) throws NumberFormatException, IOException {
	// TODO Auto-generated method stub
	WhileLoop wl = new WhileLoop();
 br = new BufferedReader(new InputStreamReader(System.in));
 char ch = 'Y';
 while(ch == 'y' || ch == 'Y') {
System.out.println("Enter your choice : \n1. Create Account \n2. Deposite \n3. Withdrwa \n4. Check Balance \n5. Account Details");
int choice = Integer.parseInt(br.readLine());
switch(choice) {
case 1:
	   wl.createAcc();
break;
case 2:
	   wl.deposite();
	   break;
case 3:
	   wl.withdraw();
	   break;
case 4:
	   wl.checkBalance();
	   break;
case 5:
	   wl.accountDetails();
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
	System.out.println("Account Details : \nName : Sanket A. Mohod\nAccount Number : 548795156254\nBank Name : Maharashtra Bank\nIFSC Code : MH00425P");
}

private void checkBalance() throws NumberFormatException, IOException {
	// TODO Auto-generated method stub
	System.out.println("Enter your accoumt number : ");
	accountNumb = Long.parseLong(br.readLine());
	System.out.println("Enter aadhar number : ");
	aadharNumb = Long.parseLong(br.readLine());
	System.out.println("Enter valid OTP : ");
	otp = Integer.parseInt(br.readLine());
	System.out.println();
	System.out.println("Now you can check your balance.");
	System.out.println("Current Balance : "+balance);
}

private void withdraw() throws NumberFormatException, IOException {
	// TODO Auto-generated method stub
	System.out.println("Enter holder name : ");
	holderName = br.readLine();
	System.out.println("Enter your account number : ");
	accountNumb = Long.parseLong(br.readLine());
	System.out.println("Enter the ammout to withdraw : ");
	withdraw = Float.parseFloat(br.readLine());
	System.out.println();
	System.out.println(+withdraw+ " withdraw from your account.");
}

private void deposite() throws NumberFormatException, IOException {
	// TODO Auto-generated method stub
	System.out.println("Enter holder name : ");
	holderName = br.readLine();
	System.out.println("Enter your account number : ");
	accountNumb = Long.parseLong(br.readLine());
	System.out.println("Enter the ammount to be deposite in account : ");
	amount = Float.parseFloat(br.readLine());
	System.out.println();
	System.out.println(+amount+ " creadited in your account.");
}

private void createAcc() throws IOException {
	// TODO Auto-generated method stub
	//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter first name : ");
 firstName = br.readLine();
	System.out.println("Enter last name : ");
 lastName = br.readLine();
 System.out.println("Enter mobile number : ");
 mobile = Long.parseLong(br.readLine());
 System.out.println("Enter aadhar number : ");
 aadharNumb = Long.parseLong(br.readLine());
 System.out.println("Enter your age : ");
 age = Integer.parseInt(br.readLine());
 System.out.println();
 System.out.println("Your account is created : ");
 System.out.println("Your name is : " +firstName+ " "+lastName);
 System.out.println("Mobile number is : "+mobile);
 System.out.println("Aadhar number is : "+aadharNumb);
 System.out.println("Your age is : "+age);
 accountNumb = (int)Math.floor(Math.random()*1000000000);
 System.out.println("Account Number : "+accountNumb);
 System.out.println("Bank name : Maharashtra Bank");
 System.out.println("IFSC Code : MHG000P");
 
}


}
