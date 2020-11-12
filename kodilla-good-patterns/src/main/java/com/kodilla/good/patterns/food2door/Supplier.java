package com.kodilla.good.patterns.food2door;

public class Supplier {

    String supplierName;
    String supplierCity;

    public Supplier(String supplierName, String supplierCity) {
        this.supplierName = supplierName;
        this.supplierCity = supplierCity;
    }

    @Override
    public String toString() {
        return supplierName;
    }

}