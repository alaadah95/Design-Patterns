package com.coffeepoweredcrew.templatemethod;

import java.io.FileNotFoundException;

public class Client {

	public static void main(String[] args) throws FileNotFoundException {
		Order order = new Order("EC255555");
		order.addItem("p1", 50);
		order.addItem("p2", 600);
		order.addItem("p3", 508);
		OrderPrinter printer = new TextPrinter();
		printer.printOrder(order, "alaa.txt");
		
	}
}
