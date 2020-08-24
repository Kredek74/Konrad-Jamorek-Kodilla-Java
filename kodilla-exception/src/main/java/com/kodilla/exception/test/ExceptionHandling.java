package com.kodilla.exception.test;

public class ExceptionHandling {

    public static void main(String[] args) {

        SecondChallenge secondChallenge = new SecondChallenge();

        double x = 3.6;
        double y = 1.2;

        try {
            System.out.println("We check the assumption " + secondChallenge.probablyIWillThrowException(x, y));
        } catch (Exception e) {
            System.out.println("Assumption (x >= 2 || x < 1 || y == 1.5) fulfilled ! We have an exception!");
        } finally {
            System.out.println("You used two variables in the method x = " + x + ", y = " + y);
        }
    }
}
