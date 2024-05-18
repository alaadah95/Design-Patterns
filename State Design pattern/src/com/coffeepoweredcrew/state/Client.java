package com.coffeepoweredcrew.state;

public class Client {

    public static void main(String[] args) {
    	Order order = new Order();
    	order.paymentSuccessful();
    	order.delivered();
    	order.cancel();
    	order.cancel(); //Will throw an exception .
    }
}
