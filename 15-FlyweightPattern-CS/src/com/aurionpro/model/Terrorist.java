package com.aurionpro.model;

public class Terrorist implements IPlayer {
	
	private final String task="PLANT A BOMB";
	private String weapon;

	
	@Override
	public void assignWeapon(String weapon) {
		// TODO Auto-generated method stub
		this.weapon=weapon;

	}

	@Override
	public void mission() {
		// TODO Auto-generated method stub
		System.out.println("Terrorst with weapon "+ weapon+" | MISSION :" + task);

	}

}
