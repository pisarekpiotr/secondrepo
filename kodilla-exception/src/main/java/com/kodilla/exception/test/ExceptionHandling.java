package com.kodilla.exception.test;

public class ExceptionHandling {

    public static void main(String[] args) {

        try {
            SecondChallenge secondChallenge = new SecondChallenge();
            secondChallenge.probablyIWillThrowException(0,1.5);

        } catch (Exception e) {
            System.out.println("Wrong numbers. Error: " + e);

        } finally {
            System.out.println("Finally - something must be there.");
        }
    }
}
