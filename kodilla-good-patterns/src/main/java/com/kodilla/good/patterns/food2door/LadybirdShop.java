package com.kodilla.good.patterns.food2door;

import java.util.List;

public class LadybirdShop implements OrderService {

    ShopOfferRepository shopOfferDataBase = new ShopOfferRepository();
    List<ShopOffer> shopOfferList = shopOfferDataBase.addShopOffer();
    boolean confirmation = false;

    @Override
    public void process(OrderRequest orderRequest) {
        for (ShopOffer offer : shopOfferList) {
            if (orderRequest.getShopOffer().getSupplier().getSupplierName().equals(offer.getSupplier().getSupplierName())) {
                if (orderRequest.getShopOffer().getProduct().getProductName().equals(offer.getProduct().getProductName())) {
                    if (orderRequest.getQuantity() <= offer.getAvailableQuantity()) {
                        confirmation = true;
                    }
                }
            }
        }

        if (confirmation) {
            double price = orderRequest.getQuantity() * orderRequest.getShopOffer().getPrice();
            System.out.println("Wartosc Twojego zamowienia: " + orderRequest.getShopOffer().getProduct() + "\n" + "wynosi: "
                    + price);
            System.out.println("Smacznego!");
        } else {
            System.out.println("Twoje zamowienie: " + orderRequest.getShopOffer().getProduct() + " nie moze byc zrealizowane");
            System.out.println("Zamowiona ilosc produktu: " + orderRequest.getQuantity());
            System.out.println("Dostepna ilosc: " + orderRequest.getShopOffer().getAvailableQuantity());
        }
    }
}
