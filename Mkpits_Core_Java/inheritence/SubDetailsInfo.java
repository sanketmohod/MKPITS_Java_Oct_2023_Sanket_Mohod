package com.mkpits.inheritence;

public class SubDetailsInfo extends DetailsInfo {
         
	     String gender;
	     long mobile;
	     int pinCode;
	     
	     public void getGender(String gender) {
	    	 this.gender = gender;
	    	 System.out.println(gender);
	     }
	     public void getMobile(long mobile) {
	    	 this.mobile = mobile;
	    	 System.out.println(mobile);
	     }
	     public void getPinCode(int pinCode) {
	    	 this.pinCode = pinCode;
	    	 System.out.println(pinCode);
	     }
	     public void Details() {
	         SubDetailsInfo sd = new SubDetailsInfo();
	 	    getfName(this.fName);
	 	    getlName(this.lName);
	 	    getEmail(this.email);
	 		sd.getMobile(this.mobile);
	 		sd.getGender(this.gender);
	 		sd.getPinCode(this.pinCode);
	 	}
}
