package com.aurionpro.test;

import com.aurionpro.model.BookShop;

public class BookShopTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BookShop bs1 = new BookShop();
		bs1.setShopName("RAJ BOOK DEPO");
		bs1.loadBook();
		System.out.println(bs1.toString());

		try {
			BookShop bs2 = bs1.clone();
			bs2.setShopName("A-Z");
			System.out.println(bs2.toString());
			
			BookShop bs3 = bs2.clone();
			bs3.setShopName("A1");
			System.out.println(bs2.toString());
			System.out.println(bs3.toString());
			System.out.println(bs3.hashCode());
			System.out.println(bs2.hashCode());
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

//		bs2.setShopName("A-Z");
//		bs2.

	}

}
