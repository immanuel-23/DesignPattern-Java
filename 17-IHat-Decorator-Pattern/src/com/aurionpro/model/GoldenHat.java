package com.aurionpro.model;

public class GoldenHat extends HatDecorator{

	public GoldenHat(IHat hat) {
		super(hat);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Golden hat <-"+hat.getName();
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return "Converted to golden hat from  "+hat.getDescription();
	}

}
