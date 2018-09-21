package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;

public class LoggerTestSuite {
    //private static Logger.

    @Test
    public void testGetLastLog() {
        //Given

        Logger.getInstance().log("Some new log");
        Logger.getInstance().log("Some another log");
        //When
        String lastLog = Logger.getInstance().getLastLog();
        System.out.println("Last log: " + lastLog);
        //Then
        Assert.assertEquals("Some another log", lastLog);
    }
}
