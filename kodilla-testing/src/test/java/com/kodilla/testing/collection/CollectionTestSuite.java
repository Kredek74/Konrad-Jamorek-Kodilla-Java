package com.kodilla.testing.collection;

import org.junit.*;
import java.util.ArrayList;

public class CollectionTestSuite {

    public OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();

    @Before
    public void beforTest(){
        System.out.println("Collection test case: Begin");
    }

    @After
    public void afterTest(){
        System.out.println("Collection Test case: End");
    }

    @BeforeClass
    public static void beforeTestClass(){
        System.out.println("Collection Test Suite: Begin");
    }

    @AfterClass
    public static void afterTestClass(){
        System.out.println("Collection Test Suite: End");
    }

    @Test
    public void testEmptyList(){

        //Given
        ArrayList<Integer> emptyList = new ArrayList<Integer>();

        //When
        ArrayList<Integer> resultListOfNumbers = new ArrayList<>(oddNumbersExterminator.exterminate(emptyList));

        //Then
        Assert.assertTrue(resultListOfNumbers.isEmpty());
    }

    @Test
    public void testFullList(){

        //Given
        ArrayList<Integer> fullListOfNumber = new ArrayList<Integer>(20);
        for (int i = 1; i <= 20; i++) {
            fullListOfNumber.add(i);
        }

        //When
        ArrayList<Integer> resultListOfNumbers = new ArrayList<>(oddNumbersExterminator.exterminate(fullListOfNumber));

        //Then
        for (fullListOfNumber : resultListOfNumbers) {
            Assert.assertTrue(resultListOfNumbers % 2 == 0);
        }
    }
}