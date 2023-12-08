package com.mkpits.methods;

public class MethodWithArgumentsNoReturnType {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Methods with Arguments - it contains two entity - Parameters / Arguments
		// Parameters - variable declare in the methods - eg. void getData(int num,String name,char ch)
		// Arguments - calling methods by objectReference passing values to parameters - eg. onjectName.getData(12,"karan",'K')
		
        String firstName = "Karan";
        String lastName = "Mohod";
        String gender = "male";
        long mobile = 9545590728l;
        String email = "karanmohod45@gmail.com";
        String password = "Karan@45";
        // calling methods by assigning values of initialized variables
        MethodWithArgumentsNoReturnType mrg = new MethodWithArgumentsNoReturnType();
        mrg.getFirstName(firstName);
        mrg.getLastName(lastName);
        mrg.getGender(gender);
        mrg.getMobile(mobile);
        mrg.getEmailAdd(email);
        mrg.getPassword(password);
	}

	public void getFirstName(String firstName) {
		// TODO Auto-generated method stub
		System.out.println(firstName);
	}

	public void getLastName(String lastName) {
		// TODO Auto-generated method stub
		System.out.println(lastName);
	}

	public void getGender(String gender) {
		// TODO Auto-generated method stub
		System.out.println(gender);
	}

	public void getMobile(long mobile) {
		// TODO Auto-generated method stub
		System.out.println(mobile);
	}

	public void getEmailAdd(String email) {
		// TODO Auto-generated method stub
		System.out.println(email);
	}

	public void getPassword(String password) {
		// TODO Auto-generated method stub
		System.out.println(password);
	}
}
