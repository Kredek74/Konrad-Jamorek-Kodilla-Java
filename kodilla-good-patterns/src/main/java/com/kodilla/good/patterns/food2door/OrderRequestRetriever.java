package com.kodilla.good.patterns.food2door;

public class OrderRequestRetriever {


    public OrderRequest orderRequestRetriever() {
        Customer sampleCustomer = new Customer("Konrad", "Opoczno, ul. Akacjowa 56");
        OrderRequest sampleOrder = shopOfferList.get(1);
        int sampleQuantity = 5;
        return new OrderRequest(sampleCustomer, sampleOrder, sampleQuantity);
    }
}
