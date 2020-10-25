package com.kodilla.good.patterns.order;

public class Product {

    String productName;
    int quantityAtStock;
    boolean availability;
    double priceProduct;

    public Product(String productName, int quantityAtStock, boolean availability, double priceProduct) {
        this.productName = productName;
        this.quantityAtStock = quantityAtStock;
        this.availability = availability;
        this.priceProduct = priceProduct;
    }

    public String getProductName() {
        return productName;
    }

    public int getQuantityAtStock() {
        return quantityAtStock;
    }

    public boolean isAvailability() {
        return availability;
    }

    public double getPriceProduct() {
        return priceProduct;
    }
}
