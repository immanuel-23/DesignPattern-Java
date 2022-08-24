package com.aurionpro.model;

public class CarServiceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CarService car = new CarService();
		// in this case we are decorating car into oil then to wheel
		OilChange carOil = new OilChange(car);
		WheelChange carWheel = new WheelChange(carOil);
		System.out.println(carWheel.getCost());

	}

}
