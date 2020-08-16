package com.kodilla.stream.array;

import org.junit.*;

public class ArrayOperationsTestSuite {

    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
    public void testGetAverage() {
        //Given
        int numbers[] = {7, 13, 22, 23, 1, 95, 48, 36, 2, 10, 5, 73, 9, 7, 12, 56, 3, 64, 17, 53};

        //When
        double calculateAverage = ArrayOperations.getAverage(numbers);

        //Then
        Assert.assertEquals(27.8, calculateAverage, 0.001);
    }

    @Test
    public void testGetAverageForEmptyArray() {
        //Given
        int[] testArray = new int[0];

        //When
        double average = ArrayOperations.getAverage(testArray);

        //Then
        Assert.assertEquals(0, average, 0.1);
    }
}
