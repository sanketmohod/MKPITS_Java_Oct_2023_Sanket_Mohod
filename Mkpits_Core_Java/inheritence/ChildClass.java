package com.mkpits.inheritence;
// Method over riddling..............
// we are using same methods with same parameters
public class ChildClass extends ParentesClass {
       public void getName(String name) {
    	   super.getName("Sudhir");// we can call same method with super key word
    	   System.out.println("Child name is : "+name);
       }
       public void getGender(String gender) {
    	   super.getGender("Male");
    	   System.out.println("Gender of child is : "+gender);
       }
       ChildClass(){
    	   System.out.println("This is my child class.");
       }
       ChildClass(long mobile){
    	   super(954559072);
    	   System.out.println("Mobile number of chils is : "+mobile);
       }
       ChildClass(int pinCode){
    	   super(548723);
    	   System.out.println("Pincode of child : "+pinCode);
       }
}
