package com.aurionpro.model;

public enum ChocolateType {
	KITKAT(30),
	SILK(40),
	SNICKERS(50),
	MUNCH(24);
	
	public int levelOfSweetness;
	
	ChocolateType(int levelOfSweetness){
		this.levelOfSweetness=levelOfSweetness;
	}
	
	public void SweetestChocolate() {
	System.out.println("Kitkat");
	}

}
