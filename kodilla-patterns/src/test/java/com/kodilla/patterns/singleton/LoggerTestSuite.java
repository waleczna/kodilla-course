package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LoggerTestSuite {

    @Test
    void testGetLastLog() {
        //given
        Logger logger = Logger.getInstance();
        logger.log("Test log");

        //when
        String result = logger.getLastLog();

        //then
        Assertions.assertEquals("Test log", result);
    }

    @Test
    void testIsSingleton() {
        //given
        Logger logger = Logger.getInstance();
        Logger logger2 = Logger.getInstance();
        logger.log("Test log");
        String result1 = logger.getLastLog();
        //when
        String result2 = logger2.getLastLog();
        //then
        Assertions.assertEquals(result1, result2);
    }
}