package com.kodilla.patterns.strategy.social;

public class FacebookPublisher implements SocialPublisher {

    @Override
    public String share(String message) {
        String text = "Sharing " + message + " on Facebook";
        System.out.println(text);
        return text;
    }
}
