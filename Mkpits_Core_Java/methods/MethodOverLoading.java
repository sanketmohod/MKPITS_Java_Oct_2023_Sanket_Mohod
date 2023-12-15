package com.mkpits.methods;

public class MethodOverLoading {
        // Method Over Loading - same types of methods having different parameters..... 
	    int numb1,numb2;
	    String myName;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverLoading mol = new MethodOverLoading(25, 35); // mol - Method Over Loading
		// all are static method so can access directly
        getData();
        String fName = (getData("Karan"));
        System.out.println("My first name is : "+fName);
        getData("Mohod", 45);
        String Details = getData("7821043842", "karanmohod19@gmail.com", "Karan@45");
        System.out.println(Details);
        getData("Login", "Login Successful");
        System.out.println();
        System.out.println("Use of this keyword : ");
       
        // Use of this key word
        mol.getThis("Karan Mohod");
        System.out.println("numb1 value is : " +mol.numb1+ "\nnumb2 value is : "+mol.numb2);
	}

	private static void getData() {
		System.out.println("This is my method overloading : ");
	}
	private static String getData(String firstName) {
		return firstName;
	}
	private static void getData(String lastName , int id ) {
		System.out.println("Last name is : "+lastName+ "\nMy id is : "+id);
	}
	private static String getData(String mobNumb, String email, String password) {
		String infoDetail = "Mobile number is : " +mobNumb+ "\nEmali is : " +email+ "\nPassword is" +password;
		return infoDetail;
	}
	private static void getData(String login, String loginSuccess) {
		System.out.println("Click on login : ");
		System.out.println(login);
		System.out.println(loginSuccess);
	}
	
	// this key word....
    // this key word - mainly use for global variables
	MethodOverLoading(int numb1, int numb2){
		this.numb1 = numb1; // if the global variable and parameters are same in that situation we have to use this key word for storing the value in global variable]
		 
		this.numb2 = numb2;
	}
	void getThis(String myName) {
		this.myName = myName;
		System.out.println("My name is : " +myName);
		
	}
	
}
