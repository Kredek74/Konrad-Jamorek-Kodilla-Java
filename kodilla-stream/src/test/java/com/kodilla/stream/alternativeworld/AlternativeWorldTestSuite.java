package com.kodilla.stream.alternativeworld;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class AlternativeWorldTestSuite {

    @Test
    public void getPeopleQuantity(){
        //Given
        AlternativeCountry russia = new AlternativeCountry("Russia", "146877088");
        AlternativeCountry germany = new AlternativeCountry("Germany","83080010");
        AlternativeCountry france = new AlternativeCountry("France","67431000");
        AlternativeCountry poland = new AlternativeCountry("Poland","38611020");
        AlternativeCountry china = new AlternativeCountry("China","1387160730");
        AlternativeCountry india = new AlternativeCountry("India","1324009090");
        AlternativeCountry indonesia = new AlternativeCountry("Indonesia","25546200");
        AlternativeCountry northKorea = new AlternativeCountry("North Korea","25863000");
        AlternativeCountry usa = new AlternativeCountry("USA", "313232044");
        AlternativeCountry brasil = new AlternativeCountry("Brasil","203429773");
        AlternativeCountry mexico = new AlternativeCountry("Mexico","11372422");
        AlternativeCountry bahamas = new AlternativeCountry("Bahamas", "313312");
        AlternativeCountry nigeria = new AlternativeCountry("Nigeria",  "190632261");
        AlternativeCountry ethiopia = new AlternativeCountry("Ethiopia", "105350020");
        AlternativeCountry egypt = new AlternativeCountry("Egypt","97041072");
        AlternativeCountry botswana = new AlternativeCountry("Botswana","2214858");

        AlternativeContinent europe = new AlternativeContinent("Europe", russia, germany,france,poland);

        AlternativeContinent asia = new AlternativeContinent("Asia", china, india, indonesia, northKorea);

        AlternativeContinent america = new AlternativeContinent("America", usa, brasil, mexico, bahamas);

        AlternativeContinent africa = new AlternativeContinent("Africa", nigeria, ethiopia, egypt, botswana);

        AlternativeWorld alternativeWorld = new AlternativeWorld(europe, asia, america, africa);

        BigDecimal peopleQuantitySum = new BigDecimal("4022163900");

        //When

        BigDecimal peopleQuantityTest = alternativeWorld.getPeopleQuantity();

        //Then
        Assert.assertEquals(peopleQuantitySum, peopleQuantityTest);
    }
}
