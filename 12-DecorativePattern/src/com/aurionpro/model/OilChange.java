package com.aurionpro.model;

public class OilChange extends CarDecorative{

	public OilChange(ICarService carobj) {
		super(carobj);
	}
	@Override
	public double getCost(){
		return 700+super.getCost();
	}

}
