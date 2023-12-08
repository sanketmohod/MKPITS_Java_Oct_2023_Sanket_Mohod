package com.mkpits.methods;

public class AllTypesOfMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// we can directly call static method with no return type and no arguments
         getMarks();	
        // To call non static method with return type it required object reference of class
        AllTypesOfMethods call = new AllTypesOfMethods();
        System.out.println("My full name is : "+call.getMyName());
        // calling method with arguments with no return types
        call.getContact(7821043842l);
        // calling method with arguments with return type
        String Myaddress = call.getData("karanmohod19@gmail.com", "Pass@456");
        System.out.println(Myaddress);
        // we can directly call static method with Argument and return type
        System.out.println(getInfo("The Hitman Rohit Sharma"));
       //.out.println("sum is : "+getSum(20, 10));
        getSum(20, 10);
	}
      
	private static int getSum(int a,int b) {
		int sum = a + b;
		System.out.println("sum is : "+sum);
		return sum ;		
	}

	// method with no return type no arguments
	private static void getMarks() {
		float Marks_10th = 86.80f; 
		float Marks_12th = 68.62f;
		float Marks_BE = 74.32f;
		System.out.println("My 10th percentage is : "+Marks_10th);
		System.out.println("My 12th percentage is : "+Marks_12th);
		System.out.println("My BE percentage is : "+Marks_BE); 
	}
	   // method with return type with no arguments
	private String getMyName() {
		String MyName = "Sanket Ananta Mohod";
		return MyName;	
	}
	   // method with no return type with arguments
	   // In this method we have to pass the variable parameters 
	   // public - access specifier which provide the scope of method  
	public void getContact(long mobile) {
		System.out.println("My contact number is : "+mobile);
	}	
	  // method with arguments with return type
	private String getData(String email, String password) {
		String idPassword = "My email address is : " +email+ " & My password is : " +password;
	    return idPassword;
	}
	// static method with argument and return type
	 private static String getInfo(String name) {
	    	String name1 = "My favorite Cricketer is : "+name;
			return name1;	
		}
	
}
