package com.kodilla.patterns.strategy.social;

public class User {

    private String username;
    protected SocialPublisher socialPublisher;

    public User(String username) {
        this.username = username;
    }

    public String sharePost(String post) {
        return socialPublisher.share(post);
    }

    public String getUsername() {
        return username;
    }

    public void setSocialPublisher(SocialPublisher socialPublisher) {
        this.socialPublisher = socialPublisher;
    }
}
