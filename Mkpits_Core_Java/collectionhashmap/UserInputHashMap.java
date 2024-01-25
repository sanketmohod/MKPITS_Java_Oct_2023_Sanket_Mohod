package com.mkpits.collectionhashmap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map.Entry;

public class UserInputHashMap {

	public static void main(String[] args) {

		HashMap<Integer, String> map = new HashMap<Integer, String>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the size of hash map : ");
		try {
			int size = Integer.parseInt(br.readLine());
//		    System.out.println("Enter the key value : ");
//		    int key = Integer.parseInt(br.readLine());
//		    System.out.println("Enter the value of key : ");
//		    String value = br.readLine();
			for (int i = 0; i < size; i++) {
				System.out.println("Enter the key value : ");
				int key = Integer.parseInt(br.readLine());
				System.out.println("Enter the value of key : ");
				String value = br.readLine();
				map.put(key, value);
			}
			System.out.println("Set of HashMap : " + map);
			for (Entry<Integer, String> e : map.entrySet()) {

				System.out.println("Tshirt no. : " + e.getKey() + "\nName of Cricketer : " + e.getValue());
				// .getKey - detect key(index) value
				// .getValue - detect value(object/string) value
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
