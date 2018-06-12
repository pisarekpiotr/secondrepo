package com.kodilla.testing.Collection;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

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
        ArrayList<Integer> evenNumbers = new ArrayList<Integer>();
        ArrayList<Integer> oddNumbers = new ArrayList<Integer>();
        for (int i = 0; i < 50; i++) {
            if (i % 2 == 0) {
                oddNumbers.add(i + 1);
            } else {
                evenNumbers.add(i + 1);
            }
        }
        OddNumbersExterminator objectTwo = new OddNumbersExterminator();
        List result = objectTwo.exterminate(evenNumbers);
        Assert.assertEquals(25 , result.size());
        System.out.println(result);

    }
}


