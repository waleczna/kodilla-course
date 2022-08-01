package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int addResult = calculator.add(10, 5);
        int subResult = calculator.subtract(10, 5);
        if (addResult != 15) {
            System.out.println("Add method has a bug!");
        } else {
            System.out.println("Add method is OK");
        }
        if (subResult != 5) {
            System.out.println("Sub method has a bug!");
        } else {
            System.out.println("Sub method is OK");
        }
    }
}
