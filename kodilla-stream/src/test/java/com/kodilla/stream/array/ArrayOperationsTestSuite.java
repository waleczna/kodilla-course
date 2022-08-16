package com.kodilla.stream.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayOperationsTestSuite {

    @Test
    void shouldCalculateAverage() {

        //given
        int[] numbers = {25, 15, 5, 40, 15}; //avg = 20

        //when
        double average = ArrayOperations.getAverage(numbers);

        //then
        assertEquals(20, average, 0.0001);
    }
}