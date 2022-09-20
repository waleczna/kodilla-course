package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CalculatorTestSuit {

    @Autowired
    private Calculator calculator;

    @Test
    void testAdd() {
        // when
        double result = calculator.add(2.5, 5.5);
        // then
        Assertions.assertEquals(8, result, 0.001);
    }

    @Test
    void testSub() {
        // when
        double result = calculator.sub(2.5, 5.5);
        // then
        Assertions.assertEquals(-3, result, 0.001);
    }

    @Test
    void testMul() {
        // when
        double result = calculator.mul(2, 5.5);
        // then
        Assertions.assertEquals(11, result, 0.001);
    }

    @Test
    void testDiv() {
        // when
        double result = calculator.div(9, 3);
        // then
        Assertions.assertEquals(3, result, 0.001);
    }
}