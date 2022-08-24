package com.aurionpro.model;

public class CounterTerrorist implements IPlayer {
	
	private final String task="DIFFUSE  BOMB";
	private String weapon;

	@Override
	public void assignWeapon(String weapon) {
		// TODO Auto-generated method stub
		this.weapon=weapon;
	}

	@Override
	public void mission() {
		// TODO Auto-generated method stub
		System.out.println("Counter Terrorist with weapon "+weapon+ "| MISSION "+task);

	}

}
