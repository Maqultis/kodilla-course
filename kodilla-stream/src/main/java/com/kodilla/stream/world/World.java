package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class World {

    private final List<Continent> listOfContinentsOnTheWorld = new ArrayList<>();

    public void addContinent(Continent continent) {
        listOfContinentsOnTheWorld.add(continent);
    }

    public BigDecimal getPeopleQuantity() {
        return listOfContinentsOnTheWorld.stream()
                .flatMap(continent -> continent.getListOfCountriesOnTheContinent().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, country) -> sum.add(country));

    }
}
