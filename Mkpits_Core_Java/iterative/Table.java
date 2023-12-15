package com.mkpits.iterative;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
  // Table of number.....
public class Table {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       System.out.println("Enter the number : ");
       int n = Integer.parseInt(br.readLine());
       for(int i=1;i<=10;i++) {
    	  int  table = n * i ;
    	   //System.out.println(table);
    	   System.out.println(+n+ "*" +i+ "=" +table);
    	   
       }
	}

}
