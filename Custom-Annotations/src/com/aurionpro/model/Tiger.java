package com.aurionpro.model;

public class Tiger extends Animal{

	@Override
	public void sound() {
		System.out.println("Dog is making sound "+str);
	}
	@ChildMethod
	public void wild() {
		System.out.println("I am wild animal");
	}
	
}
