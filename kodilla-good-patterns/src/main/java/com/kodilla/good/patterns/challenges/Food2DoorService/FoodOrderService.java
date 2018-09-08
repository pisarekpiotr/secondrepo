package com.kodilla.good.patterns.challenges.Food2DoorService;


public class FoodOrderService {

    public static void main(String[] args) {

        ProducersList producerList = new ProducersList();
        FoodOrderRequestRetriever foodOrderRequestRetriever = new FoodOrderRequestRetriever();
        FoodOrderRequest retrieve = foodOrderRequestRetriever.retrieve();
        FoodOrderRequest order = new FoodOrderRequest(retrieve.getServiceUser(), retrieve.getFood(), retrieve.getFoodQuantity());
        Producer producer = producerList.getProducer((retrieve.getFood()));

        System.out.println("Available Producer: " + producer);
        System.out.println("Order: ");

        boolean orderprocessed = producerList.getProducer((retrieve.getFood())).process(order);
        System.out.println(orderprocessed);

    }
}

