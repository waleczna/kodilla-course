package com.kodilla.patterns.strategy.social;

public class SnapchatPublisher implements SocialPublisher {

    @Override
    public String share(String message) {
        String text = "Sharing " + message + " on Snapchat";
        System.out.println(text);
        return text;
    }
}
