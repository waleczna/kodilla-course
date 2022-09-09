package com.kodilla.good.patterns.orderservice;

public interface OrderRepository {

    void createOrder(String user, String from, String productName);
}
