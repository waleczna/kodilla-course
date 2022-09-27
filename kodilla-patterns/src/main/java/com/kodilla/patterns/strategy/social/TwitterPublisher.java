package com.kodilla.patterns.strategy.social;

public class TwitterPublisher implements SocialPublisher {

    @Override
    public String share(String message) {
        String text = "Sharing " + message + " on Twitter";
        System.out.println(text);
        return text;
    }
}
