package com.mkpits.filehanddeling;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class FOSClass {
	// FOS - file output stream
	// is used to write the data and used to create the files
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter your data : ");
		String data = br.readLine();
		data = data + "\n";
		byte b[] = data.getBytes();
        // FileOutputStream - 
		FileOutputStream fos = new FileOutputStream("D:\\FOSfile.txt",true);// true-is for adding the data while false - is used for deleting the previous data and adding new data
		fos.write(b);// this method is used to write the byte data
		fos.close();
		System.out.println("data is written");
	}

}
