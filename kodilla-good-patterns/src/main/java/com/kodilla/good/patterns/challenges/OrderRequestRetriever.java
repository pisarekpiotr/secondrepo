package com.kodilla.good.patterns.challenges;


public class OrderRequestRetriever {

    public OrderRequest retrieve (){

       User user = new User("Piotr","Pisarek");
       ProductType productType = new ProductType("CPU");
       ProductName productName = new ProductName("AMD Ryzen 7");
       ProductQuantity productQuantity = new ProductQuantity(1);
       ProductPrice productPrice = new ProductPrice(1234);


       return new OrderRequest(user,productType,productName,productQuantity,productPrice);
    }
}
