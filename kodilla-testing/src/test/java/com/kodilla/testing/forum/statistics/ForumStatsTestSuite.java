package com.kodilla.testing.forum.statistics;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class ForumStatsTestSuite {
    private ForumStats forumStats;
    private Statistics statisticsMock;


    @BeforeEach
    private void init() { //initial setting
        forumStats = new ForumStats(); //configuring variables instead of declaring new ones (deleting of types)
        statisticsMock = mock(Statistics.class); //configuring variables instead of declaring new ones (deleting of types)
        when(statisticsMock.postsCount()).thenReturn(100);
        when(statisticsMock.commentsCount()).thenReturn(500);
        List<String> usersList = List.of("u1", "u2", "u3", "u4", "u5");
        when(statisticsMock.usersNames()).thenReturn(usersList);

    }

    @Test
    void testZeroUsers() {

        //given
        when(statisticsMock.usersNames()).thenReturn(new ArrayList<>());

        //when
        forumStats.calculateAdvStatistics(statisticsMock);

        //then
        assertEquals(0, forumStats.getUsersCount());
        assertEquals(100, forumStats.getPostsCount());
        assertEquals(500, forumStats.getCommentsCount());
        assertEquals(0, forumStats.getPostsPerUser());
        assertEquals(0, forumStats.getCommentsPerUser());
        assertEquals(5, forumStats.getCommentsPerPost());
    }

}