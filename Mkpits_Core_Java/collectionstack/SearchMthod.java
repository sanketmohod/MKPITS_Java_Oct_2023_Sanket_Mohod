package com.mkpits.collectionstack;

import java.util.Stack;

public class SearchMthod {

	public static void main(String[] args) {

		Stack<String> stack = new Stack<String>();
		stack.push("red");
		stack.push("blue");
		stack.push("black");
		stack.push("white");
		stack.push("green");
		// search() method
		int s = stack.search("white");// it will search object value and gives us index value of that object counting from last index
		System.out.println(s);
		int x = stack.search("yellow");// it will gives -1 
        System.out.println(x);
	}

}
