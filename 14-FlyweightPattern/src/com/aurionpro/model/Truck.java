package com.aurionpro.model;

public class Truck implements IVehicle {
	private final String maxSpeed;//because its is intrinsic property
	private String color;// extrensic property
	Truck(){
		maxSpeed="120 Km/Hr";
	}

	@Override
	public void assignColor(String color) {
		// TODO Auto-generated method stub
		
		this.color=color;
	

	}

	@Override
	public void startEngine() {
		// TODO Auto-generated method stub
		System.out.println("Truck with "+color +" color has started and running at max speed of :" +maxSpeed );
	}

}
