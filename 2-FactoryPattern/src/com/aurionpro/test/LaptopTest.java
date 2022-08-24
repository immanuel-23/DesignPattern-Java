package com.aurionpro.test;

import com.aurionpro.model.Asus;
import com.aurionpro.model.Laptop;
import com.aurionpro.model.LaptopFactory;

public class LaptopTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Asus asus = new Asus();
//		asus.specification(); in this case we are creating a object which should be hidden from client 
		
		LaptopFactory laptopFactory= new LaptopFactory();
		Laptop laptop1=laptopFactory.getInstance("Asus");
		laptop1.specification();
		Laptop laptop2=laptopFactory.getInstance("Dell");
		laptop2.specification();
		Laptop laptop3=laptopFactory.getInstance("Acer");
		laptop3.specification();
		
		Laptop laptop4=laptopFactory.getInstance("Acer");
		laptop4.specification();
		System.out.println(laptop3.hashCode());
		System.out.println(laptop4.hashCode());


		
	}

}
