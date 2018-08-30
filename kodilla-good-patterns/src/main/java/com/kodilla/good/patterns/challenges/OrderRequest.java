package com.kodilla.good.patterns.challenges;

public class OrderRequest {

    private User user;
    private ProductType productType;
    private ProductName productName;
    private ProductQuantity productQuantity;
    private ProductPrice productPrice;

    public OrderRequest(User user, ProductType productType, ProductName productName, ProductQuantity productQuantity, ProductPrice productPrice) {
        this.user = user;
        this.productType = productType;
        this.productName = productName;
        this.productQuantity = productQuantity;
        this.productPrice = productPrice;
    }

    public User getUser() {
        return user;
    }

    public ProductType getProductType() {
        return productType;
    }

    public ProductName getProductName() {
        return productName;
    }

    public ProductQuantity getProductQuantity() {
        return productQuantity;
    }

    public ProductPrice getProductPrice() {
        return productPrice;
    }
}
