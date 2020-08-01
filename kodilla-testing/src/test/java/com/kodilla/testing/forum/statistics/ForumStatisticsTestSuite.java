package com.kodilla.testing.forum.statistics;

import org.junit.*;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Matchers.doubleThat;
import static org.mockito.Mockito.*;

public class ForumStatisticsTestSuite {

    private static int testCounter = 0;
    final double DELTA = 0.001;

    StatisticsCalculator statisticsCalculator = new StatisticsCalculator();
    Statistics statistics = mock(Statistics.class);

    private List<String> usersList(int numberOfUsers) {
        List<String> users = new ArrayList<>();
        for (int i = 0; i < numberOfUsers; i++) {
            users.add("user");
        }
        return users;
    }

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
        System.out.println("Test #" + testCounter + " its done");
    }

    @Test
    public void testWhenAllStatisticsAreZero() {
        //Given
        when(statistics.usersNames()).thenReturn(usersList(0));
        when(statistics.postsCount()).thenReturn(0);
        when(statistics.commentsCount()).thenReturn(0);
        //When
        statisticsCalculator.calculateAdvStatistics(statistics);
        //Than
        Assert.assertEquals(0.0, statisticsCalculator.getAverageOfPosts(), DELTA);
        Assert.assertEquals(0.0, statisticsCalculator.getAverageOfComments(), DELTA);
        Assert.assertEquals(0.0, statisticsCalculator.getCommentsPerPost(), DELTA);
    }

    @Test
    public void testWhenPostsCountIsZeroNumbersOfUsersIsTenCommentsCountIsHundred() {
        //Given;
        when(statistics.usersNames()).thenReturn(usersList(10));
        when(statistics.postsCount()).thenReturn(0);
        when(statistics.commentsCount()).thenReturn(100);
        //When
        statisticsCalculator.calculateAdvStatistics(statistics);
        //Then
        Assert.assertEquals(0.0, statisticsCalculator.getAverageOfPosts(), DELTA);
        Assert.assertEquals(10.0, statisticsCalculator.getAverageOfComments(), DELTA);
        Assert.assertEquals(0.0, statisticsCalculator.getCommentsPerPost(), DELTA);
    }

    @Test
    public void testWhenPostsCountIsZeroNumbersOfUsersIsTenCommentsCountIsZero() {
        //Given;
        when(statistics.usersNames()).thenReturn(usersList(10));
        when(statistics.postsCount()).thenReturn(0);
        when(statistics.commentsCount()).thenReturn(0);
        //When
        statisticsCalculator.calculateAdvStatistics(statistics);
        //Then
        Assert.assertEquals(0.0, statisticsCalculator.getAverageOfPosts(), DELTA);
        Assert.assertEquals(0.0, statisticsCalculator.getAverageOfComments(), DELTA);
        Assert.assertEquals(0.0, statisticsCalculator.getCommentsPerPost(), DELTA);
    }

    @Test
    public void testWhenPostsCountIsThousandNumberOfUsersIsHundredCommentsCountIsThousand() {
        //Given;
        when(statistics.usersNames()).thenReturn(usersList(100));
        when(statistics.postsCount()).thenReturn(1000);
        when(statistics.commentsCount()).thenReturn(1000);
        //When
        statisticsCalculator.calculateAdvStatistics(statistics);
        //Then
        Assert.assertEquals(10.0, statisticsCalculator.getAverageOfPosts(), DELTA);
        Assert.assertEquals(10.0, statisticsCalculator.getAverageOfComments(), DELTA);
        Assert.assertEquals(1.0, statisticsCalculator.getCommentsPerPost(), DELTA);
    }

    @Test
    public void testWhenCommentsCountIsZeroNumberOfUsersIsTenPostCountIsHundred() {
        //Given
        when(statistics.usersNames()).thenReturn(usersList(10));
        when(statistics.postsCount()).thenReturn(100);
        when(statistics.commentsCount()).thenReturn(0);
        //When
        statisticsCalculator.calculateAdvStatistics(statistics);
        //Then
        Assert.assertEquals(10.0, statisticsCalculator.getAverageOfPosts(), DELTA);
        Assert.assertEquals(0.0, statisticsCalculator.getAverageOfComments(), DELTA);
        Assert.assertEquals(0.0, statisticsCalculator.getCommentsPerPost(), DELTA);
    }

    @Test
    public void testWhenPostsIsMoreThenCommentsNumberOfUsersIsThousand() {
        //Given
        when(statistics.usersNames()).thenReturn(usersList(1000));
        when(statistics.postsCount()).thenReturn(1000);
        when(statistics.commentsCount()).thenReturn(100);
        //When
        statisticsCalculator.calculateAdvStatistics(statistics);
        //Then
        Assert.assertEquals(1.0, statisticsCalculator.getAverageOfPosts(), DELTA);
        Assert.assertEquals(0.1, statisticsCalculator.getAverageOfComments(), DELTA);
        Assert.assertEquals(0.1, statisticsCalculator.getCommentsPerPost(), DELTA);
    }

    @Test
    public void testWhenPostsIsMoreThenCommentsNumberOfUsersIsHundred() {
        //Given
        when(statistics.usersNames()).thenReturn(usersList(100));
        when(statistics.postsCount()).thenReturn(1000);
        when(statistics.commentsCount()).thenReturn(100);
        //When
        //When
        statisticsCalculator.calculateAdvStatistics(statistics);
        //Then
        Assert.assertEquals(10.0, statisticsCalculator.getAverageOfPosts(), DELTA);
        Assert.assertEquals(1.0, statisticsCalculator.getAverageOfComments(), DELTA);
        Assert.assertEquals(0.1, statisticsCalculator.getCommentsPerPost(), DELTA);
    }

    @Test
    public void  testWhenUsersCountIsZeroPostsCountIsThousandCommentCountIsThousand() {
        //Given
        when(statistics.usersNames()).thenReturn(usersList(0));
        when(statistics.postsCount()).thenReturn(1000);
        when(statistics.commentsCount()).thenReturn(1000);
        //When
        //When
        statisticsCalculator.calculateAdvStatistics(statistics);
        //Then
        Assert.assertEquals(0.0, statisticsCalculator.getAverageOfPosts(), DELTA);
        Assert.assertEquals(0.0, statisticsCalculator.getAverageOfComments(), DELTA);
        Assert.assertEquals(1.0, statisticsCalculator.getCommentsPerPost(), DELTA);
    }
    @Test
    public void testWhenUserCountIsHundredPostCountIsHundredCommentCountIsHundred() {
        //Given
        when(statistics.usersNames()).thenReturn(usersList(100));
        when(statistics.postsCount()).thenReturn(100);
        when(statistics.commentsCount()).thenReturn(100);
        //When
        statisticsCalculator.calculateAdvStatistics(statistics);
        //Then
        Assert.assertEquals(1.0, statisticsCalculator.getAverageOfPosts(), DELTA);
        Assert.assertEquals(1.0, statisticsCalculator.getAverageOfComments(), DELTA);
        Assert.assertEquals(1.0, statisticsCalculator.getCommentsPerPost(), DELTA);
    }
}