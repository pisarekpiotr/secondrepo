package com.kodilla.testing.Collection;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class CollectionTestSuite {
    @Test
    public void testOddNumbersExterminatorEmptyList (){
        ArrayList<Integer> testOne = new ArrayList <Integer>  ();
        OddNumbersExterminator objectOne = new OddNumbersExterminator();
        ArrayList<Integer> result = objectOne.exterminate(testOne);
        Assert.assertEquals(0,result.size());
    }
    @Test
    public void testOddNumbersExterminatorNormallist(){
        ArrayList<Integer> testTwo = new ArrayList <Integer>  ();
        OddNumbersExterminatorNormal objectTwo = new OddNumbersExterminatorNormal();
        ArrayList<Integer> resultTwo = objectTwo.exterminate(testTwo);
        Assert.assertEquals(5,resultTwo.size());
    }

}
