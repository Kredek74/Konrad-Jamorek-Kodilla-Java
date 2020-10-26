package com.kodilla.good.patterns.food2door;

import java.util.List;

public class DinoShop implements OrderService {

    Customer customer;
    ShopOfferRepository shopOfferRepository = new ShopOfferRepository();
    List<ShopOffer> shopOfferList = shopOfferRepository.addShopOffer();

    @Override
    public void process(OrderRequest orderRequest) {
        customer = orderRequest.getCustomer();
        System.out.println("Witaj " + customer + "!");
        System.out.println("Dziękujemy za zaufania, jakim darzysz nasą firmę.");
        boolean result = shopOfferList.stream()
                .filter(order -> order.getSupplier().getSupplierName().equals(orderRequest.getShopOffer().getSupplier().getSupplierName()))
                .filter(order -> order.getProduct().getProductName().equals(orderRequest.getShopOffer().getProduct().getProductName()))
                .filter(order -> order.getAvailableQuantity() >= orderRequest.getQuantity())
                .map(o -> true)
                .findAny()
                .orElse(false);
        if (result) {
            System.out.println("Twoje zamowienie:" + "\n" + orderRequest.getShopOffer().getProduct() + " - "
                    + orderRequest.getQuantity() + "szt. zostalo przekazane do realizacji.");
        } else {
            System.out.println("Niestety, produkt jest niedostępny lub jest niedostepny w deklarowanej przez Ciebie ilosci.");
        }
    }
}
