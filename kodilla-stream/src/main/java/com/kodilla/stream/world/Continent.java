package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;

public final class Continent {

    private final List<Country> listOfCountriesOnContinent = new ArrayList<>();
    private final String continentName;

    public Continent(String continentName) {
        this.continentName = continentName;
    }

    public List<Country> getListOfCountriesOnTheContinent() {
        return new ArrayList<>(listOfCountriesOnContinent);
    }

    public void addCountry (Country country) {
        listOfCountriesOnContinent.add(country);
    }
}
