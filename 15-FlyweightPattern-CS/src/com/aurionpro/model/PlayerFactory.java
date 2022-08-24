package com.aurionpro.model;

import java.util.HashMap;

public class PlayerFactory {
	public static HashMap<String, IPlayer> hm = new HashMap<String, IPlayer>();
	static IPlayer p = null;

	public static IPlayer getPlayer(String type) {
		if (hm.containsKey(type)) {
			p = hm.get(type);
		} else {
			switch (type) {
			case "Terrorist":
				System.out.println("Object of Terrorist Created");
				p = new Terrorist();
				break;
			case "CounterTerrorist":
				System.out.println("Object of Counter Terrorist Created");
				p = new CounterTerrorist();
				break;

			}
			hm.put(type, p);
		}

		return p;

	}
}
