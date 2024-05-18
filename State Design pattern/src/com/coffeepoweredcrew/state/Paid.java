package com.coffeepoweredcrew.state;

public class Paid implements OrderState {

	@Override
	public double handleCancellation() {
		System.out.println("The Paid Order has been cancelled and you will get refund soon. ");
		return 80;
	} 
	
}
