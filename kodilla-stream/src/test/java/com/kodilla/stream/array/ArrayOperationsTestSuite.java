package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {


    @Test
    public void testGetAverage() {

        //Given
        int table[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 17293, 19, 234, 56, 78};

        ArrayOperations.getAverage(table);

        //When
        double averageResult = ArrayOperations.getAverage(table);

        //Then
        Assert.assertEquals(1266.071, averageResult, 0.1);

    }

    @Test
    public void testGetAverage2() {
        int table[] = {};
        ArrayOperations.getAverage(table);

        //When
        double averageResult = ArrayOperations.getAverage(table);

        //Then
        Assert.assertEquals(0, averageResult, 0.1);

    }
}



