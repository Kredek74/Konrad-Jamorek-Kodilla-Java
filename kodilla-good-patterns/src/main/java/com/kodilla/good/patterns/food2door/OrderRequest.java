package com.kodilla.good.patterns.food2door;

public class OrderRequest {

    private final Customer customer;
    private final ShopOffer shopOffer;
    private final int orderQuantity;

    public OrderRequest(Customer customer, ShopOffer shopOffer, int quantity) {
        this.customer = customer;
        this.shopOffer = shopOffer;
        this.orderQuantity = quantity;
    }

    public Customer getCustomer() {
        return customer;
    }

    public ShopOffer getShopOffer() {
        return shopOffer;
    }

    public int getOrderQuantity() {
        return orderQuantity;
    }

    @Override
    public String toString() {
        return "OrderRequest{" +
                "customer=" + customer +
                ", shopOffer=" + shopOffer +
                ", quantity=" + orderQuantity +
                '}';
    }
}
