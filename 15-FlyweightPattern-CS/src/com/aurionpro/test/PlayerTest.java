package com.aurionpro.test;

import com.aurionpro.model.IPlayer;
import com.aurionpro.model.PlayerFactory;

public class PlayerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IPlayer p=PlayerFactory.getPlayer("Terrorist");
		p.assignWeapon("Ak-47");
		p.mission();
		
		p=PlayerFactory.getPlayer("Terrorist");
		p.assignWeapon("GUT KNIFE");
		p.mission();
		System.out.println("------------------------------------------------------------------");
		p=PlayerFactory.getPlayer("CounterTerrorist");
		p.assignWeapon("AK-47");
		p.mission();
		
		p=PlayerFactory.getPlayer("CounterTerrorist");
		p.assignWeapon("MAG-7");
		p.mission();
		
		p=PlayerFactory.getPlayer("Hostage");
	}
	// main difference between Factory pattern and Flyweight pattern is that flyweight pattern creates object only one time were as in factory pattern 
	// object is created everytime

}
