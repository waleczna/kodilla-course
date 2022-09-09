package com.kodilla.good.patterns.orderservice;

class App {
    public static void main(String[] args) {
        ProductOrderService productOrderService = new ProductOrderService(new EmailNotifier(), new RtvEuroAgd(), new DbRepository());
        OrderRequest orderRequest = new OrderRequest("Iron", 1, "John Novak", "RTV, EURO, AGD");
        OrderDto orderDto = productOrderService.process(orderRequest);
        System.out.println(orderDto);

    }
}
