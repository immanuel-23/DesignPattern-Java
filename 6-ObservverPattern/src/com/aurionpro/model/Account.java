package com.aurionpro.model;

import java.util.ArrayList;
import java.util.List;

public class Account {
	private int accountNo;
	private String name;
	private double balance;
	private List<INotifier> listNotifer = new ArrayList();

	public int getAccountNo() {
		return accountNo;
	}

	public String getName() {
		return name;
	}

	public double getBalance() {
		return balance;
	}

	public List<INotifier> getListNotifer() {
		return listNotifer;
	}

	public Account(int accountNo, String name, double balance) {
		super();
		this.accountNo = accountNo;
		this.name = name;
		this.balance = balance;
	}

	public void withdraw(double ammount) {
		if (ammount > 0) {
			balance = balance - ammount;
			for(INotifier i:listNotifer) {
				i.sendNotification(this,ammount,"Withdraw");
				
			}
		}
		else
			System.out.println("Insufficent balance");
		
		
	}

	public double deposit(double ammount) {
		balance = balance + ammount;
		return 0;
	}

	public void registerNotifier(INotifier notification) {
		
		listNotifer.add(notification);

	}

	@Override
	public String toString() {
		return "Account [accountNo=" + accountNo + ", name=" + name + ", balance=" + balance + ", listNotifer="
				+ listNotifer + "]";
	}
	

}
