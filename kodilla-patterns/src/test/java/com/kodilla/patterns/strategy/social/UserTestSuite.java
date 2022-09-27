package com.kodilla.patterns.strategy.social;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTestSuite {

    @Test
    void testDefaultSharingStrategies() {
        //given
        User user = new Millenials( "John");

        //when
        String result = user.sharePost("Test");

        //then
        assertEquals( "Sharing Test on Facebook", result);
    }

    @Test
    void testIndividualSharingStrategy() {
    //given
    User user = new Millenials( "John");
    user.setSocialPublisher(new SnapchatPublisher());

    //when
    String result = user.sharePost("Test");

    //then
    assertEquals( "Sharing Test on Snapchat", result);
}
}