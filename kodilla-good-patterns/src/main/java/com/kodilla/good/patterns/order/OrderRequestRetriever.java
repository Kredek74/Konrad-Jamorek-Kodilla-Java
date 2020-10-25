package com.kodilla.good.patterns.order;

import java.time.LocalDate;

public class OrderRequestRetriever {

    public OrderRequest orderRequestRetriever() {

        User user = new User ("Prezes", "Jarosław", "Kaczyński");
        Product product = new Product("Kuweta ze złota", 2, true, 0.10);
        DeliveryOrder deliveryOrder = new DeliveryOrder("Wuhan", "Warszawa", LocalDate.now().plusDays(14));
        LocalDate orderDate = LocalDate.now();
        int orderQuantity = 1;

        return new OrderRequest(user, product, orderDate, deliveryOrder, orderQuantity);
    }
}
