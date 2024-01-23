package com.mkpits.collectionstack;

import java.util.Stack;

public class StackPopMethod {

	public static void main(String[] args) {

		// creating the object of class Stack
		Stack<String> stack = new Stack<String>();
		// pushing elements into stack
		stack.push("Amar");
		stack.push("Prem");
		stack.push("Ram");
		stack.push("Rahul");
		stack.push("Arjun");
		// print
		for (String string : stack) {
			System.out.println(string);
		}
		
		// .pop() method
		System.out.println("Popped element : "+stack.pop());// it will out the last element of the stack
		stack.pop();// it will remove the last element of stack
		System.out.println("After pop() : ");
		for (String string : stack) {
			System.out.println(string);
		}
		// one more time we use pop()
		stack.pop();
		System.out.println("After one more time of pop() : ");
		for (String string : stack) {
			System.out.println(string);
		}
	}

}
