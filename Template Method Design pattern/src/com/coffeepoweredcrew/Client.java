package com.coffeepoweredcrew;


import java.io.FileNotFoundException;

import com.coffeepoweredcrew.templatemethod.HtmlPrinter;
import com.coffeepoweredcrew.templatemethod.Order;
import com.coffeepoweredcrew.templatemethod.OrderPrinter;
import com.coffeepoweredcrew.templatemethod.TextPrinter;

public class Client {

	public static void main(String[] args) throws FileNotFoundException {
		Order order = new Order("EC255555");
		order.addItem("p1", 50);
		order.addItem("p2", 600);
		order.addItem("p3", 508);
		
		OrderPrinter printer = new TextPrinter();
		printer.printOrder(order, "alaa.txt");
		
		printer = new HtmlPrinter();
		printer.printOrder(order, "alaa.html");
		
	}
}
