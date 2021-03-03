package com.kodilla.exception.test;

public class FlightFinderRunner {

    public static void main(String[] args) {

        FlightFinder finder = new FlightFinder();

        Flight craToCph = new Flight("KRK", "CPH");
        Flight craToTar = new Flight("KRK", "TAR");
        Flight tarToNyc = new Flight("TAR", "NYC");
        Flight tokToWaw = new Flight("TOK", "WAW");

        try {
            boolean flight1 = finder.findFlight(craToCph);
            System.out.println("Flight Cracow - Copenhagen: " + flight1);
            boolean flight2 = finder.findFlight(craToTar);
            System.out.println("Flight Cracow - Tarnow: " + flight2);
            boolean flight3 = finder.findFlight(tarToNyc);
            System.out.println("Flight Tarnow - New York City: " + flight3);
            boolean flight4 = finder.findFlight(tokToWaw);
            System.out.println("Flight Tokyo - Warszawa: " + flight4);
        } catch (RouteNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}

