package com.mkpits.filehanddeling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderClass {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
        FileReader fr = new FileReader("D:\\FileWritter.txt");
        BufferedReader br = new BufferedReader(fr);
        String content = " ";
        while((content = br.readLine()) != null) {
        	System.out.println(content);
        }
        fr.close();
	}

}
