package com.kodilla.good.patterns.challenges.flights;

import java.util.HashSet;
import java.util.Set;

public class FlightsRepository {

    private Set<Flight> availableFlights;


    public FlightsRepository() {
    }

    public Set<Flight> getAvailableFlights() {
        Set<Flight> availableFlights = new HashSet<>();
        availableFlights.add(new Flight("WRO" , "WAR"));
        availableFlights.add(new Flight("WAR" , "WRO"));
        availableFlights.add(new Flight("RAD" , "GDA"));
        availableFlights.add(new Flight("GDA" , "WRO"));
        availableFlights.add(new Flight("WAR" , "GDA"));
        return availableFlights;
    }
}
