package com.aurionpro.model;

public class StrategyRole implements IRole{
	IRole role;
	

	public StrategyRole(IRole role) {
		this.role = role;
	}

	@Override
	public String description() {
		// TODO Auto-generated method stub
		return role.description();
	}

	@Override
	public String responsibility() {
		// TODO Auto-generated method stub
		return role.responsibility();
	}
	public void setRole(IRole role) {
		this.role = role;
	}

}
