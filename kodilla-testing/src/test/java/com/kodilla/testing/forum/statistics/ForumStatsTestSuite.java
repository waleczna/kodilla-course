package com.kodilla.testing.forum.statistics;

import net.bytebuddy.dynamic.scaffold.MethodGraph;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.*;

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
        // usersNames();
        // usersCount = statistics.usersNames().size();



    @Test
    void testTheNumberOfPostsIs0() {

        //given
        when(statisticsMock.postsCount()).thenReturn(0);

        //when
        forumStats.calculateAdvStatistics(statisticsMock);

        //then
        assertEquals(5, forumStats.getUsersCount());
        assertEquals(0, forumStats.getPostsCount());
        assertEquals(500, forumStats.getCommentsCount());
        assertEquals(0, forumStats.getPostsPerUser());
        assertEquals(100, forumStats.getCommentsPerUser());
        assertEquals(0, forumStats.getCommentsPerPost());
    }

    @Test
    void testTheNumberOfPostsIs1000() {

        //given
        when(statisticsMock.postsCount()).thenReturn(1000);

        //when
        forumStats.calculateAdvStatistics(statisticsMock);

        //then
        assertEquals(5, forumStats.getUsersCount());
        assertEquals(1000, forumStats.getPostsCount());
        assertEquals(500, forumStats.getCommentsCount());
        assertEquals(200, forumStats.getPostsPerUser());
        assertEquals(100, forumStats.getCommentsPerUser());
        assertEquals(0.5, forumStats.getCommentsPerPost());
    }

    @Test
    void testTheNumberOfCommentsIs0() {

        //given
        when(statisticsMock.commentsCount()).thenReturn(0);

        //when
        forumStats.calculateAdvStatistics(statisticsMock);

        //then
        assertEquals(5, forumStats.getUsersCount());
        assertEquals(100, forumStats.getPostsCount());
        assertEquals(0, forumStats.getCommentsCount());
        assertEquals(20, forumStats.getPostsPerUser());
        assertEquals(0, forumStats.getCommentsPerUser());
        assertEquals(0, forumStats.getCommentsPerPost());
    }

    @Test
    void testNumberOfCommentsLessThanPosts() {

        //given
        when(statisticsMock.commentsCount()).thenReturn(50);

        //when
        forumStats.calculateAdvStatistics(statisticsMock);

        //then
        assertEquals(5, forumStats.getUsersCount());
        assertEquals(100, forumStats.getPostsCount());
        assertEquals(50, forumStats.getCommentsCount());
        assertEquals(20, forumStats.getPostsPerUser());
        assertEquals(10, forumStats.getCommentsPerUser());
        assertEquals(0.5, forumStats.getCommentsPerPost());
    }

    @Test
    void testNumberOfCommentsMoreThanPosts() {

        //given
        when(statisticsMock.commentsCount()).thenReturn(400);

        //when
        forumStats.calculateAdvStatistics(statisticsMock);

        //then
        assertEquals(5, forumStats.getUsersCount());
        assertEquals(100, forumStats.getPostsCount());
        assertEquals(400, forumStats.getCommentsCount());
        assertEquals(20, forumStats.getPostsPerUser());
        assertEquals(80, forumStats.getCommentsPerUser());
        assertEquals(4, forumStats.getCommentsPerPost());
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
    @Test
    void testTheNumbersOfUsersIs100() {

        //given
        when(statisticsMock.usersNames()).thenReturn();

        //when
        forumStats.calculateAdvStatistics(statisticsMock);

        //then
        assertEquals(100, forumStats.getUsersCount());
        assertEquals(100, forumStats.getPostsCount());
        assertEquals(500, forumStats.getCommentsCount());
        assertEquals(1, forumStats.getPostsPerUser());
        assertEquals(5, forumStats.getCommentsPerUser());
        assertEquals(5, forumStats.getCommentsPerPost());
    }

}
