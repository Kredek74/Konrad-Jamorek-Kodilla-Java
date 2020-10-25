package com.kodilla.good.patterns.order;

import java.time.LocalDate;

public class OrderManager implements OrderService {

    @Override
    public boolean order(User user, Product product, LocalDate orderDate, DeliveryOrder deliveryOrder) {
        boolean result;
        if (product.availability) {
            System.out.println("We have forwarded your order (" + product.productName + ") to be carried out");
            result = true;
        } else {
            System.out.println("Product is unavailable. We cannot proceed");
            result = false;
        }

        return result;
    }
}