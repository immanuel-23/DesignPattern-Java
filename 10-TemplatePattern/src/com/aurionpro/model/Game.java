package com.aurionpro.model;

public abstract class Game {
	public abstract void initialize();

	public abstract void startPlay();

	public abstract void stopPlay();

	public final void play() {
		initialize();
		startPlay();
		stopPlay();
	}

}
