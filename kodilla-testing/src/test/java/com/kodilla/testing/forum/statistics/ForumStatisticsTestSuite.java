package com.kodilla.testing.forum.statistics;

import org.junit.*;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Matchers.doubleThat;
import static org.mockito.Mockito.*;

public class ForumStatisticsTestSuite {

    private static int testCounter = 0;
    final double DELTA = 0.1;

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
    @After
    public void afterEveryTest() {
        System.out.println("Test its done");
    }

    @Test
    public void testPostsCountIsZero() {
        //Given
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();
        Statistics statistics = mock(Statistics.class);
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 100; i++){
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
        Assert.assertEquals(0.0, result1, DELTA);
        Assert.assertEquals(1.0, result2, DELTA);
        Assert.assertEquals(0.0, result3, DELTA);
    }

    @Test
    public void testShouldWorkWhenPostsCountIsThousend() {
        //Given
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();
        Statistics statistics = mock(Statistics.class);
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            list.add(String.valueOf(i));
        }
        when(statistics.usersNames()).thenReturn(list);
        when(statistics.postsCount()).thenReturn(1000);
        when(statistics.commentsCount()).thenReturn(100);
        //When
        statisticsCalculator.calculateAdvStatistics(statistics);
        double result1 = statisticsCalculator.getAverageOfPosts();
        double result2 = statisticsCalculator.getAverageOfComments();
        double result3 = statisticsCalculator.getCommentsPerPost();
        //Then
        Assert.assertEquals(10.0, result1, DELTA);
        Assert.assertEquals(1.0, result2, DELTA);
        Assert.assertEquals(0.1, result3, DELTA);
    }

    @Test
    public void testShouldWorkWhenCommentsCountIsZero() {
        //Given
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();
        Statistics statistics = mock(Statistics.class);
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            list.add(String.valueOf(i));
        }
        when(statistics.usersNames()).thenReturn(list);
        when(statistics.postsCount()).thenReturn(100);
        when(statistics.commentsCount()).thenReturn(0);
        //When
        statisticsCalculator.calculateAdvStatistics(statistics);
        double result1 = statisticsCalculator.getAverageOfPosts();
        double result2 = statisticsCalculator.getAverageOfComments();
        double result3 = statisticsCalculator.getCommentsPerPost();
        //Then
        Assert.assertEquals(1.0, result1, DELTA);
        Assert.assertEquals(0.0, result2, DELTA);
        Assert.assertEquals(0.0, result3, DELTA);
    }

    @Test
    public void testShouldWorkWhenPostsIsMoreThenComments() {
        //Given
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();
        Statistics statistics = mock(Statistics.class);
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            list.add(String.valueOf(i));
        }
        when(statistics.usersNames()).thenReturn(list);
        when(statistics.postsCount()).thenReturn(1000);
        when(statistics.commentsCount()).thenReturn(100);
        //When
        statisticsCalculator.calculateAdvStatistics(statistics);
        double result1 = statisticsCalculator.getAverageOfPosts();
        double result2 = statisticsCalculator.getAverageOfComments();
        double result3 = statisticsCalculator.getCommentsPerPost();
        //Then
        Assert.assertEquals(10.0, result1, DELTA);
        Assert.assertEquals(1.0, result2, DELTA);
        Assert.assertEquals(0.1, result3, DELTA);
    }

    @Test
    public void  testShouldWorkWhenUsersCountIsZero() {
        //Given
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();
        Statistics statistics = mock(Statistics.class);
        List<String> list = new ArrayList<>();

        when(statistics.usersNames()).thenReturn(list);
        when(statistics.postsCount()).thenReturn(0);
        when(statistics.commentsCount()).thenReturn(0);
        //When
        statisticsCalculator.calculateAdvStatistics(statistics);
        double result1 = statisticsCalculator.getAverageOfPosts();
        double result2 = statisticsCalculator.getAverageOfComments();
        double result3 = statisticsCalculator.getCommentsPerPost();
        //Then
        Assert.assertEquals(0.0, result1, DELTA);
        Assert.assertEquals(0.0, result2, DELTA);
        Assert.assertEquals(0.0, result3, DELTA);
    }
    @Test
    public void testShouldWorkWhenUserCountIsHundred() {
        //Given
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();
        Statistics statistics = mock(Statistics.class);
        List<String> list = new ArrayList<>();
        for (int i = 1; i <100; i++) {
            list.add(String.valueOf(i));
        }
        when(statistics.usersNames()).thenReturn(list);
        when(statistics.postsCount()).thenReturn(100);
        when(statistics.commentsCount()).thenReturn(100);
        //When
        statisticsCalculator.calculateAdvStatistics(statistics);
        double result1 = statisticsCalculator.getAverageOfPosts();
        double result2 = statisticsCalculator.getAverageOfComments();
        double result3 = statisticsCalculator.getCommentsPerPost();
        //Then
        Assert.assertEquals(1.0, result1, DELTA);
        Assert.assertEquals(1.0, result2, DELTA);
        Assert.assertEquals(1.0, result3, DELTA);
    }
}