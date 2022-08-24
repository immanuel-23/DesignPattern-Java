package com.aurionpro.model;
@ParentClass
public class Animal {
//	@ParentClass
	String str="ooo";
	
	@ParentMethod(time = 2)
	void sound() {
		System.out.println("Animal is making sound "+str);
	}

}
