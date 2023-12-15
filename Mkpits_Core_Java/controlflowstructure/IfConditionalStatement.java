package com.mkpits.controlflowstructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IfConditionalStatement {
       // Control flow structure - if,ifElse,Else if ladder,nested if and switch.
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter email address : ");
        String email = br.readLine();
	    System.out.println("Enter the password : ");
        String password = br.readLine();

       if(email.equals("karanmohod19@gmail.com")) {
    	   System.out.println("Validated.....");
       }
       if(password.equals("Karan@456")) {
    	   System.out.println("Login Successfully.....");
       }
}
}