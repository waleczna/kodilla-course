package com.kodilla.patterns.strategy.social;

class YGeneration extends User {

    public YGeneration(String username) {
        super(username);
        socialPublisher = new TwitterPublisher();
    }
}
