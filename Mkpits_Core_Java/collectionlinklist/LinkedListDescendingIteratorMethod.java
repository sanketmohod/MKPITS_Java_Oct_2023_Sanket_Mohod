package com.mkpits.collectionlinklist;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDescendingIteratorMethod {

	public static void main(String[] args) {

		LinkedList<Integer> list = new LinkedList<Integer>();
		// adding elements by bufferreader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the size of list : ");
		try {
			int size = Integer.parseInt(br.readLine());
			for (int i = 0; i < size; i++) {
				list.add(Integer.parseInt(br.readLine()));
			}
			System.out.println("Your list : "+list);
			// creating object of iterator
			Iterator<Integer> iterate = list.descendingIterator();
			System.out.println("Reverse order of list : ");
			while(iterate.hasNext()) {
				System.out.println(iterate.next());
			}
			
		} 
		 catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
