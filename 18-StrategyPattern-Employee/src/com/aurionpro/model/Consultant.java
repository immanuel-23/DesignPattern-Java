package com.aurionpro.model;

public class Consultant implements IRole {

	@Override
	public String description() {
		return "i am consultant ";
	}

	@Override
	public String responsibility() {
		return "working with clients to understand their needs and to agree the scope of each consulting project";
	}

}
