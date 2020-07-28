package com.kodilla.testing.forum.statistics;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.when;


public class ForumStatisticsTestSuite {

    @Test
    public void testZeroPostCounts() {
        //Given
        StatisticsCalculator forumStatistic = new StatisticsCalculator();
        Statistics statistics = Mockito.mock(Statistics.class);
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            list.add(String.valueOf(i));
        }
        when(statistics.usersNames()).thenReturn(list);
        when(statistics.postsCount()).thenReturn(0);
        when(statistics.commentsCount()).thenReturn(100);
        //When
        forumStatistic.calculateAdvStatistics(statistics);
        double result1 = forumStatistic.getAverageOfPosts();
        double result2 = forumStatistic.getAverageOfComments();
        double result3 = forumStatistic.getCommentsPerPost();
        //Then
        Assert.assertEquals(0, result1, 0);
        Assert.assertEquals(1, result2, 0);
        Assert.assertEquals(0, result3, 0);
    }

}
