package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity() {

        //Given
        World continentTest = new World();

        Continent Africa = new Continent("Africa");
        Continent Europe = new Continent("Europe");
        Continent Australia = new Continent("Australia");
        Continent Asia = new Continent("Asia");
        Continent NorthAmerica = new Continent("NorthAmerica");
        Continent SouthAmerica = new Continent("SouthAmerica");

        Africa.addCountry(new Country("RPA", 123456L));
        Africa.addCountry(new Country("Egypt", 1321245L));
        Africa.addCountry(new Country("Sudan", 12356749L));
        Europe.addCountry(new Country("Russia", 123456L));
        Europe.addCountry(new Country("Poland", 1321245L));
        Europe.addCountry(new Country("Italy", 12356749L));
        Asia.addCountry(new Country("Japan", 123456L));
        Asia.addCountry(new Country("China", 1321245L));
        Asia.addCountry(new Country("India", 12356749L));
        Australia.addCountry(new Country("Australia", 123456L));
        NorthAmerica.addCountry(new Country("Usa", 123456L));
        NorthAmerica.addCountry(new Country("Cuba", 1321245L));
        NorthAmerica.addCountry(new Country("Barbados", 12356749L));
        SouthAmerica.addCountry(new Country("Chile", 123456L));
        SouthAmerica.addCountry(new Country("Brazil", 1321245L));
        SouthAmerica.addCountry(new Country("Peru", 12356749L));

        continentTest.addContinent(Africa);
        continentTest.addContinent(Europe);
        continentTest.addContinent(Asia);
        continentTest.addContinent(Australia);
        continentTest.addContinent(NorthAmerica);
        continentTest.addContinent(SouthAmerica);

        //When
        BigDecimal totalPopulation = new BigDecimal(69130706);

        //Then
        Assert.assertEquals(totalPopulation, continentTest.getPeopleQuantity());
    }
}
