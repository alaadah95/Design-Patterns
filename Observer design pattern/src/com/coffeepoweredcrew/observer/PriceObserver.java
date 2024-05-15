package com.coffeepoweredcrew.observer;

//Concrete observer
public class PriceObserver implements OrderObserver{

	@Override
	public void updated(Order order) {
		 
		if(order.getTotal() > 10)
			 order.setDiscount(5D);
		 
		System.out.println("You will pay "+order.getTotal()+" after discount ");
	}

}
