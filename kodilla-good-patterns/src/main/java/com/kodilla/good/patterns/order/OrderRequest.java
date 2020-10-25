package com.kodilla.good.patterns.order;

import java.time.LocalDate;

public class OrderRequest {

    User user;
    Product product;
    LocalDate orderDate;
    DeliveryOrder deliveryOrder;
    int quantity;

    public OrderRequest(User user, Product product, LocalDate orderDate, DeliveryOrder deliveryOrder, int quantity) {
        this.user = user;
        this.product = product;
        this.orderDate = orderDate;
        this.deliveryOrder = deliveryOrder;
        this.quantity = quantity;
    }

    public User getUser() {
        return user;
    }

    public Product getProduct() {
        return product;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public DeliveryOrder getDeliveryOrder() {
        return deliveryOrder;
    }

    public int getQuantity() {
        return quantity;
    }
}
