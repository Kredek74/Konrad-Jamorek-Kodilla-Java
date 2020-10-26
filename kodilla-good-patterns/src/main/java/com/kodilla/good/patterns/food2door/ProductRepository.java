package com.kodilla.good.patterns.food2door;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository {

    final List<Product> productList = new ArrayList<>();

    public List<Product> addProduct() {

        productList.add(new Product("Mleko 3,2%", "Nabiał"));
        productList.add(new Product("Ser Gouda", "Nabiał"));
        productList.add(new Product("Pietruszka naciowa", "Warzywa i Owoce"));
        productList.add(new Product("Jabłka Lobo", "Warzywa i Owoce"));
        productList.add(new Product("Kiełbasa wiejska", "Mięso i Wędliny"));
        productList.add(new Product("Golonka wieprzowa", "Mięso i Wędliny"));
        productList.add(new Product("Chleb żytni", "Pieczywo"));
        productList.add(new Product("Kajzerka pszenna", "Pieczywo"));
        return productList;
    }
}
