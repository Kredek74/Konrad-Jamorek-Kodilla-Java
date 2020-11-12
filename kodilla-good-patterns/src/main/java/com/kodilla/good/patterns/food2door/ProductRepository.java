package com.kodilla.good.patterns.food2door;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository {

    final List<Product> productRepository = new ArrayList<>();

    public ProductRepository() {

        productRepository.add(new Product("Mleko 3,2%", 30, 3.99));
        productRepository.add(new Product("Mleko sojowe", 20, 5.59));
        productRepository.add(new Product("Mleko kozie", 38, 4.99));
        productRepository.add(new Product("Jabłka Lobo", 25, 2.99));
        productRepository.add(new Product("Jarmuż", 14, 8.29));
        productRepository.add(new Product("Banan", 125, 3.39));
        productRepository.add(new Product("Kiełbasa wiejska", 37, 18.99));
        productRepository.add(new Product("Golonka wieprzowa", 11, 24.99));
        productRepository.add(new Product("Kiełbasa drobiowa", 8,22.19));
        productRepository.add(new Product("Chleb żytni", 11, 3.79));
        productRepository.add(new Product("Kajzerka pszenna", 34, 0.79));
        productRepository.add(new Product("Chleb Ciabata", 4, 6.89));
    }

    @Override
    public String toString() {
        return "ProductRepository{" +
                "productRepository=" + productRepository +
                '}';
    }
}
