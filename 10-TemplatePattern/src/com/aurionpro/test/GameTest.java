package com.aurionpro.test;

import com.aurionpro.model.Cricket;
import com.aurionpro.model.FootBall;
import com.aurionpro.model.Game;

public class GameTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Game gm = new Cricket();
		gm.play();
		System.out.println("        ");
		gm=new FootBall();
		gm.play();

	}

}
