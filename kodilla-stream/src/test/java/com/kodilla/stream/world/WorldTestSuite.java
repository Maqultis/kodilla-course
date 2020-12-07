package com.kodilla.stream.world;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

public class WorldTestSuite {

    @Test
    public void testGetPeopleQuantity() {
        //Given
        World world = new World();

        Continent europe = new Continent("Europe");
        Continent asia = new Continent("Asia");
        Continent africa = new Continent("Africa");

        Country poland = new Country("Poland", new BigDecimal(34343434));
        Country germany = new Country("Germany", new BigDecimal(65656565));
        Country denmark = new Country("Denmark", new BigDecimal(22222222));
        Country hungary = new Country("Hungary", new BigDecimal(34343434));
        Country india = new Country("India", new BigDecimal(12345678));
        Country china = new Country("China", new BigDecimal(12345678));
        Country japan = new Country("Japan", new BigDecimal(1234567));
        Country algeria = new Country("Algeria", new BigDecimal(42228408));
        Country benin = new Country("Benin", new BigDecimal(30234234));
        Country cameroon = new Country("Cameroon", new BigDecimal(25432432));

        world.addContinent(europe);
        world.addContinent(asia);
        world.addContinent(africa);

        europe.addCountry(poland);
        europe.addCountry(germany);
        europe.addCountry(denmark);
        europe.addCountry(hungary);

        asia.addCountry(india);
        asia.addCountry(china);
        asia.addCountry(japan);

        africa.addCountry(algeria);
        africa.addCountry(benin);
        africa.addCountry(cameroon);

        //When
        BigDecimal totalPeople = world.getPeopleQuantity();


        //Then
        BigDecimal totalPeopleExpected = new BigDecimal(280386652);
        assertEquals(totalPeopleExpected, totalPeople);
    }
}
