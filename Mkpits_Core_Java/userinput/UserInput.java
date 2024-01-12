package com.mkpits.userinput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserInput {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enten the name : ");
        String name = br.readLine();
        System.out.println("My name is : "+name);
        System.out.println("Enter your Roll Number : ");
        int rollNumb = Integer.parseInt(br.readLine());
        System.out.println("My roll number is : "+rollNumb);
        System.out.println("Enter mobile number : ");
        long mobNumb = Long.parseLong(br.readLine());
        System.out.println("Contact number is : "+mobNumb);
        System.out.println("Enter grad : ");
        char grad = (char) br.read();
        System.out.println("Grade is : "+grad);
        
	}

}
