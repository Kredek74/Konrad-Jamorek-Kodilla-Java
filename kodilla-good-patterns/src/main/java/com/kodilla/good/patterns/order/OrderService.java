package com.kodilla.good.patterns.order;

import java.time.LocalDate;

public interface OrderService {

    boolean order(User user, Product product, LocalDate orderData, DeliveryOrder deliveryOrder);
}
