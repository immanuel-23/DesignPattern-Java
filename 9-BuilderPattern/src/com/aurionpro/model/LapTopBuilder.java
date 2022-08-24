package com.aurionpro.model;

public class LapTopBuilder {
	LapTop laptop;
	
	public LapTopBuilder(){
		laptop= new LapTop();
	}
	public LapTopBuilder addSSD(String ssd){
		laptop.setSsd(ssd);
		return this;
	}
	
	public LapTopBuilder addRam(String ram){
		laptop.setRam(ram);
		return this;
	}
	
	public LapTopBuilder addkeyBoard(String keyboard){
		laptop.setKeyboard(keyboard);
		return this;
	}
	
	public LapTopBuilder addmouse(String mouse){
		laptop.setMouse(mouse);
		return this;
	}
	
	public LapTopBuilder addtouch(boolean touch){
		laptop.setTouchScreen(touch);
		return this;
	}
	
	public LapTop getLaptop() {
		
		return laptop;
	}
	

}
