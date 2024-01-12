package com.mkpits.filehanddeling;

import java.io.File;

public class FileHanddeling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         File f = new File("D:\\mkpits_workspace\\CoreJava_Sanket_Mohod");
         // File - is predefined class which is used to store the address path of directories and files
         String[] str = f.list();
         // f.list() - is the method which gives all the list of directories and files
         for(int i=0;i<str.length;i++) {
        	 File f1 = new File(f, str[i]);
        	 if(f1.isDirectory()) {
        		 System.out.println(f1.getName()+ " is derectory");
        	 }
        	 else if(f1.isFile()) {
        		 System.out.println(f1.getName()+ " is file");
        	 }
         }
	}

}
