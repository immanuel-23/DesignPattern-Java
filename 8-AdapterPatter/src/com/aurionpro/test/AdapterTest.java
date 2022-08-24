package com.aurionpro.test;

import java.util.List;

import com.aurionpro.model.Hat;
import com.aurionpro.model.HatAdapter;
import com.aurionpro.model.IItem;
import com.aurionpro.model.Pepsi;
import com.aurionpro.model.ShoppingCart;

public class AdapterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hat hat=new Hat("redhat", "roundhat", 100, 1);
		
		HatAdapter hatAdapter = new HatAdapter(new Hat("normal hat", "normal but big hat", 500, 0.5));

		Pepsi p = new Pepsi("pepsi", 100);
		ShoppingCart sc = new ShoppingCart();

		sc.addItemToCart(p);
		sc.addItemToCart(hatAdapter);

		displayCartItems(sc);
		System.out.println("Total cart price: "+sc.getTotalCartPrice());

	}

	private static void displayCartItems(ShoppingCart sc) {
		List<IItem> cartItems = sc.getItems();

		for (IItem i : cartItems) {
			System.out.println("Item Name: " + i.getName());
			System.out.println("Item price: " + i.getPrice());
		}

	}

	

}
