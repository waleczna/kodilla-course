package com.kodilla.good.patterns.orderservice;

public class DbRepository implements OrderRepository {
    @Override
    public void createOrder(String user, String from, String productName) {
        System.out.println("Order of " + productName + " from " + from + " to " + user + " has been saved");

    }
}
