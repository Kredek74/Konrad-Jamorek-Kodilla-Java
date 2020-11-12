package com.kodilla.good.patterns.food2door;

public class HealthyShop implements OrderService {

    private final ShopOfferRepository shopOfferRepository = new ShopOfferRepository();

    @Override
    public void process(OrderRequest orderRequest) {
        System.out.println("Witamy w HealthyShop. Dziekujemy za skorzystanie z oferty naszego sklepu. Zapewniamy najswiezsza produkty w przystepnych cenach.");
        boolean result = shopOfferRepository.orderExist(orderRequest.getShopOffer());
        if (result) {
            System.out.println("Dziekujemy za zlozenie zamowienia: " + orderRequest.getShopOffer().getProduct());
            System.out.println("Prosimy o dokonanie platnosci w kwocie: " + orderRequest.getQuantity() * orderRequest.getShopOffer().getPrice());
        } else {
            System.out.println("Niestety nie mozemy zrealizowac zamowienia. Prosimy o jego ponowne zlozenie, uwzględniając dostepnosc produktu.");
        }
    }

    @Override
    public String toString() {
        return "FrogShop{" +
                "shopOfferRepository=" + shopOfferRepository +
                '}';
    }
}
