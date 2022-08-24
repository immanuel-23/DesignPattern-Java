package com.aurionpro.model;

import java.util.ArrayList;
import java.util.List;

public class BookShop implements Cloneable {
	private String shopName;
	List<Book> bookList = new ArrayList();

	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public List<Book> getBookList() {
		return bookList;
	}

	public void setBookList(List<Book> bookList) {
		this.bookList = bookList;
	}

	@Override
	public String toString() {
		return "BookShop [shopName=" + shopName + ", bookList=" + bookList + "]";
	}

	@Override
	public BookShop clone() throws CloneNotSupportedException {
		BookShop shop = new BookShop();
		for (Book b : this.getBookList()) {
			shop.getBookList().add(b);
		}

		return shop;
	}

	public void loadBook() {
		for (int i = 1; i <= 10; i++) {
			Book b = new Book();
			b.setBid(i);
			b.setbName("Book" + i);
			getBookList().add(b);
		}
	}

}
