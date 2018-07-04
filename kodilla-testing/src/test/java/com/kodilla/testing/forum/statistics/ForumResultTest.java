package com.kodilla.testing.forum.statistics;

import org.apache.tomcat.jni.User;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.startsWith;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class ForumResultTest {

    @Test
    public void calculateAdvStatisticsMock() {
        Statistics statisticsMock = mock(Statistics.class);
        StatisticsResult statisticsResult = new StatisticsResult();

        int usersQuantity = 0;
        List<String> usersList = usersGenerator(usersQuantity);
        int postQuantity = 0;
        int commentsQuantity = 0;

        when(statisticsMock.usersNames()).thenReturn(usersList);
        when(statisticsMock.postsCount()).thenReturn(postQuantity);
        when(statisticsMock.commentsCount()).thenReturn((commentsQuantity));

        if (postQuantity > 0 ){
            if (commentsQuantity > 0) {
                statisticsResult.calculateAdvStatistics(statisticsMock);
                statisticsResult.showStatistics();
                assertEquals(commentsQuantity / postQuantity, statisticsResult.getAverageCommentsPerPostt(), 1);
            }
        }
    }

    @Test
    public void calculateAdvStatisticsMock0posts() {
        Statistics statisticsMock = mock(Statistics.class);
        StatisticsResult statisticsResult = new StatisticsResult();

        int usersQuantity = 120;
        List<String> usersList = usersGenerator(usersQuantity);
        int postQuantity = 0;
        int commentsQuantity = 4560;

        when(statisticsMock.usersNames()).thenReturn(usersList);
        when(statisticsMock.postsCount()).thenReturn(postQuantity);
        when(statisticsMock.commentsCount()).thenReturn((commentsQuantity));

        if (postQuantity > 0 ){
            if (commentsQuantity > 0) {
                statisticsResult.calculateAdvStatistics(statisticsMock);
                statisticsResult.showStatistics();
                assertEquals(commentsQuantity / postQuantity, statisticsResult.getAverageCommentsPerPostt(), 1);
            }
        }
    }

    @Test
    public void calculateAdvStatisticsMock0comments() {
        Statistics statisticsMock = mock(Statistics.class);
        StatisticsResult statisticsResult = new StatisticsResult();

        int usersQuantity = 120;
        List<String> usersList = usersGenerator(usersQuantity);
        int postQuantity = 465+0;
        int commentsQuantity = 0;

        when(statisticsMock.usersNames()).thenReturn(usersList);
        when(statisticsMock.postsCount()).thenReturn(postQuantity);
        when(statisticsMock.commentsCount()).thenReturn((commentsQuantity));

        if (postQuantity > 0 ){
            if (commentsQuantity > 0) {
                statisticsResult.calculateAdvStatistics(statisticsMock);
                statisticsResult.showStatistics();
                assertEquals(commentsQuantity / postQuantity, statisticsResult.getAverageCommentsPerPostt(), 1);
            }
        }
    }

    @Test
    public void calculateAdvStatisticsMock0users() {
        Statistics statisticsMock = mock(Statistics.class);
        StatisticsResult statisticsResult = new StatisticsResult();

        int usersQuantity = 0;
        List<String> usersList = usersGenerator(usersQuantity);
        int postQuantity = 100;
        int commentsQuantity = 937;

        when(statisticsMock.usersNames()).thenReturn(usersList);
        when(statisticsMock.postsCount()).thenReturn(postQuantity);
        when(statisticsMock.commentsCount()).thenReturn((commentsQuantity));

        if (usersQuantity > 0 ){
            if (commentsQuantity > 0) {
                statisticsResult.calculateAdvStatistics(statisticsMock);
                statisticsResult.showStatistics();
                assertEquals(commentsQuantity / postQuantity, statisticsResult.getAverageCommentsPerPostt(), 1);
            }
        }
    }


    @Test
    public void calculateAdvStatisticsMock100users() {
        Statistics statisticsMock = mock(Statistics.class);
        StatisticsResult statisticsResult = new StatisticsResult();

        int usersQuantity = 100;
        List<String> usersList = usersGenerator(usersQuantity);
        int postQuantity = 100;
        int commentsQuantity = 937;

        when(statisticsMock.usersNames()).thenReturn(usersList);
        when(statisticsMock.postsCount()).thenReturn(postQuantity);
        when(statisticsMock.commentsCount()).thenReturn((commentsQuantity));

        if (postQuantity > 0 ){
            if (commentsQuantity > 0) {
                statisticsResult.calculateAdvStatistics(statisticsMock);
                statisticsResult.showStatistics();
                assertEquals(commentsQuantity / postQuantity, statisticsResult.getAverageCommentsPerPostt(), 1);
            }
        }
    }

    @Test
    public void calculateAdvStatisticsMock1000posts() {
        Statistics statisticsMock = mock(Statistics.class);
        StatisticsResult statisticsResult = new StatisticsResult();

        int usersQuantity = 100;
        List<String> usersList = usersGenerator(usersQuantity);
        int postQuantity = 1234;
        int commentsQuantity = 912;

        when(statisticsMock.usersNames()).thenReturn(usersList);
        when(statisticsMock.postsCount()).thenReturn(postQuantity);
        when(statisticsMock.commentsCount()).thenReturn((commentsQuantity));

        if (postQuantity > 0 ){
            if (commentsQuantity > 0) {
                statisticsResult.calculateAdvStatistics(statisticsMock);
                statisticsResult.showStatistics();
                assertEquals(commentsQuantity / postQuantity, statisticsResult.getAverageCommentsPerPostt(), 1);
            }
        }
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


