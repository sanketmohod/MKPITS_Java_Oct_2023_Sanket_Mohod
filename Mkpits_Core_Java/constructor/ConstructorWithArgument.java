package com.mkpits.constructor;

public class ConstructorWithArgument {
	int rollNumb;
	String name;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorWithArgument crg = new ConstructorWithArgument();
		crg.getData();
		ConstructorWithArgument crg1 = new ConstructorWithArgument(35, "Sanket");
		crg1.getData();
		ConstructorWithArgument crg2 = new ConstructorWithArgument(crg1);
		crg2.getData();
	} 
	// No parameterizes constructor
	public ConstructorWithArgument() {
		System.out.println("This is my no argument constructor.");	
		 rollNumb = 54;
		 name = "Karan";
	}
	public void getData() {
		
		System.out.println("My rollNumb is : " +rollNumb+ "\nMy name is : "+name);	
	}
	// Parameterize Constructor
	public ConstructorWithArgument(int rollNumb1, String name1) {
		rollNumb = rollNumb1;
		name = name1;
		System.out.println("Constructor with Arguments.");
	}
	// We can access the property of another constructor by passing the constructor type parameter.  
	public ConstructorWithArgument(ConstructorWithArgument object) {
		System.out.println("This is my object to object casting constructor");
		 rollNumb = object.rollNumb; // we can call members as ConstructorTypeParameter.member
		 name = object.name;
	}
	
	
	}
	

