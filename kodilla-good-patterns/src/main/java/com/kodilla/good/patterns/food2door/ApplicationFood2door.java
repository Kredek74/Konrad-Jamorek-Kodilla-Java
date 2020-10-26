package com.kodilla.good.patterns.food2door;

public class ApplicationFood2door {

    public static void main(String[] args) throws Exception {
        ShopOfferRepository shopOfferDataBase = new ShopOfferRepository();
        shopOfferDataBase.addShopOffer();

        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.orderRequestRetriever();

        Warehouse warehouse = new Warehouse();
        warehouse.process(orderRequest);
    }
}
