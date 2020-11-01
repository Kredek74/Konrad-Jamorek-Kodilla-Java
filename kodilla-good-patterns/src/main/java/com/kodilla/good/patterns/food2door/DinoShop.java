package com.kodilla.good.patterns.food2door;

public class DinoShop implements OrderService {

    Customer customer;
    ShopOfferRepository shopOfferRepository = new ShopOfferRepository();

    @Override
    public void process(OrderRequest orderRequest) {
        customer = orderRequest.getCustomer();
        System.out.println("Witaj " + customer + "!");
        System.out.println("Dziękujemy za zaufania, jakim darzysz nasą firmę.");
        boolean result = shopOfferRepository.orderExist(orderRequest.getShopOffer());
        if (result) {
            System.out.println("Twoje zamowienie:" + "\n" + orderRequest.getShopOffer().getProduct() + " - "
                    + orderRequest.getQuantity() + "szt. zostalo przekazane do realizacji.");
        } else {
            System.out.println("Niestety, produkt jest niedostępny lub jest niedostepny w deklarowanej przez Ciebie ilosci.");
        }
    }
}