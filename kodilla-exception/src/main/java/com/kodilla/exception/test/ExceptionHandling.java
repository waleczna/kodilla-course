package com.kodilla.exception.test;

public class ExceptionHandling {
    public static void main(String[] args) {
        SecondChallenge secondChallenge = new SecondChallenge();
        String text = "";
        try {
            text = secondChallenge.probablyIWillThrowException(0, 1.5);
        } catch (Exception e) {
           System.out.println("There was an error");
        }
        System.out.println(text);
    }
}

