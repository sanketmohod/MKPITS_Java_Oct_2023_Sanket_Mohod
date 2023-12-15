package com.mkpits.controlflowstructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NestedIf {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       System.out.println("Enter your email : ");
       String email = br.readLine();
       if(email.equals("karanmohod@gmail.com")) {
    	   System.out.println("Enter the password : ");
    	   String password = br.readLine();
    	   if(password.equals("Karan@456")) {
    		   System.out.println("Login Successfully....");
    	   }else {
    		   System.out.println("Invalid email and password.");
    	   }
       }else {
    	   System.err.println("Check the email....");
       }
	}

}
