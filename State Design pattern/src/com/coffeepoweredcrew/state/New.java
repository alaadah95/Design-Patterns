package com.coffeepoweredcrew.state;

public class New implements OrderState {

	@Override
	public double handleCancellation() {
		System.out.println("The new order has been cancelled .");
		return 30;
	}

	
}
