package com.mkpits.exceptionhandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadingFile {
	static FileReader fr;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		FileReader fr = new FileReader("D:\\FileWritter.txt");
        BufferedReader br = new BufferedReader(fr);
        String content = " ";
        while((content = br.readLine()) != null) {
        	System.out.println(content);
        }
		}catch(Exception e) {
        try {
			fr.close();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
        System.out.println("Exception Closed.");
		}
	}

}
