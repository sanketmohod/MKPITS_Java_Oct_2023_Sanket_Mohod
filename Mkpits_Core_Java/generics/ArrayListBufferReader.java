package com.mkpits.generics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ArrayListBufferReader {
    
	public static void main(String[] args) {
		ArrayListBufferReader albr = new ArrayListBufferReader();
		albr.getIO();

	}

	private void getIO() {
		List<String> arrList = new ArrayList<String>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter your size : ");
		try {
			int size = Integer.parseInt(br.readLine());
		    for (int i = 0; i < size; i++) {
				System.out.println("Enter the name of cricketers : ");
				String name = br.readLine();
				arrList.add(name);
			}
		    System.out.println();
		    System.out.println("You have entered the name of :  ");
		    for (String string : arrList) {
				System.out.println(string);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
