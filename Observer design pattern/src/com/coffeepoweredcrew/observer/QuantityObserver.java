package com.coffeepoweredcrew.observer;

public class QuantityObserver implements OrderObserver {

    @Override
    public void updated(Order order) {
        int count = order.getCount();
        if(count <= 5) {
            order.setShippingCost(10);
        } else {
            order.setShippingCost(10 + (count - 5) * 1.5);
        }
        System.out.print(" Shipping will cost "+order.getShippingCost() 
        				+" So you will pay "   +order.getTotal());
    }
}
