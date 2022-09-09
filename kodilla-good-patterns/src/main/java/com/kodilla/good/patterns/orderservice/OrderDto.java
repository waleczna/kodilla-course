package com.kodilla.good.patterns.orderservice;

class OrderDto {
    private String user;
    private boolean isOrdered;

    public OrderDto(String user, boolean isOrdered) {
        this.user = user;
        this.isOrdered = isOrdered;
    }

    public String getUser() {
        return user;
    }

    public boolean isOrdered() {
        return isOrdered;
    }

    @Override
    public String toString() {
        return "OrderDto{" +
                "user='" + user + '\'' +
                ", isOrdered=" + isOrdered +
                '}';
    }
}
