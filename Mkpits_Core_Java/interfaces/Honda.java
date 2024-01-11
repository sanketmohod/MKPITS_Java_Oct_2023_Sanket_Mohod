package com.mkpits.interfaces;

public class Honda implements Bike {

	@Override
	public void carFeatures() {
		// TODO Auto-generated method stub
       System.out.println("Features : 70km/h milage\nComfortable seat\n150cc engine");
	}

	@Override
	public void getColor() {
		// TODO Auto-generated method stub
		String color = "Blue";
		String color1 = "Black";
		System.out.println("Colors available for Honda bike : " +color+ "Or" +color1);
	}

	@Override
	public void getPrize() {
		// TODO Auto-generated method stub
		double prize = 56000.00;
		System.out.println("Prize of Honda is : "+prize);
	}

}
