package com.kodilla.testing.shape;

import org.junit.*;


public class ShapeCollectorTestSuite {
    private int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEachTest() {
        ++testCounter;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @After
    public void afterEachTest() {
        System.out.println("-----------------------------------------");
    }

    @Test
    public void testAddFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape circle = new Circle(2.0);
        //When
        shapeCollector.addFigure(circle);
        //Then
        Assert.assertEquals(circle, shapeCollector.getFigure(0));
    }

    @Test
    public void testRemoveFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape square = new Square(2.0);
        shapeCollector.addFigure(square);
        //When
        shapeCollector.removeFigure(square);
        //Then
        Assert.assertEquals(0, shapeCollector.getShapesQuantity());
    }

    @Test
    public void testGetFigure() {
        //Given
        Square square = new Square(2.0);
        Circle circle = new Circle(1.0);
        Triangle triangle = new Triangle(2.0,3.0);
        ShapeCollector shapeCollectorTest = new ShapeCollector();
        shapeCollectorTest.addFigure(square);
        shapeCollectorTest.addFigure(circle);
        shapeCollectorTest.addFigure(triangle);
        //When
        Shape shape1 = shapeCollectorTest.getFigure(0);
        Shape shape2 = shapeCollectorTest.getFigure(1);
        Shape shape3 = shapeCollectorTest.getFigure(2);
        //Then
        Assert.assertEquals(square, shape1);
        Assert.assertEquals(circle, shape2);
        Assert.assertEquals(triangle, shape3);
    }

    @Test
    public void testGetFigureIndexBellowZero() {
        //Given
        Shape square = new Square<>(2.0);
        ShapeCollector shapeCollector = new ShapeCollector();
        //When
        shapeCollector.addFigure(square);
        Shape result = shapeCollector.getFigure(-1);
        //Then
        Assert.assertNull(result);
    }

    @Test
    public void testGetFigureIndexOffTheList() {
        //Given
        Shape square = new Square<>(1);

    }

    @Test
    public void testShowFigures() {
        //Given
        Square square = new Square(2.0);
        Triangle triangle = new Triangle(2.0, 3.0);
        Circle circle = new Circle(1.0);
        ShapeCollector shapeCollectorTest = new ShapeCollector();
        shapeCollectorTest.addFigure(square);
        shapeCollectorTest.addFigure(triangle);
        shapeCollectorTest.addFigure(circle);
        //When
        String shapes = shapeCollectorTest.showFigures();
        //Then
        Assert.assertEquals("Square (2.0), Triangle (2.0, 3.0), Circle (1.0)", shapes);
    }
}