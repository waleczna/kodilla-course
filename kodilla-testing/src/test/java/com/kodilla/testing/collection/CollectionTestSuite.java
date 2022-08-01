package com.kodilla.testing.collection;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class CollectionTestSuite {

    @Test
    void testOddNumbersExterminatorEmptyList() {
        //given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        List<Integer> numbers = new ArrayList<>();
        List<Integer> expected = new ArrayList<>();
        //when
        List<Integer> result = oddNumbersExterminator.exterminate(numbers);
        //then
        Assertions.assertEquals(expected, result);
    }

    @Test
    void testOddNumbersExterminatorNormalList() {
        //given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        List<Integer> numbers = List.of(3, 10, 12, 15, 19, 22);
        List<Integer> expected = List.of(10, 12, 22);
        //when
        List<Integer> result = oddNumbersExterminator.exterminate(numbers);
        //then
        Assertions.assertEquals(expected, result);
    }
}