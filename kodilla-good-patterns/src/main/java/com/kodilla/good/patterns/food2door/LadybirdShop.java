package com.kodilla.good.patterns.food2door;

public class LadybirdShop implements OrderService {

    ShopOfferRepository shopOfferDataBase = new ShopOfferRepository();

    @Override
    public void process(OrderRequest orderRequest) {
        boolean confirmation = shopOfferDataBase.orderExist(orderRequest.getShopOffer());
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
