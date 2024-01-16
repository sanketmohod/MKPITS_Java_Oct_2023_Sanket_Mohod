package com.mkpits.exceptionhandling;

public class SqureException {

	public static void main(String[] args) {
		
        SqureException square = new SqureException();
        square.getSquare(-1);// throws error exception
        square.getSquare(6);
	}

	private void getSquare(int numb) {
		try 
		{
		if(numb<0) {
			throw new ExceptionString();
		}else {
			int squ = numb * numb;
			System.out.println("Square is : "+squ);
		}
		}catch(Exception e) {
			System.out.println(e);
		}
		
	}

}
