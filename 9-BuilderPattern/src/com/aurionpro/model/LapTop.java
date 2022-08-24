package com.aurionpro.model;

public class LapTop {
	String ssd;
	String ram;
	String keyboard;
	String mouse;
	boolean touchScreen;
	
	public String getSsd() {
		return ssd;
	}
	public void setSsd(String ssd) {
		this.ssd = ssd;
	}
	public String getRam() {
		return ram;
	}
	public void setRam(String ram) {
		this.ram = ram;
	}
	public String getKeyboard() {
		return keyboard;
	}
	public void setKeyboard(String keyboard) {
		this.keyboard = keyboard;
	}
	public String getMouse() {
		return mouse;
	}
	public void setMouse(String mouse) {
		this.mouse = mouse;
	}
	public boolean isTouchScreen() {
		return touchScreen;
	}
	public void setTouchScreen(boolean touchScreen) {
		this.touchScreen = touchScreen;
	}
	@Override
	public String toString() {
		return "LapTop [ssd=" + ssd + ", ram=" + ram + ", keyboard=" + keyboard + ", mouse=" + mouse + ", touchScreen="
				+ touchScreen + "]";
	}
	
	
}
