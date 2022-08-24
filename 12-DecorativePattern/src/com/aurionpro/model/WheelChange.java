package com.aurionpro.model;

public class WheelChange extends CarDecorative{

	public WheelChange(ICarService carobj) {
		super(carobj);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public double getCost(){
		return 1000+super.getCost();
	}

}
