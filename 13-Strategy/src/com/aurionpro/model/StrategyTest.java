package com.aurionpro.model;

public class StrategyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StrategyOperation op= new StrategyOperation(new AddOperation());
		System.out.println(op.doOperation(3, 4));
		op.setOperation(new MultiplyOperation());
		System.out.println(op.doOperation(3, 4));


	}

}
