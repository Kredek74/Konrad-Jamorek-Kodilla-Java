package com.kodilla.good.patterns.order;

import java.time.LocalDate;

public class OrderList implements OrderRepository {

    @Override
    public boolean newOrder(User user, Product product, LocalDate orderDate, DeliveryOrder deliveryOrder) {

        boolean result;
        if (product.getAvailability()) result = true;
        else {
            result = false;
        }

        return result;
    }
}
