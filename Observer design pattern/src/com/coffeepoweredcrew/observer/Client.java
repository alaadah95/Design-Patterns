package com.coffeepoweredcrew.observer;

public class Client {

    public static void main(String[] args) {
    	Order order = new Order("100");
    	OrderObserver orderObserver = new PriceObserver();
    	order.attach(orderObserver);
    	OrderObserver quantityObserver = new QuantityObserver();
    	order.attach(quantityObserver);
    	order.addItem(1000D);
    }
}
