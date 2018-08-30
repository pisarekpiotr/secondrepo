package com.kodilla.good.patterns.challenges;

public class Application {

        public static void main(String[] args) {
            OrderRequest orderRequest = new OrderRequestRetriever().retrieve();

            ProductOrderService productOrderService = new ProductOrderService(new InformationService(), new OrderService(), new OrderRepository());

            productOrderService.process(orderRequest);

        }
}
