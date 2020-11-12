package com.kodilla.good.patterns.food2door;

import java.util.ArrayList;
import java.util.List;

public class SupplierRepository {

    final List<Supplier> supplierRepository = new ArrayList<>();

    public List<Supplier> addSupplier() {
        supplierRepository.add(new Supplier("ExtraFoodShop", "Opoczno"));
        supplierRepository.add(new Supplier("LGlutenFreeShop", "Tomaszów"));
        supplierRepository.add(new Supplier("HealthyShop", "Końskie"));
        return supplierRepository;
    }

    @Override
    public String toString() {
        return "SupplierRepository{" +
                "supplierRepository=" + supplierRepository +
                '}';
    }
}