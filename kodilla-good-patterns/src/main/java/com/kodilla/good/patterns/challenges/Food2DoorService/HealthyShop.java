package com.kodilla.good.patterns.challenges.Food2DoorService;

public class HealthyShop extends Producer {


    public HealthyShop(String producerName, String foodType, String address) {
        super(producerName, foodType, address);
    }

    @Override
    public boolean process(FoodOrderRequest foodOrderRequest) {
        if (foodOrderRequest.getFoodQuantity() > 0) {
            System.out.println("Order submitted to supplier ");
            if (foodOrderRequest.getFoodQuantity() > 10) {
                System.out.println("Order quantity bigger than 10. Free extra salad available.");
            }
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "HealthyShop";
    }
}
