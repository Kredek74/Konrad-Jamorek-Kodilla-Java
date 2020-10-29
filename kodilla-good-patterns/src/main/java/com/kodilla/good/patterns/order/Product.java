package com.kodilla.good.patterns.order;

public class Product {

    private final String productName;
    private final int quantityAtStock;
    private final boolean availability;
    private final double priceProduct;

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

    public boolean getAvailability() {
        return availability;
    }

    public double getPriceProduct() {
        return priceProduct;
    }
}
