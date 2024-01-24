package com.mkpits.collectionset;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class UserInputString {

	public static void main(String[] args) {
		
		Set<String> setString = new HashSet<String>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the size of set : ");
		try {
			int size = Integer.parseInt(br.readLine());
			System.out.println("Enter your "+size+" elements : ");
		    for (int i = 0; i < size; i++) {
				setString.add(br.readLine());
			}
		    System.out.println("Your set of Cities : "+setString);
//		    System.out.println("Your set : ");
//		    for (Integer integer : setInt) {
//				System.out.println(integer);
//			}
		    System.out.println("Enter the city name you want to remove : ");
		    String city = br.readLine();
		    setString.remove(city);
		    System.out.println("After removed "+city+" city the set is : "+setString);
		    System.out.println("Enter the city name you want to add : ");
		    String cityName = br.readLine();
		    setString.add(cityName);
		    System.out.println("After adding "+cityName+" city the set is : "+setString);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
