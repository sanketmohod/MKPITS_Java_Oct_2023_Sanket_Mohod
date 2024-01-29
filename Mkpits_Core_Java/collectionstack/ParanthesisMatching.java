package com.mkpits.collectionstack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class ParanthesisMatching {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Elements ");
//		String str = br.readLine();
		ParanthesisMatching pm = new ParanthesisMatching();
		boolean s = pm.isParenthesisMatching(br.readLine());
		System.out.println(s);
		

	}
	boolean isParenthesisMatching(String str) {
		Stack<Character> schar = new Stack<Character>();
		for (int i = 0; i < str.length(); i++) 
		{
			char ch = str.charAt(i);
			if (ch=='(' || ch=='{' || ch=='[') {
				schar.push(ch);
				
				continue;
			}else {
				if(schar.isEmpty()) {
				return false ;
				}
				else if (isMatching(ch, schar.peek())) 
				{
					return false ;
					
				}else {
					schar.pop();
				}
			}
			
			
		}
		//System.out.println("True ");
		return schar.isEmpty();
		
		
	}
	boolean isMatching(char a , char b) 
	{
		return (a=='('&& b==')')||(a=='{'&& b=='}')||(a=='['&& b==']');
		
		
	}

}
