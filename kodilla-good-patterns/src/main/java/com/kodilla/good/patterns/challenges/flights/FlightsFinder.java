package com.kodilla.good.patterns.challenges.flights;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FlightsFinder {

    private FlightsRepository flightsRepository;


    public FlightsFinder(FlightsRepository flightsRepository) {
        this.flightsRepository = flightsRepository;
    }

    public Set<Flight> availableFlightsFrom(String departureAirport) {
        return flightsRepository.getAvailableFlights().stream()
                .filter(flight -> flight.getDepartureAirport().equals(departureAirport))
                .collect(Collectors.toSet());
    }

    public Set<Flight> availableFlightsTo(String arrivalAirport) {
        return flightsRepository.getAvailableFlights().stream()
                .filter(flight -> flight.getArrivalAirport().equals(arrivalAirport))
                .collect(Collectors.toSet());
    }

    public Set<List<Flight>> availableConnectingFlights(String departureAirport, String arrivalAirport) {
        Set<List<Flight>> flightsSet = new HashSet<>();

        flightsRepository.getAvailableFlights().stream()
                .filter(flight -> flight.getDepartureAirport().equals(departureAirport))
                .forEach(flight -> {
                    List<Flight> flightList = flightsRepository.getAvailableFlights().stream()
                            .filter(fl -> (flight.getArrivalAirport().equals(fl.getDepartureAirport())
                                    && fl.getArrivalAirport().equals(arrivalAirport)))
                            .collect(Collectors.toList());

                    if(flightList.size() > 0) {
                        List<Flight> flightsRoute = new ArrayList<>();
                        flightsRoute.add(flight);
                        flightsRoute.addAll(flightList);
                        flightsSet.add(flightsRoute);
                    }
                });
        return flightsSet;
    }
}
