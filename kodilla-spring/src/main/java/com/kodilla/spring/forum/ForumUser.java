package com.kodilla.spring.forum;

import org.springframework.stereotype.Component;

@Component
class ForumUser {
    private String username;

    public ForumUser() {
        username = "John Smith";
    }

    public String getUsername() {
        return username;
    }
}
