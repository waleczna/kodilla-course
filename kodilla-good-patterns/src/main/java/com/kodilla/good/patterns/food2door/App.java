package com.kodilla.good.patterns.food2door;

public class App {
    public static void main(String[] args) {
        Order order = new Order(DelivererFactory.EXTRA_FOOD_SHOP, "Carrot" , 2);
        Wholesale wholesale = new Wholesale();
        System.out.println(wholesale.processOrder(order));



    }
}
