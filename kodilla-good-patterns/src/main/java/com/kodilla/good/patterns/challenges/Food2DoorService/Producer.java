package com.kodilla.good.patterns.challenges.Food2DoorService;

public abstract class Producer {

   private String producerName;
   private String foodType;
   private  String address;

    public Producer(String producerName, String foodType, String address) {
        this.producerName = producerName;
        this.foodType = foodType;
        this.address = address;
    }

    public abstract boolean process(FoodOrderRequest foodOrderRequest);

}
