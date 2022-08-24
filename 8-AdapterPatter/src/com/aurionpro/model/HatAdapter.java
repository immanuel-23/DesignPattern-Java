package com.aurionpro.model;

public class HatAdapter implements IItem{
	private Hat hat;
	
	public HatAdapter(Hat hat) {
		super();
		this.hat = hat;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return hat.getShortName();

		
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return hat.getBasePrice()+hat.getGst();

		
	}

}
