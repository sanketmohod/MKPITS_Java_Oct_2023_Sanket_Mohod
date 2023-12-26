package com.mkpits.arrays;

public class RemveSpacefString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemveSpacefString rms = new RemveSpacefString();
		rms.removeChar();
	}

	private void removeChar() {
		// TODO Auto-generated method stub
		String name = "Sanket Mohod";
		int range = name.length();
		char ch[] = new char[range];
		System.out.println(ch.length);
		for(int i=0;i<ch.length;i++) {
			for(int j=0;j<ch.length;j++) {
				if(name.charAt(i) == name.charAt(j)) {
					
				}
			}
		}
		for (char c : ch) {
			System.out.println(c);
		}
	}

}
