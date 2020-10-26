package com.kodilla.good.patterns.food2door;

public class ShopOffer {

    Supplier supplier;
    Product product;
    int availableQuantity;
    double price;

    public ShopOffer(Supplier supplier, Product product, int availableQuantity, double price) {
        this.supplier = supplier;
        this.product = product;
        this.availableQuantity = availableQuantity;
        this.price = price;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public Product getProduct() {
        return product;
    }

    public int getAvailableQuantity() {
        return availableQuantity;
    }

    public double getPrice() {
        return price;
    }
}
