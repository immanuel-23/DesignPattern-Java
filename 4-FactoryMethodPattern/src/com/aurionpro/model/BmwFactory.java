package com.aurionpro.model;

public class BmwFactory implements IAutoMobileFactory {
	private static IAutoMobileFactory instance;

	public BmwFactory() {

	}
	public static IAutoMobileFactory getInstance() {
		if (instance == null) {
			instance = new BmwFactory();
		}
		return instance;
	}
	@Override
	public IAutoMobile makeAutoMobile() {
		// TODO Auto-generated method stub
		return new Bmw();
	}

}
