package com.aurionpro.test;

import com.aurionpro.model.LapTop;
import com.aurionpro.model.LapTopBuilder;

public class LapTopTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LapTop lp= new LapTopBuilder().addSSD("500gb").addRam("32 gb").addtouch(true).addkeyBoard("Logistic").addmouse("Dell").getLaptop();
		System.out.println(lp.toString());
	}

}
