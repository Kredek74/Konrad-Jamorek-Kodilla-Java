package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class World {

    private final List<Continent> continents = new ArrayList<>();

    public void addContinent(Continent continent) {
        continents.add(continent);
    }

    public BigDecimal getPeopleQuantity(){
        BigDecimal peopleQuantity = BigDecimal.ZERO;
        for (Continent n : continents) {
            for (Country c : n.getCountries()) {
                BigDecimal quantity = c.getPeopleQuantity();
                peopleQuantity = peopleQuantity = peopleQuantity.add(quantity);
            }
        }
        return peopleQuantity;
    }
}
