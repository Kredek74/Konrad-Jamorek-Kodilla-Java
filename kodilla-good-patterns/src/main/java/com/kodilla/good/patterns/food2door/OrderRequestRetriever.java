package com.kodilla.good.patterns.food2door;

import java.util.List;

public class OrderRequestRetriever {

    ShopOffer shopOffer = new ShopOffer(2);

    public OrderRequest orderRequestRetriever() {
        Customer sampleCustomer = new Customer("Konrad", "Opoczno, ul. Akacjowa 56");
        int sampleQuantity = 5;
        return new OrderRequest(sampleCustomer, shopOffer,sampleQuantity);
    }
}
