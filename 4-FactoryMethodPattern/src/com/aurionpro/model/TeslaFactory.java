package com.aurionpro.model;

public class TeslaFactory implements IAutoMobileFactory {
	private static IAutoMobileFactory instance;

	public static IAutoMobileFactory getInstance() {
		if (instance == null) {
			instance = new TeslaFactory();

		}			
		return instance;

		
	}

	@Override
	public IAutoMobile makeAutoMobile() {
		return new Tesla();
	}

}
