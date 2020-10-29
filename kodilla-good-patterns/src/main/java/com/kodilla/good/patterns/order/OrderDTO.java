package com.kodilla.good.patterns.order;

public class OrderDTO {

    private final User user;
    private final Product product;
    private final boolean orderConfirmed;

    public OrderDTO(User user, Product product, boolean orderConfirmed) {
        this.user = user;
        this.product = product;
        this.orderConfirmed = orderConfirmed;
    }

    public User getUser() {
        return user;
    }

    public Product getProduct() {
        return product;
    }

    public boolean isOrderConfirmed() {
        return orderConfirmed;
    }
}
