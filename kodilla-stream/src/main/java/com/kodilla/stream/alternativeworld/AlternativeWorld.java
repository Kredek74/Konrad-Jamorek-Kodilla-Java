package com.kodilla.stream.alternativeworld;

import com.kodilla.stream.world.Continent;
import com.kodilla.stream.world.Country;

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
        BigDecimal peopleQuantity = BigDecimal.ZERO;
        for (AlternativeContinent n : listOfContinents) {
            for (AlternativeCountry c : n.getListOfCountries()) {
                BigDecimal quantity = c.getPeopleQuantity();
                peopleQuantity = peopleQuantity = peopleQuantity.add(quantity);
            }
        }
        return peopleQuantity;
    }

}
