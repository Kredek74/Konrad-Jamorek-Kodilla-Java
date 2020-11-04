package com.kodilla.good.patterns.food2door;

public class ShopFactory {

    public static OrderService getShop(Supplier supplier) {
        switch (supplier.getSupplierName()) {
            case "DinoShop":
                return new DinoShop();
            case "LadyBirdShop":
                return new LadybirdShop();
            case "FrogShop":
                return new FrogShop();
            default:
                throw new IllegalStateException("Unexpected value: " + supplier.getSupplierName());
        }
    }
}
