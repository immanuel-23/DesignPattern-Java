package com.aurionpro.model;

public class XMLDaoFactory implements IDaoFactory {

	@Override
	public IDod createDoD(String arg) {
		// TODO Auto-generated method stub
		if (arg.equalsIgnoreCase("emp"))
			return new XMLEmployee();
		if (arg.equalsIgnoreCase("department"))
			return new XMLDepartment();
//		if(type.equalsIgnoreCase("emp")) {
//			return new XMLEmpDao();
//		}
//		if(type.equalsIgnoreCase("dept")) {
//			return new XMLDeptDao();
//		}
		return null;
	}

}
