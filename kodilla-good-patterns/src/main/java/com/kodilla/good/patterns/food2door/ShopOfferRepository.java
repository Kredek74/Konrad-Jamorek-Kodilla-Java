package com.kodilla.good.patterns.food2door;

import java.util.ArrayList;
import java.util.List;

public class ShopOfferRepository {

    List<ShopOffer> shopOfferList = new ArrayList<>();
    SupplierRepository supplierRepository = new SupplierRepository();
    List<Supplier> supplierList = supplierRepository.addSupplier();
    ProductRepository productRepository = new ProductRepository();

    public ShopOfferRepository() {

        shopOfferList.add(new ShopOffer())
    }

    public  findProudct (Product product) {
        System.out.println(shopOffer);
        System.out.println(shopOfferList);
        Productlist.
    }
}