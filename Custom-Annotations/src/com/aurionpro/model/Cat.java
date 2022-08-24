package com.aurionpro.model;

public class Cat extends Animal{
	
	@Override
	public void sound() {
		System.out.println("cat is making sound "+str);
	}
	
	@ChildMethod
	public void domestic() {
		System.out.println("I am domestic animal");
	}
	@ChildMethod
	public void color(){
		System.out.println("White");
	}

}
