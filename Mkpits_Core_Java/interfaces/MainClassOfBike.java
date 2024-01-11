package com.mkpits.interfaces;

public class MainClassOfBike {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Honda h = new Honda();
        h.getColor();
        h.carFeatures();
        h.getPrize();
        System.out.println();
        Pulser p = new Pulser();
        p.getColor();
        p.carFeatures();
        p.getPrize();
        System.out.println();
        FZ fz = new FZ();
        fz.getColor();
        fz.carFeatures();
        fz.getPrize();
	}

}
