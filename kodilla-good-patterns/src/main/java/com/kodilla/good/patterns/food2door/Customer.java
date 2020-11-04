package com.kodilla.good.patterns.food2door;

public class Customer {

    private String userName;
    private String deliveryAddress;

    public Customer(String userName, String deliveryAddress) {
        this.userName = userName;
        this.deliveryAddress = deliveryAddress;
    }

    public String getUserName() {
        return userName;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "userName='" + userName + '\'' +
                ", deliveryAddress='" + deliveryAddress + '\'' +
                '}';
    }
}