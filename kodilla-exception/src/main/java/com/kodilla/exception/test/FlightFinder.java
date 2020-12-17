package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightFinder {

    private Map<String, Boolean> airportMap() {
        Map<String, Boolean> airportMap = new HashMap<>();
        airportMap.put("KRK", true);
        airportMap.put("CPH", true);
        airportMap.put("TAR", false);
        airportMap.put("WAW", true);
        airportMap.put("NYC", true);

        return airportMap;
    }

    public boolean findFlight(Flight flight) throws RouteNotFoundException {
        return findAirport(flight.getDepartureAirport()) && findAirport(flight.getArrivalAirport());
    }

    public boolean findAirport(String airport) throws RouteNotFoundException {
        if (airportMap().containsKey(airport)) {
            return airportMap().get(airport);
        } else {
            throw new RouteNotFoundException("Airport doesn't exist.");
        }
    }
}