package com.kodilla.testing.forum.statistics;

import org.junit.*;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ForumStatisticsTestSuite {

    private static int testCounter = 0;
    final double DELTA = 0.0001;

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

    @Test
    public void testShouldWorkWhenPostsCountIsZero() {
        //Given
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();
        Statistics statistics = mock(Statistics.class);
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            list.add(String.valueOf(i));
        }
        when(statistics.usersNames()).thenReturn(list);
        when(statistics.postsCount()).thenReturn(0);
        when(statistics.commentsCount()).thenReturn(100);
        //When
        statisticsCalculator.calculateAdvStatistics(statistics);
        double result1 = statisticsCalculator.getAverageOfPosts();
        double result2 = statisticsCalculator.getAverageOfComments();
        double result3 = statisticsCalculator.getCommentsPerPost();
        //Then
        Assert.assertEquals(0, result1, DELTA);
        Assert.assertEquals(1, result2, DELTA);
        Assert.assertEquals(0, result3, DELTA);
    }

}