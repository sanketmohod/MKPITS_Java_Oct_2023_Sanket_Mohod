package com.mkpits.collectionset;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class UserInputInteger {

	public static void main(String[] args) {

		Set<Integer> setInt = new HashSet<Integer>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the size of set : ");
		try {
			int size = Integer.parseInt(br.readLine());
			System.out.println("Enter your "+size+" elements : ");
		    for (int i = 0; i < size; i++) {
				setInt.add(Integer.parseInt(br.readLine()));
			}
		    System.out.println("Your set of elements : "+setInt);
//		    System.out.println("Your set : ");
//		    for (Integer integer : setInt) {
//				System.out.println(integer);
//			}
		    System.out.println("Enter the element you want to remove : ");
		    int element = Integer.parseInt(br.readLine());
		    setInt.remove(element);
		    System.out.println("After removed "+element+" the set is : "+setInt);
		    System.out.println("Enter the element you want to add : ");
		    int addElement = Integer.parseInt(br.readLine());
		    setInt.add(addElement);
		    System.out.println("After adding "+addElement+" the set is : "+setInt);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
