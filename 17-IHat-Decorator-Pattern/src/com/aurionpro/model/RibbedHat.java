package com.aurionpro.model;

public class RibbedHat extends HatDecorator{

	public RibbedHat(IHat hat) {
		super(hat);
	}
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Ribbed <-"+hat.getName();
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return "Converted to Ribbed hat from "+hat.getDescription();
	}
}
