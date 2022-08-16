package com.kodilla.stream.world;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class WorldTestSuite {

    @Test
    public void shouldCountPeople() {
        //given
        Country poland = new Country("Poland", new BigDecimal(38_014_000));
        Country germany = new Country("Germany", new BigDecimal(84_316_622));
        Country greece = new Country("Greece", new BigDecimal(10_533_871));
        Continent europe = new Continent("Europe");
        europe.addCountry(poland);
        europe.addCountry(germany);
        europe.addCountry(greece);

        Country usa = new Country("USA", new BigDecimal(337_341_954));
        Country canada = new Country("Canada", new BigDecimal(38_232_593));
        Continent northAmerica = new Continent("North America");
        northAmerica.addCountry(usa);
        northAmerica.addCountry(canada);

        World world = new World();
        world.addContinent(europe);
        world.addContinent(northAmerica);

        //when
        BigDecimal peopleQuantity = world.getPeopleQuantity();

        //given
        assertEquals(new BigDecimal(508_439_040), peopleQuantity);


    }
}