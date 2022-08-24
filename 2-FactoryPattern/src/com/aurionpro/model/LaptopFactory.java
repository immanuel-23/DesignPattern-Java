package com.aurionpro.model;

public class LaptopFactory {

	public Laptop getInstance(String args) {

		if (args.equals("Asus"))
			return new Asus();
		else if (args.equals("Dell"))
			return new Dell();
		else if (args.equals("Acer"))
			return new Acer();
		return null;
	}

}
