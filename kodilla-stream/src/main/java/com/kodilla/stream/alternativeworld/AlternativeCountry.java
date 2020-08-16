package com.kodilla.stream.alternativeworld;

import java.math.BigDecimal;

public final class AlternativeCountry {

    private final String nameOfCountry;
    private final BigDecimal peopleQuantity;

    public AlternativeCountry(String nameOfCountry, String peopleQuantity) {
        this.nameOfCountry = nameOfCountry;
        this.peopleQuantity = new BigDecimal(String.valueOf(peopleQuantity));
    }

    public BigDecimal getPeopleQuantity() {
        return peopleQuantity;
    }
}
