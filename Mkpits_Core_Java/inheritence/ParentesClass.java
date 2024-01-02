package com.mkpits.inheritence;
public class ParentesClass {
    String name,gender;
    long mobile;
    int pinCode;
    public void getName(String name) {
    	this.name = name;
    	System.out.println("Parentes name is : "+name);
    }
    public void getGender(String gender) {
    	this.gender = gender;
    	System.out.println("Gender of parentes is : "+gender);

    }
    ParentesClass(){
    	System.out.println("This is my parentes class.");
    }
    public void getMobile(long mobile) {
    	this.mobile = mobile;
    	System.out.println("Mobile number of parentes is : "+mobile);
    }
    ParentesClass(int pinCode){
    	this.pinCode = pinCode;
    	System.out.println("Pincode is : "+pinCode);
    }

}
