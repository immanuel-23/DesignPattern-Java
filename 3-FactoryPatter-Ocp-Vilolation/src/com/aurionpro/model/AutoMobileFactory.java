package com.aurionpro.model;

public class AutoMobileFactory {
	public IAutoMobile makeAutoMobile(AutoType auto) {
		if (auto.equals(AutoType.BMW))
			return new Bmw();
		else if (auto.equals(AutoType.TESLA))
			return new Tesla();
		else
			return new Maruti();

	}
}
