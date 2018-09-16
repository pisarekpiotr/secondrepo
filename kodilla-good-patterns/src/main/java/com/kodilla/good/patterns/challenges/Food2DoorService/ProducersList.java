package com.kodilla.good.patterns.challenges.Food2DoorService;

import java.util.HashMap;
import java.util.Map;

public class ProducersList {

    private Map<String, Producer> producers = new HashMap<>();

    public ProducersList() {
        ExtraFoodShop extraFoodShop = new ExtraFoodShop("ExtraFoodShop", "Burger", "Katowice");
        GlutenFreeShop glutenFreeShop = new GlutenFreeShop("GlutenFreeShop", "Salad", "Warszawa");
        HealthyShop healthyShop = new HealthyShop("HealthyShop", "Salad", "Kraków");

        producers.put("Salad", glutenFreeShop);
        producers.put("Big Salad", glutenFreeShop);
        producers.put("Tomato salad", healthyShop);
        producers.put("Pizza", extraFoodShop);
        producers.put("Big Pizza", extraFoodShop);
        producers.put("Tagliatelle", extraFoodShop);
        producers.put("Carrot salad", healthyShop);
        producers.put("Burger Gluten free.", glutenFreeShop);
        producers.put("Italian Salad", glutenFreeShop);
        producers.put("Healthy salad", healthyShop);
        producers.put("Pizza Quattro Formaggi", extraFoodShop);
        producers.put("Double Beef Burger", extraFoodShop);
        producers.put("WaterSoup", healthyShop);

    }

    public Producer getProducer(String productName) {
        if (producers.containsKey(productName)) {
            return producers.get(productName);
        }
        return null;
    }
}