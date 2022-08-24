package com.aurionpro.model;

public abstract class CarDecorative implements ICarService {
	ICarService carObj;
	public CarDecorative(ICarService carobj){
		carObj=carobj;
	}
	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return carObj.getCost();
	}

}
