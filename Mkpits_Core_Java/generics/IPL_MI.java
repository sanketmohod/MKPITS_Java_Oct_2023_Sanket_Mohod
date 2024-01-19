package com.mkpits.generics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class IPL_MI {
	
	public static void main(String[] args) {
		List<String> mi = new ArrayList<String>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("How many players you want to retain : ");
		try {
			int retain = Integer.parseInt(br.readLine());
			System.out.println("Pick the MI players you want to retain : ");
		for (int i = 0; i < retain; i++) {
			 String name = br.readLine();
			 mi.add(name);
		}
		}
			 catch (Exception e) {
				e.printStackTrace();
			}
		System.out.println("You have retain the players : ");
		for (String string : mi) {
			System.out.println(string);
		}
		List<String> miRealese = new ArrayList<String>();
		try {
			System.out.println("How many players you want to realese : ");
			int realese = Integer.parseInt(br.readLine());
			System.out.println("Pick the the players you want to realese : ");

			for(int i=0;i<realese;i++) {
		    String name1 = br.readLine();
			miRealese.add(name1);
			}
		} 
		catch (Exception e) {
			
			e.printStackTrace();
		}
		mi.removeAll(miRealese);
		System.out.println("MI retaintion list : ");
		for (String s  : mi) {
			System.out.println(s);
		}
	}
}
