package com.kodilla.good.patterns.food2door;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository {

    final List<Product> productRepository = new ArrayList<>();

    public List<Product> addProduct() {

        productRepository.add(new Product("Mleko 3,2%", "Nabiał"));
        productRepository.add(new Product("Ser Gouda", "Nabiał"));
        productRepository.add(new Product("Pietruszka naciowa", "Warzywa i Owoce"));
        productRepository.add(new Product("Jabłka Lobo", "Warzywa i Owoce"));
        productRepository.add(new Product("Kiełbasa wiejska", "Mięso i Wędliny"));
        productRepository.add(new Product("Golonka wieprzowa", "Mięso i Wędliny"));
        productRepository.add(new Product("Chleb żytni", "Pieczywo"));
        productRepository.add(new Product("Kajzerka pszenna", "Pieczywo"));
        return productRepository;
    }

    @Override
    public String toString() {
        return "ProductRepository{" +
                "productRepository=" + productRepository +
                '}';
    }
}
