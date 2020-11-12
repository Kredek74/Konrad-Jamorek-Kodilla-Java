package com.kodilla.good.patterns.food2door;

public class Customer {

    private final String userName;
    private final String deliveryAddress;

    public Customer(String userName, String deliveryAddress) {
        this.userName = userName;
        this.deliveryAddress = deliveryAddress;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "userName='" + userName + '\'' +
                ", deliveryAddress='" + deliveryAddress + '\'' +
                '}';
    }
}