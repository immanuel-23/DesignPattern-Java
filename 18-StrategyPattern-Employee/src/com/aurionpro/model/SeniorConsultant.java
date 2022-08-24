package com.aurionpro.model;

public class SeniorConsultant implements IRole {

	@Override
	public String description() {
		// TODO Auto-generated method stub
		return "I am senior consultant at tcs";
	}

	@Override
	public String responsibility() {
		// TODO Auto-generated method stub
		String resp= "A senior consultant provides expertise in a particular area to a company";
		return resp;
	}

}
