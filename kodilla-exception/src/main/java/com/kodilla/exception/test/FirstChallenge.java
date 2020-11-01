package com.kodilla.exception.test;

public class FirstChallenge {

    public double divide(double a, double b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException();
        }
        return a / b;
    }

    /**
     * This main can throw an ArithmeticException!!!
     *
     * @param args
     */
    public static void main(String[] args) {

        FirstChallenge firstChallenge = new FirstChallenge();

        double a = 3;
        double b = 0;

        try {
            double result = firstChallenge.divide(a, b);
            System.out.println("Result of division is " + result);

        } catch (ArithmeticException e) {
            System.out.println("You want to divide by 0, that's acceptable ACCEPTABLE!");

        } finally {
            System.out.println("You divided " + a + " by " + b);
        }
    }
}