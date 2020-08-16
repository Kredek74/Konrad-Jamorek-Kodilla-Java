package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldTestSuite {

    @Test
    public void getPeopleQuantity(){
        //Given
        Country russia = new Country("Russia", new BigDecimal("146877088"));
        Country germany = new Country("Germany", new BigDecimal("83080010"));
        Country france = new Country("France", new BigDecimal("67431000"));
        Country poland = new Country("Poland",new BigDecimal("38611020"));
        Country china = new Country("China", new BigDecimal("1387160730"));
        Country india = new Country("India", new BigDecimal("1324009090"));
        Country indonesia = new Country("Indonesia", new BigDecimal("25546200"));
        Country northKorea = new Country("North Korea", new BigDecimal("25863000"));
        Country usa = new Country("USA", new BigDecimal("313232044"));
        Country brasil = new Country("Brasil", new BigDecimal("203429773"));
        Country mexico = new Country("Mexico", new BigDecimal("11372422"));
        Country bahamas = new Country("Bahamas", new BigDecimal("313312"));
        Country nigeria = new Country("Nigeria", new BigDecimal("190632261"));
        Country ethiopia = new Country("Ethiopia", new BigDecimal("105350020"));
        Country egypt = new Country("Egypt", new BigDecimal("97041072"));
        Country botswana = new Country("Botswana", new BigDecimal("2214858"));


        Continent europe = new Continent("Europe");
        europe.addCountry(russia);
        europe.addCountry(germany);
        europe.addCountry(france);
        europe.addCountry(poland);

        Continent asia = new Continent("Asia");
        asia.addCountry(china);
        asia.addCountry(india);
        asia.addCountry(indonesia);
        asia.addCountry(northKorea);

        Continent america = new Continent("America");
        america.addCountry(usa);
        america.addCountry(brasil);
        america.addCountry(mexico);
        america.addCountry(bahamas);

        Continent africa = new Continent("Africa");
        africa.addCountry(nigeria);
        africa.addCountry(ethiopia);
        africa.addCountry(egypt);
        africa.addCountry(botswana);


        World world = new World();
        world.addContinent(europe);
        world.addContinent(asia);
        world.addContinent(america);
        world.addContinent(africa);

        BigDecimal peopleQuantitySum = new BigDecimal("4022163900");

        //When
        BigDecimal peopleQuantityTest = world.getPeopleQuantity();

        //Then
        Assert.assertEquals(peopleQuantitySum, peopleQuantityTest);
    }
}
