package com.aurionpro.test;

import com.aurionpro.model.IInternet;
import com.aurionpro.model.ProxyInternet;

public class ProxyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IInternet internet = new ProxyInternet();
		try {
			internet.connectTo("WWW.Amazon.com");
			internet.connectTo("abc.com");
			internet.connectTo("xyz.com");


		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}

	}

}
