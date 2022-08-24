package com.aurionpro.test;

import com.aurionpro.model.Consultant;
import com.aurionpro.model.SeniorConsultant;
import com.aurionpro.model.StrategyRole;
import com.aurionpro.model.TechLead;

public class RoleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StrategyRole sr = new StrategyRole(new TechLead());
		System.out.println("Description : " + sr.description());
		System.out.println("Responsibility : " + sr.responsibility());
		sr.setRole(new SeniorConsultant());
		System.out.println("---------------------------------------------------------------------------------");
		System.out.println("Description : " + sr.description());
		System.out.println("Responsibility : " + sr.responsibility());
		System.out.println("-------------------------------------------------------------------------------------");
		sr.setRole(new Consultant());
		System.out.println("Description : " + sr.description());
		System.out.println("Responsibility : " + sr.responsibility());

	}

}
