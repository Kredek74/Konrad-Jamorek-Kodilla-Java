package com.kodilla.good.patterns.food2door;

public class GlutenFreeShop implements OrderService {

    private final ShopOfferRepository shopOfferRepository = new ShopOfferRepository();

    @Override
    public void process(OrderRequest orderRequest) {
        boolean confirmation = shopOfferRepository.orderExist(orderRequest.getShopOffer());
        if (confirmation) {
            double price = orderRequest.getOrderQuantity() * orderRequest.getShopOffer().getProduct().getProductPrice();
            System.out.println("Wartosc Twojego zamowienia: " + orderRequest.getShopOffer().getProduct() + "\n" + "wynosi: "
                    + price);
            System.out.println("Smacznego!");
        } else {
            System.out.println("Twoje zamowienie: " + orderRequest.getShopOffer().getProduct().getProductName() + " nie moze byc zrealizowane");
            System.out.println("Zamowiona ilosc produktu: " + orderRequest.getOrderQuantity());
            System.out.println("Dostepna ilosc: " + orderRequest.getShopOffer().getProduct().getProductQuantity());
        }
    }

    @Override
    public String toString() {
        return "LadybirdShop{" +
                "shopOfferRepository=" + shopOfferRepository +
                '}';
    }
}
