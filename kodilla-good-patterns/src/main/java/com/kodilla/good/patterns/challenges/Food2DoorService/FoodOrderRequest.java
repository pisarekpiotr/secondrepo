package com.kodilla.good.patterns.challenges.Food2DoorService;

public class FoodOrderRequest {
    private ServiceUser serviceUser;
    private String food;
    private int foodQuantity;

    public FoodOrderRequest(ServiceUser serviceUser, String food, int foodQuantity) {
        this.serviceUser = serviceUser;
        this.food = food;
        this.foodQuantity = foodQuantity;
    }

    public ServiceUser getServiceUser() {
        return serviceUser;
    }

    public String getFood() {
        return food;
    }

    public int getFoodQuantity() {
        return foodQuantity;
    }


    @Override
    public String toString() {
        return "FoodOrderRequest: " + serviceUser +
                " ,food = " + food +
                " ,foodQuantity = " + foodQuantity;
    }
}
