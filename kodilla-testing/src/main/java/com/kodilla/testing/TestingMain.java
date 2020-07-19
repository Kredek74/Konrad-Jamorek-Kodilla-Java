package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args){

        Calculator calculator = new Calculator();
        int addResult = 12;
        int substractResult = 8;

        if (addResult ==calculator.additionAtoB(7,5)){
            System.out.println("Method additionAtoB works");
        } else {
            System.out.println("Error of method additionAtoB");
        }

        if (substractResult == calculator.substractionAfromB(14, 6)){
            System.out.println("Method substractionAfromB works");
        } else {
            System.out.println("Error of method substractionAfromB");
        }
    }
}
