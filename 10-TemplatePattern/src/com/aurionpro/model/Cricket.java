package com.aurionpro.model;

public class Cricket extends Game {
	@Override
	public void startPlay() {
		System.out.println("Cricket Game started!");
	}

	@Override
	public void initialize() {
		// TODO Auto-generated method stub
		System.out.println("Cricket Game initialize start playing!");

		
	}

	@Override
	public void stopPlay() {
		// TODO Auto-generated method stub
		System.out.println("Cricket Game stoped");

		
	}

}
