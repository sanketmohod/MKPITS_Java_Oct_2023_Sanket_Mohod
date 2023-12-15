 package com.mkpits.controlflowstructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IfElseConditionalStetement {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter email address : ");
        String email = br.readLine();
	    

       if(email.equals("karanmohod19@gmail.com")) {
    	   System.out.println("Validated.....");
       } else {
    	   System.out.println("Invalid email....");
       }
       
	}

}
