package com.coffeepoweredcrew.strategy;


import java.util.LinkedList;

//Context 
public class PrintService {
	OrderPrinter orderPrinter ;
    public PrintService(OrderPrinter orderPrinterType) {
    	orderPrinter = orderPrinterType ;
    }

    public void printOrders(LinkedList<Order> orders) {
    	orderPrinter.print(orders);
    }
}
