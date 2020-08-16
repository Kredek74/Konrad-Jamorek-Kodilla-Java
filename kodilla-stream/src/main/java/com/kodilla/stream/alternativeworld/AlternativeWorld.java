package com.kodilla.stream.alternativeworld;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AlternativeWorld {

    private final List<AlternativeContinent> listOfContinents = new ArrayList<>();


    public AlternativeWorld(AlternativeContinent... arg) {
        this.listOfContinents.addAll(Arrays.asList(arg));
    }

    public List<AlternativeContinent> getlistOfContinents() {
        return listOfContinents;
    }

    public BigDecimal getPeopleQuantity() {
        return listOfContinents.stream()
                .flatMap(continent -> continent.getListOfCountries().stream())
                .map(AlternativeCountry::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
    }

}
