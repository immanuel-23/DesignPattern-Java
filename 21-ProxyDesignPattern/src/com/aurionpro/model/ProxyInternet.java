package com.aurionpro.model;

import java.util.ArrayList;
import java.util.List;

public class ProxyInternet implements IInternet {

	private IInternet internet = new RealInternet();
	private static List<String> bannedSite;

	static {
		bannedSite = new ArrayList<String>();
		bannedSite.add("TicTok.com");
		bannedSite.add("abc.com");
		bannedSite.add("xyz.com");
		bannedSite.add("FACEMASK.com");
		bannedSite.add("FOLLOWS.com");

	}

	@Override
	public void connectTo(String serverHost) throws Exception {
		// TODO Auto-generated method stub
		
		if(bannedSite.contains(serverHost.toLowerCase())) {
			throw new Exception("Acces denied");
		}
		internet.connectTo(serverHost);

	}

}
