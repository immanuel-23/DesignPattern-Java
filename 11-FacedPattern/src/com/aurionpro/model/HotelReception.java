package com.aurionpro.model;

public class HotelReception {
	
	public void getIndianMenu(){
		IHotel indianHotel=new IndianHotel();
		IMenu menu = indianHotel.getMenu();
		menu.showMenu();
		
	}
	public void getChineseMenu() {
		IHotel chineseHotel=new ChineseHotel();
		IMenu menu = chineseHotel.getMenu();
		menu.showMenu();
	}
	public void getItalianMenu() {
		IHotel italianMenu= new ItalianHotel();
		IMenu menu = italianMenu.getMenu();
		menu.showMenu();
	}
	

}
