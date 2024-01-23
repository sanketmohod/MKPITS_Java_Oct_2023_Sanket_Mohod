package com.mkpits.collectionlinklist;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

import javax.swing.text.AbstractDocument.BranchElement;

public class LinkListRemoveMethod {

	public static void main(String[] args) {

		LinkedList<Integer> intList = new LinkedList<Integer>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the size of list : ");
		try {
			int size = Integer.parseInt(br.readLine());
			for (int i = 0; i < size; i++) {
				intList.add(Integer.parseInt(br.readLine()));
				
			}
			System.out.println("Your lis : "+intList);
			System.out.println("inter the index value you want to remove : ");
			int index = Integer.parseInt(br.readLine());
			// .remove method
			intList.remove(index);
			System.out.println("Updated list : "+intList);
		} 
		 catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
