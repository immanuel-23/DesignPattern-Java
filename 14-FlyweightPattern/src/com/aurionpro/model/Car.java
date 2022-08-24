package com.aurionpro.model;

public class Car implements IVehicle {
	private final String maxSpeed;//because its is intrinsic property
	private String color;// Extrinsic property
	
	Car(){
		maxSpeed="100 Km/ hr";
	}

	@Override
	public void assignColor(String color) {
		this.color=color;

	}

	@Override
	public void startEngine() {
		// TODO Auto-generated method stub
		System.out.println("Car with "+color +" color has started and running at max speed of :" +maxSpeed );


	}

}
