package com.kodilla.spring;

import org.junit.Test;

public class SpringRunnerTestSuite {
    public class SpringRunnerTestSuite {
        @Test
        public void testCircleLoadedIntoContainer() {
            //Given
            ApplicationContext context =
                    new AnnotationConfigApplicationContext("com.kodilla.spring");
            Shape shape = (Shape)context.getBean("circle");
            //When
            String name = shape.getShapeName();
            //Then
            Assert.assertEquals("This is a circle.", name);
        }

        @Test
        public void testTriangleLoadedIntoContainer() {
            //Given
            ApplicationContext context =
                    new AnnotationConfigApplicationContext("com.kodilla.spring");
            Shape shape = (Shape)context.getBean("triangle");
            //When
            String name = shape.getShapeName();
            //Then
            Assert.assertEquals("This is a triangle.", name);
        }

        @Test
        public void testSquareLoadedIntoContainer() {
            //Given
            ApplicationContext context =
                    new AnnotationConfigApplicationContext("com.kodilla.spring");
            Shape shape =  (Shape)context.getBean("createSquare");
            //When
            String name = shape.getShapeName();
            //Then
            Assert.assertEquals("This is a square.", name);
        }

        @Test
        public void testShapeLoadedIntoContainer() {
            //Given
            ApplicationContext context =
                    new AnnotationConfigApplicationContext("com.kodilla.spring");
            Shape shape = (Shape)context.getBean("chosenShape");
            //When
            String name = shape.getShapeName();
            //Then
            System.out.println("Chosen shape says: " + name);
        }
}
