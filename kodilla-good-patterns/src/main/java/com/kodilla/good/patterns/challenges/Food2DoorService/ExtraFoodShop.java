package com.kodilla.good.patterns.challenges.Food2DoorService;

public class ExtraFoodShop extends Producer {


    public ExtraFoodShop(String producerName, String foodType, String address) {
        super(producerName, foodType, address);
    }

    @Override
    public boolean process(FoodOrderRequest foodOrderRequest) {
        System.out.println(foodOrderRequest);

        if (foodOrderRequest.getFoodQuantity() > 0) {
            System.out.println("Order submitted to supplier ");
            if (foodOrderRequest.getFoodQuantity() > 3) {
                System.out.println("For order quantity bigger than 3 - discount 10%");
            }
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "ExtraFoodShop";
    }
}
