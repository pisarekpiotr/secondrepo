package com.kodilla.testing.Collection;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class CollectionTestSuite {
    @Test
    public void testOddNumbersExterminatorEmptyList() {
        ArrayList<Integer> testOne = new ArrayList<Integer>();
        OddNumbersExterminator objectOne = new OddNumbersExterminator();
        ArrayList<Integer> result = objectOne.exterminate(testOne);
        Assert.assertEquals(0, result.size());
    }

    @Test
    public void testOddNumbersExterminatorNormallist() {
        ArrayList<Integer> testTwo = new ArrayList<Integer>();
        for (int i = 0; i < 50; i++) {
            if (i % 2 == 0) {
                testTwo.add(i + 1);
            } else {
                testTwo.add(i + 1);
            }
        }
        OddNumbersExterminator objectTwo = new OddNumbersExterminator();
        objectTwo.exterminate(testTwo);
        Assert.assertEquals(50, testTwo.size());
        System.out.println(testTwo);
    }
}


