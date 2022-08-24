package com.aurionpro.model;

public class SmsNotifier implements INotifier {

	@Override
	public void sendNotification(Account acc, double ammount, String transaction) {
		// TODO Auto-generated method stub
		System.out.println("Sms sent");
		// System.out.println("Account:"+acc);
		System.out.println("Account Details:" + acc.getBalance() + acc.getAccountNo() + "");

		System.out.println("Transaction type:" + transaction);
		System.out.println("Balance is:" + ammount);

	}

}
