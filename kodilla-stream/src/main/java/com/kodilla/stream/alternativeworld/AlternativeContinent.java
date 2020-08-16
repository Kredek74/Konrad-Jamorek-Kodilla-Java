package com.kodilla.stream.alternativeworld;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AlternativeContinent {

    private final String nameOfContinent;
    private final List<AlternativeCountry> listOfCountries = new ArrayList<>();

    public AlternativeContinent(String nameOfContinent, AlternativeCountry...arg) {
        this.nameOfContinent = nameOfContinent;
        this.listOfCountries.addAll(Arrays.asList(arg));
    }

    public void addCountry(AlternativeCountry country) {
        listOfCountries.add(country);
    }

    public List<AlternativeCountry> getListOfCountries() {
        return listOfCountries;
    }
}
