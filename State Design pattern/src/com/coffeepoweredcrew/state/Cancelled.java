package com.coffeepoweredcrew.state;

public class Cancelled implements OrderState{

	@Override
	public double handleCancellation() {
		throw new RuntimeException("The Order is already cancelled");
//		return 0;
	}


}
