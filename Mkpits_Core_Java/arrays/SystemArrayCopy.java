package com.mkpits.arrays;

public class SystemArrayCopy {
        // System.arraycopy() - is the pre-defind method which used to copy the elements of array.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String mumbaiIndians[] = {"Rohit Sharma","Ishan","Tilak","Surya","Hardik","Tim Devid","Nehal","Jasprit","Piush","Jason","Karthike"};
        String name[] = new String[7];  // initialized the array in which we have to copy the elements.
        // System.arraycopy(source array,index value,destination array,starting index value,ending index value)
        System.arraycopy(mumbaiIndians,2,name,0,7);
        for (String str : name) {
			System.out.println(str);
		}
	}

}
