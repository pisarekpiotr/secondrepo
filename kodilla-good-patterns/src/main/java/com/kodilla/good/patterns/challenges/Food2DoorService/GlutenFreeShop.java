package com.kodilla.good.patterns.challenges.Food2DoorService;

public class GlutenFreeShop extends Producer {

    public GlutenFreeShop(String producerName, String foodType, String address) {
        super(producerName, foodType, address);
    }

    @Override
    public boolean process(FoodOrderRequest foodOrderRequest) {
        if (foodOrderRequest.getFoodQuantity() > 0) {
            System.out.println("Order submitted to supplier ");
            if (foodOrderRequest.getFoodQuantity() > 5) {
                System.out.println("For order quantity bigger than 5 - discount 50% for next meal");
            }
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "GlutenFreeShop";
    }
}
