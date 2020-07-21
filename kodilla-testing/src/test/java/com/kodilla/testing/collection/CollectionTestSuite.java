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
        ArrayList<Integer> fullListOfNumber = new ArrayList<Integer>();
        Integer allNumber[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        //When
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        ArrayList<Integer> resultListOfNumbers = exterminator.exterminate(fullListOfNumber);

        //Then
        ArrayList<Integer> evenListOfNumbers = new ArrayList<Integer>();
        Integer oddNumber[] = {2, 4, 6, 8, 10};
        Assert.assertEquals(evenListOfNumbers,resultListOfNumbers);
    }
}