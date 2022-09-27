package com.kodilla.patterns.strategy.social;

class Millenials extends User {

    public Millenials(String username) {
        super(username);
        socialPublisher = new FacebookPublisher();
    }
}
