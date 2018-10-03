package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {
    @Test
    public void testPizzaNew() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun("Standard bun")
                .burgers(2)
                .sauce("Spicy")
                .ingredients("Red onion")
                .ingredients("Tomato")
                .ingredients("Fresh salad")
                .ingredients("Pickle")
                .build();
        System.out.println(bigmac);
        //When
       int howManyIngredients = bigmac.getIngredients().size();
        //Then
        Assert.assertEquals(4, howManyIngredients);
    }
}
