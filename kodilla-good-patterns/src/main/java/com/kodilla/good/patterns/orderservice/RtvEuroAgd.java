package com.kodilla.good.patterns.orderservice;

import java.util.Random;

public class RtvEuroAgd implements OrderService {
    @Override
    public boolean order(String user, String from, String productName, int quantity) {
        Random random = new Random();
        return random.nextBoolean();
    }
}
