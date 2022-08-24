package com.aurionpro.model;

public class HatDecoratorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StandardHat sh = new StandardHat();
		GoldenHat goldenHat = new GoldenHat(sh);

		System.out.println("Name:"+goldenHat.getName());
		System.out.println("Description:"+goldenHat.getDescription());

		RibbedHat ribbedHat = new RibbedHat(goldenHat);

		System.out.println("Name:"+ribbedHat.getName());
		System.out.println("Descrption:"+ribbedHat.getDescription());
		System.out.println("______________________________________________________________");

		PremiumHat ph = new PremiumHat();

		GoldenHat goldenHat2 = new GoldenHat(ph);

		System.out.println("Name:"+goldenHat2.getName());
		System.out.println("Description:"+goldenHat2.getDescription());

		RibbedHat ribbedHat2 = new RibbedHat(goldenHat2);

		System.out.println("Name:"+ribbedHat2.getName());
		System.out.println("Descrption:"+ribbedHat2.getDescription());

	}

}
