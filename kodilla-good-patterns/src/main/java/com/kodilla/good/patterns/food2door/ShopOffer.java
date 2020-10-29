package com.kodilla.good.patterns.food2door;

import java.util.Objects;

public class ShopOffer {

    private Supplier supplier;
    private Product product;
    private int availableQuantity;
    private double price;

    public ShopOffer() {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ShopOffer shopOffer = (ShopOffer) o;

        if (availableQuantity != shopOffer.availableQuantity) return false;
        if (Double.compare(shopOffer.price, price) != 0) return false;
        if (!Objects.equals(supplier, shopOffer.supplier)) return false;
        return Objects.equals(product, shopOffer.product);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = supplier != null ? supplier.hashCode() : 0;
        result = 31 * result + (product != null ? product.hashCode() : 0);
        result = 31 * result + availableQuantity;
        temp = Double.doubleToLongBits(price);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
