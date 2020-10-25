package com.kodilla.good.patterns.food2door;

import java.util.ArrayList;
import java.util.List;

public class ShopOfferRepository {

    List<ShopOffer>shopOfferList = new ArrayList<>();
    ProductRepository productRepository = new ProductRepository();
    List<Product> productList = productRepository.addProduct();
    SupplierRepository supplierRepository = new SupplierRepository();
    List<Supplier> suplierList = supplierRepository.addSupplier();
}
