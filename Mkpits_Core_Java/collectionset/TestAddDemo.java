package com.mkpits.collectionset;

import java.util.HashSet;
import java.util.Set;

public class TestAddDemo {
    // Set - is an interface which implemented by the class HashSet
	// use to do mathematical operations
	// it didn't contain repeated elements
	public static void main(String[] args) {
		
		// Creating set which is implemented by class HashSet
		Set<String> setString = new HashSet<String>();
		setString.add("karan");
		setString.add("Amravati");
		setString.add("Yevatmal Road");
		setString.add("Near by papal");
		setString.add("Pimpri Nipani");
		setString.add("karan");//it didn't print repeated element
		// print
		//System.out.println(setString);
		setString.forEach(System.out::println);

	}

}
