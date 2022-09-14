package com.kodilla.good.patterns.food2door;

public class Wholesale {

    public boolean processOrder(Order order) {
        Deliverer deliverer = DelivererFactory.getDeliverer(order.getShopName());
        return deliverer.process(order);
    }
}
