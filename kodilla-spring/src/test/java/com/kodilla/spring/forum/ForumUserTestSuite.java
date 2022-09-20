package com.kodilla.spring.forum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ForumUserTestSuite {

    @Autowired
    private ForumUser forumUser;

    @Test
    void testGetUsername() {

        // given created by Spring

        // when
        String name = forumUser.getUsername();

        // then
        Assertions.assertEquals("John Smith", name);
    }
}