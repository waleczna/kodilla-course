package com.kodilla.good.patterns.food2door;

public class DelivererFactory {

    public static final String HEALTHY_SHOP = "HEALTHY_SHOP";
    public static final String GLUTEN_FREE_SHOP = "GLUTEN_FREE_SHOP";
    public static final String EXTRA_FOOD_SHOP = "EXTRA_FOOD_SHOP";

    public static Deliverer getDeliverer(String shopName) {
        if (shopName.equals(HEALTHY_SHOP))
            return new HealthyShop();
        else if (shopName.equals(GLUTEN_FREE_SHOP))
            return new GlutenFreeShop();
        else if (shopName.equals(EXTRA_FOOD_SHOP))
            return new ExtraFoodShop();
        else
            throw new RuntimeException("Shop " + shopName + " is not supported");
    }
}

