package com.kodilla.good.patterns.challenges.flights;

import java.util.List;
import java.util.Set;

public class FlightsApp {

    public static void main(String[] args) {

        FlightsRepository flightsRepository = new FlightsRepository();
        FlightsFinder flightsFinder = new FlightsFinder(flightsRepository);

        Set<Flight> flyFrom = flightsFinder.availableFlightsFrom("RAD");
        System.out.println(flyFrom);

        Set<Flight> flyTo = flightsFinder.availableFlightsTo("WRO");
        System.out.println(flyTo);

        Set<List<Flight>> connectedFlight = flightsFinder.availableConnectingFlights("WRO", "GDA");
        System.out.println(connectedFlight);

    }
}
