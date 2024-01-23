package com.mkpits.collectionstack;

import java.util.Stack;

public class AddElement {

	public static void main(String[] args) {

		Stack stack = new Stack();
		stack.push("karan");
		stack.push(45);
		stack.push(false);
		stack.push(45.45f);
		// print
		System.out.println(stack);
		// addElement() method
		stack.addElement("sanket");//it will add the element at the end of stack
		System.out.println("After addElement() : "+stack);
	}

}
