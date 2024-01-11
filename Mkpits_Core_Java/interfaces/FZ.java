package com.mkpits.interfaces;

public class FZ implements Bike {

	@Override
	public void getColor() {
		// TODO Auto-generated method stub
        System.out.println("Colors available for FZ : Blue Or Black Or Green");
	}

	@Override
	public void carFeatures() {
		// TODO Auto-generated method stub
       System.out.println("Featurs of FZ : 30km/h milage\nHigh pick up\n220cc engine");
	}

	@Override
	public void getPrize() {
		// TODO Auto-generated method stub
       System.out.println("Prize of FZ is : 2400000.00");
	}

}
