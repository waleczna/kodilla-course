package com.kodilla.good.patterns.food2door;

import java.util.Random;

public class ExtraFoodShop implements Deliverer {
    @Override
    public boolean process(Order order) {
        System.out.println("Welcome to Extra Food Shop!");
        System.out.println("Your order has been processed: " + order.getProduct() + ", " + order.getQuantity());
        Random random = new Random();
        return random.nextBoolean();
    }
}
