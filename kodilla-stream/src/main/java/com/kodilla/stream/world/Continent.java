package com.kodilla.stream.world;

import com.kodilla.stream.world.Country;

import java.util.ArrayList;
import java.util.List;

public class Continent {

    private final String nameOfContinent;
    private final List<Country> countries = new ArrayList<>();

    public Continent(final String continent) {
        this.nameOfContinent = continent;
    }

    public void addCountry(Country country) {
        countries.add(country);
    }

    public List<Country> getCountries() {
        return countries;
    }
}
