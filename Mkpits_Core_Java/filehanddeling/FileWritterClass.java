package com.mkpits.filehanddeling;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileWritterClass {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the contents : ");
        String str = br.readLine();
        str = str+ "\n";
        FileWriter fw = new FileWriter("D:\\FileWritter.txt",true);
        fw.write(str);
        fw.close();
        System.out.println("Contents added");
	}

}
