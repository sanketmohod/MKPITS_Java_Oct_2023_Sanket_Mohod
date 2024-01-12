package com.mkpits.filehanddeling;

import java.io.FileInputStream;
import java.io.IOException;

public class FISClass {
      // FIS - file input stream
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
       FileInputStream fis = new FileInputStream("D:\\FOSfile.txt");
       int b=0;
       while((b=fis.read()) != -1) {
    	   System.out.print((char)b);
       }
       fis.close();
	}

}
