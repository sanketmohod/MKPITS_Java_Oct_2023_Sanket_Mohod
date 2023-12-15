package com.mkpits.userinput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RegistrationForm {
      String firstName,lastName,emailAdd,password;
      char gender;
      long mobile;
      int age;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		RegistrationForm rf = new RegistrationForm();
		rf.getForm();
	}
	private void getForm() throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Registration Form : ");
		System.out.println("\nEnter first name : ");
		this.firstName = br.readLine();
		System.out.println(firstName);
		System.out.println("Enter last name : ");
		this.lastName = br.readLine();
		System.out.println(lastName);
        System.out.println("Enter gender : ");
        this.gender = (char)br.read();  // casting character value
        br.readLine();
        System.out.println(gender);
        System.out.println("Enter mobile number : ");
        this.mobile = Long.parseLong(br.readLine());
        System.out.println(mobile);
        System.out.println("Enter your age : ");
        this.age = Integer.parseInt(br.readLine());
        System.out.println(age);
        System.out.println("Enter your email address : ");
        this.emailAdd = br.readLine();
        System.out.println(emailAdd);
        System.out.println("Enter your password : ");
        this.password = br.readLine();
        System.out.println(password);
        
     	}
}
