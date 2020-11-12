package com.kodilla.good.patterns.food2door;

public class ShopOffer {

    private final Supplier supplier;
    private final Product product;


    public ShopOffer(Supplier supplier, Product product) {
        this.supplier = supplier;
        this.product = product;

    }

    public Supplier getSupplier() {
        return supplier;
    }

    public Product getProduct() {
        return product;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ShopOffer shopOffer = (ShopOffer) o;

        if (supplier != null ? !supplier.equals(shopOffer.supplier) : shopOffer.supplier != null) return false;
        return product != null ? product.equals(shopOffer.product) : shopOffer.product == null;
    }

    @Override
    public int hashCode() {
        int result = supplier != null ? supplier.hashCode() : 0;
        result = 31 * result + (product != null ? product.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "ShopOffer{" +
                "supplier=" + supplier +
                ", product=" + product +
                '}';
    }
}