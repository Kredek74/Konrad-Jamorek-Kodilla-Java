package com.kodilla.good.patterns.food2door;

import java.util.ArrayList;
import java.util.List;

public class ShopOfferRepository {

    List<ShopOffer>shopOfferList = new ArrayList<>();
    ProductRepository productRepository = new ProductRepository();
    List<Product> productList = productRepository.addProduct();
    SupplierRepository supplierRepository = new SupplierRepository();
    List<Supplier> supplierList = supplierRepository.addSupplier();

    public ShopOfferRepository() {

        shopOfferList.add(new ShopOffer(100));
        shopOfferList.add(new ShopOffer(40));
        shopOfferList.add(new ShopOffer(10));
        shopOfferList.add(new ShopOffer(14));
        shopOfferList.add(new ShopOffer(10));
        shopOfferList.add(new ShopOffer(50));
        shopOfferList.add(new ShopOffer(500));
        shopOfferList.add(new ShopOffer(5));
        shopOfferList.add(new ShopOffer(7));
        shopOfferList.add(new ShopOffer(22));
    }

    public boolean orderExist(ShopOffer shopOffer) {
        return shopOfferList.contains(shopOffer);
    }
}
