package com.aurionpro.model;

public class HatDecorator implements IHat {
	IHat hat;
	

	public HatDecorator(IHat hat) {
		this.hat = hat;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return hat.getName();
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return hat.getDescription();
	}

}
