package com.mkpits.inheritence;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InformationDetails {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        SubDetailsInfo sd = new SubDetailsInfo();
        System.out.println("Enter your first name : ");
        sd.fName = br.readLine();
        
        System.out.println("Enter your last name : ");
        sd.lName = br.readLine();
        System.out.println("Enter your email : ");
        sd.email = br.readLine();
        System.out.println("Enter your mobile number : ");
        sd.mobile = Long.parseLong(br.readLine());
        System.out.println("Enter your gender : ");
        sd.gender = br.readLine();
        System.out.println("Enter your pincode : ");
        sd.pinCode = Integer.parseInt(br.readLine());
        System.out.println("----------------------------------");
        System.out.println("Your Info....");
        sd.Details();
        
	}
	

}
