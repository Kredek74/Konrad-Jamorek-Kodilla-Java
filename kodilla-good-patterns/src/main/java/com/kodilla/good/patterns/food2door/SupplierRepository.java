package com.kodilla.good.patterns.food2door;

import java.util.ArrayList;
import java.util.List;

public class SupplierRepository {

    final List<Supplier> supplierList = new ArrayList<>();

    public List<Supplier> addSupplier() {
        supplierList.add(new Supplier("DinoShop", "Opoczno"));
        supplierList.add(new Supplier("LadybirdShop", "Ogonowice"));
        supplierList.add(new Supplier("FrogShop", "Żarnów"));
        return supplierList;
    }
}
