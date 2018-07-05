package com.kodilla.testing.forum.statistics;

import org.junit.Test;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class ForumResultTest {

    @Test
    public void calculateAdvStatisticsMock0() {
        Statistics statisticsMock = mock(Statistics.class);
        StatisticsResult statisticsResult = new StatisticsResult();

        int usersQuantity = 0;
        List<String> usersList = usersGenerator(usersQuantity);
        int postQuantity = 0;
        int commentsQuantity = 0;

        when(statisticsMock.usersNames()).thenReturn(usersList);
        when(statisticsMock.postsCount()).thenReturn(postQuantity);
        when(statisticsMock.commentsCount()).thenReturn((commentsQuantity));

        statisticsResult.calculateAdvStatistics(statisticsMock);
        statisticsResult.showStatistics();
        assertEquals(0, statisticsResult.getAverageCommentsPerPostt(), 0.01);
        assertEquals(0, statisticsResult.getAverageCommentsQuantity(), 0.01);
        assertEquals(0, statisticsResult.getAveragePostQuantity(), 0.01);
    }

    @Test
    public void calculateAdvStatisticsMock1000posts() {
        Statistics statisticsMock = mock(Statistics.class);
        StatisticsResult statisticsResult = new StatisticsResult();

        int usersQuantity = 0;
        List<String> usersList = usersGenerator(usersQuantity);
        int postQuantity = 1000;
        int commentsQuantity = 1000;

        when(statisticsMock.usersNames()).thenReturn(usersList);
        when(statisticsMock.postsCount()).thenReturn(postQuantity);
        when(statisticsMock.commentsCount()).thenReturn((commentsQuantity));

        statisticsResult.calculateAdvStatistics(statisticsMock);
        statisticsResult.showStatistics();
        assertEquals(1, statisticsResult.getAverageCommentsPerPostt(), 0.01);
        assertEquals(0, statisticsResult.getAverageCommentsQuantity(), 0.01);
        assertEquals(0, statisticsResult.getAveragePostQuantity(), 0.01);
    }

    @Test
    public void calculateAdvStatisticsMock0comments() {
        Statistics statisticsMock = mock(Statistics.class);
        StatisticsResult statisticsResult = new StatisticsResult();

        int usersQuantity = 0;
        List<String> usersList = usersGenerator(usersQuantity);
        int postQuantity = 1000;
        int commentsQuantity = 0;

        when(statisticsMock.usersNames()).thenReturn(usersList);
        when(statisticsMock.postsCount()).thenReturn(postQuantity);
        when(statisticsMock.commentsCount()).thenReturn((commentsQuantity));

        statisticsResult.calculateAdvStatistics(statisticsMock);
        statisticsResult.showStatistics();
        assertEquals(0, statisticsResult.getAverageCommentsPerPostt(), 0.01);
        assertEquals(0, statisticsResult.getAverageCommentsQuantity(), 0.01);
        assertEquals(0, statisticsResult.getAveragePostQuantity(), 0.01);
    }

    @Test
    public void calculateAdvStatisticsMockPostsHigherThanComments() {
        Statistics statisticsMock = mock(Statistics.class);
        StatisticsResult statisticsResult = new StatisticsResult();

        int usersQuantity = 0;
        List<String> usersList = usersGenerator(usersQuantity);
        int postQuantity =1000;
        int commentsQuantity = 25;

        when(statisticsMock.usersNames()).thenReturn(usersList);
        when(statisticsMock.postsCount()).thenReturn(postQuantity);
        when(statisticsMock.commentsCount()).thenReturn((commentsQuantity));

        statisticsResult.calculateAdvStatistics(statisticsMock);
        statisticsResult.showStatistics();
        assertEquals(0.025, statisticsResult.getAverageCommentsPerPostt(), 0.01);
        assertEquals(0, statisticsResult.getAverageCommentsQuantity(), 0.01);
        assertEquals(0, statisticsResult.getAveragePostQuantity(), 0.01);
    }

    @Test
    public void calculateAdvStatisticsMockCommentsHigherThanPosts() {
        Statistics statisticsMock = mock(Statistics.class);
        StatisticsResult statisticsResult = new StatisticsResult();

        int usersQuantity = 0;
        List<String> usersList = usersGenerator(usersQuantity);
        int postQuantity =1000;
        int commentsQuantity = 1025;

        when(statisticsMock.usersNames()).thenReturn(usersList);
        when(statisticsMock.postsCount()).thenReturn(postQuantity);
        when(statisticsMock.commentsCount()).thenReturn((commentsQuantity));

        statisticsResult.calculateAdvStatistics(statisticsMock);
        statisticsResult.showStatistics();
        assertEquals(1.025, statisticsResult.getAverageCommentsPerPostt(), 0.01);
        assertEquals(0, statisticsResult.getAverageCommentsQuantity(), 0.01);
        assertEquals(0, statisticsResult.getAveragePostQuantity(), 0.01);
    }

    @Test
    public void calculateAdvStatisticsMock10users() {
        Statistics statisticsMock = mock(Statistics.class);
        StatisticsResult statisticsResult = new StatisticsResult();

        int usersQuantity = 100;
        List<String> usersList = usersGenerator(usersQuantity);
        int postQuantity =100;
        int commentsQuantity = 100;

        when(statisticsMock.usersNames()).thenReturn(usersList);
        when(statisticsMock.postsCount()).thenReturn(postQuantity);
        when(statisticsMock.commentsCount()).thenReturn((commentsQuantity));

        statisticsResult.calculateAdvStatistics(statisticsMock);
        statisticsResult.showStatistics();
        assertEquals(1, statisticsResult.getAverageCommentsPerPostt(), 0.01);
        assertEquals(1, statisticsResult.getAverageCommentsQuantity(), 0.01);
        assertEquals(1, statisticsResult.getAveragePostQuantity(), 0.01);
    }

    @Test
    public void calculateAdvStatisticsMock100usersCommentsHigherThanPosts() {
        Statistics statisticsMock = mock(Statistics.class);
        StatisticsResult statisticsResult = new StatisticsResult();

        int usersQuantity = 100;
        List<String> usersList = usersGenerator(usersQuantity);
        int postQuantity =100;
        int commentsQuantity = 1001;

        when(statisticsMock.usersNames()).thenReturn(usersList);
        when(statisticsMock.postsCount()).thenReturn(postQuantity);
        when(statisticsMock.commentsCount()).thenReturn((commentsQuantity));

        statisticsResult.calculateAdvStatistics(statisticsMock);
        statisticsResult.showStatistics();
        assertEquals(10.01, statisticsResult.getAverageCommentsPerPostt(), 0.01);
        assertEquals(10.01, statisticsResult.getAverageCommentsQuantity(), 0.01);
        assertEquals(1, statisticsResult.getAveragePostQuantity(), 0.01);
    }

    @Test
    public void calculateAdvStatisticsMock100usersHigherThanComments() {
        Statistics statisticsMock = mock(Statistics.class);
        StatisticsResult statisticsResult = new StatisticsResult();

        int usersQuantity = 100;
        List<String> usersList = usersGenerator(usersQuantity);
        int postQuantity =2000;
        int commentsQuantity = 1000;

        when(statisticsMock.usersNames()).thenReturn(usersList);
        when(statisticsMock.postsCount()).thenReturn(postQuantity);
        when(statisticsMock.commentsCount()).thenReturn((commentsQuantity));

        statisticsResult.calculateAdvStatistics(statisticsMock);
        statisticsResult.showStatistics();
        assertEquals(0.5, statisticsResult.getAverageCommentsPerPostt(), 0.01);
        assertEquals(10, statisticsResult.getAverageCommentsQuantity(), 0.01);
        assertEquals(20, statisticsResult.getAveragePostQuantity(), 0.01);
    }

    @Test
    public void calculateAdvStatisticsMock100users0comments() {
        Statistics statisticsMock = mock(Statistics.class);
        StatisticsResult statisticsResult = new StatisticsResult();

        int usersQuantity = 100;
        List<String> usersList = usersGenerator(usersQuantity);
        int postQuantity =100;
        int commentsQuantity = 0;

        when(statisticsMock.usersNames()).thenReturn(usersList);
        when(statisticsMock.postsCount()).thenReturn(postQuantity);
        when(statisticsMock.commentsCount()).thenReturn((commentsQuantity));

        statisticsResult.calculateAdvStatistics(statisticsMock);
        statisticsResult.showStatistics();
        assertEquals(0, statisticsResult.getAverageCommentsPerPostt(), 0.01);
        assertEquals(0, statisticsResult.getAverageCommentsQuantity(), 0.01);
        assertEquals(1, statisticsResult.getAveragePostQuantity(), 0.01);
    }

    @Test
    public void calculateAdvStatisticsMock100users1000Posts() {
        Statistics statisticsMock = mock(Statistics.class);
        StatisticsResult statisticsResult = new StatisticsResult();

        int usersQuantity = 100;
        List<String> usersList = usersGenerator(usersQuantity);
        int postQuantity =1000;
        int commentsQuantity = 10;

        when(statisticsMock.usersNames()).thenReturn(usersList);
        when(statisticsMock.postsCount()).thenReturn(postQuantity);
        when(statisticsMock.commentsCount()).thenReturn((commentsQuantity));

        statisticsResult.calculateAdvStatistics(statisticsMock);
        statisticsResult.showStatistics();
        assertEquals(0, statisticsResult.getAverageCommentsPerPostt(), 0.01);
        assertEquals(0.1, statisticsResult.getAverageCommentsQuantity(), 0.01);
        assertEquals(10, statisticsResult.getAveragePostQuantity(), 0.01);
    }

    @Test
    public void calculateAdvStatisticsMock100users0Posts() {
        Statistics statisticsMock = mock(Statistics.class);
        StatisticsResult statisticsResult = new StatisticsResult();

        int usersQuantity = 100;
        List<String> usersList = usersGenerator(usersQuantity);
        int postQuantity =0;
        int commentsQuantity = 10;

        when(statisticsMock.usersNames()).thenReturn(usersList);
        when(statisticsMock.postsCount()).thenReturn(postQuantity);
        when(statisticsMock.commentsCount()).thenReturn((commentsQuantity));

        statisticsResult.calculateAdvStatistics(statisticsMock);
        statisticsResult.showStatistics();
        assertEquals(0, statisticsResult.getAverageCommentsPerPostt(), 0.01);
        assertEquals(0.1, statisticsResult.getAverageCommentsQuantity(), 0.01);
        assertEquals(0, statisticsResult.getAveragePostQuantity(), 0.01);
    }


    private List<String> usersGenerator(int usersQuantity) {
        //User user = new User();
        List<String> usersList = new ArrayList<>();
        for (int n = 1; n <= usersQuantity; n++) {
            String userName = user();
            usersList.add(userName);
        }
        return usersList;
    }
        private String user () {
            return "User1";
        }
}


