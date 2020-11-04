package com.kodilla.good.patterns.food2door;

public class Product {

    private final String productName;
    private final String type;

    public Product(String productName, String type) {
        this.productName = productName;
        this.type = type;
    }

    public String getProductName() {
        return productName;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
