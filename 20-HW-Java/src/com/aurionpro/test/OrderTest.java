package com.aurionpro.test;

import java.util.ArrayList;
import java.util.List;

import com.aurionpro.model.Customer;
import com.aurionpro.model.LineItem;
import com.aurionpro.model.Order;
import com.aurionpro.model.Product;

public class OrderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p1 = new Product(1, "Laptop", 30000, 10);
		Product p2 = new Product(2, "SmartWatch", 3000, 6);
		Product p3 = new Product(3, "Shoes", 800, 10);

		Product p4 = new Product(4, "Cake", 3000, 10);
		Product p5 = new Product(5, "Char", 8000, 6);
		Product p6 = new Product(6, "Bench", 900, 10);

		LineItem l1 = new LineItem(101, 2, p1);
		LineItem l2 = new LineItem(102, 5, p2);
		LineItem l3 = new LineItem(103, 3, p3);

		LineItem l4 = new LineItem(101, 2, p4);
		LineItem l5 = new LineItem(102, 5, p5);
		LineItem l6 = new LineItem(103, 3, p6);

		List<LineItem> lineItems1 = new ArrayList<LineItem>();
		List<LineItem> lineItems2 = new ArrayList<LineItem>();

		lineItems1.add(l1);
		lineItems1.add(l2);
		lineItems1.add(l3);

		lineItems2.add(l4);
		lineItems2.add(l5);
		lineItems2.add(l6);

		Order order1 = new Order(201, "22-03-22");
		order1.addLineItems(lineItems1);

		Order order2 = new Order(201, "22-03-22");
		order2.addLineItems(lineItems2);

//		Order order1= new Order(1,"22-02-22",items);
		Customer customer1 = new Customer(1, "Immanuel");

		customer1.addOrder(order1);
		customer1.addOrder(order2);

		System.out.println("Display all orders of customer");
		System.out.println(customer1.getOrders());
		System.out.println(
				"**********************************************************************************************");

		System.out.println("Total Count of orders :" + customer1.orderCount());

		System.out.println("Total order 1 Price " + order1.calculateOrderPrice());
		System.out.println("Total order 2 Price " + order2.calculateOrderPrice());
		System.out.println(
				"Total of order 1 and order 2: " + (order1.calculateOrderPrice() + order2.calculateOrderPrice()));
		System.out.println(
				"********************************************** Line Item 1*************************************************");

		for (LineItem li : lineItems1) {
			System.out
					.println("Line item cost of " + li.getProduct().getName() + "  is :" + li.calculateLineItemCost());
		}
		System.out.println(
				"*************************************************** Line Item 2 ********************************************");
		for (LineItem li : lineItems2) {
			System.out
					.println("Line item cost of " + li.getProduct().getName() + "  is :" + li.calculateLineItemCost());
		}
		System.out.println(
				"**********************************************************************************************");

		System.out.println("Displaying all line items of customer orders");
		System.out.println("List of items in 1 order:" + order1.getItems());
		System.out.println("List of items in 2 order:" + order2.getItems());

	}

}
