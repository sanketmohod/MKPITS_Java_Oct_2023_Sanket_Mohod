package com.mkpits.methods;

public class MethdWithReturnTypeWithArgument {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // Implementation 
		MethdWithReturnTypeWithArgument mwr = new MethdWithReturnTypeWithArgument();
		//System.out.println(mwr.getDetails(2,10000));
		//OR we can hold the values in other variables
		String myDetails = mwr.getDetails(2,10000);
		System.out.println(myDetails);
	}

	private String getDetails(int id, int salary) {
		// TODO Auto-generated method stub
		double incentive = salary + salary * 0.1;
		String details = "My Id is : " +id+ " , My salary with incentive :  " +incentive;
		return details;
		// we should return same data member entities  as we have declare method with return type 
	}

}
