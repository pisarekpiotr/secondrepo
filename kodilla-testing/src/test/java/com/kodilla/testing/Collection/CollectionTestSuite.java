package com.kodilla.testing.Collection;

import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Array;
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
        ArrayList<Integer> expected = new ArrayList<Integer>();

        evenNumbers.add(2);
        evenNumbers.add(22);
        evenNumbers.add(169);
        evenNumbers.add(5);
        evenNumbers.add(3);
        expected.add(2);
        expected.add(22);


        OddNumbersExterminator objectTwo = new OddNumbersExterminator();
        ArrayList <Integer> result = objectTwo.exterminate(evenNumbers);
        Assert.assertEquals(2 , result.size());
        Assert.assertEquals(expected , result);
        System.out.println(result);
    }
}


