package com.mkpits.collectionstack;

import java.util.Stack;

public class StackPushMethd {
    // .push method use to push the elements in stack
	public static void main(String[] args) {
		
		// Creating object of stack
		Stack<Integer> stack = new Stack<Integer>();
		//.push() method
		stack.push(25);
		stack.push(35);
		stack.push(45);
		stack.push(55);
		stack.push(65);
		//print
		for (Integer integer : stack) {
			System.out.println(integer);
		}
	}

}
