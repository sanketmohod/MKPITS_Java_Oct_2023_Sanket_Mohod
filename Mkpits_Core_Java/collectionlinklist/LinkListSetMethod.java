package com.mkpits.collectionlinklist;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class LinkListSetMethod {

	public static void main(String[] args) {

		LinkedList list = new LinkedList();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the size odf list : ");
		try {
			int size = Integer.parseInt(br.readLine());
			System.out.println("Enter your "+size+" elements : ");

			for(int i=0;i<size;i++) {
			 list.add(br.readLine());// formal values
			}
			System.out.println("Your list : " +list);
			System.out.println("Enter the position to set value : ");
			int p = Integer.parseInt(br.readLine());
			System.out.println("Enter value to set : ");
			Object value = (br.readLine());//Object can store any type of value
			// .set method - obj.set(indexnumber, value)
			list.set(p, value);
			System.out.println(list);
		} 
		 catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
