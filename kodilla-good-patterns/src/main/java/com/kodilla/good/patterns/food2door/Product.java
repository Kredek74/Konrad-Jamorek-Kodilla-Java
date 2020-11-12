package com.kodilla.good.patterns.food2door;

public class Product {

    private final String productName;
    private final int productQuantity;
    private final double productPrice;

    public Product(String productName, int productQuantity, double productPrice) {
        this.productName = productName;
        this.productQuantity = productQuantity;
        this.productPrice = productPrice;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", productQuantity=" + productQuantity +
                ", productPrice=" + productPrice +
                '}';
    }
}
