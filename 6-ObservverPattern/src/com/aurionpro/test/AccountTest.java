package com.aurionpro.test;

import com.aurionpro.model.Account;
import com.aurionpro.model.EmailNotifier;
import com.aurionpro.model.SmsNotifier;

public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Account acc1 = new Account(1,"Immanuel",40000);
		acc1.registerNotifier(new EmailNotifier());
		acc1.registerNotifier(new SmsNotifier());

		acc1.withdraw(100);
		//System.out.println(acc1.getBalance());
		Account acc2 = new Account(2,"Rahil",40000);
		acc2.registerNotifier(new EmailNotifier());
		//acc2.registerNotifier(new SmsNotifier());

		acc2.withdraw(100);
		
	}

}
