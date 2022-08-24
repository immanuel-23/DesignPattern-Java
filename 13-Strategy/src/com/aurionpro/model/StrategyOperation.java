package com.aurionpro.model;

public class StrategyOperation implements IOperation {
	IOperation operation;
	
	@Override
	public int doOperation(int a, int b) {
		// TODO Auto-generated method stub
		return operation.doOperation(a, b);
	}

	public StrategyOperation(IOperation operation) {
		this.operation = operation;
	}

	public void setOperation(IOperation operation) {
		this.operation = operation;
	}
	

}
