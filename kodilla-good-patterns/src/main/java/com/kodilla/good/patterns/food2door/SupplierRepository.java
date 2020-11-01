package com.kodilla.good.patterns.food2door;

import java.util.ArrayList;
import java.util.List;

public class SupplierRepository {

    final List<Supplier> supplierRepository = new ArrayList<>();

    public List<Supplier> addSupplier() {
        supplierRepository.add(new Supplier("DinoShop", "Opoczno"));
        supplierRepository.add(new Supplier("LadybirdShop", "Ogonowice"));
        supplierRepository.add(new Supplier("FrogShop", "Żarnów"));
        return supplierRepository;
    }
}
