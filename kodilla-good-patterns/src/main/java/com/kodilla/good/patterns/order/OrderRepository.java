package com.kodilla.good.patterns.order;

import java.time.LocalDate;

public interface OrderRepository {

    boolean newOrder(User user, Product product, LocalDate orderDate, DeliveryOrder DeliveryOrder);
}
