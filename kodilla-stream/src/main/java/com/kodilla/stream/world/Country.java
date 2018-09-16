package com.kodilla.stream.world;

import java.math.BigDecimal;

public class Country {
    private String countryName;
    private BigDecimal peopleQuantity;

    public Country(String countryName, long peopleQuantity) {
        this.countryName = countryName;
        this.peopleQuantity = BigDecimal.valueOf(peopleQuantity);
    }

    public String getCountryName() {
        return countryName;
    }

    public BigDecimal getPeopleQuantity() {
        return peopleQuantity;
    }
}
