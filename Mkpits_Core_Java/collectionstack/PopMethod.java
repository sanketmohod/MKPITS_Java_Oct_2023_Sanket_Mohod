package com.mkpits.collectionstack;

import java.util.Stack;

public class PopMethod {

	public static void main(String[] args) {
		
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(11);
		stack.push(12);
		stack.push(13);
		stack.push(14);
		stack.push(15);
		
		while(!stack.isEmpty()) { // last in first out
			System.out.println(stack.pop());
		}
	}

}
