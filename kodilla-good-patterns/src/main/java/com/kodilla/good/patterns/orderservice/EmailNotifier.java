package com.kodilla.good.patterns.orderservice;

public class EmailNotifier implements InformationService {
    @Override
    public void inform(String user) {
        System.out.println("User " + user + " has been notified by email.");

    }
}
