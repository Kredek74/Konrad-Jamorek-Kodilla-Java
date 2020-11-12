package com.kodilla.good.patterns.food2door;

public class ShopFactory {

    public static OrderService getShop(Supplier supplier) {
        switch (supplier.getSupplierName()) {
            case "ExtraFoodShop":
                return new ExtraFoodShop();
            case "GlutenFreeShop":
                return new GlutenFreeShop();
            case "HealthyShop":
                return new HealthyShop();
            default:
                throw new IllegalStateException("Unexpected value: " + supplier.getSupplierName());
        }
    }
}
