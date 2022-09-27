package com.kodilla.patterns.strategy.social;

class ZGeneration extends User {

    public ZGeneration(String username) {
        super(username);
        socialPublisher = new SnapchatPublisher();
    }
}
