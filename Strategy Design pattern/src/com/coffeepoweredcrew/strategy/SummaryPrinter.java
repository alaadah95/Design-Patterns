package com.coffeepoweredcrew.strategy;

import java.util.Collection;
import java.util.Iterator;

//Concrete strategy
public class SummaryPrinter implements OrderPrinter {

	@Override
	public void print(Collection<Order> list) {
		 System.out.println("************* Summery Report ***********");
		Iterator<Order> iterator = list.iterator();
		 double ordersTotal = 0;
		 while(iterator.hasNext()) {
	            Order order = iterator.next();
	            System.out.println(order.getId()+" \t"+order.getDate() +" "+order.getTotal());
	            ordersTotal += order.getTotal() ;
		 }
		 System.out.println("\t\t Total  "+ordersTotal);
	}

	
}
