package com.kodilla.good.patterns.challenges;

public class OrderDto {

    public User user;
    public boolean isPurchased;

    public OrderDto (final User user, final boolean isPurchased){
        this.user = user;
        this.isPurchased = isPurchased;

    }

    public User getUser() {
        return user;
    }

    public boolean isPurchased() {
        return isPurchased;
    }
}
