package com.kodilla.stream.reference;

import com.kodilla.stream.lambda.ExpressionExecutor;

public class StreamMainFunctionCalculator {

    public static void main(String[] args) {

        ExpressionExecutor expressionExecutor = new ExpressionExecutor();
        System.out.println("\nCalculating expressions with method references");

        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);
    }
}
