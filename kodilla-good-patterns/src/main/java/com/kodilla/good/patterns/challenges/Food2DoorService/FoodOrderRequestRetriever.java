package com.kodilla.good.patterns.challenges.Food2DoorService;

public class FoodOrderRequestRetriever {
    public FoodOrderRequest retrieve (){

        ServiceUser serviceUser = new ServiceUser("łukasz","Jakiś","Sosnowiec");

        return new FoodOrderRequest(serviceUser,"Pizza",10);
    }
}