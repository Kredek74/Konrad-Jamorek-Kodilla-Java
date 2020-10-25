package com.kodilla.good.patterns.food2door;

import java.util.List;

public class OrderRequestRetriever {

    ShopOfferRepository shopOfferRepository = new ShopOfferRepository();
    List<ShopOffer> shopOfferList = shopOfferRepository.addShopOffer();

    public OrderRequest OrderRequestRetriever() {
        Customer sampleCustomer = new Customer("Konrad", "Opoczno, ul. Akacjowa 56");
        ShopOffer sampleOrder = shopOfferList.get();
        int sampleQuantity = 100;
        return new OrderRequest()
    }
}
