package com.mkpits.methods;

public class MethodWithReturnType {

	public static void main(String[] args) {
		// Methods with return type - 
		// we can call non static variable - by objectReference
		
		MethodWithReturnType mrt = new MethodWithReturnType();
		//String fName = mrt.getFirstName();
		//System.out.println(fName);
		
		System.out.println("My First Name is : "+mrt.getFirstName());
		System.out.println("My Last Name is : "+mrt.getLastName());
		System.out.println("My Email Address is ; "+mrt.getEmailAdd());
		System.out.println("Thios is my contact number : "+mrt.getMobile());
		System.out.println("Gender is : "+mrt.getGender());
		System.out.println("Password is : "+mrt.getPassword());
		System.out.println("Calling all methods by getAllData() : ");
		mrt.getAllData();
		
	}
	public String getFirstName() {
		String firstName = "Karan";
		return firstName;
	}
	public String getLastName() {
		String lastName = "Mohod";
		return lastName;
	}
	public String getEmailAdd() {
		String emailAdd = "karanmohod19@gmail.com";
		return emailAdd;
	}
	public long getMobile() {
		long mobileNo = 9545590729l;
        return mobileNo;
		}
	public String getGender() {
		String gender = "Male";
        return gender;
		}
	public String getPassword() {
		String password = "Karan@159";
		return password;
	}
	public void getAllData() {
		System.out.println("My First Name is : "+getFirstName());
		System.out.println("My Last Name is : "+getLastName());
		System.out.println("My Email Address is ; "+getEmailAdd());
		System.out.println("Thios is my contact number : "+getMobile());
		System.out.println("Gender is : "+getGender());
		System.out.println("Password is : "+getPassword());
	}

}
