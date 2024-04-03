package com.coffeepoweredcrew.facade;

import com.coffeepoweredcrew.facade.email.EmailFacade;

public class Client {

	public static void main(String[] args) {
		Order order = new Order("101", 99.99);
		EmailFacade emailFacade = new EmailFacade();
		boolean result = emailFacade.sendOrderEmailWithoutFacade(order);
		
		System.out.println("Order Email "+ (result?"sent!":"NOT sent..."));
		
	}

	
	
}
