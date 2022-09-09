package com.kodilla.good.patterns.orderservice;

public class OrderRequest {
    private String productName;
    private int quantity;
    private String user;

    private String from;

    public OrderRequest(String productName, int quantity, String user, String from) {
        this.productName = productName;
        this.quantity = quantity;
        this.user = user;
        this.from = from;
    }

    public String getProductName() {
        return productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getUser() {
        return user;
    }

    public String getFrom() {
        return from;
    }
}

