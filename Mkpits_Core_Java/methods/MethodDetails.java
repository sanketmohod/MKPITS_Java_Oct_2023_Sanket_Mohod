package com.mkpits.methods;

public class MethodDetails {

	public static void main(String[] args) {
		// method - methods are nothing abuts block of attributes and we used those attributes to implement in java
		// two types
		// static methods - access anywhere
		// non static method - access within the same class 
        // declaration - returnType methodName() {}
		// Direct Access
		getFirstName();
		getLastName();
		getEmailAdd();
		getMobile();
		getGender();
		getPassword();
		System.out.println("Calling all methods by getAllData() : ");
		getAllData();
	}
	static void getFirstName() {
		String firstName = "Karan";
		System.out.println("First Name is : "+firstName);
	}
	static void getLastName() {
		String lastName = "Mohod";
		System.out.println("Last Name is : "+lastName);
	}
	static void getEmailAdd() {
		String emailAdd = "karanmohod19@gmail.com";
		System.out.println("My Email is : "+emailAdd);
	}
	static void getMobile() {
		long mobileNo = 9545590729l;
		System.out.println("My contact number is : "+mobileNo);
	}
	static void getGender() {
		String gender = "Male";
		System.out.println("Gender is : "+gender);
	}
	static void getPassword() {
		String password = "Karan@159";
		System.out.println("Password is : "+password);
	}
	static void getAllData() {
		getFirstName();
		getLastName();
		getEmailAdd();
		getMobile();
		getGender();
		getPassword();
	}
}
