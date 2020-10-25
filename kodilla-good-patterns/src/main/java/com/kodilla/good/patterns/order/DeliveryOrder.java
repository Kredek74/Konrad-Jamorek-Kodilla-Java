package com.kodilla.good.patterns.order;

import java.time.LocalDate;

public class DeliveryOrder {

    String sendCity;
    String receiveCity;
    LocalDate deliveryDate;

    public DeliveryOrder(String postingCity, String pickupCity, LocalDate deliveryDate) {
        this.sendCity = postingCity;
        this.receiveCity = pickupCity;
        this.deliveryDate = deliveryDate;
    }

    public String getSendCity() {
        return sendCity;
    }

    public String getReceiveCity() {
        return receiveCity;
    }

    public LocalDate getDeliveryDate() {
        return deliveryDate;
    }
}