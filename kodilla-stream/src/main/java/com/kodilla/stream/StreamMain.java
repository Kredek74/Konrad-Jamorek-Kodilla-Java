package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.lambda.Executor;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.lambda.Processor;
import com.kodilla.stream.reference.FunctionalCalculator;

public class StreamMain {
    public static void main(String[] args) {
        Processor processor = new Processor();
        Executor codeToExecute = () -> System.out.println("This is an example text.");
        processor.execute(codeToExecute);

        ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        System.out.println("\nCalculating expressions with lambdas");

        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);

        System.out.println("\nCalculating expressions with method references");

        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);


        PoemBeautifier poemBeautifier = new PoemBeautifier();

        System.out.println("\nPoem Beautifier Examples");
        poemBeautifier.beautify("Java Rules", text -> "ABC" + text + "ABC");
        poemBeautifier.beautify("Java Rules", text -> text.toUpperCase());
        poemBeautifier.beautify("Java Rules", text -> text.toLowerCase());
        poemBeautifier.beautify("Java Rules", text -> text.replaceAll("a", "@"));
        poemBeautifier.beautify("Java Rules", text ->text.replace("", " ").trim());
        poemBeautifier.beautify("Java Rules", text -> new StringBuilder(text).reverse().toString());
        // I found this method in the javastart.pl course.
    }
}
