package com.aurionpro.model;

import java.util.HashMap;

public class VehicleFactory {
	public static HashMap<String, IVehicle> hm = new HashMap<String, IVehicle>();
	static IVehicle v = null;

	public static IVehicle getVehicle(String type) {
		if (hm.containsKey(type)) {
			v = hm.get(type);
		} else {
			switch (type) {
			case "Car":
				System.out.println("Car Object Created ");
				v = new Car();
				break;
			case "Truck":
				System.out.println("Truck object is created ");
				v = new Truck();
				break;
			default:
				throw new IllegalArgumentException("Vehicle does not exist");

			}
			hm.put(type, v);
		}

		return v;

	}

}
