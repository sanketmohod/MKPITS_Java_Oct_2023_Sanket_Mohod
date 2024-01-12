package com.mkpits.filehanddeling;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWritterClass {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
       PrintWriter pw = new PrintWriter(System.out,true);
       pw.println("Hello Everyone...");
       
       PrintWriter pw1 = new PrintWriter(new FileWriter("D:\\FileWritter.txt",true),true);
       pw1.println("Karan.....");
      
	}

}
