package com.coffeepoweredcrew.state;

//Context class
public class Order {

	private OrderState currentState;

	public Order() {
		this.currentState  = new New();
	}
	
	public Order(OrderState orderState) {
		this.currentState = orderState;
	}

	public void paymentSuccessful() {
		currentState = new Paid();
	}

	public void dispatched() {
		currentState = new InTransit();
	}

	public void delivered() {
		currentState = new Delivered();
	}

	public double cancel() {
		double cancellationCode = currentState.handleCancellation();
		currentState = new Cancelled();
		return cancellationCode;
	}
}
