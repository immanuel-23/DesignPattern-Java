package com.aurionpro.test;

import com.aurionpro.model.IVehicle;
import com.aurionpro.model.VehicleFactory;

public class VehicleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IVehicle car = VehicleFactory.getVehicle("Car");
		car.assignColor("Red");
		car.startEngine();

		car.assignColor("Black");
		car.startEngine();

		car.assignColor("Orange");
		car.startEngine();
		
		IVehicle truck = VehicleFactory.getVehicle("Truck");
		truck.assignColor("Red");
		truck.startEngine();
		
		truck.assignColor("Yellow");
		truck.startEngine();
		
		truck.assignColor("Green");
		truck.startEngine();
		
		
		

	}

}
