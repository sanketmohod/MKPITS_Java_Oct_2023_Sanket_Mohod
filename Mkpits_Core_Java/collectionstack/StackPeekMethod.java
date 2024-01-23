package com.mkpits.collectionstack;

import java.util.Stack;

public class StackPeekMethod {

	public static void main(String[] args) {
        // non generic
		Stack stack = new Stack();
		stack.push(45);
		stack.push("Rohit");
		stack.push(true);
		stack.push(74.36f);
		
		// generic
		Stack<Integer> stack1 = new Stack<Integer>();
		stack1.push(07);
		stack1.push(10);
		stack1.push(17);
		stack1.push(18);
		stack1.push(45);
		// print
		System.out.println(stack);
		System.out.println(stack1);
		
		// peek() method
		System.out.println("Top value of the Stack is : "+stack.peek());
		System.out.println("Final Stack : " +stack);


	}

}
