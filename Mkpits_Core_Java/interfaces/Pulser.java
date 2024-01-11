package com.mkpits.interfaces;

public class Pulser implements Bike {

	@Override
	public void getColor() {
		// TODO Auto-generated method stub
        System.out.println("Color Available for pulser : Black Or Blue");
	}

	@Override
	public void carFeatures() {
		// TODO Auto-generated method stub
        System.out.println("Features of pulser : 40km/h milage\nRiding bike\n180cc engine");
	}

	@Override
	public void getPrize() {
		// TODO Auto-generated method stub
       System.out.println("Prize of pulser is : 1500000.00");
	}

}
